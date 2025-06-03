/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 */
package com.yandex.metrica.networktasks.api;

final class d
extends Enum {
    public static final /* enum */ d a;
    public static final /* enum */ d b;
    public static final /* enum */ d c;
    public static final /* enum */ d d;
    public static final /* enum */ d e;
    public static final /* enum */ d f;
    public static final /* enum */ d g;
    public static final /* enum */ d h;
    public static final /* enum */ d i;
    private static final d[] j;

    static {
        d d4;
        d d5;
        d d6;
        d d7;
        d d9;
        d d10;
        d d11;
        d d12;
        d d13;
        a = d13 = new d("EMPTY", 0);
        b = d12 = new d("PENDING", 1);
        c = d11 = new d("PREPARING", 2);
        d = d10 = new d("EXECUTING", 3);
        e = d9 = new d("SUCCESS", 4);
        f = d7 = new d("FAILED", 5);
        g = d6 = new d("SHOULD_NOT_EXECUTE", 6);
        h = d5 = new d("FINISHED", 7);
        i = d4 = new d("REMOVED", 8);
        j = new d[]{d13, d12, d11, d10, d9, d7, d6, d5, d4};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d() {
        void var2_-1;
        void var1_-1;
    }
}

