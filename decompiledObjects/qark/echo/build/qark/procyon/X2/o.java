// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Arrays;
import java.util.Comparator;
import java.io.Serializable;

public final class o extends P implements Serializable
{
    private static final long serialVersionUID = 0L;
    public final Comparator[] o;
    
    public o(final Comparator comparator, final Comparator comparator2) {
        this.o = new Comparator[] { comparator, comparator2 };
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        int n = 0;
        while (true) {
            final Comparator[] o3 = this.o;
            if (n >= o3.length) {
                return 0;
            }
            final int compare = o3[n].compare(o, o2);
            if (compare != 0) {
                return compare;
            }
            ++n;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof o && Arrays.equals(this.o, ((o)o).o));
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.o);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Ordering.compound(");
        sb.append(Arrays.toString(this.o));
        sb.append(")");
        return sb.toString();
    }
}
