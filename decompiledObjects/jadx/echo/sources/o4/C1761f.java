package o4;

import B3.C0342c;
import B3.F;
import B3.InterfaceC0344e;
import V2.AbstractC0659j;
import android.content.Context;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import o4.j;
import org.json.JSONArray;
import org.json.JSONObject;
import r4.InterfaceC1922b;
import s3.C1947e;
import y3.InterfaceC2271a;

/* renamed from: o4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1761f implements InterfaceC1764i, j {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1922b f18182a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f18183b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1922b f18184c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f18185d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f18186e;

    public C1761f(final Context context, final String str, Set set, InterfaceC1922b interfaceC1922b, Executor executor) {
        this(new InterfaceC1922b() { // from class: o4.c
            @Override // r4.InterfaceC1922b
            public final Object get() {
                q j7;
                j7 = C1761f.j(context, str);
                return j7;
            }
        }, set, executor, interfaceC1922b, context);
    }

    public static C0342c g() {
        final F a7 = F.a(InterfaceC2271a.class, Executor.class);
        return C0342c.f(C1761f.class, InterfaceC1764i.class, j.class).b(B3.r.k(Context.class)).b(B3.r.k(C1947e.class)).b(B3.r.n(InterfaceC1762g.class)).b(B3.r.m(O4.i.class)).b(B3.r.j(a7)).f(new B3.h() { // from class: o4.b
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                C1761f h7;
                h7 = C1761f.h(F.this, interfaceC0344e);
                return h7;
            }
        }).d();
    }

    public static /* synthetic */ C1761f h(F f7, InterfaceC0344e interfaceC0344e) {
        return new C1761f((Context) interfaceC0344e.a(Context.class), ((C1947e) interfaceC0344e.a(C1947e.class)).s(), interfaceC0344e.c(InterfaceC1762g.class), interfaceC0344e.g(O4.i.class), (Executor) interfaceC0344e.h(f7));
    }

    public static /* synthetic */ q j(Context context, String str) {
        return new q(context, str);
    }

    @Override // o4.InterfaceC1764i
    public AbstractC0659j a() {
        return E.r.a(this.f18183b) ^ true ? V2.m.e("") : V2.m.c(this.f18186e, new Callable() { // from class: o4.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i7;
                i7 = C1761f.this.i();
                return i7;
            }
        });
    }

    @Override // o4.j
    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        q qVar = (q) this.f18182a.get();
        if (!qVar.i(currentTimeMillis)) {
            return j.a.NONE;
        }
        qVar.g();
        return j.a.GLOBAL;
    }

    public final /* synthetic */ String i() {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                q qVar = (q) this.f18182a.get();
                List c7 = qVar.c();
                qVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i7 = 0; i7 < c7.size(); i7++) {
                    r rVar = (r) c7.get(i7);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", rVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) rVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    public final /* synthetic */ Void k() {
        synchronized (this) {
            ((q) this.f18182a.get()).k(System.currentTimeMillis(), ((O4.i) this.f18184c.get()).a());
        }
        return null;
    }

    public AbstractC0659j l() {
        return this.f18185d.size() <= 0 ? V2.m.e(null) : E.r.a(this.f18183b) ^ true ? V2.m.e(null) : V2.m.c(this.f18186e, new Callable() { // from class: o4.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k7;
                k7 = C1761f.this.k();
                return k7;
            }
        });
    }

    public C1761f(InterfaceC1922b interfaceC1922b, Set set, Executor executor, InterfaceC1922b interfaceC1922b2, Context context) {
        this.f18182a = interfaceC1922b;
        this.f18185d = set;
        this.f18186e = executor;
        this.f18184c = interfaceC1922b2;
        this.f18183b = context;
    }
}
