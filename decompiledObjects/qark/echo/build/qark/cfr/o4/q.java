/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package o4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o4.k;
import o4.l;
import o4.m;
import o4.n;
import o4.o;
import o4.p;
import o4.r;

public class q {
    public final SharedPreferences a;

    public q(Context context, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FirebaseHeartBeat");
        stringBuilder.append(string2);
        this.a = context.getSharedPreferences(stringBuilder.toString(), 0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a() {
        // MONITORENTER : this
        var1_1 = this.a.getLong("fire-count", 0L);
        var5_2 = "";
        var7_3 = this.a.getAll().entrySet().iterator();
        var3_4 = null;
        block3 : do lbl-1000: // 3 sources:
        {
            if (!var7_3.hasNext()) {
                var4_6 = new HashSet((Collection)this.a.getStringSet((String)var5_2, (Set)new HashSet()));
                var4_6.remove((Object)var3_4);
                this.a.edit().putStringSet((String)var5_2, (Set)var4_6).putLong("fire-count", var1_1 - 1L).commit();
                // MONITOREXIT : this
                return;
            }
            var8_8 = (Map.Entry)var7_3.next();
            if (!(var8_8.getValue() instanceof Set)) ** GOTO lbl-1000
            var9_9 = ((Set)var8_8.getValue()).iterator();
            var6_7 = var3_4;
            var4_6 = var5_2;
            do {
                var5_2 = var4_6;
                var3_4 = var6_7;
                if (!var9_9.hasNext()) continue block3;
                var3_4 = (String)var9_9.next();
                if (var6_7 != null && var6_7.compareTo(var3_4) <= 0) continue;
                var4_6 = (String)var8_8.getKey();
                var6_7 = var3_4;
            } while (true);
            break;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        synchronized (this) {
            try {
                SharedPreferences.Editor editor = this.a.edit();
                Iterator iterator = this.a.getAll().entrySet().iterator();
                int n8 = 0;
                while (iterator.hasNext()) {
                    Object object = (Map.Entry)iterator.next();
                    if (!(object.getValue() instanceof Set)) continue;
                    Set set = (Set)object.getValue();
                    String string2 = this.d(System.currentTimeMillis());
                    object = (String)object.getKey();
                    if (set.contains((Object)string2)) {
                        set = new HashSet();
                        set.add((Object)string2);
                        ++n8;
                        editor.putStringSet((String)object, set);
                        continue;
                    }
                    editor.remove((String)object);
                }
                editor.remove("fire-count");
                editor.commit();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List c() {
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator iterator = this.a.getAll().entrySet().iterator();
                do {
                    if (!iterator.hasNext()) {
                        this.l(System.currentTimeMillis());
                        return arrayList;
                    }
                    Map.Entry entry = (Map.Entry)iterator.next();
                    if (!(entry.getValue() instanceof Set)) continue;
                    HashSet hashSet = new HashSet((Collection)((Set)entry.getValue()));
                    hashSet.remove((Object)this.d(System.currentTimeMillis()));
                    if (hashSet.isEmpty()) continue;
                    arrayList.add((Object)r.a((String)entry.getKey(), (List)new ArrayList((Collection)hashSet)));
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String d(long l8) {
        synchronized (this) {
            try {
                if (Build.VERSION.SDK_INT < 26) return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(l8));
                return p.a(n.a(m.a(k.a(new Date(l8)), l.a())), o.a());
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final String e(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5 : {
                try {
                    for (Map.Entry entry : this.a.getAll().entrySet()) {
                        if (!(entry.getValue() instanceof Set)) continue;
                        Iterator iterator = ((Set)entry.getValue()).iterator();
                        while (iterator.hasNext()) {
                            if (!string2.equals((Object)((String)iterator.next()))) continue;
                            string2 = (String)entry.getKey();
                            return string2;
                        }
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return null;
            }
            throw throwable2;
        }
    }

    public boolean f(long l8, long l9) {
        synchronized (this) {
            boolean bl = this.d(l8).equals((Object)this.d(l9));
            return bl;
        }
    }

    public void g() {
        synchronized (this) {
            String string2 = this.d(System.currentTimeMillis());
            this.a.edit().putString("last-used-date", string2).commit();
            this.h(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(String string2) {
        synchronized (this) {
            Throwable throwable2;
            String string3;
            block4 : {
                try {
                    string3 = this.e(string2);
                    if (string3 != null) break block4;
                }
                catch (Throwable throwable2) {}
                return;
            }
            HashSet hashSet = new HashSet((Collection)this.a.getStringSet(string3, (Set)new HashSet()));
            hashSet.remove((Object)string2);
            string2 = hashSet.isEmpty() ? this.a.edit().remove(string3) : this.a.edit().putStringSet(string3, (Set)hashSet);
            string2.commit();
            return;
            throw throwable2;
        }
    }

    public boolean i(long l8) {
        synchronized (this) {
            boolean bl = this.j("fire-global", l8);
            return bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean j(String string2, long l8) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                block5 : {
                    try {
                        if (!this.a.contains(string2)) break block4;
                        if (this.f(this.a.getLong(string2, -1L), l8)) break block5;
                        this.a.edit().putLong(string2, l8).commit();
                        return true;
                    }
                    catch (Throwable throwable2) {}
                }
                return false;
            }
            this.a.edit().putLong(string2, l8).commit();
            return true;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void k(long l8, String string2) {
        synchronized (this) {
            Throwable throwable2;
            block9 : {
                long l9;
                String string3;
                block6 : {
                    block8 : {
                        String string4;
                        block7 : {
                            try {
                                string3 = this.d(l8);
                                if (!this.a.getString("last-used-date", "").equals((Object)string3)) break block6;
                                string4 = this.e(string3);
                                if (string4 != null) break block7;
                            }
                            catch (Throwable throwable2) {}
                            return;
                        }
                        boolean bl = string4.equals((Object)string2);
                        if (!bl) break block8;
                        return;
                    }
                    this.m(string2, string3);
                    return;
                    break block9;
                }
                l8 = l9 = this.a.getLong("fire-count", 0L);
                if (l9 + 1L == 30L) {
                    this.a();
                    l8 = this.a.getLong("fire-count", 0L);
                }
                HashSet hashSet = new HashSet((Collection)this.a.getStringSet(string2, (Set)new HashSet()));
                hashSet.add((Object)string3);
                this.a.edit().putStringSet(string2, (Set)hashSet).putLong("fire-count", l8 + 1L).putString("last-used-date", string3).commit();
                return;
            }
            throw throwable2;
        }
    }

    public void l(long l8) {
        synchronized (this) {
            this.a.edit().putLong("fire-global", l8).commit();
            return;
        }
    }

    public final void m(String string2, String string3) {
        synchronized (this) {
            this.h(string3);
            HashSet hashSet = new HashSet((Collection)this.a.getStringSet(string2, (Set)new HashSet()));
            hashSet.add((Object)string3);
            this.a.edit().putStringSet(string2, (Set)hashSet).commit();
            return;
        }
    }
}

