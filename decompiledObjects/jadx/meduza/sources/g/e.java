package g;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5544b;

    public /* synthetic */ e(Context context, int i10) {
        this.f5543a = i10;
        this.f5544b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        if (r5 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f5543a
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            goto L8b
        L7:
            android.content.Context r0 = r7.f5544b
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            r3 = 1
            if (r1 < r2) goto L88
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r1.<init>(r0, r2)
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            int r2 = r2.getComponentEnabledSetting(r1)
            if (r2 == r3) goto L88
            boolean r2 = a0.a.a()
            java.lang.String r4 = "locale"
            if (r2 == 0) goto L63
            r.d<java.lang.ref.WeakReference<g.f>> r2 = g.f.f5550o
            java.util.Iterator r2 = r2.iterator()
        L2f:
            r5 = r2
            r.g$a r5 = (r.g.a) r5
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L51
            java.lang.Object r5 = r5.next()
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r5 = r5.get()
            g.f r5 = (g.f) r5
            if (r5 == 0) goto L2f
            android.content.Context r5 = r5.f()
            if (r5 == 0) goto L2f
            java.lang.Object r2 = r5.getSystemService(r4)
            goto L52
        L51:
            r2 = 0
        L52:
            if (r2 == 0) goto L68
            android.os.LocaleList r2 = g.f.b.a(r2)
            a0.i r5 = new a0.i
            a0.m r6 = new a0.m
            r6.<init>(r2)
            r5.<init>(r6)
            goto L6a
        L63:
            a0.i r5 = g.f.f5547c
            if (r5 == 0) goto L68
            goto L6a
        L68:
            a0.i r5 = a0.i.f6b
        L6a:
            boolean r2 = r5.d()
            if (r2 == 0) goto L81
            java.lang.String r2 = g.r.b(r0)
            java.lang.Object r4 = r0.getSystemService(r4)
            if (r4 == 0) goto L81
            android.os.LocaleList r2 = g.f.a.a(r2)
            g.f.b.b(r4, r2)
        L81:
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r0.setComponentEnabledSetting(r1, r3, r3)
        L88:
            g.f.f = r3
            return
        L8b:
            android.content.Context r0 = r7.f5544b
            java.lang.String r1 = "$context"
            ec.i.e(r0, r1)
            o9.d r1 = new o9.d
            r1.<init>()
            j6.f r2 = f7.a.f5470a
            java.lang.String r2 = "Must be called on the UI thread"
            m6.j.d(r2)
            f7.b r2 = new f7.b
            r2.<init>(r0, r1)
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r2.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.run():void");
    }
}
