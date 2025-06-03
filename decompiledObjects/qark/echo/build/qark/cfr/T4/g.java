/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package T4;

import P.f;
import S.a;
import S.d;
import T4.e;
import V5.o;
import V5.t;
import Z5.k;
import android.util.Log;
import g6.p;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import p6.I;
import s6.d;

public final class g {
    public static final b c = new b(null);
    public static final d.a d = S.f.a("firebase_sessions_enabled");
    public static final d.a e = S.f.b("firebase_sessions_sampling_rate");
    public static final d.a f = S.f.d("firebase_sessions_restart_timeout");
    public static final d.a g = S.f.d("firebase_sessions_cache_duration");
    public static final d.a h = S.f.e("firebase_sessions_cache_updated_time");
    public final f a;
    public e b;

    public g(f f8) {
        Intrinsics.checkNotNullParameter(f8, "dataStore");
        this.a = f8;
        p6.g.f(null, new p(this, null){
            public Object o;
            public int p;
            public final /* synthetic */ g q;
            {
                this.q = g8;
                super(2, d8);
            }

            @Override
            public final X5.d create(Object object, X5.d d8) {
                return new ;
            }

            public final Object invoke(I i8, X5.d d8) {
                return (this.create(i8, d8)).invokeSuspend(t.a);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final Object invokeSuspend(Object object) {
                Object object2;
                Object object3 = Y5.b.c();
                int n8 = this.p;
                if (n8 != 0) {
                    if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    object3 = (g)this.o;
                    o.b(object);
                    object2 = object;
                } else {
                    o.b(object);
                    object = this.q;
                    object2 = ((g)object).a.b();
                    this.o = object;
                    this.p = 1;
                    object2 = d.d((s6.b)object2, this);
                    if (object2 == object3) {
                        return object3;
                    }
                    object3 = object;
                }
                ((g)object3).l(((S.d)object2).d());
                return t.a;
            }
        }, 1, null);
    }

    public final boolean d() {
        e e8 = this.b;
        Object var2_2 = null;
        e e9 = e8;
        if (e8 == null) {
            Intrinsics.n("sessionConfigs");
            e9 = null;
        }
        e8 = e9.b();
        e9 = this.b;
        if (e9 == null) {
            Intrinsics.n("sessionConfigs");
            e9 = var2_2;
        }
        e9 = e9.a();
        if (e8 != null && e9 != null && (System.currentTimeMillis() - e8.longValue()) / (long)1000 < (long)e9.intValue()) {
            return false;
        }
        return true;
    }

    public final Integer e() {
        e e8;
        e e9 = e8 = this.b;
        if (e8 == null) {
            Intrinsics.n("sessionConfigs");
            e9 = null;
        }
        return e9.d();
    }

    public final Double f() {
        e e8;
        e e9 = e8 = this.b;
        if (e8 == null) {
            Intrinsics.n("sessionConfigs");
            e9 = null;
        }
        return e9.e();
    }

    public final Boolean g() {
        e e8;
        e e9 = e8 = this.b;
        if (e8 == null) {
            Intrinsics.n("sessionConfigs");
            e9 = null;
        }
        return e9.c();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object h(d.a var1_1, Object var2_3, X5.d var3_4) {
        if (!(var3_4 instanceof )) ** GOTO lbl-1000
        var5_5 = var3_4;
        var4_6 = var5_5.q;
        if ((var4_6 & Integer.MIN_VALUE) != 0) {
            var5_5.q = var4_6 + Integer.MIN_VALUE;
            var3_4 = var5_5;
        } else lbl-1000: // 2 sources:
        {
            var3_4 = new Z5.d((X5.d)var3_4){
                public /* synthetic */ Object o;
                public int q;

                @Override
                public final Object invokeSuspend(Object object) {
                    this.o = object;
                    this.q |= Integer.MIN_VALUE;
                    return this.h(null, null, this);
                }
            };
        }
        var6_7 = var3_4.o;
        var5_5 = Y5.b.c();
        var4_6 = var3_4.q;
        if (var4_6 != 0) {
            if (var4_6 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            o.b(var6_7);
            return t.a;
        }
        o.b(var6_7);
        try {
            var6_7 = this.a;
            var1_1 = new p(var2_3, (d.a)var1_1, this, null){
                public int o;
                public /* synthetic */ Object p;
                public final /* synthetic */ Object q;
                public final /* synthetic */ d.a r;
                public final /* synthetic */ g s;
                {
                    this.q = object;
                    this.r = a8;
                    this.s = g8;
                    super(2, d8);
                }

                public final Object a(a a8, X5.d d8) {
                    return (this.create(a8, d8)).invokeSuspend(t.a);
                }

                @Override
                public final X5.d create(Object object, X5.d d8) {
                    d8 = new ;
                    d8.p = object;
                    return d8;
                }

                @Override
                public final Object invokeSuspend(Object object) {
                    Y5.b.c();
                    if (this.o == 0) {
                        o.b(object);
                        object = (a)this.p;
                        Object object2 = this.q;
                        if (object2 != null) {
                            object.i(this.r, object2);
                        } else {
                            object.h(this.r);
                        }
                        this.s.l((S.d)object);
                        return t.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            };
            var3_4.q = 1;
            var1_1 = S.g.a((f)var6_7, (p)var1_1, (X5.d)var3_4);
            if (var1_1 != var5_5) return t.a;
            return var5_5;
        }
        catch (IOException var1_2) {}
        var2_3 = new StringBuilder();
        var2_3.append("Failed to update cache config value: ");
        var2_3.append((Object)var1_2);
        Log.w((String)"SettingsCache", (String)var2_3.toString());
        return t.a;
    }

    public final Object i(Double object, X5.d d8) {
        if ((object = this.h(e, object, d8)) == Y5.b.c()) {
            return object;
        }
        return t.a;
    }

    public final Object j(Integer object, X5.d d8) {
        if ((object = this.h(g, object, d8)) == Y5.b.c()) {
            return object;
        }
        return t.a;
    }

    public final Object k(Long object, X5.d d8) {
        if ((object = this.h(h, object, d8)) == Y5.b.c()) {
            return object;
        }
        return t.a;
    }

    public final void l(S.d d8) {
        this.b = new e((Boolean)d8.b(d), (Double)d8.b(e), (Integer)d8.b(f), (Integer)d8.b(g), (Long)d8.b(h));
    }

    public final Object m(Integer object, X5.d d8) {
        if ((object = this.h(f, object, d8)) == Y5.b.c()) {
            return object;
        }
        return t.a;
    }

    public final Object n(Boolean object, X5.d d8) {
        if ((object = this.h(d, object, d8)) == Y5.b.c()) {
            return object;
        }
        return t.a;
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g g8) {
            this();
        }
    }

}

