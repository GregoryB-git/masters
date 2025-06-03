package R;

import R.g;
import androidx.datastore.preferences.protobuf.AbstractC0775w;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class h extends AbstractC0775w implements P {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile X PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC0775w.a implements P {
        public a() {
            super(h.DEFAULT_INSTANCE);
        }

        public a A(boolean z7) {
            v();
            ((h) this.f9187p).Z(z7);
            return this;
        }

        public a B(double d7) {
            v();
            ((h) this.f9187p).a0(d7);
            return this;
        }

        public a C(float f7) {
            v();
            ((h) this.f9187p).b0(f7);
            return this;
        }

        public a D(int i7) {
            v();
            ((h) this.f9187p).c0(i7);
            return this;
        }

        public a E(long j7) {
            v();
            ((h) this.f9187p).d0(j7);
            return this;
        }

        public a F(String str) {
            v();
            ((h) this.f9187p).e0(str);
            return this;
        }

        public a G(g.a aVar) {
            v();
            ((h) this.f9187p).f0(aVar);
            return this;
        }

        public /* synthetic */ a(e eVar) {
            this();
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);


        /* renamed from: o, reason: collision with root package name */
        public final int f4516o;

        b(int i7) {
            this.f4516o = i7;
        }

        public static b c(int i7) {
            switch (i7) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0775w.F(h.class, hVar);
    }

    public static h Q() {
        return DEFAULT_INSTANCE;
    }

    public static a Y() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public boolean P() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double R() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float S() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int T() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long U() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String V() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g W() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.L();
    }

    public b X() {
        return b.c(this.valueCase_);
    }

    public final void Z(boolean z7) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z7);
    }

    public final void a0(double d7) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d7);
    }

    public final void b0(float f7) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f7);
    }

    public final void c0(int i7) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i7);
    }

    public final void d0(long j7) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j7);
    }

    public final void e0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void f0(g.a aVar) {
        this.value_ = aVar.s();
        this.valueCase_ = 6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0775w
    public final Object s(AbstractC0775w.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f4505a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0775w.C(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 == null) {
                    synchronized (h.class) {
                        try {
                            x7 = PARSER;
                            if (x7 == null) {
                                x7 = new AbstractC0775w.b(DEFAULT_INSTANCE);
                                PARSER = x7;
                            }
                        } finally {
                        }
                    }
                }
                return x7;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
