/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteException
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.util.Log
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package com.google.android.gms.internal.measurement;

import W2.m;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.D2;
import com.google.android.gms.internal.measurement.E2;
import com.google.android.gms.internal.measurement.H2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.a;

public final class B2
implements E2 {
    public static final Map h = new a();
    public static final String[] i = new String[]{"key", "value"};
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public final ContentObserver d;
    public final Object e;
    public volatile Map f;
    public final List g;

    public B2(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        D2 d22 = new D2(this, null);
        this.d = d22;
        this.e = new Object();
        this.g = new ArrayList();
        m.j((Object)contentResolver);
        m.j((Object)uri);
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
        contentResolver.registerContentObserver(uri, false, (ContentObserver)d22);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static B2 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        B2 b23;
        // MONITORENTER : com.google.android.gms.internal.measurement.B2.class
        Map map = h;
        B2 b22 = b23 = (B2)map.get((Object)uri);
        if (b23 != null) {
            // MONITOREXIT : com.google.android.gms.internal.measurement.B2.class
            return b22;
        }
        b22 = new B2(contentResolver, uri, runnable);
        map.put((Object)uri, (Object)b22);
        return b22;
        catch (SecurityException securityException) {
            return b23;
        }
        catch (SecurityException securityException) {
            return b22;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d() {
        synchronized (B2.class) {
            try {
                for (B2 b22 : h.values()) {
                    b22.a.unregisterContentObserver(b22.d);
                }
                h.clear();
            }
            catch (Throwable throwable) {}
            return;
            throw throwable;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Map b() {
        Map map;
        Map map2 = map = this.f;
        if (map == null) {
            Object object = this.e;
            // MONITORENTER : object
            map2 = map = this.f;
            if (map == null) {
                this.f = map2 = this.f();
            }
            // MONITOREXIT : object
        }
        if (map2 == null) return Collections.emptyMap();
        return map2;
        catch (Throwable throwable) {
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ Map c() {
        Throwable throwable2;
        Cursor cursor;
        block9 : {
            a a8;
            block7 : {
                int n8;
                block8 : {
                    block6 : {
                        Map map;
                        cursor = this.a.query(this.b, i, null, null, null);
                        if (cursor == null) {
                            return Collections.emptyMap();
                        }
                        try {
                            n8 = cursor.getCount();
                            if (n8 != 0) break block6;
                            map = Collections.emptyMap();
                        }
                        catch (Throwable throwable2) {}
                        cursor.close();
                        return map;
                    }
                    if (n8 <= 256) {
                        a8 = new a(n8);
                        break block7;
                    }
                    break block8;
                    break block9;
                }
                a8 = new HashMap(n8, 1.0f);
            }
            while (cursor.moveToNext()) {
                a8.put((Object)cursor.getString(0), (Object)cursor.getString(1));
            }
            cursor.close();
            return a8;
        }
        cursor.close();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        Object object = this.e;
        synchronized (object) {
            this.f = null;
            this.c.run();
        }
        synchronized (this) {
            try {
                object = this.g.iterator();
                if (!object.hasNext()) {
                    return;
                }
                android.support.v4.media.a.a(object.next());
                throw null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Map f() {
        Map map;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
        try {
            map = (Map)H2.a(new A2(this));
        }
        catch (Throwable throwable) {}
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        return map;
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable;
        catch (SQLiteException | IllegalStateException | SecurityException illegalStateException) {}
        {
            Log.e((String)"ConfigurationContentLdr", (String)"PhenotypeFlag unable to load ContentProvider, using default values");
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        return null;
    }

    @Override
    public final /* synthetic */ Object i(String string2) {
        return (String)this.b().get((Object)string2);
    }
}

