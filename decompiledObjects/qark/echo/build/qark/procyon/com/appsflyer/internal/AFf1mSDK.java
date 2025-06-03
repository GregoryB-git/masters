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

public final class AFf1mSDK extends AFf1rSDK
{
    private final AFc1xSDK AFInAppEventType;
    
    public AFf1mSDK(final Runnable runnable, final AFc1xSDK afInAppEventType) {
        super("store", "samsung", runnable);
        this.AFInAppEventType = afInAppEventType;
    }
    
    @Override
    public final void valueOf(final Context context) {
        this.AFInAppEventType(this.AFInAppEventType.values(), new AFb1hSDK<Map<String, Object>>(context, this.AFInAppEventType, "com.sec.android.app.samsungapps.referrer", new String[] { "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901" }) {
            private Map<String, Object> AFInAppEventParameterName() {
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
                            final Cursor query = contentResolver.query(Uri.parse(sb.toString()), (String[])null, (String)null, (String[])null, (String)null);
                            if (query != null) {
                                cursor2 = query;
                                if (query.moveToFirst()) {
                                    cursor2 = query;
                                    AFf1mSDK.this.AFInAppEventParameterName.put("response", "OK");
                                    cursor2 = query;
                                    AFInAppEventParameterName("referrer", AFf1mSDK.this.AFInAppEventParameterName, query);
                                    cursor2 = query;
                                    AFKeystoreWrapper("click_ts", AFf1mSDK.this.AFInAppEventParameterName, query);
                                    cursor2 = query;
                                    AFKeystoreWrapper("install_begin_ts", AFf1mSDK.this.AFInAppEventParameterName, query);
                                    cursor2 = query;
                                    AFKeystoreWrapper("install_end_ts", AFf1mSDK.this.AFInAppEventParameterName, query);
                                    cursor2 = query;
                                    AFInAppEventParameterName("organic_keywords", AFf1mSDK.this.AFInAppEventParameterName, query);
                                    cursor2 = query;
                                    AFInAppEventParameterName("attr_type", AFf1mSDK.this.AFInAppEventParameterName, query);
                                    cursor2 = query;
                                    final HashMap hashMap = new HashMap<String, Object>();
                                    cursor2 = query;
                                    final int columnIndex = query.getColumnIndex("instant");
                                    if (columnIndex != -1) {
                                        cursor2 = query;
                                        final String string = query.getString(columnIndex);
                                        if (string != null) {
                                            cursor2 = query;
                                            hashMap.put("instant", Boolean.parseBoolean(string));
                                        }
                                    }
                                    cursor2 = query;
                                    AFKeystoreWrapper("click_server_ts", hashMap, query);
                                    cursor2 = query;
                                    AFKeystoreWrapper("install_begin_server_ts", hashMap, query);
                                    cursor2 = query;
                                    AFInAppEventParameterName("install_version", hashMap, query);
                                    cursor2 = query;
                                    if (!hashMap.isEmpty()) {
                                        cursor2 = query;
                                        AFf1mSDK.this.AFInAppEventParameterName.put("custom", hashMap);
                                    }
                                }
                                else {
                                    cursor2 = query;
                                    AFf1mSDK.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                                }
                            }
                            else {
                                cursor2 = query;
                                AFf1mSDK.this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                            }
                            // iftrue(Label_0613:, cursor2 == null)
                            Cursor cursor3;
                            while (true) {
                                while (true) {
                                    if (query != null) {
                                        cursor3 = query;
                                        cursor3.close();
                                    }
                                    final String packageName;
                                    Label_0518: {
                                        packageName = ((PackageItemInfo)super.AFInAppEventParameterName.getPackageManager().resolveContentProvider(super.AFKeystoreWrapper, 128)).packageName;
                                    }
                                    AFf1mSDK.this.AFInAppEventParameterName.put("api_ver", AFa1fSDK.AFInAppEventType(super.AFInAppEventParameterName, packageName));
                                    AFf1mSDK.this.AFInAppEventParameterName.put("api_ver_name", AFa1fSDK.AFKeystoreWrapper(super.AFInAppEventParameterName, packageName));
                                    AFf1mSDK.this.values();
                                    return AFf1mSDK.this.AFInAppEventParameterName;
                                    cursor2.close();
                                    Label_0613:
                                    throw cursor3;
                                    continue;
                                }
                                continue;
                            }
                            cursor2 = cursor3;
                            AFf1mSDK.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                            cursor2 = cursor3;
                            final Exception ex;
                            AFLogger.afErrorLog(ex.getMessage(), ex);
                        }
                        // iftrue(Label_0518:, cursor3 == null)
                        finally {}
                    }
                    catch (Exception ex2) {}
                    final Exception ex2;
                    final Exception ex = ex2;
                    continue;
                }
            }
            
            private static void AFInAppEventParameterName(final String s, final Map<String, Object> map, final Cursor cursor) {
                final int columnIndex = cursor.getColumnIndex(s);
                if (columnIndex == -1) {
                    return;
                }
                final String string = cursor.getString(columnIndex);
                if (string == null) {
                    return;
                }
                map.put(s, string);
            }
            
            private static void AFKeystoreWrapper(final String s, final Map<String, Object> map, final Cursor cursor) {
                final int columnIndex = cursor.getColumnIndex(s);
                if (columnIndex == -1) {
                    return;
                }
                final long long1 = cursor.getLong(columnIndex);
                if (long1 == 0L) {
                    return;
                }
                map.put(s, long1);
            }
        });
    }
}
