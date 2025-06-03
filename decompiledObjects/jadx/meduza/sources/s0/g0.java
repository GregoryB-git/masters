package s0;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13986b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final n0 f13987a;

    public static class a implements n0 {
        @Override // s0.n0
        public final m0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // s0.n0
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    public static class b implements n0 {

        /* renamed from: a, reason: collision with root package name */
        public n0[] f13988a;

        public b(n0... n0VarArr) {
            this.f13988a = n0VarArr;
        }

        @Override // s0.n0
        public final m0 a(Class<?> cls) {
            for (n0 n0Var : this.f13988a) {
                if (n0Var.b(cls)) {
                    return n0Var.a(cls);
                }
            }
            StringBuilder l10 = defpackage.f.l("No factory is available for message type: ");
            l10.append(cls.getName());
            throw new UnsupportedOperationException(l10.toString());
        }

        @Override // s0.n0
        public final boolean b(Class<?> cls) {
            for (n0 n0Var : this.f13988a) {
                if (n0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public g0() {
        n0 n0Var;
        n0[] n0VarArr = new n0[2];
        n0VarArr[0] = u.f14105a;
        try {
            n0Var = (n0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            n0Var = f13986b;
        }
        n0VarArr[1] = n0Var;
        b bVar = new b(n0VarArr);
        Charset charset = x.f14119a;
        this.f13987a = bVar;
    }
}
