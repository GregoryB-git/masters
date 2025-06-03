// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k1;

import d0.A;
import java.util.Collection;
import c1.i;
import java.util.List;
import java.util.ArrayList;
import c1.s;
import c1.k;
import android.text.TextUtils;
import g0.z;
import c1.t;

public final class g implements t
{
    public final z a;
    public final k1.b b;
    
    public g() {
        this.a = new z();
        this.b = new k1.b();
    }
    
    public static int e(final z z) {
        int i = -1;
        int f = 0;
        while (i == -1) {
            f = z.f();
            final String r = z.r();
            if (r == null) {
                i = 0;
            }
            else if ("STYLE".equals(r)) {
                i = 2;
            }
            else if (r.startsWith("NOTE")) {
                i = 1;
            }
            else {
                i = 3;
            }
        }
        z.T(f);
        return i;
    }
    
    public static void f(final z z) {
        while (!TextUtils.isEmpty((CharSequence)z.r())) {}
    }
    
    @Override
    public void c(final byte[] array, int e, final int n, final b b, final g0.g g) {
        this.a.R(array, n + e);
        this.a.T(e);
        final ArrayList list = new ArrayList();
        try {
            h.e(this.a);
            while (!TextUtils.isEmpty((CharSequence)this.a.r())) {}
            final ArrayList<d> list2 = new ArrayList<d>();
            while (true) {
                e = e(this.a);
                if (e == 0) {
                    i.c(new j(list2), b, g);
                    return;
                }
                if (e == 1) {
                    f(this.a);
                }
                else if (e == 2) {
                    if (!list2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.a.r();
                    list.addAll(this.b.d(this.a));
                }
                else {
                    if (e != 3) {
                        continue;
                    }
                    final d m = e.m(this.a, list);
                    if (m == null) {
                        continue;
                    }
                    list2.add(m);
                }
            }
        }
        catch (A cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    @Override
    public int d() {
        return 1;
    }
}
