public class Main {
    public static void main(String[] args){
        User user1 = new User();
        User user2 = new User("John",1954,2,18);
        user2.doSomething();

        Admin admin1 = new Admin();
        admin1.setName("Q");
        admin1.setDob(2003,12,14);
        admin1.doExtra();


    }
}
