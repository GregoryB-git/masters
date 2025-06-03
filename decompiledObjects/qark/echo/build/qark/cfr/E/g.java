/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Locale
 */
package E;

import E.h;
import E.i;
import E.o;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

public final class g {
    public static final g b = g.a(new Locale[0]);
    public final i a;

    public g(i i8) {
        this.a = i8;
    }

    public static /* varargs */ g a(Locale ... arrlocale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return g.d(a.a(arrlocale));
        }
        return new g(new h(arrlocale));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Locale b(String string2) {
        String[] arrstring;
        if (string2.contains((CharSequence)"-")) {
            arrstring = string2.split("-", -1);
            if (arrstring.length > 2) {
                return new Locale(arrstring[0], arrstring[1], arrstring[2]);
            }
            if (arrstring.length > 1) {
                return new Locale(arrstring[0], arrstring[1]);
            }
            if (arrstring.length == 1) {
                return new Locale((String)arrstring[0]);
            }
        } else {
            if (!string2.contains((CharSequence)"_")) return new Locale(string2);
            arrstring = string2.split("_", -1);
            if (arrstring.length > 2) {
                return new Locale(arrstring[0], (String)arrstring[1], (String)arrstring[2]);
            }
            if (arrstring.length > 1) {
                return new Locale((String)arrstring[0], (String)arrstring[1]);
            }
            if (arrstring.length == 1) {
                return new Locale((String)arrstring[0]);
            }
        }
        arrstring = new String[]();
        arrstring.append("Can not parse language tag: [");
        arrstring.append(string2);
        arrstring.append("]");
        throw new IllegalArgumentException(arrstring.toString());
    }

    public static g d(LocaleList localeList) {
        return new g(new o((Object)localeList));
    }

    public Locale c(int n8) {
        return this.a.get(n8);
    }

    public boolean equals(Object object) {
        if (object instanceof g && this.a.equals((Object)((g)object).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    public static abstract class a {
        public static /* varargs */ LocaleList a(Locale ... arrlocale) {
            return new LocaleList(arrlocale);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

}

