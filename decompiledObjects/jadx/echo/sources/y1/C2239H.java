package y1;

import G1.h;
import O1.C0438a;
import O1.P;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: y1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2239H {

    /* renamed from: f, reason: collision with root package name */
    public static final a f21330f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final String f21331g = C2239H.class.getSimpleName();

    /* renamed from: h, reason: collision with root package name */
    public static final int f21332h = 1000;

    /* renamed from: a, reason: collision with root package name */
    public final C0438a f21333a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21334b;

    /* renamed from: c, reason: collision with root package name */
    public List f21335c;

    /* renamed from: d, reason: collision with root package name */
    public final List f21336d;

    /* renamed from: e, reason: collision with root package name */
    public int f21337e;

    /* renamed from: y1.H$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public C2239H(C0438a attributionIdentifiers, String anonymousAppDeviceGUID) {
        Intrinsics.checkNotNullParameter(attributionIdentifiers, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.f21333a = attributionIdentifiers;
        this.f21334b = anonymousAppDeviceGUID;
        this.f21335c = new ArrayList();
        this.f21336d = new ArrayList();
    }

    public final synchronized void a(C2248e event) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (this.f21335c.size() + this.f21336d.size() >= f21332h) {
                this.f21337e++;
            } else {
                this.f21335c.add(event);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final synchronized void b(boolean z7) {
        if (T1.a.d(this)) {
            return;
        }
        if (z7) {
            try {
                this.f21335c.addAll(this.f21336d);
            } catch (Throwable th) {
                T1.a.b(th, this);
                return;
            }
        }
        this.f21336d.clear();
        this.f21337e = 0;
    }

    public final synchronized int c() {
        if (T1.a.d(this)) {
            return 0;
        }
        try {
            return this.f21335c.size();
        } catch (Throwable th) {
            T1.a.b(th, this);
            return 0;
        }
    }

    public final synchronized List d() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            List list = this.f21335c;
            this.f21335c = new ArrayList();
            return list;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final int e(x1.F request, Context applicationContext, boolean z7, boolean z8) {
        if (T1.a.d(this)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            synchronized (this) {
                try {
                    int i7 = this.f21337e;
                    D1.a aVar = D1.a.f1241a;
                    D1.a.d(this.f21335c);
                    this.f21336d.addAll(this.f21335c);
                    this.f21335c.clear();
                    JSONArray jSONArray = new JSONArray();
                    for (C2248e c2248e : this.f21336d) {
                        if (c2248e.g()) {
                            if (!z7 && c2248e.h()) {
                            }
                            jSONArray.put(c2248e.e());
                        } else {
                            P p7 = P.f3756a;
                            P.j0(f21331g, Intrinsics.i("Event with invalid checksum: ", c2248e));
                        }
                    }
                    if (jSONArray.length() == 0) {
                        return 0;
                    }
                    V5.t tVar = V5.t.f6803a;
                    f(request, applicationContext, i7, jSONArray, z8);
                    return jSONArray.length();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            T1.a.b(th2, this);
            return 0;
        }
    }

    public final void f(x1.F f7, Context context, int i7, JSONArray jSONArray, boolean z7) {
        JSONObject jSONObject;
        try {
            if (T1.a.d(this)) {
                return;
            }
            try {
                G1.h hVar = G1.h.f2042a;
                jSONObject = G1.h.a(h.a.CUSTOM_APP_EVENTS, this.f21333a, this.f21334b, z7, context);
                if (this.f21337e > 0) {
                    jSONObject.put("num_skipped_events", i7);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            f7.E(jSONObject);
            Bundle u7 = f7.u();
            String jSONArray2 = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "events.toString()");
            u7.putString("custom_events", jSONArray2);
            f7.H(jSONArray2);
            f7.G(u7);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
