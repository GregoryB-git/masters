package gb;

import eb.k0;
import eb.u0;
import gb.q2;
import java.util.Map;

/* loaded from: classes.dex */
public final class r2 extends eb.l0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f6798b;

    static {
        f6798b = !n7.i.a(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // eb.k0.c
    public final eb.k0 a(k0.e eVar) {
        return f6798b ? new p2(eVar) : new q2(eVar);
    }

    @Override // eb.l0
    public String b() {
        return "pick_first";
    }

    @Override // eb.l0
    public int c() {
        return 5;
    }

    @Override // eb.l0
    public boolean d() {
        return true;
    }

    @Override // eb.l0
    public u0.b e(Map<String, ?> map) {
        try {
            return new u0.b(new q2.b(n1.b("shuffleAddressList", map)));
        } catch (RuntimeException e10) {
            eb.e1 f = eb.e1.f5078n.f(e10);
            StringBuilder l10 = defpackage.f.l("Failed parsing configuration for ");
            l10.append(b());
            return new u0.b(f.g(l10.toString()));
        }
    }
}
