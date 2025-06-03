package m7;

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
public final class e {

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f10346o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f10347a;

    /* renamed from: b, reason: collision with root package name */
    public final v f10348b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10349c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10352g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f10353h;

    /* renamed from: i, reason: collision with root package name */
    public final b0 f10354i;

    /* renamed from: m, reason: collision with root package name */
    public d f10358m;

    /* renamed from: n, reason: collision with root package name */
    public IInterface f10359n;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10350d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f10351e = new HashSet();
    public final Object f = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final x f10356k = new IBinder.DeathRecipient() { // from class: m7.x
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            e eVar = e.this;
            eVar.f10348b.b("reportBinderDeath", new Object[0]);
            a0 a0Var = (a0) eVar.f10355j.get();
            if (a0Var != null) {
                eVar.f10348b.b("calling onBinderDied", new Object[0]);
                a0Var.a();
            } else {
                eVar.f10348b.b("%s : Binder has died.", eVar.f10349c);
                Iterator it = eVar.f10350d.iterator();
                while (it.hasNext()) {
                    ((w) it.next()).a(new RemoteException(String.valueOf(eVar.f10349c).concat(" : Binder has died.")));
                }
                eVar.f10350d.clear();
            }
            synchronized (eVar.f) {
                eVar.e();
            }
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f10357l = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    public final WeakReference f10355j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [m7.x] */
    public e(Context context, v vVar, String str, Intent intent, b0 b0Var) {
        this.f10347a = context;
        this.f10348b = vVar;
        this.f10349c = str;
        this.f10353h = intent;
        this.f10354i = b0Var;
    }

    public static /* bridge */ /* synthetic */ void b(e eVar, w wVar) {
        if (eVar.f10359n != null || eVar.f10352g) {
            if (!eVar.f10352g) {
                wVar.run();
                return;
            } else {
                eVar.f10348b.b("Waiting to bind to the service.", new Object[0]);
                eVar.f10350d.add(wVar);
                return;
            }
        }
        eVar.f10348b.b("Initiate binding to the service.", new Object[0]);
        eVar.f10350d.add(wVar);
        d dVar = new d(eVar);
        eVar.f10358m = dVar;
        eVar.f10352g = true;
        if (eVar.f10347a.bindService(eVar.f10353h, dVar, 1)) {
            return;
        }
        eVar.f10348b.b("Failed to bind to the service.", new Object[0]);
        eVar.f10352g = false;
        Iterator it = eVar.f10350d.iterator();
        while (it.hasNext()) {
            ((w) it.next()).a(new f());
        }
        eVar.f10350d.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f10346o;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f10349c)) {
                HandlerThread handlerThread = new HandlerThread(this.f10349c, 10);
                handlerThread.start();
                hashMap.put(this.f10349c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f10349c);
        }
        return handler;
    }

    public final void c(w wVar, TaskCompletionSource taskCompletionSource) {
        a().post(new z(this, wVar.c(), taskCompletionSource, wVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.f10351e.remove(taskCompletionSource);
        }
        a().post(new c(this, 1));
    }

    public final void e() {
        Iterator it = this.f10351e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f10349c).concat(" : Binder has died.")));
        }
        this.f10351e.clear();
    }
}
