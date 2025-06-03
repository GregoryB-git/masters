// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.s;
import android.content.Context;

public final class x2 extends Z2
{
    public final Context a;
    public final s b;
    
    public x2(final Context a, final s b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null context");
    }
    
    @Override
    public final Context a() {
        return this.a;
    }
    
    @Override
    public final s b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Z2) {
            final Z2 z2 = (Z2)o;
            if (this.a.equals(z2.a())) {
                final s b = this.b;
                final s b2 = z2.b();
                if (b == null) {
                    if (b2 == null) {
                        return true;
                    }
                }
                else if (b.equals(b2)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final s b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ hashCode2;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("FlagsContext{context=");
        sb.append(value);
        sb.append(", hermeticFileOverrides=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
