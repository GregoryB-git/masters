package p3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1108x;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* renamed from: p3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1800d extends AbstractC1108x implements P {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C1800d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C1802f aesCtrKey_;
    private v hmacKey_;
    private int version_;

    /* renamed from: p3.d$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18379a;

        static {
            int[] iArr = new int[AbstractC1108x.d.values().length];
            f18379a = iArr;
            try {
                iArr[AbstractC1108x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18379a[AbstractC1108x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18379a[AbstractC1108x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18379a[AbstractC1108x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18379a[AbstractC1108x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18379a[AbstractC1108x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18379a[AbstractC1108x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: p3.d$b */
    public static final class b extends AbstractC1108x.a implements P {
        public b() {
            super(C1800d.DEFAULT_INSTANCE);
        }

        public b A(int i7) {
            s();
            ((C1800d) this.f11542p).f0(i7);
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

        public b y(C1802f c1802f) {
            s();
            ((C1800d) this.f11542p).d0(c1802f);
            return this;
        }

        public b z(v vVar) {
            s();
            ((C1800d) this.f11542p).e0(vVar);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        C1800d c1800d = new C1800d();
        DEFAULT_INSTANCE = c1800d;
        AbstractC1108x.Q(C1800d.class, c1800d);
    }

    public static b b0() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static C1800d c0(AbstractC1093h abstractC1093h, C1101p c1101p) {
        return (C1800d) AbstractC1108x.K(DEFAULT_INSTANCE, abstractC1093h, c1101p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i7) {
        this.version_ = i7;
    }

    public C1802f Y() {
        C1802f c1802f = this.aesCtrKey_;
        return c1802f == null ? C1802f.Y() : c1802f;
    }

    public v Z() {
        v vVar = this.hmacKey_;
        return vVar == null ? v.Y() : vVar;
    }

    public int a0() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ O b() {
        return super.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public /* bridge */ /* synthetic */ O.a d() {
        return super.H();
    }

    public final void d0(C1802f c1802f) {
        c1802f.getClass();
        this.aesCtrKey_ = c1802f;
    }

    public final void e0(v vVar) {
        vVar.getClass();
        this.hmacKey_ = vVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1108x
    public final Object t(AbstractC1108x.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f18379a[dVar.ordinal()]) {
            case 1:
                return new C1800d();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC1108x.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 == null) {
                    synchronized (C1800d.class) {
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
