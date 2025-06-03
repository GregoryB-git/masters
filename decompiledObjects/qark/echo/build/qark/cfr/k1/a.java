/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package k1;

import c1.k;
import c1.s;
import c1.t;
import f0.a;
import g0.M;
import g0.g;
import g0.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k1.e;

public final class a
implements t {
    public final z a = new z();

    public static f0.a e(z object, int n8) {
        a.b b8;
        a.b b9 = b8 = null;
        while (n8 > 0) {
            boolean bl = n8 >= 8;
            g0.a.b(bl, "Incomplete vtt cue box header found.");
            int n9 = object.p();
            int n10 = object.p();
            String string2 = M.I(object.e(), object.f(), n9 -= 8);
            object.U(n9);
            n9 = n8 - 8 - n9;
            if (n10 == 1937011815) {
                b9 = e.o(string2);
                n8 = n9;
                continue;
            }
            n8 = n9;
            if (n10 != 1885436268) continue;
            b8 = e.q(null, string2.trim(), Collections.emptyList());
            n8 = n9;
        }
        object = b8;
        if (b8 == null) {
            object = "";
        }
        if (b9 != null) {
            return b9.o((CharSequence)object).a();
        }
        return e.l((CharSequence)object);
    }

    @Override
    public /* synthetic */ k a(byte[] arrby, int n8, int n9) {
        return s.a(this, arrby, n8, n9);
    }

    @Override
    public /* synthetic */ void b() {
        s.b(this);
    }

    @Override
    public void c(byte[] arrayList, int n8, int n9, t.b b8, g g8) {
        this.a.R((byte[])arrayList, n9 + n8);
        this.a.T(n8);
        arrayList = new ArrayList();
        while (this.a.a() > 0) {
            boolean bl = this.a.a() >= 8;
            g0.a.b(bl, "Incomplete Mp4Webvtt Top Level box header found.");
            n8 = this.a.p();
            if (this.a.p() == 1987343459) {
                arrayList.add((Object)a.e(this.a, n8 - 8));
                continue;
            }
            this.a.U(n8 - 8);
        }
        g8.accept(new c1.e((List)arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override
    public int d() {
        return 2;
    }
}

