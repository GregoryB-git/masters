package N4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.protobuf.AbstractC1136a;
import com.google.protobuf.AbstractC1154t;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.m0;
import com.google.protobuf.r;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends r implements L {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile T PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private E customAttributes_ = E.f();
    private String url_ = "";
    private String responseContentType_ = "";
    private AbstractC1154t.e perfSessions_ = r.z();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3654a;

        static {
            int[] iArr = new int[r.c.values().length];
            f3654a = iArr;
            try {
                iArr[r.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3654a[r.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3654a[r.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3654a[r.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3654a[r.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3654a[r.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3654a[r.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends r.a implements L {
        public b() {
            super(h.DEFAULT_INSTANCE);
        }

        public b D(Iterable iterable) {
            y();
            ((h) this.f12237p).i0(iterable);
            return this;
        }

        public b E() {
            y();
            ((h) this.f12237p).p0().clear();
            return this;
        }

        public b F() {
            y();
            ((h) this.f12237p).j0();
            return this;
        }

        public long G() {
            return ((h) this.f12237p).w0();
        }

        public String H() {
            return ((h) this.f12237p).x0();
        }

        public boolean I() {
            return ((h) this.f12237p).y0();
        }

        public boolean J() {
            return ((h) this.f12237p).A0();
        }

        public boolean K() {
            return ((h) this.f12237p).E0();
        }

        public b L(Map map) {
            y();
            ((h) this.f12237p).p0().putAll(map);
            return this;
        }

        public b M(long j7) {
            y();
            ((h) this.f12237p).I0(j7);
            return this;
        }

        public b N(d dVar) {
            y();
            ((h) this.f12237p).J0(dVar);
            return this;
        }

        public b O(int i7) {
            y();
            ((h) this.f12237p).K0(i7);
            return this;
        }

        public b P(e eVar) {
            y();
            ((h) this.f12237p).L0(eVar);
            return this;
        }

        public b Q(long j7) {
            y();
            ((h) this.f12237p).M0(j7);
            return this;
        }

        public b R(String str) {
            y();
            ((h) this.f12237p).N0(str);
            return this;
        }

        public b S(long j7) {
            y();
            ((h) this.f12237p).O0(j7);
            return this;
        }

        public b T(long j7) {
            y();
            ((h) this.f12237p).P0(j7);
            return this;
        }

        public b U(long j7) {
            y();
            ((h) this.f12237p).Q0(j7);
            return this;
        }

        public b V(long j7) {
            y();
            ((h) this.f12237p).R0(j7);
            return this;
        }

        public b W(String str) {
            y();
            ((h) this.f12237p).S0(str);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final D f3655a;

        static {
            m0.b bVar = m0.b.f12142y;
            f3655a = D.d(bVar, "", bVar, "");
        }
    }

    public enum d implements AbstractC1154t.a {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);


        /* renamed from: z, reason: collision with root package name */
        public static final AbstractC1154t.b f3667z = new a();

        /* renamed from: o, reason: collision with root package name */
        public final int f3668o;

        public class a implements AbstractC1154t.b {
        }

        public static final class b implements AbstractC1154t.c {

            /* renamed from: a, reason: collision with root package name */
            public static final AbstractC1154t.c f3669a = new b();
        }

        d(int i7) {
            this.f3668o = i7;
        }

        public static d c(int i7) {
            switch (i7) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static AbstractC1154t.c e() {
            return b.f3669a;
        }

        @Override // com.google.protobuf.AbstractC1154t.a
        public final int g() {
            return this.f3668o;
        }
    }

    public enum e implements AbstractC1154t.a {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);


        /* renamed from: r, reason: collision with root package name */
        public static final AbstractC1154t.b f3672r = new a();

        /* renamed from: o, reason: collision with root package name */
        public final int f3674o;

        public class a implements AbstractC1154t.b {
        }

        public static final class b implements AbstractC1154t.c {

            /* renamed from: a, reason: collision with root package name */
            public static final AbstractC1154t.c f3675a = new b();
        }

        e(int i7) {
            this.f3674o = i7;
        }

        public static AbstractC1154t.c c() {
            return b.f3675a;
        }

        @Override // com.google.protobuf.AbstractC1154t.a
        public final int g() {
            return this.f3674o;
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        r.Q(h.class, hVar);
    }

    private E G0() {
        if (!this.customAttributes_.n()) {
            this.customAttributes_ = this.customAttributes_.s();
        }
        return this.customAttributes_;
    }

    public static b H0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public static h m0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map p0() {
        return G0();
    }

    public boolean A0() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean B0() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean C0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean D0() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean E0() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean F0() {
        return (this.bitField0_ & 512) != 0;
    }

    public final void I0(long j7) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j7;
    }

    public final void J0(d dVar) {
        this.httpMethod_ = dVar.g();
        this.bitField0_ |= 2;
    }

    public final void K0(int i7) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i7;
    }

    public final void L0(e eVar) {
        this.networkClientErrorReason_ = eVar.g();
        this.bitField0_ |= 16;
    }

    public final void M0(long j7) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j7;
    }

    public final void N0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    public final void O0(long j7) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j7;
    }

    public final void P0(long j7) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j7;
    }

    public final void Q0(long j7) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j7;
    }

    public final void R0(long j7) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j7;
    }

    public final void S0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    public final void i0(Iterable iterable) {
        k0();
        AbstractC1136a.e(iterable, this.perfSessions_);
    }

    public final void j0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = m0().s0();
    }

    public final void k0() {
        AbstractC1154t.e eVar = this.perfSessions_;
        if (eVar.p()) {
            return;
        }
        this.perfSessions_ = r.M(eVar);
    }

    public long l0() {
        return this.clientStartTimeUs_;
    }

    public d n0() {
        d c7 = d.c(this.httpMethod_);
        return c7 == null ? d.HTTP_METHOD_UNKNOWN : c7;
    }

    public int o0() {
        return this.httpResponseCode_;
    }

    public List q0() {
        return this.perfSessions_;
    }

    public long r0() {
        return this.requestPayloadBytes_;
    }

    public String s0() {
        return this.responseContentType_;
    }

    public long t0() {
        return this.responsePayloadBytes_;
    }

    public long u0() {
        return this.timeToRequestCompletedUs_;
    }

    public long v0() {
        return this.timeToResponseCompletedUs_;
    }

    public long w0() {
        return this.timeToResponseInitiatedUs_;
    }

    @Override // com.google.protobuf.r
    public final Object x(r.c cVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3654a[cVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new b(aVar);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.e(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.c(), "customAttributes_", c.f3655a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t7 = PARSER;
                if (t7 == null) {
                    synchronized (h.class) {
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

    public String x0() {
        return this.url_;
    }

    public boolean y0() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean z0() {
        return (this.bitField0_ & 2) != 0;
    }
}
