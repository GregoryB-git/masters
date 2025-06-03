/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractList
 *  java.util.Collection
 *  java.util.List
 *  java.util.RandomAccess
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class c
extends AbstractList
implements z.d {
    public boolean o = true;

    public void a() {
        if (this.o) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public boolean add(Object object) {
        this.a();
        return super.add(object);
    }

    public boolean addAll(int n8, Collection collection) {
        this.a();
        return super.addAll(n8, collection);
    }

    public boolean addAll(Collection collection) {
        this.a();
        return super.addAll(collection);
    }

    public void clear() {
        this.a();
        super.clear();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        if (!(object instanceof RandomAccess)) {
            return super.equals(object);
        }
        object = (List)object;
        int n8 = this.size();
        if (n8 != object.size()) {
            return false;
        }
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.get(i8).equals(object.get(i8))) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n8 = this.size();
        int n9 = 1;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = n9 * 31 + this.get(i8).hashCode();
        }
        return n9;
    }

    @Override
    public final void j() {
        this.o = false;
    }

    @Override
    public boolean p() {
        return this.o;
    }

    public abstract Object remove(int var1);

    public boolean remove(Object object) {
        this.a();
        int n8 = this.indexOf(object);
        if (n8 == -1) {
            return false;
        }
        this.remove(n8);
        return true;
    }

    public boolean removeAll(Collection collection) {
        this.a();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        this.a();
        return super.retainAll(collection);
    }
}

