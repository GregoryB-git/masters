// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.database.Cursor;
import android.content.ContentResolver;
import android.net.Uri;
import android.content.Context;

final class AFa1dSDK extends AFb1hSDK<String>
{
    public AFa1dSDK(final Context context, final AFc1xSDK aFc1xSDK) {
        super(context, aFc1xSDK, "com.facebook.katana.provider.AttributionIdProvider", new String[] { "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1" });
    }
    
    private String AFInAppEventParameterName() {
        Cursor cursor = null;
        Label_0106: {
            try {
                final ContentResolver contentResolver = super.AFInAppEventParameterName.getContentResolver();
                final StringBuilder sb = new StringBuilder("content://");
                sb.append(super.AFKeystoreWrapper);
                final Cursor query = contentResolver.query(Uri.parse(sb.toString()), new String[] { "aid" }, (String)null, (String[])null, (String)null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            final String string = query.getString(query.getColumnIndexOrThrow("aid"));
                            query.close();
                            return string;
                        }
                    }
                    finally {
                        break Label_0106;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            }
            finally {
                cursor = null;
            }
        }
        if (cursor != null) {
            cursor.close();
        }
    }
    
    public final String AFInAppEventType() {
        super.AFInAppEventType.AFInAppEventType().execute(super.values);
        return super.valueOf();
    }
}
