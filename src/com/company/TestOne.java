package com.company;

/**
 * @author Administrator
 * @date 2018/2/24 0024
 */
public class TestOne {
    public static void main(String[] args) {
        show(new Cat());
        show(new DogOne());

        System.out.println("--------------------");
        Animal a = new Cat();
        a.eat();
        Cat c = (Cat) a;
        c.work();

    }

    public static void show(Animal a) {
        a.eat();
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.work();
        } else if (a instanceof DogOne) {
            DogOne c = (DogOne) a;
            c.work();
        }
    }
}

abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }

    public void work() {
        System.out.println("抓老鼠");
    }
}

class DogOne extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }

    public void work() {
        System.out.println("看家");
    }
}