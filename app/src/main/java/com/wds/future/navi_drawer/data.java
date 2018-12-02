package com.wds.future.navi_drawer;

/**
 * Created by dola on 27/11/2018.
 */

public class data {
  private   int image ;
  private String s1,s2;

    public data(int image, String s1, String s2) {
        this.image = image;
        this.s1 = s1;
        this.s2 = s2;
    }

    public int getImage() {
        return image;
    }

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }
}
