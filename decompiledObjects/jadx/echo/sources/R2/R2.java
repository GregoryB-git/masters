package R2;

import A2.AbstractC0328n;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0883d0;
import com.google.android.gms.internal.measurement.C0891e;
import com.google.android.gms.internal.measurement.C0979n6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import x2.AbstractC2200n;
import x2.C2201o;

/* loaded from: classes.dex */
public final class R2 extends Q1 {

    /* renamed from: b, reason: collision with root package name */
    public final D5 f4983b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f4984c;

    /* renamed from: d, reason: collision with root package name */
    public String f4985d;

    public R2(D5 d52) {
        this(d52, null);
    }

    @Override // R2.R1
    public final void D0(W5 w52) {
        AbstractC0328n.e(w52.f5115o);
        a1(w52.f5115o, false);
        v(new RunnableC0473a3(this, w52));
    }

    @Override // R2.R1
    public final List F(W5 w52, Bundle bundle) {
        c1(w52, false);
        AbstractC0328n.i(w52.f5115o);
        try {
            return (List) this.f4983b.e().w(new CallableC0543k3(this, w52, bundle)).get();
        } catch (InterruptedException | ExecutionException e7) {
            this.f4983b.j().G().c("Failed to get trigger URIs. appId", Y1.v(w52.f5115o), e7);
            return Collections.emptyList();
        }
    }

    @Override // R2.R1
    public final String G(W5 w52) {
        c1(w52, false);
        return this.f4983b.R(w52);
    }

    @Override // R2.R1
    public final void I0(long j7, String str, String str2, String str3) {
        v(new V2(this, str2, str3, str, j7));
    }

