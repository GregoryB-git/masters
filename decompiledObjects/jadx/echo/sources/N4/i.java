package N4;

import N4.c;
import com.google.protobuf.T;
import com.google.protobuf.r;

/* loaded from: classes.dex */
public final class i extends r implements j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile T PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private c applicationInfo_;
    private int bitField0_;
    private g gaugeMetric_;
    private h networkRequestMetric_;
    private m traceMetric_;
    private n transportInfo_;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3676a;

        static {
            int[] iArr = new int[r.c.values().length];
            f3676a = iArr;
            try {
                iArr[r.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3676a[r.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3676a[r.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3676a[r.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3676a[r.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3676a[r.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3676a[r.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends r.a implements j {
        public b() {
            super(i.DEFAULT_INSTANCE);
        }

        public b D(c.b bVar) {
            y();
            ((i) this.f12237p).b0((c) bVar.v());
            return this;
        }

        public b E(g gVar) {
            y();
            ((i) this.f12237p).c0(gVar);
            return this;
        }

        public b F(h hVar) {
            y();
            ((i) this.f12237p).d0(hVar);
            return this;
        }

        public b G(m mVar) {
            y();
            ((i) this.f12237p).e0(mVar);
            return this;
        }

        @Override // N4.j
        public boolean f() {
            return ((i) this.f12237p).f();
        }

        @Override // N4.j
        public g g() {
            return ((i) this.f12237p).g();
        }

        @Override // N4.j
        public boolean l() {
            return ((i) this.f12237p).l();
        }

        @Override // N4.j
        public m n() {
            return ((i) this.f12237p).n();
        }

        @Override // N4.j
        public boolean o() {
            return ((i) this.f12237p).o();
        }

        @Override // N4.j
        public h p() {
            return ((i) this.f12237p).p();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        r.Q(i.class, iVar);
    }

    public static b a0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public c Y() {
        c cVar = this.applicationInfo_;
        return cVar == null ? c.a0() : cVar;
    }

    public boolean Z() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void b0(c cVar) {
        cVar.getClass();
        this.applicationInfo_ = cVar;
        this.bitField0_ |= 1;
    }

    public final void c0(g gVar) {
        gVar.getClass();
        this.gaugeMetric_ = gVar;
        this.bitField0_ |= 8;
    }

    public final void d0(h hVar) {
        hVar.getClass();
        this.networkRequestMetric_ = hVar;
        this.bitField0_ |= 4;
    }

    public final void e0(m mVar) {
        mVar.getClass();
        this.traceMetric_ = mVar;
        this.bitField0_ |= 2;
    }

    @Override // N4.j
    public boolean f() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // N4.j
    public g g() {
        g gVar = this.gaugeMetric_;
        return gVar == null ? g.e0() : gVar;
    }

    @Override // N4.j
    public boolean l() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // N4.j
    public m n() {
        m mVar = this.traceMetric_;
        return mVar == null ? m.n0() : mVar;
    }

    @Override // N4.j
    public boolean o() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // N4.j
    public h p() {
        h hVar = this.networkRequestMetric_;
        return hVar == null ? h.m0() : hVar;
    }

    @Override // com.google.protobuf.r
    public final Object x(r.c cVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3676a[cVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t7 = PARSER;
                if (t7 == null) {
                    synchronized (i.class) {
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
