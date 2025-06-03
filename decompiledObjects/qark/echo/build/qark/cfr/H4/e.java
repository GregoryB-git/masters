/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 */
package H4;

import H4.a;
import H4.b;
import H4.c;
import H4.d;
import N4.g;
import N4.h;
import N4.i;
import N4.m;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class e {
    public static List a(i i8, Context context) {
        ArrayList arrayList = new ArrayList();
        if (i8.l()) {
            arrayList.add((Object)new d(i8.n()));
        }
        if (i8.o()) {
            arrayList.add((Object)new c(i8.p(), context));
        }
        if (i8.Z()) {
            arrayList.add((Object)new a(i8.Y()));
        }
        if (i8.f()) {
            arrayList.add((Object)new b(i8.g()));
        }
        return arrayList;
    }

    public static boolean b(i i8, Context context) {
        if ((i8 = e.a(i8, context)).isEmpty()) {
            F4.a.e().a("No validators found for PerfMetric.");
            return false;
        }
        i8 = i8.iterator();
        while (i8.hasNext()) {
            if (((e)i8.next()).c()) continue;
            return false;
        }
        return true;
    }

    public static void d(String string2, String string3) {
        if (string2 != null && string2.length() != 0) {
            if (string3 != null && string3.length() != 0) {
                if (string2.length() <= 40) {
                    if (string3.length() <= 100) {
                        if (string2.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
                            return;
                        }
                        throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
                    }
                    throw new IllegalArgumentException(String.format((Locale)Locale.US, (String)"Attribute value length must not exceed %d characters", (Object[])new Object[]{100}));
                }
                throw new IllegalArgumentException(String.format((Locale)Locale.US, (String)"Attribute key length must not exceed %d characters", (Object[])new Object[]{40}));
            }
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        throw new IllegalArgumentException("Attribute key must not be null or empty");
    }

    public static String e(String string2) {
        if (string2 == null) {
            return "Metric name must not be null";
        }
        if (string2.length() > 100) {
            return String.format((Locale)Locale.US, (String)"Metric name must not exceed %d characters", (Object[])new Object[]{100});
        }
        if (string2.startsWith("_")) {
            M4.b[] arrb = M4.b.values();
            int n8 = arrb.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!arrb[i8].toString().equals((Object)string2)) continue;
                return null;
            }
            return "Metric name must not start with '_'";
        }
        return null;
    }

    public static String f(String string2) {
        if (string2 == null) {
            return "Trace name must not be null";
        }
        if (string2.length() > 100) {
            return String.format((Locale)Locale.US, (String)"Trace name must not exceed %d characters", (Object[])new Object[]{100});
        }
        if (string2.startsWith("_")) {
            M4.c[] arrc = M4.c.values();
            int n8 = arrc.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!arrc[i8].toString().equals((Object)string2)) continue;
                return null;
            }
            if (string2.startsWith("_st_")) {
                return null;
            }
            return "Trace name must not start with '_'";
        }
        return null;
    }

    public abstract boolean c();
}

