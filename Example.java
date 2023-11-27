import java.util.Scanner;

public class Example {
    Scanner input= new Scanner(System.in);

    private  String name;
    private Boolean value;
    private int number;



    public Example(int number) {
        this.number = number;
    }
    public Example (String Name, int Number){
        this.name=Name;
        this.number=Number;

    }
    public Example (String Name, int Number, Boolean Value){
        this.name=Name;
        this.number=Number;
        this.value=Value;
    }
    public int getNumber() {
        return number;
    }

    public Boolean getValue() {
        return value;
    }

    public String getName() {
        return name;
    }



    public void Display(){
        System.out.println("The Informations are:");
        System.out.println(" Number:"+getNumber()+"\n"+
                "Name: "+getName()+"\n"+
                "Value:"+getValue());




    }
}