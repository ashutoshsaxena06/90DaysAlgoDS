package main.design.patterns.singleton;

import java.io.Serializable;

/*What is the purpose of Singleton?
    The purpose of the Singleton class is to control object creation, limiting the number of objects to only one. The singleton allows only one entry point to create the new instance of the class.
*/
// https://stackoverflow.com/questions/20421920/what-are-the-different-ways-we-can-break-a-singleton-pattern-in-java/20422020

public class PerfectSingleton implements Serializable, Cloneable {


    // private constructor
    private PerfectSingleton() {

    }
}
