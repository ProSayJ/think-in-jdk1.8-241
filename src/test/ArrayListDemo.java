package test;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author yangjian
 * @date 2021-03-12 下午 05:43
 * @since 1.0.0
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.add("2");
        // 问题：添加200个元素到ArrayList后内部的数组大小是多少？244
        list.clear();
        for (int i = 0; i < 200; i++) {
            list.add("1");
        }
        //        System.out.println(list.elementData.length);
        list.trimToSize();
//        System.out.println(list.elementData.length);

        //结论4：ArrayList 有序可重复 存入元素可以为null
        //System.out.println(initList());
    }

}
