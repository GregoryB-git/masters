package g;

import a4.b;
import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import d9.c0;
import e8.g;
import eb.n0;
import g.r;
import g9.a;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.firestore.streamhandler.TransactionStreamHandler;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import m9.d;
import m9.h;
import m9.h0;
import m9.y;
import p2.m0;
import v3.d0;
import v3.d1;
import v3.g0;
import v3.h1;
import v3.i0;
import v3.r1;
import v5.e0;
import w5.n;
import x0.r0;
import x3.l;
import x5.j;
import z4.t;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5637c;

    public /* synthetic */ q(int i10, Object obj, Object obj2) {
        this.f5635a = i10;
        this.f5636b = obj;
        this.f5637c = obj2;
    }

    public /* synthetic */ q(Runnable runnable, g.b bVar) {
        this.f5635a = 12;
        this.f5637c = runnable;
        this.f5636b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        Set set;
        t9.b bVar;
        int i10 = 1;
        switch (this.f5635a) {
            case 0:
                r.a aVar = (r.a) this.f5636b;
                Runnable runnable = (Runnable) this.f5637c;
                aVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    aVar.a();
                }
            case 1:
                x0.e eVar = (x0.e) this.f5636b;
                r0.c cVar = (r0.c) this.f5637c;
                ec.i.e(eVar, "this$0");
                ec.i.e(cVar, "$operation");
                eVar.a(cVar);
                return;
            case 2:
                ProfileInstallerInitializer profileInstallerInitializer = (ProfileInstallerInitializer) this.f5636b;
                Context context = (Context) this.f5637c;
                profileInstallerInitializer.getClass();
                (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new b.d(context, 3), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 3:
                p1.g gVar = (p1.g) this.f5636b;
                String str = (String) this.f5637c;
                ec.i.e(gVar, "this$0");
                ec.i.e(str, "$query");
                gVar.getClass();
                throw null;
            case 4:
                d0 d0Var = (d0) this.f5636b;
                g0.d dVar = (g0.d) this.f5637c;
                int i11 = d0Var.H - dVar.f15374c;
                d0Var.H = i11;
                if (dVar.f15375d) {
                    d0Var.I = dVar.f15376e;
                    d0Var.J = true;
                }
                if (dVar.f) {
                    d0Var.K = dVar.f15377g;
                }
                if (i11 == 0) {
                    r1 r1Var = dVar.f15373b.f15306a;
                    if (!d0Var.f15276e0.f15306a.p() && r1Var.p()) {
                        d0Var.f15277f0 = -1;
                        d0Var.f15279g0 = 0L;
                    }
                    if (!r1Var.p()) {
                        List asList = Arrays.asList(((h1) r1Var).f15404r);
                        x6.b.H(asList.size() == d0Var.f15287o.size());
                        for (int i12 = 0; i12 < asList.size(); i12++) {
                            ((d0.d) d0Var.f15287o.get(i12)).f15304b = (r1) asList.get(i12);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (d0Var.J) {
                        if (dVar.f15373b.f15307b.equals(d0Var.f15276e0.f15307b) && dVar.f15373b.f15309d == d0Var.f15276e0.f15322r) {
                            i10 = 0;
                        }
                        if (i10 != 0) {
                            if (r1Var.p() || dVar.f15373b.f15307b.a()) {
                                j10 = dVar.f15373b.f15309d;
                            } else {
                                d1 d1Var = dVar.f15373b;
                                t.b bVar2 = d1Var.f15307b;
                                long j11 = d1Var.f15309d;
                                r1Var.g(bVar2.f17725a, d0Var.f15286n);
                                j10 = j11 + d0Var.f15286n.f15752e;
                            }
                        }
                        z10 = i10;
                    } else {
                        z10 = 0;
                    }
                    d0Var.J = false;
                    d0Var.s0(dVar.f15373b, 1, d0Var.K, false, z10, d0Var.I, j10, -1, false);
                    return;
                }
                return;
            case 5:
                l.a aVar2 = (l.a) this.f5636b;
                Exception exc = (Exception) this.f5637c;
                x3.l lVar = aVar2.f16987b;
                int i13 = e0.f15881a;
                lVar.p(exc);
                return;
            case 6:
                b.d dVar2 = (b.d) this.f5636b;
                i0 i0Var = (i0) this.f5637c;
                a4.b bVar3 = a4.b.this;
                if (bVar3.f146p == 0 || dVar2.f159c) {
                    return;
                }
                Looper looper = bVar3.t;
                looper.getClass();
                dVar2.f158b = bVar3.f(looper, dVar2.f157a, i0Var, false);
                a4.b.this.f144n.add(dVar2);
                return;
            case 7:
                n.a aVar3 = (n.a) this.f5636b;
                String str2 = (String) this.f5637c;
                w5.n nVar = aVar3.f16425b;
                int i14 = e0.f15881a;
                nVar.c(str2);
                return;
            case 8:
                n.a aVar4 = (n.a) this.f5636b;
                Exception exc2 = (Exception) this.f5637c;
                w5.n nVar2 = aVar4.f16425b;
                int i15 = e0.f15881a;
                nVar2.v(exc2);
                return;
            case 9:
                x5.j jVar = (x5.j) this.f5636b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f5637c;
                SurfaceTexture surfaceTexture2 = jVar.f17171o;
                Surface surface = jVar.f17172p;
                Surface surface2 = new Surface(surfaceTexture);
                jVar.f17171o = surfaceTexture;
                jVar.f17172p = surface2;
                Iterator<j.b> it = jVar.f17166a.iterator();
                while (it.hasNext()) {
                    it.next().m(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 10:
                d8.p pVar = (d8.p) this.f5636b;
                t9.b bVar4 = (t9.b) this.f5637c;
                synchronized (pVar) {
                    if (pVar.f3621b == null) {
                        set = pVar.f3620a;
                        bVar = bVar4;
                    } else {
                        set = pVar.f3621b;
                        bVar = bVar4.get();
                    }
                    set.add(bVar);
                }
                return;
            case 11:
                ((c9.b) ((Map.Entry) this.f5636b).getKey()).a((c9.a) this.f5637c);
                return;
            case 12:
                Runnable runnable2 = (Runnable) this.f5637c;
                g.b bVar5 = (g.b) this.f5636b;
                try {
                    runnable2.run();
                    return;
                } catch (Exception e10) {
                    e8.g.this.q(e10);
                    throw e10;
                }
            case 13:
                ((j8.s) this.f5636b).a((r8.h) this.f5637c);
                return;
            case 14:
                ((EventChannel.EventSink) ((c0.a) this.f5636b).f3653b.f3745b).success((d9.d0) this.f5637c);
                return;
            case 15:
                Activity activity = (Activity) this.f5636b;
                Runnable runnable3 = (Runnable) this.f5637c;
                a.b bVar6 = (a.b) g9.a.b(a.b.class, activity.getFragmentManager().findFragmentByTag("FirestoreOnStopObserverFragment"), "FirestoreOnStopObserverFragment");
                if (bVar6 == null || bVar6.isRemoving()) {
                    bVar6 = new a.b();
                    activity.getFragmentManager().beginTransaction().add(bVar6, "FirestoreOnStopObserverFragment").commitAllowingStateLoss();
                    activity.getFragmentManager().executePendingTransactions();
                }
                a.C0096a c0096a = bVar6.f5916a;
                synchronized (c0096a) {
                    c0096a.f5915a.add(runnable3);
                }
                return;
            case 16:
                ((g9.u) this.f5636b).f6095j.f5996c.remove((d9.l) this.f5637c);
                return;
            case 17:
                ((i9.n) this.f5636b).f7751j.b((f9.e) this.f5637c);
                return;
            case 18:
                ((m9.d) this.f5636b).f10761a.unregisterReceiver((d.b) this.f5637c);
                return;
            case 19:
                y yVar = (y) this.f5636b;
                n0 n0Var = (n0) this.f5637c;
                yVar.getClass();
                m0.y(1, "GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
                if (yVar.f10906d != null) {
                    m0.w("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
                    yVar.f10906d.a();
                    yVar.f10906d = null;
                }
                yVar.f10904b.a(new m9.x(yVar, n0Var, i10));
                return;
            case 20:
                h0 h0Var = (h0) this.f5636b;
                h.a aVar5 = (h.a) this.f5637c;
                h0Var.getClass();
                if (aVar5.equals(h.a.REACHABLE) && h0Var.f10799g.f10750a.equals(g9.d0.ONLINE)) {
                    return;
                }
                if (!(aVar5.equals(h.a.UNREACHABLE) && h0Var.f10799g.f10750a.equals(g9.d0.OFFLINE)) && h0Var.f10800h) {
                    m0.y(1, "RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
                    h0Var.f10800h = false;
                    h0Var.a();
                    h0Var.f10799g.c(g9.d0.UNKNOWN);
                    h0Var.f10802j.b();
                    h0Var.f10801i.b();
                    h0Var.b();
                    return;
                }
                return;
            case 21:
                n9.m mVar = (n9.m) this.f5636b;
                Runnable runnable4 = (Runnable) this.f5637c;
                mVar.getClass();
                runnable4.run();
                mVar.f11371b.release();
                return;
            case 22:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f5636b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f5637c;
                com.google.firebase.messaging.a aVar6 = FirebaseMessaging.f3229m;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
            case 23:
                aa.p pVar2 = (aa.p) this.f5636b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f5637c;
                pVar2.getClass();
                try {
                    taskCompletionSource2.setResult(pVar2.f());
                    return;
                } catch (Exception e12) {
                    taskCompletionSource2.setException(e12);
                    return;
                }
            case 24:
                ((MethodChannel.Result) this.f5636b).error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString((Exception) this.f5637c));
                return;
            case 25:
                ((va.d) this.f5636b).d((m.e) this.f5637c);
                return;
            case 26:
                ((FlutterFirebaseAnalyticsPlugin) this.f5636b).lambda$handleResetAnalyticsData$7((TaskCompletionSource) this.f5637c);
                return;
            case 27:
                ((FlutterFirebaseCrashlyticsPlugin) this.f5636b).lambda$checkForUnsentReports$0((TaskCompletionSource) this.f5637c);
                return;
            default:
                TransactionStreamHandler.lambda$onListen$2((EventChannel.EventSink) this.f5636b, (HashMap) this.f5637c);
                return;
        }
    }
}
