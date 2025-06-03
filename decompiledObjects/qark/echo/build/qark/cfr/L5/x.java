/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 */
package L5;

import Q3.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class x {
    public Map a = new HashMap();

    /*
     * Enabled aggressive block sorting
     */
    public x(b b8) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"key", (Object)b8.e());
        hashMap.put((Object)"value", b8.h());
        hashMap.put((Object)"priority", b8.f());
        int n8 = (int)b8.d();
        if (n8 == 0) {
            b8 = new ArrayList();
        } else {
            Object[] arrobject = new String[n8];
            b8 = b8.c().iterator();
            n8 = 0;
            while (b8.hasNext()) {
                arrobject[n8] = ((b)b8.next()).e();
                ++n8;
            }
            b8 = Arrays.asList((Object[])arrobject);
        }
        hashMap.put((Object)"childKeys", (Object)b8);
        this.a.put((Object)"snapshot", (Object)hashMap);
    }

    public Map a() {
        return this.a;
    }

    public x b(Map map) {
        Map map2 = this.a;
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.putAll(map2);
        this.a.putAll(map);
        return this;
    }
}

