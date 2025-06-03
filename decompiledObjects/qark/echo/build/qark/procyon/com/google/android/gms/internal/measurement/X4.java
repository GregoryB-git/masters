// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;
import java.util.HashMap;
import java.util.Map;

public final class X4
{
    public Map a;
    
    public X4() {
        this.a = new HashMap();
    }
    
    public final s a(final String str) {
        while (true) {
            if (this.a.containsKey(str)) {
                final Callable<s> callable = this.a.get(str);
                while (true) {
                    try {
                        return callable.call();
                        return s.d;
                        final StringBuilder sb = new StringBuilder("Failed to create API implementation: ");
                        sb.append(str);
                        throw new IllegalStateException(sb.toString());
                    }
                    catch (Exception ex) {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public final void b(final String s, final Callable callable) {
        this.a.put(s, callable);
    }
}
