// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.List;
import org.json.JSONObject;
import java.util.concurrent.TimeUnit;
import com.appsflyer.AFLogger;
import kotlin.text.b;
import W5.C;
import V5.m;
import android.os.Build$VERSION;
import V5.q;
import android.os.Build;
import android.view.ViewConfiguration;
import java.util.Map;
import com.appsflyer.CreateOneLinkHttpTask;
import java.util.concurrent.ExecutorService;
import V5.i;
import kotlin.jvm.internal.l;
import g6.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import V5.h;
import kotlin.Metadata;

@Metadata
public final class AFc1sSDK implements AFc1wSDK
{
    private static int AFVersionDeclaration = 0;
    private static long afRDLog = 316052305582461199L;
    private static int afWarnLog = 1;
    @NotNull
    private final h AFInAppEventParameterName;
    @NotNull
    private final h AFInAppEventType;
    @NotNull
    private final h AFKeystoreWrapper;
    @NotNull
    private final h AFLogger;
    @NotNull
    private final h afDebugLog;
    @NotNull
    private final h afErrorLog;
    @NotNull
    private final String afInfoLog;
    @NotNull
    private final h valueOf;
    @NotNull
    private AFc1xSDK values;
    
    public AFc1sSDK(@NotNull final AFc1xSDK values) {
        Intrinsics.checkNotNullParameter(values, "");
        this.values = values;
        this.AFInAppEventType = i.a(new a() {});
        this.AFInAppEventParameterName = i.a(new a() {});
        this.AFKeystoreWrapper = i.a(new a() {});
        this.valueOf = i.a(new a() {});
        this.afDebugLog = i.a(new a() {});
        this.afInfoLog = "6.12.2";
        this.afErrorLog = i.a(new a() {});
        this.AFLogger = i.a(new a() {});
    }
    
