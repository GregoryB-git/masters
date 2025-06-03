/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 *  java.util.concurrent.TimeUnit
 */
package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public abstract class e {
    public static final long a = TimeUnit.MINUTES.toMillis(3L);

    public static final abstract class a {
        public static t.a a(Bundle bundle) {
            t.a a8 = new t.a();
            for (String string2 : bundle.keySet()) {
                Object object = bundle.get(string2);
                if (!(object instanceof String)) continue;
                object = (String)object;
                if (string2.startsWith("google.") || string2.startsWith("gcm.") || string2.equals((Object)"from") || string2.equals((Object)"message_type") || string2.equals((Object)"collapse_key")) continue;
                a8.put(string2, object);
            }
            return a8;
        }
    }

}

