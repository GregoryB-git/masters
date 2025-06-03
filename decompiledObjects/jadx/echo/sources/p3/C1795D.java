package p3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1108x;
import com.google.crypto.tink.shaded.protobuf.AbstractC1110z;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* renamed from: p3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1795D extends AbstractC1108x implements P {
    private static final C1795D DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile X PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private AbstractC1110z.d keyInfo_ = AbstractC1108x.u();
    private int primaryKeyId_;

    /* renamed from: p3.D$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18359a;

        static {
            int[] iArr = new int[AbstractC1108x.d.values().length];
            f18359a = iArr;
            try {
                iArr[AbstractC1108x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18359a[AbstractC1108x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18359a[AbstractC1108x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18359a[AbstractC1108x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18359a[AbstractC1108x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18359a[AbstractC1108x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18359a[AbstractC1108x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: p3.D$b */
    public static final class b extends AbstractC1108x.a implements P {
        public b() {
            super(C1795D.DEFAULT_INSTANCE);
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
            ((C1795D) this.f11542p).X(cVar);
            return this;
        }

        public b z(int i7) {
            s();
            ((C1795D) this.f11542p).b0(i7);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* renamed from: p3.D$c */
    public static final class c extends AbstractC1108x implements P {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile X PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* renamed from: p3.D$c$a */
        public static final class a extends AbstractC1108x.a implements P {
            public a() {
                super(c.DEFAULT_INSTANCE);
            }

            public a A(z zVar) {
                s();
                ((c) this.f11542p).d0(zVar);
                return this;
            }

            public a B(String str) {
                s();
                ((c) this.f11542p).e0(str);
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

            public a y(int i7) {
                s();
                ((c) this.f11542p).b0(i7);
                return this;
            }

            public a z(I i7) {
                s();
                ((c) this.f11542p).c0(i7);
                return this;
            }

            public /* synthetic */ a(a aVar) {
                this();
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC1108x.Q(c.class, cVar);
        }

        public static a a0() {
            return (a) DEFAULT_INSTANCE.q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b0(int i7) {
            this.keyId_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c0(I i7) {
            this.outputPrefixType_ = i7.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d0(z zVar) {
            this.status_ = zVar.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public int Z() {
            return this.keyId_;
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
            switch (a.f18359a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC1108x.I(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    X x7 = PARSER;
                    if (x7 == null) {
                        synchronized (c.class) {
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

    static {
        C1795D c1795d = new C1795D();
        DEFAULT_INSTANCE = c1795d;
        AbstractC1108x.Q(C1795D.class, c1795d);
    }

    public static b a0() {
        return (b) DEFAULT_INSTANCE.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(int i7) {
        this.primaryKeyId_ = i7;
    }

    public final void X(c cVar) {
        cVar.getClass();
        Y();
        this.keyInfo_.add(cVar);
    }

    public final void Y() {
        AbstractC1110z.d dVar = this.keyInfo_;
        if (dVar.p()) {
            return;
        }
        this.keyInfo_ = AbstractC1108x.G(dVar);
    }

    public c Z(int i7) {
        return (c) this.keyInfo_.get(i7);
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
        switch (a.f18359a[dVar.ordinal()]) {
            case 1:
                return new C1795D();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC1108x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 == null) {
                    synchronized (C1795D.class) {
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
