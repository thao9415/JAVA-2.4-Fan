public class TestFan {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan);
        fan = new Fan(3,10,"yellow",true);
        System.out.println(fan.toString());
    }

}
