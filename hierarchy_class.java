class Employee{
int basicsal=10000;
}

class Manager extends Employee{
int incentive=0;
public void setIncentive(int Inc) {
incentive=incentive+ Inc;
}

public void disply() {
int total=super.basicsal+incentive;

System.out.println(total);

}
}

class Worker extends Employee{

int overtime=0;
public void setOvertime(int ot) {
overtime= overtime+ot;
}

public void disply() {
int total=super.basicsal+overtime*100;
System.out.println(total);
}

}
public class hierarchy_class {

public static void main(String[] args) {
// TODO Auto-generated method stub
Manager m= new Manager();
//Employee e=new Employee();
Worker w=new Worker();
m.setIncentive(4);
m.disply();
w.setOvertime(2);
w.disply();
}

}

