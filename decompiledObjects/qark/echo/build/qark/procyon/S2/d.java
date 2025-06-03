// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S2;

import com.google.android.gms.common.api.Scope;
import y2.a;

public abstract class d
{
    public static final a.g a;
    public static final a.g b;
    public static final a.a c;
    public static final a.a d;
    public static final Scope e;
    public static final Scope f;
    public static final a g;
    public static final a h;
    
    static {
        final a.g g2 = a = new a.g();
        final a.g g3 = b = new a.g();
        final a.a a2 = c = new b();
        final a.a a3 = d = new c();
        e = new Scope("profile");
        f = new Scope("email");
        g = new a("SignIn.API", a2, g2);
        h = new a("SignIn.INTERNAL_API", a3, g3);
    }
}
