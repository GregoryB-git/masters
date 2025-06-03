package p3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1108x;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1797a extends AbstractC1108x implements P {
    private static final C1797a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1093h keyValue_ = AbstractC1093h.f11337p;
    private C1799c params_;
    private int version_;

    /* renamed from: p3.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0246a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18376a;

        static {
            int[] iArr = new int[AbstractC1108x.d.values().length];
            f18376a = iArr;
            try {
                iArr[AbstractC1108x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18376a[AbstractC1108x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18376a[AbstractC1108x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18376a[AbstractC1108x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18376a[AbstractC1108x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18376a[AbstractC1108x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18376a[AbstractC1108x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: p3.a$b */
    public static final class b extends AbstractC1108x.a implements P {
        public b() {
            super(C1797a.DEFAULT_INSTANCE);
        }

        public b A(int i7) {
            s();
            ((C1797a) this.f11542p).f0(i7);
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

        public b y(AbstractC1093h abstractC1093h) {
            s();
            ((C1797a) this.f11542p).d0(abstractC1093h);
            return this;
        }

        public b z(C1799c c1799c) {
            s();
            ((C1797a) this.f11542p).e0(c1799c);
            return this;
        }

        public /* synthetic */ b(C0246a c0246a) {
            this();
        }
    }

    static {
        C1797a c1797a = new C1797a();
        DEFAULT_INSTANCE = c1797a;
        AbstractC1108x.Q(C1797a.class, c1797a);
    }

    public static b b0() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static C1797a c0(AbstractC1093h abstractC1093h, C1101p c1101p) {
        return (C1797a) AbstractC1108x.K(DEFAULT_INSTANCE, abstractC1093h, c1101p);
    }

    public AbstractC1093h Y() {
        return this.keyValue_;
    }

    public C1799c Z() {
        C1799c c1799c = this.params_;
        return c1799c == null ? C1799c.W() : c1799c;
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

    public final void d0(AbstractC1093h abstractC1093h) {
        abstractC1093h.getClass();
        this.keyValue_ = abstractC1093h;
    }

    public final void e0(C1799c c1799c) {
        c1799c.getClass();
        this.params_ = c1799c;
    }

    public final void f0(int i7) {
        this.version_ = i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1108x
    public final Object t(AbstractC1108x.d dVar, Object obj, Object obj2) {
        C0246a c0246a = null;
        switch (C0246a.f18376a[dVar.ordinal()]) {
            case 1:
                return new C1797a();
            case 2:
                return new b(c0246a);
            case 3:
                return AbstractC1108x.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 == null) {
                    synchronized (C1797a.class) {
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
