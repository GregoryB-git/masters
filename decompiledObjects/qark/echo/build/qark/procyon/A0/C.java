// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A0;

import android.os.SystemClock;
import B0.m;
import d0.J;
import x0.Z;
import java.util.Arrays;
import X2.v;
import java.util.List;
import d0.L;

public abstract class C
{
    public static L a(final A.a a, final B[] array) {
        final List[] array2 = new List[array.length];
        for (int i = 0; i < array.length; ++i) {
            final B b = array[i];
            v v;
            if (b != null) {
                v = X2.v.Z(b);
            }
            else {
                v = X2.v.Y();
            }
            array2[i] = v;
        }
        return b(a, array2);
    }
    
    public static L b(final A.a a, final List[] array) {
        final v.a a2 = new v.a();
        for (int i = 0; i < a.d(); ++i) {
            final Z f = a.f(i);
            final List list = array[i];
            for (int j = 0; j < f.a; ++j) {
                final J b = f.b(j);
                final boolean b2 = a.a(i, j, false) != 0;
                final int a3 = b.a;
                final int[] array2 = new int[a3];
                final boolean[] array3 = new boolean[a3];
                int k = 0;
            Label_0091:
                while (k < b.a) {
                    array2[k] = a.g(i, j, k);
                    while (true) {
                        for (int l = 0; l < list.size(); ++l) {
                            final B b3 = list.get(l);
                            if (b3.d().equals(b) && b3.e(k) != -1) {
                                final boolean b4 = true;
                                array3[k] = b4;
                                ++k;
                                continue Label_0091;
                            }
                        }
                        final boolean b4 = false;
                        continue;
                    }
                }
                a2.h(new L.a(b, b2, array2, array3));
            }
        }
        final Z h = a.h();
        for (int n = 0; n < h.a; ++n) {
            final J b5 = h.b(n);
            final int[] a4 = new int[b5.a];
            Arrays.fill(a4, 0);
            a2.h(new L.a(b5, false, a4, new boolean[b5.a]));
        }
        return new L(a2.k());
    }
    
    public static m.a c(final y y) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final int length = y.length();
        int n;
        int n2;
        for (int i = n = 0; i < length; ++i, n = n2) {
            n2 = n;
            if (y.i(i, elapsedRealtime)) {
                n2 = n + 1;
            }
        }
        return new m.a(1, 0, length, n);
    }
}
