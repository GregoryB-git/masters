package ka;

import ma.a0;
import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class l extends ma.w<l, a> implements t0 {
    private static final l DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile b1<l> PARSER = null;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private k document_;
    private a0.c removedTargetIds_;
    private a0.c targetIds_;
    private int targetIdsMemoizedSerializedSize = -1;
    private int removedTargetIdsMemoizedSerializedSize = -1;

    public static final class a extends w.a<l, a> implements t0 {
        public a() {
            super(l.DEFAULT_INSTANCE);
        }
    }

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        ma.w.D(l.class, lVar);
    }

    public l() {
        ma.z zVar = ma.z.f11143d;
        this.targetIds_ = zVar;
        this.removedTargetIds_ = zVar;
    }

    public static l G() {
        return DEFAULT_INSTANCE;
    }

    public final k H() {
        k kVar = this.document_;
        return kVar == null ? k.J() : kVar;
    }

    public final a0.c I() {
        return this.removedTargetIds_;
    }

    public final a0.c J() {
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
                return new f1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0005'\u0006'", new Object[]{"bitField0_", "document_", "targetIds_", "removedTargetIds_"});
            case NEW_MUTABLE_INSTANCE:
                return new l();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<l> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (l.class) {
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
