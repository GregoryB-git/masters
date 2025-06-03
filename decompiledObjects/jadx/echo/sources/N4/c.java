package N4;

import N4.a;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.m0;
import com.google.protobuf.r;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends r implements L {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile T PARSER;
    private N4.a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private E customAttributes_ = E.f();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3641a;

        static {
            int[] iArr = new int[r.c.values().length];
            f3641a = iArr;
            try {
                iArr[r.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3641a[r.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3641a[r.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3641a[r.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3641a[r.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3641a[r.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3641a[r.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends r.a implements L {
        public b() {
            super(c.DEFAULT_INSTANCE);
        }

        public boolean D() {
            return ((c) this.f12237p).d0();
        }

        public b E(Map map) {
            y();
            ((c) this.f12237p).b0().putAll(map);
            return this;
        }

        public b F(a.b bVar) {
            y();
            ((c) this.f12237p).i0((N4.a) bVar.v());
            return this;
        }

        public b G(String str) {
            y();
            ((c) this.f12237p).j0(str);
            return this;
        }

        public b H(d dVar) {
            y();
            ((c) this.f12237p).k0(dVar);
            return this;
        }

        public b I(String str) {
            y();
            ((c) this.f12237p).l0(str);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* renamed from: N4.c$c, reason: collision with other inner class name */
    public static final class C0069c {

        /* renamed from: a, reason: collision with root package name */
        public static final D f3642a;

        static {
            m0.b bVar = m0.b.f12142y;
            f3642a = D.d(bVar, "", bVar, "");
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        r.Q(c.class, cVar);
    }

    public static c a0() {
        return DEFAULT_INSTANCE;
    }

    public static b h0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public N4.a Z() {
        N4.a aVar = this.androidAppInfo_;
        return aVar == null ? N4.a.X() : aVar;
    }

    public final Map b0() {
        return g0();
    }

    public boolean c0() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean d0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean e0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean f0() {
        return (this.bitField0_ & 1) != 0;
    }

    public final E g0() {
        if (!this.customAttributes_.n()) {
            this.customAttributes_ = this.customAttributes_.s();
        }
        return this.customAttributes_;
    }

    public final void i0(N4.a aVar) {
        aVar.getClass();
        this.androidAppInfo_ = aVar;
        this.bitField0_ |= 4;
    }

    public final void j0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    public final void k0(d dVar) {
        this.applicationProcessState_ = dVar.g();
        this.bitField0_ |= 8;
    }

    public final void l0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    @Override // com.google.protobuf.r
    public final Object x(r.c cVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3641a[cVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b(aVar);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", d.c(), "customAttributes_", C0069c.f3642a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t7 = PARSER;
                if (t7 == null) {
                    synchronized (c.class) {
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
