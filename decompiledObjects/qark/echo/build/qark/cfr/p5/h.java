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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n5.F;
import p5.e;

public abstract class h {
    public static Map a(e object) {
        if ((object = object.d()) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"sql", (Object)object.c());
            hashMap.put((Object)"arguments", (Object)object.b());
            return hashMap;
        }
        return null;
    }
}

