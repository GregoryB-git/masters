// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import c2.f;
import c2.e;
import c2.b;
import java.util.Set;
import c2.g;

public final class q implements g
{
    public final Set a;
    public final p b;
    public final t c;
    
    public q(final Set a, final p b, final t c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public f a(final String s, final Class clazz, final b b, final e e) {
        if (this.a.contains(b)) {
            return new s(this.b, s, b, e, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", b, this.a));
    }
}
