package aa;

/* loaded from: classes.dex */
public final class x {
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r6) {
        /*
            android.content.SharedPreferences r0 = aa.y.a(r6)
            java.lang.String r1 = "proxy_notification_initialized"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto Le
            return
        Le:
            java.lang.String r0 = "firebase_messaging_notification_delegation_enabled"
            r1 = 1
            android.content.Context r3 = r6.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            if (r4 == 0) goto L38
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            if (r3 == 0) goto L38
            android.os.Bundle r4 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            if (r4 == 0) goto L38
            boolean r4 = r4.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            if (r4 == 0) goto L38
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            boolean r0 = r3.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            goto L39
        L38:
            r0 = r1
        L39:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L40
            r2 = r1
        L40:
            if (r2 != 0) goto L47
            r6 = 0
            com.google.android.gms.tasks.Tasks.forResult(r6)
            goto L57
        L47:
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            p2.q r2 = new p2.q
            r2.<init>(r6, r0, r1)
            r2.run()
            r1.getTask()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.x.a(android.content.Context):void");
    }
}
