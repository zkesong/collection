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
public class IteratorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Sunday");
        vector.add("Monday");
        vector.add("Tuesday");
        vector.add("Wednesday");
        vector.add("Thursday");
        vector.add("Friday");
        vector.add("Saturday");
        Iterator<String> iterator = vector.iterator();
        for (int i = 0;iterator.hasNext(); i++) {
            if (i == 3) {
                // 使用iterator迭代元素时不能使用集合类的remove方法，应使用iterator的remove
                //vector.remove(3);
                iterator.remove();
            }
            System.out.println(iterator.next());
        }

        System.out.println("size: " + vector.size());
        //当vector中没有元素的时候调用next会抛出异常
       System.out.println(iterator.next());


    }

}
