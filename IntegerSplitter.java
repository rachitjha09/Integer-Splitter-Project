import java.util.ArrayList;
/**
 * ArrayList Split Numbers
 *
 * @author (Rachit Jha)
 * @version (4/9/24)
 */
public class IntegerSplitter
{
    public static void main(String[]args){
        IntegerSplitter is=new IntegerSplitter();
        is.splitter(1234);
        is.splitter(0);
    }
    public static ArrayList<Integer> splitter(int n){
        int temp=n;
        ArrayList<Integer> i=new ArrayList<Integer>();
        if(n==0){
            i.add(0);
            for(int j:i){
                System.out.println(j);
            }
            return i;
        }
        while(temp>0){
            i.add(0, temp%10);
            temp/=10;
        }
        for(int j:i){
            System.out.println(j);
        }
        return i;
        
    }
}