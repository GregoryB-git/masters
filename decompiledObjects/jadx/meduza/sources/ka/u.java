package ka;

import java.util.Collections;
import java.util.Map;
import ma.b1;
import ma.f1;
import ma.l0;
import ma.m0;
import ma.t0;
import ma.v1;
import ma.w;

/* loaded from: classes.dex */
public final class u extends ma.w<u, a> implements t0 {
    private static final u DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile b1<u> PARSER;
    private m0<String, d0> fields_ = m0.f11055b;

    public static final class a extends w.a<u, a> implements t0 {
        public a() {
            super(u.DEFAULT_INSTANCE);
        }

        public final void p(d0 d0Var, String str) {
            str.getClass();
            d0Var.getClass();
            m();
            u.G((u) this.f11120b).put(str, d0Var);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final l0<String, d0> f9198a = new l0<>(v1.f11114c, v1.f11116e, d0.U());
    }

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        ma.w.D(u.class, uVar);
    }

    public static m0 G(u uVar) {
        m0<String, d0> m0Var = uVar.fields_;
        if (!m0Var.f11056a) {
            uVar.fields_ = m0Var.d();
        }
        return uVar.fields_;
    }

    public static u H() {
        return DEFAULT_INSTANCE;
    }

    public static a M() {
        return DEFAULT_INSTANCE.s();
    }

    public final int I() {
        return this.fields_.size();
    }

    public final Map<String, d0> J() {
        return Collections.unmodifiableMap(this.fields_);
    }

    public final d0 K(String str) {
        str.getClass();
        m0<String, d0> m0Var = this.fields_;
        if (m0Var.containsKey(str)) {
            return m0Var.get(str);
        }
        return null;
    }

    public final d0 L(String str) {
        str.getClass();
        m0<String, d0> m0Var = this.fields_;
        if (m0Var.containsKey(str)) {
            return m0Var.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", b.f9198a});
            case NEW_MUTABLE_INSTANCE:
                return new u();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<u> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (u.class) {
                        b1Var = PARSER;
                        if (b1Var == null) {
                            b1Var = new w.b<>(DEFAULT_INSTANCE);
                            PARSER = b1Var;
                        }
                    }
                }
                return b1Var;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
