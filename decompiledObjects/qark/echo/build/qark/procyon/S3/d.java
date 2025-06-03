// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S3;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Comparator;
import java.util.ArrayDeque;
import java.util.Iterator;

public class d implements Iterator
{
    public final ArrayDeque o;
    public final boolean p;
    
    public d(h h, final Object o, final Comparator comparator, final boolean p4) {
        this.o = new ArrayDeque();
        this.p = p4;
        while (!h.isEmpty()) {
            int n;
            if (o != null) {
                final Object key = h.getKey();
                if (p4) {
                    n = comparator.compare(o, key);
                }
                else {
                    n = comparator.compare(key, o);
                }
            }
            else {
                n = 1;
            }
            Label_0098: {
                if (n < 0) {
                    if (!p4) {
                        break Label_0098;
                    }
                }
                else {
                    if (n == 0) {
                        this.o.push(h);
                        return;
                    }
                    this.o.push(h);
                    if (p4) {
                        break Label_0098;
                    }
                }
                h = h.a();
                continue;
            }
            h = h.f();
        }
    }
    
    public Map.Entry b() {
        try {
            final j j = this.o.pop();
            final AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(j.getKey(), j.getValue());
            if (this.p) {
                for (h h = j.a(); !h.isEmpty(); h = h.f()) {
                    this.o.push(h);
                }
            }
            else {
                for (h h2 = j.f(); !h2.isEmpty(); h2 = h2.a()) {
                    this.o.push(h2);
                }
            }
            return (Map.Entry)simpleEntry;
        }
        catch (EmptyStackException ex) {
            throw new NoSuchElementException();
        }
    }
    
    @Override
    public boolean hasNext() {
        return this.o.size() > 0;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
