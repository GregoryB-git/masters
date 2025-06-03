/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.List
 */
package A0;

import A0.A;
import A0.B;
import A0.y;
import B0.m;
import X2.v;
import android.os.SystemClock;
import d0.J;
import d0.L;
import java.util.Arrays;
import java.util.List;
import x0.Z;

public abstract class C {
    public static L a(A.a a8, B[] arrb) {
        List[] arrlist = new List[arrb.length];
        for (int i8 = 0; i8 < arrb.length; ++i8) {
            Object object = arrb[i8];
            object = object != null ? v.Z(object) : v.Y();
            arrlist[i8] = object;
        }
        return C.b(a8, arrlist);
    }

    public static L b(A.a object, List[] object2) {
        int[] arrn;
        int n8;
        v.a a8 = new v.a();
        for (n8 = 0; n8 < object.d(); ++n8) {
            arrn = object.f(n8);
            List list = object2[n8];
            for (int i8 = 0; i8 < arrn.a; ++i8) {
                J j8 = arrn.b(i8);
                boolean bl = object.a(n8, i8, false) != 0;
                int n9 = j8.a;
                int[] arrn2 = new int[n9];
                boolean[] arrbl = new boolean[n9];
                for (n9 = 0; n9 < j8.a; ++n9) {
                    boolean bl2;
                    block5 : {
                        arrn2[n9] = object.g(n8, i8, n9);
                        for (int i9 = 0; i9 < list.size(); ++i9) {
                            B b8 = (B)list.get(i9);
                            if (!b8.d().equals(j8) || b8.e(n9) == -1) continue;
                            bl2 = true;
                            break block5;
                        }
                        bl2 = false;
                    }
                    arrbl[n9] = bl2;
                }
                a8.h(new L.a(j8, bl, arrn2, arrbl));
            }
        }
        object = object.h();
        for (n8 = 0; n8 < object.a; ++n8) {
            object2 = object.b(n8);
            arrn = new int[object2.a];
            Arrays.fill((int[])arrn, (int)0);
            a8.h(new L.a((J)object2, false, arrn, new boolean[object2.a]));
        }
        return new L(a8.k());
    }

    public static m.a c(y y8) {
        int n8;
        long l8 = SystemClock.elapsedRealtime();
        int n9 = y8.length();
        int n10 = n8 = 0;
        while (n8 < n9) {
            int n11 = n10;
            if (y8.i(n8, l8)) {
                n11 = n10 + 1;
            }
            ++n8;
            n10 = n11;
        }
        return new m.a(1, 0, n9, n10);
    }
}

