/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 */
package B3;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import r4.b;

public class y
implements b {
    public volatile Set a = Collections.newSetFromMap((Map)new ConcurrentHashMap());
    public volatile Set b = null;

    public y(Collection collection) {
        this.a.addAll(collection);
    }

    public static y b(Collection collection) {
        return new y((Collection)((Set)collection));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(b object) {
        synchronized (this) {
            try {
                Object object2;
                if (this.b == null) {
                    Set set = this.a;
                    object2 = object;
                    object = set;
                } else {
                    object2 = this.b;
                    Object object3 = object.get();
                    object = object2;
                    object2 = object3;
                }
                object.add(object2);
            }
            catch (Throwable throwable) {}
            return;
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Set c() {
        if (this.b != null) return Collections.unmodifiableSet((Set)this.b);
        synchronized (this) {
            try {
                if (this.b != null) return Collections.unmodifiableSet((Set)this.b);
                this.b = Collections.newSetFromMap((Map)new ConcurrentHashMap());
                this.d();
                return Collections.unmodifiableSet((Set)this.b);
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
    public final void d() {
        synchronized (this) {
            try {
                Iterator iterator = this.a.iterator();
                do {
                    if (!iterator.hasNext()) {
                        this.a = null;
                        return;
                    }
                    b b8 = (b)iterator.next();
                    this.b.add(b8.get());
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

