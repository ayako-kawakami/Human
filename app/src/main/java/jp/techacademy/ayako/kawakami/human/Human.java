package jp.techacademy.ayako.kawakami.human;

import android.util.Log;

/**
 * Created by kawakami on 2017/06/27.
 */

class Human extends Animal implements Thinkable{

    String hobby;

    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say(){
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }

    public void think(){
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}
