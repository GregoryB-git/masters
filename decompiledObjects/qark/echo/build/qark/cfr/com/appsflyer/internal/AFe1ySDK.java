/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFa1fSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1uSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1eSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.Executor;

public final class AFe1ySDK {
    public static String valueOf;
    public final AFb1dSDK values;

    static {
        StringBuilder stringBuilder = new StringBuilder("https://%sregister.%s/api/v");
        stringBuilder.append(AFa1eSDK.AFInAppEventType);
        valueOf = stringBuilder.toString();
    }

    public AFe1ySDK(@NonNull Context context) {
        this.values = AFa1eSDK.valueOf().values(context);
    }

    public static boolean AFInAppEventType(@NonNull AFb1dSDK aFb1dSDK) {
        return aFb1dSDK.valueOf("sentRegisterRequestToAF");
    }

    public static void valueOf(String object) {
        Object object2 = AFa1eSDK.valueOf().AFInAppEventType();
        object = new AFd1eSDK((String)object, (AFc1xSDK)object2);
        object2 = object2.AFVersionDeclaration();
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

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean values(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String string2 = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            boolean bl = AFa1fSDK.values(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
            if (!bl) return false;
            return true;
        }
        catch (Throwable throwable) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", throwable);
        }
        return false;
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFb1uSDK AFInAppEventParameterName() {
        String[] arrstring = this.values.values("afUninstallToken", null);
        long l8 = this.values.valueOf("afUninstallToken_received_time", 0L);
        boolean bl = this.values.valueOf("afUninstallToken_queued");
        this.values.values("afUninstallToken_queued", false);
        Object object = arrstring;
        if (arrstring == null) {
            String string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken");
            object = arrstring;
            if (string2 != null) {
                object = string2.split(",");
                object = object[object.length - 1];
            }
        }
        long l9 = l8;
        if (l8 == 0L) {
            arrstring = AppsFlyerProperties.getInstance().getString("afUninstallToken");
            l9 = l8;
            if (arrstring != null) {
                arrstring = arrstring.split(",");
                l9 = l8;
                if (arrstring.length >= 2) {
                    try {
                        l9 = Long.parseLong((String)arrstring[arrstring.length - 2]);
                    }
                    catch (NumberFormatException numberFormatException) {
                        l9 = l8;
                    }
                }
            }
        }
        if (object != null) {
            return new AFb1uSDK((String)object, l9, bl);
        }
        return null;
    }
}

