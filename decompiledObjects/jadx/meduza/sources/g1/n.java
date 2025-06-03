package g1;

import android.os.IBinder;
import g1.c;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.l f5768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f5770c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.k f5771d;

    public n(c.k kVar, c.m mVar, String str, IBinder iBinder) {
        this.f5771d = kVar;
        this.f5768a = mVar;
        this.f5769b = str;
        this.f5770c = iBinder;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r9 = this;
            g1.c$l r0 = r9.f5768a
            g1.c$m r0 = (g1.c.m) r0
            android.os.IBinder r0 = r0.a()
            g1.c$k r1 = r9.f5771d
            g1.c r1 = g1.c.this
            r.b<android.os.IBinder, g1.c$c> r1 = r1.f5717d
            r2 = 0
            java.lang.Object r0 = r1.getOrDefault(r0, r2)
            g1.c$c r0 = (g1.c.C0091c) r0
            java.lang.String r1 = "MBServiceCompat"
            if (r0 != 0) goto L2c
            java.lang.String r0 = "removeSubscription for callback that isn't registered id="
            java.lang.StringBuilder r0 = defpackage.f.l(r0)
            java.lang.String r2 = r9.f5769b
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            return
        L2c:
            g1.c$k r2 = r9.f5771d
            g1.c r2 = g1.c.this
            java.lang.String r3 = r9.f5769b
            android.os.IBinder r4 = r9.f5770c
            r2.getClass()
            r2 = 1
            r5 = 0
            if (r4 != 0) goto L44
            java.util.HashMap<java.lang.String, java.util.List<d0.b<android.os.IBinder, android.os.Bundle>>> r0 = r0.f5729e     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r0.remove(r3)     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L72
            goto L73
        L44:
            java.util.HashMap<java.lang.String, java.util.List<d0.b<android.os.IBinder, android.os.Bundle>>> r6 = r0.f5729e     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Throwable -> L8d
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L8d
            if (r6 == 0) goto L72
            java.util.Iterator r7 = r6.iterator()     // Catch: java.lang.Throwable -> L8d
        L52:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r8 == 0) goto L67
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L8d
            d0.b r8 = (d0.b) r8     // Catch: java.lang.Throwable -> L8d
            F r8 = r8.f3328a     // Catch: java.lang.Throwable -> L8d
            if (r4 != r8) goto L52
            r7.remove()     // Catch: java.lang.Throwable -> L8d
            r5 = r2
            goto L52
        L67:
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L8d
            if (r2 != 0) goto L72
            java.util.HashMap<java.lang.String, java.util.List<d0.b<android.os.IBinder, android.os.Bundle>>> r0 = r0.f5729e     // Catch: java.lang.Throwable -> L8d
            r0.remove(r3)     // Catch: java.lang.Throwable -> L8d
        L72:
            r2 = r5
        L73:
            if (r2 != 0) goto L8c
            java.lang.String r0 = "removeSubscription called for "
            java.lang.StringBuilder r0 = defpackage.f.l(r0)
            java.lang.String r2 = r9.f5769b
            r0.append(r2)
            java.lang.String r2 = " which is not subscribed"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
        L8c:
            return
        L8d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.n.run():void");
    }
}
