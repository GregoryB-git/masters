/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package p5;

import E5.k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p5.f;

public class c
extends p5.a {
    public final Map a;
    public final a b;
    public final boolean c;

    public c(Map map, boolean bl) {
        this.b = new a();
        this.a = map;
        this.c = bl;
    }

    @Override
    public Object c(String string2) {
        return this.a.get((Object)string2);
    }

    @Override
    public boolean e() {
        return this.c;
    }

    @Override
    public String i() {
        return (String)this.a.get((Object)"method");
    }

    @Override
    public boolean j(String string2) {
        return this.a.containsKey((Object)string2);
    }

    @Override
    public f o() {
        return this.b;
    }

    public Map p() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put((Object)"code", (Object)this.b.b);
        hashMap2.put((Object)"message", (Object)this.b.c);
        hashMap2.put((Object)"data", this.b.d);
        hashMap.put((Object)"error", (Object)hashMap2);
        return hashMap;
    }

    public Map q() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"result", this.b.a);
        return hashMap;
    }

    public void r(k.d d8) {
        a a8 = this.b;
        d8.b(a8.b, a8.c, a8.d);
    }

    public void s(List list) {
        if (!this.e()) {
            list.add((Object)this.p());
        }
    }

    public void t(List list) {
        if (!this.e()) {
            list.add((Object)this.q());
        }
    }

    public class a
    implements f {
        public Object a;
        public String b;
        public String c;
        public Object d;

        @Override
        public void a(Object object) {
            this.a = object;
        }

        @Override
        public void b(String string2, String string3, Object object) {
            this.b = string2;
            this.c = string3;
            this.d = object;
        }
    }

}

