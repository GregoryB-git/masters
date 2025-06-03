// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.provider;

import android.database.Cursor;
import android.util.Log;
import s3.e;
import android.content.ContentValues;
import android.net.Uri;
import android.content.Context;
import android.content.pm.ProviderInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import s3.n;
import android.content.ContentProvider;

public class FirebaseInitProvider extends ContentProvider
{
    public static n o;
    public static AtomicBoolean p;
    
    static {
        FirebaseInitProvider.o = n.e();
        FirebaseInitProvider.p = new AtomicBoolean(false);
    }
    
    public static void a(final ProviderInfo providerInfo) {
        A2.n.j(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }
    
    public static n b() {
        return FirebaseInitProvider.o;
    }
    
    public static boolean c() {
        return FirebaseInitProvider.p.get();
    }
    
    public void attachInfo(final Context context, final ProviderInfo providerInfo) {
        a(providerInfo);
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
        while (true) {
            try {
                FirebaseInitProvider.p.set(true);
                String s;
                if (e.u(this.getContext()) == null) {
                    s = "FirebaseApp initialization unsuccessful";
                }
                else {
                    s = "FirebaseApp initialization successful";
                }
                Log.i("FirebaseInitProvider", s);
                FirebaseInitProvider.p.set(false);
                return false;
                FirebaseInitProvider.p.set(false);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        return null;
    }
    
    public int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        return 0;
    }
}
