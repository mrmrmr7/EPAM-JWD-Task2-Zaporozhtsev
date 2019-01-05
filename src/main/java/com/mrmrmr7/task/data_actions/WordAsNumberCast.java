package com.mrmrmr7.task.data_actions;

public class WordAsNumberCast {
    public static String convert(String number) {
        String res;

        switch (number) {
            case "(one)":
                res = "1";
                break;
            case "(two)":
                res = "2";
                break;
            case "(three)":
                res = "3";
                break;
            case "(four)":
                res = "4";
                break;
            case "(five)":
                res = "5";
                break;
            case "(six)":
                res = "6";
                break;
            case "(seven)":
                res = "7";
                break;
            case "(eight)":
                res = "8";
                break;
            case "(nein)":
                res = "9";
                break;
            default:
                res = "";
        }
        return res;
    }
}
