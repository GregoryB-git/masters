package N4;

import com.google.protobuf.AbstractC1154t;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;

/* loaded from: classes.dex */
public final class g extends r implements L {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile T PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private f gaugeMetadata_;
    private String sessionId_ = "";
    private AbstractC1154t.e cpuMetricReadings_ = r.z();
    private AbstractC1154t.e androidMemoryReadings_ = r.z();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3653a;

        static {
            int[] iArr = new int[r.c.values().length];
            f3653a = iArr;
            try {
                iArr[r.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3653a[r.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3653a[r.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3653a[r.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3653a[r.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3653a[r.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3653a[r.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends r.a implements L {
        public b() {
            super(g.DEFAULT_INSTANCE);
        }

        public b D(N4.b bVar) {
            y();
            ((g) this.f12237p).Y(bVar);
            return this;
        }

        public b E(e eVar) {
            y();
            ((g) this.f12237p).Z(eVar);
            return this;
        }

        public b F(f fVar) {
            y();
            ((g) this.f12237p).j0(fVar);
            return this;
        }

        public b G(String str) {
            y();
            ((g) this.f12237p).k0(str);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        r.Q(g.class, gVar);
    }

    public static g e0() {
        return DEFAULT_INSTANCE;
    }

    public static b i0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public final void Y(N4.b bVar) {
        bVar.getClass();
        a0();
        this.androidMemoryReadings_.add(bVar);
    }

    public final void Z(e eVar) {
        eVar.getClass();
        b0();
        this.cpuMetricReadings_.add(eVar);
    }

    public final void a0() {
        AbstractC1154t.e eVar = this.androidMemoryReadings_;
        if (eVar.p()) {
            return;
        }
        this.androidMemoryReadings_ = r.M(eVar);
    }

    public final void b0() {
        AbstractC1154t.e eVar = this.cpuMetricReadings_;
        if (eVar.p()) {
            return;
        }
        this.cpuMetricReadings_ = r.M(eVar);
    }

    public int c0() {
        return this.androidMemoryReadings_.size();
    }

    public int d0() {
        return this.cpuMetricReadings_.size();
    }

    public f f0() {
        f fVar = this.gaugeMetadata_;
        return fVar == null ? f.X() : fVar;
    }

    public boolean g0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean h0() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void j0(f fVar) {
        fVar.getClass();
        this.gaugeMetadata_ = fVar;
        this.bitField0_ |= 2;
    }

    public final void k0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.r
    public final Object x(r.c cVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3653a[cVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new b(aVar);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", e.class, "gaugeMetadata_", "androidMemoryReadings_", N4.b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t7 = PARSER;
                if (t7 == null) {
                    synchronized (g.class) {
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
