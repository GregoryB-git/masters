package O3;

import H3.AbstractC0387i;
import H3.C;
import H3.C0402y;
import H3.EnumC0403z;
import H3.InterfaceC0401x;
import H3.W;
import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0658i;
import V2.m;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3993a;

    /* renamed from: b, reason: collision with root package name */
    public final j f3994b;

    /* renamed from: c, reason: collision with root package name */
    public final g f3995c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0401x f3996d;

    /* renamed from: e, reason: collision with root package name */
    public final O3.a f3997e;

    /* renamed from: f, reason: collision with root package name */
    public final k f3998f;

    /* renamed from: g, reason: collision with root package name */
    public final C0402y f3999g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f4000h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f4001i;

    public class a implements InterfaceC0658i {
        public a() {
        }

        @Override // V2.InterfaceC0658i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC0659j a(Void r52) {
            JSONObject a7 = f.this.f3998f.a(f.this.f3994b, true);
            if (a7 != null) {
                d b7 = f.this.f3995c.b(a7);
                f.this.f3997e.c(b7.f3978c, a7);
                f.this.q(a7, "Loaded settings: ");
                f fVar = f.this;
                fVar.r(fVar.f3994b.f4009f);
                f.this.f4000h.set(b7);
                ((C0660k) f.this.f4001i.get()).e(b7);
            }
            return m.e(null);
        }
    }

    public f(Context context, j jVar, InterfaceC0401x interfaceC0401x, g gVar, O3.a aVar, k kVar, C0402y c0402y) {
        AtomicReference atomicReference = new AtomicReference();
        this.f4000h = atomicReference;
        this.f4001i = new AtomicReference(new C0660k());
        this.f3993a = context;
        this.f3994b = jVar;
        this.f3996d = interfaceC0401x;
        this.f3995c = gVar;
        this.f3997e = aVar;
        this.f3998f = kVar;
        this.f3999g = c0402y;
        atomicReference.set(b.b(interfaceC0401x));
    }

    public static f l(Context context, String str, C c7, L3.b bVar, String str2, String str3, M3.g gVar, C0402y c0402y) {
        String g7 = c7.g();
        W w7 = new W();
        return new f(context, new j(str, c7.h(), c7.i(), c7.j(), c7, AbstractC0387i.h(AbstractC0387i.n(context), str, str3, str2), str3, str2, EnumC0403z.c(g7).e()), w7, new g(w7), new O3.a(gVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), c0402y);
    }

    @Override // O3.i
    public AbstractC0659j a() {
        return ((C0660k) this.f4001i.get()).a();
    }

    @Override // O3.i
    public d b() {
        return (d) this.f4000h.get();
    }

    public boolean k() {
        return !n().equals(this.f3994b.f4009f);
    }

    public final d m(e eVar) {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject b7 = this.f3997e.b();
                if (b7 != null) {
                    d b8 = this.f3995c.b(b7);
                    if (b8 != null) {
                        q(b7, "Loaded cached settings: ");
                        long a7 = this.f3996d.a();
                        if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && b8.a(a7)) {
                            E3.f.f().i("Cached settings have expired.");
                        }
                        try {
                            E3.f.f().i("Returning cached settings.");
                            dVar = b8;
                        } catch (Exception e7) {
                            e = e7;
                            dVar = b8;
                            E3.f.f().e("Failed to get cached settings", e);
                            return dVar;
                        }
                    } else {
                        E3.f.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    E3.f.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e8) {
            e = e8;
        }
        return dVar;
    }

    public final String n() {
        return AbstractC0387i.r(this.f3993a).getString("existing_instance_identifier", "");
    }

    public AbstractC0659j o(e eVar, Executor executor) {
        d m7;
        if (!k() && (m7 = m(eVar)) != null) {
            this.f4000h.set(m7);
            ((C0660k) this.f4001i.get()).e(m7);
            return m.e(null);
        }
        d m8 = m(e.IGNORE_CACHE_EXPIRATION);
        if (m8 != null) {
            this.f4000h.set(m8);
            ((C0660k) this.f4001i.get()).e(m8);
        }
        return this.f3999g.k(executor).p(executor, new a());
    }

    public AbstractC0659j p(Executor executor) {
        return o(e.USE_CACHE, executor);
    }

    public final void q(JSONObject jSONObject, String str) {
        E3.f.f().b(str + jSONObject.toString());
    }

    public final boolean r(String str) {
        SharedPreferences.Editor edit = AbstractC0387i.r(this.f3993a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }
}
