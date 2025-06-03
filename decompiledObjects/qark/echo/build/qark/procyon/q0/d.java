// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q0;

import l1.e;
import g0.a;
import java.util.ArrayList;
import d0.o;
import l0.y1;
import java.util.Map;
import android.net.Uri;
import java.io.EOFException;
import F0.r;
import d0.x;
import l1.K;
import l1.j;
import d0.z;
import android.text.TextUtils;
import java.util.Collections;
import l1.J;
import F0.T;
import Z0.s;
import X2.v;
import d0.q;
import g0.E;
import a3.f;
import java.util.List;
import c1.t;

public final class d implements h
{
    public static final int[] f;
    public final int b;
    public t.a c;
    public boolean d;
    public final boolean e;
    
    static {
        f = new int[] { 8, 13, 11, 2, 0, 1, 7 };
    }
    
    public d() {
        this(0, true);
    }
    
    public d(final int b, final boolean e) {
        this.b = b;
        this.e = e;
        this.c = new c1.h();
    }
    
    public static void d(final int n, final List list) {
        if (a3.f.j(d.f, n) != -1) {
            if (list.contains(n)) {
                return;
            }
            list.add(n);
        }
    }
    
    public static Z0.h g(t.a a, final boolean b, final E e, final q q, List y) {
        int n;
        if (j(q)) {
            n = 4;
        }
        else {
            n = 0;
        }
        int n2 = n;
        if (!b) {
            a = t.a.a;
            n2 = (n | 0x20);
        }
        if (y == null) {
            y = v.Y();
        }
        return new Z0.h(a, n2, e, null, y, null);
    }
    
    public static J h(int n, final boolean b, final q q, List o, final E e, t.a a, final boolean b2) {
        final int n2 = n | 0x10;
        if (o != null) {
            n |= 0x30;
        }
        else if (b) {
            o = Collections.singletonList(new q.b().o0("application/cea-608").K());
            n = n2;
        }
        else {
            o = Collections.emptyList();
            n = n2;
        }
        final String j = q.j;
        int n3 = n;
        if (!TextUtils.isEmpty((CharSequence)j)) {
            int n4 = n;
            if (!z.b(j, "audio/mp4a-latm")) {
                n4 = (n | 0x2);
            }
            n3 = n4;
            if (!z.b(j, "video/avc")) {
                n3 = (n4 | 0x4);
            }
        }
        if (!b2) {
            a = t.a.a;
            n = 1;
        }
        else {
            n = 0;
        }
        return new J(2, n, a, e, new j(n3, (List)o), 112800);
    }
    
    public static boolean j(final q q) {
        final x k = q.k;
        if (k == null) {
            return false;
        }
        for (int i = 0; i < k.e(); ++i) {
            final x.b d = k.d(i);
            if (d instanceof q0.t) {
                return ((q0.t)d).q.isEmpty() ^ true;
            }
        }
        return false;
    }
    
    public static boolean k(final r r, final F0.s s) {
        try {
            return r.e(s);
        }
        catch (EOFException ex) {
            goto Label_0025;
        }
        finally {
            s.h();
        }
    }
    
    @Override
    public q b(final q q) {
        q k = q;
        if (this.d) {
            k = q;
            if (this.c.a(q)) {
                final q.b s = q.a().o0("application/x-media3-cues").S(this.c.c(q));
                final StringBuilder sb = new StringBuilder();
                sb.append(q.n);
                String string;
                if (q.j != null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(" ");
                    sb2.append(q.j);
                    string = sb2.toString();
                }
                else {
                    string = "";
                }
                sb.append(string);
                k = s.O(sb.toString()).s0(Long.MAX_VALUE).K();
            }
        }
        return k;
    }
    
    public b e(final Uri uri, final q q, final List list, final E e, final Map map, final F0.s s, final y1 y1) {
        final int a = o.a(q.n);
        final int b = o.b(map);
        final int c = o.c(uri);
        final int[] f = q0.d.f;
        final ArrayList list2 = new ArrayList<Integer>(f.length);
        d(a, list2);
        d(b, list2);
        d(c, list2);
        final int length = f.length;
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            d(f[i], list2);
        }
        s.h();
        r r = null;
        r r3;
        for (int j = n; j < list2.size(); ++j, r = r3) {
            final int intValue = list2.get(j);
            final r r2 = (r)g0.a.e(this.f(intValue, q, list, e));
            if (k(r2, s)) {
                return new b(r2, q, e, this.c, this.d);
            }
            if ((r3 = r) == null) {
                if (intValue != a && intValue != b && intValue != c) {
                    r3 = r;
                    if (intValue != 11) {
                        continue;
                    }
                }
                r3 = r2;
            }
        }
        return new b((r)g0.a.e(r), q, e, this.c, this.d);
    }
    
    public final r f(final int n, final q q, final List list, final E e) {
        if (n == 0) {
            return new l1.b();
        }
        if (n == 1) {
            return new e();
        }
        if (n == 2) {
            return new l1.h();
        }
        if (n == 7) {
            return new Y0.f(0, 0L);
        }
        if (n == 8) {
            return g(this.c, this.d, e, q, list);
        }
        if (n == 11) {
            return h(this.b, this.e, q, list, e, this.c, this.d);
        }
        if (n != 13) {
            return null;
        }
        return new w(q.d, e, this.c, this.d);
    }
    
    public d i(final boolean d) {
        this.d = d;
        return this;
    }
}
