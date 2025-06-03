// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.Build$VERSION;
import java.util.Observable;
import java.util.Observer;
import com.appsflyer.AFLogger;
import android.content.ContentProviderClient;
import android.net.Uri;
import android.content.Context;
import android.content.pm.ProviderInfo;

public final class AFf1lSDK extends AFf1pSDK
{
    final ProviderInfo AFInAppEventType;
    private final AFc1xSDK valueOf;
    
    public AFf1lSDK(final ProviderInfo afInAppEventType, final Runnable runnable, final AFc1xSDK valueOf) {
        super("af_referrer", afInAppEventType.authority, runnable);
        this.valueOf = valueOf;
        this.AFInAppEventType = afInAppEventType;
    }
    
    public static ContentProviderClient valueOf(final Context context, final Uri uri) {
        while (true) {
            Label_0031: {
                try {
                    return context.getContentResolver().acquireUnstableContentProviderClient(uri);
                }
                catch (SecurityException ex) {
                    break Label_0031;
                }
                final String s = "[Preinstall]: Failed to acquire unstable content providerClient due to unexpected throwable";
                final Throwable t;
                AFLogger.afErrorLog(s, t, false);
                return null;
            }
            final String s = "[Preinstall]: Failed to acquire unstable content providerClient due to SecurityException";
            continue;
        }
    }
    
    @Override
    public final void valueOf(final Context context) {
        this.valueOf.AFInAppEventType().execute(new Runnable() {
            @Override
            public final void run() {
                final AFf1lSDK afInAppEventParameterName = AFf1lSDK.this;
                afInAppEventParameterName.afInfoLog = System.currentTimeMillis();
                afInAppEventParameterName.afDebugLog = AFa1zSDK.AFInAppEventType;
                afInAppEventParameterName.addObserver(new Observer() {
                    private /* synthetic */ AFf1pSDK values = afInAppEventParameterName;
                    
                    @Override
                    public final void update(final Observable observable, final Object o) {
                        this.values.values.run();
                    }
                });
                final StringBuilder sb = new StringBuilder("content://");
                sb.append(AFf1lSDK.this.AFInAppEventType.authority);
                sb.append("/transaction_id");
                final Uri parse = Uri.parse(sb.toString());
                final ContentProviderClient value = AFf1lSDK.valueOf(context, parse);
                final Throwable t;
                Label_0203: {
                    Label_0201: {
                        if (value != null) {
                            while (true) {
                                Label_0183: {
                                    while (true) {
                                        Label_0171: {
                                            try {
                                                final StringBuilder sb2 = new StringBuilder("app_id=");
                                                sb2.append(context.getPackageName());
                                                value.query(parse, (String[])null, sb2.toString(), (String[])null, (String)null);
                                                final int sdk_INT = Build$VERSION.SDK_INT;
                                                value.release();
                                                break Label_0203;
                                            }
                                            catch (RemoteException ex) {
                                                break Label_0171;
                                            }
                                            catch (DeadObjectException ex2) {
                                                break Label_0183;
                                            }
                                            Label_0189: {
                                                try {
                                                    AFLogger.afErrorLog("[Preinstall]: Error to get data from providerClient ", t, false);
                                                    final int sdk_INT2 = Build$VERSION.SDK_INT;
                                                    value.release();
                                                    break Label_0201;
                                                }
                                                finally {
                                                    break Label_0189;
                                                }
                                                break Label_0171;
                                            }
                                            final int sdk_INT3 = Build$VERSION.SDK_INT;
                                            value.release();
                                        }
                                        final String s = "[Preinstall]: Failed to query unstable content providerClient";
                                        AFLogger.afErrorLog(s, t, false);
                                        continue;
                                    }
                                }
                                final String s = "[Preinstall]: Failed to acquire unstable content providerClient";
                                continue;
                            }
                        }
                    }
                    t = null;
                }
                if (t != null) {
                    final int columnIndex = ((Cursor)t).getColumnIndex("transaction_id");
                    if (columnIndex == -1) {
                        AFLogger.afWarnLog("[Preinstall]: Wrong column name");
                        AFf1lSDK.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                    }
                    else {
                        AFf1lSDK.this.AFInAppEventParameterName.put("response", "OK");
                        if (((Cursor)t).moveToFirst()) {
                            final String string = ((Cursor)t).getString(columnIndex);
                            ((Cursor)t).close();
                            if (string != null && !string.isEmpty()) {
                                AFf1lSDK.this.AFInAppEventParameterName.put("referrer", string);
                            }
                        }
                    }
                    ((Cursor)t).close();
                }
                else {
                    AFLogger.afWarnLog("[Preinstall]: ContentProvider query failed, got null Cursor");
                    AFf1lSDK.this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                }
                final AFf1lSDK afInAppEventParameterName2 = AFf1lSDK.this;
                afInAppEventParameterName2.AFInAppEventParameterName.put("api_ver", AFa1fSDK.AFInAppEventType(context, ((PackageItemInfo)afInAppEventParameterName2.AFInAppEventType).packageName));
                final AFf1lSDK afInAppEventParameterName3 = AFf1lSDK.this;
                afInAppEventParameterName3.AFInAppEventParameterName.put("api_ver_name", AFa1fSDK.AFKeystoreWrapper(context, ((PackageItemInfo)afInAppEventParameterName3.AFInAppEventType).packageName));
                AFf1lSDK.this.values();
            }
        });
    }
}
