/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 */
package O4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d {
    public static volatile d b;
    public final Set a = new HashSet();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d a() {
        d d8 = b;
        if (d8 != null) {
            return d8;
        }
        synchronized (d.class) {
            try {
                d d9;
                d8 = d9 = b;
                if (d9 == null) {
                    b = d8 = new d();
                }
                return d8;
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
    public Set b() {
        Set set = this.a;
        synchronized (set) {
            return Collections.unmodifiableSet((Set)this.a);
        }
    }
}

