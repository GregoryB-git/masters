/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.ViewConfiguration
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ExecutorService
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import V5.h;
import V5.i;
import V5.m;
import W5.C;
import android.content.Context;
import android.os.Build;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFa1fSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1fSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1wSDK;
import com.appsflyer.internal.AFb1xSDK;
import com.appsflyer.internal.AFb1ySDK;
import com.appsflyer.internal.AFb1zSDK;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1vSDK;
import com.appsflyer.internal.AFc1wSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFc1zSDK;
import com.appsflyer.internal.AFd1aSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.AFg1rSDK;
import com.appsflyer.internal.o;
import com.appsflyer.internal.p;
import com.appsflyer.internal.q;
import com.appsflyer.internal.r;
import g6.a;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.text.b;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
public final class AFc1sSDK
implements AFc1wSDK {
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

    public AFc1sSDK(@NotNull AFc1xSDK aFc1xSDK) {
        Intrinsics.checkNotNullParameter(aFc1xSDK, "");
        this.values = aFc1xSDK;
        this.AFInAppEventType = i.a(new a(this){
            private /* synthetic */ AFc1sSDK AFInAppEventType;
            {
                this.AFInAppEventType = aFc1sSDK;
                super(0);
            }

            @Override
            public final /* synthetic */ Object invoke() {
                AFb1wSDK aFb1wSDK = AFc1sSDK.AFInAppEventType(this.AFInAppEventType).afRDLog();
                Intrinsics.checkNotNullExpressionValue(aFb1wSDK, "");
                return aFb1wSDK;
            }
        });
        this.AFInAppEventParameterName = i.a(new a(this){
            private /* synthetic */ AFc1sSDK values;
            {
                this.values = aFc1sSDK;
                super(0);
            }

            @Override
            public final /* synthetic */ Object invoke() {
                AFb1gSDK aFb1gSDK = AFc1sSDK.AFInAppEventType(this.values).AFInAppEventParameterName();
                Intrinsics.checkNotNullExpressionValue(aFb1gSDK, "");
                return aFb1gSDK;
            }
        });
        this.AFKeystoreWrapper = i.a(new a(this){
            private /* synthetic */ AFc1sSDK values;
            {
                this.values = aFc1sSDK;
                super(0);
            }

            @Override
            public final /* synthetic */ Object invoke() {
                AFb1dSDK aFb1dSDK = AFc1sSDK.AFInAppEventType(this.values).values();
                Intrinsics.checkNotNullExpressionValue(aFb1dSDK, "");
                return aFb1dSDK;
            }
        });
        this.valueOf = i.a(new a(this){
            private /* synthetic */ AFc1sSDK AFInAppEventType;
            {
                this.AFInAppEventType = aFc1sSDK;
                super(0);
            }

            @Override
            public final /* synthetic */ Object invoke() {
                AFe1wSDK aFe1wSDK = AFc1sSDK.AFInAppEventType(this.AFInAppEventType).afWarnLog();
                Intrinsics.checkNotNullExpressionValue(aFe1wSDK, "");
                return aFe1wSDK;
            }
        });
        this.afDebugLog = i.a(new a(this){
            private /* synthetic */ AFc1sSDK values;
            {
                this.values = aFc1sSDK;
                super(0);
            }

            @Override
            public final /* synthetic */ Object invoke() {
                ExecutorService executorService = AFc1sSDK.AFInAppEventType(this.values).AFInAppEventType();
                Intrinsics.checkNotNullExpressionValue((Object)executorService, "");
                return executorService;
            }
        });
        this.afInfoLog = "6.12.2";
        this.afErrorLog = i.a(new a(this){
            private /* synthetic */ AFc1sSDK AFKeystoreWrapper;
            {
                this.AFKeystoreWrapper = aFc1sSDK;
                super(0);
            }

            @Override
            public final /* synthetic */ Object invoke() {
                AFb1bSDK aFb1bSDK = AFc1sSDK.AFInAppEventType(this.AFKeystoreWrapper).init();
                Intrinsics.checkNotNullExpressionValue(aFb1bSDK, "");
                return new AFa1fSDK(aFb1bSDK);
            }
        });
        this.AFLogger = i.a(new a(this){
            private /* synthetic */ AFc1sSDK AFKeystoreWrapper;
            {
                this.AFKeystoreWrapper = aFc1sSDK;
                super(0);
            }

            @Override
            public final /* synthetic */ Object invoke() {
                return new CreateOneLinkHttpTask(this.AFKeystoreWrapper.AFKeystoreWrapper());
            }
        });
    }

    private final AFb1wSDK AFInAppEventParameterName() {
        AFVersionDeclaration = (afWarnLog + 75) % 128;
        AFb1wSDK aFb1wSDK = (AFb1wSDK)this.AFInAppEventType.getValue();
        AFVersionDeclaration = (afWarnLog + 109) % 128;
        return aFb1wSDK;
    }

    private final Map<String, String> AFInAppEventParameterName(AFb1fSDK.AFa1ySDK aFa1ySDK) {
        int n8 = ViewConfiguration.getMaximumDrawingCacheSize();
        Object object = new Object[1];
        AFc1sSDK.AFInAppEventType("\u13e5\u2096\udf26\uef34\u1387\ub1eb\ufd59\u5c77\u57bd", 1 - (n8 >> 24), (Object[])object);
        object = V5.q.a(((String)object[0]).intern(), Build.BRAND);
        m m8 = V5.q.a("model", Build.MODEL);
        m m9 = V5.q.a("app_id", this.afRDLog().valueOf.AFInAppEventType.getPackageName());
        m m10 = V5.q.a("p_ex", new AFb1xSDK().AFInAppEventParameterName());
        m m11 = V5.q.a("api", String.valueOf((int)Build.VERSION.SDK_INT));
        m m12 = V5.q.a("sdk", this.AFLogger());
        AFb1gSDK aFb1gSDK = this.afRDLog();
        aFa1ySDK = C.f(new m[]{object, m8, m9, m10, m11, m12, V5.q.a("uid", AFb1zSDK.valueOf(aFb1gSDK.valueOf, aFb1gSDK.AFInAppEventType)), V5.q.a("exc_config", aFa1ySDK.AFInAppEventType())});
        AFVersionDeclaration = (afWarnLog + 1) % 128;
        return aFa1ySDK;
    }

    private static final void AFInAppEventParameterName(AFc1sSDK aFc1sSDK) {
        AFVersionDeclaration = (afWarnLog + 77) % 128;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        aFc1sSDK.AFLogger$LogLevel();
        AFVersionDeclaration = (afWarnLog + 61) % 128;
    }

    private static final void AFInAppEventParameterName(AFc1sSDK aFc1sSDK, Throwable throwable, String string2) {
        block5 : {
            AFb1fSDK.AFa1ySDK aFa1ySDK;
            block6 : {
                block4 : {
                    int n8 = afWarnLog + 93;
                    AFVersionDeclaration = n8 % 128;
                    Intrinsics.checkNotNullParameter(aFc1sSDK, "");
                    Intrinsics.checkNotNullParameter((Object)throwable, "");
                    Intrinsics.checkNotNullParameter(string2, "");
                    if (n8 % 2 == 0) break block4;
                    aFa1ySDK = aFc1sSDK.afWarnLog();
                    n8 = 21 / 0;
                    if (aFa1ySDK == null) break block5;
                    break block6;
                }
                aFa1ySDK = aFc1sSDK.afWarnLog();
                if (aFa1ySDK == null) break block5;
            }
            if (aFc1sSDK.valueOf(aFa1ySDK)) {
                aFc1sSDK.AFKeystoreWrapper().values(throwable, string2);
                return;
            }
            AFVersionDeclaration = (afWarnLog + 53) % 128;
        }
    }

    public static final /* synthetic */ AFc1xSDK AFInAppEventType(AFc1sSDK object) {
        int n8;
        int n9 = AFVersionDeclaration + 99;
        afWarnLog = n8 = n9 % 128;
        object = object.values;
        if (n9 % 2 != 0) {
            n9 = n8 + 21;
            AFVersionDeclaration = n9 % 128;
            if (n9 % 2 == 0) {
                return object;
            }
            throw null;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static void AFInAppEventType(String object, int n8, Object[] arrobject) {
        Object object2 = object;
        if (object != null) {
            object2 = object.toCharArray();
        }
        object2 = (char[])object2;
        object = AFg1rSDK.AFInAppEventParameterName;
        // MONITORENTER : object
        object2 = AFg1rSDK.AFInAppEventType(afRDLog, (char[])object2, n8);
        AFg1rSDK.AFInAppEventType = 4;
        while ((n8 = AFg1rSDK.AFInAppEventType) < object2.length) {
            AFg1rSDK.AFKeystoreWrapper = n8 - 4;
            n8 = AFg1rSDK.AFInAppEventType++;
            object2[n8] = (char)((long)(object2[n8] ^ object2[n8 % 4]) ^ (long)AFg1rSDK.AFKeystoreWrapper * afRDLog);
        }
        object2 = new String((char[])object2, 4, object2.length - 4);
        // MONITOREXIT : object
        arrobject[0] = object2;
    }

    private final boolean AFInAppEventType(AFb1fSDK.AFa1ySDK object) {
        afWarnLog = (AFVersionDeclaration + 43) % 128;
        long l8 = System.currentTimeMillis();
        long l9 = this.afInfoLog().valueOf("af_send_exc_to_server_window", -1L);
        if (object.valueOf < l8 / 1000L) {
            afWarnLog = (AFVersionDeclaration + 95) % 128;
            return false;
        }
        if (l9 != -1L) {
            int n8 = afWarnLog + 101;
            AFVersionDeclaration = n8 % 128;
            if (n8 % 2 == 0) {
                if (l9 < l8) {
                    return false;
                }
                n8 = this.afInfoLog().values("af_send_exc_min", -1);
                if (n8 != -1) {
                    int n9 = AFVersionDeclaration + 117;
                    afWarnLog = n9 % 128;
                    if (n9 % 2 != 0) {
                        if (this.AFKeystoreWrapper().AFInAppEventType() < n8) {
                            return false;
                        }
                        object = object.AFInAppEventType;
                        Intrinsics.checkNotNullExpressionValue(object, "");
                        if (AFc1uSDK.AFa1wSDK.AFKeystoreWrapper((String)object) == AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(this.AFLogger())) {
                            afWarnLog = (AFVersionDeclaration + 65) % 128;
                            return true;
                        }
                        return false;
                    }
                    this.AFKeystoreWrapper().AFInAppEventType();
                    throw null;
                }
                return false;
            }
            throw null;
        }
        return false;
    }

    private static final void AFKeystoreWrapper(AFc1sSDK aFc1sSDK) {
        afWarnLog = (AFVersionDeclaration + 37) % 128;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        aFc1sSDK.AFVersionDeclaration();
        afWarnLog = (AFVersionDeclaration + 91) % 128;
    }

    private final void AFKeystoreWrapper(String string2, String string3) {
        afWarnLog = (AFVersionDeclaration + 121) % 128;
        byte[] arrby = string2.getBytes(b.b);
        Intrinsics.checkNotNullExpressionValue(arrby, "");
        string2 = C.b(V5.q.a("Authorization", AFc1nSDK.valueOf(string2, string3)));
        this.afErrorLogForExcManagerOnly().valueOf(arrby, (Map<String, String>)string2, 2000);
        int n8 = afWarnLog + 3;
        AFVersionDeclaration = n8 % 128;
        if (n8 % 2 == 0) {
            return;
        }
        throw null;
    }

    @NotNull
    private String AFLogger() {
        int n8;
        afWarnLog = n8 = (AFVersionDeclaration + 99) % 128;
        String string2 = this.afInfoLog;
        AFVersionDeclaration = (n8 + 25) % 128;
        return string2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final void AFLogger$LogLevel() {
        block13 : {
            // MONITORENTER : this
            var6_1 = this.afWarnLog();
            if (var6_1 != null) {
                AFc1sSDK.afWarnLog = (AFc1sSDK.AFVersionDeclaration + 91) % 128;
                var2_5 = var6_1.valueOf;
            } else {
                var2_5 = -1L;
            }
            var4_6 = System.currentTimeMillis() / 1000L;
            try {
                var6_1 = this.afWarnLog();
                var6_1 = var6_1 != null ? var6_1.AFInAppEventType : null;
                var7_7 = var6_1;
                ** if (var6_1 != null) goto lbl-1000
            }
            catch (NullPointerException var6_2) {}
lbl-1000: // 1 sources:
            {
                AFc1sSDK.AFVersionDeclaration = (AFc1sSDK.afWarnLog + 89) % 128;
                var7_7 = "";
            }
lbl-1000: // 2 sources:
            {
                break block13;
            }
            var7_7 = "NOT_DETECTED";
        }
        if (var2_5 >= var4_6) ** GOTO lbl38
        Intrinsics.checkNotNullParameter("TTL is already passed", "");
        AFLogger.afRDLog("[Exception Manager]: ".concat("TTL is already passed"));
        this.afInfoLog().AFInAppEventType("af_send_exc_to_server_window");
        this.AFKeystoreWrapper().values();
        var1_8 = AFc1sSDK.afWarnLog + 69;
        AFc1sSDK.AFVersionDeclaration = var1_8 % 128;
        {
            catch (Throwable var6_4) {
                throw var6_4;
            }
        }
        if (var1_8 % 2 == 0) {
            // MONITOREXIT : this
            return;
        }
        try {
            throw null;
        }
        catch (Throwable var6_3) {
            throw var6_3;
lbl38: // 1 sources:
            if (AFc1uSDK.AFa1wSDK.AFKeystoreWrapper((String)var7_7) != -1 && AFc1uSDK.AFa1wSDK.AFKeystoreWrapper((String)var7_7) <= AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(this.AFLogger())) {
                this.AFKeystoreWrapper().AFInAppEventParameterName(new String[]{this.AFLogger()});
                // MONITOREXIT : this
                return;
            }
            this.afInfoLog().AFInAppEventType("af_send_exc_to_server_window");
            this.AFKeystoreWrapper().values();
            // MONITOREXIT : this
            return;
        }
    }

    /*
     * Exception decompiling
     */
    private final void AFVersionDeclaration() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:397)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:475)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* synthetic */ void a(AFc1sSDK aFc1sSDK) {
        AFc1sSDK.AFInAppEventParameterName(aFc1sSDK);
    }

    private final AFe1wSDK afDebugLog() {
        int n8 = AFVersionDeclaration + 71;
        afWarnLog = n8 % 128;
        if (n8 % 2 != 0) {
            AFe1wSDK aFe1wSDK = (AFe1wSDK)this.valueOf.getValue();
            n8 = AFVersionDeclaration + 77;
            afWarnLog = n8 % 128;
            if (n8 % 2 != 0) {
                return aFe1wSDK;
            }
            throw null;
        }
        AFe1wSDK aFe1wSDK = (AFe1wSDK)this.valueOf.getValue();
        throw null;
    }

    private final ExecutorService afErrorLog() {
        afWarnLog = (AFVersionDeclaration + 95) % 128;
        ExecutorService executorService = (ExecutorService)this.afDebugLog.getValue();
        int n8 = AFVersionDeclaration + 43;
        afWarnLog = n8 % 128;
        if (n8 % 2 == 0) {
            n8 = 86 / 0;
        }
        return executorService;
    }

    @NotNull
    private AFc1uSDK afErrorLogForExcManagerOnly() {
        AFVersionDeclaration = (afWarnLog + 23) % 128;
        AFc1uSDK aFc1uSDK = (AFc1uSDK)this.AFLogger.getValue();
        afWarnLog = (AFVersionDeclaration + 93) % 128;
        return aFc1uSDK;
    }

    private final AFb1dSDK afInfoLog() {
        int n8 = AFVersionDeclaration + 3;
        afWarnLog = n8 % 128;
        if (n8 % 2 != 0) {
            return (AFb1dSDK)this.AFKeystoreWrapper.getValue();
        }
        AFb1dSDK aFb1dSDK = (AFb1dSDK)this.AFKeystoreWrapper.getValue();
        throw null;
    }

    private final AFb1gSDK afRDLog() {
        int n8 = afWarnLog + 125;
        AFVersionDeclaration = n8 % 128;
        if (n8 % 2 == 0) {
            return (AFb1gSDK)this.AFInAppEventParameterName.getValue();
        }
        AFb1gSDK aFb1gSDK = (AFb1gSDK)this.AFInAppEventParameterName.getValue();
        throw null;
    }

    private final AFb1fSDK.AFa1ySDK afWarnLog() {
        Object object = this.AFInAppEventParameterName().AFInAppEventType.AFInAppEventParameterName;
        if (object != null && (object = object.AFInAppEventParameterName) != null) {
            AFVersionDeclaration = (afWarnLog + 9) % 128;
            return object.values;
        }
        int n8 = AFVersionDeclaration + 115;
        afWarnLog = n8 % 128;
        if (n8 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void b(AFc1sSDK aFc1sSDK) {
        AFc1sSDK.values(aFc1sSDK);
    }

    public static /* synthetic */ void c(AFc1sSDK aFc1sSDK, Throwable throwable, String string2) {
        AFc1sSDK.AFInAppEventParameterName(aFc1sSDK, throwable, string2);
    }

    public static /* synthetic */ void d(AFc1sSDK aFc1sSDK) {
        AFc1sSDK.AFKeystoreWrapper(aFc1sSDK);
    }

    private final void getLevel() {
        Object object = this.afWarnLog();
        if (object != null) {
            AFVersionDeclaration = (afWarnLog + 125) % 128;
            if (!(this.AFInAppEventType((AFb1fSDK.AFa1ySDK)object) ^ true)) {
                String string2 = this.afDebugLog().AFInAppEventParameterName;
                if (string2 != null) {
                    object = new JSONObject(AFc1sSDK.values(this.AFInAppEventParameterName((AFb1fSDK.AFa1ySDK)object), this.AFKeystoreWrapper().AFKeystoreWrapper())).toString();
                    Intrinsics.checkNotNullExpressionValue(object, "");
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    this.AFKeystoreWrapper((String)object, string2);
                }
                return;
            }
            Intrinsics.checkNotNullParameter("skipping", "");
            AFLogger.afRDLog("[Exception Manager]: ".concat("skipping"));
            return;
        }
        int n8 = AFVersionDeclaration + 3;
        afWarnLog = n8 % 128;
        if (n8 % 2 == 0) {
            n8 = 11 / 0;
        }
    }

    private final boolean valueOf(AFb1fSDK.AFa1ySDK object) {
        block10 : {
            int n8;
            long l8;
            long l9;
            block11 : {
                block9 : {
                    n8 = afWarnLog + 17;
                    AFVersionDeclaration = n8 % 128;
                    l8 = System.currentTimeMillis();
                    if (n8 % 2 == 0) break block9;
                    l9 = this.afInfoLog().valueOf("af_send_exc_to_server_window", -1L);
                    if (object.valueOf < (l8 | 1000L)) break block10;
                    break block11;
                }
                l9 = this.afInfoLog().valueOf("af_send_exc_to_server_window", -1L);
                if (object.valueOf < l8 / 1000L) break block10;
            }
            if (l9 != -1L) {
                n8 = afWarnLog + 119;
                AFVersionDeclaration = n8 % 128;
                if (n8 % 2 != 0) {
                    n8 = 20 / 0;
                    if (l9 < l8) {
                        return false;
                    }
                } else if (l9 < l8) {
                    return false;
                }
                object = object.AFInAppEventType;
                Intrinsics.checkNotNullExpressionValue(object, "");
                if (AFc1uSDK.AFa1wSDK.AFKeystoreWrapper((String)object) == AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(this.AFLogger())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Map<String, Object> values(Map<String, ? extends Object> map, List<AFc1zSDK> list) {
        int n8 = afWarnLog + 27;
        AFVersionDeclaration = n8 % 128;
        if (n8 % 2 != 0) {
            m[] arrm = new m[5];
            arrm[1] = V5.q.a("deviceInfo", map);
            arrm[1] = V5.q.a("excs", (Object)AFc1uSDK.AFa1wSDK.values(list));
            map = C.f(arrm);
        } else {
            map = C.f(V5.q.a("deviceInfo", map), V5.q.a("excs", (Object)AFc1uSDK.AFa1wSDK.values(list)));
        }
        afWarnLog = (AFVersionDeclaration + 47) % 128;
        return map;
    }

    private static final void values(AFc1sSDK aFc1sSDK) {
        AFVersionDeclaration = (afWarnLog + 79) % 128;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        aFc1sSDK.getLevel();
        AFVersionDeclaration = (afWarnLog + 109) % 128;
    }

    @Override
    public final void AFInAppEventType() {
        int n8 = AFVersionDeclaration + 85;
        afWarnLog = n8 % 128;
        if (n8 % 2 != 0) {
            this.afErrorLog().execute((Runnable)new o(this));
            return;
        }
        this.afErrorLog().execute((Runnable)new o(this));
        throw null;
    }

    @NotNull
    public final AFc1vSDK AFKeystoreWrapper() {
        AFVersionDeclaration = (afWarnLog + 13) % 128;
        AFc1vSDK aFc1vSDK = (AFc1vSDK)this.afErrorLog.getValue();
        int n8 = AFVersionDeclaration + 87;
        afWarnLog = n8 % 128;
        if (n8 % 2 != 0) {
            return aFc1vSDK;
        }
        throw null;
    }

    @Override
    public final void AFKeystoreWrapper(@NotNull Throwable throwable, @NotNull String string2) {
        int n8 = afWarnLog + 1;
        AFVersionDeclaration = n8 % 128;
        Intrinsics.checkNotNullParameter((Object)throwable, "");
        Intrinsics.checkNotNullParameter(string2, "");
        if (n8 % 2 == 0) {
            this.afErrorLog().execute((Runnable)new q(this, throwable, string2));
            afWarnLog = (AFVersionDeclaration + 81) % 128;
            return;
        }
        this.afErrorLog().execute((Runnable)new q(this, throwable, string2));
        throw null;
    }

    @Override
    public final void valueOf() {
        AFVersionDeclaration = (afWarnLog + 17) % 128;
        this.afErrorLog().execute((Runnable)new p(this));
        AFVersionDeclaration = (afWarnLog + 27) % 128;
    }

    @Override
    public final void values() {
        afWarnLog = (AFVersionDeclaration + 87) % 128;
        this.afErrorLog().execute((Runnable)new r(this));
        AFVersionDeclaration = (afWarnLog + 79) % 128;
    }

}

