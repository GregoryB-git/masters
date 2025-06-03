package N4;

import com.google.protobuf.AbstractC1136a;
import com.google.protobuf.AbstractC1154t;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.m0;
import com.google.protobuf.r;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class m extends r implements L {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile T PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private E counters_ = E.f();
    private E customAttributes_ = E.f();
    private String name_ = "";
    private AbstractC1154t.e subtraces_ = r.z();
    private AbstractC1154t.e perfSessions_ = r.z();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3684a;

        static {
            int[] iArr = new int[r.c.values().length];
            f3684a = iArr;
            try {
                iArr[r.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3684a[r.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3684a[r.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3684a[r.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3684a[r.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3684a[r.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3684a[r.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends r.a implements L {
        public b() {
            super(m.DEFAULT_INSTANCE);
        }

        public b D(Iterable iterable) {
            y();
            ((m) this.f12237p).d0(iterable);
            return this;
        }

        public b E(Iterable iterable) {
            y();
            ((m) this.f12237p).e0(iterable);
            return this;
        }

        public b F(k kVar) {
            y();
            ((m) this.f12237p).f0(kVar);
            return this;
        }

        public b G(m mVar) {
            y();
            ((m) this.f12237p).g0(mVar);
            return this;
        }

        public b H(Map map) {
            y();
            ((m) this.f12237p).p0().putAll(map);
            return this;
        }

        public b I(Map map) {
            y();
            ((m) this.f12237p).q0().putAll(map);
            return this;
        }

        public b J(String str, long j7) {
            str.getClass();
            y();
            ((m) this.f12237p).p0().put(str, Long.valueOf(j7));
            return this;
        }

        public b K(String str, String str2) {
            str.getClass();
            str2.getClass();
            y();
            ((m) this.f12237p).q0().put(str, str2);
            return this;
        }

        public b L(long j7) {
            y();
            ((m) this.f12237p).A0(j7);
            return this;
        }

        public b M(long j7) {
            y();
            ((m) this.f12237p).B0(j7);
            return this;
        }

        public b N(String str) {
            y();
            ((m) this.f12237p).C0(str);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final D f3685a = D.d(m0.b.f12142y, "", m0.b.f12136s, 0L);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final D f3686a;

        static {
            m0.b bVar = m0.b.f12142y;
            f3686a = D.d(bVar, "", bVar, "");
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        r.Q(m.class, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(long j7) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(Iterable iterable) {
        i0();
        AbstractC1136a.e(iterable, this.perfSessions_);
    }

    private void i0() {
        AbstractC1154t.e eVar = this.perfSessions_;
        if (eVar.p()) {
            return;
        }
        this.perfSessions_ = r.M(eVar);
    }

    public static m n0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map q0() {
        return y0();
    }

    private E y0() {
        if (!this.customAttributes_.n()) {
            this.customAttributes_ = this.customAttributes_.s();
        }
        return this.customAttributes_;
    }

    public static b z0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public final void B0(long j7) {
        this.bitField0_ |= 8;
        this.durationUs_ = j7;
    }

    public final void C0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    public final void e0(Iterable iterable) {
        j0();
        AbstractC1136a.e(iterable, this.subtraces_);
    }

    public final void f0(k kVar) {
        kVar.getClass();
        i0();
        this.perfSessions_.add(kVar);
    }

    public final void g0(m mVar) {
        mVar.getClass();
        j0();
        this.subtraces_.add(mVar);
    }

    public boolean h0(String str) {
        str.getClass();
        return w0().containsKey(str);
    }

    public final void j0() {
        AbstractC1154t.e eVar = this.subtraces_;
        if (eVar.p()) {
            return;
        }
        this.subtraces_ = r.M(eVar);
    }

    public int k0() {
        return v0().size();
    }

    public Map l0() {
        return Collections.unmodifiableMap(v0());
    }

    public Map m0() {
        return Collections.unmodifiableMap(w0());
    }

    public long o0() {
        return this.durationUs_;
    }

    public final Map p0() {
        return x0();
    }

    public String r0() {
        return this.name_;
    }

    public List s0() {
        return this.perfSessions_;
    }

    public List t0() {
        return this.subtraces_;
    }

    public boolean u0() {
        return (this.bitField0_ & 4) != 0;
    }

    public final E v0() {
        return this.counters_;
    }

    public final E w0() {
        return this.customAttributes_;
    }

    @Override // com.google.protobuf.r
    public final Object x(r.c cVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3684a[cVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b(aVar);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f3685a, "subtraces_", m.class, "customAttributes_", d.f3686a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t7 = PARSER;
                if (t7 == null) {
                    synchronized (m.class) {
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

    public final E x0() {
        if (!this.counters_.n()) {
            this.counters_ = this.counters_.s();
        }
        return this.counters_;
    }
}
