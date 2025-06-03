/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.sqlite.SQLiteDatabase
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.io.Closeable
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.J7;
import com.yandex.metrica.impl.ob.N7;
import com.yandex.metrica.impl.ob.b8;
import com.yandex.metrica.impl.ob.d8;
import com.yandex.metrica.impl.ob.ym;
import com.yandex.metrica.impl.ob.zm;
import java.io.Closeable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

class ea
implements N7,
Closeable {
    private final Map<String, Object> a = new HashMap();
    private final Map<String, Object> b = new HashMap();
    private final String c;
    private final a d;
    private volatile boolean e;
    private final b8 f;

    public ea(J7 j72, String string) {
        this(string, new d8(j72));
    }

    public ea(String object, b8 b82) {
        this.f = b82;
        this.c = object;
        this.d = object = new ym(this, String.format((Locale)Locale.US, (String)"YMM-DW-%s", (Object[])new Object[]{zm.c()})){
            public final ea b;
            {
                this.b = ea2;
                super(string);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                Map map;
                Map map2 = map = this.b.a;
                synchronized (map2) {
                    ea.b(this.b);
                    ea.a(this.b, true);
                    this.b.a.notifyAll();
                }
                while (this.isRunning()) {
                    HashMap hashMap;
                    a a2 = this;
                    synchronized (a2) {
                        int n2 = this.b.b.size();
                        if (n2 == 0) {
                            try {
                                this.wait();
                            }
                            catch (InterruptedException interruptedException) {}
                        }
                        hashMap = new HashMap(this.b.b);
                        this.b.b.clear();
                        if (hashMap.size() <= 0) continue;
                    }
                    ea.a(this.b, (Map)hashMap);
                    hashMap.clear();
                }
                return;
            }
        };
        object.start();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(ea ea2, Map object) {
        Object object2;
        block21: {
            ea2.getClass();
            int n2 = object.size();
            ContentValues[] contentValuesArray = new ContentValues[n2];
            Object object3 = object.entrySet().iterator();
            int n3 = 0;
            while (object3.hasNext()) {
                Object object4 = (Map.Entry)object3.next();
                object2 = new ContentValues();
                object = (String)object4.getKey();
                object4 = object4.getValue();
                object2.put("key", (String)object);
                if (object4 == ea2) {
                    object2.putNull("value");
                } else if (object4 instanceof String) {
                    object2.put("value", (String)object4);
                    object2.put("type", Integer.valueOf((int)4));
                } else if (object4 instanceof Long) {
                    object2.put("value", (Long)object4);
                    object2.put("type", Integer.valueOf((int)3));
                } else if (object4 instanceof Integer) {
                    object2.put("value", (Integer)object4);
                    object2.put("type", Integer.valueOf((int)2));
                } else if (object4 instanceof Boolean) {
                    object2.put("value", String.valueOf((boolean)((Boolean)object4)));
                    object2.put("type", Integer.valueOf((int)1));
                } else if (object4 instanceof Float) {
                    object2.put("value", (Float)object4);
                    object2.put("type", Integer.valueOf((int)5));
                }
                contentValuesArray[n3] = object2;
                ++n3;
            }
            object2 = null;
            try {
                object = ea2.f.a();
                object2 = object;
                if (object == null) break block21;
            }
            catch (Throwable throwable) {
                object = object2;
            }
            object.beginTransaction();
            for (n3 = 0; n3 < n2; ++n3) {
                object2 = contentValuesArray[n3];
                if (object2.getAsString("value") == null) {
                    object3 = object2.getAsString("key");
                    object2 = ea2.c;
                    object.delete((String)object2, "key = ?", new String[]{object3});
                    continue;
                }
                object.insertWithOnConflict(ea2.c, null, object2, 5);
                continue;
            }
            try {
                object.setTransactionSuccessful();
            }
            catch (Throwable throwable) {}
            finally {
                object2 = object;
            }
        }
        A2.a((SQLiteDatabase)object2);
        ea2.f.a((SQLiteDatabase)object2);
    }

    public static /* synthetic */ boolean a(ea ea2, boolean bl2) {
        ea2.e = bl2;
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(ea var0) {
        block10: {
            var0.getClass();
            var6_1 /* !! */  = null;
            var5_2 = var0.f.a();
            var4_3 = var6_1 /* !! */ ;
            var3_4 = var5_2;
            if (var5_2 == null) ** GOTO lbl58
            try {
                var4_3 = var5_2.query(var0.c, new String[]{"key", "value", "type"}, null, null, null, null, null);
            }
            catch (Throwable var3_6) {
                var4_3 = var6_1 /* !! */ ;
                var3_4 = var5_2;
                break block10;
            }
            ** try [egrp 2[TRYBLOCK] [2 : 66->262)] { 
lbl16:
            // 1 sources

            ** GOTO lbl-1000
            catch (Throwable var3_5) {
                var3_4 = null;
                var4_3 = var6_1 /* !! */ ;
            }
            break block10;
lbl-1000:
            // 4 sources

            {
                block8: while (var4_3.moveToNext()) {
                    block12: {
                        block13: {
                            block11: {
                                var7_11 = var4_3.getString(var4_3.getColumnIndexOrThrow("key"));
                                var6_1 /* !! */  = var4_3.getString(var4_3.getColumnIndexOrThrow("value"));
                                var1_9 = var4_3.getInt(var4_3.getColumnIndexOrThrow("type"));
                                var2_10 = TextUtils.isEmpty((CharSequence)var7_11);
                                if (var2_10) continue;
                                if (var1_9 == 1) break block11;
                                if (var1_9 == 2) ** GOTO lbl38
                                if (var1_9 == 3) ** GOTO lbl36
                                var3_4 = var6_1 /* !! */ ;
                                if (var1_9 == 4) ** GOTO lbl51
                                if (var1_9 != 5) break block12;
                                var3_4 = Float.valueOf((float)Float.parseFloat((String)var6_1 /* !! */ ));
                                ** GOTO lbl51
lbl36:
                                // 1 sources

                                var3_4 = Long.valueOf((long)Long.parseLong((String)var6_1 /* !! */ ));
                                ** GOTO lbl51
lbl38:
                                // 1 sources

                                var3_4 = Integer.valueOf((int)Integer.parseInt((String)var6_1 /* !! */ ));
                                ** GOTO lbl51
                            }
                            if (!"true".equals((Object)var6_1 /* !! */ )) break block13;
                            var3_4 = Boolean.TRUE;
                            ** GOTO lbl51
                        }
                        if (!"false".equals((Object)var6_1 /* !! */ )) break block12;
                        var3_4 = Boolean.FALSE;
                        ** GOTO lbl51
                    }
lbl49:
                    // 2 sources

                    while (true) {
                        var3_4 = null;
lbl51:
                        // 7 sources

                        if (var3_4 == null) continue block8;
                        var0.a.put((Object)var7_11, (Object)var3_4);
                        continue block8;
                        break;
                    }
                }
            }
lbl56:
            // 1 sources

            catch (Throwable var3_7) {}
            var3_4 = var5_2;
        }
        A2.a(var4_3);
        var0.f.a(var3_4);
        return;
        catch (NumberFormatException var3_8) {
            ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Object c(String object) {
        Map<String, Object> map;
        Map<String, Object> map2 = map = this.a;
        synchronized (map2) {
            this.c();
            return this.a.get(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c() {
        if (this.e) return;
        try {
            this.a.wait();
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    @Override
    public int a(String object, int n2) {
        if ((object = this.c((String)object)) instanceof Integer) {
            return (Integer)object;
        }
        return n2;
    }

    @Override
    public long a(String object, long l2) {
        if ((object = this.c((String)object)) instanceof Long) {
            return (Long)object;
        }
        return l2;
    }

    @Override
    public N7 a(String string, String string2) {
        ea ea2 = this;
        synchronized (ea2) {
            this.a(string, (Object)string2);
            return this;
        }
    }

    @Override
    public N7 a(String string, boolean bl2) {
        this.a(string, (Object)bl2);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public Set<String> a() {
        Map<String, Object> map;
        Map<String, Object> map2 = map = this.a;
        synchronized (map2) {
            return new HashSet((Collection)this.a.keySet());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @VisibleForTesting
    public void a(String string, Object object) {
        Object object2;
        Map<String, Object> map = object2 = this.a;
        synchronized (map) {
            this.c();
            this.a.put((Object)string, object);
        }
        map = object2 = this.d;
        synchronized (map) {
            this.b.put((Object)string, object);
            this.d.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean a(@NonNull String string) {
        Map<String, Object> map;
        Map<String, Object> map2 = map = this.a;
        synchronized (map2) {
            this.c();
            return this.a.containsKey((Object)string);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public N7 b(String string) {
        Object object;
        Map<String, Object> map = object = this.a;
        synchronized (map) {
            this.c();
            this.a.remove((Object)string);
        }
        map = object = this.d;
        synchronized (map) {
            this.b.put((Object)string, (Object)this);
            this.d.notifyAll();
            return this;
        }
    }

    @Override
    public N7 b(String string, int n2) {
        ea ea2 = this;
        synchronized (ea2) {
            this.a(string, (Object)n2);
            return this;
        }
    }

    @Override
    public N7 b(String string, long l2) {
        this.a(string, (Object)l2);
        return this;
    }

    @Override
    @Nullable
    public String b(String object, String string) {
        if ((object = this.c((String)object)) instanceof String) {
            return (String)object;
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() {
        a a2;
        a a3 = a2 = this.d;
        synchronized (a3) {
            this.d.notifyAll();
            return;
        }
    }

    @Override
    public boolean b(String object, boolean bl2) {
        if ((object = this.c((String)object)) instanceof Boolean) {
            return (Boolean)object;
        }
        return bl2;
    }

    @VisibleForTesting
    public void close() {
        if (this.d.isRunning()) {
            this.d.stopRunning();
        }
    }
}

