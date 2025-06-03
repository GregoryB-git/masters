/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.ClassCastException
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

public abstract class gn<T> {
    public final T a;

    public gn(T t2) {
        this.a = t2;
    }

    public abstract boolean a(gn<T> var1);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (!(object instanceof gn)) return false;
        try {
            return this.a((gn)object);
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }
}

