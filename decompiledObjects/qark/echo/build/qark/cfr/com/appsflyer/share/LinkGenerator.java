/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.UUID
 *  java.util.concurrent.Executor
 */
package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1wSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFf1bSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public class LinkGenerator {
    String AFInAppEventParameterName;
    String AFInAppEventType;
    private final String AFKeystoreWrapper;
    private String AFLogger;
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private String afDebugLog;
    private String afErrorLog;
    private String afInfoLog;
    private String afRDLog;
    private final Map<String, String> afWarnLog = new HashMap();
    private String valueOf;
    private String values;

    public LinkGenerator(String string2) {
        this.AFKeystoreWrapper = string2;
    }

    private Map<String, String> values() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"pid", (Object)this.AFKeystoreWrapper);
        String string2 = this.afErrorLog;
        if (string2 != null) {
            hashMap.put((Object)"af_referrer_uid", (Object)string2);
        }
        if ((string2 = this.values) != null) {
            hashMap.put((Object)"af_channel", (Object)string2);
        }
        if ((string2 = this.AFLogger) != null) {
            hashMap.put((Object)"af_referrer_customer_id", (Object)string2);
        }
        if ((string2 = this.valueOf) != null) {
            hashMap.put((Object)"c", (Object)string2);
        }
        if ((string2 = this.afRDLog) != null) {
            hashMap.put((Object)"af_referrer_name", (Object)string2);
        }
        if ((string2 = this.afInfoLog) != null) {
            hashMap.put((Object)"af_referrer_image_url", (Object)string2);
        }
        if (this.AFVersionDeclaration != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.AFVersionDeclaration);
            String string3 = this.afDebugLog;
            if (string3 != null) {
                string2 = "";
                this.afDebugLog = string3.replaceFirst("^[/]", "");
                if (!this.AFVersionDeclaration.endsWith("/")) {
                    string2 = "/";
                }
                stringBuilder.append(string2);
                stringBuilder.append(this.afDebugLog);
            }
            hashMap.put((Object)"af_dp", (Object)stringBuilder.toString());
        }
        for (StringBuilder stringBuilder : this.afWarnLog.entrySet()) {
            hashMap.put((Object)((String)stringBuilder.getKey()), (Object)((String)stringBuilder.getValue()));
        }
        return AFb1wSDK.AFKeystoreWrapper(hashMap);
    }

    public LinkGenerator addParameter(String string2, String string3) {
        this.afWarnLog.put((Object)string2, (Object)string3);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.afWarnLog.putAll(map);
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String generateLink() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.AFInAppEventParameterName;
        string2 = string2 != null && string2.startsWith("http") ? this.AFInAppEventParameterName : String.format((String)AFf1bSDK.valueOf, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()});
        stringBuilder.append(string2);
        if (this.AFInAppEventType != null) {
            stringBuilder.append('/');
            stringBuilder.append(this.AFInAppEventType);
        }
        Iterator iterator = this.values();
        string2 = new StringBuilder();
        iterator = iterator.entrySet().iterator();
        do {
            if (!iterator.hasNext()) {
                stringBuilder.append(string2.toString());
                return stringBuilder.toString();
            }
            Map.Entry entry = (Map.Entry)iterator.next();
            char c8 = string2.length() == 0 ? '?' : '&';
            string2.append(c8);
            string2.append((String)entry.getKey());
            string2.append('=');
            string2.append((String)entry.getValue());
        } while (true);
    }

    @Deprecated
    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        this.generateLink(context, new ResponseListener(this, responseListener){
            private /* synthetic */ LinkGenerator valueOf;
            private /* synthetic */ CreateOneLinkHttpTask.ResponseListener values;
            {
                this.valueOf = linkGenerator;
                this.values = responseListener;
            }

            @Override
            public final void onResponse(String string2) {
                this.values.onResponse(string2);
            }

            @Override
            public final void onResponseError(String string2) {
                this.values.onResponseError(string2);
            }
        });
    }

    public void generateLink(Context object, ResponseListener object2) {
        String string2 = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        String string3 = this.AFLogger$LogLevel;
        Map<String, String> map = this.values();
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFa1eSDK.valueOf().AFKeystoreWrapper((Context)object);
        object = AFa1eSDK.valueOf().AFInAppEventType();
        object2 = new AFd1rSDK((AFc1xSDK)object, UUID.randomUUID(), string2, map, string3, (ResponseListener)object2);
        object = object.AFVersionDeclaration();
        object.AFKeystoreWrapper.execute(new Runnable((com.appsflyer.internal.AFc1bSDK)object, (AFd1zSDK)object2){
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

    public String getBrandDomain() {
        return this.AFLogger$LogLevel;
    }

    public String getCampaign() {
        return this.valueOf;
    }

    public String getChannel() {
        return this.values;
    }

    public String getMediaSource() {
        return this.AFKeystoreWrapper;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.afWarnLog);
    }

    public LinkGenerator setBaseDeeplink(String string2) {
        this.AFVersionDeclaration = string2;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public LinkGenerator setBaseURL(String string2, String string3, String string4) {
        block5 : {
            block2 : {
                block4 : {
                    block3 : {
                        if (string2 == null || string2.length() <= 0) break block2;
                        if (string3 == null) break block3;
                        string4 = string3;
                        if (string3.length() >= 5) break block4;
                    }
                    string4 = "go.onelink.me";
                }
                string2 = String.format((String)"https://%s/%s", (Object[])new Object[]{string4, string2});
                break block5;
            }
            string2 = String.format((String)"https://%s/%s", (Object[])new Object[]{String.format((String)"%sapp.%s", (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()}), string4});
        }
        this.AFInAppEventParameterName = string2;
        return this;
    }

    public LinkGenerator setBrandDomain(String string2) {
        this.AFLogger$LogLevel = string2;
        return this;
    }

    public LinkGenerator setCampaign(String string2) {
        this.valueOf = string2;
        return this;
    }

    public LinkGenerator setChannel(String string2) {
        this.values = string2;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String string2) {
        this.afDebugLog = string2;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String string2) {
        this.AFLogger = string2;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String string2) {
        this.afInfoLog = string2;
        return this;
    }

    public LinkGenerator setReferrerName(String string2) {
        this.afRDLog = string2;
        return this;
    }

    public LinkGenerator setReferrerUID(String string2) {
        this.afErrorLog = string2;
        return this;
    }

    public static interface ResponseListener {
        public void onResponse(String var1);

        public void onResponseError(String var1);
    }

}

