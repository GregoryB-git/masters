/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractMap
 *  java.util.AbstractMap$SimpleEntry
 *  java.util.ArrayDeque
 *  java.util.Comparator
 *  java.util.EmptyStackException
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NoSuchElementException
 */
package S3;

import S3.h;
import S3.j;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class d
implements Iterator {
    public final ArrayDeque o = new ArrayDeque();
    public final boolean p;

    /*
     * Enabled aggressive block sorting
     */
    public d(h h8, Object object, Comparator comparator, boolean bl) {
        this.p = bl;
        do {
            block8 : {
                block9 : {
                    block7 : {
                        int n8;
                        if (h8.isEmpty()) {
                            return;
                        }
                        if (object != null) {
                            Object object2 = h8.getKey();
                            n8 = bl ? comparator.compare(object, object2) : comparator.compare(object2, object);
                        } else {
                            n8 = 1;
                        }
                        if (n8 >= 0) break block7;
                        if (!bl) break block8;
                        break block9;
                    }
                    this.o.push((Object)((j)h8));
                    if (bl) break block8;
                }
                h8 = h8.a();
                continue;
            }
            h8 = h8.f();
        } while (true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Map.Entry b() {
        try {
            h h8 = (j)this.o.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(h8.getKey(), h8.getValue());
            if (this.p) {
                h8 = h8.a();
                while (!h8.isEmpty()) {
                    this.o.push((Object)((j)h8));
                    h8 = h8.f();
                }
                return simpleEntry;
            } else {
                h8 = h8.f();
                while (!h8.isEmpty()) {
                    this.o.push((Object)((j)h8));
                    h8 = h8.a();
                }
            }
            return simpleEntry;
        }
        catch (EmptyStackException emptyStackException) {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        if (this.o.size() > 0) {
            return true;
        }
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}

