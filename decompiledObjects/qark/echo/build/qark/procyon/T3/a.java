// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T3;

import java.util.Collections;
import java.util.List;

public class a
{
    public final List a;
    public final List b;
    
    public a(final List a, final List b) {
        if (a.size() == b.size() - 1) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }
    
    public List a() {
        return Collections.unmodifiableList((List<?>)this.b);
    }
    
    public List b() {
        return Collections.unmodifiableList((List<?>)this.a);
    }
}
