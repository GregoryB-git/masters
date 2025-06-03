/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package I3;

import E3.f;
import H3.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class b {
    public final Map a = new HashMap();
    public final int b;
    public final int c;

    public b(int n8, int n9) {
        this.b = n8;
        this.c = n9;
    }

    public static String c(String string2, int n8) {
        String string3 = string2;
        if (string2 != null) {
            string3 = string2 = string2.trim();
            if (string2.length() > n8) {
                string3 = string2.substring(0, n8);
            }
        }
        return string3;
    }

    public Map a() {
        synchronized (this) {
            Map map = Collections.unmodifiableMap((Map)new HashMap(this.a));
            return map;
        }
    }

    public final String b(String string2) {
        if (string2 != null) {
            return b.c(string2, this.c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean d(String string2, String object) {
        synchronized (this) {
            String string3;
            Throwable throwable2;
            block6 : {
                try {
                    string3 = this.b(string2);
                    if (this.a.size() >= this.b && !this.a.containsKey((Object)string3)) {
                        object = f.f();
                        string3 = new StringBuilder();
                        string3.append("Ignored entry \"");
                        string3.append(string2);
                        string3.append("\" when adding custom keys. Maximum allowable: ");
                        string3.append(this.b);
                        object.k(string3.toString());
                        return false;
                    }
                    string2 = b.c((String)object, this.c);
                    boolean bl = i.z((String)this.a.get((Object)string3), string2);
                    if (!bl) break block6;
                }
                catch (Throwable throwable2) {}
                return false;
            }
            Map map = this.a;
            if (object == null) {
                string2 = "";
            }
            map.put((Object)string3, (Object)string2);
            return true;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(Map object) {
        synchronized (this) {
            int n8;
            Iterator iterator;
            block8 : {
                try {
                    iterator = object.entrySet().iterator();
                    n8 = 0;
                    break block8;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            do {
                if (iterator.hasNext()) {
                    object = (Map.Entry)iterator.next();
                    String string2 = this.b((String)object.getKey());
                    if (this.a.size() < this.b || this.a.containsKey((Object)string2)) {
                        object = (String)object.getValue();
                        Map map = this.a;
                        object = object == null ? "" : b.c((String)object, this.c);
                        map.put((Object)string2, object);
                        continue;
                    }
                } else {
                    if (n8 > 0) {
                        object = f.f();
                        iterator = new StringBuilder();
                        iterator.append("Ignored ");
                        iterator.append(n8);
                        iterator.append(" entries when adding custom keys. Maximum allowable: ");
                        iterator.append(this.b);
                        object.k(iterator.toString());
                    }
                    return;
                }
                ++n8;
            } while (true);
        }
    }
}

