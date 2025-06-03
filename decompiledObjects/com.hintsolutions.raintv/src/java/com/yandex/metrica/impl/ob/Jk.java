/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;

public class jk {
    public final int a;
    @NonNull
    public final String b;
    private final int c;

    public jk(int n4, @NonNull String string) {
        this.a = n4;
        this.b = string;
        this.c = this.a();
    }

    private int a() {
        int n4 = this.a;
        return this.b.length() + n4 * 31;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && jk.class == object.getClass()) {
            object = (jk)object;
            if (this.a != ((jk)object).a) {
                return false;
            }
            return this.b.equals((Object)((jk)object).b);
        }
        return false;
    }

    public int hashCode() {
        return this.c;
    }
}

