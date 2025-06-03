/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package i2;

import i2.e;

public final class b {
    public static final b b = new a().a();
    public final e a;

    public b(e e8) {
        this.a = e8;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.a;
    }

    public static final class a {
        public e a = null;

        public b a() {
            return new b(this.a);
        }

        public a b(e e8) {
            this.a = e8;
            return this;
        }
    }

}

