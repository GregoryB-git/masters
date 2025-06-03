package p3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1108x;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* renamed from: p3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1801e extends AbstractC1108x implements P {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C1801e DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    private C1803g aesCtrKeyFormat_;
    private w hmacKeyFormat_;

    /* renamed from: p3.e$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18380a;

        static {
            int[] iArr = new int[AbstractC1108x.d.values().length];
            f18380a = iArr;
            try {
                iArr[AbstractC1108x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18380a[AbstractC1108x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18380a[AbstractC1108x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18380a[AbstractC1108x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18380a[AbstractC1108x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18380a[AbstractC1108x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18380a[AbstractC1108x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: p3.e$b */
    public static final class b extends AbstractC1108x.a implements P {
        public b() {
            super(C1801e.DEFAULT_INSTANCE);
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

        public b y(C1803g c1803g) {
            s();
            ((C1801e) this.f11542p).b0(c1803g);
            return this;
        }

        public b z(w wVar) {
            s();
            ((C1801e) this.f11542p).c0(wVar);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        C1801e c1801e = new C1801e();
        DEFAULT_INSTANCE = c1801e;
        AbstractC1108x.Q(C1801e.class, c1801e);
    }

    public static b Z() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static C1801e a0(AbstractC1093h abstractC1093h, C1101p c1101p) {
        return (C1801e) AbstractC1108x.K(DEFAULT_INSTANCE, abstractC1093h, c1101p);
    }

    public C1803g X() {
        C1803g c1803g = this.aesCtrKeyFormat_;
        return c1803g == null ? C1803g.X() : c1803g;
    }

    public w Y() {
        w wVar = this.hmacKeyFormat_;
        return wVar == null ? w.X() : wVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ O b() {
        return super.w();
    }

    public final void b0(C1803g c1803g) {
        c1803g.getClass();
        this.aesCtrKeyFormat_ = c1803g;
    }

    public final void c0(w wVar) {
        wVar.getClass();
        this.hmacKeyFormat_ = wVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public /* bridge */ /* synthetic */ O.a d() {
        return super.H();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1108x
    public final Object t(AbstractC1108x.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f18380a[dVar.ordinal()]) {
            case 1:
                return new C1801e();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC1108x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 == null) {
                    synchronized (C1801e.class) {
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
