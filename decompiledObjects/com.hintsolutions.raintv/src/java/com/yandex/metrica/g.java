/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.yandex.metrica;

import java.util.Map;

public class g {
    private String a;
    private String b;
    private Map<String, String> c;

    public Map<String, String> a() {
        return this.c;
    }

    public void a(String string2) {
        this.b = string2;
    }

    public void a(Map<String, String> map) {
        this.c = map;
    }

    public String b() {
        return this.b;
    }

    public void b(String string2) {
        this.a = string2;
    }

    public String c() {
        return this.a;
    }

    public boolean equals(Object map) {
        boolean bl = true;
        if (this == map) {
            return true;
        }
        if (map != null && g.class == map.getClass()) {
            map = (g)map;
            Object object = this.a;
            if (object != null ? !object.equals((Object)map.a) : map.a != null) {
                return false;
            }
            object = this.b;
            if (object != null ? !object.equals((Object)map.b) : map.b != null) {
                return false;
            }
            object = this.c;
            map = map.c;
            if (object != null) {
                bl = object.equals(map);
            } else if (map != null) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public int hashCode() {
        Map<String, String> map = this.a;
        int n = 0;
        int n2 = map != null ? map.hashCode() : 0;
        map = this.b;
        int n3 = map != null ? map.hashCode() : 0;
        map = this.c;
        if (map != null) {
            n = map.hashCode();
        }
        return (n2 * 31 + n3) * 31 + n;
    }
}

