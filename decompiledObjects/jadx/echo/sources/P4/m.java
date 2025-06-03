package P4;

import C3.z;
import V2.AbstractC0659j;
import V2.InterfaceC0651b;
import V2.InterfaceC0658i;
import android.content.Context;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.C1947e;
import t3.C1989a;
import t3.C1991c;

/* loaded from: classes.dex */
public class m {

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f4248m = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final Context f4249a;

    /* renamed from: b, reason: collision with root package name */
    public final C1947e f4250b;

    /* renamed from: c, reason: collision with root package name */
    public final C1991c f4251c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f4252d;

    /* renamed from: e, reason: collision with root package name */
    public final Q4.e f4253e;

    /* renamed from: f, reason: collision with root package name */
    public final Q4.e f4254f;

    /* renamed from: g, reason: collision with root package name */
    public final Q4.e f4255g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.c f4256h;

    /* renamed from: i, reason: collision with root package name */
    public final Q4.l f4257i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.d f4258j;

    /* renamed from: k, reason: collision with root package name */
    public final s4.i f4259k;

    /* renamed from: l, reason: collision with root package name */
    public final Q4.m f4260l;

    public m(Context context, C1947e c1947e, s4.i iVar, C1991c c1991c, Executor executor, Q4.e eVar, Q4.e eVar2, Q4.e eVar3, com.google.firebase.remoteconfig.internal.c cVar, Q4.l lVar, com.google.firebase.remoteconfig.internal.d dVar, Q4.m mVar) {
        this.f4249a = context;
        this.f4250b = c1947e;
        this.f4259k = iVar;
        this.f4251c = c1991c;
        this.f4252d = executor;
        this.f4253e = eVar;
        this.f4254f = eVar2;
        this.f4255g = eVar3;
        this.f4256h = cVar;
        this.f4257i = lVar;
        this.f4258j = dVar;
        this.f4260l = mVar;
    }

    public static List C(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i7);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static m o(C1947e c1947e) {
        return ((x) c1947e.k(x.class)).f();
    }

    public static boolean p(com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        return bVar2 == null || !bVar.g().equals(bVar2.g());
    }

    public static /* synthetic */ q r(AbstractC0659j abstractC0659j, AbstractC0659j abstractC0659j2) {
        return (q) abstractC0659j.j();
    }

    public static /* synthetic */ AbstractC0659j s(c.a aVar) {
        return V2.m.e(null);
    }

    public static /* synthetic */ AbstractC0659j v(com.google.firebase.remoteconfig.internal.b bVar) {
        return V2.m.e(null);
    }

    public final AbstractC0659j A(Map map) {
        try {
            return this.f4255g.k(com.google.firebase.remoteconfig.internal.b.j().b(map).a()).p(z.a(), new InterfaceC0658i() { // from class: P4.g
                @Override // V2.InterfaceC0658i
                public final AbstractC0659j a(Object obj) {
                    AbstractC0659j v7;
                    v7 = m.v((com.google.firebase.remoteconfig.internal.b) obj);
                    return v7;
                }
            });
        } catch (JSONException e7) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e7);
            return V2.m.e(null);
        }
    }

    public void B() {
        this.f4254f.e();
        this.f4255g.e();
        this.f4253e.e();
    }

    public void D(JSONArray jSONArray) {
        if (this.f4251c == null) {
            return;
        }
        try {
            this.f4251c.m(C(jSONArray));
        } catch (JSONException e7) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e7);
        } catch (C1989a e8) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e8);
        }
    }

    public AbstractC0659j h() {
        final AbstractC0659j e7 = this.f4253e.e();
        final AbstractC0659j e8 = this.f4254f.e();
        return V2.m.i(e7, e8).h(this.f4252d, new InterfaceC0651b() { // from class: P4.f
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j) {
                AbstractC0659j q7;
                q7 = m.this.q(e7, e8, abstractC0659j);
                return q7;
            }
        });
    }

    public d i(c cVar) {
        return this.f4260l.b(cVar);
    }

    public AbstractC0659j j() {
        AbstractC0659j e7 = this.f4254f.e();
        AbstractC0659j e8 = this.f4255g.e();
        AbstractC0659j e9 = this.f4253e.e();
        final AbstractC0659j c7 = V2.m.c(this.f4252d, new Callable() { // from class: P4.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.this.n();
            }
        });
        return V2.m.i(e7, e8, e9, c7, this.f4259k.a(), this.f4259k.b(false)).g(this.f4252d, new InterfaceC0651b() { // from class: P4.j
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j) {
                q r7;
                r7 = m.r(AbstractC0659j.this, abstractC0659j);
                return r7;
            }
        });
    }

    public AbstractC0659j k() {
        return this.f4256h.i().p(z.a(), new InterfaceC0658i() { // from class: P4.k
            @Override // V2.InterfaceC0658i
            public final AbstractC0659j a(Object obj) {
                AbstractC0659j s7;
                s7 = m.s((c.a) obj);
                return s7;
            }
        });
    }

    public AbstractC0659j l() {
        return k().p(this.f4252d, new InterfaceC0658i() { // from class: P4.e
            @Override // V2.InterfaceC0658i
            public final AbstractC0659j a(Object obj) {
                AbstractC0659j t7;
                t7 = m.this.t((Void) obj);
                return t7;
            }
        });
    }

    public Map m() {
        return this.f4257i.d();
    }

    public q n() {
        return this.f4258j.c();
    }

    public final /* synthetic */ AbstractC0659j q(AbstractC0659j abstractC0659j, AbstractC0659j abstractC0659j2, AbstractC0659j abstractC0659j3) {
        if (!abstractC0659j.n() || abstractC0659j.j() == null) {
            return V2.m.e(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) abstractC0659j.j();
        return (!abstractC0659j2.n() || p(bVar, (com.google.firebase.remoteconfig.internal.b) abstractC0659j2.j())) ? this.f4254f.k(bVar).g(this.f4252d, new InterfaceC0651b() { // from class: P4.l
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j4) {
                boolean w7;
                w7 = m.this.w(abstractC0659j4);
                return Boolean.valueOf(w7);
            }
        }) : V2.m.e(Boolean.FALSE);
    }

    public final /* synthetic */ AbstractC0659j t(Void r12) {
        return h();
    }

    public final /* synthetic */ Void u(s sVar) {
        this.f4258j.l(sVar);
        return null;
    }

    public final boolean w(AbstractC0659j abstractC0659j) {
        if (!abstractC0659j.n()) {
            return false;
        }
        this.f4253e.d();
        if (abstractC0659j.j() != null) {
            D(((com.google.firebase.remoteconfig.internal.b) abstractC0659j.j()).d());
            return true;
        }
        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
        return true;
    }

    public AbstractC0659j x(final s sVar) {
        return V2.m.c(this.f4252d, new Callable() { // from class: P4.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void u7;
                u7 = m.this.u(sVar);
                return u7;
            }
        });
    }

    public void y(boolean z7) {
        this.f4260l.e(z7);
    }

    public AbstractC0659j z(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            boolean z7 = value instanceof byte[];
            String str = (String) entry.getKey();
            if (z7) {
                hashMap.put(str, new String((byte[]) value));
            } else {
                hashMap.put(str, value.toString());
            }
        }
        return A(hashMap);
    }
}
