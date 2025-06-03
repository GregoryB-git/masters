/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.io.Closeable
 *  java.io.InputStream
 *  java.lang.Object
 *  java.util.Map
 */
package B0;

import B0.n;
import android.net.Uri;
import g0.M;
import i0.g;
import i0.i;
import i0.k;
import i0.x;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Map;
import x0.r;

public final class p
implements n.e {
    public final long a;
    public final k b;
    public final int c;
    public final x d;
    public final a e;
    public volatile Object f;

    public p(g g8, Uri uri, int n8, a a8) {
        this(g8, new k.b().i(uri).b(1).a(), n8, a8);
    }

    public p(g g8, k k8, int n8, a a8) {
        this.d = new x(g8);
        this.b = k8;
        this.c = n8;
        this.e = a8;
        this.a = r.a();
    }

    public long a() {
        return this.d.q();
    }

    @Override
    public final void b() {
        this.d.t();
        i i8 = new i(this.d, this.b);
        try {
            i8.b();
            Uri uri = (Uri)g0.a.e((Object)this.d.k());
            this.f = this.e.a(uri, i8);
            return;
        }
        finally {
            M.m((Closeable)i8);
        }
    }

    @Override
    public final void c() {
    }

    public Map d() {
        return this.d.s();
    }

    public final Object e() {
        return this.f;
    }

    public Uri f() {
        return this.d.r();
    }

    public static interface a {
        public Object a(Uri var1, InputStream var2);
    }

}

