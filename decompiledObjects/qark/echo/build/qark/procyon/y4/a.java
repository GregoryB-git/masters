// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y4;

import m4.c;

public final class a
{
    public static final a p;
    public final long a;
    public final String b;
    public final String c;
    public final c d;
    public final d e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;
    public final long k;
    public final b l;
    public final String m;
    public final long n;
    public final String o;
    
    static {
        p = new a().a();
    }
    
    public a(final long a, final String b, final String c, final c d, final d e, final String f, final String g, final int h, final int i, final String j, final long k, final b l, final String m, final long n, final String o) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
    }
    
    public static a p() {
        return new a();
    }
    
    public String a() {
        return this.m;
    }
    
    public long b() {
        return this.k;
    }
    
    public long c() {
        return this.n;
    }
    
    public String d() {
        return this.g;
    }
    
    public String e() {
        return this.o;
    }
    
    public b f() {
        return this.l;
    }
    
    public String g() {
        return this.c;
    }
    
    public String h() {
        return this.b;
    }
    
    public c i() {
        return this.d;
    }
    
    public String j() {
        return this.f;
    }
    
    public int k() {
        return this.h;
    }
    
    public long l() {
        return this.a;
    }
    
    public d m() {
        return this.e;
    }
    
    public String n() {
        return this.j;
    }
    
    public int o() {
        return this.i;
    }
    
    public static final class a
    {
        public long a;
        public String b;
        public String c;
        public c d;
        public d e;
        public String f;
        public String g;
        public int h;
        public int i;
        public String j;
        public long k;
        public b l;
        public String m;
        public long n;
        public String o;
        
        public a() {
            this.a = 0L;
            this.b = "";
            this.c = "";
            this.d = c.p;
            this.e = d.p;
            this.f = "";
            this.g = "";
            this.h = 0;
            this.i = 0;
            this.j = "";
            this.k = 0L;
            this.l = b.p;
            this.m = "";
            this.n = 0L;
            this.o = "";
        }
        
        public y4.a a() {
            return new y4.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }
        
        public a b(final String m) {
            this.m = m;
            return this;
        }
        
        public a c(final String g) {
            this.g = g;
            return this;
        }
        
        public a d(final String o) {
            this.o = o;
            return this;
        }
        
        public a e(final b l) {
            this.l = l;
            return this;
        }
        
        public a f(final String c) {
            this.c = c;
            return this;
        }
        
        public a g(final String b) {
            this.b = b;
            return this;
        }
        
        public a h(final c d) {
            this.d = d;
            return this;
        }
        
        public a i(final String f) {
            this.f = f;
            return this;
        }
        
        public a j(final long a) {
            this.a = a;
            return this;
        }
        
        public a k(final d e) {
            this.e = e;
            return this;
        }
        
        public a l(final String j) {
            this.j = j;
            return this;
        }
        
        public a m(final int i) {
            this.i = i;
            return this;
        }
    }
    
    public enum b implements c
    {
        p("UNKNOWN_EVENT", 0, 0), 
        q("MESSAGE_DELIVERED", 1, 1), 
        r("MESSAGE_OPEN", 2, 2);
        
        public final int o;
        
        public b(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        @Override
        public int g() {
            return this.o;
        }
    }
    
    public enum c implements m4.c
    {
        p("UNKNOWN", 0, 0), 
        q("DATA_MESSAGE", 1, 1), 
        r("TOPIC", 2, 2), 
        s("DISPLAY_NOTIFICATION", 3, 3);
        
        public final int o;
        
        public c(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        @Override
        public int g() {
            return this.o;
        }
    }
    
    public enum d implements c
    {
        p("UNKNOWN_OS", 0, 0), 
        q("ANDROID", 1, 1), 
        r("IOS", 2, 2), 
        s("WEB", 3, 3);
        
        public final int o;
        
        public d(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        @Override
        public int g() {
            return this.o;
        }
    }
}
