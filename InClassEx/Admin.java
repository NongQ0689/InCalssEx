import java.time.LocalDate;

public class Admin extends User{

    public void doSomething() {
        System.out.println("Hello admin"+this.getName()+"!");
    }

    public void doSomething(int n) {
       for(int i=0 ; i<n ; i++){
           super.doSomething();
       }
    }

    public void doExtra() {
        if ( (LocalDate.now().getDayOfMonth() == this.getDob().getDayOfMonth()) && (LocalDate.now().getMonthValue() == (this.getDob().getMonthValue())) ) {
            System.out.println("Happy birthday Admin!");
        }
    }
}
