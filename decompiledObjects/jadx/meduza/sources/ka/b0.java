package ka;

import ma.a0;
import ma.b1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class b0 extends ma.w<b0, a> implements t0 {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final b0 DEFAULT_INSTANCE;
    private static volatile b1<b0> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private na.a cause_;
    private n1 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private a0.c targetIds_ = ma.z.f11143d;
    private ma.h resumeToken_ = ma.h.f10961b;

    public static final class a extends w.a<b0, a> implements t0 {
        public a() {
            super(b0.DEFAULT_INSTANCE);
        }
    }

    public enum b implements a0.a {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);


        /* renamed from: a, reason: collision with root package name */
        public final int f9179a;

        b(int i10) {
            this.f9179a = i10;
        }

        public static b f(int i10) {
            if (i10 == 0) {
                return NO_CHANGE;
            }
            if (i10 == 1) {
                return ADD;
            }
            if (i10 == 2) {
                return REMOVE;
            }
            if (i10 == 3) {
                return CURRENT;
            }
            if (i10 != 4) {
                return null;
            }
            return RESET;
        }

        @Override // ma.a0.a
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f9179a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        ma.w.D(b0.class, b0Var);
    }

    public static b0 H() {
        return DEFAULT_INSTANCE;
    }

    public final na.a G() {
        na.a aVar = this.cause_;
        return aVar == null ? na.a.H() : aVar;
    }

    public final n1 I() {
        n1 n1Var = this.readTime_;
        return n1Var == null ? n1.I() : n1Var;
    }

    public final ma.h J() {
        return this.resumeToken_;
    }

    public final b K() {
        b f = b.f(this.targetChangeType_);
        return f == null ? b.UNRECOGNIZED : f;
    }

    public final int L() {
        return ((ma.z) this.targetIds_).f11145c;
    }

    public final a0.c M() {
        return this.targetIds_;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case NEW_MUTABLE_INSTANCE:
                return new b0();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<b0> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (b0.class) {
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
