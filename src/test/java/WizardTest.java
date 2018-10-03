import mythical.Dragon;
import mythical.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Broomstick broomstick;
    Ogre ogre;
    Dragon dragon;

    @Before
    public void before(){
        broomstick = new Broomstick("Nimbus", 10);
        ogre = new Ogre("Shrek");
        wizard = new Wizard("Toby", broomstick, ogre);
        dragon = new Dragon("Smaug");
    }

    @Test
    public void hasName(){
        assertEquals("Toby", wizard.getName());
    }

    @Test
    public void hasRide(){
        Broomstick ride = (Broomstick) wizard.getRide();
        assertEquals("Nimbus", ((Broomstick) wizard.getRide()).getBrand());
    }

    @Test
    public void canFly(){
        assertEquals("mounting broom, running, skipping, flying!", wizard.fly());
    }

    @Test
    public void canFlyDragon(){
        wizard.setRide(dragon);
        assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
    }

    @Test
    public void hasProtector(){
        assertEquals(ogre, wizard.getProtector());
    }

    @Test
    public void canChangeProtector(){
        wizard.setProtector(dragon);
        assertEquals(dragon, wizard.getProtector());
    }

    @Test
    public void canProtect(){
        assertEquals("ogre attack", wizard.protect());
    }

    @Test
    public void canBeProtectedByDragon(){
        wizard.setProtector(dragon);
        assertEquals("fire", wizard.protect());
    }


}