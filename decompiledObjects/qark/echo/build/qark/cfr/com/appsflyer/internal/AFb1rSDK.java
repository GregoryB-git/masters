/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.concurrent.Executor
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFa1rSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1iSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1wSDK;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class AFb1rSDK
implements AFb1tSDK {
    private static char[] afDebugLog = new char[]{'?', '\u0084', '\u0082', '\u0084', '\u0085'};
    private static int afErrorLog = 1;
    private static int afInfoLog;
    private List<String> AFInAppEventParameterName = new ArrayList();
    @NonNull
    private final Map<String, Object> AFInAppEventType = new HashMap();
    private boolean AFKeystoreWrapper = false;
    private String AFLogger = "-1";
    private boolean afRDLog = true ^ AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
    private boolean valueOf = true;
    private int values = 0;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void AFInAppEventType(String var1_1, String var2_4, String var3_5, String var4_6) {
        block11 : {
            // MONITORENTER : this
            this.AFInAppEventType.put((Object)"sdk_version", (Object)var1_1);
            if (var2_4 == null) ** GOTO lbl12
            AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 19) % 128;
            if (var2_4.length() > 0) {
                this.AFInAppEventType.put((Object)"devkey", (Object)var2_4);
            }
lbl12: // 4 sources:
            if (var3_5 != null && var3_5.length() > 0) {
                this.AFInAppEventType.put((Object)"originalAppsFlyerId", (Object)var3_5);
            }
            if (var4_6 == null) break block11;
            var5_7 = AFb1rSDK.afInfoLog + 109;
            AFb1rSDK.afErrorLog = var5_7 % 128;
            if (var5_7 % 2 == 0) throw null;
            try {
                if (var4_6.length() <= 0) break block11;
                this.AFInAppEventType.put((Object)"uid", (Object)var4_6);
            }
            catch (Throwable var1_3) {
                return;
            }
        }
        AFb1rSDK.afInfoLog = (AFb1rSDK.afErrorLog + 79) % 128;
        // MONITOREXIT : this
    }

    private boolean afDebugLog() {
        block2 : {
            int n8;
            block3 : {
                block4 : {
                    if (!this.afRDLog) break block2;
                    afInfoLog = n8 = (afErrorLog + 29) % 128;
                    if (this.valueOf) break block3;
                    afErrorLog = (n8 += 13) % 128;
                    if (n8 % 2 != 0) break block4;
                    boolean bl = this.AFKeystoreWrapper;
                    n8 = 96 / 0;
                    if (!bl) break block2;
                    break block3;
                }
                if (!this.AFKeystoreWrapper) {
                    return false;
                }
            }
            n8 = afErrorLog + 83;
            afInfoLog = n8 % 128;
            if (n8 % 2 != 0) {
                n8 = 51 / 0;
            }
            return true;
        }
        return false;
    }

    private void afErrorLog() {
        synchronized (this) {
            this.AFInAppEventParameterName = new ArrayList();
            this.values = 0;
            afErrorLog = (afInfoLog + 95) % 128;
            return;
        }
    }

    @NonNull
    private Map<String, Object> afRDLog() {
        synchronized (this) {
            afErrorLog = (afInfoLog + 49) % 128;
            this.AFInAppEventType.put((Object)"data", this.AFInAppEventParameterName);
            this.afErrorLog();
            Map<String, Object> map = this.AFInAppEventType;
            afInfoLog = (afErrorLog + 15) % 128;
            return map;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void valueOf(String var1_1, PackageManager var2_6, AFe1wSDK var3_7) {
        // MONITORENTER : this
        var4_8 = AFb1rSDK.afErrorLog + 85;
        AFb1rSDK.afInfoLog = var4_8 % 128;
        {
            catch (Throwable var1_3) {
                throw var1_3;
            }
        }
        if (var4_8 % 2 == 0) ** GOTO lbl20
        var5_9 = AppsFlyerProperties.getInstance();
        var6_10 = var5_9.getString("remote_debug_static_data");
        this.AFInAppEventType.clear();
        try {
            var4_8 = 94 / 0;
            if (var6_10 == null) ** GOTO lbl28
            var1_1 = var6_10;
            ** GOTO lbl26
        }
        catch (Throwable var1_2) {
            block14 : {
                block13 : {
                    throw var1_2;
lbl20: // 1 sources:
                    var5_9 = AppsFlyerProperties.getInstance();
                    var6_10 = var5_9.getString("remote_debug_static_data");
                    this.AFInAppEventType.clear();
                    if (var6_10 == null) break block13;
                    var1_1 = var6_10;
lbl26: // 3 sources:
                    this.AFInAppEventType.putAll(AFa1rSDK.valueOf(new JSONObject((String)var1_1)));
                }
                var6_10 = AFa1eSDK.valueOf();
                this.values(var5_9.getString("advertiserId"), var3_7.values, var6_10.AFLogger);
                var3_7 = new StringBuilder("6.12.2.");
                var3_7.append(AFa1eSDK.values);
                this.AFInAppEventType(var3_7.toString(), var6_10.AFInAppEventType().afWarnLog().AFInAppEventParameterName, var5_9.getString("KSAppsFlyerId"), var5_9.getString("uid"));
                try {
                    this.values((String)var1_1, String.valueOf((int)var2_6.getPackageInfo((String)var1_1, (int)0).versionCode), var5_9.getString("channel"), var5_9.getString("preInstallName"));
                    break block14;
                }
                catch (Throwable var1_5) {}
                catch (Throwable var1_4) {}
                ** GOTO lbl45
            }
            var5_9.set("remote_debug_static_data", new JSONObject(this.AFInAppEventType).toString());
            AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 23) % 128;
lbl45: // 3 sources:
            this.AFInAppEventType.put((Object)"launch_counter", (Object)this.AFLogger);
            // MONITOREXIT : this
            return;
        }
    }

    private static String[] valueOf(String string2, StackTraceElement[] arrstackTraceElement) {
        if (arrstackTraceElement == null) {
            int n8 = afInfoLog + 89;
            afErrorLog = n8 % 128;
            if (n8 % 2 == 0) {
                arrstackTraceElement = new String[]{};
                arrstackTraceElement[0] = string2;
                return arrstackTraceElement;
            }
            return new String[]{string2};
        }
        int n9 = arrstackTraceElement.length;
        int n10 = 1;
        String[] arrstring = new String[n9 + 1];
        arrstring[0] = string2;
        while (n10 < arrstackTraceElement.length) {
            n9 = afInfoLog + 5;
            afErrorLog = n9 % 128;
            if (n9 % 2 == 0) {
                arrstring[n10] = arrstackTraceElement[n10].toString();
                n10 += 85;
                continue;
            }
            arrstring[n10] = arrstackTraceElement[n10].toString();
            ++n10;
        }
        afErrorLog = (afInfoLog + 93) % 128;
        return arrstring;
    }

    private Map<String, Object> values(String string2, PackageManager packageManager, AFc1xSDK aFc1xSDK) {
        int n8 = afInfoLog + 29;
        afErrorLog = n8 % 128;
        this.valueOf(string2, packageManager, aFc1xSDK.afWarnLog());
        if (n8 % 2 != 0) {
            return this.afRDLog();
        }
        this.afRDLog();
        throw null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void values(String string2, String string3, String string4) {
        int n8;
        block18 : {
            block17 : {
                // MONITORENTER : this
                Map<String, Object> map = this.AFInAppEventType;
                Object[] arrobject = new Object[1];
                AFb1rSDK.values("\u0001\u0000\u0001\u0001\u0000", true, new int[]{0, 5, 27, 0}, arrobject);
                map.put((Object)((String)arrobject[0]).intern(), (Object)Build.BRAND);
                this.AFInAppEventType.put((Object)"model", (Object)Build.MODEL);
                this.AFInAppEventType.put((Object)"platform", (Object)"Android");
                this.AFInAppEventType.put((Object)"platform_version", (Object)Build.VERSION.RELEASE);
                if (string2 != null && string2.length() > 0) {
                    this.AFInAppEventType.put((Object)"advertiserId", (Object)string2);
                }
                if (string3 == null) break block17;
                afErrorLog = (afInfoLog + 85) % 128;
                {
                    catch (Throwable throwable22) {
                        throw throwable22;
                    }
                }
                if (string3.length() <= 0) break block17;
                this.AFInAppEventType.put((Object)"imei", (Object)string3);
            }
            if (string4 != null) {
                afInfoLog = (afErrorLog + 7) % 128;
                n8 = string4.length();
                if (n8 <= 0) break block18;
                afErrorLog = (afInfoLog + 9) % 128;
                this.AFInAppEventType.put((Object)"android_id", (Object)string4);
            }
        }
        n8 = afInfoLog + 17;
        afErrorLog = n8 % 128;
        if (n8 % 2 != 0) return;
        {
            n8 = 42 / 0;
            // MONITOREXIT : this
            return;
        }
        catch (Throwable throwable3) {
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void values(String var1_1, String var2_4, String var3_5, String var4_6) {
        block14 : {
            block13 : {
                // MONITORENTER : this
                if (var1_1 != null) {
                    if (var1_1.length() <= 0) break block13;
                    this.AFInAppEventType.put((Object)"app_id", (Object)var1_1);
                    AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 81) % 128;
                }
            }
            if (var2_4 == null) ** GOTO lbl19
            var5_7 = var2_4.length();
            if (var5_7 <= 0) ** GOTO lbl19
            AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 125) % 128;
            this.AFInAppEventType.put((Object)"app_version", (Object)var2_4);
lbl19: // 3 sources:
            if (var3_5 != null && var3_5.length() > 0) {
                this.AFInAppEventType.put((Object)"channel", (Object)var3_5);
            }
            if (var4_6 == null) break block14;
            AFb1rSDK.afInfoLog = (AFb1rSDK.afErrorLog + 95) % 128;
            try {
                if (var4_6.length() <= 0) break block14;
                this.AFInAppEventType.put((Object)"preInstall", (Object)var4_6);
            }
            catch (Throwable var1_3) {
                return;
            }
        }
        AFb1rSDK.afErrorLog = (AFb1rSDK.afInfoLog + 99) % 128;
        // MONITOREXIT : this
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private /* varargs */ void values(String var1_1, String var2_5, String ... var3_6) {
        // MONITORENTER : this
        if (!this.afDebugLog()) ** GOTO lbl58
        var4_7 = AFb1rSDK.afErrorLog + 75;
        AFb1rSDK.afInfoLog = var4_7 % 128;
        if (var4_7 % 2 == 0) ** GOTO lbl17
        var4_7 = this.values;
        try {
            var5_8 = 96 / 0;
            if (var4_7 >= 98304) {
                return;
            }
            ** GOTO lbl20
        }
        catch (Throwable var1_2) {
            block14 : {
                block13 : {
                    throw var1_2;
lbl17: // 1 sources:
                    var4_7 = this.values;
                    if (var4_7 < 98304) break block13;
                    return;
                }
                try {
                    var6_9 = System.currentTimeMillis();
                    var3_6 = TextUtils.join((CharSequence)", ", (Object[])var3_6);
                    if (var1_1 != null) {
                        var8_10 = new StringBuilder();
                        var8_10.append(var6_9);
                        var8_10.append(" ");
                        var8_10.append(Thread.currentThread().getId());
                        var8_10.append(" _/AppsFlyer_6.12.2 [");
                        var8_10.append(var1_1);
                        var8_10.append("] ");
                        var8_10.append(var2_5);
                        var8_10.append(" ");
                        var8_10.append((String)var3_6);
                        var1_1 = var8_10.toString();
                        break block14;
                    }
                    var1_1 = new StringBuilder();
                    var1_1.append(var6_9);
                    var1_1.append(" ");
                    var1_1.append(Thread.currentThread().getId());
                    var1_1.append(" ");
                    var1_1.append(var2_5);
                    var1_1.append("/AppsFlyer_6.12.2 ");
                    var1_1.append((String)var3_6);
                    var1_1 = var1_1.toString();
                }
                catch (Throwable var1_4) {
                    return;
                }
                AFb1rSDK.afInfoLog = (AFb1rSDK.afErrorLog + 103) % 128;
            }
            this.AFInAppEventParameterName.add((Object)var1_1);
            this.values += var1_1.length() << 1;
            // MONITOREXIT : this
            return;
lbl58: // 1 sources:
            // MONITOREXIT : this
            return;
        }
    }

    /*
     * Exception decompiling
     */
    private static void values(String var0, boolean var1_2, int[] var2_3, Object[] var3_4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[WHILELOOP]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
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

    @Override
    public final void AFInAppEventParameterName() {
        int n8;
        int n9 = afErrorLog + 15;
        afInfoLog = n8 = n9 % 128;
        this.afRDLog = n9 % 2 != 0;
        n9 = n8 + 101;
        afErrorLog = n9 % 128;
        if (n9 % 2 == 0) {
            n9 = 20 / 0;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void AFInAppEventParameterName(String var1_1) {
        // MONITORENTER : this
        var2_4 = AFb1rSDK.afErrorLog;
        {
            catch (Throwable var1_2) {
                throw var1_2;
            }
        }
        var3_5 = var2_4 + 87;
        AFb1rSDK.afInfoLog = var3_5 % 128;
        if (var3_5 % 2 != 0) ** GOTO lbl15
        this.AFLogger = var1_1;
        AFb1rSDK.afInfoLog = (var2_4 + 1) % 128;
        // MONITOREXIT : this
        return;
lbl15: // 1 sources:
        this.AFLogger = var1_1;
        throw null;
    }

    @Override
    public final void AFInAppEventParameterName(String string2, int n8, String string3) {
        afErrorLog = (afInfoLog + 85) % 128;
        this.values("server_response", string2, new String[]{String.valueOf((int)n8), string3});
        n8 = afErrorLog + 63;
        afInfoLog = n8 % 128;
        if (n8 % 2 != 0) {
            n8 = 52 / 0;
        }
    }

    @Override
    public final void AFInAppEventParameterName(String string2, String string3) {
        int n8 = afErrorLog + 69;
        afInfoLog = n8 % 128;
        if (n8 % 2 != 0) {
            String[] arrstring = new String[]{};
            arrstring[0] = string3;
            this.values(null, string2, arrstring);
            return;
        }
        this.values(null, string2, new String[]{string3});
    }

    @Override
    public final /* varargs */ void AFInAppEventParameterName(String string2, String ... arrstring) {
        afInfoLog = (afErrorLog + 115) % 128;
        this.values("public_api_call", string2, arrstring);
        int n8 = afInfoLog + 43;
        afErrorLog = n8 % 128;
        if (n8 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override
    public final void AFInAppEventType() {
        synchronized (this) {
            afErrorLog = (afInfoLog + 41) % 128;
            this.valueOf = false;
            this.afErrorLog();
            afErrorLog = (afInfoLog + 37) % 128;
            return;
        }
    }

    @Override
    public final void AFInAppEventType(Throwable arrstackTraceElement) {
        String string2;
        Throwable throwable = arrstackTraceElement.getCause();
        String string3 = arrstackTraceElement.getClass().getSimpleName();
        if (throwable == null) {
            string2 = arrstackTraceElement.getMessage();
        } else {
            string2 = throwable.getMessage();
            afInfoLog = (afErrorLog + 71) % 128;
        }
        if (throwable == null) {
            afInfoLog = (afErrorLog + 39) % 128;
            arrstackTraceElement = arrstackTraceElement.getStackTrace();
        } else {
            arrstackTraceElement = throwable.getStackTrace();
        }
        this.values("exception", string3, AFb1rSDK.valueOf(string2, arrstackTraceElement));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void AFKeystoreWrapper() {
        // MONITORENTER : this
        this.AFKeystoreWrapper = true;
        this.values("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format((Object)System.currentTimeMillis()), new String[0]);
        int n8 = afInfoLog + 73;
        afErrorLog = n8 % 128;
        {
            catch (Throwable throwable222222) {
                throw throwable222222;
            }
        }
        if (n8 % 2 != 0) {
            // MONITOREXIT : this
            return;
        }
        n8 = 42 / 0;
        // MONITOREXIT : this
        return;
    }

    @Override
    public final boolean afInfoLog() {
        int n8 = afErrorLog;
        int n9 = n8 + 59;
        afInfoLog = n9 % 128;
        if (n9 % 2 == 0) {
            boolean bl = this.AFKeystoreWrapper;
            afInfoLog = (n8 += 51) % 128;
            if (n8 % 2 == 0) {
                return bl;
            }
            throw null;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void valueOf() {
        block7 : {
            // MONITORENTER : this
            var1_1 = AFb1rSDK.afInfoLog + 45;
            AFb1rSDK.afErrorLog = var1_1 % 128;
            {
                catch (Throwable var2_3) {
                    throw var2_3;
                }
            }
            if (var1_1 % 2 != 0) ** GOTO lbl13
            this.AFInAppEventType.clear();
            this.AFInAppEventParameterName.clear();
            this.values = 1;
            break block7;
lbl13: // 1 sources:
            this.AFInAppEventType.clear();
            this.AFInAppEventParameterName.clear();
            this.values = 0;
        }
        var1_1 = AFb1rSDK.afInfoLog + 69;
        AFb1rSDK.afErrorLog = var1_1 % 128;
        if (var1_1 % 2 != 0) ** GOTO lbl27
        try {
            var1_1 = 92 / 0;
            // MONITOREXIT : this
            return;
        }
        catch (Throwable var2_2) {
            throw var2_2;
lbl27: // 1 sources:
            // MONITOREXIT : this
            return;
        }
    }

    @Override
    public final void valueOf(String object, PackageManager object2, AFc1xSDK aFc1xSDK) {
        try {
            object = new AFd1iSDK(this.values((String)object, (PackageManager)object2, aFc1xSDK), aFc1xSDK);
            object2 = aFc1xSDK.AFVersionDeclaration();
            object2.AFKeystoreWrapper.execute(new Runnable((AFc1bSDK)object2, (AFd1zSDK)object){
                private /* synthetic */ AFd1zSDK AFInAppEventType;
                private /* synthetic */ AFc1bSDK AFKeystoreWrapper;
                {
                    this.AFKeystoreWrapper = aFc1bSDK;
                    this.AFInAppEventType = aFd1zSDK;
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 * Converted monitor instructions to comments
                 * Lifted jumps to return sites
                 */
                public final void run() {
                    java.util.NavigableSet navigableSet;
                    int n8;
                    Object object;
                    block20 : {
                        block21 : {
                            boolean bl;
                            navigableSet = this.AFKeystoreWrapper.AFLogger;
                            // MONITORENTER : navigableSet
                            if (this.AFKeystoreWrapper.afErrorLog.contains((Object)this.AFInAppEventType)) {
                                StringBuilder stringBuilder = new StringBuilder("QUEUE: tried to add already running task: ");
                                stringBuilder.append((Object)this.AFInAppEventType);
                                AFLogger.afDebugLog(stringBuilder.toString());
                                // MONITOREXIT : navigableSet
                                return;
                            }
                            if (this.AFKeystoreWrapper.AFLogger.contains((Object)this.AFInAppEventType) || this.AFKeystoreWrapper.afInfoLog.contains((Object)this.AFInAppEventType)) break block20;
                            java.util.NavigableSet navigableSet22 = this.AFKeystoreWrapper;
                            object = this.AFInAppEventType;
                            for (com.appsflyer.internal.AFd1vSDK aFd1vSDK : object.AFKeystoreWrapper) {
                                if (!navigableSet22.valueOf.contains((Object)aFd1vSDK)) continue;
                                object.AFInAppEventParameterName.add((Object)aFd1vSDK);
                            }
                            if (this.AFKeystoreWrapper.values(this.AFInAppEventType)) {
                                bl = this.AFKeystoreWrapper.AFLogger.add((Object)this.AFInAppEventType);
                            } else {
                                boolean bl2;
                                bl = bl2 = this.AFKeystoreWrapper.afInfoLog.add((Object)this.AFInAppEventType);
                                if (bl2) {
                                    navigableSet22 = new StringBuilder("QUEUE: new task was blocked: ");
                                    navigableSet22.append((Object)this.AFInAppEventType);
                                    AFLogger.afDebugLog(navigableSet22.toString());
                                    this.AFInAppEventType.AFKeystoreWrapper();
                                    bl = bl2;
                                }
                            }
                            if (bl) {
                                navigableSet22 = this.AFKeystoreWrapper;
                                navigableSet22.AFLogger.addAll(navigableSet22.afDebugLog);
                                this.AFKeystoreWrapper.afDebugLog.clear();
                            } else {
                                navigableSet22 = new StringBuilder("QUEUE: task not added, it's already in the queue: ");
                                navigableSet22.append((Object)this.AFInAppEventType);
                                AFLogger.afDebugLog(navigableSet22.toString());
                            }
                            // MONITOREXIT : navigableSet
                            if (!bl) break block21;
                            this.AFKeystoreWrapper.valueOf.add((Object)this.AFInAppEventType.values);
                            navigableSet = new StringBuilder("QUEUE: new task added: ");
                            navigableSet.append((Object)this.AFInAppEventType);
                            AFLogger.afDebugLog(navigableSet.toString());
                            for (java.util.NavigableSet navigableSet22 : this.AFKeystoreWrapper.values) {
                            }
                            navigableSet = this.AFKeystoreWrapper;
                            navigableSet.AFInAppEventParameterName.submit((Runnable)navigableSet);
                            object = this.AFKeystoreWrapper;
                            navigableSet22 = object.AFLogger;
                            // MONITORENTER : navigableSet22
                            n8 = object.AFLogger.size() + object.afInfoLog.size() - 40;
                        }
                        navigableSet = new StringBuilder("QUEUE: tried to add already pending task: ");
                        navigableSet.append((Object)this.AFInAppEventType);
                        AFLogger.afWarnLog(navigableSet.toString());
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder("QUEUE: tried to add already scheduled task: ");
                    stringBuilder.append((Object)this.AFInAppEventType);
                    AFLogger.afDebugLog(stringBuilder.toString());
                    // MONITOREXIT : navigableSet
                    return;
                    do {
                        block25 : {
                            block23 : {
                                boolean bl;
                                block24 : {
                                    boolean bl3;
                                    block22 : {
                                        if (n8 <= 0) {
                                            // MONITOREXIT : navigableSet22
                                            return;
                                        }
                                        bl = object.afInfoLog.isEmpty() ^ true;
                                        bl3 = object.AFLogger.isEmpty() ^ true;
                                        if (!bl3 || !bl) break block22;
                                        navigableSet = ((AFd1zSDK)object.AFLogger.first()).AFKeystoreWrapper((AFd1zSDK)object.afInfoLog.first()) > 0 ? object.AFLogger : object.afInfoLog;
                                        break block23;
                                    }
                                    if (!bl3) break block24;
                                    navigableSet = object.AFLogger;
                                    break block23;
                                }
                                if (!bl) break block25;
                                navigableSet = object.afInfoLog;
                            }
                            object.AFInAppEventParameterName(navigableSet);
                        }
                        --n8;
                    } while (true);
                }
            });
        }
        catch (Throwable throwable) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", throwable);
            return;
        }
        int n8 = afErrorLog + 7;
        afInfoLog = n8 % 128;
        if (n8 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override
    public final void valueOf(String string2, String string3) {
        afInfoLog = (afErrorLog + 87) % 128;
        this.values("server_request", string2, new String[]{string3});
        afErrorLog = (afInfoLog + 113) % 128;
    }

    @Override
    public final void values() {
        synchronized (this) {
            this.values("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format((Object)System.currentTimeMillis()), new String[0]);
            this.AFKeystoreWrapper = false;
            this.valueOf = false;
            afInfoLog = (afErrorLog + 49) % 128;
            return;
        }
    }
}

