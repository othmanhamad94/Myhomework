package com.example.myhomework;

public class get_set_adabter {

    private int imag ;
    private String  text ;


    public get_set_adabter(int imag, String text) {
        this.imag = imag;
        this.text = text;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
