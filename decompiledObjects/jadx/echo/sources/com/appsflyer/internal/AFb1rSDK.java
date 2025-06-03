package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFc1bSDK.AnonymousClass4;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFb1rSDK implements AFb1tSDK {
    private static char[] afDebugLog = {'?', 132, 130, 132, 133};
    private static int afErrorLog = 1;
    private static int afInfoLog;
    private List<String> AFInAppEventParameterName = new ArrayList();
    private boolean valueOf = true;

    @NonNull
    private final Map<String, Object> AFInAppEventType = new HashMap();
    private String AFLogger = "-1";
    private boolean afRDLog = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int values = 0;
    private boolean AFKeystoreWrapper = false;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r4.AFKeystoreWrapper != true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4.AFKeystoreWrapper != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean afDebugLog() {
        /*
            r4 = this;
            boolean r0 = r4.afRDLog
            r1 = 0
            if (r0 == 0) goto L39
            int r0 = com.appsflyer.internal.AFb1rSDK.afErrorLog
            int r0 = r0 + 29
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.afInfoLog = r0
            boolean r2 = r4.valueOf
            r3 = 1
            if (r2 != 0) goto L29
            int r0 = r0 + 13
            int r2 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L24
            boolean r0 = r4.AFKeystoreWrapper
            r2 = 96
            int r2 = r2 / r1
            if (r0 == 0) goto L39
            goto L29
        L24:
            boolean r0 = r4.AFKeystoreWrapper
            if (r0 == r3) goto L29
            goto L39
        L29:
            int r0 = com.appsflyer.internal.AFb1rSDK.afErrorLog
            int r0 = r0 + 83
            int r2 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.afInfoLog = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L38
            r0 = 51
            int r0 = r0 / r1
        L38:
            return r3
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.afDebugLog():boolean");
    }

    private synchronized void afErrorLog() {
        this.AFInAppEventParameterName = new ArrayList();
        this.values = 0;
        afErrorLog = (afInfoLog + 95) % 128;
    }

    @NonNull
    private synchronized Map<String, Object> afRDLog() {
        Map<String, Object> map;
        afErrorLog = (afInfoLog + 49) % 128;
        this.AFInAppEventType.put("data", this.AFInAppEventParameterName);
        afErrorLog();
        map = this.AFInAppEventType;
        afInfoLog = (afErrorLog + 15) % 128;
        return map;
    }

    private Map<String, Object> values(String str, PackageManager packageManager, AFc1xSDK aFc1xSDK) {
        int i7 = afInfoLog + 29;
        afErrorLog = i7 % 128;
        int i8 = i7 % 2;
        valueOf(str, packageManager, aFc1xSDK.afWarnLog());
        if (i8 != 0) {
            return afRDLog();
        }
        afRDLog();
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final void AFInAppEventParameterName() {
        int i7 = afErrorLog + 15;
        int i8 = i7 % 128;
        afInfoLog = i8;
        if (i7 % 2 != 0) {
            this.afRDLog = true;
        } else {
            this.afRDLog = false;
        }
        int i9 = i8 + 101;
        afErrorLog = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 20 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final synchronized void AFInAppEventType() {
        afErrorLog = (afInfoLog + 41) % 128;
        this.valueOf = false;
        afErrorLog();
        afErrorLog = (afInfoLog + 37) % 128;
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final synchronized void AFKeystoreWrapper() {
        this.AFKeystoreWrapper = true;
        values("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        int i7 = afInfoLog + 73;
        afErrorLog = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 42 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final boolean afInfoLog() {
        int i7 = afErrorLog;
        int i8 = i7 + 59;
        afInfoLog = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        boolean z7 = this.AFKeystoreWrapper;
        int i9 = i7 + 51;
        afInfoLog = i9 % 128;
        if (i9 % 2 == 0) {
            return z7;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final synchronized void valueOf() {
        try {
            int i7 = afInfoLog + 45;
            afErrorLog = i7 % 128;
            if (i7 % 2 == 0) {
                this.AFInAppEventType.clear();
                this.AFInAppEventParameterName.clear();
                this.values = 1;
            } else {
                this.AFInAppEventType.clear();
                this.AFInAppEventParameterName.clear();
                this.values = 0;
            }
            int i8 = afInfoLog + 69;
            afErrorLog = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 92 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void AFInAppEventType(String str, String str2, String str3, String str4) {
        try {
            this.AFInAppEventType.put("sdk_version", str);
            if (str2 != null) {
                try {
                    afErrorLog = (afInfoLog + 19) % 128;
                    if (str2.length() > 0) {
                        this.AFInAppEventType.put("devkey", str2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (str3 != null && str3.length() > 0) {
                this.AFInAppEventType.put("originalAppsFlyerId", str3);
            }
            if (str4 != null) {
                int i7 = afInfoLog + 109;
                afErrorLog = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
                if (str4.length() > 0) {
                    this.AFInAppEventType.put("uid", str4);
                }
            }
            afInfoLog = (afErrorLog + 79) % 128;
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final synchronized void AFInAppEventParameterName(String str) {
        int i7 = afErrorLog;
        int i8 = i7 + 87;
        afInfoLog = i8 % 128;
        if (i8 % 2 != 0) {
            this.AFLogger = str;
            throw null;
        }
        this.AFLogger = str;
        afInfoLog = (i7 + 1) % 128;
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final void valueOf(String str, PackageManager packageManager, AFc1xSDK aFc1xSDK) {
        try {
            AFd1iSDK aFd1iSDK = new AFd1iSDK(values(str, packageManager, aFc1xSDK), aFc1xSDK);
            AFc1bSDK AFVersionDeclaration = aFc1xSDK.AFVersionDeclaration();
            AFVersionDeclaration.AFKeystoreWrapper.execute(AFVersionDeclaration.new AnonymousClass4(aFd1iSDK));
            int i7 = afErrorLog + 7;
            afInfoLog = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final synchronized void values() {
        values("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.AFKeystoreWrapper = false;
        this.valueOf = false;
        afInfoLog = (afErrorLog + 49) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r3 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r3 = com.appsflyer.internal.AFa1eSDK.valueOf();
        values(r1.getString("advertiserId"), r9.values, r3.AFLogger);
        r9 = new java.lang.StringBuilder("6.12.2.");
        r9.append(com.appsflyer.internal.AFa1eSDK.values);
        AFInAppEventType(r9.toString(), r3.AFInAppEventType().afWarnLog().AFInAppEventParameterName, r1.getString("KSAppsFlyerId"), r1.getString("uid"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        r8 = r8.getPackageInfo(r7, 0).versionCode;
        values(r7, java.lang.String.valueOf(r8), r1.getString(com.appsflyer.AppsFlyerProperties.CHANNEL), r1.getString("preInstallName"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        r6.AFInAppEventType.putAll(com.appsflyer.internal.AFa1rSDK.valueOf(new org.json.JSONObject(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0039, code lost:
    
        if (r3 != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void valueOf(java.lang.String r7, android.content.pm.PackageManager r8, com.appsflyer.internal.AFe1wSDK r9) {
        /*
            r6 = this;
            java.lang.String r0 = "remote_debug_static_data"
            monitor-enter(r6)
            int r1 = com.appsflyer.internal.AFb1rSDK.afErrorLog     // Catch: java.lang.Throwable -> L27
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1rSDK.afInfoLog = r2     // Catch: java.lang.Throwable -> L27
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L2a
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "remote_debug_static_data"
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L27
            java.util.Map<java.lang.String, java.lang.Object> r4 = r6.AFInAppEventType     // Catch: java.lang.Throwable -> L27
            r4.clear()     // Catch: java.lang.Throwable -> L27
            r4 = 94
            int r4 = r4 / r2
            if (r3 == 0) goto L4a
            goto L3b
        L25:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L27
        L27:
            r7 = move-exception
            goto Lbe
        L2a:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "remote_debug_static_data"
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L27
            java.util.Map<java.lang.String, java.lang.Object> r4 = r6.AFInAppEventType     // Catch: java.lang.Throwable -> L27
            r4.clear()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L4a
        L3b:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r6.AFInAppEventType     // Catch: java.lang.Throwable -> Lb3
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb3
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lb3
            java.util.Map r8 = com.appsflyer.internal.AFa1rSDK.valueOf(r8)     // Catch: java.lang.Throwable -> Lb3
            r7.putAll(r8)     // Catch: java.lang.Throwable -> Lb3
            goto Lb3
        L4a:
            com.appsflyer.internal.AFa1eSDK r3 = com.appsflyer.internal.AFa1eSDK.valueOf()     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "advertiserId"
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r9 = r9.values     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r3.AFLogger     // Catch: java.lang.Throwable -> L27
            r6.values(r4, r9, r5)     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "6.12.2."
            r9.<init>(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = com.appsflyer.internal.AFa1eSDK.values     // Catch: java.lang.Throwable -> L27
            r9.append(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L27
            com.appsflyer.internal.AFc1xSDK r3 = r3.AFInAppEventType()     // Catch: java.lang.Throwable -> L27
            com.appsflyer.internal.AFe1wSDK r3 = r3.afWarnLog()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = r3.AFInAppEventParameterName     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "KSAppsFlyerId"
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "uid"
            java.lang.String r5 = r1.getString(r5)     // Catch: java.lang.Throwable -> L27
            r6.AFInAppEventType(r9, r3, r4, r5)     // Catch: java.lang.Throwable -> L27
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r7, r2)     // Catch: java.lang.Throwable -> L9d
            int r8 = r8.versionCode     // Catch: java.lang.Throwable -> L9d
            java.lang.String r9 = "channel"
            java.lang.String r9 = r1.getString(r9)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "preInstallName"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L9d
            r6.values(r7, r8, r9, r2)     // Catch: java.lang.Throwable -> L9d
        L9d:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L27
            java.util.Map<java.lang.String, java.lang.Object> r8 = r6.AFInAppEventType     // Catch: java.lang.Throwable -> L27
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L27
            r1.set(r0, r7)     // Catch: java.lang.Throwable -> L27
            int r7 = com.appsflyer.internal.AFb1rSDK.afInfoLog     // Catch: java.lang.Throwable -> L27
            int r7 = r7 + 23
            int r7 = r7 % 128
            com.appsflyer.internal.AFb1rSDK.afErrorLog = r7     // Catch: java.lang.Throwable -> L27
        Lb3:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r6.AFInAppEventType     // Catch: java.lang.Throwable -> L27
            java.lang.String r8 = "launch_counter"
            java.lang.String r9 = r6.AFLogger     // Catch: java.lang.Throwable -> L27
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r6)
            return
        Lbe:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.valueOf(java.lang.String, android.content.pm.PackageManager, com.appsflyer.internal.AFe1wSDK):void");
    }

    private synchronized void values(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.AFInAppEventType;
            Object[] objArr = new Object[1];
            values("\u0001\u0000\u0001\u0001\u0000", true, new int[]{0, 5, 27, 0}, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.AFInAppEventType.put("model", Build.MODEL);
            this.AFInAppEventType.put("platform", "Android");
            this.AFInAppEventType.put("platform_version", Build.VERSION.RELEASE);
            if (str != null && str.length() > 0) {
                this.AFInAppEventType.put("advertiserId", str);
            }
            if (str2 != null) {
                afErrorLog = (afInfoLog + 85) % 128;
                if (str2.length() > 0) {
                    this.AFInAppEventType.put("imei", str2);
                }
            }
            if (str3 != null) {
                afInfoLog = (afErrorLog + 7) % 128;
                if (str3.length() > 0) {
                    afErrorLog = (afInfoLog + 9) % 128;
                    this.AFInAppEventType.put("android_id", str3);
                }
            }
            int i7 = afInfoLog + 17;
            afErrorLog = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 42 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final void AFInAppEventParameterName(String str, int i7, String str2) {
        afErrorLog = (afInfoLog + 85) % 128;
        values("server_response", str, String.valueOf(i7), str2);
        int i8 = afErrorLog + 63;
        afInfoLog = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 52 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final void AFInAppEventType(Throwable th) {
        String message;
        StackTraceElement[] stackTrace;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            message = th.getMessage();
        } else {
            message = cause.getMessage();
            afInfoLog = (afErrorLog + 71) % 128;
        }
        if (cause == null) {
            afInfoLog = (afErrorLog + 39) % 128;
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
        }
        values("exception", simpleName, valueOf(message, stackTrace));
    }

    private synchronized void values(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.AFInAppEventType.put("app_id", str);
                    afErrorLog = (afInfoLog + 81) % 128;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            afErrorLog = (afInfoLog + 125) % 128;
            this.AFInAppEventType.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.AFInAppEventType.put(AppsFlyerProperties.CHANNEL, str3);
        }
        if (str4 != null) {
            afInfoLog = (afErrorLog + 95) % 128;
            if (str4.length() > 0) {
                this.AFInAppEventType.put("preInstall", str4);
            }
        }
        afErrorLog = (afInfoLog + 99) % 128;
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final void AFInAppEventParameterName(String str, String str2) {
        int i7 = afErrorLog + 69;
        afInfoLog = i7 % 128;
        if (i7 % 2 == 0) {
            values((String) null, str, str2);
            return;
        }
        String[] strArr = new String[0];
        strArr[0] = str2;
        values((String) null, str, strArr);
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final void valueOf(String str, String str2) {
        afInfoLog = (afErrorLog + 87) % 128;
        values("server_request", str, str2);
        afErrorLog = (afInfoLog + 113) % 128;
    }

    private static String[] valueOf(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            int i7 = afInfoLog + 89;
            afErrorLog = i7 % 128;
            if (i7 % 2 != 0) {
                return new String[]{str};
            }
            String[] strArr = new String[0];
            strArr[0] = str;
            return strArr;
        }
        int i8 = 1;
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        while (i8 < stackTraceElementArr.length) {
            int i9 = afInfoLog + 5;
            afErrorLog = i9 % 128;
            if (i9 % 2 == 0) {
                strArr2[i8] = stackTraceElementArr[i8].toString();
                i8 += 85;
            } else {
                strArr2[i8] = stackTraceElementArr[i8].toString();
                i8++;
            }
        }
        afErrorLog = (afInfoLog + 93) % 128;
        return strArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r3.values >= 98304) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        r0 = java.lang.System.currentTimeMillis();
        r6 = android.text.TextUtils.join(", ", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        r2 = new java.lang.StringBuilder();
        r2.append(r0);
        r2.append(" ");
        r2.append(java.lang.Thread.currentThread().getId());
        r2.append(" _/AppsFlyer_6.12.2 [");
        r2.append(r4);
        r2.append("] ");
        r2.append(r5);
        r2.append(" ");
        r2.append(r6);
        r4 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a0, code lost:
    
        r3.AFInAppEventParameterName.add(r4);
        r3.values += r4.length() << 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        r4 = new java.lang.StringBuilder();
        r4.append(r0);
        r4.append(" ");
        r4.append(java.lang.Thread.currentThread().getId());
        r4.append(" ");
        r4.append(r5);
        r4.append("/AppsFlyer_6.12.2 ");
        r4.append(r6);
        r4 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        com.appsflyer.internal.AFb1rSDK.afInfoLog = (com.appsflyer.internal.AFb1rSDK.afErrorLog + 103) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0027, code lost:
    
        if (r3.values >= 98304) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void values(java.lang.String r4, java.lang.String r5, java.lang.String... r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.afDebugLog()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto Lb4
            int r0 = com.appsflyer.internal.AFb1rSDK.afErrorLog     // Catch: java.lang.Throwable -> L22
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1rSDK.afInfoLog = r1     // Catch: java.lang.Throwable -> L22
            int r0 = r0 % 2
            r1 = 98304(0x18000, float:1.37753E-40)
            if (r0 == 0) goto L25
            int r0 = r3.values     // Catch: java.lang.Throwable -> L22
            r2 = 96
            int r2 = r2 / 0
            if (r0 < r1) goto L2b
            goto Lb4
        L20:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L22
        L22:
            r4 = move-exception
            goto Lb6
        L25:
            int r0 = r3.values     // Catch: java.lang.Throwable -> L22
            if (r0 < r1) goto L2b
            goto Lb4
        L2b:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = ", "
            java.lang.String r6 = android.text.TextUtils.join(r2, r6)     // Catch: java.lang.Throwable -> Lb2
            if (r4 == 0) goto L6c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r2.<init>()     // Catch: java.lang.Throwable -> Lb2
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = " "
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lb2
            long r0 = r0.getId()     // Catch: java.lang.Throwable -> Lb2
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = " _/AppsFlyer_6.12.2 ["
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb2
            r2.append(r4)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r4 = "] "
            r2.append(r4)     // Catch: java.lang.Throwable -> Lb2
            r2.append(r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r4 = " "
            r2.append(r4)     // Catch: java.lang.Throwable -> Lb2
            r2.append(r6)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> Lb2
            goto La0
        L6c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r4.<init>()     // Catch: java.lang.Throwable -> Lb2
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = " "
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lb2
            long r0 = r0.getId()     // Catch: java.lang.Throwable -> Lb2
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = " "
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb2
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = "/AppsFlyer_6.12.2 "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb2
            r4.append(r6)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb2
            int r5 = com.appsflyer.internal.AFb1rSDK.afErrorLog     // Catch: java.lang.Throwable -> L22
            int r5 = r5 + 103
            int r5 = r5 % 128
            com.appsflyer.internal.AFb1rSDK.afInfoLog = r5     // Catch: java.lang.Throwable -> L22
        La0:
            java.util.List<java.lang.String> r5 = r3.AFInAppEventParameterName     // Catch: java.lang.Throwable -> Lb2
            r5.add(r4)     // Catch: java.lang.Throwable -> Lb2
            int r5 = r3.values     // Catch: java.lang.Throwable -> Lb2
            int r4 = r4.length()     // Catch: java.lang.Throwable -> Lb2
            int r4 = r4 << 1
            int r5 = r5 + r4
            r3.values = r5     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r3)
            return
        Lb2:
            monitor-exit(r3)
            return
        Lb4:
            monitor-exit(r3)
            return
        Lb6:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.values(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final void AFInAppEventParameterName(String str, String... strArr) {
        afInfoLog = (afErrorLog + 115) % 128;
        values("public_api_call", str, strArr);
        int i7 = afInfoLog + 43;
        afErrorLog = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static void values(String str, boolean z7, int[] iArr, Object[] objArr) {
        String str2;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        synchronized (AFg1sSDK.AFInAppEventType) {
            try {
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = iArr[2];
                int i10 = iArr[3];
                char[] cArr = new char[i8];
                System.arraycopy(afDebugLog, i7, cArr, 0, i8);
                if (bArr2 != null) {
                    char[] cArr2 = new char[i8];
                    AFg1sSDK.AFInAppEventParameterName = 0;
                    char c7 = 0;
                    while (true) {
                        int i11 = AFg1sSDK.AFInAppEventParameterName;
                        if (i11 >= i8) {
                            break;
                        }
                        if (bArr2[i11] == 1) {
                            cArr2[i11] = (char) (((cArr[i11] << 1) + 1) - c7);
                        } else {
                            cArr2[i11] = (char) ((cArr[i11] << 1) - c7);
                        }
                        c7 = cArr2[i11];
                        AFg1sSDK.AFInAppEventParameterName = i11 + 1;
                    }
                    cArr = cArr2;
                }
                if (i10 > 0) {
                    char[] cArr3 = new char[i8];
                    System.arraycopy(cArr, 0, cArr3, 0, i8);
                    int i12 = i8 - i10;
                    System.arraycopy(cArr3, 0, cArr, i12, i10);
                    System.arraycopy(cArr3, i10, cArr, 0, i12);
                }
                if (z7) {
                    char[] cArr4 = new char[i8];
                    AFg1sSDK.AFInAppEventParameterName = 0;
                    while (true) {
                        int i13 = AFg1sSDK.AFInAppEventParameterName;
                        if (i13 >= i8) {
                            break;
                        }
                        cArr4[i13] = cArr[(i8 - i13) - 1];
                        AFg1sSDK.AFInAppEventParameterName = i13 + 1;
                    }
                    cArr = cArr4;
                }
                if (i9 > 0) {
                    AFg1sSDK.AFInAppEventParameterName = 0;
                    while (true) {
                        int i14 = AFg1sSDK.AFInAppEventParameterName;
                        if (i14 >= i8) {
                            break;
                        }
                        cArr[i14] = (char) (cArr[i14] - iArr[2]);
                        AFg1sSDK.AFInAppEventParameterName = i14 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str2;
    }
}
