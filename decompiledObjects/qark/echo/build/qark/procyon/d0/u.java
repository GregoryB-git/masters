// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import android.os.Bundle;
import java.util.Arrays;
import java.util.UUID;
import g0.a;
import java.util.Collections;
import X2.v;
import java.util.List;
import android.net.Uri;
import g0.M;

public final class u
{
    public static final u i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public final String a;
    public final h b;
    public final h c;
    public final g d;
    public final w e;
    public final d f;
    public final e g;
    public final i h;
    
    static {
        i = new c().a();
        j = M.w0(0);
        k = M.w0(1);
        l = M.w0(2);
        m = M.w0(3);
        n = M.w0(4);
        o = M.w0(5);
    }
    
    public u(final String a, final e e, final h h, final g d, final w e2, final i h2) {
        this.a = a;
        this.b = h;
        this.c = h;
        this.d = d;
        this.e = e2;
        this.f = (d)e;
        this.g = e;
        this.h = h2;
    }
    
    public c a() {
        return new c(this, null);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof u)) {
            return false;
        }
        final u u = (u)o;
        return M.c(this.a, u.a) && this.f.equals(u.f) && M.c(this.b, u.b) && M.c(this.d, u.d) && M.c(this.e, u.e) && M.c(this.h, u.h);
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final h b = this.b;
        int hashCode2;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return ((((hashCode * 31 + hashCode2) * 31 + this.d.hashCode()) * 31 + this.f.hashCode()) * 31 + this.e.hashCode()) * 31 + this.h.hashCode();
    }
    
    public abstract static final class b
    {
    }
    
    public static final class c
    {
        public String a;
        public Uri b;
        public String c;
        public d.a d;
        public f.a e;
        public List f;
        public String g;
        public v h;
        public Object i;
        public long j;
        public w k;
        public g.a l;
        public i m;
        
        public c() {
            this.d = new d.a();
            this.e = new f.a((u$a)null);
            this.f = Collections.emptyList();
            this.h = v.Y();
            this.l = new g.a();
            this.m = u.i.d;
            this.j = -9223372036854775807L;
        }
        
        public c(final u u) {
            this();
            this.d = u.f.a();
            this.a = u.a;
            this.k = u.e;
            this.l = u.d.a();
            this.m = u.h;
            final h b = u.b;
            if (b != null) {
                this.g = b.e;
                this.c = b.b;
                this.b = b.a;
                this.f = b.d;
                this.h = b.f;
                this.i = b.h;
                final f c = b.c;
                Object b2;
                if (c != null) {
                    b2 = c.b();
                }
                else {
                    b2 = new f.a((u$a)null);
                }
                this.e = (f.a)b2;
                this.j = b.i;
            }
        }
        
        public u a() {
            g0.a.f(u.f.a.e(this.e) == null || u.f.a.f(this.e) != null);
            final Uri b = this.b;
            Object i = null;
            h h;
            if (b != null) {
                final String c = this.c;
                if (u.f.a.f(this.e) != null) {
                    i = this.e.i();
                }
                h = new h(b, c, (f)i, null, this.f, this.g, this.h, this.i, this.j, null);
            }
            else {
                h = null;
            }
            String a = this.a;
            if (a == null) {
                a = "";
            }
            final e g = this.d.g();
            final g f = this.l.f();
            w w = this.k;
            if (w == null) {
                w = d0.w.H;
            }
            return new u(a, g, h, f, w, this.m, null);
        }
        
        public c b(final String s) {
            this.a = (String)g0.a.e(s);
            return this;
        }
        
        public c c(final String c) {
            this.c = c;
            return this;
        }
        
        public c d(final Object i) {
            this.i = i;
            return this;
        }
        
        public c e(final Uri b) {
            this.b = b;
            return this;
        }
    }
    
    public static class d
    {
        public static final d h;
        public static final String i;
        public static final String j;
        public static final String k;
        public static final String l;
        public static final String m;
        public static final String n;
        public static final String o;
        public final long a;
        public final long b;
        public final long c;
        public final long d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        
        static {
            h = new a().f();
            i = M.w0(0);
            j = M.w0(1);
            k = M.w0(2);
            l = M.w0(3);
            m = M.w0(4);
            n = M.w0(5);
            o = M.w0(6);
        }
        
        public d(final a a) {
            this.a = M.i1(a.a(a));
            this.c = M.i1(a.b(a));
            this.b = a.a(a);
            this.d = a.b(a);
            this.e = a.c(a);
            this.f = a.d(a);
            this.g = a.e(a);
        }
        
        public a a() {
            return new a(this, null);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return this.b == d.b && this.d == d.d && this.e == d.e && this.f == d.f && this.g == d.g;
        }
        
        @Override
        public int hashCode() {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        public static final class a
        {
            public long a;
            public long b;
            public boolean c;
            public boolean d;
            public boolean e;
            
            public a() {
                this.b = Long.MIN_VALUE;
            }
            
            public a(final d d) {
                this.a = d.b;
                this.b = d.d;
                this.c = d.e;
                this.d = d.f;
                this.e = d.g;
            }
            
            public static /* synthetic */ long a(final a a) {
                return a.a;
            }
            
            public static /* synthetic */ long b(final a a) {
                return a.b;
            }
            
            public static /* synthetic */ boolean c(final a a) {
                return a.c;
            }
            
            public static /* synthetic */ boolean d(final a a) {
                return a.d;
            }
            
            public static /* synthetic */ boolean e(final a a) {
                return a.e;
            }
            
            public d f() {
                return new d(this, null);
            }
            
            public e g() {
                return new e(this, null);
            }
        }
    }
    
    public static final class e extends d
    {
        public static final e p;
        
        static {
            p = new d.a().g();
        }
        
        public e(final d.a a) {
            super(a, null);
        }
    }
    
    public static final class f
    {
        public static final String l;
        public static final String m;
        public static final String n;
        public static final String o;
        public static final String p;
        public static final String q;
        public static final String r;
        public static final String s;
        public final UUID a;
        public final UUID b;
        public final Uri c;
        public final X2.w d;
        public final X2.w e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final v i;
        public final v j;
        public final byte[] k;
        
        static {
            l = M.w0(0);
            m = M.w0(1);
            n = M.w0(2);
            o = M.w0(3);
            p = M.w0(4);
            q = M.w0(5);
            r = M.w0(6);
            s = M.w0(7);
        }
        
        public f(final a a) {
            g0.a.f(!a.g(a) || a.e(a) != null);
            final UUID uuid = (UUID)g0.a.e(a.f(a));
            this.a = uuid;
            this.b = uuid;
            this.c = a.e(a);
            this.d = a.h(a);
            this.e = a.h(a);
            this.f = a.a(a);
            this.h = a.g(a);
            this.g = a.b(a);
            this.i = a.c(a);
            this.j = a.c(a);
            byte[] copy;
            if (a.d(a) != null) {
                copy = Arrays.copyOf(a.d(a), a.d(a).length);
            }
            else {
                copy = null;
            }
            this.k = copy;
        }
        
        public static /* synthetic */ byte[] a(final f f) {
            return f.k;
        }
        
        public a b() {
            return new a(this, null);
        }
        
        public byte[] c() {
            final byte[] k = this.k;
            if (k != null) {
                return Arrays.copyOf(k, k.length);
            }
            return null;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof f)) {
                return false;
            }
            final f f = (f)o;
            return this.a.equals(f.a) && M.c(this.c, f.c) && M.c(this.e, f.e) && this.f == f.f && this.h == f.h && this.g == f.g && this.j.equals(f.j) && Arrays.equals(this.k, f.k);
        }
        
        @Override
        public int hashCode() {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        public static final class a
        {
            public UUID a;
            public Uri b;
            public X2.w c;
            public boolean d;
            public boolean e;
            public boolean f;
            public v g;
            public byte[] h;
            
            public a() {
                this.c = X2.w.j();
                this.e = true;
                this.g = v.Y();
            }
            
            public a(final f f) {
                this.a = f.a;
                this.b = f.c;
                this.c = f.e;
                this.d = f.f;
                this.e = f.g;
                this.f = f.h;
                this.g = f.j;
                this.h = f.a(f);
            }
            
            public static /* synthetic */ boolean a(final a a) {
                return a.d;
            }
            
            public static /* synthetic */ boolean b(final a a) {
                return a.e;
            }
            
            public static /* synthetic */ v c(final a a) {
                return a.g;
            }
            
            public static /* synthetic */ byte[] d(final a a) {
                return a.h;
            }
            
            public static /* synthetic */ Uri e(final a a) {
                return a.b;
            }
            
            public static /* synthetic */ UUID f(final a a) {
                return a.a;
            }
            
            public static /* synthetic */ boolean g(final a a) {
                return a.f;
            }
            
            public static /* synthetic */ X2.w h(final a a) {
                return a.c;
            }
            
            public f i() {
                return new f(this, null);
            }
        }
    }
    
    public static final class g
    {
        public static final g f;
        public static final String g;
        public static final String h;
        public static final String i;
        public static final String j;
        public static final String k;
        public final long a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;
        
        static {
            f = new a().f();
            g = M.w0(0);
            h = M.w0(1);
            i = M.w0(2);
            j = M.w0(3);
            k = M.w0(4);
        }
        
        public g(final long a, final long b, final long c, final float d, final float e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        public g(final a a) {
            this(a.a(a), a.b(a), a.c(a), a.d(a), a.e(a));
        }
        
        public a a() {
            return new a(this, null);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof g)) {
                return false;
            }
            final g g = (g)o;
            return this.a == g.a && this.b == g.b && this.c == g.c && this.d == g.d && this.e == g.e;
        }
        
        @Override
        public int hashCode() {
            final long a = this.a;
            final int n = (int)(a ^ a >>> 32);
            final long b = this.b;
            final int n2 = (int)(b ^ b >>> 32);
            final long c = this.c;
            final int n3 = (int)(c >>> 32 ^ c);
            final float d = this.d;
            int floatToIntBits = 0;
            int floatToIntBits2;
            if (d != 0.0f) {
                floatToIntBits2 = Float.floatToIntBits(d);
            }
            else {
                floatToIntBits2 = 0;
            }
            final float e = this.e;
            if (e != 0.0f) {
                floatToIntBits = Float.floatToIntBits(e);
            }
            return (((n * 31 + n2) * 31 + n3) * 31 + floatToIntBits2) * 31 + floatToIntBits;
        }
        
        public static final class a
        {
            public long a;
            public long b;
            public long c;
            public float d;
            public float e;
            
            public a() {
                this.a = -9223372036854775807L;
                this.b = -9223372036854775807L;
                this.c = -9223372036854775807L;
                this.d = -3.4028235E38f;
                this.e = -3.4028235E38f;
            }
            
            public a(final g g) {
                this.a = g.a;
                this.b = g.b;
                this.c = g.c;
                this.d = g.d;
                this.e = g.e;
            }
            
            public static /* synthetic */ long a(final a a) {
                return a.a;
            }
            
            public static /* synthetic */ long b(final a a) {
                return a.b;
            }
            
            public static /* synthetic */ long c(final a a) {
                return a.c;
            }
            
            public static /* synthetic */ float d(final a a) {
                return a.d;
            }
            
            public static /* synthetic */ float e(final a a) {
                return a.e;
            }
            
            public g f() {
                return new g(this, null);
            }
            
            public a g(final long c) {
                this.c = c;
                return this;
            }
            
            public a h(final float e) {
                this.e = e;
                return this;
            }
            
            public a i(final long b) {
                this.b = b;
                return this;
            }
            
            public a j(final float d) {
                this.d = d;
                return this;
            }
            
            public a k(final long a) {
                this.a = a;
                return this;
            }
        }
    }
    
    public static final class h
    {
        public static final String j;
        public static final String k;
        public static final String l;
        public static final String m;
        public static final String n;
        public static final String o;
        public static final String p;
        public static final String q;
        public final Uri a;
        public final String b;
        public final f c;
        public final List d;
        public final String e;
        public final v f;
        public final List g;
        public final Object h;
        public final long i;
        
        static {
            j = M.w0(0);
            k = M.w0(1);
            l = M.w0(2);
            m = M.w0(3);
            n = M.w0(4);
            o = M.w0(5);
            p = M.w0(6);
            q = M.w0(7);
        }
        
        public h(final Uri a, final String s, final f c, final b b, final List d, final String e, final v f, final Object h, final long i) {
            this.a = a;
            this.b = z.t(s);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            final v.a m = v.M();
            for (int j = 0; j < f.size(); ++j) {
                m.h(((k)f.get(j)).a().b());
            }
            this.g = m.k();
            this.h = h;
            this.i = i;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof h)) {
                return false;
            }
            final h h = (h)o;
            return this.a.equals((Object)h.a) && M.c(this.b, h.b) && M.c(this.c, h.c) && M.c(null, null) && this.d.equals(h.d) && M.c(this.e, h.e) && this.f.equals(h.f) && M.c(this.h, h.h) && M.c(this.i, h.i);
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.a.hashCode();
            final String b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final f c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final int hashCode5 = this.d.hashCode();
            final String e = this.e;
            int hashCode6;
            if (e == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = e.hashCode();
            }
            final int hashCode7 = this.f.hashCode();
            final Object h = this.h;
            if (h != null) {
                hashCode2 = h.hashCode();
            }
            return (int)(((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 961 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode2) * 31L + this.i);
        }
    }
    
    public static final class i
    {
        public static final i d;
        public static final String e;
        public static final String f;
        public static final String g;
        public final Uri a;
        public final String b;
        public final Bundle c;
        
        static {
            d = new a().d();
            e = M.w0(0);
            f = M.w0(1);
            g = M.w0(2);
        }
        
        public i(final a a) {
            this.a = a.a(a);
            this.b = a.b(a);
            this.c = a.c(a);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof i)) {
                return false;
            }
            final i i = (i)o;
            return M.c(this.a, i.a) && M.c(this.b, i.b) && this.c == null == (i.c == null);
        }
        
        @Override
        public int hashCode() {
            final Uri a = this.a;
            int n = 0;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            final String b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            if (this.c != null) {
                n = 1;
            }
            return (hashCode * 31 + hashCode2) * 31 + n;
        }
        
        public static final class a
        {
            public Uri a;
            public String b;
            public Bundle c;
            
            public static /* synthetic */ Uri a(final a a) {
                return a.a;
            }
            
            public static /* synthetic */ String b(final a a) {
                return a.b;
            }
            
            public static /* synthetic */ Bundle c(final a a) {
                return a.c;
            }
            
            public i d() {
                return new i(this, null);
            }
        }
    }
    
    public abstract static final class j extends k
    {
    }
    
    public abstract static class k
    {
        public abstract a a();
        
        public abstract static final class a
        {
            public abstract j b();
        }
    }
}
