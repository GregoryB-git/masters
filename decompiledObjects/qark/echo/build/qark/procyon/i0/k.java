// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import java.util.Collections;
import java.util.HashMap;
import g0.a;
import d0.v;
import java.util.Map;
import android.net.Uri;

public final class k
{
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;
    public final Object k;
    
    static {
        v.a("media3.datasource");
    }
    
    public k(final Uri uri, final long b, final int c, byte[] d, final Map m, final long g, final long h, final String i, final int j, final Object k) {
        final long f = b + g;
        final boolean b2 = true;
        g0.a.a(f >= 0L);
        g0.a.a(g >= 0L);
        boolean b3 = b2;
        if (h <= 0L) {
            b3 = (h == -1L && b2);
        }
        g0.a.a(b3);
        this.a = (Uri)g0.a.e(uri);
        this.b = b;
        this.c = c;
        if (d == null || d.length == 0) {
            d = null;
        }
        this.d = d;
        this.e = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(m));
        this.g = g;
        this.f = f;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public static String c(final int n) {
        if (n == 1) {
            return "GET";
        }
        if (n == 2) {
            return "POST";
        }
        if (n == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }
    
    public b a() {
        return new b(this, null);
    }
    
    public final String b() {
        return c(this.c);
    }
    
    public boolean d(final int n) {
        return (this.j & n) == n;
    }
    
    public k e(final long n) {
        final long h = this.h;
        long n2 = -1L;
        if (h != -1L) {
            n2 = h - n;
        }
        return this.f(n, n2);
    }
    
    public k f(final long n, final long n2) {
        if (n == 0L && this.h == n2) {
            return this;
        }
        return new k(this.a, this.b, this.c, this.d, this.e, this.g + n, n2, this.i, this.j, this.k);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DataSpec[");
        sb.append(this.b());
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.j);
        sb.append("]");
        return sb.toString();
    }
    
    public static final class b
    {
        public Uri a;
        public long b;
        public int c;
        public byte[] d;
        public Map e;
        public long f;
        public long g;
        public String h;
        public int i;
        public Object j;
        
        public b() {
            this.c = 1;
            this.e = Collections.emptyMap();
            this.g = -1L;
        }
        
        public b(final k k) {
            this.a = k.a;
            this.b = k.b;
            this.c = k.c;
            this.d = k.d;
            this.e = k.e;
            this.f = k.g;
            this.g = k.h;
            this.h = k.i;
            this.i = k.j;
            this.j = k.k;
        }
        
        public k a() {
            g0.a.i(this.a, "The uri must be set.");
            return new k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
        }
        
        public b b(final int i) {
            this.i = i;
            return this;
        }
        
        public b c(final byte[] d) {
            this.d = d;
            return this;
        }
        
        public b d(final int c) {
            this.c = c;
            return this;
        }
        
        public b e(final Map e) {
            this.e = e;
            return this;
        }
        
        public b f(final String h) {
            this.h = h;
            return this;
        }
        
        public b g(final long g) {
            this.g = g;
            return this;
        }
        
        public b h(final long f) {
            this.f = f;
            return this;
        }
        
        public b i(final Uri a) {
            this.a = a;
            return this;
        }
        
        public b j(final String s) {
            this.a = Uri.parse(s);
            return this;
        }
    }
}
