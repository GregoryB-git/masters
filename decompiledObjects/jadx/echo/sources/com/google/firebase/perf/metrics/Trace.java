package com.google.firebase.perf.metrics;

import G4.g;
import H4.e;
import L4.k;
import M4.l;
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
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class Trace extends B4.b implements Parcelable, J4.b {

    /* renamed from: A, reason: collision with root package name */
    public final k f11860A;

    /* renamed from: B, reason: collision with root package name */
    public final M4.a f11861B;

    /* renamed from: C, reason: collision with root package name */
    public l f11862C;

    /* renamed from: D, reason: collision with root package name */
    public l f11863D;

    /* renamed from: s, reason: collision with root package name */
    public final WeakReference f11864s;

    /* renamed from: t, reason: collision with root package name */
    public final Trace f11865t;

    /* renamed from: u, reason: collision with root package name */
    public final GaugeManager f11866u;

    /* renamed from: v, reason: collision with root package name */
    public final String f11867v;

    /* renamed from: w, reason: collision with root package name */
    public final Map f11868w;

    /* renamed from: x, reason: collision with root package name */
    public final Map f11869x;

    /* renamed from: y, reason: collision with root package name */
    public final List f11870y;

    /* renamed from: z, reason: collision with root package name */
    public final List f11871z;

    /* renamed from: E, reason: collision with root package name */
    public static final F4.a f11857E = F4.a.e();

    /* renamed from: F, reason: collision with root package name */
    public static final Map f11858F = new ConcurrentHashMap();

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();

    /* renamed from: G, reason: collision with root package name */
    public static final Parcelable.Creator f11859G = new b();

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i7) {
            return new Trace[i7];
        }
    }

    public class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i7) {
            return new Trace[i7];
        }
    }

    public Trace(Parcel parcel, boolean z7) {
        super(z7 ? null : B4.a.b());
        this.f11864s = new WeakReference(this);
        this.f11865t = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f11867v = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f11871z = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f11868w = concurrentHashMap;
        this.f11869x = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, g.class.getClassLoader());
        this.f11862C = (l) parcel.readParcelable(l.class.getClassLoader());
        this.f11863D = (l) parcel.readParcelable(l.class.getClassLoader());
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f11870y = synchronizedList;
        parcel.readList(synchronizedList, J4.a.class.getClassLoader());
        if (z7) {
            this.f11860A = null;
            this.f11861B = null;
            this.f11866u = null;
        } else {
            this.f11860A = k.l();
            this.f11861B = new M4.a();
            this.f11866u = GaugeManager.getInstance();
        }
    }

    public static Trace h(String str) {
        return new Trace(str);
    }

    @Override // J4.b
    public void a(J4.a aVar) {
        if (aVar == null) {
            f11857E.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (!o() || q()) {
                return;
            }
            this.f11870y.add(aVar);
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public void finalize() {
        try {
            if (p()) {
                f11857E.k("Trace '%s' is started but not stopped when it is destructed!", this.f11867v);
                d(1);
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(String str, String str2) {
        if (q()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f11867v));
        }
        if (!this.f11869x.containsKey(str) && this.f11869x.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        e.d(str, str2);
    }

    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.f11869x.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f11869x);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        g gVar = str != null ? (g) this.f11868w.get(str.trim()) : null;
        if (gVar == null) {
            return 0L;
        }
        return gVar.a();
    }

    public Map i() {
        return this.f11868w;
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j7) {
        String e7 = e.e(str);
        if (e7 != null) {
            f11857E.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, e7);
            return;
        }
        if (!o()) {
            f11857E.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f11867v);
        } else {
            if (q()) {
                f11857E.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f11867v);
                return;
            }
            g r7 = r(str.trim());
            r7.c(j7);
            f11857E.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(r7.a()), this.f11867v);
        }
    }

    public l j() {
        return this.f11863D;
    }

    public String k() {
        return this.f11867v;
    }

    public List l() {
        List unmodifiableList;
        synchronized (this.f11870y) {
            try {
                ArrayList arrayList = new ArrayList();
                for (J4.a aVar : this.f11870y) {
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

    public l m() {
        return this.f11862C;
    }

    public List n() {
        return this.f11871z;
    }

    public boolean o() {
        return this.f11862C != null;
    }

    public boolean p() {
        return o() && !q();
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z7 = true;
        try {
            str = str.trim();
            str2 = str2.trim();
            g(str, str2);
            f11857E.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f11867v);
        } catch (Exception e7) {
            f11857E.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e7.getMessage());
            z7 = false;
        }
        if (z7) {
            this.f11869x.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j7) {
        String e7 = e.e(str);
        if (e7 != null) {
            f11857E.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, e7);
            return;
        }
        if (!o()) {
            f11857E.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f11867v);
        } else if (q()) {
            f11857E.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f11867v);
        } else {
            r(str.trim()).d(j7);
            f11857E.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j7), this.f11867v);
        }
    }

    public boolean q() {
        return this.f11863D != null;
    }

    public final g r(String str) {
        g gVar = (g) this.f11868w.get(str);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(str);
        this.f11868w.put(str, gVar2);
        return gVar2;
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (q()) {
            f11857E.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f11869x.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!C4.a.g().L()) {
            f11857E.a("Trace feature is disabled.");
            return;
        }
        String f7 = e.f(this.f11867v);
        if (f7 != null) {
            f11857E.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f11867v, f7);
            return;
        }
        if (this.f11862C != null) {
            f11857E.d("Trace '%s' has already started, should not start again!", this.f11867v);
            return;
        }
        this.f11862C = this.f11861B.a();
        e();
        J4.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f11864s);
        a(perfSession);
        if (perfSession.e()) {
            this.f11866u.collectGaugeMetricOnce(perfSession.d());
        }
    }

    @Keep
    public void stop() {
        if (!o()) {
            f11857E.d("Trace '%s' has not been started so unable to stop!", this.f11867v);
            return;
        }
        if (q()) {
            f11857E.d("Trace '%s' has already stopped, should not stop again!", this.f11867v);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f11864s);
        f();
        l a7 = this.f11861B.a();
        this.f11863D = a7;
        if (this.f11865t == null) {
            t(a7);
            if (this.f11867v.isEmpty()) {
                f11857E.c("Trace name is empty, no log is sent to server");
                return;
            }
            this.f11860A.D(new G4.k(this).a(), c());
            if (SessionManager.getInstance().perfSession().e()) {
                this.f11866u.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
            }
        }
    }

    public final void t(l lVar) {
        if (this.f11871z.isEmpty()) {
            return;
        }
        Trace trace = (Trace) this.f11871z.get(this.f11871z.size() - 1);
        if (trace.f11863D == null) {
            trace.f11863D = lVar;
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i7) {
        parcel.writeParcelable(this.f11865t, 0);
        parcel.writeString(this.f11867v);
        parcel.writeList(this.f11871z);
        parcel.writeMap(this.f11868w);
        parcel.writeParcelable(this.f11862C, 0);
        parcel.writeParcelable(this.f11863D, 0);
        synchronized (this.f11870y) {
            parcel.writeList(this.f11870y);
        }
    }

    public /* synthetic */ Trace(Parcel parcel, boolean z7, a aVar) {
        this(parcel, z7);
    }

    public Trace(String str) {
        this(str, k.l(), new M4.a(), B4.a.b(), GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, M4.a aVar, B4.a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, M4.a aVar, B4.a aVar2, GaugeManager gaugeManager) {
        super(aVar2);
        this.f11864s = new WeakReference(this);
        this.f11865t = null;
        this.f11867v = str.trim();
        this.f11871z = new ArrayList();
        this.f11868w = new ConcurrentHashMap();
        this.f11869x = new ConcurrentHashMap();
        this.f11861B = aVar;
        this.f11860A = kVar;
        this.f11870y = Collections.synchronizedList(new ArrayList());
        this.f11866u = gaugeManager;
    }
}
