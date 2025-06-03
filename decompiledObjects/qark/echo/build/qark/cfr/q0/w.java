/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package q0;

import F0.L;
import F0.M;
import F0.T;
import F0.r;
import F0.s;
import F0.t;
import android.text.TextUtils;
import c1.t;
import c1.v;
import d0.A;
import d0.q;
import g0.E;
import g0.a;
import g0.z;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.h;

public final class w
implements r {
    public static final Pattern i = Pattern.compile((String)"LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile((String)"MPEGTS:(-?\\d+)");
    public final String a;
    public final E b;
    public final z c;
    public final t.a d;
    public final boolean e;
    public t f;
    public byte[] g;
    public int h;

    public w(String string2, E e8, t.a a8, boolean bl) {
        this.a = string2;
        this.b = e8;
        this.c = new z();
        this.g = new byte[1024];
        this.d = a8;
        this.e = bl;
    }

    @Override
    public void a(long l8, long l9) {
        throw new IllegalStateException();
    }

    @Override
    public void b(t t8) {
        t t9 = this.e ? new v(t8, this.d) : t8;
        this.f = t9;
        t8.e(new M.b(-9223372036854775807L));
    }

    public final T c(long l8) {
        T t8 = this.f.a(0, 3);
        t8.d(new q.b().o0("text/vtt").e0(this.a).s0(l8).K());
        this.f.j();
        return t8;
    }

    @Override
    public /* synthetic */ r d() {
        return F0.q.b(this);
    }

    @Override
    public boolean e(s s8) {
        s8.l(this.g, 0, 6, false);
        this.c.R(this.g, 6);
        if (h.b(this.c)) {
            return true;
        }
        s8.l(this.g, 6, 3, false);
        this.c.R(this.g, 9);
        return h.b(this.c);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void f() {
        long l8;
        z z8 = new z(this.g);
        h.e(z8);
        Object object = z8.r();
        long l9 = l8 = 0L;
        while (!TextUtils.isEmpty((CharSequence)object)) {
            if (object.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = i.matcher((CharSequence)object);
                if (!matcher.find()) {
                    z8 = new StringBuilder();
                    z8.append("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
                    z8.append((String)object);
                    throw A.a(z8.toString(), null);
                }
                Matcher matcher2 = j.matcher((CharSequence)object);
                if (!matcher2.find()) {
                    z8 = new StringBuilder();
                    z8.append("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
                    z8.append((String)object);
                    throw A.a(z8.toString(), null);
                }
                l9 = h.d((String)a.e(matcher.group(1)));
                l8 = E.h(Long.parseLong((String)((String)a.e(matcher2.group(1)))));
            }
            object = z8.r();
        }
        object = h.a(z8);
        if (object == null) {
            this.c(0L);
            return;
        }
        long l10 = h.d((String)a.e(object.group(1)));
        l9 = this.b.b(E.l(l8 + l10 - l9));
        object = this.c(l9 - l10);
        this.c.R(this.g, this.h);
        object.e(this.c, this.h);
        object.b(l9, 1, this.h, 0, null);
    }

    @Override
    public /* synthetic */ List g() {
        return F0.q.a(this);
    }

    @Override
    public int i(s s8, L arrby) {
        a.e(this.f);
        int n8 = (int)s8.a();
        int n9 = this.h;
        arrby = this.g;
        if (n9 == arrby.length) {
            n9 = n8 != -1 ? n8 : arrby.length;
            this.g = Arrays.copyOf((byte[])arrby, (int)(n9 * 3 / 2));
        }
        arrby = this.g;
        n9 = this.h;
        if ((n9 = s8.read(arrby, n9, arrby.length - n9)) != -1) {
            this.h = n9 = this.h + n9;
            if (n8 == -1 || n9 != n8) {
                return 0;
            }
        }
        this.f();
        return -1;
    }

    @Override
    public void release() {
    }
}

