/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigDecimal
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  java.util.regex.PatternSyntaxException
 */
package R2;

import A2.n;
import R2.N5;
import R2.Y1;
import R2.a2;
import R2.e6;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.z1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class d {
    public String a;
    public int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;

    public d(String string2, int n8) {
        this.a = string2;
        this.b = n8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Boolean b(double d8, z1 z12) {
        try {
            return d.h(new BigDecimal(d8), z12, Math.ulp((double)d8));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Boolean c(long l8, z1 z12) {
        try {
            return d.h(new BigDecimal(l8), z12, 0.0);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public static Boolean d(Boolean bl, boolean bl2) {
        if (bl == null) {
            return null;
        }
        bl2 = bl != bl2;
        return bl2;
    }

    public static Boolean e(String string2, z1 z12) {
        if (!N5.f0(string2)) {
            return null;
        }
        try {
            string2 = d.h(new BigDecimal(string2), z12, 0.0);
            return string2;
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Boolean f(String string2, B1.a a8, boolean bl, String string3, List list, String string4, Y1 y12) {
        if (string2 == null) {
            return null;
        }
        if (a8 == B1.a.v) {
            if (list == null) return null;
            if (list.isEmpty()) {
                return null;
            }
        } else if (string3 == null) {
            return null;
        }
        String string5 = string2;
        if (!bl) {
            string5 = a8 == B1.a.q ? string2 : string2.toUpperCase(Locale.ENGLISH);
        }
        switch (e6.a[a8.ordinal()]) {
            default: {
                return null;
            }
            case 6: {
                if (list == null) {
                    return null;
                }
                bl = list.contains((Object)string5);
                return bl;
            }
            case 5: {
                bl = string5.equals((Object)string3);
                return bl;
            }
            case 4: {
                bl = string5.contains((CharSequence)string3);
                return bl;
            }
            case 3: {
                bl = string5.endsWith(string3);
                return bl;
            }
            case 2: {
                bl = string5.startsWith(string3);
                return bl;
            }
            case 1: 
        }
        if (string4 == null) {
            return null;
        }
        int n8 = bl ? 0 : 66;
        try {
            bl = Pattern.compile((String)string4, (int)n8).matcher((CharSequence)string5).matches();
        }
        catch (PatternSyntaxException patternSyntaxException) {}
        return bl;
        if (y12 == null) return null;
        y12.L().b("Invalid regular expression in REGEXP audience filter. expression", string4);
        return null;
    }

    public static Boolean g(String string2, B1 b12, Y1 y12) {
        n.i(b12);
        if (string2 == null) {
            return null;
        }
        if (b12.O()) {
            Object object;
            if (b12.G() == B1.a.p) {
                return null;
            }
            Object object2 = b12.G();
            if (object2 == (object = B1.a.v) ? b12.k() == 0 : !b12.N()) {
                return null;
            }
            B1.a a8 = b12.G();
            boolean bl = b12.L();
            object = !bl && a8 != B1.a.q && a8 != object ? b12.J().toUpperCase(Locale.ENGLISH) : b12.J();
            if (b12.k() == 0) {
                b12 = null;
            } else {
                b12 = b12.K();
                if (!bl) {
                    object2 = new ArrayList(b12.size());
                    b12 = b12.iterator();
                    while (b12.hasNext()) {
                        object2.add((Object)((String)b12.next()).toUpperCase(Locale.ENGLISH));
                    }
                    b12 = Collections.unmodifiableList((List)object2);
                }
            }
            object2 = a8 == B1.a.q ? object : null;
            return d.f(string2, a8, bl, (String)object, (List)b12, (String)object2, y12);
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static Boolean h(BigDecimal bigDecimal, z1 object, double d8) {
        Object z12;
        z1.b b10;
        n.i(object);
        if (!object.N()) return null;
        if (object.G() == z1.b.p) {
            return null;
        }
        z1.b b8 = object.G();
        if (b8 == (b10 = z1.b.t)) {
            if (!object.R()) return null;
            if (!object.Q()) {
                return null;
            }
        } else if (!object.O()) {
            return null;
        }
        z1.b b9 = object.G();
        if (object.G() == b10) {
            if (!N5.f0(object.L())) return null;
            if (!N5.f0(object.K())) {
                return null;
            }
            b8 = new BigDecimal(object.L());
            z12 = new BigDecimal(object.K());
            object = b8;
            b8 = null;
        }
        if (!N5.f0(object.J())) {
            return null;
        }
        try {
            b8 = new BigDecimal(object.J());
            z12 = object = null;
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        if (b9 != b10) return null;
        if (object == null) {
            return null;
        }
        int n8 = e6.b[b9.ordinal()];
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        if (n8 == 1) {
            if (b8 == null) return null;
            bl2 = bl4;
            if (bigDecimal.compareTo((BigDecimal)b8) >= 0) return bl2;
            bl2 = true;
            return bl2;
        }
        if (n8 == 2) {
            if (b8 == null) return null;
            bl2 = bl3;
            if (bigDecimal.compareTo((BigDecimal)b8) <= 0) return bl2;
            bl2 = true;
            return bl2;
        }
        if (n8 != 3) {
            if (n8 != 4) {
                return null;
            }
            if (object == null) {
                return null;
            }
            bl2 = bl5;
            if (bigDecimal.compareTo((BigDecimal)object) < 0) return bl2;
            bl2 = bl5;
            if (bigDecimal.compareTo((BigDecimal)z12) > 0) return bl2;
            bl2 = true;
            return bl2;
        }
        if (b8 == null) return null;
        if (d8 != 0.0) {
            bl2 = bl;
            if (bigDecimal.compareTo(b8.subtract(new BigDecimal(d8).multiply(new BigDecimal(2)))) <= 0) return bl2;
            bl2 = bl;
            if (bigDecimal.compareTo(b8.add(new BigDecimal(d8).multiply(new BigDecimal(2)))) >= 0) return bl2;
            bl2 = true;
            return bl2;
        }
        if (bigDecimal.compareTo((BigDecimal)b8) != 0) return bl2;
        bl2 = true;
        return bl2;
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public abstract int a();

    public abstract boolean i();

    public abstract boolean j();
}

