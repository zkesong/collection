package iter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/17 16:54
 * @Description:
 */
public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Sunday");
        vector.add("Monday");
        vector.add("Tuesday");
        vector.add("Wednesday");
        vector.add("Thursday");
        vector.add("Friday");
        vector.add("Saturday");
        Enumeration<String> enumeration = vector.elements();
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        Iterator<String> iterator = enumeration.asIterator();

        //当vector中没有元素的时候调用next会抛出异常
        System.out.println(iterator.next());
    }
}
