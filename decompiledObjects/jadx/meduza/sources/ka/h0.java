package ka;

import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class h0 extends ma.w<h0, a> implements t0 {
    private static final h0 DEFAULT_INSTANCE;
    private static volatile b1<h0> PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private a0.d<d0> transformResults_ = e1.f10945d;
    private n1 updateTime_;

    public static final class a extends w.a<h0, a> implements t0 {
        public a() {
            super(h0.DEFAULT_INSTANCE);
        }
    }

    static {
        h0 h0Var = new h0();
        DEFAULT_INSTANCE = h0Var;
        ma.w.D(h0.class, h0Var);
    }

    public final d0 G(int i10) {
        return this.transformResults_.get(i10);
    }

    public final int H() {
        return this.transformResults_.size();
    }

    public final n1 I() {
        n1 n1Var = this.updateTime_;
        return n1Var == null ? n1.I() : n1Var;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", d0.class});
            case NEW_MUTABLE_INSTANCE:
                return new h0();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<h0> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (h0.class) {
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
