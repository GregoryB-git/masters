/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Executor
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1mSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFc1ySDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1mSDK;
import com.appsflyer.internal.AFd1zSDK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFb1sSDK {
    public static Intent valueOf;
    public DeepLinkListener AFInAppEventParameterName;
    @NonNull
    public List<List<String>> AFInAppEventType = new ArrayList();
    public String AFKeystoreWrapper;
    @NonNull
    public final List<String> AFLogger = new ArrayList();
    public String[] afDebugLog;
    public long afInfoLog;
    private final AFc1xSDK afRDLog;
    public Map<String, String> values;

    public AFb1sSDK(@NonNull AFc1xSDK aFc1xSDK) {
        this.afRDLog = aFc1xSDK;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean AFInAppEventParameterName(Intent intent, Context context, Map<String, Object> map) {
        Uri uri;
        Uri uri2;
        Intent intent2;
        block12 : {
            StringBuilder stringBuilder = null;
            uri2 = intent != null && "android.intent.action.VIEW".equals((Object)intent.getAction()) ? intent.getData() : null;
            intent2 = valueOf;
            uri = intent2 != null && "android.intent.action.VIEW".equals((Object)intent2.getAction()) ? intent2.getData() : null;
            if (intent == null) {
                AFLogger.afDebugLog("Could not extract deeplink from null intent");
                intent2 = stringBuilder;
            } else {
                Bundle bundle = intent.getExtras();
                intent2 = stringBuilder;
                if (!this.AFInAppEventType.isEmpty()) {
                    if (bundle == null) {
                        intent2 = stringBuilder;
                    } else {
                        List list;
                        Iterator iterator = this.AFInAppEventType.iterator();
                        do {
                            String string2;
                            intent2 = stringBuilder;
                            if (!iterator.hasNext()) break block12;
                            list = (List)iterator.next();
                            intent2 = list == null || !(intent2 = list.iterator()).hasNext() || (string2 = bundle.getString((String)intent2.next())) == null ? null : this.values(string2, (Iterator<String>)intent2);
                        } while (intent2 == null);
                        stringBuilder = new StringBuilder("Found deeplink in push payload at ");
                        stringBuilder.append(list.toString());
                        AFLogger.afDebugLog(stringBuilder.toString());
                        AFa1eSDK.values(map).put((Object)"payloadKey", this.AFInAppEventType);
                    }
                }
            }
        }
        if (uri2 != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                this.valueOf(context, map, uri2);
                return true;
            }
            intent = new StringBuilder("skipping re-use of previously consumed deep link: ");
            intent.append(uri2.toString());
            intent.append(" w/af_consumed");
            AFLogger.afInfoLog(intent.toString());
            return false;
        }
        if (uri != null) {
            if (!valueOf.hasExtra("af_consumed")) {
                valueOf.putExtra("af_consumed", System.currentTimeMillis());
                this.valueOf(context, map, uri);
                return true;
            }
            intent = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            intent.append(uri.toString());
            intent.append(" w/af_consumed");
            AFLogger.afInfoLog(intent.toString());
            return false;
        }
        if (intent2 == null) {
            AFLogger.afDebugLog("No deep link detected");
            return false;
        }
        if (!intent.hasExtra("af_consumed")) {
            intent.putExtra("af_consumed", System.currentTimeMillis());
            this.valueOf(context, map, (Uri)intent2);
            return true;
        }
        intent = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
        intent.append(intent2.toString());
        intent.append(" w/af_consumed");
        AFLogger.afInfoLog(intent.toString());
        return false;
    }

    private static void AFKeystoreWrapper(String string2) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1eSDK.valueOf().AFInAppEventParameterName;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf((Object)string2)));
                appsFlyerConversionListener.onAttributionFailure(string2);
                return;
            }
            catch (Throwable throwable) {
                AFLogger.afErrorLog(throwable.getLocalizedMessage(), throwable);
            }
        }
    }

    private static void AFKeystoreWrapper(Map<String, String> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1eSDK.valueOf().AFInAppEventParameterName;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder stringBuilder = new StringBuilder("Calling onAppOpenAttribution with:\n");
                stringBuilder.append(map.toString());
                AFLogger.afDebugLog(stringBuilder.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
                return;
            }
            catch (Throwable throwable) {
                AFLogger.afErrorLog(throwable.getLocalizedMessage(), throwable);
            }
        }
    }

    /*
     * Exception decompiling
     */
    private Uri values(Object var1_1, Iterator<String> var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[UNCONDITIONALDOLOOP]], but top level block is 1[CATCHBLOCK]
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

    public final void AFInAppEventType(DeepLinkResult deepLinkResult) {
        if (this.AFInAppEventParameterName != null) {
            StringBuilder stringBuilder = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
            stringBuilder.append(deepLinkResult.toString());
            AFLogger.afDebugLog(stringBuilder.toString());
            try {
                this.AFInAppEventParameterName.onDeepLinking(deepLinkResult);
                return;
            }
            catch (Throwable throwable) {
                AFLogger.afErrorLog(throwable.getLocalizedMessage(), throwable);
                return;
            }
        }
        AFLogger.afDebugLog("[DDL] skipping, no callback registered");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void AFInAppEventType(Map<String, String> var1_1) {
        if (this.AFInAppEventParameterName == null) {
            AFb1sSDK.AFKeystoreWrapper(var1_1);
            return;
        }
        var1_1 = DeepLink.AFKeystoreWrapper(var1_1);
        var1_1.valueOf.put("is_deferred", false);
        var1_1 = new DeepLinkResult((DeepLink)var1_1, null);
lbl8: // 2 sources:
        do {
            this.AFInAppEventType((DeepLinkResult)var1_1);
            return;
            break;
        } while (true);
        {
            catch (Throwable var1_2) {
            }
            catch (JSONException var1_3) {}
            {
                AFLogger.afErrorLog("[DDL] Error occurred", (Throwable)var1_3, true);
                var1_1 = DeepLinkResult.Error.UNEXPECTED;
            }
            var1_1 = new DeepLinkResult(null, (DeepLinkResult.Error)var1_1);
            ** continue;
        }
        this.AFInAppEventType(new DeepLinkResult(null, null));
        throw var1_2;
    }

    public final void AFKeystoreWrapper(String string2, DeepLinkResult.Error error) {
        if (this.AFInAppEventParameterName != null) {
            AFLogger.afDebugLog("[DDL] Error occurred: ".concat(String.valueOf((Object)string2)));
            this.AFInAppEventType(new DeepLinkResult(null, error));
            return;
        }
        AFb1sSDK.AFKeystoreWrapper(string2);
    }

    public final void valueOf(Context object, Map<String, Object> object2, Uri uri) {
        object2 = new AFd1kSDK((Context)object, (Map<String, Object>)object2, uri, this.AFLogger);
        AFa1eSDK.valueOf().AFKeystoreWrapper((Context)object);
        object = this.afRDLog.AFVersionDeclaration();
        object.AFKeystoreWrapper.execute(new Runnable((AFc1bSDK)object, (AFd1zSDK)object2){
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
                java.util.NavigableSet<AFd1zSDK<?>> navigableSet;
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
                        java.util.NavigableSet<AFd1zSDK<?>> navigableSet22 = this.AFKeystoreWrapper;
                        object = this.AFInAppEventType;
                        for (com.appsflyer.internal.AFd1vSDK aFd1vSDK : object.AFKeystoreWrapper) {
                            if (!navigableSet22.valueOf.contains((Object)((Object)aFd1vSDK))) continue;
                            object.AFInAppEventParameterName.add((Object)((Object)aFd1vSDK));
                        }
                        if (AFc1bSDK.values(this.AFKeystoreWrapper, this.AFInAppEventType)) {
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
                        this.AFKeystoreWrapper.valueOf.add((Object)((Object)this.AFInAppEventType.values));
                        navigableSet = new StringBuilder("QUEUE: new task added: ");
                        navigableSet.append((Object)this.AFInAppEventType);
                        AFLogger.afDebugLog(navigableSet.toString());
                        for (java.util.NavigableSet<AFd1zSDK<?>> navigableSet22 : this.AFKeystoreWrapper.values) {
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
        valueOf = null;
    }

    public final void valueOf(Map<String, Object> object, Intent object2, Context context) {
        AFc1ySDK aFc1ySDK = (AFc1ySDK)this.afRDLog;
        if (context != null) {
            aFc1ySDK.valueOf.AFInAppEventType = context.getApplicationContext();
        }
        if (!this.AFInAppEventParameterName((Intent)object2, context, (Map<String, Object>)object) && this.AFInAppEventParameterName != null && this.afRDLog.AFInAppEventParameterName().AFInAppEventType.values("appsFlyerCount", 0) == 0 && !this.afRDLog.values().valueOf("ddl_sent")) {
            object2 = new AFb1mSDK(this.afRDLog);
            object = this.afRDLog.AFVersionDeclaration();
            object2 = new AFd1mSDK((AFb1mSDK)object2);
            object.AFKeystoreWrapper.execute(new );
        }
        this.afRDLog.values().values("ddl_sent", true);
    }
}

