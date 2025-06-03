package N4;

import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;

/* loaded from: classes.dex */
public final class a extends r implements L {
    private static final a DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile T PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* renamed from: N4.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0067a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3639a;

        static {
            int[] iArr = new int[r.c.values().length];
            f3639a = iArr;
            try {
                iArr[r.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3639a[r.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3639a[r.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3639a[r.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3639a[r.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3639a[r.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3639a[r.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends r.a implements L {
        public b() {
            super(a.DEFAULT_INSTANCE);
        }

        public b D(String str) {
            y();
            ((a) this.f12237p).b0(str);
            return this;
        }

        public b E(String str) {
            y();
            ((a) this.f12237p).c0(str);
            return this;
        }

        public b F(String str) {
            y();
            ((a) this.f12237p).d0(str);
            return this;
        }

        public /* synthetic */ b(C0067a c0067a) {
            this();
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        r.Q(a.class, aVar);
    }

    public static a X() {
        return DEFAULT_INSTANCE;
    }

    public static b a0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public boolean Y() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean Z() {
        return (this.bitField0_ & 2) != 0;
    }

    public final void b0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    public final void c0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    public final void d0(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    @Override // com.google.protobuf.r
    public final Object x(r.c cVar, Object obj, Object obj2) {
        C0067a c0067a = null;
        switch (C0067a.f3639a[cVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0067a);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t7 = PARSER;
                if (t7 == null) {
                    synchronized (a.class) {
                        try {
                            t7 = PARSER;
                            if (t7 == null) {
                                t7 = new r.b(DEFAULT_INSTANCE);
                                PARSER = t7;
                            }
                        } finally {
                        }
                    }
                }
                return t7;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
