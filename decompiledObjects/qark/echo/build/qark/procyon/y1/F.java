// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import android.os.BaseBundle;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.Currency;
import java.math.BigDecimal;
import x1.B;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import x1.a;
import android.content.Context;
import kotlin.jvm.internal.g;

public final class F
{
    public static final a b;
    public final s a;
    
    static {
        b = new a(null);
    }
    
    public F(final Context context) {
        this(new s(context, null, null));
    }
    
    public F(final Context context, final String s) {
        this(new s(context, s, null));
    }
    
    public F(final String s, final String s2, final x1.a a) {
        Intrinsics.checkNotNullParameter(s, "activityName");
        this(new s(s, s2, a));
    }
    
    public F(final s a) {
        Intrinsics.checkNotNullParameter(a, "loggerImpl");
        this.a = a;
    }
    
    public final void a() {
        this.a.j();
    }
    
    public final void b(final Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "parameters");
        if ((((BaseBundle)bundle).getInt("previous") & 0x2) != 0x0 || B.p()) {
            this.a.r("fb_sdk_settings_changed", null, bundle);
        }
    }
    
    public final void c(final String s, final double n, final Bundle bundle) {
        if (B.p()) {
            this.a.n(s, n, bundle);
        }
    }
    
    public final void d(final String s, final Bundle bundle) {
        if (B.p()) {
            this.a.o(s, bundle);
        }
    }
    
    public final void e(final String s, final String s2) {
        this.a.q(s, s2);
    }
    
    public final void f(final String s) {
        if (B.p()) {
            this.a.r(s, null, null);
        }
    }
    
    public final void g(final String s, final Bundle bundle) {
        if (B.p()) {
            this.a.r(s, null, bundle);
        }
    }
    
    public final void h(final String s, final Double n, final Bundle bundle) {
        if (B.p()) {
            this.a.r(s, n, bundle);
        }
    }
    
    public final void i(final String s, final BigDecimal bigDecimal, final Currency currency, final Bundle bundle) {
        if (B.p()) {
            this.a.s(s, bigDecimal, currency, bundle);
        }
    }
    
    public final void j(final BigDecimal bigDecimal, final Currency currency, final Bundle bundle) {
        if (B.p()) {
            this.a.v(bigDecimal, currency, bundle);
        }
    }
    
    public static final class a
    {
        public final F a(final String s, final String s2, final x1.a a) {
            Intrinsics.checkNotNullParameter(s, "activityName");
            return new F(s, s2, a);
        }
        
        public final Executor b() {
            return s.c.h();
        }
        
        public final p.b c() {
            return s.c.j();
        }
        
        public final String d() {
            return s.c.l();
        }
        
        public final void e(final Map map) {
            Intrinsics.checkNotNullParameter(map, "ud");
            L.l(map);
        }
    }
}
