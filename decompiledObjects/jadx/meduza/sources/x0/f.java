package x0;

import a4.g;
import android.app.job.JobParameters;
import android.media.AudioTrack;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import androidx.work.d;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.messaging.FirebaseMessaging;
import e8.g;
import eb.s0;
import f5.b;
import g9.a;
import g9.k;
import i9.y0;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import m9.a;
import v3.g1;
import v3.z0;
import w5.n;
import x0.e;
import x0.r0;
import x3.l;
import z2.a;
import z4.t;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16607c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f16605a = i10;
        this.f16606b = obj;
        this.f16607c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        Set<String> unmodifiableSet;
        boolean z11 = false;
        switch (this.f16605a) {
            case 0:
                r0.c cVar = (r0.c) this.f16606b;
                e.g gVar = (e.g) this.f16607c;
                ec.i.e(cVar, "$operation");
                ec.i.e(gVar, "this$0");
                if (y.L(2)) {
                    Log.v("FragmentManager", "Transition for operation " + cVar + " has completed");
                }
                cVar.c(gVar);
                return;
            case 1:
                p2.q0 q0Var = (p2.q0) this.f16606b;
                s7.e eVar = (s7.e) this.f16607c;
                if (q0Var.f12934x.f17483a instanceof a.b) {
                    eVar.cancel(true);
                    return;
                }
                return;
            case 2:
                List list = (List) this.f16606b;
                v2.g gVar2 = (v2.g) this.f16607c;
                ec.i.e(list, "$listenersList");
                ec.i.e(gVar2, "this$0");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((t2.a) it.next()).a(gVar2.f15220e);
                }
                return;
            case 3:
                y2.x xVar = (y2.x) this.f16606b;
                z2.c cVar2 = (z2.c) this.f16607c;
                if (xVar.f17410a.f17483a instanceof a.b) {
                    cVar2.cancel(true);
                    return;
                } else {
                    cVar2.k(xVar.f17413d.b());
                    return;
                }
            case 4:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f16606b;
                s7.e<? extends d.a> eVar2 = (s7.e) this.f16607c;
                ec.i.e(constraintTrackingWorker, "this$0");
                ec.i.e(eVar2, "$innerFuture");
                synchronized (constraintTrackingWorker.f) {
                    try {
                        if (constraintTrackingWorker.f1549o) {
                            z2.c<d.a> cVar3 = constraintTrackingWorker.f1550p;
                            ec.i.d(cVar3, "future");
                            String str = b3.a.f1821a;
                            cVar3.i(new d.a.b());
                        } else {
                            constraintTrackingWorker.f1550p.k(eVar2);
                        }
                        rb.h hVar = rb.h.f13851a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 5:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f16606b;
                JobParameters jobParameters = (JobParameters) this.f16607c;
                int i10 = JobInfoSchedulerService.f2559a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 6:
                v3.g0 g0Var = (v3.g0) this.f16606b;
                g1 g1Var = (g1) this.f16607c;
                g0Var.getClass();
                try {
                    synchronized (g1Var) {
                    }
                    try {
                        g1Var.f15386a.q(g1Var.f15389d, g1Var.f15390e);
                        return;
                    } finally {
                        g1Var.b(true);
                    }
                } catch (v3.n e10) {
                    v5.m.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 7:
                z0.a aVar = (z0.a) this.f16606b;
                Pair pair = (Pair) this.f16607c;
                aVar.f15836b.f15830h.E(((Integer) pair.first).intValue(), (t.b) pair.second);
                return;
            case 8:
                l.a aVar2 = (l.a) this.f16606b;
                Exception exc = (Exception) this.f16607c;
                x3.l lVar = aVar2.f16987b;
                int i11 = v5.e0.f15881a;
                lVar.t(exc);
                return;
            case 9:
                AudioTrack audioTrack = (AudioTrack) this.f16606b;
                b5.g gVar3 = (b5.g) this.f16607c;
                Object obj = x3.s.f17038d0;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    gVar3.a();
                    synchronized (x3.s.f17038d0) {
                        try {
                            int i12 = x3.s.f17040f0 - 1;
                            x3.s.f17040f0 = i12;
                            if (i12 == 0) {
                                x3.s.f17039e0.shutdown();
                                x3.s.f17039e0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    gVar3.a();
                    synchronized (x3.s.f17038d0) {
                        try {
                            int i13 = x3.s.f17040f0 - 1;
                            x3.s.f17040f0 = i13;
                            if (i13 == 0) {
                                x3.s.f17039e0.shutdown();
                                x3.s.f17039e0 = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 10:
                g.a aVar3 = (g.a) this.f16606b;
                ((a4.g) this.f16607c).E(aVar3.f180a, aVar3.f181b);
                return;
            case 11:
                b.C0081b c0081b = (b.C0081b) this.f16606b;
                Uri uri = (Uri) this.f16607c;
                c0081b.f5368q = false;
                c0081b.b(uri);
                return;
            case 12:
                n.a aVar4 = (n.a) this.f16606b;
                w5.o oVar = (w5.o) this.f16607c;
                w5.n nVar = aVar4.f16425b;
                int i14 = v5.e0.f15881a;
                nVar.b(oVar);
                return;
            case 13:
                Runnable runnable = (Runnable) this.f16606b;
                g.b bVar = (g.b) this.f16607c;
                try {
                    runnable.run();
                    e8.g.this.p(null);
                    return;
                } catch (Exception e11) {
                    e8.g.this.q(e11);
                    return;
                }
            case 14:
                ((j8.s) this.f16606b).a((r8.h) this.f16607c);
                return;
            case 15:
                j8.s sVar = (j8.s) this.f16606b;
                String str2 = (String) this.f16607c;
                l8.n nVar2 = sVar.f8631h.f8596d;
                nVar2.getClass();
                String a10 = l8.e.a(1024, str2);
                synchronized (nVar2.f9800g) {
                    try {
                        String reference = nVar2.f9800g.getReference();
                        if (a10 != null) {
                            z11 = a10.equals(reference);
                        } else if (reference == null) {
                            z11 = true;
                        }
                        if (z11) {
                            return;
                        }
                        nVar2.f9800g.set(a10, true);
                        nVar2.f9796b.f9141b.a(new b.m(nVar2, 13));
                        return;
                    } finally {
                    }
                }
            case 16:
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f16606b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16607c;
                firebaseFirestore.getClass();
                try {
                    y0.D(firebaseFirestore.f3130b, firebaseFirestore.f3131c, firebaseFirestore.f3132d);
                    taskCompletionSource.setResult(null);
                    return;
                } catch (com.google.firebase.firestore.f e12) {
                    taskCompletionSource.setException(e12);
                    return;
                }
            case 17:
                m mVar = (m) this.f16606b;
                Runnable runnable2 = (Runnable) this.f16607c;
                a.c cVar4 = (a.c) g9.a.b(a.c.class, mVar.getSupportFragmentManager().E("FirestoreOnStopObserverSupportFragment"), "FirestoreOnStopObserverSupportFragment");
                if (cVar4 == null || cVar4.isRemoving()) {
                    cVar4 = new a.c();
                    y supportFragmentManager = mVar.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    a aVar5 = new a(supportFragmentManager);
                    aVar5.e(0, cVar4, "FirestoreOnStopObserverSupportFragment");
                    aVar5.d(true);
                    y supportFragmentManager2 = mVar.getSupportFragmentManager();
                    supportFragmentManager2.A(true);
                    supportFragmentManager2.F();
                }
                a.C0096a c0096a = cVar4.f5917a;
                synchronized (c0096a) {
                    c0096a.f5915a.add(runnable2);
                }
                return;
            case 18:
                g9.u uVar = (g9.u) this.f16606b;
                g9.g0 g0Var2 = (g9.g0) this.f16607c;
                g9.k kVar = uVar.f6095j;
                kVar.getClass();
                g9.f0 f0Var = g0Var2.f5959a;
                int i15 = 4;
                k.b bVar2 = (k.b) kVar.f5995b.get(f0Var);
                if (bVar2 == null) {
                    bVar2 = new k.b();
                    kVar.f5995b.put(f0Var, bVar2);
                    i15 = g0Var2.a() ? 1 : 2;
                } else if (!bVar2.a() && g0Var2.a()) {
                    i15 = 3;
                }
                bVar2.f6002a.add(g0Var2);
                g9.d0 d0Var = kVar.f5997d;
                g0Var2.f5963e = d0Var;
                g9.s0 s0Var = g0Var2.f;
                if (s0Var == null || g0Var2.f5962d || !g0Var2.d(s0Var, d0Var)) {
                    z10 = false;
                } else {
                    g0Var2.c(g0Var2.f);
                    z10 = true;
                }
                x6.b.Z("onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", !z10, new Object[0]);
                g9.s0 s0Var2 = bVar2.f6003b;
                if (s0Var2 != null && g0Var2.b(s0Var2)) {
                    kVar.b();
                }
                int c10 = q0.g.c(i15);
                if (c10 == 0) {
                    kVar.f5994a.i(f0Var, true);
                    return;
                }
                if (c10 == 1) {
                    kVar.f5994a.i(f0Var, false);
                    return;
                } else {
                    if (c10 != 2) {
                        return;
                    }
                    g9.j0 j0Var = kVar.f5994a;
                    j0Var.g("listenToRemoteStore");
                    x6.b.Z("This is the first listen to query: %s", j0Var.f5981c.containsKey(f0Var), f0Var);
                    j0Var.f5980b.d(j0Var.f5979a.a(f0Var.i()));
                    return;
                }
            case 19:
                a.c cVar5 = (a.c) this.f16606b;
                eb.s0 s0Var3 = (eb.s0) this.f16607c;
                cVar5.getClass();
                if (p2.m0.S()) {
                    HashMap hashMap = new HashMap();
                    if (s0Var3.f5209b == 0) {
                        unmodifiableSet = Collections.emptySet();
                    } else {
                        HashSet hashSet = new HashSet(s0Var3.f5209b);
                        for (int i16 = 0; i16 < s0Var3.f5209b; i16++) {
                            hashSet.add(new String(s0Var3.e(i16), 0));
                        }
                        unmodifiableSet = Collections.unmodifiableSet(hashSet);
                    }
                    for (String str3 : unmodifiableSet) {
                        if (m9.j.f10815d.contains(str3.toLowerCase(Locale.ENGLISH))) {
                            s0.a aVar6 = eb.s0.f5206d;
                            BitSet bitSet = s0.d.f5211d;
                            hashMap.put(str3, (String) s0Var3.c(new s0.b(str3, aVar6)));
                        }
                    }
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    p2.m0.y(1, m9.a.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(m9.a.this)), hashMap);
                    return;
                }
                return;
            case 20:
                m9.y yVar = (m9.y) this.f16606b;
                yVar.f10904b.a(new w.g(23, yVar, (eb.n0) this.f16607c));
                return;
            case 21:
                n9.g gVar4 = (n9.g) this.f16606b;
                Runnable runnable3 = (Runnable) this.f16607c;
                gVar4.getClass();
                gVar4.f11368g = new Date().getTime();
                runnable3.run();
                return;
            case 22:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f16606b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f16607c;
                com.google.firebase.messaging.a aVar7 = FirebaseMessaging.f3229m;
                firebaseMessaging.getClass();
                try {
                    firebaseMessaging.f3233b.b(aa.r.a(firebaseMessaging.f3232a));
                    taskCompletionSource2.setResult(null);
                    return;
                } catch (Exception e13) {
                    taskCompletionSource2.setException(e13);
                    return;
                }
            case 23:
                ((va.d) this.f16606b).e((m.e) this.f16607c);
                return;
            case 24:
                va.g gVar5 = (va.g) this.f16606b;
                va.f fVar = (va.f) this.f16607c;
                gVar5.getClass();
                fVar.f16027b.run();
                gVar5.f = fVar;
                gVar5.f16032e.run();
                return;
            case 25:
                FlutterFirebaseCorePlugin.lambda$delete$7((String) this.f16606b, (TaskCompletionSource) this.f16607c);
                return;
            case 26:
                ((FlutterFirebaseCorePlugin) this.f16606b).lambda$initializeCore$3((TaskCompletionSource) this.f16607c);
                return;
            case 27:
                ((FlutterFirebaseCrashlyticsPlugin) this.f16606b).lambda$didCrashOnPreviousExecution$3((TaskCompletionSource) this.f16607c);
                return;
            case 28:
                FlutterFirebaseFirestorePlugin.lambda$disableNetwork$4((GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp) this.f16606b, (GeneratedAndroidFirebaseFirestore.Result) this.f16607c);
                return;
            default:
                FlutterFirebaseFirestorePlugin.lambda$setLoggingEnabled$10((Boolean) this.f16606b, (GeneratedAndroidFirebaseFirestore.Result) this.f16607c);
                return;
        }
    }
}
