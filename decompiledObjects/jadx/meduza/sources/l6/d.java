package l6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d implements Handler.Callback {
    public static d A;

    /* renamed from: x, reason: collision with root package name */
    public static final Status f9641x = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: y, reason: collision with root package name */
    public static final Status f9642y = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: z, reason: collision with root package name */
    public static final Object f9643z = new Object();

    /* renamed from: c, reason: collision with root package name */
    public m6.m f9646c;

    /* renamed from: d, reason: collision with root package name */
    public o6.c f9647d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f9648e;
    public final j6.e f;

    /* renamed from: o, reason: collision with root package name */
    public final m6.u f9649o;

    /* renamed from: v, reason: collision with root package name */
    public final zau f9655v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f9656w;

    /* renamed from: a, reason: collision with root package name */
    public long f9644a = 10000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9645b = false;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicInteger f9650p = new AtomicInteger(1);

    /* renamed from: q, reason: collision with root package name */
    public final AtomicInteger f9651q = new AtomicInteger(0);

    /* renamed from: r, reason: collision with root package name */
    public final ConcurrentHashMap f9652r = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: s, reason: collision with root package name */
    public v f9653s = null;
    public final r.d t = new r.d();

    /* renamed from: u, reason: collision with root package name */
    public final r.d f9654u = new r.d();

    public d(Context context, Looper looper, j6.e eVar) {
        this.f9656w = true;
        this.f9648e = context;
        zau zauVar = new zau(looper, this);
        this.f9655v = zauVar;
        this.f = eVar;
        this.f9649o = new m6.u(eVar);
        PackageManager packageManager = context.getPackageManager();
        if (x6.b.f17197h == null) {
            x6.b.f17197h = Boolean.valueOf(v6.e.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (x6.b.f17197h.booleanValue()) {
            this.f9656w = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static Status d(a aVar, j6.b bVar) {
        return new Status(17, a0.j.k("API: ", aVar.f9626b.f9095c, " is not available on this device. Connection failed with: ", String.valueOf(bVar)), bVar.f8471c, bVar);
    }

    @ResultIgnorabilityUnspecified
    public static d g(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (f9643z) {
            try {
                if (A == null) {
                    synchronized (m6.c.f10258a) {
                        handlerThread = m6.c.f10260c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            m6.c.f10260c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = m6.c.f10260c;
                        }
                    }
                    A = new d(context.getApplicationContext(), handlerThread.getLooper(), j6.e.f8488d);
                }
                dVar = A;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final void a(v vVar) {
        synchronized (f9643z) {
            if (this.f9653s != vVar) {
                this.f9653s = vVar;
                this.t.clear();
            }
            this.t.addAll(vVar.f9731e);
        }
    }

    public final boolean b() {
        if (this.f9645b) {
            return false;
        }
        m6.l lVar = m6.k.a().f10283a;
        if (lVar != null && !lVar.f10288b) {
            return false;
        }
        int i10 = this.f9649o.f10326a.get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean c(j6.b bVar, int i10) {
        PendingIntent activity;
        j6.e eVar = this.f;
        Context context = this.f9648e;
        eVar.getClass();
        if (!x6.b.d0(context)) {
            int i11 = bVar.f8470b;
            if ((i11 == 0 || bVar.f8471c == null) ? false : true) {
                activity = bVar.f8471c;
            } else {
                Intent a10 = eVar.a(context, null, i11);
                activity = a10 == null ? null : PendingIntent.getActivity(context, 0, a10, 201326592);
            }
            if (activity != null) {
                int i12 = bVar.f8470b;
                int i13 = GoogleApiActivity.f2808b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i12, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
                return true;
            }
        }
        return false;
    }

    @ResultIgnorabilityUnspecified
    public final d0 e(k6.d dVar) {
        ConcurrentHashMap concurrentHashMap = this.f9652r;
        a apiKey = dVar.getApiKey();
        d0 d0Var = (d0) concurrentHashMap.get(apiKey);
        if (d0Var == null) {
            d0Var = new d0(this, dVar);
            this.f9652r.put(apiKey, d0Var);
        }
        if (d0Var.f9658b.requiresSignIn()) {
            this.f9654u.add(apiKey);
        }
        d0Var.m();
        return d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(com.google.android.gms.tasks.TaskCompletionSource r9, int r10, k6.d r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L7b
            l6.a r3 = r11.getApiKey()
            boolean r11 = r8.b()
            if (r11 != 0) goto Ld
            goto L4a
        Ld:
            m6.k r11 = m6.k.a()
            m6.l r11 = r11.f10283a
            r0 = 1
            if (r11 == 0) goto L4c
            boolean r1 = r11.f10288b
            if (r1 == 0) goto L4a
            boolean r11 = r11.f10289c
            java.util.concurrent.ConcurrentHashMap r1 = r8.f9652r
            java.lang.Object r1 = r1.get(r3)
            l6.d0 r1 = (l6.d0) r1
            if (r1 == 0) goto L48
            k6.a$f r2 = r1.f9658b
            boolean r4 = r2 instanceof com.google.android.gms.common.internal.a
            if (r4 == 0) goto L4a
            com.google.android.gms.common.internal.a r2 = (com.google.android.gms.common.internal.a) r2
            boolean r4 = r2.hasConnectionInfo()
            if (r4 == 0) goto L48
            boolean r4 = r2.isConnecting()
            if (r4 != 0) goto L48
            m6.b r11 = l6.k0.a(r1, r2, r10)
            if (r11 == 0) goto L4a
            int r2 = r1.f9667z
            int r2 = r2 + r0
            r1.f9667z = r2
            boolean r0 = r11.f10255c
            goto L4c
        L48:
            r0 = r11
            goto L4c
        L4a:
            r10 = 0
            goto L68
        L4c:
            l6.k0 r11 = new l6.k0
            r1 = 0
            if (r0 == 0) goto L57
            long r4 = java.lang.System.currentTimeMillis()
            goto L58
        L57:
            r4 = r1
        L58:
            if (r0 == 0) goto L60
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6 = r0
            goto L61
        L60:
            r6 = r1
        L61:
            r0 = r11
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r11
        L68:
            if (r10 == 0) goto L7b
            com.google.android.gms.tasks.Task r9 = r9.getTask()
            com.google.android.gms.internal.base.zau r11 = r8.f9655v
            r11.getClass()
            l6.y r0 = new l6.y
            r0.<init>()
            r9.addOnCompleteListener(r0, r10)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.d.f(com.google.android.gms.tasks.TaskCompletionSource, int, k6.d):void");
    }

    public final void h(j6.b bVar, int i10) {
        if (c(bVar, i10)) {
            return;
        }
        zau zauVar = this.f9655v;
        zauVar.sendMessage(zauVar.obtainMessage(5, i10, 0, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0342  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.d.handleMessage(android.os.Message):boolean");
    }
}
