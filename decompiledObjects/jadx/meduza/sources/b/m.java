package b;

import a4.b;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.d;
import androidx.emoji2.text.g;
import androidx.work.CoroutineWorker;
import androidx.work.d;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ryanheise.audioservice.AudioService;
import d9.b0;
import e5.l;
import e5.n;
import i9.q;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import n9.a;
import nc.c1;
import o2.j;
import p1.e;
import p2.k0;
import z2.a;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1620b;

    public /* synthetic */ m(Object obj, int i10) {
        this.f1619a = i10;
        this.f1620b = obj;
    }

    private final void a() {
        g.b bVar = (g.b) this.f1620b;
        synchronized (bVar.f1008d) {
            if (bVar.f1011h == null) {
                return;
            }
            try {
                b0.n d10 = bVar.d();
                int i10 = d10.f1700e;
                if (i10 == 2) {
                    synchronized (bVar.f1008d) {
                    }
                }
                if (i10 != 0) {
                    throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                }
                try {
                    int i11 = a0.n.f13a;
                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                    g.a aVar = bVar.f1007c;
                    Context context = bVar.f1005a;
                    aVar.getClass();
                    Typeface b10 = x.e.f16498a.b(context, new b0.n[]{d10}, 0);
                    MappedByteBuffer e10 = x.m.e(bVar.f1005a, d10.f1696a);
                    if (e10 == null || b10 == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    try {
                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                        androidx.emoji2.text.h hVar = new androidx.emoji2.text.h(b10, t0.g.a(e10));
                        Trace.endSection();
                        Trace.endSection();
                        synchronized (bVar.f1008d) {
                            d.h hVar2 = bVar.f1011h;
                            if (hVar2 != null) {
                                hVar2.b(hVar);
                            }
                        }
                        bVar.b();
                    } finally {
                        int i12 = a0.n.f13a;
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable th2) {
                synchronized (bVar.f1008d) {
                    d.h hVar3 = bVar.f1011h;
                    if (hVar3 != null) {
                        hVar3.a(th2);
                    }
                    bVar.b();
                }
            }
        }
    }

    private final void b() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f1620b;
        ec.i.e(constraintTrackingWorker, "this$0");
        if (constraintTrackingWorker.f1550p.f17483a instanceof a.b) {
            return;
        }
        String d10 = constraintTrackingWorker.f1458b.f1436b.d("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        o2.j d11 = o2.j.d();
        ec.i.d(d11, "get()");
        if (d10 == null || d10.length() == 0) {
            d11.b(b3.a.f1821a, "No worker to delegate to.");
        } else {
            androidx.work.d a10 = constraintTrackingWorker.f1458b.f1439e.a(constraintTrackingWorker.f1457a, d10, constraintTrackingWorker.f1548e);
            constraintTrackingWorker.f1551q = a10;
            if (a10 == null) {
                d11.a(b3.a.f1821a, "No worker to delegate to.");
            } else {
                k0 d12 = k0.d(constraintTrackingWorker.f1457a);
                ec.i.d(d12, "getInstance(applicationContext)");
                x2.t u10 = d12.f12879c.u();
                String uuid = constraintTrackingWorker.f1458b.f1435a.toString();
                ec.i.d(uuid, "id.toString()");
                x2.s t = u10.t(uuid);
                if (t != null) {
                    v2.n nVar = d12.f12885j;
                    ec.i.d(nVar, "workManagerImpl.trackers");
                    t2.e eVar = new t2.e(nVar);
                    c1 a11 = d12.f12880d.a();
                    ec.i.d(a11, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
                    constraintTrackingWorker.f1550p.f(new u.a(t2.h.a(eVar, t, a11, constraintTrackingWorker), 7), new y2.u());
                    if (!eVar.a(t)) {
                        d11.a(b3.a.f1821a, "Constraints not met for delegate " + d10 + ". Requesting retry.");
                        z2.c<d.a> cVar = constraintTrackingWorker.f1550p;
                        ec.i.d(cVar, "future");
                        cVar.i(new d.a.b());
                        return;
                    }
                    d11.a(b3.a.f1821a, "Constraints met for delegate " + d10);
                    try {
                        androidx.work.d dVar = constraintTrackingWorker.f1551q;
                        ec.i.b(dVar);
                        z2.c h10 = dVar.h();
                        ec.i.d(h10, "delegate!!.startWork()");
                        h10.f(new x0.f(4, constraintTrackingWorker, h10), constraintTrackingWorker.f1458b.f1437c);
                        return;
                    } catch (Throwable th) {
                        String str = b3.a.f1821a;
                        String e10 = defpackage.g.e("Delegated worker ", d10, " threw exception in startWork.");
                        if (((j.a) d11).f11721c <= 3) {
                            Log.d(str, e10, th);
                        }
                        synchronized (constraintTrackingWorker.f) {
                            if (!constraintTrackingWorker.f1549o) {
                                z2.c<d.a> cVar2 = constraintTrackingWorker.f1550p;
                                ec.i.d(cVar2, "future");
                                cVar2.i(new d.a.C0024a());
                                return;
                            } else {
                                d11.a(str, "Constraints were unmet, Retrying.");
                                z2.c<d.a> cVar3 = constraintTrackingWorker.f1550p;
                                ec.i.d(cVar3, "future");
                                cVar3.i(new d.a.b());
                                return;
                            }
                        }
                    }
                }
            }
        }
        z2.c<d.a> cVar4 = constraintTrackingWorker.f1550p;
        ec.i.d(cVar4, "future");
        String str2 = b3.a.f1821a;
        cVar4.i(new d.a.C0024a());
    }

    private final void c() {
        boolean z10;
        String str;
        l8.n nVar = (l8.n) this.f1620b;
        synchronized (nVar.f9800g) {
            try {
                z10 = false;
                if (nVar.f9800g.isMarked()) {
                    str = nVar.f9800g.getReference();
                    nVar.f9800g.set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            nVar.f9795a.i(nVar.f9797c, str);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.f1619a) {
            case 1:
                Toolbar.f fVar = ((Toolbar) this.f1620b).U;
                androidx.appcompat.view.menu.h hVar = fVar != null ? fVar.f873b : null;
                if (hVar != null) {
                    hVar.collapseActionView();
                    return;
                }
                return;
            case 2:
                ((l.c1) this.f1620b).a();
                return;
            case 3:
                a();
                return;
            case 4:
                a0.j.r(this.f1620b);
                ec.i.e(null, "this$0");
                throw null;
            case 5:
                p1.e eVar = (p1.e) this.f1620b;
                synchronized (eVar.f12778m) {
                    eVar.f12772g = false;
                    e.b bVar = eVar.f12774i;
                    synchronized (bVar) {
                        Arrays.fill(bVar.f12781b, false);
                        bVar.f12783d = true;
                        rb.h hVar2 = rb.h.f13851a;
                    }
                }
                return;
            case 6:
                p1.n nVar = (p1.n) this.f1620b;
                int i10 = p1.n.f12836k;
                ec.i.e(nVar, "this$0");
                if (nVar.f12843h.compareAndSet(false, true)) {
                    p1.e eVar2 = nVar.f12837a.f12796e;
                    p1.m mVar = nVar.f12841e;
                    eVar2.getClass();
                    ec.i.e(mVar, "observer");
                    eVar2.a(new e.C0193e(eVar2, mVar));
                }
                do {
                    if (nVar.f12842g.compareAndSet(false, true)) {
                        Object obj = null;
                        z10 = false;
                        while (nVar.f.compareAndSet(true, false)) {
                            try {
                                try {
                                    obj = nVar.f12840d.call();
                                    z10 = true;
                                } catch (Exception e10) {
                                    throw new RuntimeException("Exception while computing database live data.", e10);
                                }
                            } finally {
                                nVar.f12842g.set(false);
                            }
                        }
                        if (z10) {
                            nVar.postValue(obj);
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return;
                    }
                } while (nVar.f.get());
                return;
            case 7:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.f1620b;
                ec.i.e(coroutineWorker, "this$0");
                if (coroutineWorker.f.f17483a instanceof a.b) {
                    coroutineWorker.f1425e.cancel((CancellationException) null);
                    return;
                }
                return;
            case 8:
                androidx.work.impl.background.systemalarm.c.b((androidx.work.impl.background.systemalarm.c) this.f1620b);
                return;
            case 9:
                b();
                return;
            case 10:
                b.d dVar = (b.d) this.f1620b;
                if (dVar.f159c) {
                    return;
                }
                a4.e eVar3 = dVar.f158b;
                if (eVar3 != null) {
                    eVar3.f(dVar.f157a);
                }
                a4.b.this.f144n.remove(dVar);
                dVar.f159c = true;
                return;
            case 11:
                DashMediaSource dashMediaSource = (DashMediaSource) this.f1620b;
                int i11 = DashMediaSource.X;
                dashMediaSource.B();
                return;
            case 12:
                ((l.a) ((n.a) this.f1620b)).c();
                return;
            case 13:
                c();
                return;
            case 14:
                ((b0) this.f1620b).remove();
                return;
            case 15:
                ((i9.n) this.f1620b).f7745c.start();
                return;
            case 16:
                q.a aVar = (q.a) this.f1620b;
                i9.n nVar2 = aVar.f7773b;
                aVar.f7774c = true;
                aVar.f7775d = aVar.f7772a.b(a.c.GARBAGE_COLLECTION, i9.q.f7768d, new m(aVar, 16));
                return;
            case 17:
                a.C0174a c0174a = (a.C0174a) this.f1620b;
                n9.a.this.d();
                if (c0174a.f11326b != null) {
                    c0174a.b();
                    c0174a.f11325a.run();
                    return;
                }
                return;
            case 18:
                RuntimeException runtimeException = (RuntimeException) this.f1620b;
                r3.j jVar = n9.o.f11373a;
                throw runtimeException;
            case 19:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1620b;
                aa.x.a(firebaseMessaging.f3234c);
                aa.y.b(firebaseMessaging.f3234c, firebaseMessaging.f3235d, firebaseMessaging.l());
                if (firebaseMessaging.l()) {
                    firebaseMessaging.h();
                    return;
                }
                return;
            default:
                AudioService audioService = (AudioService) this.f1620b;
                AudioService audioService2 = AudioService.F;
                if (audioService.C) {
                    ((NotificationManager) audioService.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE)).notify(1124, audioService.i());
                    return;
                }
                return;
        }
    }
}
