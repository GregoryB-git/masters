/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 */
package i0;

import android.content.Context;
import android.net.Uri;
import g0.M;
import g0.o;
import i0.d;
import i0.e;
import i0.g;
import i0.k;
import i0.m;
import i0.p;
import i0.w;
import i0.y;
import i0.z;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class l
implements g {
    public final Context a;
    public final List b;
    public final g c;
    public g d;
    public g e;
    public g f;
    public g g;
    public g h;
    public g i;
    public g j;
    public g k;

    public l(Context context, g g8) {
        this.a = context.getApplicationContext();
        this.c = (g)g0.a.e(g8);
        this.b = new ArrayList();
    }

    @Override
    public void c(y y8) {
        g0.a.e(y8);
        this.c.c(y8);
        this.b.add((Object)y8);
        this.y(this.d, y8);
        this.y(this.e, y8);
        this.y(this.f, y8);
        this.y(this.g, y8);
        this.y(this.h, y8);
        this.y(this.i, y8);
        this.y(this.j, y8);
    }

    @Override
    public void close() {
        g g8 = this.k;
        if (g8 != null) {
            try {
                g8.close();
                return;
            }
            finally {
                this.k = null;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public long e(k var1_1) {
        block3 : {
            block2 : {
                var2_2 = this.k == null;
                g0.a.f(var2_2);
                var3_3 = var1_1.a.getScheme();
                if (!M.D0(var1_1.a)) break block2;
                var3_3 = var1_1.a.getPath();
                if (var3_3 != null && var3_3.startsWith("/android_asset/")) ** GOTO lbl-1000
                var3_3 = this.u();
                break block3;
            }
            if ("asset".equals(var3_3)) lbl-1000: // 2 sources:
            {
                var3_3 = this.r();
            } else {
                var3_3 = "content".equals(var3_3) ? this.s() : ("rtmp".equals(var3_3) ? this.w() : ("udp".equals(var3_3) ? this.x() : ("data".equals(var3_3) ? this.t() : (!"rawresource".equals(var3_3) && !"android.resource".equals(var3_3) ? this.c : this.v()))));
            }
        }
        this.k = var3_3;
        return this.k.e(var1_1);
    }

    @Override
    public Map g() {
        g g8 = this.k;
        if (g8 == null) {
            return Collections.emptyMap();
        }
        return g8.g();
    }

    @Override
    public Uri k() {
        g g8 = this.k;
        if (g8 == null) {
            return null;
        }
        return g8.k();
    }

    public final void q(g g8) {
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            g8.c((y)this.b.get(i8));
        }
    }

    public final g r() {
        if (this.e == null) {
            i0.a a8 = new i0.a(this.a);
            this.e = a8;
            this.q(a8);
        }
        return this.e;
    }

    @Override
    public int read(byte[] arrby, int n8, int n9) {
        return ((g)g0.a.e(this.k)).read(arrby, n8, n9);
    }

    public final g s() {
        if (this.f == null) {
            d d8 = new d(this.a);
            this.f = d8;
            this.q(d8);
        }
        return this.f;
    }

    public final g t() {
        if (this.i == null) {
            e e8 = new e();
            this.i = e8;
            this.q(e8);
        }
        return this.i;
    }

    public final g u() {
        if (this.d == null) {
            p p8 = new p();
            this.d = p8;
            this.q(p8);
        }
        return this.d;
    }

    public final g v() {
        if (this.j == null) {
            w w8 = new w(this.a);
            this.j = w8;
            this.q(w8);
        }
        return this.j;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final g w() {
        if (this.g == null) {
            block5 : {
                try {
                    g g8;
                    this.g = g8 = (g)Class.forName((String)"androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.q(g8);
                    break block5;
                }
                catch (Exception exception) {
                    throw new RuntimeException("Error instantiating RTMP extension", (Throwable)exception);
                }
                catch (ClassNotFoundException classNotFoundException) {}
                o.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    public final g x() {
        if (this.h == null) {
            z z8 = new z();
            this.h = z8;
            this.q(z8);
        }
        return this.h;
    }

    public final void y(g g8, y y8) {
        if (g8 != null) {
            g8.c(y8);
        }
    }

    public static final class a
    implements g.a {
        public final Context a;
        public final g.a b;
        public y c;

        public a(Context context) {
            this(context, new m.b());
        }

        public a(Context context, g.a a8) {
            this.a = context.getApplicationContext();
            this.b = a8;
        }

        public l b() {
            l l8 = new l(this.a, this.b.a());
            y y8 = this.c;
            if (y8 != null) {
                l8.c(y8);
            }
            return l8;
        }
    }

}

