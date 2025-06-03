package c8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends b8.r {
    public static final Parcelable.Creator<i> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public zzagw f2453a;

    /* renamed from: b, reason: collision with root package name */
    public e f2454b;

    /* renamed from: c, reason: collision with root package name */
    public String f2455c;

    /* renamed from: d, reason: collision with root package name */
    public String f2456d;

    /* renamed from: e, reason: collision with root package name */
    public List<e> f2457e;
    public List<String> f;

    /* renamed from: o, reason: collision with root package name */
    public String f2458o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f2459p;

    /* renamed from: q, reason: collision with root package name */
    public k f2460q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2461r;

    /* renamed from: s, reason: collision with root package name */
    public b8.c1 f2462s;
    public e0 t;

    /* renamed from: u, reason: collision with root package name */
    public List<b8.t0> f2463u;

    public i(zzagw zzagwVar, e eVar, String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, Boolean bool, k kVar, boolean z10, b8.c1 c1Var, e0 e0Var, ArrayList arrayList3) {
        this.f2453a = zzagwVar;
        this.f2454b = eVar;
        this.f2455c = str;
        this.f2456d = str2;
        this.f2457e = arrayList;
        this.f = arrayList2;
        this.f2458o = str3;
        this.f2459p = bool;
        this.f2460q = kVar;
        this.f2461r = z10;
        this.f2462s = c1Var;
        this.t = e0Var;
        this.f2463u = arrayList3;
    }

    public i(u7.f fVar, ArrayList arrayList) {
        m6.j.i(fVar);
        fVar.a();
        this.f2455c = fVar.f15085b;
        this.f2456d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f2458o = "2";
        J(arrayList);
    }

    @Override // b8.r, b8.o0
    public final String A() {
        return this.f2454b.f;
    }

    @Override // b8.r
    public final k D() {
        return this.f2460q;
    }

    @Override // b8.r
    public final /* synthetic */ l E() {
        return new l(this);
    }

    @Override // b8.r
    public final List<? extends b8.o0> F() {
        return this.f2457e;
    }

    @Override // b8.r
    public final String G() {
        Map map;
        zzagw zzagwVar = this.f2453a;
        if (zzagwVar == null || zzagwVar.zzc() == null || (map = (Map) d0.a(this.f2453a.zzc()).f2138b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // b8.r
    public final boolean H() {
        String str;
        Boolean bool = this.f2459p;
        if (bool == null || bool.booleanValue()) {
            zzagw zzagwVar = this.f2453a;
            if (zzagwVar != null) {
                Map map = (Map) d0.a(zzagwVar.zzc()).f2138b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z10 = true;
            if (this.f2457e.size() > 1 || (str != null && str.equals("custom"))) {
                z10 = false;
            }
            this.f2459p = Boolean.valueOf(z10);
        }
        return this.f2459p.booleanValue();
    }

    @Override // b8.r
    public final synchronized i J(List list) {
        m6.j.i(list);
        this.f2457e = new ArrayList(list.size());
        this.f = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            b8.o0 o0Var = (b8.o0) list.get(i10);
            if (o0Var.q().equals("firebase")) {
                this.f2454b = (e) o0Var;
            } else {
                this.f.add(o0Var.q());
            }
            this.f2457e.add((e) o0Var);
        }
        if (this.f2454b == null) {
            this.f2454b = this.f2457e.get(0);
        }
        return this;
    }

    @Override // b8.r
    public final u7.f K() {
        return u7.f.f(this.f2455c);
    }

    @Override // b8.r
    public final void L(zzagw zzagwVar) {
        m6.j.i(zzagwVar);
        this.f2453a = zzagwVar;
    }

    @Override // b8.r
    public final /* synthetic */ i M() {
        this.f2459p = Boolean.FALSE;
        return this;
    }

    @Override // b8.r
    public final void N(List<b8.t0> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f2463u = list;
    }

    @Override // b8.r
    public final zzagw O() {
        return this.f2453a;
    }

    @Override // b8.r
    public final void P(List<b8.x> list) {
        e0 e0Var;
        if (list == null || list.isEmpty()) {
            e0Var = null;
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (b8.x xVar : list) {
                if (xVar instanceof b8.h0) {
                    arrayList.add((b8.h0) xVar);
                } else if (xVar instanceof b8.l0) {
                    arrayList2.add((b8.l0) xVar);
                }
            }
            e0Var = new e0(arrayList, arrayList2);
        }
        this.t = e0Var;
    }

    @Override // b8.r
    public final List<b8.t0> Q() {
        return this.f2463u;
    }

    @Override // b8.r, b8.o0
    public final String a() {
        return this.f2454b.f2430a;
    }

    @Override // b8.r, b8.o0
    public final Uri h() {
        return this.f2454b.h();
    }

    @Override // b8.o0
    public final boolean k() {
        return this.f2454b.f2436p;
    }

    @Override // b8.r, b8.o0
    public final String m() {
        return this.f2454b.f2435o;
    }

    @Override // b8.r, b8.o0
    public final String o() {
        return this.f2454b.f2432c;
    }

    @Override // b8.o0
    public final String q() {
        return this.f2454b.f2431b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 1, this.f2453a, i10, false);
        b.z.E(parcel, 2, this.f2454b, i10, false);
        b.z.F(parcel, 3, this.f2455c, false);
        b.z.F(parcel, 4, this.f2456d, false);
        b.z.I(parcel, 5, this.f2457e, false);
        b.z.G(parcel, 6, this.f);
        b.z.F(parcel, 7, this.f2458o, false);
        b.z.u(parcel, 8, Boolean.valueOf(H()));
        b.z.E(parcel, 9, this.f2460q, i10, false);
        b.z.t(parcel, 10, this.f2461r);
        b.z.E(parcel, 11, this.f2462s, i10, false);
        b.z.E(parcel, 12, this.t, i10, false);
        b.z.I(parcel, 13, this.f2463u, false);
        b.z.L(J, parcel);
    }

    @Override // b8.r
    public final String zzd() {
        return this.f2453a.zzc();
    }

    @Override // b8.r
    public final String zze() {
        return this.f2453a.zzf();
    }

    @Override // b8.r
    public final List<String> zzg() {
        return this.f;
    }
}
