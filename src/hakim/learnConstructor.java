package hakim;

public class learnConstructor {

    int num;
    String name,address;
// access  modifier + className(no parameters)
public learnConstructor(){

    System.out.println("hello, welcome ");

}


public learnConstructor(String name){
    System.out.println(name);


}
// return constructor with a single parameter
public int   learnConstructor(int num){
    this.num=num;
    return num;
}
    public static void main(String[] args) {
        learnConstructor bb=new learnConstructor();

        learnConstructor vv=new learnConstructor("john");


    }
}
