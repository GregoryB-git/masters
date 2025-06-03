package ka;

import java.util.List;
import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class j extends ma.w<j, a> implements t0 {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final j DEFAULT_INSTANCE;
    private static volatile b1<j> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private a0.d<d0> values_ = e1.f10945d;

    public static final class a extends w.a<j, a> implements t0 {
        public a() {
            super(j.DEFAULT_INSTANCE);
        }
    }

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        ma.w.D(j.class, jVar);
    }

    public static void G(j jVar, List list) {
        a0.d<d0> dVar = jVar.values_;
        if (!dVar.g()) {
            jVar.values_ = ma.w.A(dVar);
        }
        ma.a.k(list, jVar.values_);
    }

    public static void H(j jVar, boolean z10) {
        jVar.before_ = z10;
    }

    public static j J() {
        return DEFAULT_INSTANCE;
    }

    public static a K() {
        return DEFAULT_INSTANCE.s();
    }

    public final boolean I() {
        return this.before_;
    }

    public final List<d0> h() {
        return this.values_;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", d0.class, "before_"});
            case NEW_MUTABLE_INSTANCE:
                return new j();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<j> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (j.class) {
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
