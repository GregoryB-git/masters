/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 */
package R4;

import R4.b;
import R4.h;
import R4.i;
import R4.k;
import R4.o;
import R4.p;
import R4.q;
import R4.r;
import R4.s;
import R4.u;
import R4.v;
import R4.w;
import R4.x;
import S4.b;
import V5.t;
import X5.d;
import X5.g;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p6.F;
import s3.e;
import s3.f;
import s3.m;

public final class l {
    public static final a h = new a(null);
    public final e a;
    public final b b;
    public final T4.f c;
    public final x d;
    public final s e;
    public final h f;
    public final o g;

    public l(e e8, s4.i object, F object2, F object3, r4.b object4) {
        Intrinsics.checkNotNullParameter(e8, "firebaseApp");
        Intrinsics.checkNotNullParameter(object, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(object2, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(object3, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(object4, "transportFactoryProvider");
        this.a = e8;
        Object object5 = r.a.a(e8);
        this.b = object5;
        Context context = e8.m();
        Intrinsics.checkNotNullExpressionValue((Object)context, "firebaseApp.applicationContext");
        this.c = object3 = new T4.f(context, (g)object3, (g)object2, (s4.i)object, (b)object5);
        this.d = object5 = new w();
        this.f = object4 = new h((r4.b)object4);
        this.g = new o((s4.i)object, (i)object4);
        this.e = object = new s(this.f(), (x)object5, null, 4, null);
        object2 = new v((x)object5, (g)object2, new u(){

            @Override
            public Object a(p object, d d8) {
                if ((object = this.d((p)object, d8)) == Y5.b.c()) {
                    return object;
                }
                return t.a;
            }
        }, (T4.f)object3, (s)object);
        object = e8.m().getApplicationContext();
        if (object instanceof Application) {
            ((Application)object).registerActivityLifecycleCallbacks(object2.d());
            e8.h(new k((Context)object, (v)object2));
            return;
        }
        e8 = new StringBuilder();
        e8.append("Failed to register lifecycle callbacks, unexpected context ");
        e8.append((Object)object.getClass());
        e8.append('.');
        Log.e((String)"FirebaseSessions", (String)e8.toString());
    }

    public static /* synthetic */ void a(Context context, v v8, String string2, m m8) {
        l.b(context, v8, string2, m8);
    }

    public static final void b(Context context, v v8, String string2, m m8) {
        Intrinsics.checkNotNullParameter(v8, "$sessionInitiator");
        Log.w((String)"FirebaseSessions", (String)"FirebaseApp instance deleted. Sessions library will not collect session data.");
        ((Application)context).unregisterActivityLifecycleCallbacks(v8.d());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object d(p var1_1, d var2_3) {
        block13 : {
            block18 : {
                block17 : {
                    block16 : {
                        block14 : {
                            block15 : {
                                if (!(var2_3 instanceof )) ** GOTO lbl-1000
                                var4_4 = var2_3;
                                var3_5 = var4_4.t;
                                if ((var3_5 & Integer.MIN_VALUE) != 0) {
                                    var4_4.t = var3_5 + Integer.MIN_VALUE;
                                } else lbl-1000: // 2 sources:
                                {
                                    var4_4 = new Z5.d((d)var2_3){
                                        public Object o;
                                        public Object p;
                                        public Object q;
                                        public /* synthetic */ Object r;
                                        public int t;

                                        @Override
                                        public final Object invokeSuspend(Object object) {
                                            this.r = object;
                                            this.t |= Integer.MIN_VALUE;
                                            return this.d(null, this);
                                        }
                                    };
                                }
                                var5_6 = var4_4.r;
                                var7_7 = Y5.b.c();
                                var3_5 = var4_4.t;
                                if (var3_5 == 0) break block14;
                                if (var3_5 == 1) break block15;
                                if (var3_5 != 2) {
                                    if (var3_5 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    V5.o.b(var5_6);
                                    return t.a;
                                }
                                var6_8 = (Map)var4_4.q;
                                var1_1 = (p)var4_4.p;
                                var2_3 = (l)var4_4.o;
                                V5.o.b(var5_6);
                                var5_6 = var6_8;
                                ** GOTO lbl-1000
                            }
                            var1_1 = (p)var4_4.p;
                            var2_3 = (l)var4_4.o;
                            V5.o.b(var5_6);
                            break block16;
                        }
                        V5.o.b(var5_6);
                        var2_3 = S4.a.a;
                        var4_4.o = this;
                        var4_4.p = var1_1;
                        var4_4.t = 1;
                        var5_6 = var2_3.c(var4_4);
                        if (var5_6 == var7_7) {
                            return var7_7;
                        }
                        var2_3 = this;
                    }
                    var5_6 = (Map)var5_6;
                    if (!var5_6.isEmpty()) break block17;
                    var1_1 = "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.";
                    break block13;
                }
                var6_9 = ((Iterable)var5_6.values()).iterator();
                while (var6_9.hasNext()) {
                    ((S4.b)var6_9.next()).b(new b.b(var1_1.b()));
                }
                var6_9 = (Iterable)var5_6.values();
                if (!(var6_9 instanceof Collection) || !((Collection)var6_9).isEmpty()) {
                    var6_9 = var6_9.iterator();
                    while (var6_9.hasNext()) {
                        if (!((S4.b)var6_9.next()).c()) continue;
                        Log.d((String)"FirebaseSessions", (String)"Data Collection is enabled for at least one Subscriber");
                        var6_9 = var2_3.c;
                        var4_4.o = var2_3;
                        var4_4.p = var1_1;
                        var4_4.q = var5_6;
                        var4_4.t = 2;
                        if (var6_9.g(var4_4) == var7_7) {
                            return var7_7;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                }
                break block18;
lbl-1000: // 3 sources:
                {
                    if (!var2_3.c.d()) {
                        var1_1 = "Sessions SDK disabled. Events will not be sent.";
                        break block13;
                    }
                    if (!var2_3.e.c()) {
                        var1_1 = "Sessions SDK has dropped this session due to sampling.";
                        break block13;
                    }
                    try {
                        var1_1 = r.a.c(var2_3.a, (p)var1_1, var2_3.c, (Map)var5_6);
                        var2_3 = var2_3.g;
                        var4_4.o = null;
                        var4_4.p = null;
                        var4_4.q = null;
                        var4_4.t = 3;
                        var1_1 = var2_3.a((q)var1_1, var4_4);
                        if (var1_1 != var7_7) return t.a;
                        return var7_7;
                    }
                    catch (IllegalStateException var1_2) {}
                    Log.w((String)"FirebaseSessions", (String)"FirebaseApp is not initialized. Sessions library will not collect session data.", (Throwable)var1_2);
                    return t.a;
                }
            }
            var1_1 = "Data Collection is disabled for all subscribers. Skipping this Session Event";
        }
        Log.d((String)"FirebaseSessions", (String)var1_1);
        return t.a;
    }

    public final void e(S4.b b8) {
        Intrinsics.checkNotNullParameter(b8, "subscriber");
        S4.a.a.e(b8);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Registering Sessions SDK subscriber with name: ");
        stringBuilder.append((Object)b8.a());
        stringBuilder.append(", data collection enabled: ");
        stringBuilder.append(b8.c());
        Log.d((String)"FirebaseSessions", (String)stringBuilder.toString());
        if (this.e.e()) {
            b8.b(new b.b(this.e.d().b()));
        }
    }

    public final boolean f() {
        if (Math.random() <= this.c.b()) {
            return true;
        }
        return false;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }
    }

}

