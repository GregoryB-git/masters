package com.appsflyer.internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFe1wSDK {
    public volatile String AFInAppEventParameterName;

    @NonNull
    public final AFb1bSDK AFKeystoreWrapper;

    @NonNull
    private final AFe1xSDK afInfoLog;
    Map<String, Object> valueOf;
    public volatile String values;
    private boolean afErrorLog = false;
    public volatile boolean AFInAppEventType = false;

    public AFe1wSDK(@NonNull AFb1bSDK aFb1bSDK, @NonNull AFe1xSDK aFe1xSDK) {
        this.AFKeystoreWrapper = aFb1bSDK;
        this.afInfoLog = aFe1xSDK;
    }

    private boolean values() {
        Map<String, Object> map = this.valueOf;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public final Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        try {
            try {
                return (Map) ((Class) AFb1oSDK.values((ViewConfiguration.getLongPressTimeout() >> 16) + 37, View.getDefaultSize(0, 0) + 87, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1))).getDeclaredConstructor(Map.class, Context.class).newInstance(map, this.AFKeystoreWrapper.AFInAppEventType);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Exception e7) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", e7);
            return new HashMap();
        }
    }

    public final boolean AFInAppEventType() {
        return this.afErrorLog && !values();
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String valueOf(com.appsflyer.internal.AFb1dSDK r10) {
        /*
            r9 = this;
            java.lang.String r0 = "use cached IMEI: "
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "collectIMEI"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            java.lang.String r2 = "imeiCached"
            r4 = 0
            java.lang.String r5 = r10.values(r2, r4)
            if (r1 == 0) goto L8e
            java.lang.String r1 = r9.values
            boolean r1 = com.appsflyer.internal.AFb1uSDK.values(r1)
            if (r1 == 0) goto L8e
            com.appsflyer.internal.AFb1bSDK r1 = r9.AFKeystoreWrapper
            android.content.Context r1 = r1.AFInAppEventType
            if (r1 == 0) goto L95
            boolean r6 = AFInAppEventParameterName(r1)
            if (r6 == 0) goto L95
            java.lang.String r6 = "phone"
            java.lang.Object r1 = r1.getSystemService(r6)     // Catch: java.lang.Exception -> L53 java.lang.reflect.InvocationTargetException -> L55
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Exception -> L53 java.lang.reflect.InvocationTargetException -> L55
            java.lang.Class r6 = r1.getClass()     // Catch: java.lang.Exception -> L53 java.lang.reflect.InvocationTargetException -> L55
            java.lang.String r7 = "getDeviceId"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L53 java.lang.reflect.InvocationTargetException -> L55
            java.lang.reflect.Method r6 = r6.getMethod(r7, r8)     // Catch: java.lang.Exception -> L53 java.lang.reflect.InvocationTargetException -> L55
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L53 java.lang.reflect.InvocationTargetException -> L55
            java.lang.Object r1 = r6.invoke(r1, r3)     // Catch: java.lang.Exception -> L53 java.lang.reflect.InvocationTargetException -> L55
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L53 java.lang.reflect.InvocationTargetException -> L55
            if (r1 == 0) goto L49
            goto L96
        L49:
            if (r5 == 0) goto L57
            java.lang.String r1 = r0.concat(r5)     // Catch: java.lang.Exception -> L53 java.lang.reflect.InvocationTargetException -> L55
            com.appsflyer.AFLogger.afDebugLog(r1)     // Catch: java.lang.Exception -> L53 java.lang.reflect.InvocationTargetException -> L55
            goto L58
        L53:
            r1 = move-exception
            goto L5a
        L55:
            r1 = move-exception
            goto L6d
        L57:
            r5 = r4
        L58:
            r1 = r5
            goto L96
        L5a:
            if (r5 == 0) goto L64
            java.lang.String r0 = r0.concat(r5)
            com.appsflyer.AFLogger.afDebugLog(r0)
            goto L65
        L64:
            r5 = r4
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "WARNING: Can't collect IMEI: other reason: "
            r0.<init>(r3)
            goto L7f
        L6d:
            if (r5 == 0) goto L77
            java.lang.String r0 = r0.concat(r5)
            com.appsflyer.AFLogger.afDebugLog(r0)
            goto L78
        L77:
            r5 = r4
        L78:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "WARNING: Can't collect IMEI because of missing permissions: "
            r0.<init>(r3)
        L7f:
            java.lang.String r3 = r1.getMessage()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
            goto L58
        L8e:
            java.lang.String r0 = r9.values
            if (r0 == 0) goto L95
            java.lang.String r1 = r9.values
            goto L96
        L95:
            r1 = r4
        L96:
            boolean r0 = com.appsflyer.internal.AFb1uSDK.values(r1)
            if (r0 != 0) goto La0
            r10.AFInAppEventParameterName(r2, r1)
            return r1
        La0:
            java.lang.String r10 = "IMEI was not collected."
            com.appsflyer.AFLogger.afInfoLog(r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1wSDK.valueOf(com.appsflyer.internal.AFb1dSDK):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.appsflyer.internal.AFe1xSDK.4.<init>(com.appsflyer.internal.AFe1xSDK, com.appsflyer.internal.AFe1xSDK$AFa1vSDK):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final boolean AFInAppEventParameterName() {
        /*
            r13 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "com.appsflyer.lvl.AppsFlyerLVL"
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L7c
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.ClassNotFoundException -> L7c
            com.appsflyer.internal.AFe1xSDK r5 = r13.afInfoLog     // Catch: java.lang.ClassNotFoundException -> L7c
            com.appsflyer.internal.AFb1bSDK r6 = r13.AFKeystoreWrapper     // Catch: java.lang.ClassNotFoundException -> L7c
            android.content.Context r6 = r6.AFInAppEventType     // Catch: java.lang.ClassNotFoundException -> L7c
            com.appsflyer.internal.AFe1wSDK$4 r7 = new com.appsflyer.internal.AFe1wSDK$4     // Catch: java.lang.ClassNotFoundException -> L7c
            r7.<init>()     // Catch: java.lang.ClassNotFoundException -> L7c
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.String r8 = "com.appsflyer.lvl.AppsFlyerLVL$resultListener"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.String r9 = "checkLicense"
            r10 = 3
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Class r12 = java.lang.Long.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r11[r1] = r12     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Class<android.content.Context> r12 = android.content.Context.class
            r11[r0] = r12     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r12 = 2
            r11[r12] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.reflect.Method r2 = r2.getMethod(r9, r11)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            com.appsflyer.internal.AFe1xSDK$4 r9 = new com.appsflyer.internal.AFe1xSDK$4     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r9.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.ClassLoader r5 = r8.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Class[] r11 = new java.lang.Class[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r11[r1] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Object r5 = java.lang.reflect.Proxy.newProxyInstance(r5, r11, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r8[r1] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r8[r0] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r8[r12] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r3 = 0
            r2.invoke(r3, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            goto L79
        L56:
            r2 = move-exception
            goto L5e
        L58:
            r2 = move-exception
            goto L6a
        L5a:
            r2 = move-exception
            goto L6f
        L5c:
            r2 = move-exception
            goto L74
        L5e:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.ClassNotFoundException -> L7c
        L62:
            java.lang.String r3 = r3.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L7c
            r7.AFInAppEventParameterName(r3, r2)     // Catch: java.lang.ClassNotFoundException -> L7c
            goto L79
        L6a:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.ClassNotFoundException -> L7c
            goto L62
        L6f:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.ClassNotFoundException -> L7c
            goto L62
        L74:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.ClassNotFoundException -> L7c
            goto L62
        L79:
            r13.afErrorLog = r0     // Catch: java.lang.ClassNotFoundException -> L7c
            goto L7e
        L7c:
            r13.afErrorLog = r1
        L7e:
            boolean r0 = r13.afErrorLog
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1wSDK.AFInAppEventParameterName():boolean");
    }

    @NonNull
    public final Map<String, Object> valueOf() {
        HashMap hashMap = new HashMap();
        if (!values()) {
            if (this.afErrorLog) {
                HashMap hashMap2 = new HashMap();
                this.valueOf = hashMap2;
                hashMap2.put("error", "operation timed out.");
            }
            return hashMap;
        }
        hashMap.put("lvl", this.valueOf);
        return hashMap;
    }

    private static boolean AFInAppEventParameterName(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFa1eSDK.valueOf();
        return !AFa1eSDK.AFInAppEventParameterName(context);
    }
}
