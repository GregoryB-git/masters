// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i3;

import java.security.GeneralSecurityException;
import p3.J;

public abstract class b
{
    public static final String a;
    public static final J b;
    public static final J c;
    
    static {
        a = new a().d();
        b = J.V();
        c = J.V();
        try {
            a();
        }
        catch (GeneralSecurityException thrown) {
            throw new ExceptionInInitializerError(thrown);
        }
    }
    
    public static void a() {
        i3.c.e();
        if (g3.a.a()) {
            return;
        }
        i3.a.m(true);
    }
}
