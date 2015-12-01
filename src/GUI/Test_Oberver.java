package GUI;
import java.util.Observable;
import java.util.Observer;

public class Test_Oberver implements Observer {
//    private Member mem = new Member();
//    public Test_Oberver(Member mem) {
//        this.mem = mem;
//    }
    public void update(Observable o, Object arg) {
        if (o instanceof Test_Observable) {
            
        }
    }
}