// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import android.media.AudioAttributes;
import android.media.AudioAttributes$Builder;
import g0.M;

public final class b
{
    public static final b g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public d f;
    
    static {
        g = new e().a();
        h = M.w0(0);
        i = M.w0(1);
        j = M.w0(2);
        k = M.w0(3);
        l = M.w0(4);
    }
    
    public b(final int a, final int b, final int c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public d a() {
        if (this.f == null) {
            this.f = new d(this, null);
        }
        return this.f;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (b.class != o.getClass()) {
            return false;
        }
        final b b = (b)o;
        return this.a == b.a && this.b == b.b && this.c == b.c && this.d == b.d && this.e == b.e;
    }
    
    @Override
    public int hashCode() {
        return ((((527 + this.a) * 31 + this.b) * 31 + this.c) * 31 + this.d) * 31 + this.e;
    }
    
    public abstract static final class b
    {
        public static void a(final AudioAttributes$Builder audioAttributes$Builder, final int n) {
            d0.c.a(audioAttributes$Builder, n);
        }
    }
    
    public abstract static final class c
    {
        public static void a(final AudioAttributes$Builder audioAttributes$Builder, final int n) {
            d0.d.a(audioAttributes$Builder, n);
        }
    }
    
    public static final class d
    {
        public final AudioAttributes a;
        
        public d(final b b) {
            final AudioAttributes$Builder setUsage = new AudioAttributes$Builder().setContentType(b.a).setFlags(b.b).setUsage(b.c);
            final int a = M.a;
            if (a >= 29) {
                b.a(setUsage, b.d);
            }
            if (a >= 32) {
                c.a(setUsage, b.e);
            }
            this.a = setUsage.build();
        }
    }
    
    public static final class e
    {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        
        public e() {
            this.a = 0;
            this.b = 0;
            this.c = 1;
            this.d = 1;
            this.e = 0;
        }
        
        public b a() {
            return new b(this.a, this.b, this.c, this.d, this.e, null);
        }
        
        public e b(final int a) {
            this.a = a;
            return this;
        }
        
        public e c(final int b) {
            this.b = b;
            return this;
        }
        
        public e d(final int c) {
            this.c = c;
            return this;
        }
    }
}
