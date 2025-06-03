// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k3;

import java.security.GeneralSecurityException;
import p3.I;
import p3.y;
import com.google.crypto.tink.shaded.protobuf.h;
import r3.a;

public final class o implements q
{
    public final String a;
    public final a b;
    public final h c;
    public final y.c d;
    public final I e;
    public final Integer f;
    
    public o(final String a, final h c, final y.c d, final I e, final Integer f) {
        this.a = a;
        this.b = t.e(a);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static o b(final String s, final h h, final y.c c, final I i, final Integer n) {
        if (i == I.s) {
            if (n != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        }
        else if (n == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o(s, h, c, i, n);
    }
    
    @Override
    public a a() {
        return this.b;
    }
    
    public Integer c() {
        return this.f;
    }
    
    public y.c d() {
        return this.d;
    }
    
    public I e() {
        return this.e;
    }
    
    public String f() {
        return this.a;
    }
    
    public h g() {
        return this.c;
    }
}
