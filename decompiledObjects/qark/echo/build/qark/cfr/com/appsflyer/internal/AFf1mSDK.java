/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.pm.PackageItemInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.net.Uri
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 */
package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1fSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1hSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFf1pSDK;
import com.appsflyer.internal.AFf1rSDK;
import java.util.HashMap;
import java.util.Map;

public final class AFf1mSDK
extends AFf1rSDK {
    private final AFc1xSDK AFInAppEventType;

    public AFf1mSDK(Runnable runnable, AFc1xSDK aFc1xSDK) {
        super("store", "samsung", runnable);
        this.AFInAppEventType = aFc1xSDK;
    }

    @Override
    public final void valueOf(Context object) {
        object = new AFb1hSDK<Map<String, Object>>(this, (Context)object, this.AFInAppEventType, "com.sec.android.app.samsungapps.referrer", new String[]{"FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901"}){
            private /* synthetic */ AFf1mSDK valueOf;
            {
                this.valueOf = aFf1mSDK;
                super(context, aFc1xSDK, string2, arrstring);
            }

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            private Map<String, Object> AFInAppEventParameterName() {
                var5_1 = null;
                var3_4 = var4_2 = null;
                var2_5 = var5_1;
                try {
                    var6_7 = this.AFInAppEventParameterName.getContentResolver();
                    var3_4 = var4_2;
                    var2_5 = var5_1;
                    var7_8 = new StringBuilder("content://");
                    var3_4 = var4_2;
                    var2_5 = var5_1;
                    var7_8.append(this.AFKeystoreWrapper);
                    var3_4 = var4_2;
                    var2_5 = var5_1;
                    var4_2 = var6_7.query(Uri.parse((String)var7_8.toString()), null, null, null, null);
                    if (var4_2 != null) {
                        var3_4 = var4_2;
                        var2_5 = var4_2;
                        if (var4_2.moveToFirst()) {
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            this.valueOf.AFInAppEventParameterName.put((Object)"response", (Object)"OK");
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            .AFInAppEventParameterName("referrer", this.valueOf.AFInAppEventParameterName, (Cursor)var4_2);
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            .AFKeystoreWrapper("click_ts", this.valueOf.AFInAppEventParameterName, (Cursor)var4_2);
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            .AFKeystoreWrapper("install_begin_ts", this.valueOf.AFInAppEventParameterName, (Cursor)var4_2);
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            .AFKeystoreWrapper("install_end_ts", this.valueOf.AFInAppEventParameterName, (Cursor)var4_2);
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            .AFInAppEventParameterName("organic_keywords", this.valueOf.AFInAppEventParameterName, (Cursor)var4_2);
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            .AFInAppEventParameterName("attr_type", this.valueOf.AFInAppEventParameterName, (Cursor)var4_2);
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            var5_1 = new HashMap();
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            var1_9 = var4_2.getColumnIndex("instant");
                            if (var1_9 != -1) {
                                var3_4 = var4_2;
                                var2_5 = var4_2;
                                var6_7 = var4_2.getString(var1_9);
                                if (var6_7 != null) {
                                    var3_4 = var4_2;
                                    var2_5 = var4_2;
                                    var5_1.put((Object)"instant", (Object)Boolean.parseBoolean((String)var6_7));
                                }
                            }
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            .AFKeystoreWrapper("click_server_ts", var5_1, (Cursor)var4_2);
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            .AFKeystoreWrapper("install_begin_server_ts", var5_1, (Cursor)var4_2);
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            .AFInAppEventParameterName("install_version", var5_1, (Cursor)var4_2);
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            if (!var5_1.isEmpty()) {
                                var3_4 = var4_2;
                                var2_5 = var4_2;
                                this.valueOf.AFInAppEventParameterName.put((Object)"custom", (Object)var5_1);
                            }
                        } else {
                            var3_4 = var4_2;
                            var2_5 = var4_2;
                            this.valueOf.AFInAppEventParameterName.put((Object)"response", (Object)"FEATURE_NOT_SUPPORTED");
                        }
                    } else {
                        var3_4 = var4_2;
                        var2_5 = var4_2;
                        this.valueOf.AFInAppEventParameterName.put((Object)"response", (Object)"SERVICE_UNAVAILABLE");
                    }
                    if (var4_2 == null) ** GOTO lbl90
                    var2_5 = var4_2;
                }
                catch (Exception var4_3) {
                    ** continue;
                }
                do {
                    var2_5.close();
                    ** GOTO lbl90
                    break;
                } while (true);
lbl82: // 1 sources:
                do {
                    var3_4 = var2_5;
                    try {
                        this.valueOf.AFInAppEventParameterName.put((Object)"response", (Object)"FEATURE_NOT_SUPPORTED");
                        var3_4 = var2_5;
                        AFLogger.afErrorLog(var4_3.getMessage(), (Throwable)var4_3);
                        if (var2_5 != null) ** continue;
                    }
                    catch (Throwable var2_6) {}
lbl90: // 3 sources:
                    var2_5 = this.AFInAppEventParameterName.getPackageManager().resolveContentProvider((String)this.AFKeystoreWrapper, (int)128).packageName;
                    this.valueOf.AFInAppEventParameterName.put((Object)"api_ver", (Object)AFa1fSDK.AFInAppEventType(this.AFInAppEventParameterName, var2_5));
                    this.valueOf.AFInAppEventParameterName.put((Object)"api_ver_name", (Object)AFa1fSDK.AFKeystoreWrapper(this.AFInAppEventParameterName, var2_5));
                    this.valueOf.values();
                    return this.valueOf.AFInAppEventParameterName;
                    if (var3_4 == null) throw var2_6;
                    var3_4.close();
                    throw var2_6;
                    break;
                } while (true);
            }

            private static void AFInAppEventParameterName(String string2, Map<String, Object> map, Cursor object) {
                int n8 = object.getColumnIndex(string2);
                if (n8 == -1) {
                    return;
                }
                if ((object = object.getString(n8)) == null) {
                    return;
                }
                map.put((Object)string2, object);
            }

            private static void AFKeystoreWrapper(String string2, Map<String, Object> map, Cursor cursor) {
                int n8 = cursor.getColumnIndex(string2);
                if (n8 == -1) {
                    return;
                }
                long l8 = cursor.getLong(n8);
                if (l8 == 0L) {
                    return;
                }
                map.put((Object)string2, (Object)l8);
            }

            @Override
            public final /* synthetic */ Object values() {
                return this.AFInAppEventParameterName();
            }
        };
        this.AFInAppEventType(this.AFInAppEventType.values(), (AFb1hSDK<Map<String, Object>>)object);
    }

}

