package l9;

import ka.a0;
import ma.b1;
import ma.f1;
import ma.h;
import ma.n1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class c extends w<c, a> implements t0 {
    private static final c DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile b1<c> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private n1 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private n1 snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private h resumeToken_ = h.f10961b;

    public static final class a extends w.a<c, a> implements t0 {
        public a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        QUERY,
        DOCUMENTS,
        TARGETTYPE_NOT_SET
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        w.D(c.class, cVar);
    }

    public static void G(c cVar, a0.c cVar2) {
        cVar.getClass();
        cVar.targetType_ = cVar2;
        cVar.targetTypeCase_ = 5;
    }

    public static void H(c cVar, a0.b bVar) {
        cVar.getClass();
        cVar.targetType_ = bVar;
        cVar.targetTypeCase_ = 6;
    }

    public static void I(c cVar, n1 n1Var) {
        cVar.getClass();
        cVar.lastLimboFreeSnapshotVersion_ = n1Var;
        cVar.bitField0_ |= 2;
    }

    public static void J(c cVar) {
        cVar.lastLimboFreeSnapshotVersion_ = null;
        cVar.bitField0_ &= -3;
    }

    public static void K(c cVar, int i10) {
        cVar.targetId_ = i10;
    }

    public static void L(c cVar, n1 n1Var) {
        cVar.getClass();
        cVar.snapshotVersion_ = n1Var;
        cVar.bitField0_ |= 1;
    }

    public static void M(c cVar, h hVar) {
        cVar.getClass();
        hVar.getClass();
        cVar.resumeToken_ = hVar;
    }

    public static void N(c cVar, long j10) {
        cVar.lastListenSequenceNumber_ = j10;
    }

    public static a W() {
        return DEFAULT_INSTANCE.s();
    }

    public static c X(byte[] bArr) {
        return (c) w.B(DEFAULT_INSTANCE, bArr);
    }

    public final a0.b O() {
        return this.targetTypeCase_ == 6 ? (a0.b) this.targetType_ : a0.b.H();
    }

    public final n1 P() {
        n1 n1Var = this.lastLimboFreeSnapshotVersion_;
        return n1Var == null ? n1.I() : n1Var;
    }

    public final long Q() {
        return this.lastListenSequenceNumber_;
    }

    public final a0.c R() {
        return this.targetTypeCase_ == 5 ? (a0.c) this.targetType_ : a0.c.I();
    }

    public final h S() {
        return this.resumeToken_;
    }

    public final n1 T() {
        n1 n1Var = this.snapshotVersion_;
        return n1Var == null ? n1.I() : n1Var;
    }

    public final int U() {
        return this.targetId_;
    }

    public final b V() {
        int i10 = this.targetTypeCase_;
        if (i10 == 0) {
            return b.TARGETTYPE_NOT_SET;
        }
        if (i10 == 5) {
            return b.QUERY;
        }
        if (i10 != 6) {
            return null;
        }
        return b.DOCUMENTS;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007ဉ\u0001", new Object[]{"targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", a0.c.class, a0.b.class, "lastLimboFreeSnapshotVersion_"});
            case NEW_MUTABLE_INSTANCE:
                return new c();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<c> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (c.class) {
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
