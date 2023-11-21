package com.example.educonn;

public class ScoreTotal {
    int n1, n2, n3, total;

    public void setn1( int n1 ){
        this.n1 = n1;
    }

    public void setn2( int n2 ){
        this.n2 = n2;
    }

    public void setn3( int n3 ){
        this.n3 = n3;
    }


    public int getn1(){
        return n1;
    }

    public int getn2(){
        return n2;
    }

    public int getn3(){
        return n3;
    }

    public int total() {
        return getn1() + getn2() + getn3();
    }

}
