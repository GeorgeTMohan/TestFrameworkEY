package Day8_AccessModifier;

import Day8.AccessModifiers;

public class OutsideThePackageNormalClass {
    public static void main(String[] args) {




        AccessModifiers am = new AccessModifiers();

        System.out.println(am.pub);
       // System.out.println(am.pro);
        //System.out.println(am.pri);
        //System.out.println(am.def);

        am.pubmethod();
        //am.promethod();
        //am.primethod();
        //am.defmethod();
    }
}