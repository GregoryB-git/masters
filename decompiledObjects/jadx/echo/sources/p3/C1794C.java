package p3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1108x;
import com.google.crypto.tink.shaded.protobuf.AbstractC1110z;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: p3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1794C extends AbstractC1108x implements P {
    private static final C1794C DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile X PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private AbstractC1110z.d key_ = AbstractC1108x.u();
    private int primaryKeyId_;

    /* renamed from: p3.C$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18358a;

        static {
            int[] iArr = new int[AbstractC1108x.d.values().length];
            f18358a = iArr;
            try {
                iArr[AbstractC1108x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18358a[AbstractC1108x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18358a[AbstractC1108x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18358a[AbstractC1108x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18358a[AbstractC1108x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18358a[AbstractC1108x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18358a[AbstractC1108x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: p3.C$b */
    public static final class b extends AbstractC1108x.a implements P {
        public b() {
            super(C1794C.DEFAULT_INSTANCE);
        }

        public int A() {
            return ((C1794C) this.f11542p).a0();
        }

        public List B() {
            return Collections.unmodifiableList(((C1794C) this.f11542p).b0());
        }

        public b C(int i7) {
            s();
            ((C1794C) this.f11542p).g0(i7);
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
            ((C1794C) this.f11542p).X(cVar);
            return this;
        }

        public c z(int i7) {
            return ((C1794C) this.f11542p).Z(i7);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* renamed from: p3.C$c */
    public static final class c extends AbstractC1108x implements P {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile X PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* renamed from: p3.C$c$a */
        public static final class a extends AbstractC1108x.a implements P {
            public a() {
                super(c.DEFAULT_INSTANCE);
            }

            public a A(I i7) {
                s();
                ((c) this.f11542p).h0(i7);
                return this;
            }

            public a B(z zVar) {
                s();
                ((c) this.f11542p).i0(zVar);
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

            public a y(y yVar) {
                s();
                ((c) this.f11542p).f0(yVar);
                return this;
            }

            public a z(int i7) {
                s();
                ((c) this.f11542p).g0(i7);
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

        public static a e0() {
            return (a) DEFAULT_INSTANCE.q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h0(I i7) {
            this.outputPrefixType_ = i7.g();
        }

        public y Z() {
            y yVar = this.keyData_;
            return yVar == null ? y.Y() : yVar;
        }

        public int a0() {
            return this.keyId_;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public /* bridge */ /* synthetic */ O b() {
            return super.w();
        }

        public I b0() {
            I c7 = I.c(this.outputPrefixType_);
            return c7 == null ? I.UNRECOGNIZED : c7;
        }

        public z c0() {
            z c7 = z.c(this.status_);
            return c7 == null ? z.UNRECOGNIZED : c7;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.O
        public /* bridge */ /* synthetic */ O.a d() {
            return super.H();
        }

        public boolean d0() {
            return this.keyData_ != null;
        }

        public final void f0(y yVar) {
            yVar.getClass();
            this.keyData_ = yVar;
        }

        public final void g0(int i7) {
            this.keyId_ = i7;
        }

        public final void i0(z zVar) {
            this.status_ = zVar.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1108x
        public final Object t(AbstractC1108x.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f18358a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC1108x.I(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        C1794C c1794c = new C1794C();
        DEFAULT_INSTANCE = c1794c;
        AbstractC1108x.Q(C1794C.class, c1794c);
    }

    public static b d0() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static C1794C e0(InputStream inputStream, C1101p c1101p) {
        return (C1794C) AbstractC1108x.L(DEFAULT_INSTANCE, inputStream, c1101p);
    }

    public static C1794C f0(byte[] bArr, C1101p c1101p) {
        return (C1794C) AbstractC1108x.M(DEFAULT_INSTANCE, bArr, c1101p);
    }

    public final void X(c cVar) {
        cVar.getClass();
        Y();
        this.key_.add(cVar);
    }

    public final void Y() {
        AbstractC1110z.d dVar = this.key_;
        if (dVar.p()) {
            return;
        }
        this.key_ = AbstractC1108x.G(dVar);
    }

    public c Z(int i7) {
        return (c) this.key_.get(i7);
    }

    public int a0() {
        return this.key_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ O b() {
        return super.w();
    }

    public List b0() {
        return this.key_;
    }

    public int c0() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public /* bridge */ /* synthetic */ O.a d() {
        return super.H();
    }

    public final void g0(int i7) {
        this.primaryKeyId_ = i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1108x
    public final Object t(AbstractC1108x.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f18358a[dVar.ordinal()]) {
            case 1:
                return new C1794C();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC1108x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 == null) {
                    synchronized (C1794C.class) {
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
