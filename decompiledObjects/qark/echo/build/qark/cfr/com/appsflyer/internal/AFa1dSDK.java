/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.FutureTask
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFb1hSDK;
import com.appsflyer.internal.AFc1xSDK;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

final class AFa1dSDK
extends AFb1hSDK<String> {
    public AFa1dSDK(Context context, AFc1xSDK aFc1xSDK) {
        super(context, aFc1xSDK, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /*
     * Exception decompiling
     */
    private String AFInAppEventParameterName() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 4[SIMPLE_IF_TAKEN]
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

    public final String AFInAppEventType() {
        this.AFInAppEventType.AFInAppEventType().execute(this.values);
        return (String)super.valueOf();
    }

    @Override
    public final /* synthetic */ Object valueOf() {
        this.AFInAppEventType.AFInAppEventType().execute(this.values);
        return (String)super.valueOf();
    }

    @Override
    public final /* synthetic */ Object values() {
        return this.AFInAppEventParameterName();
    }
}

