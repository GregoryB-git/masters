package G4;

import M4.o;
import N4.h;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j extends B4.b implements J4.b {

    /* renamed from: A, reason: collision with root package name */
    public static final F4.a f2099A = F4.a.e();

    /* renamed from: s, reason: collision with root package name */
    public final List f2100s;

    /* renamed from: t, reason: collision with root package name */
    public final GaugeManager f2101t;

    /* renamed from: u, reason: collision with root package name */
    public final L4.k f2102u;

    /* renamed from: v, reason: collision with root package name */
    public final h.b f2103v;

    /* renamed from: w, reason: collision with root package name */
    public final WeakReference f2104w;

    /* renamed from: x, reason: collision with root package name */
    public String f2105x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2106y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2107z;

    public j(L4.k kVar) {
        this(kVar, B4.a.b(), GaugeManager.getInstance());
    }

    public static j h(L4.k kVar) {
        return new j(kVar);
    }

    private boolean m() {
        return this.f2103v.I();
    }

    private boolean n() {
        return this.f2103v.K();
    }

    public static boolean o(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    public j A(long j7) {
        this.f2103v.U(j7);
        if (SessionManager.getInstance().perfSession().e()) {
            this.f2101t.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public j B(long j7) {
        this.f2103v.V(j7);
        return this;
    }

    public j C(String str) {
        if (str != null) {
            this.f2103v.W(o.e(o.d(str), 2000));
        }
        return this;
    }

    public j E(String str) {
        this.f2105x = str;
        return this;
    }

    @Override // J4.b
    public void a(J4.a aVar) {
        if (aVar == null) {
            f2099A.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else {
            if (!m() || n()) {
                return;
            }
            this.f2100s.add(aVar);
        }
    }

    public N4.h g() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f2104w);
        f();
        N4.k[] b7 = J4.a.b(i());
        if (b7 != null) {
            this.f2103v.D(Arrays.asList(b7));
        }
        N4.h hVar = (N4.h) this.f2103v.v();
        if (!I4.j.c(this.f2105x)) {
            f2099A.a("Dropping network request from a 'User-Agent' that is not allowed");
            return hVar;
        }
        if (this.f2106y) {
            if (this.f2107z) {
                f2099A.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return hVar;
        }
        this.f2102u.C(hVar, c());
        this.f2106y = true;
        return hVar;
    }

    public List i() {
        List unmodifiableList;
        synchronized (this.f2100s) {
            try {
                ArrayList arrayList = new ArrayList();
                for (J4.a aVar : this.f2100s) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return unmodifiableList;
    }

    public long j() {
        return this.f2103v.G();
    }

    public String k() {
        return this.f2103v.H();
    }

    public boolean l() {
        return this.f2103v.J();
    }

    public j p(Map map) {
        this.f2103v.E().L(map);
        return this;
    }

    public j q(String str) {
        h.d dVar;
        if (str != null) {
            h.d dVar2 = h.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            switch (upperCase) {
                case "OPTIONS":
                    dVar = h.d.OPTIONS;
                    break;
                case "GET":
                    dVar = h.d.GET;
                    break;
                case "PUT":
                    dVar = h.d.PUT;
                    break;
                case "HEAD":
                    dVar = h.d.HEAD;
                    break;
                case "POST":
                    dVar = h.d.POST;
                    break;
                case "PATCH":
                    dVar = h.d.PATCH;
                    break;
                case "TRACE":
                    dVar = h.d.TRACE;
                    break;
                case "CONNECT":
                    dVar = h.d.CONNECT;
                    break;
                case "DELETE":
                    dVar = h.d.DELETE;
                    break;
                default:
                    dVar = h.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f2103v.N(dVar);
        }
        return this;
    }

    public j r(int i7) {
        this.f2103v.O(i7);
        return this;
    }

    public void t() {
        this.f2107z = true;
    }

    public j u() {
        this.f2103v.P(h.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public j v(long j7) {
        this.f2103v.Q(j7);
        return this;
    }

    public j w(long j7) {
        J4.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f2104w);
        this.f2103v.M(j7);
        a(perfSession);
        if (perfSession.e()) {
            this.f2101t.collectGaugeMetricOnce(perfSession.d());
        }
        return this;
    }

    public j x(String str) {
        if (str == null) {
            this.f2103v.F();
            return this;
        }
        if (o(str)) {
            this.f2103v.R(str);
        } else {
            f2099A.j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    public j y(long j7) {
        this.f2103v.S(j7);
        return this;
    }

    public j z(long j7) {
        this.f2103v.T(j7);
        return this;
    }

    public j(L4.k kVar, B4.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f2103v = N4.h.H0();
        this.f2104w = new WeakReference(this);
        this.f2102u = kVar;
        this.f2101t = gaugeManager;
        this.f2100s = Collections.synchronizedList(new ArrayList());
        e();
    }
}
