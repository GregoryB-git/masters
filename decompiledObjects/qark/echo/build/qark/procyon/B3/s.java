// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B3;

import java.util.Arrays;
import java.util.List;

public class s extends t
{
    public final List o;
    
    public s(final List o) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Dependency cycle detected: ");
        sb.append(Arrays.toString(o.toArray()));
        super(sb.toString());
        this.o = o;
    }
}
