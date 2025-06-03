package ka;

import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class g0 extends ma.w<g0, a> implements t0 {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final g0 DEFAULT_INSTANCE;
    private static volatile b1<g0> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private n1 commitTime_;
    private String streamId_ = "";
    private ma.h streamToken_ = ma.h.f10961b;
    private a0.d<h0> writeResults_ = e1.f10945d;

    public static final class a extends w.a<g0, a> implements t0 {
        public a() {
            super(g0.DEFAULT_INSTANCE);
        }
    }

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        ma.w.D(g0.class, g0Var);
    }

    public static g0 H() {
        return DEFAULT_INSTANCE;
    }

    public final n1 G() {
        n1 n1Var = this.commitTime_;
        return n1Var == null ? n1.I() : n1Var;
    }

    public final ma.h I() {
        return this.streamToken_;
    }

    public final h0 J(int i10) {
        return this.writeResults_.get(i10);
    }

    public final int K() {
        return this.writeResults_.size();
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "streamId_", "streamToken_", "writeResults_", h0.class, "commitTime_"});
            case NEW_MUTABLE_INSTANCE:
                return new g0();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<g0> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (g0.class) {
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
