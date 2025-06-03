/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package G4;

import B4.a;
import B4.b;
import L4.k;
import M4.l;
import M4.o;
import N4.d;
import N4.h;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.protobuf.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class j
extends b
implements J4.b {
    public static final F4.a A = F4.a.e();
    public final List s;
    public final GaugeManager t;
    public final k u;
    public final h.b v = h.H0();
    public final WeakReference w;
    public String x;
    public boolean y;
    public boolean z;

    public j(k k8) {
        this(k8, a.b(), GaugeManager.getInstance());
    }

    public j(k k8, a a8, GaugeManager gaugeManager) {
        super(a8);
        this.w = new WeakReference((Object)this);
        this.u = k8;
        this.t = gaugeManager;
        this.s = Collections.synchronizedList((List)new ArrayList());
        this.e();
    }

    public static j h(k k8) {
        return new j(k8);
    }

    private boolean m() {
        return this.v.I();
    }

    private boolean n() {
        return this.v.K();
    }

    public static boolean o(String string2) {
        if (string2.length() > 128) {
            return false;
        }
        for (int i8 = 0; i8 < string2.length(); ++i8) {
            char c8 = string2.charAt(i8);
            if (c8 > '\u001f') {
                if (c8 <= '') continue;
                return false;
            }
            return false;
        }
        return true;
    }

    public j A(long l8) {
        this.v.U(l8);
        if (SessionManager.getInstance().perfSession().e()) {
            this.t.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public j B(long l8) {
        this.v.V(l8);
        return this;
    }

    public j C(String string2) {
        if (string2 != null) {
            string2 = o.d(string2);
            this.v.W(o.e(string2, 2000));
        }
        return this;
    }

    public j E(String string2) {
        this.x = string2;
        return this;
    }

    @Override
    public void a(J4.a a8) {
        if (a8 == null) {
            A.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        if (this.m() && !this.n()) {
            this.s.add((Object)a8);
        }
    }

    public h g() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.w);
        this.f();
        Object object = J4.a.b(this.i());
        if (object != null) {
            this.v.D((Iterable)Arrays.asList((Object[])object));
        }
        object = (h)this.v.v();
        if (!I4.j.c(this.x)) {
            A.a("Dropping network request from a 'User-Agent' that is not allowed");
            return object;
        }
        if (!this.y) {
            this.u.C((h)object, this.c());
            this.y = true;
            return object;
        }
        if (this.z) {
            A.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List i() {
        List list = this.s;
        synchronized (list) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator iterator = this.s.iterator();
                do {
                    if (!iterator.hasNext()) {
                        return Collections.unmodifiableList((List)arrayList);
                    }
                    J4.a a8 = (J4.a)iterator.next();
                    if (a8 == null) continue;
                    arrayList.add((Object)a8);
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
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

    public j p(Map map) {
        this.v.E().L(map);
        return this;
    }

    public j q(String object) {
        if (object != null) {
            h.d d8 = h.d.p;
            object = object.toUpperCase();
            object.hashCode();
            int n8 = object.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 2012838315: {
                    if (!object.equals((Object)"DELETE")) break;
                    n9 = 8;
                    break;
                }
                case 1669334218: {
                    if (!object.equals((Object)"CONNECT")) break;
                    n9 = 7;
                    break;
                }
                case 80083237: {
                    if (!object.equals((Object)"TRACE")) break;
                    n9 = 6;
                    break;
                }
                case 75900968: {
                    if (!object.equals((Object)"PATCH")) break;
                    n9 = 5;
                    break;
                }
                case 2461856: {
                    if (!object.equals((Object)"POST")) break;
                    n9 = 4;
                    break;
                }
                case 2213344: {
                    if (!object.equals((Object)"HEAD")) break;
                    n9 = 3;
                    break;
                }
                case 79599: {
                    if (!object.equals((Object)"PUT")) break;
                    n9 = 2;
                    break;
                }
                case 70454: {
                    if (!object.equals((Object)"GET")) break;
                    n9 = 1;
                    break;
                }
                case -531492226: {
                    if (!object.equals((Object)"OPTIONS")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    object = h.d.p;
                    break;
                }
                case 8: {
                    object = h.d.t;
                    break;
                }
                case 7: {
                    object = h.d.y;
                    break;
                }
                case 6: {
                    object = h.d.x;
                    break;
                }
                case 5: {
                    object = h.d.v;
                    break;
                }
                case 4: {
                    object = h.d.s;
                    break;
                }
                case 3: {
                    object = h.d.u;
                    break;
                }
                case 2: {
                    object = h.d.r;
                    break;
                }
                case 1: {
                    object = h.d.q;
                    break;
                }
                case 0: {
                    object = h.d.w;
                }
            }
            this.v.N((h.d)object);
        }
        return this;
    }

    public j r(int n8) {
        this.v.O(n8);
        return this;
    }

    public void t() {
        this.z = true;
    }

    public j u() {
        this.v.P(h.e.q);
        return this;
    }

    public j v(long l8) {
        this.v.Q(l8);
        return this;
    }

    public j w(long l8) {
        J4.a a8 = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.w);
        this.v.M(l8);
        this.a(a8);
        if (a8.e()) {
            this.t.collectGaugeMetricOnce(a8.d());
        }
        return this;
    }

    public j x(String string2) {
        if (string2 == null) {
            this.v.F();
            return this;
        }
        if (j.o(string2)) {
            this.v.R(string2);
            return this;
        }
        F4.a a8 = A;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The content type of the response is not a valid content-type:");
        stringBuilder.append(string2);
        a8.j(stringBuilder.toString());
        return this;
    }

    public j y(long l8) {
        this.v.S(l8);
        return this;
    }

    public j z(long l8) {
        this.v.T(l8);
        return this;
    }
}

