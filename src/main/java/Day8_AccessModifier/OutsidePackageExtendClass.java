package Day8_AccessModifier;

import Day8.AccessModifiers;

public class OutsidePackageExtendClass extends AccessModifiers {

    public static void main(String[] args) {

        OutsidePackageExtendClass ea = new OutsidePackageExtendClass();

        System.out.println(ea.pub);
        System.out.println(ea.pro);
        //System.out.println(am.pri);
        //System.out.println(am.def);

        ea.pubmethod();
        ea.promethod();
        //am.primethod();
        //am.defmethod();

    }
}
