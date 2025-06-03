package com.google.firebase.firestore;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.g;
import d9.e0;
import d9.k0;
import d9.l0;
import d9.q;
import d9.s;
import d9.x;
import d9.y0;
import g9.f0;
import g9.u;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import j9.o;
import java.util.ArrayList;
import m9.v;
import m9.z;
import n9.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x3.t;

/* loaded from: classes.dex */
public class FirebaseFirestore {

    /* renamed from: a, reason: collision with root package name */
    public final n9.i<g, g9.f> f3129a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3130b;

    /* renamed from: c, reason: collision with root package name */
    public final j9.f f3131c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3132d;

    /* renamed from: e, reason: collision with root package name */
    public final e9.a f3133e;
    public final e9.a f;

    /* renamed from: g, reason: collision with root package name */
    public final u7.f f3134g;

    /* renamed from: h, reason: collision with root package name */
    public final y0 f3135h;

    /* renamed from: i, reason: collision with root package name */
    public final a f3136i;

    /* renamed from: j, reason: collision with root package name */
    public g f3137j;

    /* renamed from: k, reason: collision with root package name */
    public final x f3138k;

    /* renamed from: l, reason: collision with root package name */
    public final z f3139l;

    /* renamed from: m, reason: collision with root package name */
    public k0 f3140m;

    public interface a {
    }

    public FirebaseFirestore(Context context, j9.f fVar, String str, e9.d dVar, e9.b bVar, defpackage.f fVar2, u7.f fVar3, h hVar, z zVar) {
        context.getClass();
        this.f3130b = context;
        this.f3131c = fVar;
        this.f3135h = new y0(fVar);
        str.getClass();
        this.f3132d = str;
        this.f3133e = dVar;
        this.f = bVar;
        this.f3129a = fVar2;
        this.f3138k = new x(new defpackage.e(this, 2));
        this.f3134g = fVar3;
        this.f3136i = hVar;
        this.f3139l = zVar;
        this.f3137j = new g.a().a();
    }

    public static FirebaseFirestore e(u7.f fVar, String str) {
        FirebaseFirestore firebaseFirestore;
        if (str == null) {
            throw new NullPointerException("Provided database name must not be null.");
        }
        h hVar = (h) fVar.c(h.class);
        x6.b.B(hVar, "Firestore component is not present.");
        synchronized (hVar) {
            firebaseFirestore = (FirebaseFirestore) hVar.f3184a.get(str);
            if (firebaseFirestore == null) {
                firebaseFirestore = f(hVar.f3186c, hVar.f3185b, hVar.f3187d, hVar.f3188e, str, hVar, hVar.f);
                hVar.f3184a.put(str, firebaseFirestore);
            }
        }
        return firebaseFirestore;
    }

    public static FirebaseFirestore f(Context context, u7.f fVar, t9.a aVar, t9.a aVar2, String str, h hVar, z zVar) {
        fVar.a();
        String str2 = fVar.f15086c.f15101g;
        if (str2 == null) {
            throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
        }
        j9.f fVar2 = new j9.f(str2, str);
        e9.d dVar = new e9.d(aVar);
        e9.b bVar = new e9.b(aVar2);
        fVar.a();
        return new FirebaseFirestore(context, fVar2, fVar.f15085b, dVar, bVar, new defpackage.f(), fVar, hVar, zVar);
    }

    public static void setClientLanguage(String str) {
        v.f10892j = str;
    }

    public final <T> T a(n9.i<u, T> iVar) {
        return (T) this.f3138k.a(iVar);
    }

    public final Task<Void> b() {
        Object apply;
        boolean z10;
        x xVar = this.f3138k;
        s sVar = new s(this, 0);
        int i10 = 1;
        q qVar = new q(i10);
        synchronized (xVar) {
            t tVar = new t(xVar, i10);
            u uVar = xVar.f3734b;
            if (uVar != null) {
                a.b bVar = uVar.f6090d.f11322a;
                synchronized (bVar) {
                    z10 = bVar.f11329b;
                }
                if (!z10) {
                    apply = qVar.apply(tVar);
                }
            }
            apply = sVar.apply(tVar);
        }
        return (Task) apply;
    }

    public final i c(String str) {
        if (str == null) {
            throw new NullPointerException("Provided collection ID must not be null.");
        }
        if (str.contains(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            throw new IllegalArgumentException(String.format("Invalid collectionId '%s'. Collection IDs must not contain '/'.", str));
        }
        this.f3138k.b();
        return new i(new f0(o.f8700b, str), this);
    }

    public final c d(String str) {
        if (str == null) {
            throw new NullPointerException("Provided document path must not be null.");
        }
        this.f3138k.b();
        o t = o.t(str);
        if (t.q() % 2 == 0) {
            return new c(new j9.i(t), this);
        }
        StringBuilder l10 = defpackage.f.l("Invalid document reference. Document references must have an even number of segments, but ");
        l10.append(t.h());
        l10.append(" has ");
        l10.append(t.q());
        throw new IllegalArgumentException(l10.toString());
    }

    public final void g(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("Provided settings must not be null.");
        }
        synchronized (this.f3131c) {
            if ((this.f3138k.f3734b != null) && !this.f3137j.equals(gVar)) {
                throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
            }
            this.f3137j = gVar;
        }
    }

    @Deprecated
    public final Task<Void> h(String str) {
        this.f3138k.b();
        g gVar = this.f3137j;
        e0 e0Var = gVar.f3178e;
        if (!(e0Var != null ? e0Var instanceof l0 : gVar.f3176c)) {
            throw new IllegalStateException("Cannot enable indexes when persistence is disabled");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = 1;
            if (jSONObject.has("indexes")) {
                JSONArray jSONArray = jSONObject.getJSONArray("indexes");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    String string = jSONObject2.getString("collectionGroup");
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray optJSONArray = jSONObject2.optJSONArray("fields");
                    for (int i12 = 0; optJSONArray != null && i12 < optJSONArray.length(); i12++) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i12);
                        j9.l t = j9.l.t(jSONObject3.getString("fieldPath"));
                        arrayList2.add("CONTAINS".equals(jSONObject3.optString("arrayConfig")) ? new j9.d(t, 3) : "ASCENDING".equals(jSONObject3.optString("order")) ? new j9.d(t, 1) : new j9.d(t, 2));
                    }
                    arrayList.add(new j9.a(-1, string, arrayList2, j9.k.f8687a));
                }
            }
            return (Task) this.f3138k.a(new s(arrayList, i10));
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Failed to parse index configuration", e10);
        }
    }

    public final Task<Void> i() {
        Task<Void> c10;
        a aVar = this.f3136i;
        String str = this.f3131c.f8679b;
        h hVar = (h) aVar;
        synchronized (hVar) {
            hVar.f3184a.remove(str);
        }
        x xVar = this.f3138k;
        synchronized (xVar) {
            xVar.b();
            c10 = xVar.f3734b.c();
            xVar.f3735c.f11322a.f11328a.setCorePoolSize(0);
        }
        return c10;
    }

    public final void j(c cVar) {
        if (cVar.f3147b != this) {
            throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
        }
    }
}
