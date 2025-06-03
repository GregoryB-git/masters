// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.facebook.internal;

import android.database.Cursor;
import android.content.Context;
import android.util.Log;
import x1.B;
import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;
import android.net.Uri;
import kotlin.jvm.internal.g;
import kotlin.Metadata;
import android.content.ContentProvider;

@Metadata
public final class FacebookInitProvider extends ContentProvider
{
    public static final a o;
    public static final String p;
    
    static {
        o = new a(null);
        p = FacebookInitProvider.class.getSimpleName();
    }
    
    public int delete(final Uri uri, final String s, final String[] array) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
    
    public String getType(final Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }
    
    public Uri insert(final Uri uri, final ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }
    
    public boolean onCreate() {
        while (true) {
            try {
                final Context context = this.getContext();
                if (context != null) {
                    B.M(context);
                    return false;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
                final Exception ex;
                Log.i(FacebookInitProvider.p, "Failed to auto initialize the Facebook SDK", (Throwable)ex);
                return false;
            }
            catch (Exception ex2) {}
            final Exception ex2;
            final Exception ex = ex2;
            continue;
        }
    }
    
    public Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }
    
    public int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
    
    public static final class a
    {
    }
}
