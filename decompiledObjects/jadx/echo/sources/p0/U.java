package p0;

import android.util.Pair;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class U {
    public static long a(Map map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair b(InterfaceC1782n interfaceC1782n) {
        Map c7 = interfaceC1782n.c();
        if (c7 == null) {
            return null;
        }
        return new Pair(Long.valueOf(a(c7, "LicenseDurationRemaining")), Long.valueOf(a(c7, "PlaybackDurationRemaining")));
    }
}
