// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import kotlin.text.i;
import W5.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.util.Set;

public abstract class z
{
    public static final a a;
    public static final Set b;
    public static final String c;
    
    static {
        b = (a = new a(null)).b();
        final String string = z.class.toString();
        Intrinsics.checkNotNullExpressionValue(string, "LoginManager::class.java.toString()");
        c = string;
    }
    
    public static final /* synthetic */ Set a() {
        return z.b;
    }
    
    public static final class a
    {
        public final Set b() {
            return I.f("ads_management", "create_event", "rsvp_event");
        }
        
        public final boolean c(final String s) {
            boolean b = false;
            if (s != null) {
                if (!i.s(s, "publish", false, 2, null) && !i.s(s, "manage", false, 2, null)) {
                    b = b;
                    if (!z.a().contains(s)) {
                        return b;
                    }
                }
                b = true;
            }
            return b;
        }
    }
}
