package q5;

import java.util.regex.Pattern;
import v3.a1;
import v5.e0;
import v5.u;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f13327a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(u uVar) {
        String g10 = uVar.g();
        return g10 != null && g10.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i10 = e0.f15881a;
        String[] split = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (split.length == 2) {
            j11 += Long.parseLong(split[1]);
        }
        return j11 * 1000;
    }

    public static void d(u uVar) {
        int i10 = uVar.f15975b;
        if (a(uVar)) {
            return;
        }
        uVar.G(i10);
        throw a1.a("Expected WEBVTT. Got " + uVar.g(), null);
    }
}
