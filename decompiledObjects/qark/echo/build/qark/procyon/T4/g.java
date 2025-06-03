// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T4;

import S.a;
import android.util.Log;
import java.io.IOException;
import V5.o;
import Y5.b;
import V5.t;
import p6.I;
import Z5.k;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import P.f;
import S.d;

public final class g
{
    public static final b c;
    public static final d.a d;
    public static final d.a e;
    public static final d.a f;
    public static final d.a g;
    public static final d.a h;
    public final f a;
    public e b;
    
    static {
        c = new b(null);
        d = S.f.a("firebase_sessions_enabled");
        e = S.f.b("firebase_sessions_sampling_rate");
        f = S.f.d("firebase_sessions_restart_timeout");
        g = S.f.d("firebase_sessions_cache_duration");
        h = S.f.e("firebase_sessions_cache_updated_time");
    }
    
    public g(final f a) {
        Intrinsics.checkNotNullParameter(a, "dataStore");
        this.a = a;
        p6.g.f(null, new p() {
            public Object o;
            public int p;
            public final /* synthetic */ g q;
            
            @Override
            public final X5.d create(final Object o, final X5.d d) {
                return new p() {
                    public Object o;
                    public int p;
                    public final /* synthetic */ g q = this.q;
                };
            }
            
            public final Object invoke(final I i, final X5.d d) {
                return ((g$a)this.create(i, d)).invokeSuspend(t.a);
            }
            
            @Override
            public final Object invokeSuspend(final Object o) {
                final Object c = Y5.b.c();
                final int p = this.p;
                g g;
                Object d;
                if (p != 0) {
                    if (p != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g = (g)this.o;
                    o.b(o);
                    d = o;
                }
                else {
                    o.b(o);
                    final g q = this.q;
                    final s6.b b = T4.g.a(q).b();
                    this.o = q;
                    this.p = 1;
                    d = s6.d.d(b, this);
                    if (d == c) {
                        return c;
                    }
                    g = q;
                }
                g.l(((S.d)d).d());
                return t.a;
            }
        }, 1, null);
    }
    
    public static final /* synthetic */ f a(final g g) {
        return g.a;
    }
    
    public final boolean d() {
        final e b = this.b;
        final e e = null;
        e e2 = b;
        if (b == null) {
            Intrinsics.n("sessionConfigs");
            e2 = null;
        }
        final Long b2 = e2.b();
        e b3 = this.b;
        if (b3 == null) {
            Intrinsics.n("sessionConfigs");
            b3 = e;
        }
        final Integer a = b3.a();
        return b2 == null || a == null || (System.currentTimeMillis() - b2) / 1000 >= a;
    }
    
    public final Integer e() {
        e b;
        if ((b = this.b) == null) {
            Intrinsics.n("sessionConfigs");
            b = null;
        }
        return b.d();
    }
    
    public final Double f() {
        e b;
        if ((b = this.b) == null) {
            Intrinsics.n("sessionConfigs");
            b = null;
        }
        return b.e();
    }
    
    public final Boolean g() {
        e b;
        if ((b = this.b) == null) {
            Intrinsics.n("sessionConfigs");
            b = null;
        }
        return b.c();
    }
    
    public final Object h(final d.a a, Object o, final X5.d d) {
        Z5.d d3 = null;
        Label_0054: {
            if (d instanceof g$c) {
                final Z5.d d2 = (g$c)d;
                final int q = d2.q;
                if ((q & Integer.MIN_VALUE) != 0x0) {
                    d2.q = q + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0054;
                }
            }
            d3 = new Z5.d(d) {
                public /* synthetic */ Object o;
                public int q;
                
                @Override
                public final Object invokeSuspend(final Object o) {
                    this.o = o;
                    this.q |= Integer.MIN_VALUE;
                    return T4.g.this.h(null, null, this);
                }
            };
        }
        final Object o2 = d3.o;
        final Object c = Y5.b.c();
        final int q2 = d3.q;
        if (q2 != 0) {
            if (q2 == 1) {
                Label_0149: {
                    try {
                        o.b(o2);
                        return t.a;
                    }
                    catch (IOException obj) {
                        break Label_0149;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o = new StringBuilder();
                ((StringBuilder)o).append("Failed to update cache config value: ");
                final IOException obj;
                ((StringBuilder)o).append(obj);
                Log.w("SettingsCache", ((StringBuilder)o).toString());
                return t.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(o2);
        final f a2 = this.a;
        final p p3 = new p(null) {
            public int o;
            public /* synthetic */ Object p;
            public final /* synthetic */ Object q;
            public final /* synthetic */ S.d.a r;
            public final /* synthetic */ g s;
            
            public final Object a(final S.a a, final X5.d d) {
                return ((g$d)this.create(a, d)).invokeSuspend(t.a);
            }
            
            @Override
            public final X5.d create(final Object p2, final X5.d d) {
                final p p3 = new p(d) {
                    public int o;
                    public /* synthetic */ Object p;
                    public final /* synthetic */ Object q = this.q;
                    public final /* synthetic */ S.d.a r = this.r;
                    public final /* synthetic */ g s = this.s;
                    
                    public final Object a(final S.a a, final X5.d d) {
                        return ((g$d)this.create(a, d)).invokeSuspend(t.a);
                    }
                };
                p3.p = p2;
                return p3;
            }
            
            @Override
            public final Object invokeSuspend(final Object o) {
                Y5.b.c();
                if (this.o == 0) {
                    o.b(o);
                    final S.a a = (S.a)this.p;
                    final Object q = this.q;
                    if (q != null) {
                        a.i(this.r, q);
                    }
                    else {
                        a.h(this.r);
                    }
                    T4.g.this.l(a);
                    return t.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        };
        d3.q = 1;
        if (S.g.a(a2, p3, d3) == c) {
            return c;
        }
        return t.a;
    }
    
    public final Object i(final Double n, final X5.d d) {
        final Object h = this.h(T4.g.e, n, d);
        if (h == Y5.b.c()) {
            return h;
        }
        return t.a;
    }
    
    public final Object j(final Integer n, final X5.d d) {
        final Object h = this.h(T4.g.g, n, d);
        if (h == Y5.b.c()) {
            return h;
        }
        return t.a;
    }
    
    public final Object k(final Long n, final X5.d d) {
        final Object h = this.h(T4.g.h, n, d);
        if (h == Y5.b.c()) {
            return h;
        }
        return t.a;
    }
    
    public final void l(final d d) {
        this.b = new e((Boolean)d.b(T4.g.d), (Double)d.b(T4.g.e), (Integer)d.b(T4.g.f), (Integer)d.b(T4.g.g), (Long)d.b(T4.g.h));
    }
    
    public final Object m(final Integer n, final X5.d d) {
        final Object h = this.h(T4.g.f, n, d);
        if (h == Y5.b.c()) {
            return h;
        }
        return t.a;
    }
    
    public final Object n(final Boolean b, final X5.d d) {
        final Object h = this.h(T4.g.d, b, d);
        if (h == b.c()) {
            return h;
        }
        return t.a;
    }
    
    public static final class b
    {
    }
}
