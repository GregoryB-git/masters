package com.appsflyer.internal;

import W5.E;
import W5.F;
import android.os.Build;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1fSDK;
import com.appsflyer.internal.AFc1uSDK;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class AFc1sSDK implements AFc1wSDK {
    private static int AFVersionDeclaration = 0;
    private static long afRDLog = 316052305582461199L;
    private static int afWarnLog = 1;

    @NotNull
    private final V5.h AFInAppEventParameterName;

    @NotNull
    private final V5.h AFInAppEventType;

    @NotNull
    private final V5.h AFKeystoreWrapper;

    @NotNull
    private final V5.h AFLogger;

    @NotNull
    private final V5.h afDebugLog;

    @NotNull
    private final V5.h afErrorLog;

    @NotNull
    private final String afInfoLog;

    @NotNull
    private final V5.h valueOf;

    @NotNull
    private AFc1xSDK values;

    @Metadata
    public static final class AFa1qSDK extends kotlin.jvm.internal.l implements g6.a {
        public AFa1qSDK() {
            super(0);
        }

        @Override // g6.a
        public final /* synthetic */ Object invoke() {
            AFe1wSDK afWarnLog = AFc1sSDK.AFInAppEventType(AFc1sSDK.this).afWarnLog();
            Intrinsics.checkNotNullExpressionValue(afWarnLog, "");
            return afWarnLog;
        }
    }

    @Metadata
    public static final class AFa1tSDK extends kotlin.jvm.internal.l implements g6.a {
        public AFa1tSDK() {
            super(0);
        }

        @Override // g6.a
        public final /* synthetic */ Object invoke() {
            return new CreateOneLinkHttpTask(AFc1sSDK.this.AFKeystoreWrapper());
        }
    }

    @Metadata
    public static final class AFa1vSDK extends kotlin.jvm.internal.l implements g6.a {
        public AFa1vSDK() {
            super(0);
        }

        @Override // g6.a
        public final /* synthetic */ Object invoke() {
            AFb1wSDK afRDLog = AFc1sSDK.AFInAppEventType(AFc1sSDK.this).afRDLog();
            Intrinsics.checkNotNullExpressionValue(afRDLog, "");
            return afRDLog;
        }
    }

    @Metadata
    public static final class AFa1wSDK extends kotlin.jvm.internal.l implements g6.a {
        public AFa1wSDK() {
            super(0);
        }

        @Override // g6.a
        public final /* synthetic */ Object invoke() {
            AFb1dSDK values = AFc1sSDK.AFInAppEventType(AFc1sSDK.this).values();
            Intrinsics.checkNotNullExpressionValue(values, "");
            return values;
        }
    }

    @Metadata
    public static final class AFa1xSDK extends kotlin.jvm.internal.l implements g6.a {
        public AFa1xSDK() {
            super(0);
        }

        @Override // g6.a
        public final /* synthetic */ Object invoke() {
            AFb1gSDK AFInAppEventParameterName = AFc1sSDK.AFInAppEventType(AFc1sSDK.this).AFInAppEventParameterName();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            return AFInAppEventParameterName;
        }
    }

    @Metadata
    public static final class AFa1ySDK extends kotlin.jvm.internal.l implements g6.a {
        public AFa1ySDK() {
            super(0);
        }

        @Override // g6.a
        public final /* synthetic */ Object invoke() {
            ExecutorService AFInAppEventType = AFc1sSDK.AFInAppEventType(AFc1sSDK.this).AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
            return AFInAppEventType;
        }
    }

    @Metadata
    public static final class AFa1zSDK extends kotlin.jvm.internal.l implements g6.a {
        public AFa1zSDK() {
            super(0);
        }

        @Override // g6.a
        public final /* synthetic */ Object invoke() {
            AFb1bSDK init = AFc1sSDK.AFInAppEventType(AFc1sSDK.this).init();
            Intrinsics.checkNotNullExpressionValue(init, "");
            return new AFa1fSDK(init);
        }
    }

    public AFc1sSDK(@NotNull AFc1xSDK aFc1xSDK) {
        V5.h a7;
        V5.h a8;
        V5.h a9;
        V5.h a10;
        V5.h a11;
        V5.h a12;
        V5.h a13;
        Intrinsics.checkNotNullParameter(aFc1xSDK, "");
        this.values = aFc1xSDK;
        a7 = V5.j.a(new AFa1vSDK());
        this.AFInAppEventType = a7;
        a8 = V5.j.a(new AFa1xSDK());
        this.AFInAppEventParameterName = a8;
        a9 = V5.j.a(new AFa1wSDK());
        this.AFKeystoreWrapper = a9;
        a10 = V5.j.a(new AFa1qSDK());
        this.valueOf = a10;
        a11 = V5.j.a(new AFa1ySDK());
        this.afDebugLog = a11;
        this.afInfoLog = "6.12.2";
        a12 = V5.j.a(new AFa1zSDK());
        this.afErrorLog = a12;
        a13 = V5.j.a(new AFa1tSDK());
        this.AFLogger = a13;
    }

    private final AFb1wSDK AFInAppEventParameterName() {
        AFVersionDeclaration = (afWarnLog + 75) % 128;
        AFb1wSDK aFb1wSDK = (AFb1wSDK) this.AFInAppEventType.getValue();
        AFVersionDeclaration = (afWarnLog + 109) % 128;
        return aFb1wSDK;
    }

    public static final /* synthetic */ AFc1xSDK AFInAppEventType(AFc1sSDK aFc1sSDK) {
        int i7 = AFVersionDeclaration + 99;
        int i8 = i7 % 128;
        afWarnLog = i8;
        int i9 = i7 % 2;
        AFc1xSDK aFc1xSDK = aFc1sSDK.values;
        if (i9 == 0) {
            throw null;
        }
        int i10 = i8 + 21;
        AFVersionDeclaration = i10 % 128;
        if (i10 % 2 == 0) {
            return aFc1xSDK;
        }
        throw null;
    }

    @NotNull
    private String AFLogger() {
        int i7 = (AFVersionDeclaration + 99) % 128;
        afWarnLog = i7;
        String str = this.afInfoLog;
        AFVersionDeclaration = (i7 + 25) % 128;
        return str;
    }

    private final synchronized void AFLogger$LogLevel() {
        long j7;
        String str;
        try {
            AFb1fSDK.AFa1ySDK afWarnLog2 = afWarnLog();
            if (afWarnLog2 != null) {
                afWarnLog = (AFVersionDeclaration + 91) % 128;
                j7 = afWarnLog2.valueOf;
            } else {
                j7 = -1;
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            try {
                AFb1fSDK.AFa1ySDK afWarnLog3 = afWarnLog();
                str = afWarnLog3 != null ? afWarnLog3.AFInAppEventType : null;
                if (str == null) {
                    AFVersionDeclaration = (afWarnLog + 89) % 128;
                    str = "";
                }
            } catch (NullPointerException unused) {
                str = "NOT_DETECTED";
            }
            if (j7 >= currentTimeMillis) {
                if (AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(str) != -1 && AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(str) <= AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(AFLogger())) {
                    AFKeystoreWrapper().AFInAppEventParameterName(AFLogger());
                    return;
                } else {
                    afInfoLog().AFInAppEventType("af_send_exc_to_server_window");
                    AFKeystoreWrapper().values();
                    return;
                }
            }
            Intrinsics.checkNotNullParameter("TTL is already passed", "");
            AFLogger.afRDLog("[Exception Manager]: ".concat("TTL is already passed"));
            afInfoLog().AFInAppEventType("af_send_exc_to_server_window");
            AFKeystoreWrapper().values();
            int i7 = afWarnLog + 69;
            AFVersionDeclaration = i7 % 128;
            if (i7 % 2 == 0) {
            } else {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void AFVersionDeclaration() {
        int i7 = afWarnLog + 55;
        AFVersionDeclaration = i7 % 128;
        if (i7 % 2 != 0) {
            afWarnLog();
            throw null;
        }
        AFb1fSDK.AFa1ySDK afWarnLog2 = afWarnLog();
        if (afWarnLog2 == null) {
            int i8 = afWarnLog + 73;
            AFVersionDeclaration = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 64 / 0;
                return;
            }
            return;
        }
        if (afWarnLog2.AFKeystoreWrapper == -1) {
            afInfoLog().AFInAppEventType("af_send_exc_to_server_window");
            AFVersionDeclaration = (afWarnLog + 11) % 128;
            return;
        }
        if (afInfoLog().valueOf("af_send_exc_to_server_window", -1L) == -1) {
            int i10 = afWarnLog2.AFInAppEventParameterName;
            long currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(afWarnLog2.AFKeystoreWrapper);
            AFb1dSDK afInfoLog = afInfoLog();
            afInfoLog.AFInAppEventParameterName("af_send_exc_to_server_window", currentTimeMillis);
            afInfoLog.AFInAppEventType("af_send_exc_min", i10);
        }
        return;
    }

    private final AFe1wSDK afDebugLog() {
        int i7 = AFVersionDeclaration + 71;
        afWarnLog = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        AFe1wSDK aFe1wSDK = (AFe1wSDK) this.valueOf.getValue();
        int i8 = AFVersionDeclaration + 77;
        afWarnLog = i8 % 128;
        if (i8 % 2 != 0) {
            return aFe1wSDK;
        }
        throw null;
    }

    private final ExecutorService afErrorLog() {
        afWarnLog = (AFVersionDeclaration + 95) % 128;
        ExecutorService executorService = (ExecutorService) this.afDebugLog.getValue();
        int i7 = AFVersionDeclaration + 43;
        afWarnLog = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 86 / 0;
        }
        return executorService;
    }

    @NotNull
    private AFc1uSDK afErrorLogForExcManagerOnly() {
        AFVersionDeclaration = (afWarnLog + 23) % 128;
        AFc1uSDK aFc1uSDK = (AFc1uSDK) this.AFLogger.getValue();
        afWarnLog = (AFVersionDeclaration + 93) % 128;
        return aFc1uSDK;
    }

    private final AFb1dSDK afInfoLog() {
        int i7 = AFVersionDeclaration + 3;
        afWarnLog = i7 % 128;
        if (i7 % 2 != 0) {
            return (AFb1dSDK) this.AFKeystoreWrapper.getValue();
        }
        throw null;
    }

    private final AFb1gSDK afRDLog() {
        int i7 = afWarnLog + 125;
        AFVersionDeclaration = i7 % 128;
        if (i7 % 2 == 0) {
            return (AFb1gSDK) this.AFInAppEventParameterName.getValue();
        }
        throw null;
    }

    private final AFb1fSDK.AFa1ySDK afWarnLog() {
        AFd1aSDK aFd1aSDK;
        AFe1qSDK aFe1qSDK = AFInAppEventParameterName().AFInAppEventType.AFInAppEventParameterName;
        if (aFe1qSDK != null && (aFd1aSDK = aFe1qSDK.AFInAppEventParameterName) != null) {
            AFVersionDeclaration = (afWarnLog + 9) % 128;
            return aFd1aSDK.values;
        }
        int i7 = AFVersionDeclaration + 115;
        afWarnLog = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void getLevel() {
        AFb1fSDK.AFa1ySDK afWarnLog2 = afWarnLog();
        if (afWarnLog2 == null) {
            int i7 = AFVersionDeclaration + 3;
            afWarnLog = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 11 / 0;
                return;
            }
            return;
        }
        AFVersionDeclaration = (afWarnLog + 125) % 128;
        if (!AFInAppEventType(afWarnLog2)) {
            Intrinsics.checkNotNullParameter("skipping", "");
            AFLogger.afRDLog("[Exception Manager]: ".concat("skipping"));
            return;
        }
        String str = afDebugLog().AFInAppEventParameterName;
        if (str != null) {
            String jSONObject = new JSONObject(values(AFInAppEventParameterName(afWarnLog2), AFKeystoreWrapper().AFKeystoreWrapper())).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            Intrinsics.checkNotNullExpressionValue(str, "");
            AFKeystoreWrapper(jSONObject, str);
        }
    }

    private static Map<String, Object> values(Map<String, ? extends Object> map, List<AFc1zSDK> list) {
        Map<String, Object> f7;
        int i7 = afWarnLog + 27;
        AFVersionDeclaration = i7 % 128;
        if (i7 % 2 != 0) {
            V5.m[] mVarArr = new V5.m[5];
            mVarArr[1] = V5.q.a("deviceInfo", map);
            mVarArr[1] = V5.q.a("excs", AFc1uSDK.AFa1wSDK.values(list));
            f7 = F.f(mVarArr);
        } else {
            f7 = F.f(V5.q.a("deviceInfo", map), V5.q.a("excs", AFc1uSDK.AFa1wSDK.values(list)));
        }
        afWarnLog = (AFVersionDeclaration + 47) % 128;
        return f7;
    }

    @NotNull
    public final AFc1vSDK AFKeystoreWrapper() {
        AFVersionDeclaration = (afWarnLog + 13) % 128;
        AFc1vSDK aFc1vSDK = (AFc1vSDK) this.afErrorLog.getValue();
        int i7 = AFVersionDeclaration + 87;
        afWarnLog = i7 % 128;
        if (i7 % 2 != 0) {
            return aFc1vSDK;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFc1wSDK
    public final void valueOf() {
        AFVersionDeclaration = (afWarnLog + 17) % 128;
        afErrorLog().execute(new Runnable() { // from class: com.appsflyer.internal.p
            @Override // java.lang.Runnable
            public final void run() {
                AFc1sSDK.values(AFc1sSDK.this);
            }
        });
        AFVersionDeclaration = (afWarnLog + 27) % 128;
    }

    private final Map<String, String> AFInAppEventParameterName(AFb1fSDK.AFa1ySDK aFa1ySDK) {
        Map<String, String> f7;
        Object[] objArr = new Object[1];
        AFInAppEventType("Ꮵₖ\udf26\uef34ᎇ뇫ﵙ屷垽", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        V5.m a7 = V5.q.a(((String) objArr[0]).intern(), Build.BRAND);
        V5.m a8 = V5.q.a("model", Build.MODEL);
        V5.m a9 = V5.q.a("app_id", afRDLog().valueOf.AFInAppEventType.getPackageName());
        V5.m a10 = V5.q.a("p_ex", new AFb1xSDK().AFInAppEventParameterName());
        V5.m a11 = V5.q.a("api", String.valueOf(Build.VERSION.SDK_INT));
        V5.m a12 = V5.q.a("sdk", AFLogger());
        AFb1gSDK afRDLog2 = afRDLog();
        f7 = F.f(a7, a8, a9, a10, a11, a12, V5.q.a("uid", AFb1zSDK.valueOf(afRDLog2.valueOf, afRDLog2.AFInAppEventType)), V5.q.a("exc_config", aFa1ySDK.AFInAppEventType()));
        AFVersionDeclaration = (afWarnLog + 1) % 128;
        return f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFc1sSDK aFc1sSDK) {
        afWarnLog = (AFVersionDeclaration + 37) % 128;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        aFc1sSDK.AFVersionDeclaration();
        afWarnLog = (AFVersionDeclaration + 91) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if ((r0 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r1 = 20 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r9 >= r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        r14 = r14.AFInAppEventType;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (com.appsflyer.internal.AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(r14) != com.appsflyer.internal.AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(AFLogger())) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r9 >= r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r14.valueOf >= (r7 / 1000)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r14.valueOf >= (r7 | 1000)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (r9 == (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        r0 = com.appsflyer.internal.AFc1sSDK.afWarnLog + 119;
        com.appsflyer.internal.AFc1sSDK.AFVersionDeclaration = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean valueOf(com.appsflyer.internal.AFb1fSDK.AFa1ySDK r14) {
        /*
            r13 = this;
            int r0 = com.appsflyer.internal.AFc1sSDK.afWarnLog
            int r0 = r0 + 17
            int r1 = r0 % 128
            com.appsflyer.internal.AFc1sSDK.AFVersionDeclaration = r1
            int r0 = r0 % 2
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r3 = "af_send_exc_to_server_window"
            r4 = 0
            r5 = -1
            long r7 = java.lang.System.currentTimeMillis()
            if (r0 == 0) goto L28
            com.appsflyer.internal.AFb1dSDK r0 = r13.afInfoLog()
            long r9 = r0.valueOf(r3, r5)
            long r11 = r14.valueOf
            long r0 = r7 | r1
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L6c
            goto L38
        L28:
            com.appsflyer.internal.AFb1dSDK r0 = r13.afInfoLog()
            long r9 = r0.valueOf(r3, r5)
            long r11 = r14.valueOf
            long r0 = r7 / r1
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L6c
        L38:
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 == 0) goto L6c
            int r0 = com.appsflyer.internal.AFc1sSDK.afWarnLog
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.appsflyer.internal.AFc1sSDK.AFVersionDeclaration = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L50
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r1 = 20
            int r1 = r1 / r4
            if (r0 >= 0) goto L55
            goto L6c
        L50:
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L55
            goto L6c
        L55:
            java.lang.String r14 = r14.AFInAppEventType
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r0)
            int r14 = com.appsflyer.internal.AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(r14)
            java.lang.String r0 = r13.AFLogger()
            int r0 = com.appsflyer.internal.AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(r0)
            if (r14 != r0) goto L6c
            r14 = 1
            return r14
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1sSDK.valueOf(com.appsflyer.internal.AFb1fSDK$AFa1ySDK):boolean");
    }

    @Override // com.appsflyer.internal.AFc1wSDK
    public final void AFInAppEventType() {
        int i7 = AFVersionDeclaration + 85;
        afWarnLog = i7 % 128;
        if (i7 % 2 != 0) {
            afErrorLog().execute(new Runnable() { // from class: com.appsflyer.internal.o
                @Override // java.lang.Runnable
                public final void run() {
                    AFc1sSDK.AFKeystoreWrapper(AFc1sSDK.this);
                }
            });
        } else {
            afErrorLog().execute(new Runnable() { // from class: com.appsflyer.internal.o
                @Override // java.lang.Runnable
                public final void run() {
                    AFc1sSDK.AFKeystoreWrapper(AFc1sSDK.this);
                }
            });
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFc1wSDK
    public final void values() {
        afWarnLog = (AFVersionDeclaration + 87) % 128;
        afErrorLog().execute(new Runnable() { // from class: com.appsflyer.internal.r
            @Override // java.lang.Runnable
            public final void run() {
                AFc1sSDK.AFInAppEventParameterName(AFc1sSDK.this);
            }
        });
        AFVersionDeclaration = (afWarnLog + 79) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFc1sSDK aFc1sSDK) {
        AFVersionDeclaration = (afWarnLog + 77) % 128;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        aFc1sSDK.AFLogger$LogLevel();
        AFVersionDeclaration = (afWarnLog + 61) % 128;
    }

    private static void AFInAppEventType(String str, int i7, Object[] objArr) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFg1rSDK.AFInAppEventParameterName) {
            try {
                char[] AFInAppEventType = AFg1rSDK.AFInAppEventType(afRDLog, cArr2, i7);
                AFg1rSDK.AFInAppEventType = 4;
                while (true) {
                    int i8 = AFg1rSDK.AFInAppEventType;
                    if (i8 < AFInAppEventType.length) {
                        AFg1rSDK.AFKeystoreWrapper = i8 - 4;
                        AFInAppEventType[AFg1rSDK.AFInAppEventType] = (char) ((AFInAppEventType[r1] ^ AFInAppEventType[r1 % 4]) ^ (AFg1rSDK.AFKeystoreWrapper * afRDLog));
                        AFg1rSDK.AFInAppEventType++;
                    } else {
                        str2 = new String(AFInAppEventType, 4, AFInAppEventType.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str2;
    }

    private final void AFKeystoreWrapper(String str, String str2) {
        Map<String, String> b7;
        afWarnLog = (AFVersionDeclaration + 121) % 128;
        byte[] bytes = str.getBytes(kotlin.text.b.f16240b);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        b7 = E.b(V5.q.a("Authorization", AFc1nSDK.valueOf(str, str2)));
        afErrorLogForExcManagerOnly().valueOf(bytes, b7, 2000);
        int i7 = afWarnLog + 3;
        AFVersionDeclaration = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFc1sSDK aFc1sSDK) {
        AFVersionDeclaration = (afWarnLog + 79) % 128;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        aFc1sSDK.getLevel();
        AFVersionDeclaration = (afWarnLog + 109) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFc1sSDK aFc1sSDK, Throwable th, String str) {
        AFb1fSDK.AFa1ySDK afWarnLog2;
        int i7 = afWarnLog + 93;
        AFVersionDeclaration = i7 % 128;
        int i8 = i7 % 2;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (i8 != 0) {
            afWarnLog2 = aFc1sSDK.afWarnLog();
            int i9 = 21 / 0;
            if (afWarnLog2 == null) {
                return;
            }
        } else {
            afWarnLog2 = aFc1sSDK.afWarnLog();
            if (afWarnLog2 == null) {
                return;
            }
        }
        if (aFc1sSDK.valueOf(afWarnLog2)) {
            aFc1sSDK.AFKeystoreWrapper().values(th, str);
        } else {
            AFVersionDeclaration = (afWarnLog + 53) % 128;
        }
    }

    private final boolean AFInAppEventType(AFb1fSDK.AFa1ySDK aFa1ySDK) {
        int values;
        afWarnLog = (AFVersionDeclaration + 43) % 128;
        long currentTimeMillis = System.currentTimeMillis();
        long valueOf = afInfoLog().valueOf("af_send_exc_to_server_window", -1L);
        if (aFa1ySDK.valueOf < currentTimeMillis / 1000) {
            afWarnLog = (AFVersionDeclaration + 95) % 128;
            return false;
        }
        if (valueOf != -1) {
            int i7 = afWarnLog + 101;
            AFVersionDeclaration = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            if (valueOf >= currentTimeMillis && (values = afInfoLog().values("af_send_exc_min", -1)) != -1) {
                int i8 = AFVersionDeclaration + 117;
                afWarnLog = i8 % 128;
                if (i8 % 2 == 0) {
                    AFKeystoreWrapper().AFInAppEventType();
                    throw null;
                }
                if (AFKeystoreWrapper().AFInAppEventType() >= values) {
                    String str = aFa1ySDK.AFInAppEventType;
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    if (AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(str) != AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(AFLogger())) {
                        return false;
                    }
                    afWarnLog = (AFVersionDeclaration + 65) % 128;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFc1wSDK
    public final void AFKeystoreWrapper(@NotNull final Throwable th, @NotNull final String str) {
        int i7 = afWarnLog + 1;
        AFVersionDeclaration = i7 % 128;
        int i8 = i7 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (i8 != 0) {
            afErrorLog().execute(new Runnable() { // from class: com.appsflyer.internal.q
                @Override // java.lang.Runnable
                public final void run() {
                    AFc1sSDK.AFInAppEventParameterName(AFc1sSDK.this, th, str);
                }
            });
            throw null;
        }
        afErrorLog().execute(new Runnable() { // from class: com.appsflyer.internal.q
            @Override // java.lang.Runnable
            public final void run() {
                AFc1sSDK.AFInAppEventParameterName(AFc1sSDK.this, th, str);
            }
        });
        afWarnLog = (AFVersionDeclaration + 81) % 128;
    }
}
