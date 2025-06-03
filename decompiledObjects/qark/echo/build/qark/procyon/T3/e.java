// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class e
{
    public static void a(final boolean b) {
        b(b, "", new Object[0]);
    }
    
    public static void b(final boolean b, final String format, final Object... args) {
        if (b) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("hardAssert failed: ");
        sb.append(String.format(format, args));
        throw new AssertionError((Object)sb.toString());
    }
    
    public static Long c(final Object o) {
        if (o instanceof Integer) {
            return (long)(int)o;
        }
        if (o instanceof Long) {
            return (Long)o;
        }
        return null;
    }
    
    public static String d(final List list) {
        if (list.isEmpty()) {
            return "/";
        }
        final StringBuilder sb = new StringBuilder();
        final Iterator<String> iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String str = iterator.next();
            if (n == 0) {
                sb.append("/");
            }
            sb.append(str);
            n = 0;
        }
        return sb.toString();
    }
    
    public static List e(final String s) {
        final ArrayList<String> list = new ArrayList<String>();
        final String[] split = s.split("/", -1);
        for (int i = 0; i < split.length; ++i) {
            if (!split[i].isEmpty()) {
                list.add(split[i]);
            }
        }
        return list;
    }
}
