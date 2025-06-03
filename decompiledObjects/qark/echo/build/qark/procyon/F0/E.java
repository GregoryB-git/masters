// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import T0.k;
import T0.e;
import d0.x;
import java.util.regex.Matcher;
import g0.M;
import java.util.regex.Pattern;

public final class E
{
    public static final Pattern c;
    public int a;
    public int b;
    
    static {
        c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    }
    
    public E() {
        this.a = -1;
        this.b = -1;
    }
    
    public boolean a() {
        return this.a != -1 && this.b != -1;
    }
    
    public final boolean b(final String input) {
        final Matcher matcher = E.c.matcher(input);
        if (!matcher.find()) {
            return false;
        }
        try {
            final int int1 = Integer.parseInt((String)M.i(matcher.group(1)), 16);
            final int int2 = Integer.parseInt((String)M.i(matcher.group(2)), 16);
            if (int1 > 0 || int2 > 0) {
                this.a = int1;
                this.b = int2;
                return true;
            }
            return false;
        }
        catch (NumberFormatException ex) {
            return false;
        }
    }
    
    public boolean c(final x x) {
        for (int i = 0; i < x.e(); ++i) {
            final x.b d = x.d(i);
            if (d instanceof e) {
                final e e = (e)d;
                if ("iTunSMPB".equals(e.q) && this.b(e.r)) {
                    return true;
                }
            }
            else if (d instanceof k) {
                final k k = (k)d;
                if ("com.apple.iTunes".equals(k.p) && "iTunSMPB".equals(k.q) && this.b(k.r)) {
                    return true;
                }
            }
        }
        return false;
    }
}
