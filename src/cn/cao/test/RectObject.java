package cn.cao.test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hasee on 2017/1/16.
 */
public class RectObject {
    public int x;
    public int y;

    public RectObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RectObject rectObject = (RectObject) obj;
        if (x != rectObject.x) {
            return false;
        }
        if (y != rectObject.y) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    public static void main(String[] args) {
        Set<RectObject> set = new HashSet<>();
        RectObject rectObject1 = new RectObject(2, 2);
        RectObject rectObject2 = new RectObject(3, 3);
        RectObject rectObject3 = new RectObject(2, 2);

        set.add(rectObject1);
        set.add(rectObject2);
        set.add(rectObject3);

        rectObject3.y=3;
        System.out.println("删除前大小:"+set.size());
        set.remove(rectObject3);
        System.out.println("删除后大小:"+set.size());


        System.out.println(set.size());

    }
}
