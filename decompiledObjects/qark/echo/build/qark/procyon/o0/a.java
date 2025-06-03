// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o0;

import java.util.Collections;
import java.util.List;

public class a
{
    public final long a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    
    public a(final long a, final int b, final List list, final List list2, final List list3, final List list4) {
        this.a = a;
        this.b = b;
        this.c = Collections.unmodifiableList((List<?>)list);
        this.d = Collections.unmodifiableList((List<?>)list2);
        this.e = Collections.unmodifiableList((List<?>)list3);
        this.f = Collections.unmodifiableList((List<?>)list4);
    }
}
