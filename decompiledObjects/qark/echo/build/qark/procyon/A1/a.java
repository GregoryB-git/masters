// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public enum a
{
    public static final a o;
    
    p("MOBILE_APP_INSTALL", 0), 
    q("CUSTOM", 1), 
    r("OTHER", 2);
    
    static {
        s = c();
        o = new a(null);
    }
    
    public a(final String name, final int ordinal) {
    }
    
    public static final /* synthetic */ a[] c() {
        return new a[] { a.p, a.q, a.r };
    }
    
    public static final class a
    {
        public final A1.a a(final String s) {
            Intrinsics.checkNotNullParameter(s, "rawValue");
            if (Intrinsics.a(s, "MOBILE_APP_INSTALL")) {
                return A1.a.p;
            }
            if (Intrinsics.a(s, "CUSTOM_APP_EVENTS")) {
                return A1.a.q;
            }
            return A1.a.r;
        }
    }
}
