/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.B;

@Metadata
public final class FacebookInitProvider
extends ContentProvider {
    public static final a o = new a(null);
    public static final String p = FacebookInitProvider.class.getSimpleName();

    public int delete(Uri uri, String string2, String[] arrstring) {
        Intrinsics.checkNotNullParameter((Object)uri, "uri");
        return 0;
    }

    public String getType(Uri uri) {
        Intrinsics.checkNotNullParameter((Object)uri, "uri");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Intrinsics.checkNotNullParameter((Object)uri, "uri");
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean onCreate() {
        try {
            Context context = this.getContext();
            if (context == null) throw new IllegalArgumentException("Required value was null.".toString());
            B.M(context);
            return false;
        }
        catch (Exception exception) {}
        Log.i((String)p, (String)"Failed to auto initialize the Facebook SDK", (Throwable)exception);
        return false;
    }

    public Cursor query(Uri uri, String[] arrstring, String string2, String[] arrstring2, String string3) {
        Intrinsics.checkNotNullParameter((Object)uri, "uri");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String string2, String[] arrstring) {
        Intrinsics.checkNotNullParameter((Object)uri, "uri");
        return 0;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

