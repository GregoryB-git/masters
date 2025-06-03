package k1;

import d0.C1162A;
import g0.M;
import g0.z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: k1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1457h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f16130a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(z zVar) {
        String r7;
        while (true) {
            String r8 = zVar.r();
            if (r8 == null) {
                return null;
            }
            if (f16130a.matcher(r8).matches()) {
                do {
                    r7 = zVar.r();
                    if (r7 != null) {
                    }
                } while (!r7.isEmpty());
            } else {
                Matcher matcher = AbstractC1454e.f16104a.matcher(r8);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(z zVar) {
        String r7 = zVar.r();
        return r7 != null && r7.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] c12 = M.c1(str, "\\.");
        long j7 = 0;
        for (String str2 : M.b1(c12[0], ":")) {
            j7 = (j7 * 60) + Long.parseLong(str2);
        }
        long j8 = j7 * 1000;
        if (c12.length == 2) {
            j8 += Long.parseLong(c12[1]);
        }
        return j8 * 1000;
    }

    public static void e(z zVar) {
        int f7 = zVar.f();
        if (b(zVar)) {
            return;
        }
        zVar.T(f7);
        throw C1162A.a("Expected WEBVTT. Got " + zVar.r(), null);
    }
}
