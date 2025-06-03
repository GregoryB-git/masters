// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G4;

import com.google.protobuf.r;
import java.util.Map;
import java.util.Iterator;
import java.util.Arrays;
import M4.o;
import com.google.firebase.perf.session.SessionManager;
import java.util.Collections;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import N4.h;
import L4.k;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.List;
import F4.a;
import B4.b;

public final class j extends b implements J4.b
{
    public static final a A;
    public final List s;
    public final GaugeManager t;
    public final k u;
    public final h.b v;
    public final WeakReference w;
    public String x;
    public boolean y;
    public boolean z;
    
    static {
        A = a.e();
    }
    
    public j(final k k) {
        this(k, B4.a.b(), GaugeManager.getInstance());
    }
    
    public j(final k u, final B4.a a, final GaugeManager t) {
        super(a);
        this.v = h.H0();
        this.w = new WeakReference((T)this);
        this.u = u;
        this.t = t;
        this.s = Collections.synchronizedList(new ArrayList<Object>());
        this.e();
    }
    
    public static j h(final k k) {
        return new j(k);
    }
    
    private boolean m() {
        return this.v.I();
    }
    
    private boolean n() {
        return this.v.K();
    }
    
    public static boolean o(final String s) {
        if (s.length() > 128) {
            return false;
        }
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 <= '\u001f') {
                return false;
            }
            if (char1 > '\u007f') {
                return false;
            }
        }
        return true;
    }
    
    public j A(final long n) {
        this.v.U(n);
        if (SessionManager.getInstance().perfSession().e()) {
            this.t.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }
    
    public j B(final long n) {
        this.v.V(n);
        return this;
    }
    
    public j C(String d) {
        if (d != null) {
            d = M4.o.d(d);
            this.v.W(M4.o.e(d, 2000));
        }
        return this;
    }
    
    public j E(final String x) {
        this.x = x;
        return this;
    }
    
    @Override
    public void a(final J4.a a) {
        if (a == null) {
            j.A.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        if (this.m() && !this.n()) {
            this.s.add(a);
        }
    }
    
    public h g() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.w);
        this.f();
        final N4.k[] b = J4.a.b(this.i());
        if (b != null) {
            this.v.D(Arrays.asList(b));
        }
        final h h = (h)((r.a)this.v).v();
        if (!I4.j.c(this.x)) {
            j.A.a("Dropping network request from a 'User-Agent' that is not allowed");
            return h;
        }
        if (!this.y) {
            this.u.C(h, this.c());
            this.y = true;
            return h;
        }
        if (this.z) {
            j.A.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
        }
        return h;
    }
    
    public List i() {
        final List s = this.s;
        // monitorenter(s)
        while (true) {
            try {
                final ArrayList<J4.a> list = new ArrayList<J4.a>();
                for (final J4.a e : this.s) {
                    if (e != null) {
                        list.add(e);
                    }
                }
                // monitorexit(s)
                return Collections.unmodifiableList((List<?>)list);
                // monitorexit(s)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public long j() {
        return this.v.G();
    }
    
    public String k() {
        return this.v.H();
    }
    
    public boolean l() {
        return this.v.J();
    }
    
    public j p(final Map map) {
        this.v.E().L(map);
        return this;
    }
    
    public j q(String upperCase) {
        if (upperCase != null) {
            final h.d p = h.d.p;
            upperCase = upperCase.toUpperCase();
            upperCase.hashCode();
            final int hashCode = upperCase.hashCode();
            int n = -1;
            switch (hashCode) {
                case 2012838315: {
                    if (!upperCase.equals("DELETE")) {
                        break;
                    }
                    n = 8;
                    break;
                }
                case 1669334218: {
                    if (!upperCase.equals("CONNECT")) {
                        break;
                    }
                    n = 7;
                    break;
                }
                case 80083237: {
                    if (!upperCase.equals("TRACE")) {
                        break;
                    }
                    n = 6;
                    break;
                }
                case 75900968: {
                    if (!upperCase.equals("PATCH")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case 2461856: {
                    if (!upperCase.equals("POST")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case 2213344: {
                    if (!upperCase.equals("HEAD")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case 79599: {
                    if (!upperCase.equals("PUT")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case 70454: {
                    if (!upperCase.equals("GET")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -531492226: {
                    if (!upperCase.equals("OPTIONS")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            h.d d = null;
            switch (n) {
                default: {
                    d = h.d.p;
                    break;
                }
                case 8: {
                    d = h.d.t;
                    break;
                }
                case 7: {
                    d = h.d.y;
                    break;
                }
                case 6: {
                    d = h.d.x;
                    break;
                }
                case 5: {
                    d = h.d.v;
                    break;
                }
                case 4: {
                    d = h.d.s;
                    break;
                }
                case 3: {
                    d = h.d.u;
                    break;
                }
                case 2: {
                    d = h.d.r;
                    break;
                }
                case 1: {
                    d = h.d.q;
                    break;
                }
                case 0: {
                    d = h.d.w;
                    break;
                }
            }
            this.v.N(d);
        }
        return this;
    }
    
    public j r(final int n) {
        this.v.O(n);
        return this;
    }
    
    public void t() {
        this.z = true;
    }
    
    public j u() {
        this.v.P(h.e.q);
        return this;
    }
    
    public j v(final long n) {
        this.v.Q(n);
        return this;
    }
    
    public j w(final long n) {
        final J4.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.w);
        this.v.M(n);
        this.a(perfSession);
        if (perfSession.e()) {
            this.t.collectGaugeMetricOnce(perfSession.d());
        }
        return this;
    }
    
    public j x(final String str) {
        if (str == null) {
            this.v.F();
            return this;
        }
        if (o(str)) {
            this.v.R(str);
            return this;
        }
        final a a = j.A;
        final StringBuilder sb = new StringBuilder();
        sb.append("The content type of the response is not a valid content-type:");
        sb.append(str);
        a.j(sb.toString());
        return this;
    }
    
    public j y(final long n) {
        this.v.S(n);
        return this;
    }
    
    public j z(final long n) {
        this.v.T(n);
        return this;
    }
}
