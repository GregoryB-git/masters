/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.charset.Charset
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.Locale
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A3;
import com.google.android.gms.internal.measurement.C3;
import com.google.android.gms.internal.measurement.D3;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.r3;
import com.google.android.gms.internal.measurement.s3;
import com.google.android.gms.internal.measurement.s5;
import com.google.android.gms.internal.measurement.t3;
import com.google.android.gms.internal.measurement.x3;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class q3
implements Serializable,
Iterable {
    public static final q3 p = new A3(a4.d);
    public static final x3 q = new D3(null);
    public static final Comparator r = new s3();
    public int o = 0;

    public static z3 U(int n8) {
        return new z3(n8, null);
    }

    public static /* synthetic */ int f(byte by) {
        return by & 255;
    }

    public static int g(int n8, int n9, int n10) {
        int n11 = n9 - n8;
        if ((n8 | n9 | n11 | n10 - n9) < 0) {
            if (n8 >= 0) {
                if (n9 < n8) {
                    StringBuilder stringBuilder = new StringBuilder("Beginning index larger than ending index: ");
                    stringBuilder.append(n8);
                    stringBuilder.append(", ");
                    stringBuilder.append(n9);
                    throw new IndexOutOfBoundsException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder("End index: ");
                stringBuilder.append(n9);
                stringBuilder.append(" >= ");
                stringBuilder.append(n10);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder("Beginning index: ");
            stringBuilder.append(n8);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        return n11;
    }

    public static q3 k(String string2) {
        return new A3(string2.getBytes(a4.b));
    }

    public static q3 q(byte[] arrby, int n8, int n9) {
        q3.g(n8, n8 + n9, arrby.length);
        return new A3(q.a(arrby, n8, n9));
    }

    public abstract void D(r3 var1);

    public abstract byte M(int var1);

    public abstract int S();

    public abstract int T(int var1, int var2, int var3);

    public final String V() {
        Charset charset = a4.b;
        if (this.S() == 0) {
            return "";
        }
        return this.s(charset);
    }

    public abstract boolean W();

    public abstract byte a(int var1);

    public final int d() {
        return this.o;
    }

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        int n8;
        int n9 = n8 = this.o;
        if (n8 == 0) {
            n9 = this.S();
            n9 = n8 = this.T(n9, 0, n9);
            if (n8 == 0) {
                n9 = 1;
            }
            this.o = n9;
        }
        return n9;
    }

    public abstract q3 i(int var1, int var2);

    public /* synthetic */ Iterator iterator() {
        return new t3(this);
    }

    public abstract String s(Charset var1);

    public final String toString() {
        String string2;
        Locale locale = Locale.ROOT;
        String string3 = Integer.toHexString((int)System.identityHashCode((Object)this));
        int n8 = this.S();
        if (this.S() <= 50) {
            string2 = s5.a(this);
        } else {
            string2 = s5.a(this.i(0, 47));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("...");
            string2 = stringBuilder.toString();
        }
        return String.format((Locale)locale, (String)"<ByteString@%s size=%d contents=\"%s\">", (Object[])new Object[]{string3, n8, string2});
    }
}

