package p3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1108x;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* loaded from: classes.dex */
public final class G extends AbstractC1108x implements P {
    private static final G DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private H params_;
    private int version_;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18362a;

        static {
            int[] iArr = new int[AbstractC1108x.d.values().length];
            f18362a = iArr;
            try {
                iArr[AbstractC1108x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18362a[AbstractC1108x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18362a[AbstractC1108x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18362a[AbstractC1108x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18362a[AbstractC1108x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18362a[AbstractC1108x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18362a[AbstractC1108x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC1108x.a implements P {
        public b() {
            super(G.DEFAULT_INSTANCE);
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

        public b y(H h7) {
            s();
            ((G) this.f11542p).b0(h7);
            return this;
        }

        public b z(int i7) {
            s();
            ((G) this.f11542p).c0(i7);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        G g7 = new G();
        DEFAULT_INSTANCE = g7;
        AbstractC1108x.Q(G.class, g7);
    }

    public static b Z() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static G a0(AbstractC1093h abstractC1093h, C1101p c1101p) {
        return (G) AbstractC1108x.K(DEFAULT_INSTANCE, abstractC1093h, c1101p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i7) {
        this.version_ = i7;
    }

    public H X() {
        H h7 = this.params_;
        return h7 == null ? H.V() : h7;
    }

    public int Y() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ O b() {
        return super.w();
    }

    public final void b0(H h7) {
        h7.getClass();
        this.params_ = h7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public /* bridge */ /* synthetic */ O.a d() {
        return super.H();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1108x
    public final Object t(AbstractC1108x.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f18362a[dVar.ordinal()]) {
            case 1:
                return new G();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC1108x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 == null) {
                    synchronized (G.class) {
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
