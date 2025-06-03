/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Executor
 */
package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1sSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFf1bSDK;
import com.appsflyer.internal.AFf1cSDK;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class CrossPromotionHelper {
    private static String AFInAppEventType = "https://%simpression.%s";

    @NonNull
    private static LinkGenerator AFInAppEventParameterName(@NonNull Context object, String string2, String string3, Map<String, String> map, String string4) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventParameterName = string4;
        linkGenerator.AFInAppEventType = string2;
        linkGenerator.addParameter("af_siteid", object.getPackageName());
        if (string3 != null) {
            linkGenerator.setCampaign(string3);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        if ((object = AppsFlyerProperties.getInstance().getString("advertiserId")) != null) {
            linkGenerator.addParameter("advertising_id", (String)object);
        }
        return linkGenerator;
    }

    private static void AFInAppEventType(@NonNull String object, @NonNull Context object2, AFf1cSDK aFf1cSDK) {
        AFa1eSDK aFa1eSDK = AFa1eSDK.valueOf();
        aFa1eSDK.AFKeystoreWrapper((Context)object2);
        object2 = aFa1eSDK.AFInAppEventType();
        object = new AFd1sSDK((AFc1xSDK)object2, (String)object, aFf1cSDK);
        object2 = object2.AFVersionDeclaration();
        object2.AFKeystoreWrapper.execute(new Runnable((com.appsflyer.internal.AFc1bSDK)object2, (AFd1zSDK)object){
            private /* synthetic */ AFd1zSDK AFInAppEventType;
            private /* synthetic */ com.appsflyer.internal.AFc1bSDK AFKeystoreWrapper;
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
                            java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder("QUEUE: tried to add already running task: ");
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
                                navigableSet22 = new java.lang.StringBuilder("QUEUE: new task was blocked: ");
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
                            navigableSet22 = new java.lang.StringBuilder("QUEUE: task not added, it's already in the queue: ");
                            navigableSet22.append((Object)this.AFInAppEventType);
                            AFLogger.afDebugLog(navigableSet22.toString());
                        }
                        // MONITOREXIT : navigableSet
                        if (!bl) break block21;
                        this.AFKeystoreWrapper.valueOf.add((Object)this.AFInAppEventType.values);
                        navigableSet = new java.lang.StringBuilder("QUEUE: new task added: ");
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
                    navigableSet = new java.lang.StringBuilder("QUEUE: tried to add already pending task: ");
                    navigableSet.append((Object)this.AFInAppEventType);
                    AFLogger.afWarnLog(navigableSet.toString());
                    return;
                }
                java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder("QUEUE: tried to add already scheduled task: ");
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

    public static void logAndOpenStore(@NonNull Context context, String string2, String string3) {
        CrossPromotionHelper.logAndOpenStore(context, string2, string3, null);
    }

    public static void logAndOpenStore(@NonNull Context context, String hashMap, String string2, Map<String, String> hashMap2) {
        LinkGenerator linkGenerator = CrossPromotionHelper.AFInAppEventParameterName(context, (String)hashMap, string2, hashMap2, String.format((String)AFf1bSDK.valueOf, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()}));
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        hashMap = hashMap2;
        if (hashMap2 == null) {
            hashMap = new HashMap();
        }
        hashMap.put((Object)"af_campaign", (Object)string2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", (Map<String, Object>)hashMap);
        CrossPromotionHelper.AFInAppEventType(linkGenerator.generateLink(), context, new AFf1cSDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String string2, String string3) {
        CrossPromotionHelper.logCrossPromoteImpression(context, string2, string3, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String string2, String string3, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, Promote Impression is disabled", true);
            return;
        }
        CrossPromotionHelper.AFInAppEventType(CrossPromotionHelper.AFInAppEventParameterName(context, string2, string3, map, String.format((String)AFInAppEventType, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()})).generateLink(), context, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void setUrl(Map<String, String> var0) {
        var0 = var0.entrySet().iterator();
        while (var0.hasNext() != false) {
            block5 : {
                block4 : {
                    var3_3 = (Map.Entry)var0.next();
                    var2_2 = (String)var3_3.getValue();
                    var1_1 = (var3_3 = (String)var3_3.getKey()).hashCode();
                    if (var1_1 == 96801) break block4;
                    if (var1_1 != 120623625 || !var3_3.equals((Object)"impression")) ** GOTO lbl-1000
                    var1_1 = 1;
                    break block5;
                }
                if (var3_3.equals((Object)"app")) {
                    var1_1 = 0;
                } else lbl-1000: // 2 sources:
                {
                    var1_1 = -1;
                }
            }
            if (var1_1 != 0) {
                if (var1_1 != 1) continue;
                CrossPromotionHelper.AFInAppEventType = var2_2;
                continue;
            }
            AFf1bSDK.valueOf = var2_2;
        }
    }
}

