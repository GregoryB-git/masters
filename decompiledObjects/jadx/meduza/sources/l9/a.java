package l9;

import ka.k;
import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class a extends w<a, C0145a> implements t0 {
    private static final a DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile b1<a> PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* renamed from: l9.a$a, reason: collision with other inner class name */
    public static final class C0145a extends w.a<a, C0145a> implements t0 {
        public C0145a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        w.D(a.class, aVar);
    }

    public static void G(a aVar, boolean z10) {
        aVar.hasCommittedMutations_ = z10;
    }

    public static void H(a aVar, b bVar) {
        aVar.getClass();
        aVar.documentType_ = bVar;
        aVar.documentTypeCase_ = 1;
    }

    public static void I(a aVar, k kVar) {
        aVar.getClass();
        aVar.documentType_ = kVar;
        aVar.documentTypeCase_ = 2;
    }

    public static void J(a aVar, d dVar) {
        aVar.getClass();
        aVar.documentType_ = dVar;
        aVar.documentTypeCase_ = 3;
    }

    public static C0145a P() {
        return DEFAULT_INSTANCE.s();
    }

    public static a Q(byte[] bArr) {
        return (a) w.B(DEFAULT_INSTANCE, bArr);
    }

    public final k K() {
        return this.documentTypeCase_ == 2 ? (k) this.documentType_ : k.J();
    }

    public final int L() {
        int i10 = this.documentTypeCase_;
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 3;
        }
        return 2;
    }

    public final boolean M() {
        return this.hasCommittedMutations_;
    }

    public final b N() {
        return this.documentTypeCase_ == 1 ? (b) this.documentType_ : b.I();
    }

    public final d O() {
        return this.documentTypeCase_ == 3 ? (d) this.documentType_ : d.I();
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", b.class, k.class, d.class, "hasCommittedMutations_"});
            case NEW_MUTABLE_INSTANCE:
                return new a();
            case NEW_BUILDER:
                return new C0145a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<a> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (a.class) {
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
