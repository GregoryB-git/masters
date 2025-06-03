/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

public class gi {
    public final long a;

    public gi(long l5) {
        this.a = l5;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && gi.class == object.getClass()) {
            object = (gi)object;
            if (this.a != ((gi)object).a) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public int hashCode() {
        long l5 = this.a;
        return (int)(l5 ^ l5 >>> 32);
    }

    public String toString() {
        return a.o(z2.t("StatSending{disabledReportingInterval="), this.a, '}');
    }
}

