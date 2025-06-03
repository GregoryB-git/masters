/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 *  java.util.List
 *  java.util.RandomAccess
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.q0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public abstract class y {
    public static final Charset a = Charset.forName((String)"UTF-8");
    public static final Charset b = Charset.forName((String)"ISO-8859-1");
    public static final byte[] c;
    public static final ByteBuffer d;
    public static final h e;

    static {
        byte[] arrby = new byte[]{};
        c = arrby;
        d = ByteBuffer.wrap((byte[])arrby);
        e = h.h(arrby);
    }

    public static Object a(Object object) {
        object.getClass();
        return object;
    }

    public static Object b(Object object, String string2) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException(string2);
    }

    public static int c(boolean bl) {
        if (bl) {
            return 1231;
        }
        return 1237;
    }

    public static int d(byte[] arrby) {
        return y.e(arrby, 0, arrby.length);
    }

    public static int e(byte[] arrby, int n8, int n9) {
        n8 = n9 = y.i(n9, arrby, n8, n9);
        if (n9 == 0) {
            n8 = 1;
        }
        return n8;
    }

    public static int f(long l8) {
        return (int)(l8 ^ l8 >>> 32);
    }

    public static boolean g(byte[] arrby) {
        return q0.m(arrby);
    }

    public static Object h(Object object, Object object2) {
        return ((O)object).f().h((O)object2).c();
    }

    public static int i(int n8, byte[] arrby, int n9, int n10) {
        for (int i8 = n9; i8 < n9 + n10; ++i8) {
            n8 = n8 * 31 + arrby[i8];
        }
        return n8;
    }

    public static String j(byte[] arrby) {
        return new String(arrby, a);
    }

    public static interface a {
        public boolean a(int var1);
    }

    public static interface b
    extends List,
    RandomAccess {
        public b h(int var1);

        public void j();

        public boolean p();
    }

}

