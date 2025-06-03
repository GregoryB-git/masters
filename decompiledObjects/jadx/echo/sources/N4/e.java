package N4;

import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;

/* loaded from: classes.dex */
public final class e extends r implements L {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    private static volatile T PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3651a;

        static {
            int[] iArr = new int[r.c.values().length];
            f3651a = iArr;
            try {
                iArr[r.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3651a[r.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3651a[r.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3651a[r.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3651a[r.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3651a[r.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3651a[r.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends r.a implements L {
        public b() {
            super(e.DEFAULT_INSTANCE);
        }

        public b D(long j7) {
            y();
            ((e) this.f12237p).Y(j7);
            return this;
        }

        public b E(long j7) {
            y();
            ((e) this.f12237p).Z(j7);
            return this;
        }

        public b F(long j7) {
            y();
            ((e) this.f12237p).a0(j7);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        r.Q(e.class, eVar);
    }

    public static b X() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(long j7) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j7;
    }

    public final void Z(long j7) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j7;
    }

    public final void a0(long j7) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j7;
    }

    @Override // com.google.protobuf.r
    public final Object x(r.c cVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3651a[cVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new b(aVar);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t7 = PARSER;
                if (t7 == null) {
                    synchronized (e.class) {
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
