// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugins.firebase.messaging;

import android.database.Cursor;
import O5.a;
import android.content.ContentValues;
import android.net.Uri;
import android.content.pm.ProviderInfo;
import android.content.Context;
import android.content.ContentProvider;

public class FlutterFirebaseMessagingInitProvider extends ContentProvider
{
    public void attachInfo(final Context context, final ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
    }
    
    public int delete(final Uri uri, final String s, final String[] array) {
        return 0;
    }
    
    public String getType(final Uri uri) {
        return null;
    }
    
    public Uri insert(final Uri uri, final ContentValues contentValues) {
        return null;
    }
    
    public boolean onCreate() {
        if (a.a() == null) {
            final Context context = this.getContext();
            Context applicationContext;
            if ((applicationContext = context) != null) {
                applicationContext = context;
                if (context.getApplicationContext() != null) {
                    applicationContext = context.getApplicationContext();
                }
            }
            a.b(applicationContext);
        }
        return false;
    }
    
    public Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        return null;
    }
    
    public int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        return 0;
    }
}
