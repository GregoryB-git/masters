// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import g0.M;
import java.util.ArrayList;
import g0.a;
import java.util.List;
import android.content.Context;

public final class l implements g
{
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
    
    public l(final Context context, final g g) {
        this.a = context.getApplicationContext();
        this.c = (g)g0.a.e(g);
        this.b = new ArrayList();
    }
    
    @Override
    public void c(final y y) {
        g0.a.e(y);
        this.c.c(y);
        this.b.add(y);
        this.y(this.d, y);
        this.y(this.e, y);
        this.y(this.f, y);
        this.y(this.g, y);
        this.y(this.h, y);
        this.y(this.i, y);
        this.y(this.j, y);
    }
    
    @Override
    public void close() {
        final g k = this.k;
        if (k != null) {
            try {
                k.close();
            }
            finally {
                this.k = null;
            }
        }
    }
    
    @Override
    public long e(final k k) {
        g0.a.f(this.k == null);
        final String scheme = k.a.getScheme();
        g i = null;
        Label_0082: {
            if (M.D0(k.a)) {
                final String path = k.a.getPath();
                if (path == null || !path.startsWith("/android_asset/")) {
                    i = this.u();
                    break Label_0082;
                }
            }
            else if (!"asset".equals(scheme)) {
                if ("content".equals(scheme)) {
                    i = this.s();
                    break Label_0082;
                }
                if ("rtmp".equals(scheme)) {
                    i = this.w();
                    break Label_0082;
                }
                if ("udp".equals(scheme)) {
                    i = this.x();
                    break Label_0082;
                }
                if ("data".equals(scheme)) {
                    i = this.t();
                    break Label_0082;
                }
                if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    i = this.c;
                    break Label_0082;
                }
                i = this.v();
                break Label_0082;
            }
            i = this.r();
        }
        this.k = i;
        return this.k.e(k);
    }
    
    @Override
    public Map g() {
        final g k = this.k;
        if (k == null) {
            return Collections.emptyMap();
        }
        return k.g();
    }
    
    @Override
    public Uri k() {
        final g k = this.k;
        if (k == null) {
            return null;
        }
        return k.k();
    }
    
    public final void q(final g g) {
        for (int i = 0; i < this.b.size(); ++i) {
            g.c((y)this.b.get(i));
        }
    }
    
    public final g r() {
        if (this.e == null) {
            this.q(this.e = new i0.a(this.a));
        }
        return this.e;
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        return ((g)g0.a.e(this.k)).read(array, n, n2);
    }
    
    public final g s() {
        if (this.f == null) {
            this.q(this.f = new d(this.a));
        }
        return this.f;
    }
    
    public final g t() {
        if (this.i == null) {
            this.q(this.i = new e());
        }
        return this.i;
    }
    
    public final g u() {
        if (this.d == null) {
            this.q(this.d = new p());
        }
        return this.d;
    }
    
    public final g v() {
        if (this.j == null) {
            this.q(this.j = new w(this.a));
        }
        return this.j;
    }
    
    public final g w() {
        if (this.g == null) {
            try {
                this.q(this.g = (g)Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
                goto Label_0062;
            }
            catch (Exception cause) {
                throw new RuntimeException("Error instantiating RTMP extension", cause);
            }
            catch (ClassNotFoundException ex) {}
            goto Label_0055;
        }
        goto Label_0077;
    }
    
    public final g x() {
        if (this.h == null) {
            this.q(this.h = new z());
        }
        return this.h;
    }
    
    public final void y(final g g, final y y) {
        if (g != null) {
            g.c(y);
        }
    }
    
    public static final class a implements g.a
    {
        public final Context a;
        public final g.a b;
        public y c;
        
        public a(final Context context) {
            this(context, new m.b());
        }
        
        public a(final Context context, final g.a b) {
            this.a = context.getApplicationContext();
            this.b = b;
        }
        
        public l b() {
            final l l = new l(this.a, this.b.a());
            final y c = this.c;
            if (c != null) {
                l.c(c);
            }
            return l;
        }
    }
}
