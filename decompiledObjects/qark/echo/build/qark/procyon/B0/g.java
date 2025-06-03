// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B0;

import d0.z;
import g0.a;
import A0.y;
import java.util.regex.Pattern;
import i0.k;

public abstract class g
{
    public abstract k a(final k p0);
    
    public abstract static final class a
    {
        public static final Pattern a;
        
        static {
            a = Pattern.compile(".*-.*");
        }
        
        public static String b(final y y) {
            g0.a.a(y != null);
            int n;
            if ((n = z.k(y.m().n)) == -1) {
                n = z.k(y.m().m);
            }
            if (n == 1) {
                return "a";
            }
            if (n == 2) {
                return "v";
            }
            return null;
        }
        
        public abstract g a();
        
        public abstract a c(final long p0);
        
        public abstract a d(final String p0);
        
        public abstract a e(final String p0);
        
        public abstract a f(final String p0);
    }
}
