/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.net.Uri
 *  android.os.Bundle
 *  androidx.annotation.MainThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 *  com.yandex.metrica.core.api.executors.ICommonExecutor
 *  com.yandex.metrica.coreutils.services.SystemTimeProvider
 *  com.yandex.metrica.coreutils.services.TimeProvider
 *  com.yandex.metrica.impl.ob.A1
 *  com.yandex.metrica.impl.ob.A1$e
 *  com.yandex.metrica.impl.ob.A2
 *  com.yandex.metrica.impl.ob.A3
 *  com.yandex.metrica.impl.ob.A7
 *  com.yandex.metrica.impl.ob.B0
 *  com.yandex.metrica.impl.ob.D3
 *  com.yandex.metrica.impl.ob.E0
 *  com.yandex.metrica.impl.ob.F0
 *  com.yandex.metrica.impl.ob.Gl
 *  com.yandex.metrica.impl.ob.H2
 *  com.yandex.metrica.impl.ob.L1
 *  com.yandex.metrica.impl.ob.M1
 *  com.yandex.metrica.impl.ob.Oc
 *  com.yandex.metrica.impl.ob.Sl
 *  com.yandex.metrica.impl.ob.T6
 *  com.yandex.metrica.impl.ob.X0
 *  com.yandex.metrica.impl.ob.Y8
 *  com.yandex.metrica.impl.ob.Z6
 *  com.yandex.metrica.impl.ob.Zl
 *  com.yandex.metrica.impl.ob.a1
 *  com.yandex.metrica.impl.ob.bh
 *  com.yandex.metrica.impl.ob.c0
 *  com.yandex.metrica.impl.ob.ci
 *  com.yandex.metrica.impl.ob.ci$b
 *  com.yandex.metrica.impl.ob.e2
 *  com.yandex.metrica.impl.ob.g1
 *  com.yandex.metrica.impl.ob.i4
 *  com.yandex.metrica.impl.ob.j4
 *  com.yandex.metrica.impl.ob.j6
 *  com.yandex.metrica.impl.ob.l3
 *  com.yandex.metrica.impl.ob.m3
 *  com.yandex.metrica.impl.ob.o3
 *  com.yandex.metrica.impl.ob.o7
 *  com.yandex.metrica.impl.ob.oc
 *  com.yandex.metrica.impl.ob.p1
 *  com.yandex.metrica.impl.ob.p3
 *  com.yandex.metrica.impl.ob.p4
 *  com.yandex.metrica.impl.ob.p6
 *  com.yandex.metrica.impl.ob.q3
 *  com.yandex.metrica.impl.ob.q7
 *  com.yandex.metrica.impl.ob.r1$a
 *  com.yandex.metrica.impl.ob.rh
 *  com.yandex.metrica.impl.ob.s1
 *  com.yandex.metrica.impl.ob.sa
 *  com.yandex.metrica.impl.ob.t1
 *  com.yandex.metrica.impl.ob.u1
 *  com.yandex.metrica.impl.ob.v1
 *  com.yandex.metrica.impl.ob.w
 *  com.yandex.metrica.impl.ob.w1
 *  com.yandex.metrica.impl.ob.w7
 *  com.yandex.metrica.impl.ob.x1
 *  com.yandex.metrica.impl.ob.x2
 *  com.yandex.metrica.impl.ob.y1
 *  com.yandex.metrica.impl.ob.z3
 *  java.io.File
 *  java.lang.Deprecated
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.A1;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.A3;
import com.yandex.metrica.impl.ob.A7;
import com.yandex.metrica.impl.ob.B0;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.E0;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.H2;
import com.yandex.metrica.impl.ob.L1;
import com.yandex.metrica.impl.ob.M1;
import com.yandex.metrica.impl.ob.Oc;
import com.yandex.metrica.impl.ob.Sl;
import com.yandex.metrica.impl.ob.T6;
import com.yandex.metrica.impl.ob.X0;
import com.yandex.metrica.impl.ob.Y8;
import com.yandex.metrica.impl.ob.Z6;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.a1;
import com.yandex.metrica.impl.ob.bh;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.e2;
import com.yandex.metrica.impl.ob.g1;
import com.yandex.metrica.impl.ob.i4;
import com.yandex.metrica.impl.ob.j4;
import com.yandex.metrica.impl.ob.j6;
import com.yandex.metrica.impl.ob.l3;
import com.yandex.metrica.impl.ob.m3;
import com.yandex.metrica.impl.ob.o3;
import com.yandex.metrica.impl.ob.o7;
import com.yandex.metrica.impl.ob.oc;
import com.yandex.metrica.impl.ob.p1;
import com.yandex.metrica.impl.ob.p3;
import com.yandex.metrica.impl.ob.p4;
import com.yandex.metrica.impl.ob.p6;
import com.yandex.metrica.impl.ob.q3;
import com.yandex.metrica.impl.ob.q7;
import com.yandex.metrica.impl.ob.r1;
import com.yandex.metrica.impl.ob.rh;
import com.yandex.metrica.impl.ob.s1;
import com.yandex.metrica.impl.ob.sa;
import com.yandex.metrica.impl.ob.t1;
import com.yandex.metrica.impl.ob.u1;
import com.yandex.metrica.impl.ob.v1;
import com.yandex.metrica.impl.ob.w;
import com.yandex.metrica.impl.ob.w1;
import com.yandex.metrica.impl.ob.w7;
import com.yandex.metrica.impl.ob.x1;
import com.yandex.metrica.impl.ob.x2;
import com.yandex.metrica.impl.ob.y1;
import com.yandex.metrica.impl.ob.z3;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class r1
implements p1 {
    @NonNull
    private final e2 A;
    @Nullable
    private ci a;
    private boolean b = false;
    @NonNull
    private final Context c;
    @NonNull
    private volatile MetricaService.d d;
    @NonNull
    private final rh e;
    @NonNull
    private X0 f;
    @NonNull
    private final B0 g;
    @NonNull
    private j4 h;
    @NonNull
    private final A1 i;
    @Nullable
    private Oc j;
    @NonNull
    private Y8 k;
    @NonNull
    private L1 l;
    @NonNull
    private final E0 m;
    @NonNull
    private final sa n;
    @NonNull
    private final l3 o;
    @Nullable
    private T6 p;
    @NonNull
    private final j6 q;
    @NonNull
    private final w7 r;
    @NonNull
    private final w s;
    @NonNull
    private final ICommonExecutor t;
    @NonNull
    private final y1 u;
    @NonNull
    private Zl<String> v;
    @NonNull
    private Zl<File> w = new a(this);
    @Nullable
    private Z6<String> x;
    private ICommonExecutor y;
    @NonNull
    private M1 z;

    @MainThread
    public r1(@NonNull Context context, @NonNull MetricaService.d d2) {
        this(context, d2, new p4(context));
    }

    @MainThread
    @VisibleForTesting
    public r1(@NonNull Context context, @NonNull MetricaService.d d2, @NonNull j4 j42, @NonNull A1 a12, @NonNull B0 b0, @NonNull E0 e0, @NonNull sa sa2, @NonNull l3 l32, @NonNull rh rh2, @NonNull w w3, @NonNull j6 j62, @NonNull w7 w72, @NonNull ICommonExecutor iCommonExecutor, @NonNull ICommonExecutor iCommonExecutor2, @NonNull y1 y12, @NonNull e2 e22) {
        this.c = context;
        this.d = d2;
        this.h = j42;
        this.i = a12;
        this.g = b0;
        this.m = e0;
        this.n = sa2;
        this.o = l32;
        this.e = rh2;
        this.s = w3;
        this.t = iCommonExecutor;
        this.y = iCommonExecutor2;
        this.u = y12;
        this.q = j62;
        this.r = w72;
        this.z = new M1((p1)this, context);
        this.A = e22;
    }

    @MainThread
    private r1(@NonNull Context context, @NonNull MetricaService.d d2, @NonNull p4 p42) {
        this(context, d2, new j4(context, p42), new A1(), new B0(), new E0(), new sa(context), l3.a(), new rh(context), F0.g().b(), F0.g().h().c(), w7.a(), F0.g().q().e(), F0.g().q().a(), new y1(), F0.g().n());
    }

    public static /* synthetic */ Context a(r1 r12) {
        return r12.c;
    }

    @WorkerThread
    private void a(@NonNull ci ci2) {
        Oc oc = this.j;
        if (oc != null) {
            oc.a(ci2);
        }
    }

    public static void a(r1 r12, Intent intent) {
        r12.e.a();
        r12.A.a(Gl.f((String)intent.getStringExtra("screen_size")));
    }

    public static void a(r1 r12, ci ci2) {
        r12.a = ci2;
        Oc oc = r12.j;
        if (oc != null) {
            oc.a(ci2);
        }
        r12.f.a(r12.a.t());
        r12.n.a(ci2);
        r12.e.b(ci2);
    }

    public static /* synthetic */ Z6 b(r1 r12) {
        return r12.x;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b(Intent intent, int n2) {
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            Uri uri = intent.getData();
            boolean bl = true;
            boolean bl2 = uri == null;
            if (!bl2 && !z3.a((z3)(intent = new z3((Bundle)(uri = intent.getExtras()))), (Context)this.c)) {
                uri = c0.a((Bundle)uri);
                bl2 = uri.a == null;
                if (a1.c.b() != uri.e) {
                    bl = false;
                }
                if (!(bl | bl2)) {
                    try {
                        L1 l12 = this.l;
                        i4 i42 = i4.a((z3)intent);
                        D3 d3 = new D3((z3)intent);
                        l12.a(i42, (c0)uri, d3);
                    }
                    catch (Throwable throwable) {}
                }
            }
        }
        this.d.a(n2);
    }

    public static void b(r1 r12, ci ci2) {
        r12 = r12.j;
        if (r12 != null) {
            r12.a(ci2);
        }
    }

    public static /* synthetic */ ci c(r1 r12) {
        return r12.a;
    }

    @WorkerThread
    private Integer c(@NonNull Bundle object) {
        object.setClassLoader(A3.class.getClassLoader());
        String string = A3.c;
        string = null;
        try {
            object = (A3)object.getParcelable("PROCESS_CFG_OBJ");
        }
        catch (Throwable throwable) {
            object = null;
        }
        object = object == null ? string : object.g();
        return object;
    }

    public static void d(r1 r12) {
        if (r12.a != null) {
            F0.g().o().a(r12.a);
        }
    }

    public static /* synthetic */ rh e(r1 r12) {
        return r12.e;
    }

    public static void f(r1 r12) {
        r12.e.b();
    }

    @WorkerThread
    public void a() {
        if (!this.b) {
            this.k = F0.g().s();
            this.m.a(this.c);
            F0.g().x();
            Sl.c().d();
            this.j = new Oc(oc.a((Context)this.c), H2.a((Context)this.c), this.k);
            this.a = new ci.b(this.c).a();
            F0.g().t().getClass();
            this.i.b((A1.e)new v1(this));
            this.i.c((A1.e)new w1(this));
            this.i.a((A1.e)new x1(this));
            p3 p32 = p3.a((o3)new t1(this)).a((m3)new s1(this)).a();
            this.o.a((Object)this, q3.class, p32);
            F0.g().r().a(this.c, this.a);
            this.f = new X0(this.k, this.a.t(), (TimeProvider)new SystemTimeProvider(), new x2(), bh.a());
            p32 = this.a;
            if (p32 != null) {
                this.e.b((ci)p32);
            }
            this.a(this.a);
            Zl<File> zl = this.u;
            p32 = this.c;
            j4 j42 = this.h;
            zl.getClass();
            this.l = new L1((Context)p32, j42, F0.g().q().e(), new B0());
            YandexMetrica.getReporter(this.c, "20799a27-fa80-4b36-b2db-0f8141f24180");
            p32 = this.g.a(this.c, "appmetrica_crashes");
            if (p32 != null) {
                j42 = this.u;
                zl = this.w;
                j42.getClass();
                this.p = new T6((File)p32, zl);
                this.t.execute((Runnable)new p6(this.c, (File)p32, this.w));
                this.p.a();
            }
            if (A2.a((int)21)) {
                j42 = this.u;
                p32 = this.l;
                j42.getClass();
                this.x = new o7(new q7((L1)p32));
                this.v = new u1(this);
                if (this.r.b()) {
                    this.x.a();
                    this.y.executeDelayed((Runnable)new A7(), 1L, TimeUnit.MINUTES);
                }
            }
            F0.g().f().a(this.a);
            this.b = true;
        } else {
            Configuration configuration = this.c.getResources().getConfiguration();
            g1.a((Context)this.c).b(configuration);
        }
        if (A2.a((int)21)) {
            this.q.a(this.v);
        }
    }

    @WorkerThread
    public void a(int n2, Bundle bundle) {
        this.z.a(n2, bundle);
    }

    @WorkerThread
    public void a(Intent intent) {
        this.i.a(intent);
    }

    @WorkerThread
    public void a(Intent intent, int n2) {
        this.b(intent, n2);
    }

    @WorkerThread
    public void a(Intent intent, int n2, int n3) {
        this.b(intent, n3);
    }

    @WorkerThread
    public void a(@NonNull Bundle bundle) {
        if ((bundle = this.c(bundle)) != null) {
            this.s.b(bundle.intValue());
        }
    }

    public void a(@NonNull MetricaService.d d2) {
        this.d = d2;
    }

    @WorkerThread
    public void a(@NonNull File file) {
        this.l.a(file);
    }

    @Deprecated
    @WorkerThread
    public void a(String string, int n2, String string2, Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.l.a(new c0(string2, string, n2), bundle);
    }

    @MainThread
    public void b() {
        if (A2.a((int)21)) {
            this.q.b(this.v);
        }
    }

    @WorkerThread
    public void b(Intent object) {
        this.i.b(object);
        if (object != null) {
            String string = object.getAction();
            Uri uri = object.getData();
            object = uri == null ? null : uri.getEncodedAuthority();
            if ("com.yandex.metrica.IMetricaService".equals((Object)string) && uri != null && uri.getPath().equals((Object)"/client")) {
                int n2 = Integer.parseInt((String)uri.getQueryParameter("pid"));
                string = uri.getQueryParameter("psid");
                this.h.a((String)object, n2, string);
                this.s.a(n2);
            }
        }
    }

    @WorkerThread
    public void b(@NonNull Bundle bundle) {
        if ((bundle = this.c(bundle)) != null) {
            this.s.c(bundle.intValue());
        }
    }

    @WorkerThread
    public void c(Intent intent) {
        this.i.c(intent);
    }

    @WorkerThread
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        g1.a((Context)this.c).b(configuration);
    }

    @WorkerThread
    public void reportData(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f.a();
        this.l.a(c0.a((Bundle)bundle), bundle);
    }
}

