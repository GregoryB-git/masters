/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 */
package com.google.firebase.perf.metrics;

import B4.a;
import B4.b;
import G4.g;
import G4.k;
import H4.e;
import M4.l;
import N4.d;
import N4.m;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Trace
extends b
implements Parcelable,
J4.b {
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;
    public static final F4.a E;
    public static final Map F;
    public static final Parcelable.Creator G;
    public final L4.k A;
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
        E = F4.a.e();
        F = new ConcurrentHashMap();
        CREATOR = new Parcelable.Creator(){

            public Trace a(Parcel parcel) {
                return new Trace(parcel, false, null);
            }

            public Trace[] b(int n8) {
                return new Trace[n8];
            }
        };
        G = new Parcelable.Creator(){

            public Trace a(Parcel parcel) {
                return new Trace(parcel, true, null);
            }

            public Trace[] b(int n8) {
                return new Trace[n8];
            }
        };
    }

    public Trace(Parcel parcel, boolean bl) {
        a a8 = bl ? null : a.b();
        super(a8);
        this.s = new WeakReference((Object)this);
        this.t = (Trace)parcel.readParcelable(Trace.class.getClassLoader());
        this.v = parcel.readString();
        a8 = new ArrayList();
        this.z = a8;
        parcel.readList((List)a8, Trace.class.getClassLoader());
        a8 = new ConcurrentHashMap();
        this.w = a8;
        this.x = new ConcurrentHashMap();
        parcel.readMap((Map)a8, g.class.getClassLoader());
        this.C = (l)parcel.readParcelable(l.class.getClassLoader());
        this.D = (l)parcel.readParcelable(l.class.getClassLoader());
        a8 = Collections.synchronizedList((List)new ArrayList());
        this.y = a8;
        parcel.readList((List)a8, J4.a.class.getClassLoader());
        if (bl) {
            this.A = null;
            this.B = null;
            this.u = null;
            return;
        }
        this.A = L4.k.l();
        this.B = new M4.a();
        this.u = GaugeManager.getInstance();
    }

    public /* synthetic */ Trace(Parcel parcel, boolean bl,  a8) {
        this(parcel, bl);
    }

    public Trace(String string2) {
        this(string2, L4.k.l(), new M4.a(), a.b(), GaugeManager.getInstance());
    }

    public Trace(String string2, L4.k k8, M4.a a8, a a9) {
        this(string2, k8, a8, a9, GaugeManager.getInstance());
    }

    public Trace(String string2, L4.k k8, M4.a a8, a a9, GaugeManager gaugeManager) {
        super(a9);
        this.s = new WeakReference((Object)this);
        this.t = null;
        this.v = string2.trim();
        this.z = new ArrayList();
        this.w = new ConcurrentHashMap();
        this.x = new ConcurrentHashMap();
        this.B = a8;
        this.A = k8;
        this.y = Collections.synchronizedList((List)new ArrayList());
        this.u = gaugeManager;
    }

    public static Trace h(String string2) {
        return new Trace(string2);
    }

    @Override
    public void a(J4.a a8) {
        if (a8 == null) {
            E.j("Unable to add new SessionId to the Trace. Continuing without it.");
            return;
        }
        if (this.o() && !this.q()) {
            this.y.add((Object)a8);
        }
    }

    @Keep
    public int describeContents() {
        return 0;
    }

    public void finalize() {
        Throwable throwable2;
        block3 : {
            block2 : {
                try {
                    if (!this.p()) break block2;
                    E.k("Trace '%s' is started but not stopped when it is destructed!", this.v);
                    this.d(1);
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            Object.super.finalize();
            return;
        }
        Object.super.finalize();
        throw throwable2;
    }

    public final void g(String string2, String string3) {
        if (!this.q()) {
            if (!this.x.containsKey((Object)string2) && this.x.size() >= 5) {
                throw new IllegalArgumentException(String.format((Locale)Locale.ENGLISH, (String)"Exceeds max limit of number of attributes - %d", (Object[])new Object[]{5}));
            }
            e.d(string2, string3);
            return;
        }
        throw new IllegalArgumentException(String.format((Locale)Locale.ENGLISH, (String)"Trace '%s' has been stopped", (Object[])new Object[]{this.v}));
    }

    @Keep
    public String getAttribute(@NonNull String string2) {
        return (String)this.x.get((Object)string2);
    }

    @Keep
    @NonNull
    public Map<String, String> getAttributes() {
        return new HashMap(this.x);
    }

    @Keep
    public long getLongMetric(@NonNull String object) {
        object = object != null ? (g)this.w.get((Object)object.trim()) : null;
        if (object == null) {
            return 0L;
        }
        return object.a();
    }

    public Map i() {
        return this.w;
    }

    @Keep
    public void incrementMetric(@NonNull String string2, long l8) {
        Object object = e.e(string2);
        if (object != null) {
            E.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", string2, object);
            return;
        }
        if (!this.o()) {
            E.k("Cannot increment metric '%s' for trace '%s' because it's not started", string2, this.v);
            return;
        }
        if (this.q()) {
            E.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", string2, this.v);
            return;
        }
        object = this.r(string2.trim());
        object.c(l8);
        E.b("Incrementing metric '%s' to %d on trace '%s'", string2, object.a(), this.v);
    }

    public l j() {
        return this.D;
    }

    public String k() {
        return this.v;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List l() {
        List list = this.y;
        synchronized (list) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator iterator = this.y.iterator();
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

    public l m() {
        return this.C;
    }

    public List n() {
        return this.z;
    }

    public boolean o() {
        if (this.C != null) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (this.o() && !this.q()) {
            return true;
        }
        return false;
    }

    @Keep
    public void putAttribute(@NonNull String string2, @NonNull String string3) {
        boolean bl = true;
        String string4 = string2;
        String string5 = string3;
        string4 = string2 = string2.trim();
        string5 = string3;
        string3 = string3.trim();
        string4 = string2;
        string5 = string3;
        this.g(string2, string3);
        string4 = string2;
        string5 = string3;
        try {
            E.b("Setting attribute '%s' to '%s' on trace '%s'", string2, string3, this.v);
        }
        catch (Exception exception) {
            E.d("Can not set attribute '%s' with value '%s' (%s)", string4, string5, exception.getMessage());
            bl = false;
            string3 = string5;
            string2 = string4;
        }
        if (bl) {
            this.x.put((Object)string2, (Object)string3);
        }
    }

    @Keep
    public void putMetric(@NonNull String string2, long l8) {
        String string3 = e.e(string2);
        if (string3 != null) {
            E.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", string2, string3);
            return;
        }
        if (!this.o()) {
            E.k("Cannot set value for metric '%s' for trace '%s' because it's not started", string2, this.v);
            return;
        }
        if (this.q()) {
            E.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", string2, this.v);
            return;
        }
        this.r(string2.trim()).d(l8);
        E.b("Setting metric '%s' to '%s' on trace '%s'", string2, l8, this.v);
    }

    public boolean q() {
        if (this.D != null) {
            return true;
        }
        return false;
    }

    public final g r(String string2) {
        g g8;
        g g9 = g8 = (g)this.w.get((Object)string2);
        if (g8 == null) {
            g9 = new g(string2);
            this.w.put((Object)string2, (Object)g9);
        }
        return g9;
    }

    @Keep
    public void removeAttribute(@NonNull String string2) {
        if (this.q()) {
            E.c("Can't remove a attribute from a Trace that's stopped.");
            return;
        }
        this.x.remove((Object)string2);
    }

    @Keep
    public void start() {
        if (!C4.a.g().L()) {
            E.a("Trace feature is disabled.");
            return;
        }
        Object object = e.f(this.v);
        if (object != null) {
            E.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.v, object);
            return;
        }
        if (this.C != null) {
            E.d("Trace '%s' has already started, should not start again!", this.v);
            return;
        }
        this.C = this.B.a();
        this.e();
        object = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.s);
        this.a((J4.a)object);
        if (object.e()) {
            this.u.collectGaugeMetricOnce(object.d());
        }
    }

    @Keep
    public void stop() {
        l l8;
        if (!this.o()) {
            E.d("Trace '%s' has not been started so unable to stop!", this.v);
            return;
        }
        if (this.q()) {
            E.d("Trace '%s' has already stopped, should not stop again!", this.v);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.s);
        this.f();
        this.D = l8 = this.B.a();
        if (this.t == null) {
            this.t(l8);
            if (!this.v.isEmpty()) {
                this.A.D(new k(this).a(), this.c());
                if (SessionManager.getInstance().perfSession().e()) {
                    this.u.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
                    return;
                }
            } else {
                E.c("Trace name is empty, no log is sent to server");
            }
        }
    }

    public final void t(l l8) {
        if (this.z.isEmpty()) {
            return;
        }
        int n8 = this.z.size();
        Trace trace = (Trace)this.z.get(n8 - 1);
        if (trace.D == null) {
            trace.D = l8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int n8) {
        parcel.writeParcelable((Parcelable)this.t, 0);
        parcel.writeString(this.v);
        parcel.writeList(this.z);
        parcel.writeMap(this.w);
        parcel.writeParcelable((Parcelable)this.C, 0);
        parcel.writeParcelable((Parcelable)this.D, 0);
        List list = this.y;
        synchronized (list) {
            parcel.writeList(this.y);
            return;
        }
    }

}

