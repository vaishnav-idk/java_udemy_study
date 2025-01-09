import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Integer boxedInt=Integer.valueOf(15);
            //Integer boxedInt2=new Integer(15);
            int ubint=boxedInt.intValue();

            //automatic
        Integer autoint=15;
        int autoubint=autoint;
        System.out.println(autoint.getClass().getName());
        Integer[] wrapperarray=new Integer[10];
        wrapperarray[0]=50;
        wrapperarray[1]=20;
        System.out.println(Arrays.toString(wrapperarray));
        //Arrays.toString() factory class works for objects too
        Character[] chararray={'a','b','c'};//autoboxing for anonmyous array
        System.out.println(Arrays.toString(chararray));

        }
        public static Double getDouble() {
        return Double.valueOf(Math.random());
        }
        private static double getDouble2() {
        return 100.0;
        }
    }
