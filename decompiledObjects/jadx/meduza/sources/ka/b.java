package ka;

import java.util.Collections;
import java.util.List;
import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.w;

/* loaded from: classes.dex */
public final class b extends ma.w<b, a> implements c {
    private static final b DEFAULT_INSTANCE;
    private static volatile b1<b> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private a0.d<d0> values_ = e1.f10945d;

    public static final class a extends w.a<b, a> implements c {
        public a() {
            super(b.DEFAULT_INSTANCE);
        }

        @Override // ka.c
        public final List<d0> h() {
            return Collections.unmodifiableList(((b) this.f11120b).h());
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        ma.w.D(b.class, bVar);
    }

    public static void G(b bVar, d0 d0Var) {
        bVar.getClass();
        d0Var.getClass();
        a0.d<d0> dVar = bVar.values_;
        if (!dVar.g()) {
            bVar.values_ = ma.w.A(dVar);
        }
        bVar.values_.add(d0Var);
    }

    public static void H(b bVar, List list) {
        a0.d<d0> dVar = bVar.values_;
        if (!dVar.g()) {
            bVar.values_ = ma.w.A(dVar);
        }
        ma.a.k(list, bVar.values_);
    }

    public static void I(b bVar, int i10) {
        a0.d<d0> dVar = bVar.values_;
        if (!dVar.g()) {
            bVar.values_ = ma.w.A(dVar);
        }
        bVar.values_.remove(i10);
    }

    public static b J() {
        return DEFAULT_INSTANCE;
    }

    public static a M() {
        return DEFAULT_INSTANCE.s();
    }

    public final d0 K(int i10) {
        return this.values_.get(i10);
    }

    public final int L() {
        return this.values_.size();
    }

    @Override // ka.c
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
                return new f1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", d0.class});
            case NEW_MUTABLE_INSTANCE:
                return new b();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<b> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (b.class) {
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
