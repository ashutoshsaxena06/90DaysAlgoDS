package main.design.patterns.singleton;

// https://dzone.com/articles/singleton-in-java
// https://medium.com/@kevalpatel2106/how-to-make-the-perfect-singleton-de6b951dfdb0

/*Class-level Member (Eager Initialization Method):
1. Make constructor private.
2. Make a private constant static instance (class-member) of this Singleton class.
3. Write a static/factory method that returns the object of the singleton class that we have created as a class-member instance.
4. We can also mark a static member as public to access constant static instance directly. But, I like to access class/instance members via methods only.
5. So, the singleton class is different from a normal Java class in terms of instantiation. For a normal class, we use a constructor, whereas for singleton class we use the getInstance()method.
*/
class SingletonEagerExample {
    // initialize early
    private static final SingletonEagerExample instance = new SingletonEagerExample();

    private SingletonEagerExample() {
    }

    public static SingletonEagerExample getInstance() {
        return instance;
    }

    // protect from cloning
    @Override
    protected SingletonEagerExample clone() throws CloneNotSupportedException {
        return instance;
    }
}

/*Class-level Member (Lazy Initialization Method):
1. Make constructor as private.
2. Make a private static instance (class-member) of this singleton class. But, DO NOT instantiate it.
3. Write a static/factory method that checks the static instance member for null and creates the instance. At last, it returns an object of the singleton class.
*/
class SingletonLazyExample {
    private static SingletonLazyExample instance = null;

    private SingletonLazyExample() {
    }

    public static SingletonLazyExample getInstance() {
        synchronized (SingletonLazyExample.class) {
            if (instance == null) {
                instance = new SingletonLazyExample();   // initialize lazy
            }
        }
        return instance;
    }

    // protect from cloning
    @Override
    protected SingletonLazyExample clone() throws CloneNotSupportedException {
        return instance;
    }
}

// Class-level Member (Lazy Initialization with double lock Method):
class SingletonLazyWithDoubleLockExample {
    private static SingletonLazyWithDoubleLockExample INSTANCE = null;

    private SingletonLazyWithDoubleLockExample() {
    }

    public static SingletonLazyWithDoubleLockExample getInstance() {
        if (INSTANCE == null) { // check first
            synchronized (SingletonLazyExample.class) {
                if (INSTANCE == null) { // check again to avoid other thread
                    INSTANCE = new SingletonLazyWithDoubleLockExample();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    protected SingletonLazyWithDoubleLockExample clone() throws CloneNotSupportedException {
        return INSTANCE;
    }
}