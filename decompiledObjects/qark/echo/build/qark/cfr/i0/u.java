/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package i0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class u {
    public final Map a = new HashMap();
    public Map b;

    public void a(Map map) {
        synchronized (this) {
            this.b = null;
            this.a.clear();
            this.a.putAll(map);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Map b() {
        synchronized (this) {
            try {
                if (this.b != null) return this.b;
                this.b = Collections.unmodifiableMap((Map)new HashMap(this.a));
                return this.b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

