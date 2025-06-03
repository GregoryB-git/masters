// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E;

import java.util.Locale;
import android.os.Build$VERSION;

public abstract class b
{
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b2 = false;
        int a2;
        if (sdk_INT >= 30) {
            a2 = E.b.a.a;
        }
        else {
            a2 = 0;
        }
        a = a2;
        int b3;
        if (sdk_INT >= 30) {
            b3 = E.b.a.b;
        }
        else {
            b3 = 0;
        }
        b = b3;
        int c2;
        if (sdk_INT >= 30) {
            c2 = E.b.a.c;
        }
        else {
            c2 = 0;
        }
        c = c2;
        int d2 = b2 ? 1 : 0;
        if (sdk_INT >= 30) {
            d2 = E.b.a.d;
        }
        d = d2;
    }
    
    public static boolean a(final String s, final String anObject) {
        final boolean equals = "REL".equals(anObject);
        boolean b = false;
        if (equals) {
            return false;
        }
        final Locale root = Locale.ROOT;
        if (anObject.toUpperCase(root).compareTo(s.toUpperCase(root)) >= 0) {
            b = true;
        }
        return b;
    }
    
    public static boolean b() {
        return Build$VERSION.SDK_INT >= 30;
    }
    
    public static boolean c() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        return sdk_INT >= 33 || (sdk_INT >= 32 && a("Tiramisu", Build$VERSION.CODENAME));
    }
    
    public abstract static final class a
    {
        public static final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        
        static {
            a = E.a.a(30);
            b = E.a.a(31);
            c = E.a.a(33);
            d = E.a.a(1000000);
        }
    }
}
