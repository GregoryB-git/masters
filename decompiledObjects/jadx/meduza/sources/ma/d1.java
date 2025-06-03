package ma;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: c, reason: collision with root package name */
    public static final d1 f10940c = new d1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10942b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final k0 f10941a = new k0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [ma.w0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [ma.w0] */
    public final <T> i1<T> a(Class<T> cls) {
        x0 x0Var;
        i0 i0Var;
        p1<?, ?> p1Var;
        p<?> pVar;
        n0 n0Var;
        v0 B;
        v0 v0Var;
        Class<?> cls2;
        Charset charset = a0.f10909a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        i1<T> i1Var = (i1) this.f10942b.get(cls);
        if (i1Var != null) {
            return i1Var;
        }
        k0 k0Var = this.f10941a;
        k0Var.getClass();
        Class<?> cls3 = j1.f11015a;
        if (!w.class.isAssignableFrom(cls) && (cls2 = j1.f11015a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        q0 a10 = k0Var.f11027a.a(cls);
        if (a10.a()) {
            if (w.class.isAssignableFrom(cls)) {
                v0Var = new w0(j1.f11017c, r.f11070a, a10.b());
            } else {
                p1<?, ?> p1Var2 = j1.f11016b;
                p<?> pVar2 = r.f11071b;
                if (pVar2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                v0Var = new w0(p1Var2, pVar2, a10.b());
            }
            B = v0Var;
        } else {
            if (w.class.isAssignableFrom(cls)) {
                if (q0.g.c(a10.c()) != 1) {
                    x0Var = z0.f11147b;
                    i0Var = i0.f11007b;
                    p1Var = j1.f11017c;
                    pVar = r.f11070a;
                } else {
                    x0Var = z0.f11147b;
                    i0Var = i0.f11007b;
                    p1Var = j1.f11017c;
                    pVar = null;
                }
                n0Var = p0.f11064b;
            } else {
                if (q0.g.c(a10.c()) != 1) {
                    x0Var = z0.f11146a;
                    i0Var = i0.f11006a;
                    p1<?, ?> p1Var3 = j1.f11016b;
                    p<?> pVar3 = r.f11071b;
                    if (pVar3 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    p1Var = p1Var3;
                    pVar = pVar3;
                } else {
                    x0Var = z0.f11146a;
                    i0Var = i0.f11006a;
                    p1Var = j1.f11016b;
                    pVar = null;
                }
                n0Var = p0.f11063a;
            }
            x0 x0Var2 = x0Var;
            i0 i0Var2 = i0Var;
            p1<?, ?> p1Var4 = p1Var;
            p<?> pVar4 = pVar;
            n0 n0Var2 = n0Var;
            int[] iArr = v0.f11097q;
            if (!(a10 instanceof f1)) {
                throw null;
            }
            B = v0.B((f1) a10, x0Var2, i0Var2, p1Var4, pVar4, n0Var2);
        }
        i1<T> i1Var2 = (i1) this.f10942b.putIfAbsent(cls, B);
        return i1Var2 != null ? i1Var2 : B;
    }
}