    @Override // R2.R1
    public final List K0(String str, String str2, String str3) {
        a1(str, true);
        try {
            return (List) this.f4983b.e().w(new CallableC0480b3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e7) {
            this.f4983b.j().G().b("Failed to get conditional user properties as", e7);
            return Collections.emptyList();
        }
    }

    @Override // R2.R1
    public final List L0(W5 w52, boolean z7) {
        c1(w52, false);
        String str = w52.f5115o;
        AbstractC0328n.i(str);
        try {
            List<T5> list = (List) this.f4983b.e().w(new CallableC0536j3(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (T5 t52 : list) {
                if (!z7 && S5.H0(t52.f5047c)) {
                }
                arrayList.add(new R5(t52));
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f4983b.j().G().c("Failed to get user properties. appId", Y1.v(w52.f5115o), e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            this.f4983b.j().G().c("Failed to get user properties. appId", Y1.v(w52.f5115o), e);
            return null;
        }
    }

    @Override // R2.R1
    public final byte[] M0(I i7, String str) {
        AbstractC0328n.e(str);
        AbstractC0328n.i(i7);
        a1(str, true);
        this.f4983b.j().F().b("Log and bundle. event", this.f4983b.f0().c(i7.f4704o));
        long c7 = this.f4983b.b().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f4983b.e().B(new CallableC0522h3(this, i7, str)).get();
            if (bArr == null) {
                this.f4983b.j().G().b("Log and bundle returned null. appId", Y1.v(str));
                bArr = new byte[0];
            }
            this.f4983b.j().F().d("Log and bundle processed. event, size, time_ms", this.f4983b.f0().c(i7.f4704o), Integer.valueOf(bArr.length), Long.valueOf((this.f4983b.b().c() / 1000000) - c7));
            return bArr;
        } catch (InterruptedException e7) {
            e = e7;
            this.f4983b.j().G().d("Failed to log and bundle. appId, event, error", Y1.v(str), this.f4983b.f0().c(i7.f4704o), e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            this.f4983b.j().G().d("Failed to log and bundle. appId, event, error", Y1.v(str), this.f4983b.f0().c(i7.f4704o), e);
            return null;
        }
    }

    @Override // R2.R1
    public final void N(W5 w52) {
        c1(w52, false);
        v(new T2(this, w52));
    }

    @Override // R2.R1
    public final void O0(final Bundle bundle, W5 w52) {
        c1(w52, false);
        final String str = w52.f5115o;
        AbstractC0328n.i(str);
        v(new Runnable() { // from class: R2.Q2
            @Override // java.lang.Runnable
            public final void run() {
                R2.this.Z0(str, bundle);
            }
        });
    }

    @Override // R2.R1
    public final C0560n P0(W5 w52) {
        c1(w52, false);
        AbstractC0328n.e(w52.f5115o);
        if (!C0979n6.a()) {
            return new C0560n(null);
        }
        try {
            return (C0560n) this.f4983b.e().B(new CallableC0487c3(this, w52)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            this.f4983b.j().G().c("Failed to get consent. appId", Y1.v(w52.f5115o), e7);
            return new C0560n(null);
        }
    }

    @Override // R2.R1
    public final void R0(I i7, W5 w52) {
        AbstractC0328n.i(i7);
        c1(w52, false);
        v(new RunnableC0508f3(this, i7, w52));
    }

    @Override // R2.R1
    public final void S0(I i7, String str, String str2) {
        AbstractC0328n.i(i7);
        AbstractC0328n.e(str);
        a1(str, true);
        v(new RunnableC0501e3(this, i7, str));
    }

    @Override // R2.R1
    public final void U0(W5 w52) {
        AbstractC0328n.e(w52.f5115o);
        AbstractC0328n.i(w52.f5106J);
        RunnableC0494d3 runnableC0494d3 = new RunnableC0494d3(this, w52);
        AbstractC0328n.i(runnableC0494d3);
        if (this.f4983b.e().J()) {
            runnableC0494d3.run();
        } else {
            this.f4983b.e().G(runnableC0494d3);
        }
    }

    @Override // R2.R1
    public final List V0(String str, String str2, W5 w52) {
        c1(w52, false);
        String str3 = w52.f5115o;
        AbstractC0328n.i(str3);
        try {
            return (List) this.f4983b.e().w(new Y2(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e7) {
            this.f4983b.j().G().b("Failed to get conditional user properties", e7);
            return Collections.emptyList();
        }
    }

    @Override // R2.R1
    public final List W(String str, String str2, String str3, boolean z7) {
        a1(str, true);
        try {
            List<T5> list = (List) this.f4983b.e().w(new Z2(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (T5 t52 : list) {
                if (!z7 && S5.H0(t52.f5047c)) {
                }
                arrayList.add(new R5(t52));
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f4983b.j().G().c("Failed to get user properties as. appId", Y1.v(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e8) {
            e = e8;
            this.f4983b.j().G().c("Failed to get user properties as. appId", Y1.v(str), e);
            return Collections.emptyList();
        }
    }

    @Override // R2.R1
    public final void Z(R5 r52, W5 w52) {
        AbstractC0328n.i(r52);
        c1(w52, false);
        v(new RunnableC0515g3(this, r52, w52));
    }

    public final /* synthetic */ void Z0(String str, Bundle bundle) {
        this.f4983b.e0().i0(str, bundle);
    }

    public final void a1(String str, boolean z7) {
        boolean z8;
        if (TextUtils.isEmpty(str)) {
            this.f4983b.j().G().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z7) {
            try {
                if (this.f4984c == null) {
                    if (!"com.google.android.gms".equals(this.f4985d) && !E2.o.a(this.f4983b.a(), Binder.getCallingUid()) && !C2201o.a(this.f4983b.a()).c(Binder.getCallingUid())) {
                        z8 = false;
                        this.f4984c = Boolean.valueOf(z8);
                    }
                    z8 = true;
                    this.f4984c = Boolean.valueOf(z8);
                }
                if (this.f4984c.booleanValue()) {
                    return;
                }
            } catch (SecurityException e7) {
                this.f4983b.j().G().b("Measurement Service called with invalid calling package. appId", Y1.v(str));
                throw e7;
            }
        }
        if (this.f4985d == null && AbstractC2200n.i(this.f4983b.a(), Binder.getCallingUid(), str)) {
            this.f4985d = str;
        }
        if (str.equals(this.f4985d)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    public final I b1(I i7, W5 w52) {
        D d7;
        if ("_cmp".equals(i7.f4704o) && (d7 = i7.f4705p) != null && d7.a() != 0) {
            String q7 = i7.f4705p.q("_cis");
            if ("referrer broadcast".equals(q7) || "referrer API".equals(q7)) {
                this.f4983b.j().J().b("Event has been filtered ", i7.toString());
                return new I("_cmpx", i7.f4705p, i7.f4706q, i7.f4707r);
            }
        }
        return i7;
    }

    @Override // R2.R1
    public final void c0(W5 w52) {
        c1(w52, false);
        v(new S2(this, w52));
    }

    public final void c1(W5 w52, boolean z7) {
        AbstractC0328n.i(w52);
        AbstractC0328n.e(w52.f5115o);
        a1(w52.f5115o, false);
        this.f4983b.n0().j0(w52.f5116p, w52.f5101E);
    }

    public final void d1(I i7, W5 w52) {
        if (!this.f4983b.h0().W(w52.f5115o)) {
            e1(i7, w52);
            return;
        }
        this.f4983b.j().K().b("EES config found for", w52.f5115o);
        C0632x2 h02 = this.f4983b.h0();
        String str = w52.f5115o;
        com.google.android.gms.internal.measurement.C c7 = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.C) h02.f5594j.c(str);
        if (c7 == null) {
            this.f4983b.j().K().b("EES not loaded for", w52.f5115o);
        } else {
            try {
                Map O6 = this.f4983b.m0().O(i7.f4705p.g(), true);
                String a7 = AbstractC0591r3.a(i7.f4704o);
                if (a7 == null) {
                    a7 = i7.f4704o;
                }
                if (c7.d(new C0891e(a7, i7.f4707r, O6))) {
                    if (c7.g()) {
                        this.f4983b.j().K().b("EES edited event", i7.f4704o);
                        i7 = this.f4983b.m0().B(c7.a().d());
                    }
                    e1(i7, w52);
                    if (c7.f()) {
                        for (C0891e c0891e : c7.a().f()) {
                            this.f4983b.j().K().b("EES logging created event", c0891e.e());
                            e1(this.f4983b.m0().B(c0891e), w52);
                        }
                        return;
                    }
                    return;
                }
            } catch (C0883d0 unused) {
                this.f4983b.j().G().c("EES error. appId, eventName", w52.f5116p, i7.f4704o);
            }
            this.f4983b.j().K().b("EES was not applied to event", i7.f4704o);
        }
        e1(i7, w52);
    }

    public final void e1(I i7, W5 w52) {
        this.f4983b.o0();
        this.f4983b.q(i7, w52);
    }

    @Override // R2.R1
    public final void m0(C0497e c0497e, W5 w52) {
        AbstractC0328n.i(c0497e);
        AbstractC0328n.i(c0497e.f5265q);
        c1(w52, false);
        C0497e c0497e2 = new C0497e(c0497e);
        c0497e2.f5263o = w52.f5115o;
        v(new U2(this, c0497e2, w52));
    }

    @Override // R2.R1
    public final void n0(C0497e c0497e) {
        AbstractC0328n.i(c0497e);
        AbstractC0328n.i(c0497e.f5265q);
        AbstractC0328n.e(c0497e.f5263o);
        a1(c0497e.f5263o, true);
        v(new X2(this, new C0497e(c0497e)));
    }

    public final void v(Runnable runnable) {
        AbstractC0328n.i(runnable);
        if (this.f4983b.e().J()) {
            runnable.run();
        } else {
            this.f4983b.e().D(runnable);
        }
    }

    @Override // R2.R1
    public final List x0(String str, String str2, boolean z7, W5 w52) {
        c1(w52, false);
        String str3 = w52.f5115o;
        AbstractC0328n.i(str3);
        try {
            List<T5> list = (List) this.f4983b.e().w(new W2(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (T5 t52 : list) {
                if (!z7 && S5.H0(t52.f5047c)) {
                }
                arrayList.add(new R5(t52));
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f4983b.j().G().c("Failed to query user properties. appId", Y1.v(w52.f5115o), e);
            return Collections.emptyList();
        } catch (ExecutionException e8) {
            e = e8;
            this.f4983b.j().G().c("Failed to query user properties. appId", Y1.v(w52.f5115o), e);
            return Collections.emptyList();
        }
    }

    public R2(D5 d52, String str) {
        AbstractC0328n.i(d52);
        this.f4983b = d52;
        this.f4985d = null;
    }
}
