/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentProviderClient
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.pm.PackageItemInfo
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.DeadObjectException
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.Observer
 *  java.util.concurrent.ExecutorService
 */
package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1fSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFf1pSDK;
import java.util.Map;
import java.util.Observer;
import java.util.concurrent.ExecutorService;

public final class AFf1lSDK
extends AFf1pSDK {
    final ProviderInfo AFInAppEventType;
    private final AFc1xSDK valueOf;

    public AFf1lSDK(ProviderInfo providerInfo, Runnable runnable, AFc1xSDK aFc1xSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.valueOf = aFc1xSDK;
        this.AFInAppEventType = providerInfo;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static ContentProviderClient valueOf(Context var0, Uri var1_4) {
        try {
            var0 = var0.getContentResolver().acquireUnstableContentProviderClient((Uri)var1_4);
            return var0;
        }
        catch (SecurityException var0_2) {}
        ** finally { 
lbl6: // 1 sources:
        var1_4 = "[Preinstall]: Failed to acquire unstable content providerClient due to unexpected throwable";
        AFLogger.afErrorLog((String)var1_4, (Throwable)var0_3, false);
        return null;
    }

    @Override
    public final void valueOf(Context object) {
        object = new Runnable(this, (Context)object){
            private /* synthetic */ AFf1lSDK AFInAppEventParameterName;
            private /* synthetic */ Context AFKeystoreWrapper;
            {
                this.AFInAppEventParameterName = aFf1lSDK;
                this.AFKeystoreWrapper = context;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final void run() {
                int n8;
                Object object;
                AFf1lSDK aFf1lSDK;
                block17 : {
                    block16 : {
                        Throwable throwable3;
                        ContentProviderClient contentProviderClient;
                        block15 : {
                            block18 : {
                                block14 : {
                                    block13 : {
                                        aFf1lSDK = this.AFInAppEventParameterName;
                                        aFf1lSDK.afInfoLog = System.currentTimeMillis();
                                        aFf1lSDK.afDebugLog = AFf1pSDK.AFa1zSDK.AFInAppEventType;
                                        aFf1lSDK.addObserver(new Observer(aFf1lSDK){
                                            private /* synthetic */ AFf1pSDK values;
                                            {
                                                this.values = aFf1pSDK;
                                            }

                                            public final void update(java.util.Observable observable, Object object) {
                                                this.values.values.run();
                                            }
                                        });
                                        aFf1lSDK = new StringBuilder("content://");
                                        aFf1lSDK.append(this.AFInAppEventParameterName.AFInAppEventType.authority);
                                        aFf1lSDK.append("/transaction_id");
                                        aFf1lSDK = Uri.parse((String)aFf1lSDK.toString());
                                        contentProviderClient = AFf1lSDK.valueOf(this.AFKeystoreWrapper, (Uri)aFf1lSDK);
                                        if (contentProviderClient == null) break block16;
                                        try {
                                            object = new StringBuilder("app_id=");
                                            object.append(this.AFKeystoreWrapper.getPackageName());
                                            aFf1lSDK = contentProviderClient.query((Uri)aFf1lSDK, null, object.toString(), null, null);
                                            n8 = Build.VERSION.SDK_INT;
                                        }
                                        catch (Throwable throwable2) {
                                        }
                                        catch (RemoteException remoteException) {
                                            break block13;
                                        }
                                        catch (DeadObjectException deadObjectException) {
                                            break block14;
                                        }
                                        contentProviderClient.release();
                                        break block17;
                                        try {
                                            AFLogger.afErrorLog("[Preinstall]: Error to get data from providerClient ", throwable2, false);
                                            break block15;
                                        }
                                        catch (Throwable throwable3) {}
                                    }
                                    object = "[Preinstall]: Failed to query unstable content providerClient";
                                    break block18;
                                }
                                object = "[Preinstall]: Failed to acquire unstable content providerClient";
                            }
                            AFLogger.afErrorLog((String)object, (Throwable)aFf1lSDK, false);
                        }
                        n8 = Build.VERSION.SDK_INT;
                        contentProviderClient.release();
                        break block16;
                        int n9 = Build.VERSION.SDK_INT;
                        contentProviderClient.release();
                        throw throwable3;
                    }
                    aFf1lSDK = null;
                }
                if (aFf1lSDK != null) {
                    n8 = aFf1lSDK.getColumnIndex("transaction_id");
                    if (n8 == -1) {
                        AFLogger.afWarnLog("[Preinstall]: Wrong column name");
                        this.AFInAppEventParameterName.AFInAppEventParameterName.put((Object)"response", (Object)"FEATURE_NOT_SUPPORTED");
                    } else {
                        this.AFInAppEventParameterName.AFInAppEventParameterName.put((Object)"response", (Object)"OK");
                        if (aFf1lSDK.moveToFirst()) {
                            object = aFf1lSDK.getString(n8);
                            aFf1lSDK.close();
                            if (object != null && !object.isEmpty()) {
                                this.AFInAppEventParameterName.AFInAppEventParameterName.put((Object)"referrer", object);
                            }
                        }
                    }
                    aFf1lSDK.close();
                } else {
                    AFLogger.afWarnLog("[Preinstall]: ContentProvider query failed, got null Cursor");
                    this.AFInAppEventParameterName.AFInAppEventParameterName.put((Object)"response", (Object)"SERVICE_UNAVAILABLE");
                }
                aFf1lSDK = this.AFInAppEventParameterName;
                aFf1lSDK.AFInAppEventParameterName.put((Object)"api_ver", (Object)AFa1fSDK.AFInAppEventType(this.AFKeystoreWrapper, aFf1lSDK.AFInAppEventType.packageName));
                aFf1lSDK = this.AFInAppEventParameterName;
                aFf1lSDK.AFInAppEventParameterName.put((Object)"api_ver_name", (Object)AFa1fSDK.AFKeystoreWrapper(this.AFKeystoreWrapper, aFf1lSDK.AFInAppEventType.packageName));
                this.AFInAppEventParameterName.values();
            }
        };
        this.valueOf.AFInAppEventType().execute((Runnable)object);
    }

}

