/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package l6;

import kotlin.jvm.internal.g;

public final class c
extends l6.a {
    public static final a s = new a(null);
    public static final c t = new c(1, 0);

    public c(int n8, int n9) {
        super(n8, n9, 1);
    }

    @Override
    public boolean equals(Object object) {
        int n8;
        if (object instanceof c && (this.isEmpty() && ((c)object).isEmpty() || (n8 = this.a()) == (object = (c)object).a() && this.d() == object.d())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.a() * 31 + this.d();
    }

    @Override
    public boolean isEmpty() {
        if (this.a() > this.d()) {
            return true;
        }
        return false;
    }

    public Integer k() {
        return this.d();
    }

    public Integer q() {
        return this.a();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a());
        stringBuilder.append("..");
        stringBuilder.append(this.d());
        return stringBuilder.toString();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final c a() {
            return t;
        }
    }

}

