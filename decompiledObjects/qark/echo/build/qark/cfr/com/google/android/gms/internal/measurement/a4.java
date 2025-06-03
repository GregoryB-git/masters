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
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.E5;
import com.google.android.gms.internal.measurement.G3;
import com.google.android.gms.internal.measurement.I4;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class a4 {
    public static final Charset a = Charset.forName((String)"US-ASCII");
    public static final Charset b = Charset.forName((String)"UTF-8");
    public static final Charset c = Charset.forName((String)"ISO-8859-1");
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final G3 f;

    static {
        byte[] arrby = new byte[]{};
        d = arrby;
        e = ByteBuffer.wrap((byte[])arrby);
        f = G3.c(arrby, 0, arrby.length, false);
    }

    public static int a(int n8, byte[] arrby, int n9, int n10) {
        for (int i8 = n9; i8 < n9 + n10; ++i8) {
            n8 = n8 * 31 + arrby[i8];
        }
        return n8;
    }

    public static int b(long l8) {
        return (int)(l8 ^ l8 >>> 32);
    }

    public static int c(boolean bl) {
        if (bl) {
            return 1231;
        }
        return 1237;
    }

    public static int d(byte[] arrby) {
        int n8;
        int n9 = arrby.length;
        n9 = n8 = a4.a(n9, arrby, 0, n9);
        if (n8 == 0) {
            n9 = 1;
        }
        return n9;
    }

    public static Object e(Object object) {
        object.getClass();
        return object;
    }

    public static Object f(Object object, String string2) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException(string2);
    }

    public static boolean g(I4 i42) {
        return false;
    }

    public static String h(byte[] arrby) {
        return new String(arrby, b);
    }

    public static boolean i(byte[] arrby) {
        return E5.d(arrby);
    }
}

