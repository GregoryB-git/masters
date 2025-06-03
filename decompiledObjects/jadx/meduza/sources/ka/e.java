package ka;

import ma.b1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class e extends ma.w<e, a> implements t0 {
    private static final e DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile b1<e> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private n1 readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private ma.h transaction_ = ma.h.f10961b;

    public static final class a extends w.a<e, a> implements t0 {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        ma.w.D(e.class, eVar);
    }

    public static e G() {
        return DEFAULT_INSTANCE;
    }

    public final k H() {
        return this.resultCase_ == 1 ? (k) this.result_ : k.J();
    }

    public final String I() {
        return this.resultCase_ == 2 ? (String) this.result_ : "";
    }

    public final n1 J() {
        n1 n1Var = this.readTime_;
        return n1Var == null ? n1.I() : n1Var;
    }

    public final int K() {
        int i10 = this.resultCase_;
        if (i10 == 0) {
            return 3;
        }
        if (i10 != 1) {
            return i10 != 2 ? 0 : 2;
        }
        return 1;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", k.class, "transaction_", "readTime_"});
            case NEW_MUTABLE_INSTANCE:
                return new e();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<e> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (e.class) {
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
