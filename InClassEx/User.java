import java.time.LocalDate;

public class User {
    private String name ;
    private LocalDate dob ;

    public User(){
        //this(null, LocalDate.now().getYaer() ,  LocalDate.now().getMonth() , LocalDate.now().getDayOfMonth() )
        this.name = null;
        this.dob = LocalDate.now();
    }
    
    public User( String _name , int _years , int _month , int _day ){
        this.name = _name;
        this.dob = LocalDate.of(_years,_month,_day);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String _name){
        this.name = _name ;
    }

    public LocalDate getDob(){
        return this.dob;
    }

    public void setDob(int y, int m, int d){
        this.dob = LocalDate.of(y, m, d);
    }


    public void doSomething() {
        System.out.println("Hello "+this.name+" who was born on "+this.dob+"!");
    }



}
