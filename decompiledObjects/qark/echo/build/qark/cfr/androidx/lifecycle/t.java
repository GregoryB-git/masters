/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 */
package androidx.lifecycle;

import androidx.lifecycle.r;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class t {
    public final HashMap a = new HashMap();

    public final void a() {
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((r)iterator.next()).a();
        }
        this.a.clear();
    }

    public final r b(String string2) {
        return (r)this.a.get((Object)string2);
    }

    public Set c() {
        return new HashSet((Collection)this.a.keySet());
    }

    public final void d(String object, r r8) {
        if ((object = (r)this.a.put(object, (Object)r8)) != null) {
            object.d();
        }
    }
}

