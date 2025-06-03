/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.util.AbstractSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.o5;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class p5
extends AbstractSet {
    public final /* synthetic */ d5 o;

    public p5(d5 d52) {
        this.o = d52;
    }

    public /* synthetic */ p5(d5 d52, o5 o52) {
        this(d52);
    }

    public /* synthetic */ boolean add(Object object) {
        if (!this.contains(object = (Map.Entry)object)) {
            this.o.d((Comparable)object.getKey(), object.getValue());
            return true;
        }
        return false;
    }

    public void clear() {
        this.o.clear();
    }

    public boolean contains(Object object) {
        Object object2 = (Map.Entry)object;
        object = this.o.get(object2.getKey());
        if (!(object == (object2 = object2.getValue()) || object != null && object.equals(object2))) {
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        return new n5(this.o, null);
    }

    public boolean remove(Object object) {
        if (this.contains(object = (Map.Entry)object)) {
            this.o.remove(object.getKey());
            return true;
        }
        return false;
    }

    public int size() {
        return this.o.size();
    }
}

