/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package k1;

import android.text.TextUtils;
import c1.i;
import c1.k;
import c1.s;
import c1.t;
import d0.A;
import g0.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k1.b;
import k1.d;
import k1.e;
import k1.h;
import k1.j;

public final class g
implements t {
    public final z a = new z();
    public final b b = new b();

    public static int e(z z8) {
        int n8 = -1;
        int n9 = 0;
        while (n8 == -1) {
            n9 = z8.f();
            String string2 = z8.r();
            if (string2 == null) {
                n8 = 0;
                continue;
            }
            if ("STYLE".equals((Object)string2)) {
                n8 = 2;
                continue;
            }
            if (string2.startsWith("NOTE")) {
                n8 = 1;
                continue;
            }
            n8 = 3;
        }
        z8.T(n9);
        return n8;
    }

    public static void f(z z8) {
        while (!TextUtils.isEmpty((CharSequence)z8.r())) {
        }
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
    public void c(byte[] arrayList, int n8, int n9, t.b b8, g0.g g8) {
        this.a.R((byte[])arrayList, n9 + n8);
        this.a.T(n8);
        arrayList = new ArrayList();
        try {
            h.e(this.a);
        }
        catch (A a8) {
            throw new IllegalArgumentException((Throwable)a8);
        }
        while (!TextUtils.isEmpty((CharSequence)this.a.r())) {
        }
        ArrayList arrayList2 = new ArrayList();
        while ((n8 = g.e(this.a)) != 0) {
            d d8;
            if (n8 == 1) {
                g.f(this.a);
                continue;
            }
            if (n8 == 2) {
                if (arrayList2.isEmpty()) {
                    this.a.r();
                    arrayList.addAll((Collection)this.b.d(this.a));
                    continue;
                }
                throw new IllegalArgumentException("A style block was found after the first cue.");
            }
            if (n8 != 3 || (d8 = e.m(this.a, (List)arrayList)) == null) continue;
            arrayList2.add((Object)d8);
        }
        i.c(new j((List)arrayList2), b8, g8);
        return;
    }

    @Override
    public int d() {
        return 1;
    }
}

