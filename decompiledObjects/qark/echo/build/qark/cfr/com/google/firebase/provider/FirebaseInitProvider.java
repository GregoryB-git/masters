/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.net.Uri
 *  android.util.Log
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import s3.e;
import s3.n;

public class FirebaseInitProvider
extends ContentProvider {
    public static n o = n.e();
    public static AtomicBoolean p = new AtomicBoolean(false);

    public static void a(ProviderInfo providerInfo) {
        A2.n.j((Object)providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (!"com.google.firebase.firebaseinitprovider".equals((Object)providerInfo.authority)) {
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }

    public static n b() {
        return o;
    }

    public static boolean c() {
        return p.get();
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        FirebaseInitProvider.a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String string2, String[] arrstring) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean onCreate() {
        try {
            p.set(true);
            Object object = e.u(this.getContext());
            object = object == null ? "FirebaseApp initialization unsuccessful" : "FirebaseApp initialization successful";
            Log.i((String)"FirebaseInitProvider", (String)object);
        }
        catch (Throwable throwable) {}
        p.set(false);
        return false;
        p.set(false);
        throw throwable;
    }

    public Cursor query(Uri uri, String[] arrstring, String string2, String[] arrstring2, String string3) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String string2, String[] arrstring) {
        return 0;
    }
}

