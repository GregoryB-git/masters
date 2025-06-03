// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.perf.metrics;

import com.google.firebase.perf.session.SessionManager;
import java.util.Iterator;
import java.util.HashMap;
import androidx.annotation.NonNull;
import H4.e;
import java.util.Locale;
import java.util.Collections;
import G4.g;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import M4.l;
import L4.k;
import java.util.Map;
import F4.a;
import androidx.annotation.Keep;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import B4.b;

public class Trace extends b implements Parcelable, J4.b
{
    @Keep
    public static final Parcelable$Creator<Trace> CREATOR;
    public static final a E;
    public static final Map F;
    public static final Parcelable$Creator G;
    public final k A;
    public final M4.a B;
    public l C;
    public l D;
    public final WeakReference s;
    public final Trace t;
    public final GaugeManager u;
    public final String v;
    public final Map w;
    public final Map x;
    public final List y;
    public final List z;
    
    static {
        E = a.e();
        F = new ConcurrentHashMap();
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public Trace a(final Parcel parcel) {
                return new Trace(parcel, false, null);
            }
            
            public Trace[] b(final int n) {
                return new Trace[n];
            }
        };
        G = (Parcelable$Creator)new Parcelable$Creator() {
            public Trace a(final Parcel parcel) {
                return new Trace(parcel, true, null);
            }
            
            public Trace[] b(final int n) {
                return new Trace[n];
            }
        };
    }
    
    public Trace(final Parcel parcel, final boolean b) {
        B4.a b2;
        if (b) {
            b2 = null;
        }
        else {
            b2 = B4.a.b();
        }
        super(b2);
        this.s = new WeakReference((T)this);
        this.t = (Trace)parcel.readParcelable(Trace.class.getClassLoader());
        this.v = parcel.readString();
        parcel.readList(this.z = new ArrayList(), Trace.class.getClassLoader());
        final ConcurrentHashMap w = new ConcurrentHashMap();
        this.w = w;
        this.x = new ConcurrentHashMap();
        parcel.readMap((Map)w, g.class.getClassLoader());
        this.C = (l)parcel.readParcelable(l.class.getClassLoader());
        this.D = (l)parcel.readParcelable(l.class.getClassLoader());
        parcel.readList(this.y = Collections.synchronizedList(new ArrayList<Object>()), J4.a.class.getClassLoader());
        if (b) {
            this.A = null;
            this.B = null;
            this.u = null;
            return;
        }
        this.A = k.l();
        this.B = new M4.a();
        this.u = GaugeManager.getInstance();
    }
    
    public Trace(final String s) {
        this(s, k.l(), new M4.a(), B4.a.b(), GaugeManager.getInstance());
    }
    
    public Trace(final String s, final k k, final M4.a a, final B4.a a2) {
        this(s, k, a, a2, GaugeManager.getInstance());
    }
    
    public Trace(final String s, final k a, final M4.a b, final B4.a a2, final GaugeManager u) {
        super(a2);
        this.s = new WeakReference((T)this);
        this.t = null;
        this.v = s.trim();
        this.z = new ArrayList();
        this.w = new ConcurrentHashMap();
        this.x = new ConcurrentHashMap();
        this.B = b;
        this.A = a;
        this.y = Collections.synchronizedList(new ArrayList<Object>());
        this.u = u;
    }
    
    public static Trace h(final String s) {
        return new Trace(s);
    }
    
    public void a(final J4.a a) {
        if (a == null) {
            Trace.E.j("Unable to add new SessionId to the Trace. Continuing without it.");
            return;
        }
        if (this.o() && !this.q()) {
            this.y.add(a);
        }
    }
    
    @Keep
    public int describeContents() {
        return 0;
    }
    
    public void finalize() {
        Label_0043: {
            try {
                if (this.p()) {
                    Trace.E.k("Trace '%s' is started but not stopped when it is destructed!", this.v);
                    this.d(1);
                }
            }
            finally {
                break Label_0043;
            }
            super.finalize();
            return;
        }
        super.finalize();
    }
    
    public final void g(final String s, final String s2) {
        if (this.q()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.v));
        }
        if (!this.x.containsKey(s) && this.x.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        e.d(s, s2);
    }
    
    @Keep
    public String getAttribute(@NonNull final String s) {
        return this.x.get(s);
    }
    
    @Keep
    @NonNull
    public Map<String, String> getAttributes() {
        return new HashMap<String, String>(this.x);
    }
    
    @Keep
    public long getLongMetric(@NonNull final String s) {
        g g;
        if (s != null) {
            g = this.w.get(s.trim());
        }
        else {
            g = null;
        }
        if (g == null) {
            return 0L;
        }
        return g.a();
    }
    
    public Map i() {
        return this.w;
    }
    
    @Keep
    public void incrementMetric(@NonNull final String s, final long n) {
        final String e = H4.e.e(s);
        if (e != null) {
            Trace.E.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", s, e);
            return;
        }
        if (!this.o()) {
            Trace.E.k("Cannot increment metric '%s' for trace '%s' because it's not started", s, this.v);
            return;
        }
        if (this.q()) {
            Trace.E.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", s, this.v);
            return;
        }
        final g r = this.r(s.trim());
        r.c(n);
        Trace.E.b("Incrementing metric '%s' to %d on trace '%s'", s, r.a(), this.v);
    }
    
    public l j() {
        return this.D;
    }
    
    public String k() {
        return this.v;
    }
    
    public List l() {
        final List y = this.y;
        // monitorenter(y)
        while (true) {
            try {
                final ArrayList<J4.a> list = new ArrayList<J4.a>();
                for (final J4.a e : this.y) {
                    if (e != null) {
                        list.add(e);
                    }
                }
                // monitorexit(y)
                return Collections.unmodifiableList((List<?>)list);
                // monitorexit(y)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public l m() {
        return this.C;
    }
    
    public List n() {
        return this.z;
    }
    
    public boolean o() {
        return this.C != null;
    }
    
    public boolean p() {
        return this.o() && !this.q();
    }
    
    @Keep
    public void putAttribute(@NonNull String s, @NonNull String trim) {
        boolean b = true;
        String trim2 = s;
        String s2 = trim;
        try {
            s = (trim2 = s.trim());
            s2 = trim;
            trim = trim.trim();
            trim2 = s;
            s2 = trim;
            this.g(s, trim);
            trim2 = s;
            s2 = trim;
            Trace.E.b("Setting attribute '%s' to '%s' on trace '%s'", s, trim, this.v);
        }
        catch (Exception ex) {
            Trace.E.d("Can not set attribute '%s' with value '%s' (%s)", trim2, s2, ex.getMessage());
            b = false;
            trim = s2;
            s = trim2;
        }
        if (b) {
            this.x.put(s, trim);
        }
    }
    
    @Keep
    public void putMetric(@NonNull final String s, final long l) {
        final String e = H4.e.e(s);
        if (e != null) {
            Trace.E.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", s, e);
            return;
        }
        if (!this.o()) {
            Trace.E.k("Cannot set value for metric '%s' for trace '%s' because it's not started", s, this.v);
            return;
        }
        if (this.q()) {
            Trace.E.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", s, this.v);
            return;
        }
        this.r(s.trim()).d(l);
        Trace.E.b("Setting metric '%s' to '%s' on trace '%s'", s, l, this.v);
    }
    
    public boolean q() {
        return this.D != null;
    }
    
    public final g r(final String s) {
        g g;
        if ((g = this.w.get(s)) == null) {
            g = new g(s);
            this.w.put(s, g);
        }
        return g;
    }
    
    @Keep
    public void removeAttribute(@NonNull final String s) {
        if (this.q()) {
            Trace.E.c("Can't remove a attribute from a Trace that's stopped.");
            return;
        }
        this.x.remove(s);
    }
    
    @Keep
    public void start() {
        if (!C4.a.g().L()) {
            Trace.E.a("Trace feature is disabled.");
            return;
        }
        final String f = e.f(this.v);
        if (f != null) {
            Trace.E.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.v, f);
            return;
        }
        if (this.C != null) {
            Trace.E.d("Trace '%s' has already started, should not start again!", this.v);
            return;
        }
        this.C = this.B.a();
        this.e();
        final J4.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.s);
        this.a(perfSession);
        if (perfSession.e()) {
            this.u.collectGaugeMetricOnce(perfSession.d());
        }
    }
    
    @Keep
    public void stop() {
        if (!this.o()) {
            Trace.E.d("Trace '%s' has not been started so unable to stop!", this.v);
            return;
        }
        if (this.q()) {
            Trace.E.d("Trace '%s' has already stopped, should not stop again!", this.v);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.s);
        this.f();
        final l a = this.B.a();
        this.D = a;
        if (this.t == null) {
            this.t(a);
            if (!this.v.isEmpty()) {
                this.A.D(new G4.k(this).a(), this.c());
                if (SessionManager.getInstance().perfSession().e()) {
                    this.u.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
                }
            }
            else {
                Trace.E.c("Trace name is empty, no log is sent to server");
            }
        }
    }
    
    public final void t(final l d) {
        if (this.z.isEmpty()) {
            return;
        }
        final Trace trace = this.z.get(this.z.size() - 1);
        if (trace.D == null) {
            trace.D = d;
        }
    }
    
    @Keep
    public void writeToParcel(@NonNull final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.t, 0);
        parcel.writeString(this.v);
        parcel.writeList(this.z);
        parcel.writeMap(this.w);
        parcel.writeParcelable((Parcelable)this.C, 0);
        parcel.writeParcelable((Parcelable)this.D, 0);
        synchronized (this.y) {
            parcel.writeList(this.y);
        }
    }
}
