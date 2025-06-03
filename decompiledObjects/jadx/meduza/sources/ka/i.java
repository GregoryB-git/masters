package ka;

import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class i extends ma.w<i, a> implements t0 {
    public static final int COMMIT_TIME_FIELD_NUMBER = 2;
    private static final i DEFAULT_INSTANCE;
    private static volatile b1<i> PARSER = null;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private n1 commitTime_;
    private a0.d<h0> writeResults_ = e1.f10945d;

    public static final class a extends w.a<i, a> implements t0 {
        public a() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        ma.w.D(i.class, iVar);
    }

    public static i H() {
        return DEFAULT_INSTANCE;
    }

    public final n1 G() {
        n1 n1Var = this.commitTime_;
        return n1Var == null ? n1.I() : n1Var;
    }

    public final h0 I(int i10) {
        return this.writeResults_.get(i10);
    }

    public final int J() {
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
                return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "writeResults_", h0.class, "commitTime_"});
            case NEW_MUTABLE_INSTANCE:
                return new i();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<i> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (i.class) {
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
