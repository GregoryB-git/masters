package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFe1uSDK extends AFa1qSDK {
    /* JADX WARN: Illegal instructions before constructor call */
    @android.annotation.SuppressLint({"VisibleForTests"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AFe1uSDK(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.appsflyer.internal.AFe1ySDK.valueOf
            com.appsflyer.AppsFlyerLib r2 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r2 = r2.getHostPrefix()
            com.appsflyer.internal.AFa1eSDK r3 = com.appsflyer.internal.AFa1eSDK.valueOf()
            java.lang.String r3 = r3.getHostName()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r3
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r0.append(r1)
            java.lang.String r7 = r7.getPackageName()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "Register"
            r6.<init>(r1, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1uSDK.<init>(android.content.Context):void");
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventType() {
        return AFd1vSDK.REGISTER;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afErrorLog() {
        return false;
    }
}
