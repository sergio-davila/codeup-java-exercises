public class Person {

    private String personName;

    public Person(String name) {
        this.personName = name;
    }


    public String getName(){
//TODO: return the person's name
        return personName;
    }

    public String setName(String name){
//TODO: change the name property to the passed value
        return personName = name;
    }

    public String sayHello(){
//TODO: print a message to the console using the person's name
        return "Hey how's it going " + personName + "?";
    }

    public static void main(String[] args) {
//        Person alex = new Person();
//        alex.setName("Alex");
//        System.out.println("alex.personName = " + alex.personName);
//        System.out.println("alex.sayHello() = " + alex.sayHello());

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        Person Iffy = new Person("Iffy");
        System.out.println("Iffy.personName = " + Iffy.personName);
        System.out.println("Iffy.getName() = " + Iffy.getName());
        System.out.println("Iffy.sayHello() = " + Iffy.sayHello());
        Iffy.setName("Irfa");
        System.out.println("Iffy.personName = " + Iffy.personName);

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());


    }
}
