// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.AbstractSet;

public class p5 extends AbstractSet
{
    public final /* synthetic */ d5 o;
    
    public p5(final d5 o) {
        this.o = o;
    }
    
    @Override
    public void clear() {
        this.o.clear();
    }
    
    @Override
    public boolean contains(Object value) {
        final Map.Entry entry = (Map.Entry)value;
        value = this.o.get(entry.getKey());
        final Object value2 = entry.getValue();
        return value == value2 || (value != null && value.equals(value2));
    }
    
    @Override
    public Iterator iterator() {
        return new n5(this.o, null);
    }
    
    @Override
    public boolean remove(final Object o) {
        final Map.Entry entry = (Map.Entry)o;
        if (this.contains(entry)) {
            this.o.remove(entry.getKey());
            return true;
        }
        return false;
    }
    
    @Override
    public int size() {
        return this.o.size();
    }
}
