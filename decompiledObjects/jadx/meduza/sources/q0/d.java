package q0;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import s0.a1;
import s0.h;
import s0.h0;
import s0.i0;
import s0.n;
import s0.n1;
import s0.p0;
import s0.v;
import s0.w0;
import s0.y;

/* loaded from: classes.dex */
public final class d extends v<d, a> implements p0 {
    private static final d DEFAULT_INSTANCE;
    private static volatile w0<d> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private i0<String, f> preferences_ = i0.f14017b;

    public static final class a extends v.a<d, a> implements p0 {
        public a() {
            super(d.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final h0<String, f> f13191a = new h0<>(n1.f14055c, n1.f14057e, f.y());
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        v.o(d.class, dVar);
    }

    public static i0 q(d dVar) {
        i0<String, f> i0Var = dVar.preferences_;
        if (!i0Var.f14018a) {
            dVar.preferences_ = i0Var.d();
        }
        return dVar.preferences_;
    }

    public static a s() {
        return (a) ((v.a) DEFAULT_INSTANCE.k(v.f.NEW_BUILDER));
    }

    public static d t(FileInputStream fileInputStream) {
        v n2 = v.n(DEFAULT_INSTANCE, new h.b(fileInputStream), n.a());
        if (n2.f()) {
            return (d) n2;
        }
        throw new y(new g3.b().getMessage());
    }

    @Override // s0.v
    public final Object k(v.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new a1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f13191a});
            case NEW_MUTABLE_INSTANCE:
                return new d();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                w0<d> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (d.class) {
                        try {
                            w0Var = PARSER;
                            if (w0Var == null) {
                                w0Var = new v.b<>(DEFAULT_INSTANCE);
                                PARSER = w0Var;
                            }
                        } finally {
                        }
                    }
                }
                return w0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map<String, f> r() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
