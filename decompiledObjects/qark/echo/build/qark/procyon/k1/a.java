// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k1;

import java.util.ArrayList;
import g0.g;
import c1.s;
import c1.k;
import java.util.List;
import java.util.Collections;
import g0.M;
import g0.z;
import c1.t;

public final class a implements t
{
    public final z a;
    
    public a() {
        this.a = new z();
    }
    
    public static f0.a e(final z z, int i) {
        f0.a.b o;
        Object q = o = null;
        while (i > 0) {
            g0.a.b(i >= 8, "Incomplete vtt cue box header found.");
            final int p2 = z.p();
            final int p3 = z.p();
            final int n = p2 - 8;
            final String j = M.I(z.e(), z.f(), n);
            z.U(n);
            final int n2 = i - 8 - n;
            if (p3 == 1937011815) {
                o = e.o(j);
                i = n2;
            }
            else {
                i = n2;
                if (p3 != 1885436268) {
                    continue;
                }
                q = e.q(null, j.trim(), Collections.emptyList());
                i = n2;
            }
        }
        CharSequence charSequence;
        if ((charSequence = (CharSequence)q) == null) {
            charSequence = "";
        }
        if (o != null) {
            return o.o(charSequence).a();
        }
        return e.l(charSequence);
    }
    
    @Override
    public void c(final byte[] array, int p5, final int n, final b b, final g g) {
        this.a.R(array, n + p5);
        this.a.T(p5);
        final ArrayList<f0.a> list = new ArrayList<f0.a>();
        while (this.a.a() > 0) {
            g0.a.b(this.a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            p5 = this.a.p();
            if (this.a.p() == 1987343459) {
                list.add(e(this.a, p5 - 8));
            }
            else {
                this.a.U(p5 - 8);
            }
        }
        g.accept(new c1.e(list, -9223372036854775807L, -9223372036854775807L));
    }
    
    @Override
    public int d() {
        return 2;
    }
}
