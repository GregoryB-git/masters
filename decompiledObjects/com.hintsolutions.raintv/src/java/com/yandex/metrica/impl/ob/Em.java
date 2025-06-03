/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class em<K, V> {
    private final HashMap<K, Collection<V>> a = new HashMap();
    private final boolean b;

    public em() {
        this(false);
    }

    public em(boolean bl) {
        this.b = bl;
    }

    @Nullable
    public Collection<V> a(@Nullable K k5) {
        return (Collection)this.a.get(k5);
    }

    @Nullable
    public Collection<V> a(@Nullable K k5, @Nullable V v2) {
        Collection collection = (Collection)this.a.get(k5);
        collection = collection == null ? new ArrayList() : new ArrayList(collection);
        collection.add(v2);
        return (Collection)this.a.put(k5, (Object)collection);
    }

    @NonNull
    public Set<? extends Map.Entry<K, ? extends Collection<V>>> a() {
        return this.a.entrySet();
    }

    @Nullable
    public Collection<V> b(@Nullable K k5) {
        return (Collection)this.a.remove(k5);
    }

    @Nullable
    public Collection<V> b(@Nullable K k5, @Nullable V v2) {
        Collection collection = (Collection)this.a.get(k5);
        if (collection != null && collection.remove(v2)) {
            if (collection.isEmpty() && this.b) {
                this.a.remove(k5);
            }
            return new ArrayList(collection);
        }
        return null;
    }

    public boolean b() {
        return this.a.isEmpty();
    }

    public int c() {
        Iterator iterator = this.a.values().iterator();
        int n4 = 0;
        while (iterator.hasNext()) {
            n4 += ((Collection)iterator.next()).size();
        }
        return n4;
    }

    public String toString() {
        return this.a.toString();
    }
}

