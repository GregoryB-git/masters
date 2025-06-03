// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o0;

import java.util.Collections;
import java.util.List;

public class g
{
    public final String a;
    public final long b;
    public final List c;
    public final List d;
    public final e e;
    
    public g(final String s, final long n, final List list, final List list2) {
        this(s, n, list, list2, null);
    }
    
    public g(final String a, final long b, final List list, final List list2, final e e) {
        this.a = a;
        this.b = b;
        this.c = Collections.unmodifiableList((List<?>)list);
        this.d = Collections.unmodifiableList((List<?>)list2);
        this.e = e;
    }
    
    public int a(final int n) {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            if (((a)this.c.get(i)).b == n) {
                return i;
            }
        }
        return -1;
    }
}
