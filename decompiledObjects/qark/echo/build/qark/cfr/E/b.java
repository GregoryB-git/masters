/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package E;

import android.os.Build;
import java.util.Locale;

public abstract class b {
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;

    static {
        int n8 = Build.VERSION.SDK_INT;
        int n9 = 0;
        int n10 = n8 >= 30 ? a.a : 0;
        a = n10;
        n10 = n8 >= 30 ? a.b : 0;
        b = n10;
        n10 = n8 >= 30 ? a.c : 0;
        c = n10;
        n10 = n9;
        if (n8 >= 30) {
            n10 = a.d;
        }
        d = n10;
    }

    public static boolean a(String string2, String string3) {
        boolean bl = "REL".equals((Object)string3);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (string3.toUpperCase(locale).compareTo(string2.toUpperCase(locale)) >= 0) {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        int n8 = Build.VERSION.SDK_INT;
        if (!(n8 >= 33 || n8 >= 32 && b.a("Tiramisu", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    public static final abstract class a {
        public static final int a = E.a.a(30);
        public static final int b = E.a.a(31);
        public static final int c = E.a.a(33);
        public static final int d = E.a.a(1000000);
    }

}

