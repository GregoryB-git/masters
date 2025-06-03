package x0;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.StrictMode;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.View;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.MultiInstanceInvalidationClient$callback$1;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.f;
import com.google.firebase.messaging.FirebaseMessaging;
import e8.g;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import n.b;
import p1.e;
import vn.hunghd.flutterdownloader.DownloadWorker;
import w5.n;
import x0.r0;
import x3.l;
import y0.b;

/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16734c;

    public /* synthetic */ q0(int i10, Object obj, Object obj2) {
        this.f16732a = i10;
        this.f16733b = obj;
        this.f16734c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isInPictureInPictureMode;
        va.l lVar = null;
        int i10 = 0;
        switch (this.f16732a) {
            case 0:
                r0 r0Var = (r0) this.f16733b;
                r0.b bVar = (r0.b) this.f16734c;
                ec.i.e(r0Var, "this$0");
                ec.i.e(bVar, "$operation");
                if (r0Var.f16737b.contains(bVar)) {
                    int i11 = bVar.f16744a;
                    View view = bVar.f16746c.mView;
                    ec.i.d(view, "operation.fragment.mView");
                    a0.j.a(i11, view, r0Var.f16736a);
                    return;
                }
                return;
            case 1:
                b.c cVar = (b.c) this.f16733b;
                y0.k kVar = (y0.k) this.f16734c;
                b.c cVar2 = y0.b.f17301a;
                ec.i.e(cVar, "$policy");
                ec.i.e(kVar, "$violation");
                cVar.getClass();
                throw null;
            case 2:
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = (MultiInstanceInvalidationClient) this.f16733b;
                String[] strArr = (String[]) this.f16734c;
                int i12 = MultiInstanceInvalidationClient$callback$1.f1386b;
                ec.i.e(multiInstanceInvalidationClient, "this$0");
                ec.i.e(strArr, "$tables");
                p1.e eVar = multiInstanceInvalidationClient.f1376b;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                eVar.getClass();
                ec.i.e(strArr2, "tables");
                synchronized (eVar.f12776k) {
                    Iterator<Map.Entry<e.c, e.d>> it = eVar.f12776k.iterator();
                    while (true) {
                        b.e eVar2 = (b.e) it;
                        if (eVar2.hasNext()) {
                            Map.Entry entry = (Map.Entry) eVar2.next();
                            ec.i.d(entry, "(observer, wrapper)");
                            e.c cVar3 = (e.c) entry.getKey();
                            e.d dVar = (e.d) entry.getValue();
                            cVar3.getClass();
                            if (!(cVar3 instanceof MultiInstanceInvalidationClient.a)) {
                                dVar.b(strArr2);
                            }
                        } else {
                            rb.h hVar = rb.h.f13851a;
                        }
                    }
                }
                return;
            case 3:
                Runnable runnable = (Runnable) this.f16733b;
                p1.q qVar = (p1.q) this.f16734c;
                ec.i.e(runnable, "$command");
                ec.i.e(qVar, "this$0");
                try {
                    runnable.run();
                    return;
                } finally {
                    qVar.a();
                }
            case 4:
                q2.d dVar2 = (q2.d) this.f16733b;
                p2.x xVar = (p2.x) this.f16734c;
                ec.i.e(dVar2, "this$0");
                ec.i.e(xVar, "$token");
                dVar2.f13218b.c(xVar, 3);
                return;
            case 5:
                l.a aVar = (l.a) this.f16733b;
                z3.e eVar3 = (z3.e) this.f16734c;
                aVar.getClass();
                synchronized (eVar3) {
                }
                x3.l lVar2 = aVar.f16987b;
                int i13 = v5.e0.f15881a;
                lVar2.A(eVar3);
                return;
            case 6:
                n.a aVar2 = (n.a) this.f16733b;
                z3.e eVar4 = (z3.e) this.f16734c;
                aVar2.getClass();
                synchronized (eVar4) {
                }
                w5.n nVar = aVar2.f16425b;
                int i14 = v5.e0.f15881a;
                nVar.a(eVar4);
                return;
            case 7:
                e8.a aVar3 = (e8.a) this.f16733b;
                Runnable runnable2 = (Runnable) this.f16734c;
                Process.setThreadPriority(aVar3.f4812c);
                StrictMode.ThreadPolicy threadPolicy = aVar3.f4813d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 8:
                Runnable runnable3 = (Runnable) this.f16733b;
                g.b bVar2 = (g.b) this.f16734c;
                try {
                    runnable3.run();
                    return;
                } catch (Exception e10) {
                    e8.g.this.q(e10);
                    return;
                }
            case 9:
                j8.s sVar = (j8.s) this.f16733b;
                Throwable th = (Throwable) this.f16734c;
                sVar.f8631h.i("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(((AtomicInteger) sVar.f8627c.f9390b).get()));
                sVar.f8631h.i("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(((AtomicInteger) sVar.f8627c.f9391c).get()));
                j8.n nVar2 = sVar.f8631h;
                Thread currentThread = Thread.currentThread();
                r8.h hVar2 = nVar2.f8606o;
                if (hVar2 == null) {
                    Log.w("FirebaseCrashlytics", "settingsProvider not set", null);
                    return;
                } else {
                    nVar2.g(hVar2, currentThread, th, true);
                    return;
                }
            case 10:
                q8.c cVar4 = (q8.c) this.f16733b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f16734c;
                cVar4.getClass();
                try {
                    h3.h<m8.f0> hVar3 = cVar4.f13360h;
                    h3.e eVar5 = h3.e.HIGHEST;
                    if (hVar3 instanceof k3.u) {
                        k3.w.a().f8925d.a(((k3.u) hVar3).f8916a.e(eVar5), 1);
                    } else {
                        String c10 = o3.a.c("ForcedSender");
                        if (Log.isLoggable(c10, 5)) {
                            Log.w(c10, String.format("Expected instance of `TransportImpl`, got `%s`.", hVar3));
                        }
                    }
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 11:
                g9.u uVar = (g9.u) this.f16733b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16734c;
                g9.j0 j0Var = uVar.f6094i;
                if (!j0Var.f5980b.f10800h) {
                    p2.m0.y(1, "j0", "The network is disabled. The task returned by 'awaitPendingWrites()' will not complete until the network is enabled.", new Object[0]);
                }
                int g10 = j0Var.f5979a.f7745c.g();
                if (g10 == -1) {
                    taskCompletionSource.setResult(null);
                    return;
                }
                if (!j0Var.f5988k.containsKey(Integer.valueOf(g10))) {
                    j0Var.f5988k.put(Integer.valueOf(g10), new ArrayList());
                }
                ((List) j0Var.f5988k.get(Integer.valueOf(g10))).add(taskCompletionSource);
                return;
            case 12:
                g9.u uVar2 = (g9.u) this.f16733b;
                d9.l lVar3 = (d9.l) this.f16734c;
                uVar2.f6095j.f5996c.add(lVar3);
                lVar3.a(null, null);
                return;
            case 13:
                g9.u uVar3 = (g9.u) this.f16733b;
                e9.e eVar6 = (e9.e) this.f16734c;
                x6.b.Z("SyncEngine not yet initialized", uVar3.f6094i != null, new Object[0]);
                p2.m0.y(1, "FirestoreClient", "Credential changed. Current user: %s", eVar6.f4854a);
                g9.j0 j0Var2 = uVar3.f6094i;
                boolean z10 = !j0Var2.f5990m.equals(eVar6);
                j0Var2.f5990m = eVar6;
                if (z10) {
                    Iterator it2 = j0Var2.f5988k.entrySet().iterator();
                    while (it2.hasNext()) {
                        Iterator it3 = ((List) ((Map.Entry) it2.next()).getValue()).iterator();
                        while (it3.hasNext()) {
                            ((TaskCompletionSource) it3.next()).setException(new com.google.firebase.firestore.f("'waitForPendingWrites' task is cancelled due to User change.", f.a.CANCELLED));
                        }
                    }
                    j0Var2.f5988k.clear();
                    i9.n nVar3 = j0Var2.f5979a;
                    List<k9.g> k10 = nVar3.f7745c.k();
                    nVar3.c(eVar6);
                    nVar3.f7743a.y("Start IndexManager", new b.d(nVar3, 16));
                    nVar3.f7743a.y("Start MutationQueue", new b.m(nVar3, 15));
                    List<k9.g> k11 = nVar3.f7745c.k();
                    t8.e<j9.i> eVar7 = j9.i.f8683c;
                    Iterator it4 = Arrays.asList(k10, k11).iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = ((List) it4.next()).iterator();
                        while (it5.hasNext()) {
                            Iterator<k9.f> it6 = ((k9.g) it5.next()).f9156d.iterator();
                            while (it6.hasNext()) {
                                eVar7 = eVar7.a(it6.next().f9150a);
                            }
                        }
                    }
                    j0Var2.h(nVar3.f.b(eVar7), null);
                }
                m9.h0 h0Var = j0Var2.f5980b;
                if (h0Var.f10800h) {
                    p2.m0.y(1, "RemoteStore", "Restarting streams for new credential.", new Object[0]);
                    h0Var.f10800h = false;
                    h0Var.a();
                    h0Var.f10799g.c(g9.d0.UNKNOWN);
                    h0Var.f10802j.b();
                    h0Var.f10801i.b();
                    h0Var.b();
                    return;
                }
                return;
            case 14:
                i9.n nVar4 = (i9.n) this.f16733b;
                List list = (List) this.f16734c;
                Collection<j9.k> d10 = nVar4.f7744b.d();
                r5.c cVar5 = j9.k.f8688b;
                i9.f fVar = nVar4.f7744b;
                Objects.requireNonNull(fVar);
                i9.l lVar4 = new i9.l(fVar, i10);
                i9.f fVar2 = nVar4.f7744b;
                Objects.requireNonNull(fVar2);
                i9.m mVar = new i9.m(fVar2, i10);
                r3.j jVar = n9.o.f11373a;
                ArrayList arrayList = new ArrayList(d10);
                Collections.sort(arrayList, cVar5);
                ArrayList arrayList2 = new ArrayList(list);
                Collections.sort(arrayList2, cVar5);
                n9.o.f(arrayList.iterator(), arrayList2.iterator(), cVar5, lVar4, mVar);
                return;
            case 15:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f16733b;
                try {
                    taskCompletionSource2.setResult(((Callable) this.f16734c).call());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    throw new RuntimeException(e11);
                }
            case 16:
                ((aa.k) this.f16733b).a((Intent) this.f16734c);
                return;
            case 17:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f16733b;
                TaskCompletionSource taskCompletionSource3 = (TaskCompletionSource) this.f16734c;
                com.google.firebase.messaging.a aVar4 = FirebaseMessaging.f3229m;
                firebaseMessaging.getClass();
                try {
                    aa.o oVar = firebaseMessaging.f3235d;
                    oVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    Tasks.await(oVar.a(oVar.c(aa.r.a(oVar.f342a), "*", bundle)));
                    com.google.firebase.messaging.a e12 = FirebaseMessaging.e(firebaseMessaging.f3234c);
                    String f = firebaseMessaging.f();
                    String a10 = aa.r.a(firebaseMessaging.f3232a);
                    synchronized (e12) {
                        String a11 = com.google.firebase.messaging.a.a(f, a10);
                        SharedPreferences.Editor edit = e12.f3247a.edit();
                        edit.remove(a11);
                        edit.commit();
                    }
                    taskCompletionSource3.setResult(null);
                    return;
                } catch (Exception e13) {
                    taskCompletionSource3.setException(e13);
                    return;
                }
            case 18:
                pa.g gVar = (pa.g) this.f16733b;
                pa.b bVar3 = (pa.b) this.f16734c;
                Activity activity = gVar.f;
                ec.i.b(activity);
                isInPictureInPictureMode = activity.isInPictureInPictureMode();
                if (isInPictureInPictureMode) {
                    Handler handler = gVar.f13085o;
                    ec.i.b(handler);
                    q0 q0Var = gVar.f13086p;
                    ec.i.b(q0Var);
                    handler.postDelayed(q0Var, 100L);
                    return;
                }
                bVar3.c(false);
                MediaSessionCompat mediaSessionCompat = bVar3.f13062n;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.d();
                }
                bVar3.f13062n = null;
                Handler handler2 = gVar.f13085o;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    gVar.f13085o = null;
                }
                gVar.f13086p = null;
                return;
            case 19:
                ((MethodChannel.Result) this.f16733b).error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString((Exception) this.f16734c));
                return;
            case 20:
                va.d dVar3 = (va.d) this.f16733b;
                m.e eVar8 = (m.e) this.f16734c;
                dVar3.getClass();
                int intValue = ((Integer) eVar8.c("cursorId")).intValue();
                boolean equals = Boolean.TRUE.equals(eVar8.c("cancel"));
                if (p2.m0.O(dVar3.f16017d)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(dVar3.h());
                    sb2.append("cursor ");
                    sb2.append(intValue);
                    sb2.append(equals ? " cancel" : " next");
                    Log.d("Sqflite", sb2.toString());
                }
                if (equals) {
                    va.l lVar5 = (va.l) dVar3.f16019g.get(Integer.valueOf(intValue));
                    if (lVar5 != null) {
                        dVar3.b(lVar5);
                    }
                    ((wa.a) eVar8).a(null);
                    return;
                }
                va.l lVar6 = (va.l) dVar3.f16019g.get(Integer.valueOf(intValue));
                try {
                    try {
                        if (lVar6 == null) {
                            throw new IllegalStateException("Cursor " + intValue + " not found");
                        }
                        Cursor cursor = lVar6.f16046c;
                        HashMap c11 = va.d.c(cursor, Integer.valueOf(lVar6.f16045b));
                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                            i10 = 1;
                        }
                        if (i10 != 0) {
                            c11.put("cursorId", Integer.valueOf(intValue));
                        }
                        ((wa.a) eVar8).a(c11);
                        if (i10 == 0) {
                            dVar3.b(lVar6);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        if (0 == 0 && lVar6 != null) {
                            dVar3.b(lVar6);
                        }
                        throw th2;
                    }
                } catch (Exception e14) {
                    dVar3.i(e14, eVar8);
                    if (lVar6 != null) {
                        dVar3.b(lVar6);
                    } else {
                        lVar = lVar6;
                    }
                    if (0 != 0 || lVar == null) {
                        return;
                    }
                    dVar3.b(lVar);
                    return;
                }
            case 21:
                ((FlutterFirebaseFirestorePlugin) this.f16733b).lambda$didReinitializeFirebaseCore$1((TaskCompletionSource) this.f16734c);
                return;
            default:
                DownloadWorker downloadWorker = (DownloadWorker) this.f16733b;
                List list2 = (List) this.f16734c;
                MethodChannel methodChannel = downloadWorker.f16121q;
                if (methodChannel != null) {
                    methodChannel.invokeMethod("", list2);
                    return;
                }
                return;
        }
    }
}
