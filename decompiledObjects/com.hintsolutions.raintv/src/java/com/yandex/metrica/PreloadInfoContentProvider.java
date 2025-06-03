/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.UriMatcher
 *  android.database.Cursor
 *  android.net.Uri
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.E0
 *  com.yandex.metrica.impl.ob.Qd
 *  com.yandex.metrica.impl.ob.Rd
 *  com.yandex.metrica.impl.ob.W
 *  com.yandex.metrica.impl.ob.X
 *  com.yandex.metrica.impl.ob.Y
 *  com.yandex.metrica.impl.ob.Z
 *  com.yandex.metrica.impl.ob.h2
 *  com.yandex.metrica.impl.ob.t3
 *  com.yandex.metrica.impl.ob.u3
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.E0;
import com.yandex.metrica.impl.ob.Qd;
import com.yandex.metrica.impl.ob.Rd;
import com.yandex.metrica.impl.ob.W;
import com.yandex.metrica.impl.ob.X;
import com.yandex.metrica.impl.ob.Y;
import com.yandex.metrica.impl.ob.Z;
import com.yandex.metrica.impl.ob.h2;
import com.yandex.metrica.impl.ob.t3;
import com.yandex.metrica.impl.ob.u3;

public class PreloadInfoContentProvider
extends ContentProvider {
    private boolean a = false;
    private final UriMatcher b = new UriMatcher(-1);

    public int delete(@NonNull Uri uri, @Nullable String string2, @Nullable String[] stringArray) {
        h2.b((String)"Deleting is not supported", (Object[])new Object[0]);
        return -1;
    }

    public void disable() {
        PreloadInfoContentProvider preloadInfoContentProvider = this;
        synchronized (preloadInfoContentProvider) {
            this.a = true;
            return;
        }
    }

    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public Uri insert(@NonNull Uri object, @Nullable ContentValues contentValues) {
        block8: {
            block9: {
                PreloadInfoContentProvider preloadInfoContentProvider = this;
                synchronized (preloadInfoContentProvider) {
                    if (this.a) {
                        return null;
                    }
                    if (contentValues == null) break block8;
                }
                int n = this.b.match(object);
                if (n == 1) break block9;
                if (n != 2) {
                    h2.b((String)"Bad content provider uri: %s", (Object[])new Object[]{object});
                    break block8;
                } else {
                    Z z = new Z((W)new t3(), (X)new u3(), new E0(), "clids");
                    object = this.getContext();
                    object = object == null ? null : object.getApplicationContext();
                    if (object != null) {
                        z.a((Context)object, contentValues);
                    }
                }
                break block8;
            }
            Z z = new Z((W)new Qd(), (X)new Rd(), new E0(), "preload info");
            object = this.getContext();
            object = object == null ? null : object.getApplicationContext();
            if (object != null) {
                z.a((Context)object, contentValues);
            }
        }
        Y.a();
        return null;
    }

    public boolean onCreate() {
        Object object = this.getContext();
        object = object == null ? null : object.getApplicationContext();
        object = object != null ? object.getPackageName() : "";
        object = z2.o((String)object, ".appmetrica.preloadinfo.retail");
        this.b.addURI((String)object, "preloadinfo", 1);
        this.b.addURI((String)object, "clids", 2);
        Y.a((PreloadInfoContentProvider)this);
        return true;
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] stringArray, @Nullable String string2, @Nullable String[] stringArray2, @Nullable String string3) {
        h2.b((String)"Query is not supported", (Object[])new Object[0]);
        return null;
    }

    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String string2, @Nullable String[] stringArray) {
        h2.b((String)"Updating is not supported", (Object[])new Object[0]);
        return -1;
    }
}

