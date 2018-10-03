package mythical;

import behaviours.Protector;

public class Ogre extends MythicalBeast implements Protector{

    public Ogre(String name){
        super(name);
    }

    public String attack(){
        return "ogre attack";
    }

}
