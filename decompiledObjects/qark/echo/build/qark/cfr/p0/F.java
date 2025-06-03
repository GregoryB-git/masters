/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.UUID
 */
package p0;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l0.y1;

public interface F {
    public void a(b var1);

    public boolean b(byte[] var1, String var2);

    public void c(byte[] var1, byte[] var2);

    public Map d(byte[] var1);

    public void e(byte[] var1);

    public void f(byte[] var1, y1 var2);

    public byte[] g(byte[] var1, byte[] var2);

    public d h();

    public void i(byte[] var1);

    public a j(byte[] var1, List var2, int var3, HashMap var4);

    public int k();

    public j0.b l(byte[] var1);

    public byte[] m();

    public void release();

    public static final class a {
        public final byte[] a;
        public final String b;
        public final int c;

        public a(byte[] arrby, String string2, int n8) {
            this.a = arrby;
            this.b = string2;
            this.c = n8;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    public static interface b {
        public void a(F var1, byte[] var2, int var3, int var4, byte[] var5);
    }

    public static interface c {
        public F a(UUID var1);
    }

    public static final class d {
        public final byte[] a;
        public final String b;

        public d(byte[] arrby, String string2) {
            this.a = arrby;
            this.b = string2;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

}

