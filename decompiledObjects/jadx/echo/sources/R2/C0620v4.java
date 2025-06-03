package R2;

import A2.AbstractC0328n;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: R2.v4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620v4 extends AbstractC0506f1 {

    /* renamed from: c, reason: collision with root package name */
    public volatile C0627w4 f5553c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C0627w4 f5554d;

    /* renamed from: e, reason: collision with root package name */
    public C0627w4 f5555e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f5556f;

    /* renamed from: g, reason: collision with root package name */
    public Activity f5557g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f5558h;

    /* renamed from: i, reason: collision with root package name */
    public volatile C0627w4 f5559i;

    /* renamed from: j, reason: collision with root package name */
    public C0627w4 f5560j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5561k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f5562l;

    public C0620v4(N2 n22) {
        super(n22);
        this.f5562l = new Object();
        this.f5556f = new ConcurrentHashMap();
    }

    public static /* synthetic */ void H(C0620v4 c0620v4, Bundle bundle, C0627w4 c0627w4, C0627w4 c0627w42, long j7) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        c0620v4.I(c0627w4, c0627w42, j7, true, c0620v4.k().F(null, "screen_view", bundle, null, false));
    }

    @Override // R2.AbstractC0506f1
    public final boolean A() {
        return false;
    }

    public final C0627w4 C(boolean z7) {
        v();
        n();
        if (!z7) {
            return this.f5555e;
        }
        C0627w4 c0627w4 = this.f5555e;
        return c0627w4 != null ? c0627w4 : this.f5560j;
    }

    public final String D(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > f().t(null) ? str2.substring(0, f().t(null)) : str2;
    }

    public final void I(C0627w4 c0627w4, C0627w4 c0627w42, long j7, boolean z7, Bundle bundle) {
        long j8;
        n();
        boolean z8 = false;
        boolean z9 = (c0627w42 != null && c0627w42.f5576c == c0627w4.f5576c && AbstractC0641y4.a(c0627w42.f5575b, c0627w4.f5575b) && AbstractC0641y4.a(c0627w42.f5574a, c0627w4.f5574a)) ? false : true;
        if (z7 && this.f5555e != null) {
            z8 = true;
        }
        if (z9) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            S5.L(c0627w4, bundle2, true);
            if (c0627w42 != null) {
                String str = c0627w42.f5574a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = c0627w42.f5575b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", c0627w42.f5576c);
            }
            if (z8) {
                long a7 = u().f5418f.a(j7);
                if (a7 > 0) {
                    k().P(bundle2, a7);
                }
            }
            if (!f().Q()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = c0627w4.f5578e ? "app" : "auto";
            long a8 = b().a();
            if (c0627w4.f5578e) {
                long j9 = c0627w4.f5579f;
                if (j9 != 0) {
                    j8 = j9;
                    r().U(str3, "_vs", j8, bundle2);
                }
            }
            j8 = a8;
            r().U(str3, "_vs", j8, bundle2);
        }
        if (z8) {
            J(this.f5555e, true, j7);
        }
        this.f5555e = c0627w4;
        if (c0627w4.f5578e) {
            this.f5560j = c0627w4;
        }
        t().G(c0627w4);
    }

    public final void J(C0627w4 c0627w4, boolean z7, long j7) {
        o().v(b().b());
        if (!u().E(c0627w4 != null && c0627w4.f5577d, z7, j7) || c0627w4 == null) {
            return;
        }
        c0627w4.f5577d = false;
    }

    public final void K(Activity activity) {
        synchronized (this.f5562l) {
            try {
                if (activity == this.f5557g) {
                    this.f5557g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f().Q()) {
            this.f5556f.remove(activity);
        }
    }

    public final void L(Activity activity, C0627w4 c0627w4, boolean z7) {
        C0627w4 c0627w42;
        C0627w4 c0627w43 = this.f5553c == null ? this.f5554d : this.f5553c;
        if (c0627w4.f5575b == null) {
            c0627w42 = new C0627w4(c0627w4.f5574a, activity != null ? D(activity.getClass(), "Activity") : null, c0627w4.f5576c, c0627w4.f5578e, c0627w4.f5579f);
        } else {
            c0627w42 = c0627w4;
        }
        this.f5554d = this.f5553c;
        this.f5553c = c0627w42;
        e().D(new A4(this, c0627w42, c0627w43, b().b(), z7));
    }

    public final void M(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!f().Q() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f5556f.put(activity, new C0627w4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void N(Activity activity, String str, String str2) {
        if (!f().Q()) {
            j().M().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C0627w4 c0627w4 = this.f5553c;
        if (c0627w4 == null) {
            j().M().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f5556f.get(activity) == null) {
            j().M().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = D(activity.getClass(), "Activity");
        }
        boolean a7 = AbstractC0641y4.a(c0627w4.f5575b, str2);
        boolean a8 = AbstractC0641y4.a(c0627w4.f5574a, str);
        if (a7 && a8) {
            j().M().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > f().t(null))) {
            j().M().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > f().t(null))) {
            j().M().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        j().K().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C0627w4 c0627w42 = new C0627w4(str, str2, k().P0());
        this.f5556f.put(activity, c0627w42);
        L(activity, c0627w42, true);
    }

    public final void O(Bundle bundle, long j7) {
        String str;
        synchronized (this.f5562l) {
            try {
                if (!this.f5561k) {
                    j().M().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String str2 = null;
                if (bundle != null) {
                    String string = bundle.getString("screen_name");
                    if (string != null && (string.length() <= 0 || string.length() > f().t(null))) {
                        j().M().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString("screen_class");
                    if (string2 != null && (string2.length() <= 0 || string2.length() > f().t(null))) {
                        j().M().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str2 = string2;
                        str = string;
                    }
                } else {
                    str = null;
                }
                if (str2 == null) {
                    Activity activity = this.f5557g;
                    str2 = activity != null ? D(activity.getClass(), "Activity") : "Activity";
                }
                String str3 = str2;
                C0627w4 c0627w4 = this.f5553c;
                if (this.f5558h && c0627w4 != null) {
                    this.f5558h = false;
                    boolean a7 = AbstractC0641y4.a(c0627w4.f5575b, str3);
                    boolean a8 = AbstractC0641y4.a(c0627w4.f5574a, str);
                    if (a7 && a8) {
                        j().M().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                j().K().c("Logging screen view with name, class", str == null ? "null" : str, str3 == null ? "null" : str3);
                C0627w4 c0627w42 = this.f5553c == null ? this.f5554d : this.f5553c;
                C0627w4 c0627w43 = new C0627w4(str, str3, k().P0(), true, j7);
                this.f5553c = c0627w43;
                this.f5554d = c0627w42;
                this.f5559i = c0627w43;
                e().D(new RunnableC0634x4(this, bundle, c0627w43, c0627w42, b().b()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0627w4 P() {
        return this.f5553c;
    }

    public final void Q(Activity activity) {
        synchronized (this.f5562l) {
            this.f5561k = false;
            this.f5558h = true;
        }
        long b7 = b().b();
        if (!f().Q()) {
            this.f5553c = null;
            e().D(new C4(this, b7));
        } else {
            C0627w4 T6 = T(activity);
            this.f5554d = this.f5553c;
            this.f5553c = null;
            e().D(new B4(this, T6, b7));
        }
    }

    public final void R(Activity activity, Bundle bundle) {
        C0627w4 c0627w4;
        if (!f().Q() || bundle == null || (c0627w4 = (C0627w4) this.f5556f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c0627w4.f5576c);
        bundle2.putString("name", c0627w4.f5574a);
        bundle2.putString("referrer_name", c0627w4.f5575b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void S(Activity activity) {
        synchronized (this.f5562l) {
            this.f5561k = true;
            if (activity != this.f5557g) {
                synchronized (this.f5562l) {
                    this.f5557g = activity;
                    this.f5558h = false;
                }
                if (f().Q()) {
                    this.f5559i = null;
                    e().D(new E4(this));
                }
            }
        }
        if (!f().Q()) {
            this.f5553c = this.f5559i;
            e().D(new RunnableC0648z4(this));
        } else {
            L(activity, T(activity), false);
            B o7 = o();
            o7.e().D(new RunnableC0491d0(o7, o7.b().b()));
        }
    }

    public final C0627w4 T(Activity activity) {
        AbstractC0328n.i(activity);
        C0627w4 c0627w4 = (C0627w4) this.f5556f.get(activity);
        if (c0627w4 == null) {
            C0627w4 c0627w42 = new C0627w4(null, D(activity.getClass(), "Activity"), k().P0());
            this.f5556f.put(activity, c0627w42);
            c0627w4 = c0627w42;
        }
        return this.f5559i != null ? this.f5559i : c0627w4;
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ C0504f d() {
        return super.d();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ G2 e() {
        return super.e();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0511g f() {
        return super.f();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C g() {
        return super.g();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ X1 h() {
        return super.h();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0549l2 i() {
        return super.i();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Y1 j() {
        return super.j();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ S5 k() {
        return super.k();
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ B o() {
        return super.o();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ S1 p() {
        return super.p();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ V1 q() {
        return super.q();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C3 r() {
        return super.r();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C0620v4 s() {
        return super.s();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ D4 t() {
        return super.t();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C0552l5 u() {
        return super.u();
    }
}
