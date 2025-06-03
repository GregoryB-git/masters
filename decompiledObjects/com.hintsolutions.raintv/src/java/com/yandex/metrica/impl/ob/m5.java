/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.HashSet
 *  java.util.Set
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

public class M5 {
    private boolean a;
    @NonNull
    private Set<Integer> b;
    private int c;
    private int d;

    public M5() {
        this(false, 0, 0, (Set<Integer>)new HashSet());
    }

    public M5(boolean bl, int n2, int n3, @NonNull Set<Integer> set) {
        this.a = bl;
        this.b = set;
        this.c = n2;
        this.d = n3;
    }

    public void a() {
        this.b = new HashSet();
        this.d = 0;
    }

    public void a(int n2) {
        this.b.add((Object)n2);
        ++this.d;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    @NonNull
    public Set<Integer> b() {
        return this.b;
    }

    public void b(int n2) {
        this.c = n2;
        this.d = 0;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.c;
    }

    public boolean e() {
        return this.a;
    }
}

