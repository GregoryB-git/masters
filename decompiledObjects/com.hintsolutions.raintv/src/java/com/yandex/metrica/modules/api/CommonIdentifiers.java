/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.jvm.internal.Intrinsics
 */
package com.yandex.metrica.modules.api;

import kotlin.jvm.internal.Intrinsics;

public final class CommonIdentifiers {
    private final String a;
    private final String b;

    public CommonIdentifiers(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public static /* synthetic */ CommonIdentifiers copy$default(CommonIdentifiers commonIdentifiers, String string, String string2, int n7, Object object) {
        if ((n7 & 1) != 0) {
            string = commonIdentifiers.a;
        }
        if ((n7 & 2) != 0) {
            string2 = commonIdentifiers.b;
        }
        return commonIdentifiers.copy(string, string2);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final CommonIdentifiers copy(String string, String string2) {
        return new CommonIdentifiers(string, string2);
    }

    public boolean equals(Object object) {
        block2: {
            block3: {
                if (this == object) break block2;
                if (!(object instanceof CommonIdentifiers)) break block3;
                object = (CommonIdentifiers)object;
                if (Intrinsics.areEqual((Object)this.a, (Object)((CommonIdentifiers)object).a) && Intrinsics.areEqual((Object)this.b, (Object)((CommonIdentifiers)object).b)) break block2;
            }
            return false;
        }
        return true;
    }

    public final String getDevice() {
        return this.b;
    }

    public final String getUuid() {
        return this.a;
    }

    public int hashCode() {
        String string = this.a;
        int n7 = 0;
        int n8 = string != null ? string.hashCode() : 0;
        string = this.b;
        if (string != null) {
            n7 = string.hashCode();
        }
        return n8 * 31 + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("CommonIdentifiers(uuid=");
        stringBuilder.append(this.a);
        stringBuilder.append(", device=");
        return z2.s(stringBuilder, this.b, ")");
    }
}

