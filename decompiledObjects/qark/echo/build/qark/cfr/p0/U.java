/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package p0;

import android.util.Pair;
import java.util.Map;
import p0.n;

public abstract class U {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static long a(Map object, String string2) {
        if (object == null) return -9223372036854775807L;
        try {
            object = (String)object.get((Object)string2);
            if (object == null) return -9223372036854775807L;
        }
        catch (NumberFormatException numberFormatException) {
            return -9223372036854775807L;
        }
        return Long.parseLong((String)object);
    }

    public static Pair b(n n8) {
        if ((n8 = n8.c()) == null) {
            return null;
        }
        return new Pair((Object)U.a((Map)n8, "LicenseDurationRemaining"), (Object)U.a((Map)n8, "PlaybackDurationRemaining"));
    }
}

