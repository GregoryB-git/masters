package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class q extends ma.w<q, a> implements t0 {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final q DEFAULT_INSTANCE;
    private static volatile b1<q> PARSER = null;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    public static final int UNCHANGED_NAMES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int count_;
    private int targetId_;
    private g unchangedNames_;

    public static final class a extends w.a<q, a> implements t0 {
        public a() {
            super(q.DEFAULT_INSTANCE);
        }
    }

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        ma.w.D(q.class, qVar);
    }

    public static q H() {
        return DEFAULT_INSTANCE;
    }

    public final int G() {
        return this.count_;
    }

    public final int I() {
        return this.targetId_;
    }

    public final g J() {
        g gVar = this.unchangedNames_;
        return gVar == null ? g.H() : gVar;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "targetId_", "count_", "unchangedNames_"});
            case NEW_MUTABLE_INSTANCE:
                return new q();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<q> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (q.class) {
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
