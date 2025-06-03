/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package g0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class h
implements Iterable {
    public final Object o = new Object();
    public final Map p = new HashMap();
    public Set q = Collections.emptySet();
    public List r = Collections.emptyList();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Object object) {
        Object object2 = this.o;
        synchronized (object2) {
            try {
                Map map;
                ArrayList arrayList = new ArrayList((Collection)this.r);
                arrayList.add(object);
                this.r = Collections.unmodifiableList((List)arrayList);
                arrayList = (Integer)this.p.get(object);
                if (arrayList == null) {
                    map = new HashSet((Collection)this.q);
                    map.add(object);
                    this.q = Collections.unmodifiableSet((Set)map);
                }
                map = this.p;
                int n8 = 1;
                if (arrayList != null) {
                    n8 = 1 + arrayList.intValue();
                }
                map.put(object, (Object)n8);
                return;
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
    public int d(Object object) {
        Object object2 = this.o;
        synchronized (object2) {
            try {
                if (!this.p.containsKey(object)) return 0;
                return (Integer)this.p.get(object);
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
    public void f(Object object) {
        Object object2 = this.o;
        synchronized (object2) {
            try {
                Integer n8 = (Integer)this.p.get(object);
                if (n8 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList((Collection)this.r);
                arrayList.remove(object);
                this.r = Collections.unmodifiableList((List)arrayList);
                if (n8 == 1) {
                    this.p.remove(object);
                    n8 = new HashSet((Collection)this.q);
                    n8.remove(object);
                    this.q = Collections.unmodifiableSet((Set)n8);
                } else {
                    this.p.put(object, (Object)(n8 - 1));
                }
                return;
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
    public Iterator iterator() {
        Object object = this.o;
        synchronized (object) {
            return this.r.iterator();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Set u() {
        Object object = this.o;
        synchronized (object) {
            return this.q;
        }
    }
}

