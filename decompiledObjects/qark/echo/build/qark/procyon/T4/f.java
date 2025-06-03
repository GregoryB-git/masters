// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T4;

import kotlin.jvm.internal.p;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.q;
import V5.t;
import V5.o;
import s4.i;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import p6.I;
import g6.l;
import Q.b;
import kotlin.jvm.internal.g;
import i6.a;

public final class f
{
    public static final a c;
    public static final i6.a d;
    public final h a;
    public final h b;
    
    static {
        c = new a(null);
        d = R.a.b("firebase_session_settings", null, null, null, 14, null);
    }
    
    public f(final h a, final h b) {
        Intrinsics.checkNotNullParameter(a, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(b, "remoteSettings");
        this.a = a;
        this.b = b;
    }
    
    public f(final Context context, final X5.g g, final X5.g g2, final i i, final R4.b b) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(g, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(g2, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(i, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(b, "appInfo");
        this(new T4.b(context), new c(g2, i, b, new d(b, g, null, 4, null), f.c.b(context)));
    }
    
    public static final /* synthetic */ i6.a a() {
        return f.d;
    }
    
    public final double b() {
        final Double b = this.a.b();
        if (b != null) {
            final double doubleValue = b.doubleValue();
            if (this.e(doubleValue)) {
                return doubleValue;
            }
        }
        final Double b2 = this.b.b();
        if (b2 != null) {
            final double doubleValue2 = b2.doubleValue();
            if (this.e(doubleValue2)) {
                return doubleValue2;
            }
        }
        return 1.0;
    }
    
    public final long c() {
        final o6.a d = this.a.d();
        if (d != null) {
            final long a0 = d.a0();
            if (this.f(a0)) {
                return a0;
            }
        }
        final o6.a d2 = this.b.d();
        if (d2 != null) {
            final long a2 = d2.a0();
            if (this.f(a2)) {
                return a2;
            }
        }
        final o6.a.a p = o6.a.p;
        return o6.c.o(30, o6.d.t);
    }
    
    public final boolean d() {
        final Boolean a = this.a.a();
        if (a != null) {
            return a;
        }
        final Boolean a2 = this.b.a();
        return a2 == null || a2;
    }
    
    public final boolean e(final double n) {
        boolean b = false;
        if (0.0 <= n) {
            b = b;
            if (n <= 1.0) {
                b = true;
            }
        }
        return b;
    }
    
    public final boolean f(final long n) {
        return o6.a.U(n) && o6.a.H(n);
    }
    
    public final Object g(final X5.d d) {
        Z5.d d3 = null;
        Label_0047: {
            if (d instanceof f$b) {
                final Z5.d d2 = (f$b)d;
                final int r = d2.r;
                if ((r & Integer.MIN_VALUE) != 0x0) {
                    d2.r = r + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0047;
                }
            }
            d3 = new Z5.d(d) {
                public Object o;
                public /* synthetic */ Object p;
                public final /* synthetic */ f q;
                public int r;
                
                @Override
                public final Object invokeSuspend(final Object p) {
                    this.p = p;
                    this.r |= Integer.MIN_VALUE;
                    return this.q.g(this);
                }
            };
        }
        final Object p = d3.p;
        final Object c = Y5.b.c();
        final int r2 = d3.r;
        f f;
        if (r2 != 0) {
            if (r2 != 1) {
                if (r2 == 2) {
                    o.b(p);
                    return t.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                f = (f)d3.o;
                o.b(p);
            }
        }
        else {
            o.b(p);
            final h a = this.a;
            d3.o = this;
            d3.r = 1;
            if (a.c(d3) == c) {
                return c;
            }
            f = this;
        }
        final h b = f.b;
        d3.o = null;
        d3.r = 2;
        if (b.c(d3) == c) {
            return c;
        }
        return t.a;
    }
    
    public static final class a
    {
        public static final /* synthetic */ m6.h[] a;
        
        static {
            a = new m6.h[] { v.e(new q(a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0)) };
        }
        
        public final P.f b(final Context context) {
            return (P.f)f.a().a(context, f.a.a[0]);
        }
    }
}
