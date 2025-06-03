// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.os.BaseBundle;
import java.util.Iterator;
import t.a;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

public abstract class e
{
    public static final long a;
    
    static {
        a = TimeUnit.MINUTES.toMillis(3L);
    }
    
    public abstract static final class a
    {
        public static t.a a(final Bundle bundle) {
            final t.a a = new t.a();
            for (final String s : ((BaseBundle)bundle).keySet()) {
                final Object value = ((BaseBundle)bundle).get(s);
                if (value instanceof String) {
                    final String s2 = (String)value;
                    if (s.startsWith("google.") || s.startsWith("gcm.") || s.equals("from") || s.equals("message_type") || s.equals("collapse_key")) {
                        continue;
                    }
                    a.put(s, s2);
                }
            }
            return a;
        }
    }
}
