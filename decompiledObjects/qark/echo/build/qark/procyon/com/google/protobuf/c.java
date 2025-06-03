// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.RandomAccess;
import java.util.List;
import java.util.Collection;
import java.util.AbstractList;

public abstract class c extends AbstractList implements e
{
    public boolean o;
    
    public c() {
        this.o = true;
    }
    
    public void a() {
        if (this.o) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean add(final Object e) {
        this.a();
        return super.add(e);
    }
    
    @Override
    public boolean addAll(final int index, final Collection c) {
        this.a();
        return super.addAll(index, c);
    }
    
    @Override
    public boolean addAll(final Collection c) {
        this.a();
        return super.addAll(c);
    }
    
    @Override
    public void clear() {
        this.a();
        super.clear();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        if (!(o instanceof RandomAccess)) {
            return super.equals(o);
        }
        final List list = (List)o;
        final int size = this.size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; ++i) {
            if (!this.get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int size = this.size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = n * 31 + this.get(i).hashCode();
        }
        return n;
    }
    
    @Override
    public final void j() {
        this.o = false;
    }
    
    @Override
    public boolean p() {
        return this.o;
    }
    
    @Override
    public abstract Object remove(final int p0);
    
    @Override
    public boolean remove(final Object o) {
        this.a();
        final int index = this.indexOf(o);
        if (index == -1) {
            return false;
        }
        this.remove(index);
        return true;
    }
    
    @Override
    public boolean removeAll(final Collection c) {
        this.a();
        return super.removeAll(c);
    }
    
    @Override
    public boolean retainAll(final Collection c) {
        this.a();
        return super.retainAll(c);
    }
}
