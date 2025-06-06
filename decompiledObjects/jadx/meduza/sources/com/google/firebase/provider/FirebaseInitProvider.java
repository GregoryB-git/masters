package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import u7.a;
import u7.f;

/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    public static a f3252a = new a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());

    /* renamed from: b, reason: collision with root package name */
    public static AtomicBoolean f3253b = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo == null) {
            throw new NullPointerException("FirebaseInitProvider ProviderInfo cannot be null.");
        }
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        try {
            f3253b.set(true);
            Log.i("FirebaseInitProvider", f.i(getContext()) == null ? "FirebaseApp initialization unsuccessful" : "FirebaseApp initialization successful");
            return false;
        } finally {
            f3253b.set(false);
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
