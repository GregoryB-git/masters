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

public final class AFf1nSDK
extends AFf1rSDK {
    private final AFc1xSDK AFInAppEventType;

    public AFf1nSDK(Runnable runnable, AFc1xSDK aFc1xSDK) {
        super("store", "huawei", runnable);
        this.AFInAppEventType = aFc1xSDK;
    }

    @Override
    public final void valueOf(Context object) {
        object = new AFb1hSDK<Map<String, Object>>(this, (Context)object, this.AFInAppEventType, "com.huawei.appmarket.commondata", new String[]{"FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F"}){
            private /* synthetic */ AFf1nSDK valueOf;
            {
                this.valueOf = aFf1nSDK;
                super(context, aFc1xSDK, string2, arrstring);
            }

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            private Map<String, Object> AFInAppEventType() {
                var1_1 = this.AFInAppEventParameterName.getPackageManager().resolveContentProvider((String)this.AFKeystoreWrapper, (int)128).packageName;
                this.valueOf.AFInAppEventParameterName.put((Object)"api_ver", (Object)AFa1fSDK.AFInAppEventType(this.AFInAppEventParameterName, var1_1));
                this.valueOf.AFInAppEventParameterName.put((Object)"api_ver_name", (Object)AFa1fSDK.AFKeystoreWrapper(this.AFInAppEventParameterName, var1_1));
                var4_3 = null;
                var2_6 = var3_4 = null;
                var1_1 = var4_3;
                try {
                    var5_7 = this.AFInAppEventParameterName.getContentResolver();
                    var2_6 = var3_4;
                    var1_1 = var4_3;
                    var6_8 = new StringBuilder("content://");
                    var2_6 = var3_4;
                    var1_1 = var4_3;
                    var6_8.append(this.AFKeystoreWrapper);
                    var2_6 = var3_4;
                    var1_1 = var4_3;
                    var6_8.append("/item/5");
                    var2_6 = var3_4;
                    var1_1 = var4_3;
                    var3_4 = var5_7.query(Uri.parse((String)var6_8.toString()), null, null, new String[]{this.AFInAppEventParameterName.getPackageName()}, null);
                    if (var3_4 != null) {
                        var2_6 = var3_4;
                        var1_1 = var3_4;
                        if (var3_4.moveToFirst()) {
                            var2_6 = var3_4;
                            var1_1 = var3_4;
                            this.valueOf.AFInAppEventParameterName.put((Object)"response", (Object)"OK");
                            var2_6 = var3_4;
                            var1_1 = var3_4;
                            this.valueOf.AFInAppEventParameterName.put((Object)"referrer", (Object)var3_4.getString(0));
                            var2_6 = var3_4;
                            var1_1 = var3_4;
                            this.valueOf.AFInAppEventParameterName.put((Object)"click_ts", (Object)var3_4.getLong(1));
                            var2_6 = var3_4;
                            var1_1 = var3_4;
                            this.valueOf.AFInAppEventParameterName.put((Object)"install_end_ts", (Object)var3_4.getLong(2));
                            var2_6 = var3_4;
                            var1_1 = var3_4;
                            if (var3_4.getColumnCount() > 3) {
                                var2_6 = var3_4;
                                var1_1 = var3_4;
                                this.valueOf.AFInAppEventParameterName.put((Object)"install_begin_ts", (Object)var3_4.getLong(3));
                                var2_6 = var3_4;
                                var1_1 = var3_4;
                                var4_3 = new HashMap();
                                var2_6 = var3_4;
                                var1_1 = var3_4;
                                var5_7 = var3_4.getString(4);
                                if (var5_7 != null) {
                                    var2_6 = var3_4;
                                    var1_1 = var3_4;
                                    var4_3.put((Object)"track_id", var5_7);
                                }
                                var2_6 = var3_4;
                                var1_1 = var3_4;
                                var4_3.put((Object)"referrer_ex", (Object)var3_4.getString(5));
                                var2_6 = var3_4;
                                var1_1 = var3_4;
                                this.valueOf.AFInAppEventParameterName.put((Object)"huawei_custom", (Object)var4_3);
                            }
                        } else {
                            var2_6 = var3_4;
                            var1_1 = var3_4;
                            this.valueOf.AFInAppEventParameterName.put((Object)"response", (Object)"FEATURE_NOT_SUPPORTED");
                        }
                    } else {
                        var2_6 = var3_4;
                        var1_1 = var3_4;
                        this.valueOf.AFInAppEventParameterName.put((Object)"response", (Object)"SERVICE_UNAVAILABLE");
                    }
                    if (var3_4 == null) ** GOTO lbl80
                    var1_1 = var3_4;
                }
                catch (Exception var3_5) {
                    ** continue;
                }
                do {
                    var1_1.close();
                    ** GOTO lbl80
                    break;
                } while (true);
lbl72: // 1 sources:
                do {
                    var2_6 = var1_1;
                    try {
                        this.valueOf.AFInAppEventParameterName.put((Object)"response", (Object)"FEATURE_NOT_SUPPORTED");
                        var2_6 = var1_1;
                        AFLogger.afErrorLog(var3_5.getMessage(), (Throwable)var3_5);
                        if (var1_1 != null) ** continue;
                    }
                    catch (Throwable var1_2) {}
lbl80: // 3 sources:
                    this.valueOf.values();
                    return this.valueOf.AFInAppEventParameterName;
                    if (var2_6 == null) throw var1_2;
                    var2_6.close();
                    throw var1_2;
                    break;
                } while (true);
            }

            @Override
            public final /* synthetic */ Object values() {
                return this.AFInAppEventType();
            }
        };
        this.AFInAppEventType(this.AFInAppEventType.values(), (AFb1hSDK<Map<String, Object>>)object);
    }

}

