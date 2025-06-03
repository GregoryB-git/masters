/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.zb;

public class Ab
implements zb {
    private final int a;
    private final int b;
    private int c = 0;

    public Ab(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public boolean b() {
        int n = this.c;
        this.c = n + 1;
        boolean bl = n < this.a;
        return bl;
    }

    @Override
    public void c() {
        this.c = 0;
    }
}

