package cn.cao.test;

/**
 * Created by hasee on 2016/12/28.
 */
public class testClone {

    static class Body implements Cloneable {
        public Head head;

        public Body() {
        }

        public Body(Head head) {
            this.head = head;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Body body = (Body) super.clone();
            body.head = (Head) head.clone();
            return body;
        }

    }

    static class Head implements Cloneable {
        public Face face;

        public Head() {
        }

        public Head(Face face) {
            this.face = face;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Head head = (Head) super.clone();
            head.face = (Face) face.clone();
            return head;
        }
    }

    static class Face implements Cloneable {

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    /**
     * @param args
     */
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Body body = new Body(new Head(new Face()));
//
//        Body body1 = (Body) body.clone();
//
//        System.out.println("body == body1 : " + (body == body1));
//
//        System.out.println("body.head == body1.head : " + (body.head == body1.head));
//
//        System.out.println("body.head.face == body1.head.face : " +  (body.head.face == body1.head.face));
//    }
    public static void main(String[] args) {
        System.out.println(100.0/6);
    }
}
