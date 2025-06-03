/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.internal.measurement;

import W2.s;
import android.content.Context;
import com.google.android.gms.internal.measurement.Z2;

public final class x2
extends Z2 {
    public final Context a;
    public final s b;

    public x2(Context context, s s8) {
        if (context != null) {
            this.a = context;
            this.b = s8;
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

    public final boolean equals(Object object) {
        Object object2;
        if (object == this) {
            return true;
        }
        if (object instanceof Z2 && this.a.equals((Object)(object2 = (Z2)object).a())) {
            object = this.b;
            object2 = object2.b();
            if (object == null ? object2 == null : object.equals(object2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n8 = this.a.hashCode();
        s s8 = this.b;
        int n9 = s8 == null ? 0 : s8.hashCode();
        return (n8 ^ 1000003) * 1000003 ^ n9;
    }

    public final String toString() {
        String string2 = String.valueOf((Object)this.a);
        String string3 = String.valueOf((Object)this.b);
        StringBuilder stringBuilder = new StringBuilder("FlagsContext{context=");
        stringBuilder.append(string2);
        stringBuilder.append(", hermeticFileOverrides=");
        stringBuilder.append(string3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

