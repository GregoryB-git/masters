// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r0;

import java.util.Collections;
import java.util.List;
import v0.a;

public abstract class h implements a
{
    public final String a;
    public final List b;
    public final boolean c;
    
    public h(final String a, final List list, final boolean c) {
        this.a = a;
        this.b = Collections.unmodifiableList((List<?>)list);
        this.c = c;
    }
}
