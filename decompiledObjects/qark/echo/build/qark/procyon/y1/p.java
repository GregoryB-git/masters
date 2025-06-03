// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import java.util.Arrays;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import java.util.Currency;
import java.math.BigDecimal;
import android.os.Bundle;
import x1.a;
import android.content.Context;
import kotlin.jvm.internal.g;

public final class p
{
    public static final a b;
    public static final String c;
    public final s a;
    
    static {
        b = new a(null);
        c = p.class.getCanonicalName();
    }
    
    public p(final Context context, final String s, final x1.a a) {
        this.a = new s(context, s, a);
    }
    
    public final void a() {
        this.a.j();
    }
    
    public final String b() {
        return this.a.k();
    }
    
    public final void c(final String s) {
        this.a.l(s);
    }
    
    public final void d(final String s, final double n) {
        this.a.m(s, n);
    }
    
    public final void e(final String s, final double n, final Bundle bundle) {
        this.a.n(s, n, bundle);
    }
    
    public final void f(final String s, final Bundle bundle) {
        this.a.o(s, bundle);
    }
    
    public final void g(final BigDecimal bigDecimal, final Currency currency, final Bundle bundle) {
        this.a.t(bigDecimal, currency, bundle);
    }
    
    public final void h(final Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "payload");
        this.a.w(bundle, null);
    }
    
    public final void i(final Bundle bundle, final String s) {
        Intrinsics.checkNotNullParameter(bundle, "payload");
        this.a.w(bundle, s);
    }
    
    public static final class a
    {
        public final void a(final Application application, final String s) {
            Intrinsics.checkNotNullParameter(application, "application");
            s.c.f(application, s);
        }
        
        public final void b() {
            L.d();
        }
        
        public final void c() {
            d.g(null);
        }
        
        public final String d(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return s.c.i(context);
        }
        
        public final b e() {
            return s.c.j();
        }
        
        public final String f() {
            return d.c();
        }
        
        public final void g(final Context context, final String s) {
            Intrinsics.checkNotNullParameter(context, "context");
            s.c.m(context, s);
        }
        
        public final p h(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new p(context, null, null, null);
        }
        
        public final void i() {
            s.c.s();
        }
        
        public final void j(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8, final String s9, final String s10) {
            L.n(s, s2, s3, s4, s5, s6, s7, s8, s9, s10);
        }
        
        public final void k(final String s) {
            d.g(s);
        }
    }
    
    public enum b
    {
        o("AUTO", 0), 
        p("EXPLICIT_ONLY", 1);
        
        static {
            q = c();
        }
        
        public b(final String name, final int ordinal) {
        }
        
        public static final /* synthetic */ b[] c() {
            return new b[] { b.o, b.p };
        }
    }
}
