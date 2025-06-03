/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Object
 *  java.lang.String
 */
package f2;

import android.util.Base64;
import f2.d;

public abstract class p {
    public static a a() {
        return new d.b().d(c2.d.o);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract c2.d d();

    public boolean e() {
        if (this.c() != null) {
            return true;
        }
        return false;
    }

    public p f(c2.d d8) {
        return p.a().b(this.b()).d(d8).c(this.c()).a();
    }

    public final String toString() {
        String string2 = this.b();
        c2.d d8 = this.d();
        String string3 = this.c() == null ? "" : Base64.encodeToString((byte[])this.c(), (int)2);
        return String.format((String)"TransportContext(%s, %s, %s)", (Object[])new Object[]{string2, d8, string3});
    }

    public static abstract class a {
        public abstract p a();

        public abstract a b(String var1);

        public abstract a c(byte[] var1);

        public abstract a d(c2.d var1);
    }

}

