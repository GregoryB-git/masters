package oa;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class a extends w<a, C0190a> implements t0 {
    private static final a DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile b1<a> PARSER;
    private double latitude_;
    private double longitude_;

    /* renamed from: oa.a$a, reason: collision with other inner class name */
    public static final class C0190a extends w.a<a, C0190a> implements t0 {
        public C0190a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        w.D(a.class, aVar);
    }

    public static void G(a aVar, double d10) {
        aVar.latitude_ = d10;
    }

    public static void H(a aVar, double d10) {
        aVar.longitude_ = d10;
    }

    public static a I() {
        return DEFAULT_INSTANCE;
    }

    public static C0190a L() {
        return DEFAULT_INSTANCE.s();
    }

    public final double J() {
        return this.latitude_;
    }

    public final double K() {
        return this.longitude_;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case NEW_MUTABLE_INSTANCE:
                return new a();
            case NEW_BUILDER:
                return new C0190a();
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
