package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class g extends ma.w<g, a> implements t0 {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final g DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile b1<g> PARSER;
    private int bitField0_;
    private f bits_;
    private int hashCount_;

    public static final class a extends w.a<g, a> implements t0 {
        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        ma.w.D(g.class, gVar);
    }

    public static g H() {
        return DEFAULT_INSTANCE;
    }

    public final f G() {
        f fVar = this.bits_;
        return fVar == null ? f.H() : fVar;
    }

    public final int I() {
        return this.hashCount_;
    }

    public final boolean J() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "bits_", "hashCount_"});
            case NEW_MUTABLE_INSTANCE:
                return new g();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<g> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (g.class) {
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
