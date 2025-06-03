/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.Set
 */
package R2;

import R2.D;
import java.util.Iterator;
import java.util.Set;

public final class G
implements Iterator {
    public Iterator o;
    public final /* synthetic */ D p;

    public G(D d8) {
        this.p = d8;
        this.o = D.d(d8).keySet().iterator();
    }

    public final boolean hasNext() {
        return this.o.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String)this.o.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

