package ma;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f11026b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final r0 f11027a;

    public class a implements r0 {
        @Override // ma.r0
        public final q0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // ma.r0
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    public static class b implements r0 {

        /* renamed from: a, reason: collision with root package name */
        public r0[] f11028a;

        public b(r0... r0VarArr) {
            this.f11028a = r0VarArr;
        }

        @Override // ma.r0
        public final q0 a(Class<?> cls) {
            for (r0 r0Var : this.f11028a) {
                if (r0Var.b(cls)) {
                    return r0Var.a(cls);
                }
            }
            StringBuilder l10 = defpackage.f.l("No factory is available for message type: ");
            l10.append(cls.getName());
            throw new UnsupportedOperationException(l10.toString());
        }

        @Override // ma.r0
        public final boolean b(Class<?> cls) {
            for (r0 r0Var : this.f11028a) {
                if (r0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public k0() {
        r0 r0Var;
        r0[] r0VarArr = new r0[2];
        r0VarArr[0] = v.f11096a;
        try {
            r0Var = (r0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            r0Var = f11026b;
        }
        r0VarArr[1] = r0Var;
        b bVar = new b(r0VarArr);
        Charset charset = a0.f10909a;
        this.f11027a = bVar;
    }
}
