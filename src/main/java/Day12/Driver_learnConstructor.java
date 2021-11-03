package Day12;

public class Driver_learnConstructor {


    public static void main(String[] args) {

        LearnConstructor lconst = new LearnConstructor();
        lconst.setValue(10,40);
        System.out.println(lconst.sum());

        LearnConstructor lconst1 = new LearnConstructor(40, 50);
        System.out.println(lconst1.sum());


    }


    }

