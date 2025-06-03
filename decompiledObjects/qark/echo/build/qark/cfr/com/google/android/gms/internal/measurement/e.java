/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package com.google.android.gms.internal.measurement;

import X2.y;
import java.util.HashMap;
import java.util.Map;

public final class e {
    public static final y d = y.a0("_syn", "_err", "_el");
    public String a;
    public long b;
    public Map c;

    public e(String string2, long l8, Map map) {
        this.a = string2;
        this.b = l8;
        string2 = new HashMap();
        this.c = string2;
        if (map != null) {
            string2.putAll(map);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Object c(String string2, Object object, Object object2) {
        if (d.contains(string2) && object2 instanceof Double) {
            return Math.round((double)((Double)object2));
        }
        if (string2.startsWith("_")) {
            if (object instanceof String) {
                return object2;
            }
            if (object == null) return object2;
            return object;
        }
        if (object instanceof Double) {
            return object2;
        }
        if (object instanceof Long) {
            return Math.round((double)((Double)object2));
        }
        if (!(object instanceof String)) return object2;
        return object2.toString();
    }

    public final long a() {
        return this.b;
    }

    public final Object b(String string2) {
        if (this.c.containsKey((Object)string2)) {
            return this.c.get((Object)string2);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new e(this.a, this.b, (Map)new HashMap(this.c));
    }

    public final void d(String string2, Object object) {
        if (object == null) {
            this.c.remove((Object)string2);
            return;
        }
        object = e.c(string2, this.c.get((Object)string2), object);
        this.c.put((Object)string2, object);
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        if (this.b != object.b) {
            return false;
        }
        if (!this.a.equals((Object)object.a)) {
            return false;
        }
        return this.c.equals((Object)object.c);
    }

    public final void f(String string2) {
        this.a = string2;
    }

    public final Map g() {
        return this.c;
    }

    public final int hashCode() {
        int n8 = this.a.hashCode();
        long l8 = this.b;
        return (n8 * 31 + (int)(l8 ^ l8 >>> 32)) * 31 + this.c.hashCode();
    }

    public final String toString() {
        String string2 = this.a;
        long l8 = this.b;
        String string3 = String.valueOf((Object)this.c);
        StringBuilder stringBuilder = new StringBuilder("Event{name='");
        stringBuilder.append(string2);
        stringBuilder.append("', timestamp=");
        stringBuilder.append(l8);
        stringBuilder.append(", params=");
        stringBuilder.append(string3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

