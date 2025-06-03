package b;

import aa.o0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.Surface;
import androidx.room.MultiInstanceInvalidationClient;
import b.j;
import b1.k;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import eb.h1;
import g9.d0;
import g9.m0;
import g9.n0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import l8.n;
import m9.h0;
import m9.i0;
import p1.e;
import v3.p1;
import x5.j;
import z4.r;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1590b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f1589a = i10;
        this.f1590b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean booleanValue;
        PlaybackStateCompat.d dVar;
        int i10;
        int i11 = 0;
        Map<String, String> map = null;
        switch (this.f1589a) {
            case 0:
                ((j) this.f1590b).invalidateMenu();
                return;
            case 1:
                j.ViewTreeObserverOnDrawListenerC0027j viewTreeObserverOnDrawListenerC0027j = (j.ViewTreeObserverOnDrawListenerC0027j) this.f1590b;
                Runnable runnable = viewTreeObserverOnDrawListenerC0027j.f1611b;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0027j.f1611b = null;
                    return;
                }
                return;
            case 2:
                b1.z zVar = (b1.z) this.f1590b;
                b1.z zVar2 = b1.z.f1802q;
                ec.i.e(zVar, "this$0");
                if (zVar.f1804b == 0) {
                    zVar.f1805c = true;
                    zVar.f.f(k.a.ON_PAUSE);
                }
                if (zVar.f1803a == 0 && zVar.f1805c) {
                    zVar.f.f(k.a.ON_STOP);
                    zVar.f1806d = true;
                    return;
                }
                return;
            case 3:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new k((Context) this.f1590b, 5));
                return;
            case 4:
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = (MultiInstanceInvalidationClient) this.f1590b;
                ec.i.e(multiInstanceInvalidationClient, "this$0");
                p1.e eVar = multiInstanceInvalidationClient.f1376b;
                e.c cVar = multiInstanceInvalidationClient.f1379e;
                if (cVar != null) {
                    eVar.c(cVar);
                    return;
                } else {
                    ec.i.i("observer");
                    throw null;
                }
            case 5:
                p1.i iVar = (p1.i) this.f1590b;
                ec.i.e(iVar, "this$0");
                iVar.getClass();
                throw null;
            case 6:
                androidx.work.impl.background.systemalarm.c.c((androidx.work.impl.background.systemalarm.c) this.f1590b);
                return;
            case 7:
                p1 p1Var = (p1) this.f1590b;
                int i12 = p1.b.f15697b;
                p1Var.c();
                return;
            case 8:
                ((a4.a) this.f1590b).f(null);
                return;
            case 9:
                o4.e eVar2 = (o4.e) this.f1590b;
                synchronized (eVar2.f11775a) {
                    if (!eVar2.f11785l) {
                        long j10 = eVar2.f11784k - 1;
                        eVar2.f11784k = j10;
                        if (j10 <= 0) {
                            if (j10 < 0) {
                                IllegalStateException illegalStateException = new IllegalStateException();
                                synchronized (eVar2.f11775a) {
                                    eVar2.f11786m = illegalStateException;
                                }
                            } else {
                                eVar2.a();
                            }
                        }
                    }
                }
                return;
            case 10:
                z4.y yVar = (z4.y) this.f1590b;
                if (yVar.T) {
                    return;
                }
                r.a aVar = yVar.f17760y;
                aVar.getClass();
                aVar.a(yVar);
                return;
            case 11:
                e5.n nVar = (e5.n) this.f1590b;
                nVar.K = true;
                nVar.C();
                return;
            case 12:
                x5.j jVar = (x5.j) this.f1590b;
                Surface surface = jVar.f17172p;
                if (surface != null) {
                    Iterator<j.b> it = jVar.f17166a.iterator();
                    while (it.hasNext()) {
                        it.next().f();
                    }
                }
                SurfaceTexture surfaceTexture = jVar.f17171o;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                jVar.f17171o = null;
                jVar.f17172p = null;
                return;
            case 13:
                n.a aVar2 = (n.a) this.f1590b;
                aVar2.f9802b.set(null);
                synchronized (aVar2) {
                    if (aVar2.f9801a.isMarked()) {
                        l8.e reference = aVar2.f9801a.getReference();
                        synchronized (reference) {
                            map = Collections.unmodifiableMap(new HashMap(reference.f9761a));
                        }
                        AtomicMarkableReference<l8.e> atomicMarkableReference = aVar2.f9801a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    }
                }
                if (map != null) {
                    l8.n nVar2 = l8.n.this;
                    nVar2.f9795a.h(nVar2.f9797c, map, aVar2.f9803c);
                    return;
                }
                return;
            case 14:
                h0 h0Var = ((g9.u) this.f1590b).f6093h;
                h0Var.f10800h = false;
                h0Var.a();
                h0Var.f10799g.c(d0.OFFLINE);
                return;
            case 15:
                n0 n0Var = (n0) this.f1590b;
                h0 h0Var2 = n0Var.f6034b;
                h0Var2.getClass();
                m0 m0Var = new m0(h0Var2.f10797d);
                ((Task) n0Var.f6035c.apply(m0Var)).addOnCompleteListener(n0Var.f6033a.f11322a, new k1.a(i11, n0Var, m0Var));
                return;
            case 16:
                ((i9.n) this.f1590b).f7744b.start();
                return;
            case 17:
                m9.a aVar3 = (m9.a) this.f1590b;
                int i13 = m9.a.f10729s;
                if (aVar3.c()) {
                    aVar3.f10737i = i0.Healthy;
                    return;
                }
                return;
            case 18:
                Throwable th = (Throwable) this.f1590b;
                if (!(th instanceof OutOfMemoryError)) {
                    throw new RuntimeException("Internal error in Cloud Firestore (25.1.2).", th);
                }
                OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (25.1.2) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
                outOfMemoryError.initCause(th);
                throw outOfMemoryError;
            case 19:
                u9.c cVar2 = (u9.c) this.f1590b;
                Object obj = u9.c.f15111m;
                cVar2.b(false);
                return;
            case 20:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1590b;
                com.google.firebase.messaging.a aVar4 = FirebaseMessaging.f3229m;
                FirebaseMessaging.a aVar5 = firebaseMessaging.f;
                synchronized (aVar5) {
                    aVar5.a();
                    Boolean bool = aVar5.f3245d;
                    booleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f3232a.k();
                }
                if (booleanValue) {
                    firebaseMessaging.m();
                    return;
                }
                return;
            case 21:
                o0.a aVar6 = (o0.a) this.f1590b;
                aVar6.getClass();
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar6.f352a.getAction() + " finishing.");
                aVar6.f353b.trySetResult(null);
                return;
            case 22:
                pa.b bVar = (pa.b) this.f1590b;
                v3.d0 d0Var = bVar.f13052c;
                if (d0Var != null && d0Var.D()) {
                    i11 = 1;
                }
                if (i11 != 0) {
                    dVar = new PlaybackStateCompat.d();
                    dVar.f536b = 256L;
                    i10 = 3;
                } else {
                    dVar = new PlaybackStateCompat.d();
                    dVar.f536b = 256L;
                    i10 = 2;
                }
                int i14 = i10;
                v3.d0 d0Var2 = bVar.f13052c;
                PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(i14, d0Var2 != null ? d0Var2.P() : 0L, 0L, 1.0f, dVar.f536b, 0, null, SystemClock.elapsedRealtime(), dVar.f535a, dVar.f537c, null);
                MediaSessionCompat mediaSessionCompat = bVar.f13062n;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.h(playbackStateCompat);
                }
                Handler handler = bVar.f13058j;
                if (handler != null) {
                    d dVar2 = bVar.f13059k;
                    ec.i.b(dVar2);
                    handler.postDelayed(dVar2, 1000L);
                    return;
                }
                return;
            default:
                gb.k kVar = (gb.k) this.f1590b;
                h1.c cVar3 = kVar.f6555e;
                if (cVar3 != null) {
                    h1.b bVar2 = cVar3.f5127a;
                    if (!bVar2.f5126c && !bVar2.f5125b) {
                        i11 = 1;
                    }
                    if (i11 != 0) {
                        cVar3.a();
                    }
                }
                kVar.f6554d = null;
                return;
        }
    }
}
