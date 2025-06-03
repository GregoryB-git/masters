// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class U extends A
{
    @Override
    public final s b(final String s, final f3 f3, final List list) {
        if (s == null || s.isEmpty() || !f3.g(s)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", s));
        }
        final s c = f3.c(s);
        if (c instanceof n) {
            return ((n)c).b(f3, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", s));
    }
}
