/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package T4;

import T4.b;
import T4.c;
import T4.d;
import T4.h;
import V5.o;
import V5.t;
import X5.g;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.v;
import o6.a;
import s4.i;

public final class f {
    public static final a c = new a(null);
    public static final i6.a d = R.a.b("firebase_session_settings", null, null, null, 14, null);
    public final h a;
    public final h b;

    public f(h h8, h h9) {
        Intrinsics.checkNotNullParameter(h8, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(h9, "remoteSettings");
        this.a = h8;
        this.b = h9;
    }

    public f(Context context, g g8, g g9, i i8, R4.b b8) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        Intrinsics.checkNotNullParameter(g8, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(g9, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(i8, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(b8, "appInfo");
        this(new b(context), new c(g9, i8, b8, new d(b8, g8, null, 4, null), c.b(context)));
    }

    public final double b() {
        double d8;
        Double d9 = this.a.b();
        if (d9 != null && this.e(d8 = d9.doubleValue())) {
            return d8;
        }
        d9 = this.b.b();
        if (d9 != null && this.e(d8 = d9.doubleValue())) {
            return d8;
        }
        return 1.0;
    }

    public final long c() {
        long l8;
        Object object = this.a.d();
        if (object != null && this.f(l8 = object.a0())) {
            return l8;
        }
        object = this.b.d();
        if (object != null && this.f(l8 = object.a0())) {
            return l8;
        }
        object = o6.a.p;
        return o6.c.o(30, o6.d.t);
    }

    public final boolean d() {
        Boolean bl = this.a.a();
        if (bl != null) {
            return bl;
        }
        bl = this.b.a();
        if (bl != null) {
            return bl;
        }
        return true;
    }

    public final boolean e(double d8) {
        boolean bl;
        boolean bl2 = bl = false;
        if (0.0 <= d8) {
            bl2 = bl;
            if (d8 <= 1.0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final boolean f(long l8) {
        if (o6.a.U(l8) && o6.a.H(l8)) {
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final Object g(X5.d var1_1) {
        if (!(var1_1 instanceof )) ** GOTO lbl-1000
        var3_2 = var1_1;
        var2_3 = var3_2.r;
        if ((var2_3 & Integer.MIN_VALUE) != 0) {
            var3_2.r = var2_3 + Integer.MIN_VALUE;
            var1_1 = var3_2;
        } else lbl-1000: // 2 sources:
        {
            var1_1 = new Z5.d(var1_1){
                public Object o;
                public /* synthetic */ Object p;
                public int r;

                @Override
                public final Object invokeSuspend(Object object) {
                    this.p = object;
                    this.r |= Integer.MIN_VALUE;
                    return this.g(this);
                }
            };
        }
        var5_4 = var1_1.p;
        var4_5 = Y5.b.c();
        var2_3 = var1_1.r;
        if (var2_3 != 0) {
            if (var2_3 != 1) {
                if (var2_3 != 2) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                o.b(var5_4);
                return t.a;
            }
            var3_2 = (f)var1_1.o;
            o.b(var5_4);
        } else {
            o.b(var5_4);
            var3_2 = this.a;
            var1_1.o = this;
            var1_1.r = 1;
            if (var3_2.c(var1_1) == var4_5) {
                return var4_5;
            }
            var3_2 = this;
        }
        var3_2 = var3_2.b;
        var1_1.o = null;
        var1_1.r = 2;
        if (var3_2.c(var1_1) != var4_5) return t.a;
        return var4_5;
    }

    public static final class a {
        public static final /* synthetic */ m6.h[] a;

        static {
            a = new m6.h[]{v.e(new q(a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
        }

        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }

        public final P.f b(Context context) {
            return (P.f)d.a((Object)context, a[0]);
        }
    }

}

