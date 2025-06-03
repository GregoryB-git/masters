/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package R2;

import R2.D;
import R2.I;
import android.os.Bundle;

public final class c2 {
    public String a;
    public String b;
    public long c;
    public Bundle d;

    public c2(String string2, String string3, Bundle bundle, long l8) {
        this.a = string2;
        this.b = string3;
        string2 = bundle;
        if (bundle == null) {
            string2 = new Bundle();
        }
        this.d = string2;
        this.c = l8;
    }

    public static c2 b(I i8) {
        return new c2(i8.o, i8.q, i8.p.g(), i8.r);
    }

    public final I a() {
        return new I(this.a, new D(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        String string2 = this.b;
        String string3 = this.a;
        String string4 = String.valueOf((Object)this.d);
        StringBuilder stringBuilder = new StringBuilder("origin=");
        stringBuilder.append(string2);
        stringBuilder.append(",name=");
        stringBuilder.append(string3);
        stringBuilder.append(",params=");
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }
}

