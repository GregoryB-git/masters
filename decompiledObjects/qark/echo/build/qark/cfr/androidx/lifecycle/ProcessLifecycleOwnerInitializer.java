/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 *  java.lang.String
 */
package androidx.lifecycle;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.lifecycle.e;
import androidx.lifecycle.o;

public class ProcessLifecycleOwnerInitializer
extends ContentProvider {
    public int delete(Uri uri, String string2, String[] arrstring) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        e.a(this.getContext());
        o.l(this.getContext());
        return true;
    }

    public Cursor query(Uri uri, String[] arrstring, String string2, String[] arrstring2, String string3) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String string2, String[] arrstring) {
        return 0;
    }
}

