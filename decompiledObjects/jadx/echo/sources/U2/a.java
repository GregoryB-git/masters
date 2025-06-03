package U2;

import A2.AbstractC0328n;
import E2.h;
import E2.n;
import E2.p;
import N2.i;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class a {

    /* renamed from: r, reason: collision with root package name */
    public static final long f6321r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    public static volatile ScheduledExecutorService f6322s = null;

    /* renamed from: t, reason: collision with root package name */
    public static final Object f6323t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static volatile e f6324u = new c();

    /* renamed from: a, reason: collision with root package name */
    public final Object f6325a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f6326b;

    /* renamed from: c, reason: collision with root package name */
    public int f6327c;

    /* renamed from: d, reason: collision with root package name */
    public Future f6328d;

    /* renamed from: e, reason: collision with root package name */
    public long f6329e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f6330f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6331g;

    /* renamed from: h, reason: collision with root package name */
    public int f6332h;

    /* renamed from: i, reason: collision with root package name */
    public N2.b f6333i;

    /* renamed from: j, reason: collision with root package name */
    public E2.e f6334j;

    /* renamed from: k, reason: collision with root package name */
    public WorkSource f6335k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6336l;

    /* renamed from: m, reason: collision with root package name */
    public final String f6337m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f6338n;

    /* renamed from: o, reason: collision with root package name */
    public final Map f6339o;

    /* renamed from: p, reason: collision with root package name */
    public AtomicInteger f6340p;

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f6341q;

    public a(Context context, int i7, String str) {
        String packageName = context.getPackageName();
        this.f6325a = new Object();
        this.f6327c = 0;
        this.f6330f = new HashSet();
        this.f6331g = true;
        this.f6334j = h.d();
        this.f6339o = new HashMap();
        this.f6340p = new AtomicInteger(0);
        AbstractC0328n.j(context, "WakeLock: context must not be null");
        AbstractC0328n.f(str, "WakeLock: wakeLockName must not be empty");
        this.f6338n = context.getApplicationContext();
        this.f6337m = str;
        this.f6333i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f6336l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f6336l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i7, str);
        this.f6326b = newWakeLock;
        if (p.c(context)) {
            WorkSource b7 = p.b(context, n.a(packageName) ? context.getPackageName() : packageName);
            this.f6335k = b7;
            if (b7 != null) {
                i(newWakeLock, b7);
            }
        }
        ScheduledExecutorService scheduledExecutorService = f6322s;
        if (scheduledExecutorService == null) {
            synchronized (f6323t) {
                try {
                    scheduledExecutorService = f6322s;
                    if (scheduledExecutorService == null) {
                        N2.h.a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f6322s = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f6341q = scheduledExecutorService;
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f6325a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f6336l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f6327c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
            Log.wtf("WakeLock", e7.toString());
        }
    }

    public void a(long j7) {
        this.f6340p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f6321r), 1L);
        if (j7 > 0) {
            max = Math.min(j7, max);
        }
        synchronized (this.f6325a) {
            try {
                if (!b()) {
                    this.f6333i = N2.b.a(false, null);
                    this.f6326b.acquire();
                    this.f6334j.b();
                }
                this.f6327c++;
                this.f6332h++;
                f(null);
                d dVar = (d) this.f6339o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f6339o.put(null, dVar);
                }
                dVar.f6343a++;
                long b7 = this.f6334j.b();
                long j8 = Long.MAX_VALUE - b7 > max ? b7 + max : Long.MAX_VALUE;
                if (j8 > this.f6329e) {
                    this.f6329e = j8;
                    Future future = this.f6328d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f6328d = this.f6341q.schedule(new Runnable() { // from class: U2.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.e(a.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z7;
        synchronized (this.f6325a) {
            z7 = this.f6327c > 0;
        }
        return z7;
    }

    public void c() {
        if (this.f6340p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f6336l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f6325a) {
            try {
                f(null);
                if (this.f6339o.containsKey(null)) {
                    d dVar = (d) this.f6339o.get(null);
                    if (dVar != null) {
                        int i7 = dVar.f6343a - 1;
                        dVar.f6343a = i7;
                        if (i7 == 0) {
                            this.f6339o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f6336l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z7) {
        synchronized (this.f6325a) {
            this.f6331g = z7;
        }
    }

    public final String f(String str) {
        if (this.f6331g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    public final void g() {
        if (this.f6330f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f6330f);
        this.f6330f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.a.a(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        if (r5.f6333i != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f6325a
            monitor-enter(r6)
            boolean r0 = r5.b()     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Le
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            goto La5
        Le:
            boolean r0 = r5.f6331g     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            if (r0 == 0) goto L1e
            int r0 = r5.f6327c     // Catch: java.lang.Throwable -> Lb
            int r0 = r0 + (-1)
            r5.f6327c = r0     // Catch: java.lang.Throwable -> Lb
            if (r0 > 0) goto L1c
            goto L20
        L1c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb
            return
        L1e:
            r5.f6327c = r1     // Catch: java.lang.Throwable -> Lb
        L20:
            r5.g()     // Catch: java.lang.Throwable -> Lb
            java.util.Map r0 = r5.f6339o     // Catch: java.lang.Throwable -> Lb
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> Lb
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lb
        L2d:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> Lb
            U2.d r2 = (U2.d) r2     // Catch: java.lang.Throwable -> Lb
            r2.f6343a = r1     // Catch: java.lang.Throwable -> Lb
            goto L2d
        L3c:
            java.util.Map r0 = r5.f6339o     // Catch: java.lang.Throwable -> Lb
            r0.clear()     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.Future r0 = r5.f6328d     // Catch: java.lang.Throwable -> Lb
            r2 = 0
            if (r0 == 0) goto L4f
            r0.cancel(r1)     // Catch: java.lang.Throwable -> Lb
            r5.f6328d = r2     // Catch: java.lang.Throwable -> Lb
            r3 = 0
            r5.f6329e = r3     // Catch: java.lang.Throwable -> Lb
        L4f:
            r5.f6332h = r1     // Catch: java.lang.Throwable -> Lb
            android.os.PowerManager$WakeLock r0 = r5.f6326b     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r0.isHeld()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L92
            android.os.PowerManager$WakeLock r0 = r5.f6326b     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L67
            r0.release()     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L67
            N2.b r0 = r5.f6333i     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto La3
        L62:
            r5.f6333i = r2     // Catch: java.lang.Throwable -> Lb
            goto La3
        L65:
            r0 = move-exception
            goto L8b
        L67:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L65
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L8a
            java.lang.String r1 = "WakeLock"
            java.lang.String r3 = r5.f6336l     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L65
            android.util.Log.e(r1, r3, r0)     // Catch: java.lang.Throwable -> L65
            N2.b r0 = r5.f6333i     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto La3
            goto L62
        L8a:
            throw r0     // Catch: java.lang.Throwable -> L65
        L8b:
            N2.b r1 = r5.f6333i     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L91
            r5.f6333i = r2     // Catch: java.lang.Throwable -> Lb
        L91:
            throw r0     // Catch: java.lang.Throwable -> Lb
        L92:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.f6336l     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = " should be held!"
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> Lb
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Lb
        La3:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb
            return
        La5:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.a.h(int):void");
    }
}
