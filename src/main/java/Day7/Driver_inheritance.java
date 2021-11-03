package Day7;

public class Driver_inheritance extends Base_inheritance{


    public static void main(String[] args) {

        Emi_Inheritance s1 = new Emi_Inheritance();
        s1.launchApp("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
        String emi = s1.ExtractEmi("200000", "10", "120");
        System.out.println("emi is :" +emi);
        s1.tearDown();

        Bing_inheritance b1 = new Bing_inheritance();
        b1.launchApp("https://www.bing.com");
        b1.Search("Corona");
        b1.tearDown();


    }
}
