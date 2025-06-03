/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.text.SimpleDateFormat
 *  java.util.Locale
 *  java.util.Map
 */
package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1cSDK;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFa1qSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1zSDK;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1hSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFe1uSDK;
import com.appsflyer.internal.AFe1vSDK;
import com.appsflyer.internal.AFe1wSDK;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

public final class AFd1eSDK
extends AFd1hSDK {
    private static char[] AppsFlyer2dXConversionCallback = new char[]{'\u00ac', '\u00bc', '\u00ab', '\u00b8', '\u00ae'};
    private static boolean init = false;
    private static boolean onAppOpenAttributionNative = true;
    private static int onInstallConversionDataLoadedNative = 0;
    private static int onInstallConversionFailureNative = 0;
    private static int onResponseNative = 1;
    private final AFb1bSDK AFLogger$LogLevel;
    private final AFe1vSDK AFVersionDeclaration;
    private final String afWarnLog;
    private final AFb1gSDK getLevel;

    static {
        init = true;
        onInstallConversionDataLoadedNative = 74;
    }

    public AFd1eSDK(@NonNull String string2, @NonNull AFc1xSDK aFc1xSDK) {
        super(new AFe1uSDK(aFc1xSDK.init().AFInAppEventType), aFc1xSDK, string2);
        this.getLevel = aFc1xSDK.AFInAppEventParameterName();
        this.AFLogger$LogLevel = aFc1xSDK.init();
        this.afWarnLog = string2;
        this.AFVersionDeclaration = aFc1xSDK.AFLogger();
    }

    /*
     * Exception decompiling
     */
    private static void AFInAppEventParameterName(String var0, String var1_1, int[] var2_3, int var3_4, Object[] var4_5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[WHILELOOP]], but top level block is 1[TRYBLOCK]
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

    private void AFVersionDeclaration() {
        onResponseNative = (onInstallConversionFailureNative + 27) % 128;
        this.afErrorLogForExcManagerOnly.values("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        onResponseNative = (onInstallConversionFailureNative + 29) % 128;
    }

    @Override
    public final boolean afInfoLog() {
        int n8;
        int n9 = onInstallConversionFailureNative;
        boolean bl = true;
        onResponseNative = n8 = ++n9 % 128;
        if (n9 % 2 != 0) {
            bl = false;
        }
        n9 = n8 + 115;
        onInstallConversionFailureNative = n9 % 128;
        if (n9 % 2 == 0) {
            return bl;
        }
        throw null;
    }

    @Override
    public final void valueOf(AFa1qSDK aFa1qSDK) {
        block11 : {
            block12 : {
                Object object;
                int n8;
                Object[] arrobject;
                super.valueOf(aFa1qSDK);
                object = this.AFLogger$LogLevel.AFInAppEventType;
                arrobject = AFa1eSDK.valueOf();
                if (object == null) break block11;
                if (arrobject.AFKeystoreWrapper()) break block12;
                arrobject = object.getPackageManager();
                String string2 = object.getPackageName();
                try {
                    string2 = arrobject.getPackageInfo(string2, 0);
                    aFa1qSDK.AFKeystoreWrapper("app_version_code", Integer.toString((int)string2.versionCode));
                    aFa1qSDK.AFKeystoreWrapper("app_version_name", string2.versionName);
                    aFa1qSDK.AFKeystoreWrapper("app_name", arrobject.getApplicationLabel(string2.applicationInfo).toString());
                    long l8 = string2.firstInstallTime;
                    aFa1qSDK.AFKeystoreWrapper("installDate", AFa1eSDK.AFInAppEventType(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), l8));
                }
                catch (Throwable throwable) {
                    AFLogger.afErrorLog("Exception while collecting application version info.", throwable);
                }
                onResponseNative = (onInstallConversionFailureNative + 85) % 128;
                this.AFVersionDeclaration.AFInAppEventType(aFa1qSDK.valueOf());
                arrobject = AFa1eSDK.AFInAppEventParameterName();
                if (arrobject != null) {
                    onInstallConversionFailureNative = (onResponseNative + 5) % 128;
                    aFa1qSDK.AFKeystoreWrapper("appUserId", arrobject);
                }
                try {
                    aFa1qSDK.AFKeystoreWrapper("model", Build.MODEL);
                    n8 = Drawable.resolveOpacity((int)0, (int)0);
                    arrobject = new Object[1];
                    AFd1eSDK.AFInAppEventParameterName("\u0085\u0084\u0083\u0082\u0081", null, null, 127 - n8, arrobject);
                    aFa1qSDK.AFKeystoreWrapper(((String)arrobject[0]).intern(), Build.BRAND);
                }
                catch (Throwable throwable) {
                    AFLogger.afErrorLog("Exception while collecting device brand and model.", throwable);
                }
                if (!(true ^ AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false))) {
                    aFa1qSDK.AFKeystoreWrapper("deviceTrackingDisabled", "true");
                }
                object = AFa1cSDK.AFInAppEventParameterName(object.getContentResolver());
                if (object != null) {
                    aFa1qSDK.AFKeystoreWrapper("amazon_aid", object.valueOf);
                    aFa1qSDK.AFKeystoreWrapper("amazon_aid_limit", String.valueOf((Object)object.AFInAppEventType));
                }
                if ((object = AppsFlyerProperties.getInstance().getString("advertiserId")) != null) {
                    n8 = onInstallConversionFailureNative + 27;
                    onResponseNative = n8 % 128;
                    aFa1qSDK.AFKeystoreWrapper("advertiserId", object);
                    if (n8 % 2 == 0) {
                        throw null;
                    }
                }
                aFa1qSDK.AFKeystoreWrapper("devkey", this.afDebugLog.AFInAppEventParameterName);
                aFa1qSDK.AFKeystoreWrapper("uid", AFb1zSDK.valueOf(this.AFLogger$LogLevel, this.afErrorLogForExcManagerOnly));
                aFa1qSDK.AFKeystoreWrapper("af_gcm_token", this.afWarnLog);
                aFa1qSDK.AFKeystoreWrapper("launch_counter", Integer.toString((int)this.afErrorLogForExcManagerOnly.values("appsFlyerCount", 0)));
                aFa1qSDK.AFKeystoreWrapper("sdk", Integer.toString((int)Build.VERSION.SDK_INT));
                object = this.getLevel.values();
                if (object != null) {
                    aFa1qSDK.AFKeystoreWrapper("channel", object);
                }
                n8 = onResponseNative + 101;
                onInstallConversionFailureNative = n8 % 128;
                if (n8 % 2 == 0) {
                    return;
                }
                throw null;
            }
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        throw new IllegalStateException("Context is not provided, can't send register request");
    }

    @Override
    public final void values() {
        onResponseNative = (onInstallConversionFailureNative + 97) % 128;
        AFd1oSDK.super.values();
        AFc1gSDK aFc1gSDK = this.afErrorLog;
        if (aFc1gSDK != null) {
            onResponseNative = (onInstallConversionFailureNative + 111) % 128;
            if (aFc1gSDK.isSuccessful()) {
                onResponseNative = (onInstallConversionFailureNative + 91) % 128;
                this.AFVersionDeclaration();
            }
        }
    }
}

