package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class t extends ma.w<t, a> implements t0 {
    private static final t DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile b1<t> PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    public static final class a extends w.a<t, a> implements t0 {
        public a() {
            super(t.DEFAULT_INSTANCE);
        }
    }

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        ma.w.D(t.class, tVar);
    }

    public static t G() {
        return DEFAULT_INSTANCE;
    }

    public final l H() {
        return this.responseTypeCase_ == 3 ? (l) this.responseType_ : l.G();
    }

    public final m I() {
        return this.responseTypeCase_ == 4 ? (m) this.responseType_ : m.G();
    }

    public final o J() {
        return this.responseTypeCase_ == 6 ? (o) this.responseType_ : o.G();
    }

    public final q K() {
        return this.responseTypeCase_ == 5 ? (q) this.responseType_ : q.H();
    }

    public final int L() {
        int i10 = this.responseTypeCase_;
        if (i10 == 0) {
            return 6;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 != 5) {
            return i10 != 6 ? 0 : 4;
        }
        return 5;
    }

    public final b0 M() {
        return this.responseTypeCase_ == 2 ? (b0) this.responseType_ : b0.H();
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", b0.class, l.class, m.class, q.class, o.class});
            case NEW_MUTABLE_INSTANCE:
                return new t();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<t> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (t.class) {
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
