// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k1;

import d0.A;
import g0.M;
import java.util.regex.Matcher;
import g0.z;
import java.util.regex.Pattern;

public abstract class h
{
    public static final Pattern a;
    
    static {
        a = Pattern.compile("^NOTE([ \t].*)?$");
    }
    
    public static Matcher a(final z z) {
        while (true) {
            final String r = z.r();
            if (r == null) {
                return null;
            }
            if (h.a.matcher(r).matches()) {
                String r2;
                do {
                    r2 = z.r();
                } while (r2 != null && !r2.isEmpty());
            }
            else {
                final Matcher matcher = e.a.matcher(r);
                if (matcher.matches()) {
                    return matcher;
                }
                continue;
            }
        }
    }
    
    public static boolean b(final z z) {
        final String r = z.r();
        return r != null && r.startsWith("WEBVTT");
    }
    
    public static float c(final String s) {
        if (s.endsWith("%")) {
            return Float.parseFloat(s.substring(0, s.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
    
    public static long d(final String s) {
        final String[] c1 = M.c1(s, "\\.");
        int i = 0;
        final String[] b1 = M.b1(c1[0], ":");
        final int length = b1.length;
        long n = 0L;
        while (i < length) {
            n = n * 60L + Long.parseLong(b1[i]);
            ++i;
        }
        long n2 = n * 1000L;
        if (c1.length == 2) {
            n2 += Long.parseLong(c1[1]);
        }
        return n2 * 1000L;
    }
    
    public static void e(final z z) {
        final int f = z.f();
        if (b(z)) {
            return;
        }
        z.T(f);
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected WEBVTT. Got ");
        sb.append(z.r());
        throw A.a(sb.toString(), null);
    }
}
