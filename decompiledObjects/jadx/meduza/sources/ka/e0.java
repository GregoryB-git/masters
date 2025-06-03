package ka;

import ka.p;
import ma.a0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class e0 extends ma.w<e0, a> implements t0 {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final e0 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile b1<e0> PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private v currentDocument_;
    private Object operation_;
    private n updateMask_;
    private int operationCase_ = 0;
    private a0.d<p.b> updateTransforms_ = e1.f10945d;

    public static final class a extends w.a<e0, a> implements t0 {
        public a() {
            super(e0.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        UPDATE,
        DELETE,
        VERIFY,
        TRANSFORM,
        OPERATION_NOT_SET
    }

    static {
        e0 e0Var = new e0();
        DEFAULT_INSTANCE = e0Var;
        ma.w.D(e0.class, e0Var);
    }

    public static void G(e0 e0Var, n nVar) {
        e0Var.getClass();
        e0Var.updateMask_ = nVar;
        e0Var.bitField0_ |= 1;
    }

    public static void H(e0 e0Var, p.b bVar) {
        e0Var.getClass();
        bVar.getClass();
        a0.d<p.b> dVar = e0Var.updateTransforms_;
        if (!dVar.g()) {
            e0Var.updateTransforms_ = ma.w.A(dVar);
        }
        e0Var.updateTransforms_.add(bVar);
    }

    public static void I(e0 e0Var, k kVar) {
        e0Var.getClass();
        e0Var.operation_ = kVar;
        e0Var.operationCase_ = 1;
    }

    public static void J(e0 e0Var, v vVar) {
        e0Var.getClass();
        e0Var.currentDocument_ = vVar;
        e0Var.bitField0_ |= 2;
    }

    public static void K(e0 e0Var, String str) {
        e0Var.getClass();
        str.getClass();
        e0Var.operationCase_ = 2;
        e0Var.operation_ = str;
    }

    public static void L(e0 e0Var, String str) {
        e0Var.getClass();
        str.getClass();
        e0Var.operationCase_ = 5;
        e0Var.operation_ = str;
    }

    public static a Y() {
        return DEFAULT_INSTANCE.s();
    }

    public static a Z(e0 e0Var) {
        a s10 = DEFAULT_INSTANCE.s();
        s10.n(e0Var);
        return s10;
    }

    public static e0 a0(byte[] bArr) {
        return (e0) ma.w.B(DEFAULT_INSTANCE, bArr);
    }

    public final v M() {
        v vVar = this.currentDocument_;
        return vVar == null ? v.J() : vVar;
    }

    public final String N() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    public final b O() {
        int i10 = this.operationCase_;
        if (i10 == 0) {
            return b.OPERATION_NOT_SET;
        }
        if (i10 == 1) {
            return b.UPDATE;
        }
        if (i10 == 2) {
            return b.DELETE;
        }
        if (i10 == 5) {
            return b.VERIFY;
        }
        if (i10 != 6) {
            return null;
        }
        return b.TRANSFORM;
    }

    public final p P() {
        return this.operationCase_ == 6 ? (p) this.operation_ : p.G();
    }

    public final k Q() {
        return this.operationCase_ == 1 ? (k) this.operation_ : k.J();
    }

    public final n R() {
        n nVar = this.updateMask_;
        return nVar == null ? n.H() : nVar;
    }

    public final a0.d S() {
        return this.updateTransforms_;
    }

    public final String T() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    public final boolean U() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean V() {
        return this.operationCase_ == 6;
    }

    public final boolean W() {
        return this.operationCase_ == 1;
    }

    public final boolean X() {
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
                return new f1(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", k.class, "updateMask_", "currentDocument_", p.class, "updateTransforms_", p.b.class});
            case NEW_MUTABLE_INSTANCE:
                return new e0();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<e0> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (e0.class) {
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
