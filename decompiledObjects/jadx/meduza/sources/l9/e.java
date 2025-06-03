package l9;

import ka.e0;
import ma.a0;
import ma.b0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.h;
import ma.i;
import ma.n1;
import ma.o;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class e extends w<e, a> implements t0 {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile b1<e> PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private a0.d<e0> baseWrites_;
    private int batchId_;
    private int bitField0_;
    private n1 localWriteTime_;
    private a0.d<e0> writes_;

    public static final class a extends w.a<e, a> implements t0 {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        w.D(e.class, eVar);
    }

    public e() {
        e1<Object> e1Var = e1.f10945d;
        this.writes_ = e1Var;
        this.baseWrites_ = e1Var;
    }

    public static void G(e eVar, int i10) {
        eVar.batchId_ = i10;
    }

    public static void H(e eVar, e0 e0Var) {
        eVar.getClass();
        a0.d<e0> dVar = eVar.baseWrites_;
        if (!dVar.g()) {
            eVar.baseWrites_ = w.A(dVar);
        }
        eVar.baseWrites_.add(e0Var);
    }

    public static void I(e eVar, e0 e0Var) {
        eVar.getClass();
        a0.d<e0> dVar = eVar.writes_;
        if (!dVar.g()) {
            eVar.writes_ = w.A(dVar);
        }
        eVar.writes_.add(e0Var);
    }

    public static void J(e eVar, n1 n1Var) {
        eVar.getClass();
        eVar.localWriteTime_ = n1Var;
        eVar.bitField0_ |= 1;
    }

    public static a Q() {
        return DEFAULT_INSTANCE.s();
    }

    public static e R(h hVar) {
        e eVar = DEFAULT_INSTANCE;
        o a10 = o.a();
        i t = hVar.t();
        w C = w.C(eVar, t, a10);
        try {
            t.a(0);
            w.p(C);
            w.p(C);
            return (e) C;
        } catch (b0 e10) {
            throw e10;
        }
    }

    public static e S(byte[] bArr) {
        return (e) w.B(DEFAULT_INSTANCE, bArr);
    }

    public final e0 K(int i10) {
        return this.baseWrites_.get(i10);
    }

    public final int L() {
        return this.baseWrites_.size();
    }

    public final int M() {
        return this.batchId_;
    }

    public final n1 N() {
        n1 n1Var = this.localWriteTime_;
        return n1Var == null ? n1.I() : n1Var;
    }

    public final e0 O(int i10) {
        return this.writes_.get(i10);
    }

    public final int P() {
        return this.writes_.size();
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", e0.class, "localWriteTime_", "baseWrites_", e0.class});
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
