package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import b8.c;
import b8.c0;
import b8.d0;
import b8.f0;
import b8.h0;
import b8.h1;
import b8.i1;
import b8.j1;
import b8.l1;
import b8.p1;
import b8.r;
import b8.s;
import b8.t0;
import b8.x;
import b8.z;
import c8.i;
import c8.k;
import c8.l;
import c8.m0;
import c8.n;
import c8.n0;
import c8.r0;
import c8.s0;
import c8.t;
import c8.u0;
import c8.y;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzabq;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.internal.p002firebaseauthapi.zzadu;
import com.google.android.gms.internal.p002firebaseauthapi.zzafc;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import com.google.android.gms.internal.p002firebaseauthapi.zzan;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import l6.q0;
import m6.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FirebaseAuth implements c8.b {
    public final Executor A;
    public String B;

    /* renamed from: a, reason: collision with root package name */
    public final u7.f f3057a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f3058b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f3059c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f3060d;

    /* renamed from: e, reason: collision with root package name */
    public final zzabq f3061e;
    public r f;

    /* renamed from: g, reason: collision with root package name */
    public final c8.f f3062g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3063h;

    /* renamed from: i, reason: collision with root package name */
    public String f3064i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3065j;

    /* renamed from: k, reason: collision with root package name */
    public String f3066k;

    /* renamed from: l, reason: collision with root package name */
    public m0 f3067l;

    /* renamed from: m, reason: collision with root package name */
    public final RecaptchaAction f3068m;

    /* renamed from: n, reason: collision with root package name */
    public final RecaptchaAction f3069n;

    /* renamed from: o, reason: collision with root package name */
    public final RecaptchaAction f3070o;

    /* renamed from: p, reason: collision with root package name */
    public final RecaptchaAction f3071p;

    /* renamed from: q, reason: collision with root package name */
    public final RecaptchaAction f3072q;

    /* renamed from: r, reason: collision with root package name */
    public final RecaptchaAction f3073r;

    /* renamed from: s, reason: collision with root package name */
    public final n0 f3074s;
    public final u0 t;

    /* renamed from: u, reason: collision with root package name */
    public final y f3075u;

    /* renamed from: v, reason: collision with root package name */
    public final t9.b<a8.a> f3076v;

    /* renamed from: w, reason: collision with root package name */
    public final t9.b<q9.e> f3077w;

    /* renamed from: x, reason: collision with root package name */
    public r0 f3078x;

    /* renamed from: y, reason: collision with root package name */
    public final Executor f3079y;

    /* renamed from: z, reason: collision with root package name */
    public final Executor f3080z;

    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    public class c implements t, z0 {
        public c() {
        }

        @Override // c8.z0
        public final void a(zzagw zzagwVar, r rVar) {
            j.i(zzagwVar);
            j.i(rVar);
            rVar.L(zzagwVar);
            FirebaseAuth firebaseAuth = FirebaseAuth.this;
            firebaseAuth.getClass();
            FirebaseAuth.n(firebaseAuth, rVar, zzagwVar, true, true);
        }

        @Override // c8.t
        public final void zza(Status status) {
            int i10 = status.f2816a;
            if (i10 == 17011 || i10 == 17021 || i10 == 17005 || i10 == 17091) {
                FirebaseAuth firebaseAuth = FirebaseAuth.this;
                firebaseAuth.s();
                r0 r0Var = firebaseAuth.f3078x;
                if (r0Var != null) {
                    c8.r rVar = r0Var.f2515b;
                    rVar.f2513e.removeCallbacks(rVar.f);
                }
            }
        }
    }

    public class d implements z0 {
        public d() {
        }

        @Override // c8.z0
        public final void a(zzagw zzagwVar, r rVar) {
            j.i(zzagwVar);
            j.i(rVar);
            rVar.L(zzagwVar);
            FirebaseAuth firebaseAuth = FirebaseAuth.this;
            firebaseAuth.getClass();
            FirebaseAuth.n(firebaseAuth, rVar, zzagwVar, true, false);
        }
    }

    public FirebaseAuth() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0193, code lost:
    
        if (r0.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK") == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FirebaseAuth(u7.f r8, t9.b r9, t9.b r10, java.util.concurrent.Executor r11, java.util.concurrent.Executor r12, java.util.concurrent.ScheduledExecutorService r13, java.util.concurrent.Executor r14) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(u7.f, t9.b, t9.b, java.util.concurrent.Executor, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.Executor):void");
    }

    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) u7.f.e().c(FirebaseAuth.class);
    }

    public static FirebaseAuth getInstance(u7.f fVar) {
        return (FirebaseAuth) fVar.c(FirebaseAuth.class);
    }

    public static void l(d0 d0Var) {
        String str;
        String str2;
        z zVar = d0Var.f2075h;
        if (!(zVar != null)) {
            FirebaseAuth firebaseAuth = d0Var.f2069a;
            String str3 = d0Var.f2073e;
            j.e(str3);
            if ((d0Var.f2074g != null) || !zzafc.zza(str3, d0Var.f2071c, d0Var.f, d0Var.f2072d)) {
                firebaseAuth.f3075u.a(firebaseAuth, str3, d0Var.f, firebaseAuth.t(), d0Var.f2077j, d0Var.f2078k, firebaseAuth.f3071p).addOnCompleteListener(new h1(firebaseAuth, d0Var, str3));
                return;
            }
            return;
        }
        FirebaseAuth firebaseAuth2 = d0Var.f2069a;
        j.i(zVar);
        n nVar = (n) zVar;
        if (nVar.f2490a != null) {
            String str4 = d0Var.f2073e;
            j.e(str4);
            str = str4;
            str2 = str;
        } else {
            h0 h0Var = d0Var.f2076i;
            j.i(h0Var);
            String str5 = h0Var.f2085a;
            j.e(str5);
            str = h0Var.f2088d;
            str2 = str5;
        }
        if (d0Var.f2074g == null || !zzafc.zza(str2, d0Var.f2071c, d0Var.f, d0Var.f2072d)) {
            firebaseAuth2.f3075u.a(firebaseAuth2, str, d0Var.f, firebaseAuth2.t(), d0Var.f2077j, d0Var.f2078k, nVar.f2490a != null ? firebaseAuth2.f3072q : firebaseAuth2.f3073r).addOnCompleteListener(new j1(firebaseAuth2, d0Var, str2));
        }
    }

    public static void m(FirebaseAuth firebaseAuth, r rVar) {
        String str;
        if (rVar != null) {
            str = "Notifying auth state listeners about user ( " + rVar.a() + " ).";
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.A.execute(new g(firebaseAuth));
    }

    public static void n(FirebaseAuth firebaseAuth, r rVar, zzagw zzagwVar, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        String str;
        j.i(rVar);
        j.i(zzagwVar);
        boolean z15 = firebaseAuth.f != null && rVar.a().equals(firebaseAuth.f.a());
        if (z15 || !z11) {
            r rVar2 = firebaseAuth.f;
            if (rVar2 == null) {
                z13 = true;
                z12 = true;
            } else {
                z12 = !z15 || (rVar2.O().zzc().equals(zzagwVar.zzc()) ^ true);
                z13 = !z15;
            }
            if (firebaseAuth.f == null || !rVar.a().equals(firebaseAuth.a())) {
                firebaseAuth.f = rVar;
            } else {
                firebaseAuth.f.J(rVar.F());
                if (!rVar.H()) {
                    firebaseAuth.f.M();
                }
                ArrayList b10 = rVar.E().b();
                List<t0> Q = rVar.Q();
                firebaseAuth.f.P(b10);
                firebaseAuth.f.N(Q);
            }
            if (z10) {
                n0 n0Var = firebaseAuth.f3074s;
                r rVar3 = firebaseAuth.f;
                n0Var.getClass();
                j.i(rVar3);
                JSONObject jSONObject = new JSONObject();
                if (i.class.isAssignableFrom(rVar3.getClass())) {
                    i iVar = (i) rVar3;
                    try {
                        jSONObject.put("cachedTokenState", iVar.zze());
                        u7.f K = iVar.K();
                        K.a();
                        jSONObject.put("applicationName", K.f15085b);
                        jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                        if (iVar.f2457e != null) {
                            JSONArray jSONArray = new JSONArray();
                            List<c8.e> list = iVar.f2457e;
                            int size = list.size();
                            if (list.size() > 30) {
                                n0Var.f2498d.f("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(list.size()));
                                size = 30;
                            }
                            boolean z16 = false;
                            for (int i10 = 0; i10 < size; i10++) {
                                c8.e eVar = list.get(i10);
                                if (eVar.f2431b.equals("firebase")) {
                                    z16 = true;
                                }
                                if (i10 == size - 1 && !z16) {
                                    break;
                                }
                                jSONArray.put(eVar.E());
                            }
                            if (!z16) {
                                int i11 = size - 1;
                                while (true) {
                                    if (i11 >= list.size() || i11 < 0) {
                                        break;
                                    }
                                    c8.e eVar2 = list.get(i11);
                                    if (eVar2.f2431b.equals("firebase")) {
                                        jSONArray.put(eVar2.E());
                                        z16 = true;
                                        break;
                                    } else {
                                        if (i11 == list.size() - 1) {
                                            jSONArray.put(eVar2.E());
                                        }
                                        i11++;
                                    }
                                }
                                if (!z16) {
                                    n0Var.f2498d.f("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(list.size()), Integer.valueOf(size));
                                    if (list.size() < 5) {
                                        StringBuilder sb2 = new StringBuilder("Provider user info list:\n");
                                        Iterator<c8.e> it = list.iterator();
                                        while (it.hasNext()) {
                                            sb2.append(String.format("Provider - %s\n", it.next().f2431b));
                                        }
                                        n0Var.f2498d.f(sb2.toString(), new Object[0]);
                                    }
                                }
                            }
                            jSONObject.put("userInfos", jSONArray);
                        }
                        jSONObject.put("anonymous", iVar.H());
                        jSONObject.put("version", "2");
                        k kVar = iVar.f2460q;
                        if (kVar != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("lastSignInTimestamp", kVar.f2472a);
                                jSONObject2.put("creationTimestamp", kVar.f2473b);
                            } catch (JSONException unused) {
                            }
                            jSONObject.put("userMetadata", jSONObject2);
                        }
                        ArrayList b11 = new l(iVar).b();
                        if (!b11.isEmpty()) {
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i12 = 0; i12 < b11.size(); i12++) {
                                jSONArray2.put(((x) b11.get(i12)).F());
                            }
                            jSONObject.put("userMultiFactorInfo", jSONArray2);
                        }
                        List<t0> list2 = iVar.f2463u;
                        if (list2 != null && !list2.isEmpty()) {
                            JSONArray jSONArray3 = new JSONArray();
                            for (int i13 = 0; i13 < list2.size(); i13++) {
                                t0 t0Var = list2.get(i13);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("credentialId", t0Var.f2140a);
                                jSONObject3.put("name", t0Var.f2141b);
                                jSONObject3.put("displayName", t0Var.f2142c);
                                jSONArray3.put(jSONObject3);
                            }
                            jSONObject.put("passkeyInfo", jSONArray3);
                        }
                        str = jSONObject.toString();
                    } catch (Exception e10) {
                        p6.a aVar = n0Var.f2498d;
                        Log.wtf(aVar.f13015a, aVar.d("Failed to turn object into JSON", new Object[0]), e10);
                        throw new zzzp(e10);
                    }
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    n0Var.f2497c.edit().putString("com.google.firebase.auth.FIREBASE_USER", str).apply();
                }
            }
            if (z12) {
                r rVar4 = firebaseAuth.f;
                if (rVar4 != null) {
                    rVar4.L(zzagwVar);
                }
                q(firebaseAuth, firebaseAuth.f);
            }
            if (z13) {
                m(firebaseAuth, firebaseAuth.f);
            }
            if (z10) {
                n0 n0Var2 = firebaseAuth.f3074s;
                n0Var2.getClass();
                z14 = false;
                n0Var2.f2497c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", rVar.a()), zzagwVar.zzf()).apply();
            } else {
                z14 = false;
            }
            r rVar5 = firebaseAuth.f;
            if (rVar5 != null) {
                if (firebaseAuth.f3078x == null) {
                    u7.f fVar = firebaseAuth.f3057a;
                    j.i(fVar);
                    firebaseAuth.f3078x = new r0(fVar);
                }
                r0 r0Var = firebaseAuth.f3078x;
                zzagw O = rVar5.O();
                r0Var.getClass();
                if (O == null) {
                    return;
                }
                long zza = O.zza();
                if (zza <= 0) {
                    zza = 3600;
                }
                long zzb = (zza * 1000) + O.zzb();
                c8.r rVar6 = r0Var.f2515b;
                rVar6.f2509a = zzb;
                rVar6.f2510b = -1L;
                if ((r0Var.f2514a <= 0 || r0Var.f2516c) ? z14 : true) {
                    r0Var.f2515b.a();
                }
            }
        }
    }

    public static void o(u7.h hVar, d0 d0Var, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        d0Var.f2072d.execute(new q0(zzafc.zza(str, d0Var.f2071c, null), hVar, 7));
    }

    public static void q(FirebaseAuth firebaseAuth, r rVar) {
        String str;
        if (rVar != null) {
            str = "Notifying id token listeners about user ( " + rVar.a() + " ).";
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.A.execute(new h(firebaseAuth, new y9.b(rVar != null ? rVar.zzd() : null)));
    }

    @Override // c8.b
    public final String a() {
        r rVar = this.f;
        if (rVar == null) {
            return null;
        }
        return rVar.a();
    }

    @Override // c8.b
    public final void b(c8.a aVar) {
        r0 r0Var;
        j.i(aVar);
        this.f3059c.add(aVar);
        synchronized (this) {
            if (this.f3078x == null) {
                u7.f fVar = this.f3057a;
                j.i(fVar);
                this.f3078x = new r0(fVar);
            }
            r0Var = this.f3078x;
        }
        r0Var.a(this.f3059c.size());
    }

    @Override // c8.b
    public final void c(e9.c cVar) {
        r0 r0Var;
        j.i(cVar);
        this.f3059c.remove(cVar);
        synchronized (this) {
            if (this.f3078x == null) {
                u7.f fVar = this.f3057a;
                j.i(fVar);
                this.f3078x = new r0(fVar);
            }
            r0Var = this.f3078x;
        }
        r0Var.a(this.f3059c.size());
    }

    @Override // c8.b
    public final Task<s> d(boolean z10) {
        return j(this.f, z10);
    }

    public final Task<Void> e(String str, b8.c cVar) {
        j.e(str);
        if (cVar == null) {
            cVar = new b8.c(new c.a());
        }
        String str2 = this.f3064i;
        if (str2 != null) {
            cVar.f2043p = str2;
        }
        cVar.f2044q = 1;
        return new l1(this, str, cVar).a(this, this.f3066k, this.f3068m);
    }

    public final void f(String str) {
        j.e(str);
        if (str.startsWith("chrome-extension://")) {
            this.B = str;
            return;
        }
        try {
            String host = new URI(str.contains("://") ? str : defpackage.f.j("http://", str)).getHost();
            j.i(host);
            this.B = host;
        } catch (URISyntaxException e10) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e10.getMessage());
            }
            this.B = str;
        }
    }

    public final Task<b8.g> g(b8.f fVar) {
        b8.d dVar;
        b8.f F = fVar.F();
        if (!(F instanceof b8.h)) {
            if (F instanceof c0) {
                return this.f3061e.zza(this.f3057a, (c0) F, this.f3066k, (z0) new d());
            }
            return this.f3061e.zza(this.f3057a, F, this.f3066k, new d());
        }
        b8.h hVar = (b8.h) F;
        if (!(!TextUtils.isEmpty(hVar.f2082c))) {
            String str = hVar.f2080a;
            String str2 = hVar.f2081b;
            j.i(str2);
            return k(str, str2, this.f3066k, null, false);
        }
        String str3 = hVar.f2082c;
        j.e(str3);
        zzan<String, Integer> zzanVar = b8.d.f2065d;
        j.e(str3);
        try {
            dVar = new b8.d(str3);
        } catch (IllegalArgumentException unused) {
            dVar = null;
        }
        if ((dVar == null || TextUtils.equals(this.f3066k, dVar.f2068c)) ? false : true) {
            return Tasks.forException(zzadr.zza(new Status(17072, null, null, null)));
        }
        return new com.google.firebase.auth.a(this, false, null, hVar).a(this, this.f3066k, this.f3068m);
    }

    public final f0 h(f0 f0Var, String str) {
        c8.f fVar = this.f3062g;
        String str2 = fVar.f2440a;
        return ((str2 != null && fVar.f2441b != null) && str != null && str.equals(str2)) ? new i1(this, f0Var) : f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [c8.s0, com.google.firebase.auth.FirebaseAuth$c] */
    public final Task<b8.g> i(r rVar, b8.f fVar) {
        j.i(rVar);
        return fVar instanceof b8.h ? new com.google.firebase.auth.d(this, rVar, (b8.h) fVar.F()).a(this, rVar.G(), this.f3070o) : this.f3061e.zza(this.f3057a, rVar, fVar.F(), (String) null, (s0) new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [b8.p1, c8.s0] */
    public final Task<s> j(r rVar, boolean z10) {
        if (rVar == null) {
            return Tasks.forException(zzadr.zza(new Status(17495, null, null, null)));
        }
        zzagw O = rVar.O();
        return (!O.zzg() || z10) ? this.f3061e.zza(this.f3057a, rVar, O.zzd(), (s0) new p1(this)) : Tasks.forResult(c8.d0.a(O.zzc()));
    }

    public final Task<b8.g> k(String str, String str2, String str3, r rVar, boolean z10) {
        return new com.google.firebase.auth.b(this, str, z10, rVar, str2, str3).a(this, str3, this.f3069n);
    }

    public final synchronized m0 p() {
        return this.f3067l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [c8.s0, com.google.firebase.auth.FirebaseAuth$c] */
    /* JADX WARN: Type inference failed for: r9v0, types: [c8.s0, com.google.firebase.auth.FirebaseAuth$c] */
    public final Task<b8.g> r(r rVar, b8.f fVar) {
        b8.d dVar;
        j.i(rVar);
        b8.f F = fVar.F();
        if (!(F instanceof b8.h)) {
            return F instanceof c0 ? this.f3061e.zzb(this.f3057a, rVar, (c0) F, this.f3066k, (s0) new c()) : this.f3061e.zzc(this.f3057a, rVar, F, rVar.G(), new c());
        }
        b8.h hVar = (b8.h) F;
        if ("password".equals(hVar.E())) {
            String str = hVar.f2080a;
            String str2 = hVar.f2081b;
            j.e(str2);
            return k(str, str2, rVar.G(), rVar, true);
        }
        String str3 = hVar.f2082c;
        j.e(str3);
        zzan<String, Integer> zzanVar = b8.d.f2065d;
        j.e(str3);
        try {
            dVar = new b8.d(str3);
        } catch (IllegalArgumentException unused) {
            dVar = null;
        }
        if ((dVar == null || TextUtils.equals(this.f3066k, dVar.f2068c)) ? false : true) {
            return Tasks.forException(zzadr.zza(new Status(17072, null, null, null)));
        }
        return new com.google.firebase.auth.a(this, true, rVar, hVar).a(this, this.f3066k, this.f3068m);
    }

    public final void s() {
        j.i(this.f3074s);
        r rVar = this.f;
        if (rVar != null) {
            this.f3074s.f2497c.edit().remove(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", rVar.a())).apply();
            this.f = null;
        }
        this.f3074s.f2497c.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        q(this, null);
        m(this, null);
    }

    public final boolean t() {
        u7.f fVar = this.f3057a;
        fVar.a();
        return zzadu.zza(fVar.f15084a);
    }
}
