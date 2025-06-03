/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 */
package d0;

import d0.q;
import d0.z;
import g0.M;
import g0.a;
import g0.o;
import java.util.Arrays;

public final class J {
    public static final String f = M.w0(0);
    public static final String g = M.w0(1);
    public final int a;
    public final String b;
    public final int c;
    public final q[] d;
    public int e;

    public /* varargs */ J(String string2, q ... arrq) {
        int n8;
        boolean bl = arrq.length > 0;
        a.a(bl);
        this.b = string2;
        this.d = arrq;
        this.a = arrq.length;
        int n9 = n8 = z.k(arrq[0].n);
        if (n8 == -1) {
            n9 = z.k(arrq[0].m);
        }
        this.c = n9;
        this.f();
    }

    public /* varargs */ J(q ... arrq) {
        this("", arrq);
    }

    public static void c(String string2, String string3, String string4, int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Different ");
        stringBuilder.append(string2);
        stringBuilder.append(" combined in one TrackGroup: '");
        stringBuilder.append(string3);
        stringBuilder.append("' (track 0) and '");
        stringBuilder.append(string4);
        stringBuilder.append("' (track ");
        stringBuilder.append(n8);
        stringBuilder.append(")");
        o.d("TrackGroup", "", (Throwable)new IllegalStateException(stringBuilder.toString()));
    }

    public static String d(String string2) {
        String string3;
        block3 : {
            block2 : {
                if (string2 == null) break block2;
                string3 = string2;
                if (!string2.equals((Object)"und")) break block3;
            }
            string3 = "";
        }
        return string3;
    }

    public static int e(int n8) {
        return n8 | 16384;
    }

    public q a(int n8) {
        return this.d[n8];
    }

    public int b(q q8) {
        q[] arrq;
        for (int i8 = 0; i8 < (arrq = this.d).length; ++i8) {
            if (q8 != arrq[i8]) continue;
            return i8;
        }
        return -1;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (J.class != object.getClass()) {
                return false;
            }
            object = (J)object;
            if (this.b.equals((Object)object.b) && Arrays.equals((Object[])this.d, (Object[])object.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f() {
        q[] arrq;
        q[] arrq2 = J.d(this.d[0].d);
        int n8 = J.e(this.d[0].f);
        for (int i8 = 1; i8 < (arrq = this.d).length; ++i8) {
            if (!arrq2.equals((Object)J.d(arrq[i8].d))) {
                arrq2 = this.d;
                J.c("languages", arrq2[0].d, arrq2[i8].d, i8);
                return;
            }
            if (n8 == J.e(this.d[i8].f)) continue;
            J.c("role flags", Integer.toBinaryString((int)this.d[0].f), Integer.toBinaryString((int)this.d[i8].f), i8);
            return;
        }
    }

    public int hashCode() {
        if (this.e == 0) {
            this.e = (527 + this.b.hashCode()) * 31 + Arrays.hashCode((Object[])this.d);
        }
        return this.e;
    }
}

