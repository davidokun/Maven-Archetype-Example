package ${package};

public class HelloWorld{

    public static void main(String[] args) {

        System.out.println(new HelloWorld().sayHello("Maven"));

    }

    public String sayHello(String name){
        return "Hello World!! " + name;
    }

}