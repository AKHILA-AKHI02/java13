import java.util.*;
interface out{
    void outm();
    interface in{
        void innm();
    }
    }
    class Main implements out.in{
        public void innm()
        {
            System.out.println("Hello i^m inner method");
        }
        public static void main(String[] args){
            Main h=new Main();
            h.innm();
        }
    }
