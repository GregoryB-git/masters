package l9;

import ma.b1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class d extends w<d, a> implements t0 {
    private static final d DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile b1<d> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private n1 version_;

    public static final class a extends w.a<d, a> implements t0 {
        public a() {
            super(d.DEFAULT_INSTANCE);
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        w.D(d.class, dVar);
    }

    public static void G(d dVar, String str) {
        dVar.getClass();
        str.getClass();
        dVar.name_ = str;
    }

    public static void H(d dVar, n1 n1Var) {
        dVar.getClass();
        dVar.version_ = n1Var;
        dVar.bitField0_ |= 1;
    }

    public static d I() {
        return DEFAULT_INSTANCE;
    }

    public static a L() {
        return DEFAULT_INSTANCE.s();
    }

    public final String J() {
        return this.name_;
    }

    public final n1 K() {
        n1 n1Var = this.version_;
        return n1Var == null ? n1.I() : n1Var;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "version_"});
            case NEW_MUTABLE_INSTANCE:
                return new d();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<d> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (d.class) {
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
