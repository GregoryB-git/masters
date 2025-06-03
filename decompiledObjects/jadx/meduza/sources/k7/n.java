package k7;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f9118n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f9119a;

    /* renamed from: b, reason: collision with root package name */
    public final d f9120b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9124g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f9125h;

    /* renamed from: l, reason: collision with root package name */
    public m f9129l;

    /* renamed from: m, reason: collision with root package name */
    public IInterface f9130m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9122d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f9123e = new HashSet();
    public final Object f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final f f9127j = new IBinder.DeathRecipient() { // from class: k7.f
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            n nVar = n.this;
            nVar.f9120b.a("reportBinderDeath", new Object[0]);
            j jVar = (j) nVar.f9126i.get();
            if (jVar != null) {
                nVar.f9120b.a("calling onBinderDied", new Object[0]);
                jVar.zza();
            } else {
                nVar.f9120b.a("%s : Binder has died.", nVar.f9121c);
                Iterator it = nVar.f9122d.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(nVar.f9121c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = eVar.f9106a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                nVar.f9122d.clear();
            }
            synchronized (nVar.f) {
                nVar.c();
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f9128k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f9121c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f9126i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [k7.f] */
    public n(Context context, d dVar, Intent intent) {
        this.f9119a = context;
        this.f9120b = dVar;
        this.f9125h = intent;
    }

    public static void b(n nVar, e eVar) {
        if (nVar.f9130m != null || nVar.f9124g) {
            if (!nVar.f9124g) {
                eVar.run();
                return;
            } else {
                nVar.f9120b.a("Waiting to bind to the service.", new Object[0]);
                nVar.f9122d.add(eVar);
                return;
            }
        }
        nVar.f9120b.a("Initiate binding to the service.", new Object[0]);
        nVar.f9122d.add(eVar);
        m mVar = new m(nVar);
        nVar.f9129l = mVar;
        nVar.f9124g = true;
        if (nVar.f9119a.bindService(nVar.f9125h, mVar, 1)) {
            return;
        }
        nVar.f9120b.a("Failed to bind to the service.", new Object[0]);
        nVar.f9124g = false;
        Iterator it = nVar.f9122d.iterator();
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            w1.c cVar = new w1.c();
            TaskCompletionSource taskCompletionSource = eVar2.f9106a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(cVar);
            }
        }
        nVar.f9122d.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f9118n;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f9121c)) {
                HandlerThread handlerThread = new HandlerThread(this.f9121c, 10);
                handlerThread.start();
                hashMap.put(this.f9121c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f9121c);
        }
        return handler;
    }

    public final void c() {
        Iterator it = this.f9123e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f9121c).concat(" : Binder has died.")));
        }
        this.f9123e.clear();
    }
}
