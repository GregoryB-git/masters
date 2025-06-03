package F0;

import d0.C1201x;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f1754c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f1755a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f1756b = -1;

    public boolean a() {
        return (this.f1755a == -1 || this.f1756b == -1) ? false : true;
    }

    public final boolean b(String str) {
        Matcher matcher = f1754c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) g0.M.i(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) g0.M.i(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f1755a = parseInt;
            this.f1756b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean c(C1201x c1201x) {
        for (int i7 = 0; i7 < c1201x.e(); i7++) {
            C1201x.b d7 = c1201x.d(i7);
            if (d7 instanceof T0.e) {
                T0.e eVar = (T0.e) d7;
                if ("iTunSMPB".equals(eVar.f6031q) && b(eVar.f6032r)) {
                    return true;
                }
            } else if (d7 instanceof T0.k) {
                T0.k kVar = (T0.k) d7;
                if ("com.apple.iTunes".equals(kVar.f6044p) && "iTunSMPB".equals(kVar.f6045q) && b(kVar.f6046r)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
