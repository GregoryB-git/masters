/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package F0;

import T0.e;
import T0.k;
import d0.x;
import g0.M;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class E {
    public static final Pattern c = Pattern.compile((String)"^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public boolean a() {
        if (this.a != -1 && this.b != -1) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(String string2) {
        if (!(string2 = c.matcher((CharSequence)string2)).find()) return false;
        try {
            int n8 = Integer.parseInt((String)((String)M.i(string2.group(1))), (int)16);
            int n9 = Integer.parseInt((String)((String)M.i(string2.group(2))), (int)16);
            if (n8 <= 0) {
                if (n9 <= 0) return false;
            }
            this.a = n8;
            this.b = n9;
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    public boolean c(x x8) {
        for (int i8 = 0; i8 < x8.e(); ++i8) {
            x.b b8 = x8.d(i8);
            if (b8 instanceof e) {
                b8 = (e)b8;
                if (!"iTunSMPB".equals((Object)b8.q) || !this.b(b8.r)) continue;
                return true;
            }
            if (!(b8 instanceof k)) continue;
            b8 = (k)b8;
            if (!"com.apple.iTunes".equals((Object)b8.p) || !"iTunSMPB".equals((Object)b8.q) || !this.b(b8.r)) continue;
            return true;
        }
        return false;
    }
}

