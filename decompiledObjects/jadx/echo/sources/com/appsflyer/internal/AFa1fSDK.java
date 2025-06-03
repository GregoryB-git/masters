package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1zSDK;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public final class AFa1fSDK implements AFc1vSDK {

    @NotNull
    private final AFb1bSDK valueOf;

    public AFa1fSDK() {
    }

    public AFa1fSDK(AFb1bSDK aFb1bSDK) {
        Intrinsics.checkNotNullParameter(aFb1bSDK, "");
        this.valueOf = aFb1bSDK;
    }

    private File AFInAppEventParameterName() {
        Context context = this.valueOf.AFInAppEventType;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String AFKeystoreWrapper(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e7) {
            AFLogger.afErrorLog(e7.getMessage(), e7);
            return "";
        }
    }

    private File afDebugLog() {
        File AFInAppEventParameterName = AFInAppEventParameterName();
        if (AFInAppEventParameterName == null) {
            return null;
        }
        File file = new File(AFInAppEventParameterName, "6.12.2");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean valueOf() {
        return Build.BRAND.equals("OPPO");
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public static String values(PackageManager packageManager, String str) {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final int AFInAppEventType() {
        Iterator<T> it = AFKeystoreWrapper().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((AFc1zSDK) it.next()).valueOf;
        }
        return i7;
    }

    public static long AFInAppEventType(Context context, String str) {
        long longVersionCode;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT < 28) {
                return packageInfo.versionCode;
            }
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            AFLogger.afErrorLog(e7.getMessage(), e7);
            return 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
    
        if (((java.lang.Boolean) r14).booleanValue() != false) goto L32;
     */
    @Override // com.appsflyer.internal.AFc1vSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AFInAppEventParameterName(java.lang.String... r14) {
        /*
            r13 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            monitor-enter(r13)
            java.io.File r0 = r13.AFInAppEventParameterName()     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 == 0) goto Lcf
            int r2 = r14.length     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L29
            java.lang.String r14 = "delete all exceptions"
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "[Exception Manager]: "
            java.lang.String r14 = r1.concat(r14)     // Catch: java.lang.Throwable -> L26
            com.appsflyer.AFLogger.afRDLog(r14)     // Catch: java.lang.Throwable -> L26
            boolean r1 = e6.g.j(r0)     // Catch: java.lang.Throwable -> L26
            goto Lcf
        L26:
            r14 = move-exception
            goto Ld1
        L29:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "delete all exceptions except for: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = ", "
            r11 = 62
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r14
            java.lang.String r3 = W5.AbstractC0677g.p(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L26
            r2.append(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "[Exception Manager]: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L26
            com.appsflyer.AFLogger.afRDLog(r2)     // Catch: java.lang.Throwable -> L26
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto Lcf
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.Throwable -> L26
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L26
            r2.<init>()     // Catch: java.lang.Throwable -> L26
            int r3 = r0.length     // Catch: java.lang.Throwable -> L26
            r4 = 0
            r5 = r4
        L6b:
            if (r5 >= r3) goto L7f
            r6 = r0[r5]     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L26
            boolean r7 = W5.AbstractC0677g.h(r14, r7)     // Catch: java.lang.Throwable -> L26
            if (r7 != 0) goto L7c
            r2.add(r6)     // Catch: java.lang.Throwable -> L26
        L7c:
            int r5 = r5 + 1
            goto L6b
        L7f:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L26
            r0 = 10
            int r0 = W5.m.l(r2, r0)     // Catch: java.lang.Throwable -> L26
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L26
        L8e:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto Lab
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L26
            java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L26
            boolean r2 = e6.g.j(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L26
            r14.add(r2)     // Catch: java.lang.Throwable -> L26
            goto L8e
        Lab:
            java.util.Set r14 = W5.m.J(r14)     // Catch: java.lang.Throwable -> L26
            boolean r0 = r14.isEmpty()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto Lbb
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L26
            java.util.Set r14 = W5.I.a(r14)     // Catch: java.lang.Throwable -> L26
        Lbb:
            int r0 = r14.size()     // Catch: java.lang.Throwable -> L26
            if (r0 != r1) goto Lce
            java.lang.Object r14 = W5.m.q(r14)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L26
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L26
            if (r14 == 0) goto Lce
            goto Lcf
        Lce:
            r1 = r4
        Lcf:
            monitor-exit(r13)
            return r1
        Ld1:
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1fSDK.AFInAppEventParameterName(java.lang.String[]):boolean");
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    @NotNull
    public final List<AFc1zSDK> AFKeystoreWrapper() {
        List<AFc1zSDK> list;
        String d7;
        synchronized (this) {
            try {
                File afDebugLog = afDebugLog();
                list = null;
                if (afDebugLog != null) {
                    try {
                        File[] listFiles = afDebugLog.listFiles();
                        if (listFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(listFiles, "");
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                AFc1zSDK.AFa1xSDK aFa1xSDK = AFc1zSDK.AFInAppEventParameterName;
                                Intrinsics.checkNotNullExpressionValue(file, "");
                                d7 = e6.i.d(file, null, 1, null);
                                AFc1zSDK AFInAppEventParameterName = AFc1zSDK.AFa1xSDK.AFInAppEventParameterName(d7);
                                if (AFInAppEventParameterName != null) {
                                    arrayList.add(AFInAppEventParameterName);
                                }
                            }
                            list = arrayList;
                        }
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("Could not get stored exceptions\n ");
                        sb.append(th.getMessage());
                        String obj = sb.toString();
                        Intrinsics.checkNotNullParameter(obj, "");
                        AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(obj)));
                    }
                }
                if (list == null) {
                    list = W5.o.f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final String values(Throwable th, String str) {
        String str2;
        String x7;
        String b7;
        String d7;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            try {
                File afDebugLog = afDebugLog();
                str2 = null;
                if (afDebugLog != null) {
                    try {
                        Intrinsics.checkNotNullParameter(th, "");
                        Intrinsics.checkNotNullParameter(str, "");
                        StringBuilder sb = new StringBuilder();
                        Intrinsics.checkNotNullParameter(th, "");
                        String name = th.getClass().getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        sb.append(name);
                        sb.append(": ");
                        sb.append(str);
                        String obj = sb.toString();
                        Intrinsics.checkNotNullParameter(th, "");
                        Intrinsics.checkNotNullParameter(th, "");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(th);
                        sb2.append('\n');
                        x7 = W5.w.x(AFc1nSDK.AFInAppEventParameterName(th), "\n", null, null, 0, null, AFc1nSDK.AFa1wSDK.AFKeystoreWrapper, 30, null);
                        sb2.append(x7);
                        String AFInAppEventParameterName = AFc1uSDK.AFa1wSDK.AFInAppEventParameterName(sb2.toString());
                        b7 = V5.b.b(th);
                        AFc1zSDK aFc1zSDK = new AFc1zSDK(obj, AFInAppEventParameterName, b7);
                        String str3 = aFc1zSDK.AFKeystoreWrapper;
                        File file = new File(afDebugLog, str3);
                        if (file.exists()) {
                            d7 = e6.i.d(file, null, 1, null);
                            AFc1zSDK AFInAppEventParameterName2 = AFc1zSDK.AFa1xSDK.AFInAppEventParameterName(d7);
                            if (AFInAppEventParameterName2 != null) {
                                AFInAppEventParameterName2.valueOf++;
                                aFc1zSDK = AFInAppEventParameterName2;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder("label=");
                        sb3.append(AFc1uSDK.AFa1wSDK.valueOf(aFc1zSDK.AFInAppEventType));
                        sb3.append("\nhashName=");
                        sb3.append(AFc1uSDK.AFa1wSDK.valueOf(aFc1zSDK.AFKeystoreWrapper));
                        sb3.append("\nstackTrace=");
                        sb3.append(AFc1uSDK.AFa1wSDK.valueOf(aFc1zSDK.values));
                        sb3.append("\nc=");
                        sb3.append(aFc1zSDK.valueOf);
                        e6.i.f(file, sb3.toString(), null, 2, null);
                        str2 = str3;
                    } catch (Exception e7) {
                        StringBuilder sb4 = new StringBuilder("Could not cache exception\n");
                        StringBuilder sb5 = new StringBuilder(" ");
                        sb5.append(e7.getMessage());
                        String obj2 = sb5.toString();
                        Intrinsics.checkNotNullParameter(obj2, "");
                        sb4.append("[Exception Manager]: ".concat(String.valueOf(obj2)));
                        AFLogger.afRDLog(sb4.toString());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        if (r2.equals(j3.C1373c.f15449d) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.String> AFInAppEventType(android.content.Context r11, java.util.Map<java.lang.String, java.lang.String> r12, android.net.Uri r13) {
        /*
            java.lang.String r0 = "install_time"
            java.util.Set r1 = r13.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "media_source"
            r4 = 0
            java.lang.String r5 = "agency"
            if (r2 == 0) goto L69
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r13.getQueryParameter(r2)
            boolean r7 = r12.containsKey(r2)
            if (r7 != 0) goto L64
            int r7 = r2.hashCode()
            r8 = -1420799080(0xffffffffab505398, float:-7.4012454E-13)
            r9 = 2
            r10 = 1
            if (r7 == r8) goto L4d
            r8 = 99
            if (r7 == r8) goto L44
            r4 = 110987(0x1b18b, float:1.55526E-40)
            if (r7 == r4) goto L3a
            goto L57
        L3a:
            java.lang.String r4 = "pid"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L57
            r4 = r10
            goto L58
        L44:
            java.lang.String r7 = "c"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L57
            goto L58
        L4d:
            java.lang.String r4 = "af_prt"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L57
            r4 = r9
            goto L58
        L57:
            r4 = -1
        L58:
            if (r4 == 0) goto L61
            if (r4 == r10) goto L65
            if (r4 == r9) goto L5f
            goto L64
        L5f:
            r3 = r5
            goto L65
        L61:
            java.lang.String r3 = "campaign"
            goto L65
        L64:
            r3 = r2
        L65:
            r12.put(r3, r6)
            goto La
        L69:
            boolean r1 = r12.containsKey(r0)     // Catch: java.lang.Exception -> L9c
            if (r1 != 0) goto La2
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L9c
            java.util.Locale r6 = java.util.Locale.US     // Catch: java.lang.Exception -> L9c
            r2.<init>(r1, r6)     // Catch: java.lang.Exception -> L9c
            android.content.pm.PackageManager r1 = r11.getPackageManager()     // Catch: java.lang.Exception -> L9c
            java.lang.String r11 = r11.getPackageName()     // Catch: java.lang.Exception -> L9c
            android.content.pm.PackageInfo r11 = r1.getPackageInfo(r11, r4)     // Catch: java.lang.Exception -> L9c
            long r6 = r11.firstInstallTime     // Catch: java.lang.Exception -> L9c
            java.lang.String r11 = "UTC"
            java.util.TimeZone r11 = java.util.TimeZone.getTimeZone(r11)     // Catch: java.lang.Exception -> L9c
            r2.setTimeZone(r11)     // Catch: java.lang.Exception -> L9c
            java.util.Date r11 = new java.util.Date     // Catch: java.lang.Exception -> L9c
            r11.<init>(r6)     // Catch: java.lang.Exception -> L9c
            java.lang.String r11 = r2.format(r11)     // Catch: java.lang.Exception -> L9c
            r12.put(r0, r11)     // Catch: java.lang.Exception -> L9c
            goto La2
        L9c:
            r11 = move-exception
            java.lang.String r0 = "Could not fetch install time. "
            com.appsflyer.AFLogger.afErrorLog(r0, r11)
        La2:
            java.lang.String r11 = "af_deeplink"
            boolean r11 = r12.containsKey(r11)
            if (r11 == 0) goto Lb7
            java.lang.String r11 = "af_status"
            boolean r0 = r12.containsKey(r11)
            if (r0 != 0) goto Lb7
            java.lang.String r0 = "Non-organic"
            r12.put(r11, r0)
        Lb7:
            boolean r11 = r12.containsKey(r5)
            if (r11 == 0) goto Lc0
            r12.remove(r3)
        Lc0:
            java.lang.String r11 = r13.getPath()
            if (r11 == 0) goto Lcb
            java.lang.String r0 = "path"
            r12.put(r0, r11)
        Lcb:
            java.lang.String r11 = r13.getScheme()
            if (r11 == 0) goto Ld6
            java.lang.String r0 = "scheme"
            r12.put(r0, r11)
        Ld6:
            java.lang.String r11 = r13.getHost()
            if (r11 == 0) goto Le1
            java.lang.String r13 = "host"
            r12.put(r13, r11)
        Le1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1fSDK.AFInAppEventType(android.content.Context, java.util.Map, android.net.Uri):java.util.Map");
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final boolean values() {
        return AFInAppEventParameterName(new String[0]);
    }

    public static boolean values(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    public static boolean values(Context context, String str) {
        int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(checkPermission);
        AFLogger.afRDLog(sb.toString());
        return checkPermission == 0;
    }
}
