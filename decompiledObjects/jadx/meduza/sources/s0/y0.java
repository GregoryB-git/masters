package s0;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: c, reason: collision with root package name */
    public static final y0 f14122c = new y0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f14124b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final g0 f14123a = new g0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [s0.s0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [s0.s0] */
    public final <T> c1<T> a(Class<T> cls) {
        t0 t0Var;
        e0 e0Var;
        h1<?, ?> h1Var;
        o<?> oVar;
        j0 j0Var;
        r0 u10;
        r0 r0Var;
        Class<?> cls2;
        Charset charset = x.f14119a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        c1<T> c1Var = (c1) this.f14124b.get(cls);
        if (c1Var != null) {
            return c1Var;
        }
        g0 g0Var = this.f14123a;
        g0Var.getClass();
        Class<?> cls3 = d1.f13952a;
        if (!v.class.isAssignableFrom(cls) && (cls2 = d1.f13952a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        m0 a10 = g0Var.f13987a.a(cls);
        if (a10.a()) {
            if (v.class.isAssignableFrom(cls)) {
                r0Var = new s0(d1.f13955d, q.f14070a, a10.b());
            } else {
                h1<?, ?> h1Var2 = d1.f13953b;
                o<?> oVar2 = q.f14071b;
                if (oVar2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                r0Var = new s0(h1Var2, oVar2, a10.b());
            }
            u10 = r0Var;
        } else {
            if (v.class.isAssignableFrom(cls)) {
                if (a10.c() == 1) {
                    t0Var = v0.f14116b;
                    e0Var = e0.f13959b;
                    h1Var = d1.f13955d;
                    oVar = q.f14070a;
                } else {
                    t0Var = v0.f14116b;
                    e0Var = e0.f13959b;
                    h1Var = d1.f13955d;
                    oVar = null;
                }
                j0Var = l0.f14039b;
            } else {
                if (a10.c() == 1) {
                    t0Var = v0.f14115a;
                    e0Var = e0.f13958a;
                    h1<?, ?> h1Var3 = d1.f13953b;
                    o<?> oVar3 = q.f14071b;
                    if (oVar3 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    h1Var = h1Var3;
                    oVar = oVar3;
                } else {
                    t0Var = v0.f14115a;
                    e0Var = e0.f13958a;
                    h1Var = d1.f13954c;
                    oVar = null;
                }
                j0Var = l0.f14038a;
            }
            t0 t0Var2 = t0Var;
            e0 e0Var2 = e0Var;
            h1<?, ?> h1Var4 = h1Var;
            o<?> oVar4 = oVar;
            j0 j0Var2 = j0Var;
            int[] iArr = r0.f14076r;
            if (!(a10 instanceof a1)) {
                throw null;
            }
            u10 = r0.u((a1) a10, t0Var2, e0Var2, h1Var4, oVar4, j0Var2);
        }
        c1<T> c1Var2 = (c1) this.f14124b.putIfAbsent(cls, u10);
        return c1Var2 != null ? c1Var2 : u10;
    }
}
