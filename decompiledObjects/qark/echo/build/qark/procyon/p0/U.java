// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import android.util.Pair;
import java.util.Map;

public abstract class U
{
    public static long a(final Map map, final String s) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            final String s2 = map.get(s);
            if (s2 != null) {
                return Long.parseLong(s2);
            }
            return -9223372036854775807L;
        }
        catch (NumberFormatException ex) {
            return -9223372036854775807L;
        }
    }
    
    public static Pair b(final n n) {
        final Map c = n.c();
        if (c == null) {
            return null;
        }
        return new Pair((Object)a(c, "LicenseDurationRemaining"), (Object)a(c, "PlaybackDurationRemaining"));
    }
}
