package org.example.functionalProgramining;

public class Chapter2Video4 {

    protected static class  Person{
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

    protected static class DataLoader{
        public final NoArgFunction<Person> loadPerson;

        public DataLoader(boolean isReal){
            this.loadPerson = isReal
                    ? this::loadPerson
                    : this::loadFakePerson;
        }

        private Person loadPerson(){
            System.out.println("Loading real person");
            return new Person("John", 30);
        }

        private Person loadFakePerson(){
            System.out.println("Loading fake person");
            return new Person("x", 30);
        }

        public static void main(String[] args) {
            final  Boolean isReal = true;

            DataLoader dataLoader = new DataLoader(isReal);
            dataLoader.loadPerson.apply();
        }
    }


}
