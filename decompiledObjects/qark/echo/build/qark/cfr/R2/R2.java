/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Binder
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Future
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package R2;

import E2.o;
import R2.D;
import R2.D5;
import R2.G2;
import R2.I;
import R2.N5;
import R2.Q1;
import R2.Q2;
import R2.R5;
import R2.S2;
import R2.S5;
import R2.T2;
import R2.T5;
import R2.U2;
import R2.V2;
import R2.W2;
import R2.W5;
import R2.X1;
import R2.X2;
import R2.Y1;
import R2.Y2;
import R2.Z2;
import R2.a2;
import R2.a3;
import R2.b3;
import R2.c3;
import R2.d3;
import R2.e;
import R2.e3;
import R2.f3;
import R2.g3;
import R2.h3;
import R2.j3;
import R2.k3;
import R2.n;
import R2.p;
import R2.r3;
import R2.x2;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.n6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t.g;

public final class R2
extends Q1 {
    public final D5 b;
    public Boolean c;
    public String d;

    public R2(D5 d52) {
        this(d52, null);
    }

    public R2(D5 d52, String string2) {
        A2.n.i(d52);
        this.b = d52;
        this.d = null;
    }

    @Override
    public final void D0(W5 w52) {
        A2.n.e(w52.o);
        this.a1(w52.o, false);
        this.v(new a3(this, w52));
    }

    @Override
    public final List F(W5 w52, Bundle bundle) {
        void var2_5;
        this.c1(w52, false);
        A2.n.i(w52.o);
        bundle = this.b.e().w(new k3(this, w52, bundle));
        try {
            bundle = (List)bundle.get();
            return bundle;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.b.j().G().c("Failed to get trigger URIs. appId", Y1.v(w52.o), var2_5);
        return Collections.emptyList();
    }

    @Override
    public final String G(W5 w52) {
        this.c1(w52, false);
        return this.b.R(w52);
    }

    @Override
    public final void I0(long l8, String string2, String string3, String string4) {
        this.v(new V2(this, string3, string4, string2, l8));
    }

    @Override
    public final List K0(String string2, String string3, String string4) {
        void var1_4;
        this.a1(string2, true);
        string2 = this.b.e().w(new b3(this, string2, string3, string4));
        try {
            string2 = (List)string2.get();
            return string2;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.b.j().G().b("Failed to get conditional user properties as", var1_4);
        return Collections.emptyList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final List L0(W5 w52, boolean bl) {
        void var3_4;
        this.c1(w52, false);
        String string2 = w52.o;
        A2.n.i(string2);
        string2 = this.b.e().w(new j3(this, string2));
        try {
            List list = (List)string2.get();
            string2 = new ArrayList(list.size());
            list = list.iterator();
            do {
                if (!list.hasNext()) {
                    return string2;
                }
                T5 t52 = (T5)list.next();
                if (!bl && S5.H0(t52.c)) continue;
                string2.add((Object)new R5(t52));
            } while (true);
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {}
        this.b.j().G().c("Failed to get user properties. appId", Y1.v(w52.o), var3_4);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final byte[] M0(I i8, String string2) {
        void var7_5;
        A2.n.e(string2);
        A2.n.i(i8);
        this.a1(string2, true);
        this.b.j().F().b("Log and bundle. event", this.b.f0().c(i8.o));
        long l8 = this.b.b().c() / 1000000L;
        byte[] arrby = this.b.e().B(new h3(this, i8, string2));
        try {
            byte[] arrby2;
            arrby = arrby2 = (byte[])arrby.get();
            if (arrby2 == null) {
                this.b.j().G().b("Log and bundle returned null. appId", Y1.v(string2));
                arrby = new byte[]{};
            }
            long l9 = this.b.b().c() / 1000000L;
            this.b.j().F().d("Log and bundle processed. event, size, time_ms", this.b.f0().c(i8.o), arrby.length, l9 - l8);
            return arrby;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {}
        this.b.j().G().d("Failed to log and bundle. appId, event, error", Y1.v(string2), this.b.f0().c(i8.o), var7_5);
        return null;
    }

    @Override
    public final void N(W5 w52) {
        this.c1(w52, false);
        this.v(new T2(this, w52));
    }

    @Override
    public final void O0(Bundle bundle, W5 object) {
        this.c1((W5)object, false);
        object = object.o;
        A2.n.i(object);
        this.v(new Q2(this, (String)object, bundle));
    }

    @Override
    public final n P0(W5 w52) {
        this.c1(w52, false);
        A2.n.e(w52.o);
        if (n6.a()) {
            void var2_6;
            Object object = this.b.e().B(new c3(this, w52));
            try {
                object = (n)object.get(10000L, TimeUnit.MILLISECONDS);
                return object;
            }
            catch (ExecutionException executionException) {
            }
            catch (InterruptedException interruptedException) {
            }
            catch (TimeoutException timeoutException) {
                // empty catch block
            }
            this.b.j().G().c("Failed to get consent. appId", Y1.v(w52.o), var2_6);
            return new n(null);
        }
        return new n(null);
    }

    @Override
    public final void R0(I i8, W5 w52) {
        A2.n.i(i8);
        this.c1(w52, false);
        this.v(new f3(this, i8, w52));
    }

    @Override
    public final void S0(I i8, String string2, String string3) {
        A2.n.i(i8);
        A2.n.e(string2);
        this.a1(string2, true);
        this.v(new e3(this, i8, string2));
    }

    @Override
    public final void U0(W5 object) {
        A2.n.e(object.o);
        A2.n.i(object.J);
        object = new d3(this, (W5)object);
        A2.n.i(object);
        if (this.b.e().J()) {
            object.run();
            return;
        }
        this.b.e().G((Runnable)object);
    }

    @Override
    public final List V0(String string2, String string3, W5 object) {
        void var1_4;
        this.c1((W5)object, false);
        object = object.o;
        A2.n.i(object);
        string2 = this.b.e().w(new Y2(this, (String)object, string2, string3));
        try {
            string2 = (List)string2.get();
            return string2;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.b.j().G().b("Failed to get conditional user properties", var1_4);
        return Collections.emptyList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final List W(String string2, String string3, String string4, boolean bl) {
        void var2_3;
        this.a1(string2, true);
        string3 = this.b.e().w(new Z2(this, string2, string3, string4));
        try {
            string4 = (List)string3.get();
            string3 = new ArrayList(string4.size());
            string4 = string4.iterator();
            do {
                if (!string4.hasNext()) {
                    return string3;
                }
                T5 t52 = (T5)string4.next();
                if (!bl && S5.H0(t52.c)) continue;
                string3.add((Object)new R5(t52));
            } while (true);
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {}
        this.b.j().G().c("Failed to get user properties as. appId", Y1.v(string2), var2_3);
        return Collections.emptyList();
    }

    @Override
    public final void Z(R5 r52, W5 w52) {
        A2.n.i(r52);
        this.c1(w52, false);
        this.v(new g3(this, r52, w52));
    }

    public final /* synthetic */ void Z0(String string2, Bundle bundle) {
        this.b.e0().i0(string2, bundle);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void a1(String var1_1, boolean var2_2) {
        block9 : {
            block8 : {
                if (TextUtils.isEmpty((CharSequence)var1_1)) {
                    this.b.j().G().a("Measurement Service called without app package");
                    throw new SecurityException("Measurement Service called without app package");
                }
                if (!var2_2) ** GOTO lbl12
                try {
                    if (this.c == null) {
                        if ("com.google.android.gms".equals((Object)this.d) || o.a(this.b.a(), Binder.getCallingUid()) || x2.o.a(this.b.a()).c(Binder.getCallingUid())) {
                            break block8;
                        }
                    } else lbl-1000: // 2 sources:
                    {
                        do {
                            if (this.c != false) return;
lbl12: // 2 sources:
                            if (this.d == null && x2.n.i(this.b.a(), Binder.getCallingUid(), var1_1)) {
                                this.d = var1_1;
                            }
                            if (!var1_1.equals((Object)this.d)) throw new SecurityException(String.format((String)"Unknown calling package name '%s'.", (Object[])new Object[]{var1_1}));
                            return;
                            break;
                        } while (true);
                    }
                    var2_2 = false;
                    break block9;
                }
                catch (SecurityException var3_3) {}
                this.b.j().G().b("Measurement Service called with invalid calling package. appId", Y1.v(var1_1));
                throw var3_3;
            }
            var2_2 = true;
        }
        this.c = var2_2;
        ** while (true)
    }

    public final I b1(I i8, W5 object) {
        if ("_cmp".equals((Object)i8.o) && (object = i8.p) != null) {
            if (object.a() == 0) {
                return i8;
            }
            object = i8.p.q("_cis");
            if ("referrer broadcast".equals(object) || "referrer API".equals(object)) {
                this.b.j().J().b("Event has been filtered ", i8.toString());
                return new I("_cmpx", i8.p, i8.q, i8.r);
            }
        }
        return i8;
    }

    @Override
    public final void c0(W5 w52) {
        this.c1(w52, false);
        this.v(new S2(this, w52));
    }

    public final void c1(W5 w52, boolean bl) {
        A2.n.i(w52);
        A2.n.e(w52.o);
        this.a1(w52.o, false);
        this.b.n0().j0(w52.p, w52.E);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final void d1(I var1_1, W5 var2_2) {
        if (!this.b.h0().W(var2_2.o)) {
            this.e1(var1_1, var2_2);
            return;
        }
        this.b.j().K().b("EES config found for", var2_2.o);
        var4_3 = this.b.h0();
        var5_5 = var2_2.o;
        var4_3 = TextUtils.isEmpty((CharSequence)var5_5) != false ? null : (C)var4_3.j.c(var5_5);
        if (var4_3 == null) {
            this.b.j().K().b("EES not loaded for", var2_2.o);
lbl10: // 2 sources:
            do {
                this.e1(var1_1, var2_2);
                return;
                break;
            } while (true);
        }
        try {
            var7_6 = this.b.m0().O(var1_1.p.g(), true);
            var6_7 = r3.a(var1_1.o);
            var5_5 = var6_7;
            if (var6_7 == null) {
                var5_5 = var1_1.o;
            }
            if (!(var3_8 = var4_3.d(new com.google.android.gms.internal.measurement.e((String)var5_5, var1_1.r, var7_6)))) ** GOTO lbl33
            var5_5 = var1_1;
        }
        catch (d0 var4_4) {
            ** continue;
        }
        if (var4_3.g()) {
            this.b.j().K().b("EES edited event", var1_1.o);
            var5_5 = this.b.m0().B(var4_3.a().d());
        }
        this.e1((I)var5_5, var2_2);
        if (var4_3.f()) {
            for (Object var4_3 : var4_3.a().f()) {
                this.b.j().K().b("EES logging created event", var4_3.e());
                this.e1(this.b.m0().B((com.google.android.gms.internal.measurement.e)var4_3), var2_2);
            }
        }
        return;
lbl31: // 1 sources:
        do {
            this.b.j().G().c("EES error. appId, eventName", var2_2.p, var1_1.o);
lbl33: // 2 sources:
            this.b.j().K().b("EES was not applied to event", var1_1.o);
            ** continue;
            break;
        } while (true);
    }

    public final void e1(I i8, W5 w52) {
        this.b.o0();
        this.b.q(i8, w52);
    }

    @Override
    public final void m0(e e8, W5 w52) {
        A2.n.i(e8);
        A2.n.i(e8.q);
        this.c1(w52, false);
        e8 = new e(e8);
        e8.o = w52.o;
        this.v(new U2(this, e8, w52));
    }

    @Override
    public final void n0(e e8) {
        A2.n.i(e8);
        A2.n.i(e8.q);
        A2.n.e(e8.o);
        this.a1(e8.o, true);
        this.v(new X2(this, new e(e8)));
    }

    public final void v(Runnable runnable) {
        A2.n.i((Object)runnable);
        if (this.b.e().J()) {
            runnable.run();
            return;
        }
        this.b.e().D(runnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final List x0(String string2, String string3, boolean bl, W5 w52) {
        void var1_2;
        this.c1(w52, false);
        Object object = w52.o;
        A2.n.i(object);
        string2 = this.b.e().w(new W2(this, (String)object, string2, string3));
        try {
            string3 = (List)string2.get();
            string2 = new ArrayList(string3.size());
            string3 = string3.iterator();
            do {
                if (!string3.hasNext()) {
                    return string2;
                }
                object = (T5)string3.next();
                if (!bl && S5.H0(object.c)) continue;
                string2.add((Object)new R5((T5)object));
            } while (true);
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {}
        this.b.j().G().c("Failed to query user properties. appId", Y1.v(w52.o), var1_2);
        return Collections.emptyList();
    }
}