    private final AFb1wSDK AFInAppEventParameterName() {
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 75) % 128;
        final AFb1wSDK aFb1wSDK = (AFb1wSDK)this.AFInAppEventType.getValue();
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 109) % 128;
        return aFb1wSDK;
    }
    
    private final Map<String, String> AFInAppEventParameterName(final AFb1fSDK.AFa1ySDK aFa1ySDK) {
        final int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize();
        final Object[] array = { null };
        AFInAppEventType("\u13e5\u2096\udf26\uef34\u1387\ub1eb\ufd59\u5c77\u57bd", 1 - (maximumDrawingCacheSize >> 24), array);
        final m a = q.a(((String)array[0]).intern(), Build.BRAND);
        final m a2 = q.a("model", Build.MODEL);
        final m a3 = q.a("app_id", this.afRDLog().valueOf.AFInAppEventType.getPackageName());
        final m a4 = q.a("p_ex", new AFb1xSDK().AFInAppEventParameterName());
        final m a5 = q.a("api", String.valueOf(Build$VERSION.SDK_INT));
        final m a6 = q.a("sdk", this.AFLogger());
        final AFb1gSDK afRDLog = this.afRDLog();
        final Map f = C.f(a, a2, a3, a4, a5, a6, q.a("uid", AFb1zSDK.valueOf(afRDLog.valueOf, afRDLog.AFInAppEventType)), q.a("exc_config", aFa1ySDK.AFInAppEventType()));
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 1) % 128;
        return (Map<String, String>)f;
    }
    
    private static final void AFInAppEventParameterName(final AFc1sSDK aFc1sSDK) {
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 77) % 128;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        aFc1sSDK.AFLogger$LogLevel();
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 61) % 128;
    }
    
    private static final void AFInAppEventParameterName(final AFc1sSDK aFc1sSDK, final Throwable t, final String s) {
        final int n = AFc1sSDK.afWarnLog + 93;
        AFc1sSDK.AFVersionDeclaration = n % 128;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(s, "");
        AFb1fSDK.AFa1ySDK aFa1ySDK;
        if (n % 2 != 0) {
            aFa1ySDK = aFc1sSDK.afWarnLog();
            if (aFa1ySDK == null) {
                return;
            }
        }
        else {
            aFa1ySDK = aFc1sSDK.afWarnLog();
            if (aFa1ySDK == null) {
                return;
            }
        }
        if (aFc1sSDK.valueOf(aFa1ySDK)) {
            aFc1sSDK.AFKeystoreWrapper().values(t, s);
            return;
        }
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 53) % 128;
    }
    
    private static void AFInAppEventType(String afInAppEventParameterName, int n, final Object[] array) {
        Object charArray = afInAppEventParameterName;
        if (afInAppEventParameterName != null) {
            charArray = afInAppEventParameterName.toCharArray();
        }
        final char[] array2 = (char[])charArray;
        afInAppEventParameterName = (String)AFg1rSDK.AFInAppEventParameterName;
        // monitorenter(afInAppEventParameterName)
        while (true) {
            try {
                final char[] afInAppEventType = AFg1rSDK.AFInAppEventType(AFc1sSDK.afRDLog, array2, n);
                AFg1rSDK.AFInAppEventType = 4;
                while (true) {
                    n = AFg1rSDK.AFInAppEventType;
                    if (n >= afInAppEventType.length) {
                        break;
                    }
                    AFg1rSDK.AFKeystoreWrapper = n - 4;
                    n = AFg1rSDK.AFInAppEventType;
                    afInAppEventType[n] = (char)((long)(afInAppEventType[n] ^ afInAppEventType[n % 4]) ^ AFg1rSDK.AFKeystoreWrapper * AFc1sSDK.afRDLog);
                    ++AFg1rSDK.AFInAppEventType;
                }
                final String s = new String(afInAppEventType, 4, afInAppEventType.length - 4);
                // monitorexit(afInAppEventParameterName)
                array[0] = s;
                return;
                // monitorexit(afInAppEventParameterName)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    private final boolean AFInAppEventType(final AFb1fSDK.AFa1ySDK aFa1ySDK) {
        AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 43) % 128;
        final long currentTimeMillis = System.currentTimeMillis();
        final long value = this.afInfoLog().valueOf("af_send_exc_to_server_window", -1L);
        if (aFa1ySDK.valueOf < currentTimeMillis / 1000L) {
            AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 95) % 128;
            return false;
        }
        if (value == -1L) {
            return false;
        }
        final int n = AFc1sSDK.afWarnLog + 101;
        AFc1sSDK.AFVersionDeclaration = n % 128;
        if (n % 2 != 0) {
            throw null;
        }
        if (value < currentTimeMillis) {
            return false;
        }
        final int values = this.afInfoLog().values("af_send_exc_min", -1);
        if (values == -1) {
            return false;
        }
        final int n2 = AFc1sSDK.AFVersionDeclaration + 117;
        AFc1sSDK.afWarnLog = n2 % 128;
        if (n2 % 2 == 0) {
            this.AFKeystoreWrapper().AFInAppEventType();
            throw null;
        }
        if (this.AFKeystoreWrapper().AFInAppEventType() < values) {
            return false;
        }
        final String afInAppEventType = aFa1ySDK.AFInAppEventType;
        Intrinsics.checkNotNullExpressionValue(afInAppEventType, "");
        if (AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(afInAppEventType) == AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(this.AFLogger())) {
            AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 65) % 128;
            return true;
        }
        return false;
    }
    
    private static final void AFKeystoreWrapper(final AFc1sSDK aFc1sSDK) {
        AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 37) % 128;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        aFc1sSDK.AFVersionDeclaration();
        AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 91) % 128;
    }
    
    private final void AFKeystoreWrapper(final String s, final String s2) {
        AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 121) % 128;
        final byte[] bytes = s.getBytes(b.b);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        this.afErrorLogForExcManagerOnly().valueOf(bytes, C.b(q.a("Authorization", AFc1nSDK.valueOf(s, s2))), 2000);
        final int n = AFc1sSDK.afWarnLog + 3;
        AFc1sSDK.AFVersionDeclaration = n % 128;
        if (n % 2 == 0) {
            return;
        }
        throw null;
    }
    
    @NotNull
    private String AFLogger() {
        final int n = AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 99) % 128;
        final String afInfoLog = this.afInfoLog;
        AFc1sSDK.AFVersionDeclaration = (n + 25) % 128;
        return afInfoLog;
    }
    
    private final void AFLogger$LogLevel() {
        while (true) {
            // monitorenter(this)
        Label_0255_Outer:
            while (true) {
            Label_0270:
                while (true) {
                    try {
                        final AFb1fSDK.AFa1ySDK afWarnLog = this.afWarnLog();
                        if (afWarnLog != null) {
                            AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 91) % 128;
                            final long valueOf = afWarnLog.valueOf;
                            final long n = System.currentTimeMillis() / 1000L;
                            while (true) {
                                try {
                                    final AFb1fSDK.AFa1ySDK afWarnLog2 = this.afWarnLog();
                                    String afInAppEventType;
                                    if (afWarnLog2 != null) {
                                        afInAppEventType = afWarnLog2.AFInAppEventType;
                                    }
                                    else {
                                        afInAppEventType = null;
                                    }
                                    String s = afInAppEventType;
                                    if (afInAppEventType == null) {
                                        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 89) % 128;
                                        s = "";
                                    }
                                    while (true) {
                                        if (valueOf < n) {
                                            Intrinsics.checkNotNullParameter("TTL is already passed", "");
                                            com.appsflyer.AFLogger.afRDLog("[Exception Manager]: ".concat("TTL is already passed"));
                                            this.afInfoLog().AFInAppEventType("af_send_exc_to_server_window");
                                            this.AFKeystoreWrapper().values();
                                            final int n2 = AFc1sSDK.afWarnLog + 69;
                                            AFc1sSDK.AFVersionDeclaration = n2 % 128;
                                            if (n2 % 2 == 0) {
                                                // monitorexit(this)
                                                return;
                                            }
                                            try {
                                                throw null;
                                            }
                                            finally {}
                                        }
                                        if (AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(s) != -1 && AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(s) <= AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(this.AFLogger())) {
                                            this.AFKeystoreWrapper().AFInAppEventParameterName(this.AFLogger());
                                            // monitorexit(this)
                                            return;
                                        }
                                        this.afInfoLog().AFInAppEventType("af_send_exc_to_server_window");
                                        this.AFKeystoreWrapper().values();
                                        return;
                                        s = "NOT_DETECTED";
                                        continue Label_0255_Outer;
                                    }
                                }
                                // monitorexit(this)
                                // monitorexit(this)
                                catch (NullPointerException ex) {}
                                continue;
                            }
                        }
                        break Label_0270;
                    }
                    finally {}
                    continue;
                }
                final long valueOf = -1L;
                continue Label_0255_Outer;
            }
        }
    }
    
    private final void AFVersionDeclaration() {
        // monitorenter(this)
        // monitorexit(this)
        // monitorexit(this)
        Label_0207: {
            Label_0195: {
                Label_0158: {
                    try {
                        final int n = AFc1sSDK.afWarnLog + 55;
                        AFc1sSDK.AFVersionDeclaration = n % 128;
                        if (n % 2 != 0) {
                            break Label_0195;
                        }
                        final AFb1fSDK.AFa1ySDK afWarnLog = this.afWarnLog();
                        if (afWarnLog == null) {
                            break Label_0158;
                        }
                        if (afWarnLog.AFKeystoreWrapper == -1) {
                            this.afInfoLog().AFInAppEventType("af_send_exc_to_server_window");
                            AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 11) % 128;
                            // monitorexit(this)
                            return;
                        }
                    }
                    finally {
                        break Label_0207;
                    }
                    if (this.afInfoLog().valueOf("af_send_exc_to_server_window", -1L) == -1L) {
                        final AFb1fSDK.AFa1ySDK aFa1ySDK;
                        final int afInAppEventParameterName = aFa1ySDK.AFInAppEventParameterName;
                        final int afKeystoreWrapper = aFa1ySDK.AFKeystoreWrapper;
                        final long currentTimeMillis = System.currentTimeMillis();
                        final long millis = TimeUnit.DAYS.toMillis(afKeystoreWrapper);
                        final AFb1dSDK afInfoLog = this.afInfoLog();
                        afInfoLog.AFInAppEventParameterName("af_send_exc_to_server_window", currentTimeMillis + millis);
                        afInfoLog.AFInAppEventType("af_send_exc_min", afInAppEventParameterName);
                    }
                    return;
                }
                final int n2 = AFc1sSDK.afWarnLog + 73;
                AFc1sSDK.AFVersionDeclaration = n2 % 128;
                if (n2 % 2 != 0) {
                    try {
                        // monitorexit(this)
                        return;
                    }
                    finally {}
                }
                return;
            }
            this.afWarnLog();
            try {
                throw null;
            }
            finally {}
        }
    }
    // monitorexit(this)
    
    private final AFe1wSDK afDebugLog() {
        final int n = AFc1sSDK.AFVersionDeclaration + 71;
        AFc1sSDK.afWarnLog = n % 128;
        if (n % 2 == 0) {
            final AFe1wSDK aFe1wSDK = (AFe1wSDK)this.valueOf.getValue();
            throw null;
        }
        final AFe1wSDK aFe1wSDK2 = (AFe1wSDK)this.valueOf.getValue();
        final int n2 = AFc1sSDK.AFVersionDeclaration + 77;
        AFc1sSDK.afWarnLog = n2 % 128;
        if (n2 % 2 != 0) {
            return aFe1wSDK2;
        }
        throw null;
    }
    
    private final ExecutorService afErrorLog() {
        AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 95) % 128;
        final ExecutorService executorService = (ExecutorService)this.afDebugLog.getValue();
        final int n = AFc1sSDK.AFVersionDeclaration + 43;
        AFc1sSDK.afWarnLog = n % 128;
        if (n % 2 == 0) {}
        return executorService;
    }
    
    @NotNull
    private AFc1uSDK afErrorLogForExcManagerOnly() {
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 23) % 128;
        final AFc1uSDK aFc1uSDK = (AFc1uSDK)this.AFLogger.getValue();
        AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 93) % 128;
        return aFc1uSDK;
    }
    
    private final AFb1dSDK afInfoLog() {
        final int n = AFc1sSDK.AFVersionDeclaration + 3;
        AFc1sSDK.afWarnLog = n % 128;
        if (n % 2 != 0) {
            return (AFb1dSDK)this.AFKeystoreWrapper.getValue();
        }
        final AFb1dSDK aFb1dSDK = (AFb1dSDK)this.AFKeystoreWrapper.getValue();
        throw null;
    }
    
    private final AFb1gSDK afRDLog() {
        final int n = AFc1sSDK.afWarnLog + 125;
        AFc1sSDK.AFVersionDeclaration = n % 128;
        if (n % 2 == 0) {
            return (AFb1gSDK)this.AFInAppEventParameterName.getValue();
        }
        final AFb1gSDK aFb1gSDK = (AFb1gSDK)this.AFInAppEventParameterName.getValue();
        throw null;
    }
    
    private final AFb1fSDK.AFa1ySDK afWarnLog() {
        final AFe1qSDK afInAppEventParameterName = this.AFInAppEventParameterName().AFInAppEventType.AFInAppEventParameterName;
        if (afInAppEventParameterName != null) {
            final AFd1aSDK afInAppEventParameterName2 = afInAppEventParameterName.AFInAppEventParameterName;
            if (afInAppEventParameterName2 != null) {
                AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 9) % 128;
                return afInAppEventParameterName2.values;
            }
        }
        final int n = AFc1sSDK.AFVersionDeclaration + 115;
        AFc1sSDK.afWarnLog = n % 128;
        if (n % 2 != 0) {
            return null;
        }
        throw null;
    }
    
    private final void getLevel() {
        final AFb1fSDK.AFa1ySDK afWarnLog = this.afWarnLog();
        if (afWarnLog == null) {
            final int n = AFc1sSDK.AFVersionDeclaration + 3;
            AFc1sSDK.afWarnLog = n % 128;
            if (n % 2 == 0) {}
            return;
        }
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 125) % 128;
        if (!(this.AFInAppEventType(afWarnLog) ^ true)) {
            final String afInAppEventParameterName = this.afDebugLog().AFInAppEventParameterName;
            if (afInAppEventParameterName != null) {
                final String string = new JSONObject((Map)values(this.AFInAppEventParameterName(afWarnLog), this.AFKeystoreWrapper().AFKeystoreWrapper())).toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                Intrinsics.checkNotNullExpressionValue(afInAppEventParameterName, "");
                this.AFKeystoreWrapper(string, afInAppEventParameterName);
            }
            return;
        }
        Intrinsics.checkNotNullParameter("skipping", "");
        com.appsflyer.AFLogger.afRDLog("[Exception Manager]: ".concat("skipping"));
    }
    
    private final boolean valueOf(final AFb1fSDK.AFa1ySDK aFa1ySDK) {
        final int n = AFc1sSDK.afWarnLog + 17;
        AFc1sSDK.AFVersionDeclaration = n % 128;
        final long currentTimeMillis = System.currentTimeMillis();
        long n2;
        if (n % 2 != 0) {
            n2 = this.afInfoLog().valueOf("af_send_exc_to_server_window", -1L);
            if (aFa1ySDK.valueOf < (currentTimeMillis | 0x3E8L)) {
                return false;
            }
        }
        else {
            n2 = this.afInfoLog().valueOf("af_send_exc_to_server_window", -1L);
            if (aFa1ySDK.valueOf < currentTimeMillis / 1000L) {
                return false;
            }
        }
        if (n2 != -1L) {
            final int n3 = AFc1sSDK.afWarnLog + 119;
            AFc1sSDK.AFVersionDeclaration = n3 % 128;
            if (n3 % 2 != 0) {
                if (n2 < currentTimeMillis) {
                    return false;
                }
            }
            else if (n2 < currentTimeMillis) {
                return false;
            }
            final String afInAppEventType = aFa1ySDK.AFInAppEventType;
            Intrinsics.checkNotNullExpressionValue(afInAppEventType, "");
            if (AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(afInAppEventType) == AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(this.AFLogger())) {
                return true;
            }
        }
        return false;
    }
    
    private static Map<String, Object> values(final Map<String, ?> map, final List<AFc1zSDK> list) {
        final int n = AFc1sSDK.afWarnLog + 27;
        AFc1sSDK.AFVersionDeclaration = n % 128;
        Map map2;
        if (n % 2 != 0) {
            final m[] array = { null, q.a("deviceInfo", map), null, null, null };
            array[1] = q.a("excs", AFc1uSDK.AFa1wSDK.values(list));
            map2 = C.f(array);
        }
        else {
            map2 = C.f(q.a("deviceInfo", map), q.a("excs", AFc1uSDK.AFa1wSDK.values(list)));
        }
        AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 47) % 128;
        return (Map<String, Object>)map2;
    }
    
    private static final void values(final AFc1sSDK aFc1sSDK) {
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 79) % 128;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        aFc1sSDK.getLevel();
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 109) % 128;
    }
    
    @Override
    public final void AFInAppEventType() {
        final int n = AFc1sSDK.AFVersionDeclaration + 85;
        AFc1sSDK.afWarnLog = n % 128;
        if (n % 2 != 0) {
            this.afErrorLog().execute(new o(this));
            return;
        }
        this.afErrorLog().execute(new o(this));
        throw null;
    }
    
    @NotNull
    public final AFc1vSDK AFKeystoreWrapper() {
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 13) % 128;
        final AFc1vSDK aFc1vSDK = (AFc1vSDK)this.afErrorLog.getValue();
        final int n = AFc1sSDK.AFVersionDeclaration + 87;
        AFc1sSDK.afWarnLog = n % 128;
        if (n % 2 != 0) {
            return aFc1vSDK;
        }
        throw null;
    }
    
    @Override
    public final void AFKeystoreWrapper(@NotNull final Throwable t, @NotNull final String s) {
        final int n = AFc1sSDK.afWarnLog + 1;
        AFc1sSDK.AFVersionDeclaration = n % 128;
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(s, "");
        if (n % 2 == 0) {
            this.afErrorLog().execute(new com.appsflyer.internal.q(this, t, s));
            AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 81) % 128;
            return;
        }
        this.afErrorLog().execute(new com.appsflyer.internal.q(this, t, s));
        throw null;
    }
    
    @Override
    public final void valueOf() {
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 17) % 128;
        this.afErrorLog().execute(new p(this));
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 27) % 128;
    }
    
    @Override
    public final void values() {
        AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 87) % 128;
        this.afErrorLog().execute(new r(this));
        AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 79) % 128;
    }
}
