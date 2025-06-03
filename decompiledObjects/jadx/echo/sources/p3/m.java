package p3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1108x;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* loaded from: classes.dex */
public final class m extends AbstractC1108x implements P {
    private static final m DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18388a;

        static {
            int[] iArr = new int[AbstractC1108x.d.values().length];
            f18388a = iArr;
            try {
                iArr[AbstractC1108x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18388a[AbstractC1108x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18388a[AbstractC1108x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18388a[AbstractC1108x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18388a[AbstractC1108x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18388a[AbstractC1108x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18388a[AbstractC1108x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC1108x.a implements P {
        public b() {
            super(m.DEFAULT_INSTANCE);
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

        public b y(int i7) {
            s();
            ((m) this.f11542p).Z(i7);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        AbstractC1108x.Q(m.class, mVar);
    }

    public static b X() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static m Y(AbstractC1093h abstractC1093h, C1101p c1101p) {
        return (m) AbstractC1108x.K(DEFAULT_INSTANCE, abstractC1093h, c1101p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(int i7) {
        this.keySize_ = i7;
    }

    public int W() {
        return this.keySize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ O b() {
        return super.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public /* bridge */ /* synthetic */ O.a d() {
        return super.H();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1108x
    public final Object t(AbstractC1108x.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f18388a[dVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC1108x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 == null) {
                    synchronized (m.class) {
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
