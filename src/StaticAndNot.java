/**
 * Created by anna on 2017.07.12..
 */
public class StaticAndNot {// outer class

        static public class B //Static Nested class . It can be used in other places: StaticAndNot.B b = new StaticAndNot.B();
                // There is no outer instance.
        {
        }
        class C //Inner class. It can only be used like this: StaticAndNot.C c = new StaticAndNot().new C(); Outer instance is needed.
        {
        }
    }
