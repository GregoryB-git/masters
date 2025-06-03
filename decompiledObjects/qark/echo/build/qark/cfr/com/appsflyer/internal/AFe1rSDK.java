/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Set
 */
package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFe1sSDK;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class AFe1rSDK
extends AFd1oSDK<Map<String, Object>> {
    private static final List<String> afInfoLog = Arrays.asList((Object[])new String[]{"googleplay", "playstore", "googleplaystore"});
    private Map<String, Object> AFLogger$LogLevel;
    private final AFe1mSDK AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private final AFb1gSDK afErrorLogForExcManagerOnly;
    private final AFb1dSDK afWarnLog;
    private final AFc1oSDK getLevel;

    public AFe1rSDK(@NonNull AFc1xSDK object) {
        super(AFd1vSDK.afDebugLog, new AFd1vSDK[]{AFd1vSDK.values}, (AFc1xSDK)object, "GCD-FETCH");
        this.getLevel = object.AFKeystoreWrapper();
        this.afWarnLog = object.values();
        this.AFVersionDeclaration = object.afDebugLog();
        this.afErrorLogForExcManagerOnly = object.AFInAppEventParameterName();
        object = AFd1vSDK.AFInAppEventParameterName;
        this.AFKeystoreWrapper.add(object);
        object = AFd1vSDK.afWarnLog;
        this.AFKeystoreWrapper.add(object);
    }

    @Override
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override
    public final boolean afInfoLog() {
        return false;
    }

    @Override
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }

    /*
     * Exception decompiling
     */
    @NonNull
    @Override
    public final AFd1ySDK valueOf() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException: Backjump on non jumping statement [] lbl34 : TryStatement: try { 3[TRYBLOCK]

        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:44)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:22)
        // org.benf.cfr.reader.util.graph.GraphVisitorDFS.process(GraphVisitorDFS.java:68)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner.removeUnreachableCode(Cleaner.java:54)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.RemoveDeterministicJumps.apply(RemoveDeterministicJumps.java:35)
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final AFc1qSDK<Map<String, Object>> values(@NonNull String var1_1) {
        var2_2 = AFa1eSDK.AFInAppEventType(this.afWarnLog, this.afErrorLogForExcManagerOnly.values());
        if (var2_2 == null || var2_2.trim().isEmpty()) ** GOTO lbl7
        if (!AFe1rSDK.afInfoLog.contains((Object)var2_2.toLowerCase(Locale.getDefault()))) {
            var2_2 = "-".concat(var2_2);
        } else {
            AFLogger.afWarnLog(String.format((String)"[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", (Object[])new Object[]{var2_2}));
lbl7: // 2 sources:
            var2_2 = "";
        }
        var1_1 = this.getLevel.values(var2_2, (String)var1_1);
        var2_2 = new StringBuilder("[GCD-B01] URL: ");
        var2_2.append(var1_1.valueOf.valueOf);
        AFa1aSDK.values(var2_2.toString());
        return var1_1;
    }

    @Override
    public final void values() {
        super.values();
        Map<String, Object> map = this.AFLogger$LogLevel;
        String string2 = this.AppsFlyer2dXConversionCallback;
        if (map != null) {
            AFe1sSDK.values(map);
            return;
        }
        if (string2 != null && !string2.isEmpty()) {
            AFe1sSDK.AFInAppEventType(string2);
            return;
        }
        AFe1sSDK.AFInAppEventType("Unknown error");
    }
}

