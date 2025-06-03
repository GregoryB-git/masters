// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H4;

import java.util.Locale;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import N4.i;

public abstract class e
{
    public static List a(final i i, final Context context) {
        final ArrayList<c> list = new ArrayList<c>();
        if (i.l()) {
            list.add(new d(i.n()));
        }
        if (i.o()) {
            list.add((d)new c(i.p(), context));
        }
        if (i.Z()) {
            list.add((d)new a(i.Y()));
        }
        if (i.f()) {
            list.add((d)new b(i.g()));
        }
        return list;
    }
    
    public static boolean b(final i i, final Context context) {
        final List a = a(i, context);
        if (a.isEmpty()) {
            F4.a.e().a("No validators found for PerfMetric.");
            return false;
        }
        final Iterator<e> iterator = a.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().c()) {
                return false;
            }
        }
        return true;
    }
    
    public static void d(final String s, final String s2) {
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if (s2 == null || s2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if (s.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
        }
        if (s2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
        }
        if (s.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            return;
        }
        throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
    }
    
    public static String e(final String anObject) {
        int i = 0;
        if (anObject == null) {
            return "Metric name must not be null";
        }
        if (anObject.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (anObject.startsWith("_")) {
            for (M4.b[] values = M4.b.values(); i < values.length; ++i) {
                if (values[i].toString().equals(anObject)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
        return null;
    }
    
    public static String f(final String anObject) {
        int i = 0;
        if (anObject == null) {
            return "Trace name must not be null";
        }
        if (anObject.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!anObject.startsWith("_")) {
            return null;
        }
        for (M4.c[] values = M4.c.values(); i < values.length; ++i) {
            if (values[i].toString().equals(anObject)) {
                return null;
            }
        }
        if (anObject.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }
    
    public abstract boolean c();
}
