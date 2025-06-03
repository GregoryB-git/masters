package R2;

import A2.AbstractC0328n;
import R2.C0585q3;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0883d0;
import com.google.android.gms.internal.measurement.C0950k4;
import com.google.android.gms.internal.measurement.C0993p2;
import com.google.android.gms.internal.measurement.C1002q2;
import com.google.android.gms.internal.measurement.C1058w5;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.L1;
import com.google.android.gms.internal.measurement.P7;
import com.google.android.gms.internal.measurement.T7;
import com.google.android.gms.internal.measurement.V7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import t.C1958a;

/* renamed from: R2.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632x2 extends C5 implements InterfaceC0525i {

    /* renamed from: d, reason: collision with root package name */
    public final Map f5588d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f5589e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f5590f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f5591g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f5592h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f5593i;

    /* renamed from: j, reason: collision with root package name */
    public final t.g f5594j;

    /* renamed from: k, reason: collision with root package name */
    public final T7 f5595k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f5596l;

    /* renamed from: m, reason: collision with root package name */
    public final Map f5597m;

    /* renamed from: n, reason: collision with root package name */
    public final Map f5598n;

    public C0632x2(D5 d52) {
        super(d52);
        this.f5588d = new C1958a();
        this.f5589e = new C1958a();
        this.f5590f = new C1958a();
        this.f5591g = new C1958a();
        this.f5592h = new C1958a();
        this.f5596l = new C1958a();
        this.f5597m = new C1958a();
        this.f5598n = new C1958a();
        this.f5593i = new C1958a();
        this.f5594j = new D2(this, 20);
        this.f5595k = new C2(this);
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.C B(C0632x2 c0632x2, String str) {
        c0632x2.u();
        AbstractC0328n.e(str);
        if (!c0632x2.W(str)) {
            return null;
        }
        if (!c0632x2.f5592h.containsKey(str) || c0632x2.f5592h.get(str) == null) {
            c0632x2.g0(str);
        } else {
            c0632x2.G(str, (com.google.android.gms.internal.measurement.L1) c0632x2.f5592h.get(str));
        }
        return (com.google.android.gms.internal.measurement.C) c0632x2.f5594j.h().get(str);
    }

    public static Map E(com.google.android.gms.internal.measurement.L1 l12) {
        C1958a c1958a = new C1958a();
        if (l12 != null) {
            for (com.google.android.gms.internal.measurement.O1 o12 : l12.X()) {
                c1958a.put(o12.H(), o12.I());
            }
        }
        return c1958a;
    }

    public static C0585q3.a z(I1.e eVar) {
        int i7 = E2.f4656b[eVar.ordinal()];
        if (i7 == 1) {
            return C0585q3.a.AD_STORAGE;
        }
        if (i7 == 2) {
            return C0585q3.a.ANALYTICS_STORAGE;
        }
        if (i7 == 3) {
            return C0585q3.a.AD_USER_DATA;
        }
        if (i7 != 4) {
            return null;
        }
        return C0585q3.a.AD_PERSONALIZATION;
    }

    public final C0585q3.a A(String str, C0585q3.a aVar) {
        n();
        g0(str);
        com.google.android.gms.internal.measurement.I1 J6 = J(str);
        if (J6 == null) {
            return null;
        }
        for (I1.c cVar : J6.K()) {
            if (aVar == z(cVar.I())) {
                return z(cVar.H());
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.measurement.L1 C(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.L1.P();
        }
        try {
            com.google.android.gms.internal.measurement.L1 l12 = (com.google.android.gms.internal.measurement.L1) ((com.google.android.gms.internal.measurement.Y3) ((L1.a) N5.H(com.google.android.gms.internal.measurement.L1.N(), bArr)).p());
            j().K().c("Parsed config. version, gmp_app_id", l12.b0() ? Long.valueOf(l12.L()) : null, l12.a0() ? l12.Q() : null);
            return l12;
        } catch (C0950k4 e7) {
            e = e7;
            j().L().c("Unable to merge remote config. appId", Y1.v(str), e);
            return com.google.android.gms.internal.measurement.L1.P();
        } catch (RuntimeException e8) {
            e = e8;
            j().L().c("Unable to merge remote config. appId", Y1.v(str), e);
            return com.google.android.gms.internal.measurement.L1.P();
        }
    }

    public final void F(String str, L1.a aVar) {
        HashSet hashSet = new HashSet();
        C1958a c1958a = new C1958a();
        C1958a c1958a2 = new C1958a();
        C1958a c1958a3 = new C1958a();
        if (aVar != null) {
            Iterator it = aVar.C().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.google.android.gms.internal.measurement.J1) it.next()).H());
            }
            for (int i7 = 0; i7 < aVar.w(); i7++) {
                K1.a aVar2 = (K1.a) aVar.x(i7).x();
                if (aVar2.y().isEmpty()) {
                    j().L().a("EventConfig contained null event name");
                } else {
                    String y7 = aVar2.y();
                    String b7 = AbstractC0591r3.b(aVar2.y());
                    if (!TextUtils.isEmpty(b7)) {
                        aVar2 = aVar2.x(b7);
                        aVar.y(i7, aVar2);
                    }
                    if (aVar2.B() && aVar2.z()) {
                        c1958a.put(y7, Boolean.TRUE);
                    }
                    if (aVar2.C() && aVar2.A()) {
                        c1958a2.put(aVar2.y(), Boolean.TRUE);
                    }
                    if (aVar2.D()) {
                        if (aVar2.w() < 2 || aVar2.w() > 65535) {
                            j().L().c("Invalid sampling rate. Event name, sample rate", aVar2.y(), Integer.valueOf(aVar2.w()));
                        } else {
                            c1958a3.put(aVar2.y(), Integer.valueOf(aVar2.w()));
                        }
                    }
                }
            }
        }
        this.f5589e.put(str, hashSet);
        this.f5590f.put(str, c1958a);
        this.f5591g.put(str, c1958a2);
        this.f5593i.put(str, c1958a3);
    }

    public final void G(final String str, com.google.android.gms.internal.measurement.L1 l12) {
        if (l12.k() == 0) {
            this.f5594j.e(str);
            return;
        }
        j().K().b("EES programs found", Integer.valueOf(l12.k()));
        C1002q2 c1002q2 = (C1002q2) l12.W().get(0);
        try {
            com.google.android.gms.internal.measurement.C c7 = new com.google.android.gms.internal.measurement.C();
            c7.c("internal.remoteConfig", new Callable() { // from class: R2.y2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new C1058w5("internal.remoteConfig", new F2(C0632x2.this, str));
                }
            });
            c7.c("internal.appMetadata", new Callable() { // from class: R2.B2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C0632x2 c0632x2 = C0632x2.this;
                    final String str2 = str;
                    return new V7("internal.appMetadata", new Callable() { // from class: R2.z2
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C0632x2 c0632x22 = C0632x2.this;
                            String str3 = str2;
                            I2 D02 = c0632x22.q().D0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            hashMap.put("gmp_version", 82001L);
                            if (D02 != null) {
                                String h7 = D02.h();
                                if (h7 != null) {
                                    hashMap.put("app_version", h7);
                                }
                                hashMap.put("app_version_int", Long.valueOf(D02.z()));
                                hashMap.put("dynamite_version", Long.valueOf(D02.c0()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            c7.c("internal.logger", new Callable() { // from class: R2.A2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new P7(C0632x2.this.f5595k);
                }
            });
            c7.b(c1002q2);
            this.f5594j.d(str, c7);
            j().K().c("EES program loaded for appId, activities", str, Integer.valueOf(c1002q2.G().k()));
            Iterator it = c1002q2.G().I().iterator();
            while (it.hasNext()) {
                j().K().b("EES program activity", ((C0993p2) it.next()).H());
            }
        } catch (C0883d0 unused) {
            j().G().b("Failed to load EES program. appId", str);
        }
    }

    public final boolean H(String str, byte[] bArr, String str2, String str3) {
        u();
        n();
        AbstractC0328n.e(str);
        L1.a aVar = (L1.a) C(str, bArr).x();
        if (aVar == null) {
            return false;
        }
        F(str, aVar);
        G(str, (com.google.android.gms.internal.measurement.L1) ((com.google.android.gms.internal.measurement.Y3) aVar.p()));
        this.f5592h.put(str, (com.google.android.gms.internal.measurement.L1) ((com.google.android.gms.internal.measurement.Y3) aVar.p()));
        this.f5596l.put(str, aVar.A());
        this.f5597m.put(str, str2);
        this.f5598n.put(str, str3);
        this.f5588d.put(str, E((com.google.android.gms.internal.measurement.L1) ((com.google.android.gms.internal.measurement.Y3) aVar.p())));
        q().Z(str, new ArrayList(aVar.B()));
        try {
            aVar.z();
            bArr = ((com.google.android.gms.internal.measurement.L1) ((com.google.android.gms.internal.measurement.Y3) aVar.p())).h();
        } catch (RuntimeException e7) {
            j().L().c("Unable to serialize reduced-size config. Storing full config instead. appId", Y1.v(str), e7);
        }
        C0574p q7 = q();
        AbstractC0328n.e(str);
        q7.n();
        q7.u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (q7.B().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                q7.j().G().b("Failed to update remote config (got 0). appId", Y1.v(str));
            }
        } catch (SQLiteException e8) {
            q7.j().G().c("Error storing remote config. appId", Y1.v(str), e8);
        }
        this.f5592h.put(str, (com.google.android.gms.internal.measurement.L1) ((com.google.android.gms.internal.measurement.Y3) aVar.p()));
        return true;
    }

    public final int I(String str, String str2) {
        Integer num;
        n();
        g0(str);
        Map map = (Map) this.f5593i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final com.google.android.gms.internal.measurement.I1 J(String str) {
        n();
        g0(str);
        com.google.android.gms.internal.measurement.L1 L6 = L(str);
        if (L6 == null || !L6.Z()) {
            return null;
        }
        return L6.M();
    }

    public final boolean K(String str, C0585q3.a aVar) {
        n();
        g0(str);
        com.google.android.gms.internal.measurement.I1 J6 = J(str);
        if (J6 == null) {
            return false;
        }
        Iterator it = J6.J().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            I1.b bVar = (I1.b) it.next();
            if (aVar == z(bVar.I())) {
                if (bVar.H() == I1.d.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.L1 L(String str) {
        u();
        n();
        AbstractC0328n.e(str);
        g0(str);
        return (com.google.android.gms.internal.measurement.L1) this.f5592h.get(str);
    }

    public final boolean M(String str, String str2) {
        Boolean bool;
        n();
        g0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f5591g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String N(String str) {
        n();
        return (String) this.f5598n.get(str);
    }

    public final boolean O(String str, String str2) {
        Boolean bool;
        n();
        g0(str);
        if (X(str) && S5.H0(str2)) {
            return true;
        }
        if (Z(str) && S5.J0(str2)) {
            return true;
        }
        Map map = (Map) this.f5590f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String P(String str) {
        n();
        return (String) this.f5597m.get(str);
    }

    public final String Q(String str) {
        n();
        g0(str);
        return (String) this.f5596l.get(str);
    }

    public final Set R(String str) {
        n();
        g0(str);
        return (Set) this.f5589e.get(str);
    }

    public final SortedSet S(String str) {
        n();
        g0(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.I1 J6 = J(str);
        if (J6 == null) {
            return treeSet;
        }
        Iterator it = J6.I().iterator();
        while (it.hasNext()) {
            treeSet.add(((I1.f) it.next()).H());
        }
        return treeSet;
    }

    public final void T(String str) {
        n();
        this.f5597m.put(str, null);
    }

    public final void U(String str) {
        n();
        this.f5592h.remove(str);
    }

    public final boolean V(String str) {
        n();
        com.google.android.gms.internal.measurement.L1 L6 = L(str);
        if (L6 == null) {
            return false;
        }
        return L6.Y();
    }

    public final boolean W(String str) {
        com.google.android.gms.internal.measurement.L1 l12;
        return (TextUtils.isEmpty(str) || (l12 = (com.google.android.gms.internal.measurement.L1) this.f5592h.get(str)) == null || l12.k() == 0) ? false : true;
    }

    public final boolean X(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean Y(String str) {
        n();
        g0(str);
        com.google.android.gms.internal.measurement.I1 J6 = J(str);
        return J6 == null || !J6.M() || J6.L();
    }

    public final boolean Z(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_public"));
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final boolean a0(String str) {
        n();
        g0(str);
        return this.f5589e.get(str) != null && ((Set) this.f5589e.get(str)).contains("app_instance_id");
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    public final boolean b0(String str) {
        n();
        g0(str);
        if (this.f5589e.get(str) != null) {
            return ((Set) this.f5589e.get(str)).contains("device_model") || ((Set) this.f5589e.get(str)).contains("device_info");
        }
        return false;
    }

    @Override // R2.InterfaceC0525i
    public final String c(String str, String str2) {
        n();
        g0(str);
        Map map = (Map) this.f5588d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final boolean c0(String str) {
        n();
        g0(str);
        return this.f5589e.get(str) != null && ((Set) this.f5589e.get(str)).contains("enhanced_user_id");
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ C0504f d() {
        return super.d();
    }

    public final boolean d0(String str) {
        n();
        g0(str);
        return this.f5589e.get(str) != null && ((Set) this.f5589e.get(str)).contains("google_signals");
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ G2 e() {
        return super.e();
    }

    public final boolean e0(String str) {
        n();
        g0(str);
        if (this.f5589e.get(str) != null) {
            return ((Set) this.f5589e.get(str)).contains("os_version") || ((Set) this.f5589e.get(str)).contains("device_info");
        }
        return false;
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0511g f() {
        return super.f();
    }

    public final boolean f0(String str) {
        n();
        g0(str);
        return this.f5589e.get(str) != null && ((Set) this.f5589e.get(str)).contains("user_id");
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C g() {
        return super.g();
    }

    public final void g0(String str) {
        u();
        n();
        AbstractC0328n.e(str);
        if (this.f5592h.get(str) == null) {
            r E02 = q().E0(str);
            if (E02 != null) {
                L1.a aVar = (L1.a) C(str, E02.f5502a).x();
                F(str, aVar);
                this.f5588d.put(str, E((com.google.android.gms.internal.measurement.L1) ((com.google.android.gms.internal.measurement.Y3) aVar.p())));
                this.f5592h.put(str, (com.google.android.gms.internal.measurement.L1) ((com.google.android.gms.internal.measurement.Y3) aVar.p()));
                G(str, (com.google.android.gms.internal.measurement.L1) ((com.google.android.gms.internal.measurement.Y3) aVar.p()));
                this.f5596l.put(str, aVar.A());
                this.f5597m.put(str, E02.f5503b);
                this.f5598n.put(str, E02.f5504c);
                return;
            }
            this.f5588d.put(str, null);
            this.f5590f.put(str, null);
            this.f5589e.put(str, null);
            this.f5591g.put(str, null);
            this.f5592h.put(str, null);
            this.f5596l.put(str, null);
            this.f5597m.put(str, null);
            this.f5598n.put(str, null);
            this.f5593i.put(str, null);
        }
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

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ N5 o() {
        return super.o();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ b6 p() {
        return super.p();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0574p q() {
        return super.q();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0632x2 r() {
        return super.r();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0517g5 s() {
        return super.s();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ B5 t() {
        return super.t();
    }

    @Override // R2.C5
    public final boolean x() {
        return false;
    }

    public final long y(String str) {
        String c7 = c(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(c7)) {
            return 0L;
        }
        try {
            return Long.parseLong(c7);
        } catch (NumberFormatException e7) {
            j().L().c("Unable to parse timezone offset. appId", Y1.v(str), e7);
            return 0L;
        }
    }
}
