package p3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1108x;
import com.google.crypto.tink.shaded.protobuf.AbstractC1110z;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* loaded from: classes.dex */
public final class y extends AbstractC1108x implements P {
    private static final y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile X PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC1093h value_ = AbstractC1093h.f11337p;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18409a;

        static {
            int[] iArr = new int[AbstractC1108x.d.values().length];
            f18409a = iArr;
            try {
                iArr[AbstractC1108x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18409a[AbstractC1108x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18409a[AbstractC1108x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18409a[AbstractC1108x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18409a[AbstractC1108x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18409a[AbstractC1108x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18409a[AbstractC1108x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC1108x.a implements P {
        public b() {
            super(y.DEFAULT_INSTANCE);
        }

        public b A(AbstractC1093h abstractC1093h) {
            s();
            ((y) this.f11542p).f0(abstractC1093h);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public /* bridge */ /* synthetic */ O b() {
            return super.u();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.O.a
        public /* bridge */ /* synthetic */ O c() {
            return super.o();
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.p();
        }

        public b y(c cVar) {
            s();
            ((y) this.f11542p).d0(cVar);
            return this;
        }

        public b z(String str) {
            s();
            ((y) this.f11542p).e0(str);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public enum c implements AbstractC1110z.a {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);


        /* renamed from: v, reason: collision with root package name */
        public static final AbstractC1110z.b f18416v = new a();

        /* renamed from: o, reason: collision with root package name */
        public final int f18418o;

        public class a implements AbstractC1110z.b {
        }

        c(int i7) {
            this.f18418o = i7;
        }

        public static c c(int i7) {
            if (i7 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i7 == 1) {
                return SYMMETRIC;
            }
            if (i7 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i7 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i7 != 4) {
                return null;
            }
            return REMOTE;
        }

        public final int g() {
            if (this != UNRECOGNIZED) {
                return this.f18418o;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        AbstractC1108x.Q(y.class, yVar);
    }

    public static y Y() {
        return DEFAULT_INSTANCE;
    }

    public static b c0() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public c Z() {
        c c7 = c.c(this.keyMaterialType_);
        return c7 == null ? c.UNRECOGNIZED : c7;
    }

    public String a0() {
        return this.typeUrl_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ O b() {
        return super.w();
    }

    public AbstractC1093h b0() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public /* bridge */ /* synthetic */ O.a d() {
        return super.H();
    }

    public final void d0(c cVar) {
        this.keyMaterialType_ = cVar.g();
    }

    public final void e0(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public final void f0(AbstractC1093h abstractC1093h) {
        abstractC1093h.getClass();
        this.value_ = abstractC1093h;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1108x
    public final Object t(AbstractC1108x.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f18409a[dVar.ordinal()]) {
            case 1:
                return new y();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC1108x.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 == null) {
                    synchronized (y.class) {
                        try {
                            x7 = PARSER;
                            if (x7 == null) {
                                x7 = new AbstractC1108x.b(DEFAULT_INSTANCE);
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
