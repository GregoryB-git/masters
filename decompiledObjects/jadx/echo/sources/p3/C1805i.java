package p3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1108x;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* renamed from: p3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1805i extends AbstractC1108x implements P {
    private static final C1805i DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1093h keyValue_ = AbstractC1093h.f11337p;
    private C1807k params_;
    private int version_;

    /* renamed from: p3.i$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18384a;

        static {
            int[] iArr = new int[AbstractC1108x.d.values().length];
            f18384a = iArr;
            try {
                iArr[AbstractC1108x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18384a[AbstractC1108x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18384a[AbstractC1108x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18384a[AbstractC1108x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18384a[AbstractC1108x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18384a[AbstractC1108x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18384a[AbstractC1108x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: p3.i$b */
    public static final class b extends AbstractC1108x.a implements P {
        public b() {
            super(C1805i.DEFAULT_INSTANCE);
        }

        public b A(int i7) {
            s();
            ((C1805i) this.f11542p).f0(i7);
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
            ((C1805i) this.f11542p).d0(abstractC1093h);
            return this;
        }

        public b z(C1807k c1807k) {
            s();
            ((C1805i) this.f11542p).e0(c1807k);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        C1805i c1805i = new C1805i();
        DEFAULT_INSTANCE = c1805i;
        AbstractC1108x.Q(C1805i.class, c1805i);
    }

    public static b b0() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static C1805i c0(AbstractC1093h abstractC1093h, C1101p c1101p) {
        return (C1805i) AbstractC1108x.K(DEFAULT_INSTANCE, abstractC1093h, c1101p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(AbstractC1093h abstractC1093h) {
        abstractC1093h.getClass();
        this.keyValue_ = abstractC1093h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i7) {
        this.version_ = i7;
    }

    public AbstractC1093h Y() {
        return this.keyValue_;
    }

    public C1807k Z() {
        C1807k c1807k = this.params_;
        return c1807k == null ? C1807k.W() : c1807k;
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

    public final void e0(C1807k c1807k) {
        c1807k.getClass();
        this.params_ = c1807k;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1108x
    public final Object t(AbstractC1108x.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f18384a[dVar.ordinal()]) {
            case 1:
                return new C1805i();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC1108x.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 == null) {
                    synchronized (C1805i.class) {
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
