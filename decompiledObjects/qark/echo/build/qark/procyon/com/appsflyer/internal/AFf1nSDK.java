// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import android.content.ContentResolver;
import android.database.Cursor;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import android.net.Uri;
import java.util.Map;
import android.content.Context;

public final class AFf1nSDK extends AFf1rSDK
{
    private final AFc1xSDK AFInAppEventType;
    
    public AFf1nSDK(final Runnable runnable, final AFc1xSDK afInAppEventType) {
        super("store", "huawei", runnable);
        this.AFInAppEventType = afInAppEventType;
    }
    
    @Override
    public final void valueOf(final Context context) {
        this.AFInAppEventType(this.AFInAppEventType.values(), new AFb1hSDK<Map<String, Object>>(context, this.AFInAppEventType, "com.huawei.appmarket.commondata", new String[] { "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F" }) {
            private Map<String, Object> AFInAppEventType() {
                final String packageName = ((PackageItemInfo)super.AFInAppEventParameterName.getPackageManager().resolveContentProvider(super.AFKeystoreWrapper, 128)).packageName;
                AFf1nSDK.this.AFInAppEventParameterName.put("api_ver", AFa1fSDK.AFInAppEventType(super.AFInAppEventParameterName, packageName));
                AFf1nSDK.this.AFInAppEventParameterName.put("api_ver_name", AFa1fSDK.AFKeystoreWrapper(super.AFInAppEventParameterName, packageName));
                Cursor cursor2;
                final Cursor cursor = cursor2 = null;
                while (true) {
                    try {
                        try {
                            final ContentResolver contentResolver = super.AFInAppEventParameterName.getContentResolver();
                            cursor2 = cursor;
                            final StringBuilder sb = new StringBuilder("content://");
                            cursor2 = cursor;
                            sb.append(super.AFKeystoreWrapper);
                            cursor2 = cursor;
                            sb.append("/item/5");
                            cursor2 = cursor;
                            final Cursor query = contentResolver.query(Uri.parse(sb.toString()), (String[])null, (String)null, new String[] { super.AFInAppEventParameterName.getPackageName() }, (String)null);
                            if (query != null) {
                                cursor2 = query;
                                if (query.moveToFirst()) {
                                    cursor2 = query;
                                    AFf1nSDK.this.AFInAppEventParameterName.put("response", "OK");
                                    cursor2 = query;
                                    AFf1nSDK.this.AFInAppEventParameterName.put("referrer", query.getString(0));
                                    cursor2 = query;
                                    AFf1nSDK.this.AFInAppEventParameterName.put("click_ts", query.getLong(1));
                                    cursor2 = query;
                                    AFf1nSDK.this.AFInAppEventParameterName.put("install_end_ts", query.getLong(2));
                                    cursor2 = query;
                                    if (query.getColumnCount() > 3) {
                                        cursor2 = query;
                                        AFf1nSDK.this.AFInAppEventParameterName.put("install_begin_ts", query.getLong(3));
                                        cursor2 = query;
                                        final HashMap<String, String> hashMap = new HashMap<String, String>();
                                        cursor2 = query;
                                        final String string = query.getString(4);
                                        if (string != null) {
                                            cursor2 = query;
                                            hashMap.put("track_id", string);
                                        }
                                        cursor2 = query;
                                        hashMap.put("referrer_ex", query.getString(5));
                                        cursor2 = query;
                                        AFf1nSDK.this.AFInAppEventParameterName.put("huawei_custom", hashMap);
                                    }
                                }
                                else {
                                    cursor2 = query;
                                    AFf1nSDK.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                                }
                            }
                            else {
                                cursor2 = query;
                                AFf1nSDK.this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                            }
                            // iftrue(Label_0521:, cursor3 == null)
                            // iftrue(Label_0546:, cursor2 == null)
                        Block_10:
                            while (true) {
                                if (query != null) {
                                    final Cursor cursor3 = query;
                                    cursor3.close();
                                }
                                Label_0521: {
                                    AFf1nSDK.this.values();
                                }
                                return AFf1nSDK.this.AFInAppEventParameterName;
                                Cursor cursor3 = null;
                                cursor2 = cursor3;
                                AFf1nSDK.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                                cursor2 = cursor3;
                                final Exception ex;
                                AFLogger.afErrorLog(ex.getMessage(), ex);
                                Block_9: {
                                    break Block_9;
                                    Label_0546:
                                    throw cursor3;
                                    break Block_10;
                                }
                                continue;
                            }
                            cursor2.close();
                        }
                        finally {}
                    }
                    catch (Exception ex2) {}
                    final Exception ex2;
                    final Exception ex = ex2;
                    continue;
                }
            }
        });
    }
}
