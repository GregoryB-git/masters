// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.Map;
import java.util.Iterator;

public class x implements Iterator
{
    public Iterator o;
    
    public x(final Iterator o) {
        this.o = o;
    }
    
    public Map.Entry b() {
        final Map.Entry entry = this.o.next();
        entry.getValue();
        return (Map.Entry)entry;
    }
    
    @Override
    public boolean hasNext() {
        return this.o.hasNext();
    }
    
    @Override
    public void remove() {
        this.o.remove();
    }
}
