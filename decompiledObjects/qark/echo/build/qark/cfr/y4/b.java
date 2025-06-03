/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package y4;

import com.google.firebase.messaging.M;

public final class b {
    public static final b b = new a().a();
    public final y4.a a;

    public b(y4.a a8) {
        this.a = a8;
    }

    public static a b() {
        return new a();
    }

    public y4.a a() {
        return this.a;
    }

    public byte[] c() {
        return M.a(this);
    }

    public static final class a {
        public y4.a a = null;

        public b a() {
            return new b(this.a);
        }

        public a b(y4.a a8) {
            this.a = a8;
            return this;
        }
    }

}

