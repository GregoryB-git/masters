// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l5;

import java.util.Objects;
import java.util.Map;

public class p
{
    public final String a;
    public final Map b;
    
    public p(final String a, final Map b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        final p p = (p)o;
        return this.a.equals(p.a) && Objects.equals(this.b, p.b);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
