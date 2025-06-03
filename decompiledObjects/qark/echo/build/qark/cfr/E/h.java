/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.Locale
 */
package E;

import E.g;
import E.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public final class h
implements i {
    public static final Locale[] c = new Locale[0];
    public static final Locale d = new Locale("en", "XA");
    public static final Locale e = new Locale("ar", "XB");
    public static final Locale f = g.b("en-Latn");
    public final Locale[] a;
    public final String b;

    /*
     * Enabled aggressive block sorting
     */
    public /* varargs */ h(Locale ... object) {
        if (object.length == 0) {
            this.a = c;
            object = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i8 = 0; i8 < object.length; ++i8) {
                Object object2 = object[i8];
                if (object2 == null) {
                    object = new StringBuilder();
                    object.append("list[");
                    object.append(i8);
                    object.append("] is null");
                    throw new NullPointerException(object.toString());
                }
                if (hashSet.contains(object2)) continue;
                object2 = (Locale)object2.clone();
                arrayList.add(object2);
                h.b(stringBuilder, (Locale)object2);
                if (i8 < object.length - 1) {
                    stringBuilder.append(',');
                }
                hashSet.add(object2);
            }
            this.a = (Locale[])arrayList.toArray((Object[])new Locale[0]);
            object = stringBuilder.toString();
        }
        this.b = object;
    }

    public static void b(StringBuilder stringBuilder, Locale locale) {
        stringBuilder.append(locale.getLanguage());
        String string2 = locale.getCountry();
        if (string2 != null && !string2.isEmpty()) {
            stringBuilder.append('-');
            stringBuilder.append(locale.getCountry());
        }
    }

    @Override
    public Object a() {
        return null;
    }

    public boolean equals(Object arrlocale) {
        Locale[] arrlocale2;
        if (arrlocale == this) {
            return true;
        }
        if (!(arrlocale instanceof h)) {
            return false;
        }
        arrlocale = ((h)arrlocale).a;
        if (this.a.length != arrlocale.length) {
            return false;
        }
        for (int i8 = 0; i8 < (arrlocale2 = this.a).length; ++i8) {
            if (arrlocale2[i8].equals((Object)arrlocale[i8])) continue;
            return false;
        }
        return true;
    }

    @Override
    public Locale get(int n8) {
        Locale[] arrlocale;
        if (n8 >= 0 && n8 < (arrlocale = this.a).length) {
            return arrlocale[n8];
        }
        return null;
    }

    public int hashCode() {
        Locale[] arrlocale = this.a;
        int n8 = arrlocale.length;
        int n9 = 1;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = n9 * 31 + arrlocale[i8].hashCode();
        }
        return n9;
    }

    public String toString() {
        Locale[] arrlocale;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i8 = 0; i8 < (arrlocale = this.a).length; ++i8) {
            stringBuilder.append((Object)arrlocale[i8]);
            if (i8 >= this.a.length - 1) continue;
            stringBuilder.append(',');
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

