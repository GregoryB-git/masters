package i7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import b.z;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import e7.j5;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import m6.j;
import v6.g;
import v6.i;
import x6.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f7626n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f7627o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f7628p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f7629a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f7630b;

    /* renamed from: c, reason: collision with root package name */
    public int f7631c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f7632d;

    /* renamed from: e, reason: collision with root package name */
    public long f7633e;
    public final HashSet f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7634g;

    /* renamed from: h, reason: collision with root package name */
    public zzb f7635h;

    /* renamed from: i, reason: collision with root package name */
    public z f7636i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7637j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f7638k;

    /* renamed from: l, reason: collision with root package name */
    public AtomicInteger f7639l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f7640m;

    public a(Context context) {
        boolean booleanValue;
        String str;
        ApplicationInfo a10;
        String packageName = context.getPackageName();
        this.f7629a = new Object();
        this.f7631c = 0;
        this.f = new HashSet();
        this.f7634g = true;
        this.f7636i = z.f1662p;
        this.f7638k = new HashMap();
        this.f7639l = new AtomicInteger(0);
        j.f("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f7635h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f7637j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f7637j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        this.f7630b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = i.f15998a;
        synchronized (i.class) {
            Boolean bool = i.f16000c;
            if (bool == null) {
                bool = Boolean.valueOf(v.a.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
                i.f16000c = bool;
            }
            booleanValue = bool.booleanValue();
        }
        if (booleanValue) {
            packageName = g.b(packageName) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    a10 = d.a(context).a(0, packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    str = "Could not find package: ";
                }
                if (a10 == null) {
                    str = "Could not get applicationInfo from package: ";
                    Log.e("WorkSourceUtil", str.concat(packageName));
                } else {
                    int i10 = a10.uid;
                    workSource = new WorkSource();
                    Method method2 = i.f15999b;
                    try {
                        if (method2 != null) {
                            method2.invoke(workSource, Integer.valueOf(i10), packageName);
                        } else {
                            Method method3 = i.f15998a;
                            if (method3 != null) {
                                method3.invoke(workSource, Integer.valueOf(i10));
                            }
                        }
                    } catch (Exception e10) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                    }
                }
            }
            if (workSource != null) {
                try {
                    this.f7630b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e11) {
                    Log.wtf("WakeLock", e11.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f7627o;
        if (scheduledExecutorService == null) {
            synchronized (f7628p) {
                scheduledExecutorService = f7627o;
                if (scheduledExecutorService == null) {
                    zzh.zza();
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f7627o = scheduledExecutorService;
                }
            }
        }
        this.f7640m = scheduledExecutorService;
    }

    public final void a(long j10) {
        this.f7639l.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f7626n), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f7629a) {
            try {
                if (!b()) {
                    this.f7635h = zzb.zza(false, null);
                    this.f7630b.acquire();
                    this.f7636i.getClass();
                    SystemClock.elapsedRealtime();
                }
                int i10 = 1;
                this.f7631c++;
                if (this.f7634g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f7638k.get(null);
                if (bVar == null) {
                    bVar = new b(0);
                    this.f7638k.put(null, bVar);
                }
                bVar.f7641a++;
                this.f7636i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j11 > this.f7633e) {
                    this.f7633e = j11;
                    ScheduledFuture scheduledFuture = this.f7632d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f7632d = this.f7640m.schedule(new j5(this, i10), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f7629a) {
            z10 = this.f7631c > 0;
        }
        return z10;
    }

    public final void c() {
        if (this.f7639l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f7637j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f7629a) {
            try {
                if (this.f7634g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f7638k.containsKey(null)) {
                    b bVar = (b) this.f7638k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f7641a - 1;
                        bVar.f7641a = i10;
                        if (i10 == 0) {
                            this.f7638k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f7637j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f);
        this.f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r6.f7635h != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f7629a
            monitor-enter(r0)
            boolean r1 = r6.b()     // Catch: java.lang.Throwable -> La0
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            return
        Lb:
            boolean r1 = r6.f7634g     // Catch: java.lang.Throwable -> La0
            r2 = 0
            if (r1 == 0) goto L1b
            int r1 = r6.f7631c     // Catch: java.lang.Throwable -> La0
            int r1 = r1 + (-1)
            r6.f7631c = r1     // Catch: java.lang.Throwable -> La0
            if (r1 > 0) goto L19
            goto L1d
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            return
        L1b:
            r6.f7631c = r2     // Catch: java.lang.Throwable -> La0
        L1d:
            r6.d()     // Catch: java.lang.Throwable -> La0
            java.util.HashMap r1 = r6.f7638k     // Catch: java.lang.Throwable -> La0
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> La0
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La0
        L2a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r3 == 0) goto L39
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La0
            i7.b r3 = (i7.b) r3     // Catch: java.lang.Throwable -> La0
            r3.f7641a = r2     // Catch: java.lang.Throwable -> La0
            goto L2a
        L39:
            java.util.HashMap r1 = r6.f7638k     // Catch: java.lang.Throwable -> La0
            r1.clear()     // Catch: java.lang.Throwable -> La0
            java.util.concurrent.ScheduledFuture r1 = r6.f7632d     // Catch: java.lang.Throwable -> La0
            r3 = 0
            if (r1 == 0) goto L4c
            r1.cancel(r2)     // Catch: java.lang.Throwable -> La0
            r6.f7632d = r3     // Catch: java.lang.Throwable -> La0
            r1 = 0
            r6.f7633e = r1     // Catch: java.lang.Throwable -> La0
        L4c:
            android.os.PowerManager$WakeLock r1 = r6.f7630b     // Catch: java.lang.Throwable -> La0
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L8d
            android.os.PowerManager$WakeLock r1 = r6.f7630b     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L60
            r1.release()     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L60
            com.google.android.gms.internal.stats.zzb r1 = r6.f7635h     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L9e
            goto L82
        L5e:
            r1 = move-exception
            goto L86
        L60:
            r1 = move-exception
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L5e
            java.lang.Class<java.lang.RuntimeException> r4 = java.lang.RuntimeException.class
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L85
            java.lang.String r2 = "WakeLock"
            java.lang.String r4 = r6.f7637j     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = " failed to release!"
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L5e
            android.util.Log.e(r2, r4, r1)     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.internal.stats.zzb r1 = r6.f7635h     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L9e
        L82:
            r6.f7635h = r3     // Catch: java.lang.Throwable -> La0
            goto L9e
        L85:
            throw r1     // Catch: java.lang.Throwable -> L5e
        L86:
            com.google.android.gms.internal.stats.zzb r2 = r6.f7635h     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L8c
            r6.f7635h = r3     // Catch: java.lang.Throwable -> La0
        L8c:
            throw r1     // Catch: java.lang.Throwable -> La0
        L8d:
            java.lang.String r1 = "WakeLock"
            java.lang.String r2 = r6.f7637j     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = " should be held!"
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> La0
            android.util.Log.e(r1, r2)     // Catch: java.lang.Throwable -> La0
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            return
        La0:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.a.e():void");
    }
}
