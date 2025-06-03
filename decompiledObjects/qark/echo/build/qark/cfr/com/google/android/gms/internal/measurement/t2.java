/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.regex.Pattern
 */
package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.measurement.v2;
import com.google.android.gms.internal.measurement.w2;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public abstract class t2 {
    public static final Uri a = Uri.parse((String)"content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse((String)"content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile((String)"^(1|true|t|on|yes|y)$", (int)2);
    public static final Pattern d = Pattern.compile((String)"^(0|false|f|off|no|n)$", (int)2);
    public static final AtomicBoolean e = new AtomicBoolean();
    public static ContentResolver f = null;
    public static HashMap g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static Object l;
    public static boolean m;
    public static String[] n;

    static {
        h = new HashMap(16, 1.0f);
        i = new HashMap(16, 1.0f);
        j = new HashMap(16, 1.0f);
        k = new HashMap(16, 1.0f);
        n = new String[0];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static String a(ContentResolver object, String string2, String string3) {
        // MONITORENTER : com.google.android.gms.internal.measurement.t2.class
        Object object2 = g;
        int n8 = 0;
        string3 = null;
        Set set = null;
        if (object2 == null) {
            e.set(false);
            g = new HashMap(16, 1.0f);
            l = new Object();
            m = false;
            object.registerContentObserver(a, true, (ContentObserver)new w2(null));
        } else if (e.getAndSet(false)) {
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            k.clear();
            l = new Object();
            m = false;
        }
        object2 = l;
        if (g.containsKey((Object)string2)) {
            string2 = (String)g.get((Object)string2);
            object = set;
            if (string2 != null) {
                object = string2;
            }
            // MONITOREXIT : com.google.android.gms.internal.measurement.t2.class
            return object;
        }
        set = n;
        int n9 = set.length;
        do {
            block28 : {
                Throwable throwable2;
                block29 : {
                    block26 : {
                        block25 : {
                            block27 : {
                                if (n8 >= n9) break block27;
                                if (string2.startsWith(set[n8])) {
                                    if (!m) {
                                        if ((object = (HashMap)t2.b((ContentResolver)object, n, new v2())) != null) {
                                            if (!object.isEmpty()) {
                                                set = object.keySet();
                                                set.removeAll((Collection)h.keySet());
                                                set.removeAll((Collection)i.keySet());
                                                set.removeAll((Collection)j.keySet());
                                                set.removeAll((Collection)k.keySet());
                                            }
                                            if (!object.isEmpty()) {
                                                if (g.isEmpty()) {
                                                    g = object;
                                                } else {
                                                    g.putAll((Map)object);
                                                }
                                            }
                                            m = true;
                                        }
                                        if (g.containsKey((Object)string2)) {
                                            string2 = (String)g.get((Object)string2);
                                            object = string3;
                                            if (string2 != null) {
                                                object = string2;
                                            }
                                            // MONITOREXIT : com.google.android.gms.internal.measurement.t2.class
                                            return object;
                                        }
                                    }
                                    // MONITOREXIT : com.google.android.gms.internal.measurement.t2.class
                                    return null;
                                }
                                break block28;
                            }
                            // MONITOREXIT : com.google.android.gms.internal.measurement.t2.class
                            object = object.query(a, null, null, new String[]{string2}, null);
                            if (object == null) {
                                if (object == null) return null;
                                object.close();
                                return null;
                            }
                            try {
                                if (object.moveToFirst()) break block25;
                                t2.d(object2, string2, null);
                            }
                            catch (Throwable throwable2) {}
                            object.close();
                            return null;
                        }
                        string3 = object.getString(1);
                        break block26;
                        break block29;
                    }
                    object.close();
                    object = string3;
                    if (string3 != null) {
                        object = string3;
                        if (string3.equals((Object)null)) {
                            object = null;
                        }
                    }
                    t2.d(object2, string2, (String)object);
                    if (object == null) return null;
                    return object;
                }
                object.close();
                throw throwable2;
            }
            ++n8;
        } while (true);
    }

    public static Map b(ContentResolver contentResolver, String[] map, a a8) {
        Throwable throwable2;
        block4 : {
            if ((contentResolver = contentResolver.query(b, null, null, (String[])map, null)) == null) {
                return null;
            }
            map = a8.e(contentResolver.getCount());
            try {
                while (contentResolver.moveToNext()) {
                    map.put((Object)contentResolver.getString(0), (Object)contentResolver.getString(1));
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            contentResolver.close();
            return map;
        }
        contentResolver.close();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(Object object, String string2, String string3) {
        synchronized (t2.class) {
            try {
                if (object == l) {
                    g.put((Object)string2, (Object)string3);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static interface a {
        public Map e(int var1);
    }

}

