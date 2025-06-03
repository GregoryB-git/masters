package ka;

import java.util.Collections;
import java.util.Map;
import ma.b1;
import ma.f1;
import ma.l0;
import ma.m0;
import ma.n1;
import ma.t0;
import ma.v1;
import ma.w;

/* loaded from: classes.dex */
public final class k extends ma.w<k, a> implements t0 {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final k DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile b1<k> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private n1 createTime_;
    private m0<String, d0> fields_ = m0.f11055b;
    private String name_ = "";
    private n1 updateTime_;

    public static final class a extends w.a<k, a> implements t0 {
        public a() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final l0<String, d0> f9186a = new l0<>(v1.f11114c, v1.f11116e, d0.U());
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        ma.w.D(k.class, kVar);
    }

    public static void G(k kVar, String str) {
        kVar.getClass();
        str.getClass();
        kVar.name_ = str;
    }

    public static m0 H(k kVar) {
        m0<String, d0> m0Var = kVar.fields_;
        if (!m0Var.f11056a) {
            kVar.fields_ = m0Var.d();
        }
        return kVar.fields_;
    }

    public static void I(k kVar, n1 n1Var) {
        kVar.getClass();
        kVar.updateTime_ = n1Var;
        kVar.bitField0_ |= 2;
    }

    public static k J() {
        return DEFAULT_INSTANCE;
    }

    public static a N() {
        return DEFAULT_INSTANCE.s();
    }

    public final Map<String, d0> K() {
        return Collections.unmodifiableMap(this.fields_);
    }

    public final String L() {
        return this.name_;
    }

    public final n1 M() {
        n1 n1Var = this.updateTime_;
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
                return new f1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "name_", "fields_", b.f9186a, "createTime_", "updateTime_"});
            case NEW_MUTABLE_INSTANCE:
                return new k();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<k> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (k.class) {
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
