/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.os.Build
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  com.appsflyer.oaid.OaidClient
 *  com.appsflyer.oaid.OaidClient$Info
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Locale
 *  java.util.Map
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.oaid.OaidClient;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class AFa1cSDK {
    static Boolean valueOf;
    static String values;
    public final String[] AFInAppEventType;

    public AFa1cSDK() {
    }

    public /* varargs */ AFa1cSDK(String ... arrstring) {
        if (arrstring != null && arrstring.length != 0) {
            Pattern pattern = Pattern.compile((String)"[\\w]{1,45}");
            ArrayList arrayList = new ArrayList();
            for (String string2 : arrstring) {
                if (string2 != null && pattern.matcher((CharSequence)string2).matches()) {
                    arrayList.add((Object)string2.toLowerCase(Locale.getDefault()));
                    continue;
                }
                AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf((Object)string2)));
            }
            if (arrayList.contains((Object)"all")) {
                this.AFInAppEventType = new String[]{"all"};
                return;
            }
            if (!arrayList.isEmpty()) {
                this.AFInAppEventType = (String[])arrayList.toArray((Object[])new String[0]);
                return;
            }
            this.AFInAppEventType = null;
            return;
        }
        this.AFInAppEventType = null;
    }

    public static AFc1uSDK.AFa1wSDK AFInAppEventParameterName(ContentResolver object) {
        boolean bl = AFa1cSDK.AFInAppEventType();
        AFc1uSDK.AFa1wSDK aFa1wSDK = null;
        if (!bl) {
            return null;
        }
        if (object == null) {
            return null;
        }
        AFc1uSDK.AFa1wSDK aFa1wSDK2 = aFa1wSDK;
        if (AppsFlyerProperties.getInstance().getString("amazon_aid") == null) {
            aFa1wSDK2 = aFa1wSDK;
            if ("Amazon".equals((Object)Build.MANUFACTURER)) {
                int n8 = Settings.Secure.getInt((ContentResolver)object, (String)"limit_ad_tracking", (int)2);
                if (n8 == 0) {
                    return new AFc1uSDK.AFa1wSDK(Settings.Secure.getString((ContentResolver)object, (String)"advertising_id"), Boolean.FALSE);
                }
                if (n8 == 2) {
                    return null;
                }
                try {
                    object = Settings.Secure.getString((ContentResolver)object, (String)"advertising_id");
                }
                catch (Throwable throwable) {
                    AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", throwable);
                    object = "";
                }
                aFa1wSDK2 = new AFc1uSDK.AFa1wSDK((String)object, Boolean.TRUE);
            }
        }
        return aFa1wSDK2;
    }

    private static boolean AFInAppEventType() {
        Boolean bl = valueOf;
        if (bl != null && !bl.booleanValue()) {
            return false;
        }
        return true;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static AFc1uSDK.AFa1wSDK values(Context object) {
        String string2;
        boolean bl;
        block6 : {
            block8 : {
                block9 : {
                    block5 : {
                        AppsFlyerProperties appsFlyerProperties;
                        block7 : {
                            appsFlyerProperties = AppsFlyerProperties.getInstance();
                            string2 = values;
                            bl = string2 != null;
                            if (!bl) break block7;
                            object = string2;
                            break block8;
                        }
                        string2 = valueOf;
                        if (string2 != null && string2.booleanValue() || valueOf == null && appsFlyerProperties.getBoolean("collectOAID", true)) {
                            object = new OaidClient((Context)object);
                            object.setLogging(appsFlyerProperties.isEnableLog());
                            string2 = object.fetch();
                            if (string2 == null) break block5;
                            object = string2.getId();
                            string2 = string2.getLat();
                            break block6;
                        }
                    }
                    string2 = null;
                    object = string2;
                    break block6;
                    catch (Throwable throwable) {}
                    object = null;
                    break block9;
                    catch (Throwable throwable) {}
                }
                AFLogger.afDebugLog("No OAID library");
            }
            string2 = null;
        }
        if (object == null) return null;
        object = new AFc1uSDK.AFa1wSDK((String)object, (Boolean)string2);
        object.values = bl;
        return object;
    }

    /*
     * Exception decompiling
     */
    public static AFc1uSDK.AFa1wSDK values(Context var0, Map<String, Object> var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        // java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        // java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        // java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        // java.base/java.util.Objects.checkIndex(Objects.java:374)
        // java.base/java.util.ArrayList.get(ArrayList.java:459)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.RemoveDeterministicJumps.propagateLiteralReturn(RemoveDeterministicJumps.java:73)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.RemoveDeterministicJumps.apply(RemoveDeterministicJumps.java:31)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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
}

