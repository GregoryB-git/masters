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
public final class a extends ma.w<a, b> implements t0 {
    public static final int AGGREGATE_FIELDS_FIELD_NUMBER = 2;
    private static final a DEFAULT_INSTANCE;
    private static volatile b1<a> PARSER;
    private m0<String, d0> aggregateFields_ = m0.f11055b;

    /* renamed from: ka.a$a, reason: collision with other inner class name */
    public static final class C0133a {

        /* renamed from: a, reason: collision with root package name */
        public static final l0<String, d0> f9172a = new l0<>(v1.f11114c, v1.f11116e, d0.U());
    }

    public static final class b extends w.a<a, b> implements t0 {
        public b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        ma.w.D(a.class, aVar);
    }

    public static a H() {
        return DEFAULT_INSTANCE;
    }

    public final Map<String, d0> G() {
        return Collections.unmodifiableMap(this.aggregateFields_);
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"aggregateFields_", C0133a.f9172a});
            case NEW_MUTABLE_INSTANCE:
                return new a();
            case NEW_BUILDER:
                return new b();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<a> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (a.class) {
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
