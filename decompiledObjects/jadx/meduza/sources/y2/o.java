package y2;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17390a = o2.j.f("PackageManagerHelper");

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        o2.j.d().a(y2.o.f17390a, "Skipping component enablement for " + r7.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r6, java.lang.Class<?> r7, boolean r8) {
        /*
            java.lang.String r0 = "enabled"
            java.lang.String r1 = "disabled"
            java.lang.String r2 = r7.getName()     // Catch: java.lang.Exception -> L7a
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch: java.lang.Exception -> L7a
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Exception -> L7a
            r4.<init>(r6, r2)     // Catch: java.lang.Exception -> L7a
            int r2 = r3.getComponentEnabledSetting(r4)     // Catch: java.lang.Exception -> L7a
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L1a
            goto L1d
        L1a:
            if (r2 != r4) goto L1d
            r3 = r4
        L1d:
            if (r8 != r3) goto L3e
            o2.j r6 = o2.j.d()     // Catch: java.lang.Exception -> L7a
            java.lang.String r2 = y2.o.f17390a     // Catch: java.lang.Exception -> L7a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7a
            r3.<init>()     // Catch: java.lang.Exception -> L7a
            java.lang.String r4 = "Skipping component enablement for "
            r3.append(r4)     // Catch: java.lang.Exception -> L7a
            java.lang.String r4 = r7.getName()     // Catch: java.lang.Exception -> L7a
            r3.append(r4)     // Catch: java.lang.Exception -> L7a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L7a
            r6.a(r2, r3)     // Catch: java.lang.Exception -> L7a
            return
        L3e:
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch: java.lang.Exception -> L7a
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Exception -> L7a
            java.lang.String r5 = r7.getName()     // Catch: java.lang.Exception -> L7a
            r3.<init>(r6, r5)     // Catch: java.lang.Exception -> L7a
            if (r8 == 0) goto L4f
            r6 = r4
            goto L50
        L4f:
            r6 = 2
        L50:
            r2.setComponentEnabledSetting(r3, r6, r4)     // Catch: java.lang.Exception -> L7a
            o2.j r6 = o2.j.d()     // Catch: java.lang.Exception -> L7a
            java.lang.String r2 = y2.o.f17390a     // Catch: java.lang.Exception -> L7a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7a
            r3.<init>()     // Catch: java.lang.Exception -> L7a
            java.lang.String r4 = r7.getName()     // Catch: java.lang.Exception -> L7a
            r3.append(r4)     // Catch: java.lang.Exception -> L7a
            java.lang.String r4 = " "
            r3.append(r4)     // Catch: java.lang.Exception -> L7a
            if (r8 == 0) goto L6e
            r4 = r0
            goto L6f
        L6e:
            r4 = r1
        L6f:
            r3.append(r4)     // Catch: java.lang.Exception -> L7a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L7a
            r6.a(r2, r3)     // Catch: java.lang.Exception -> L7a
            goto La7
        L7a:
            r6 = move-exception
            o2.j r2 = o2.j.d()
            java.lang.String r3 = y2.o.f17390a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = r7.getName()
            r4.append(r7)
            java.lang.String r7 = "could not be "
            r4.append(r7)
            if (r8 == 0) goto L95
            goto L96
        L95:
            r0 = r1
        L96:
            r4.append(r0)
            java.lang.String r7 = r4.toString()
            o2.j$a r2 = (o2.j.a) r2
            int r8 = r2.f11721c
            r0 = 3
            if (r8 > r0) goto La7
            android.util.Log.d(r3, r7, r6)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.o.a(android.content.Context, java.lang.Class, boolean):void");
    }
}
