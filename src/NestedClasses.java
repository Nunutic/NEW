/**
 * Created by anna on 2017.07.11..
 */

abstract class SomeClass {   public abstract void m1(); }

public class NestedClasses {

        public static SomeClass getSomeClass()  //An anonymous class can be declared in a static method!
        {
            return new SomeClass()  // it is an abstract class!
            {
                public void m1() { }
            };
        }
    }

