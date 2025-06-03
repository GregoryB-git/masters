/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.pd;
import com.yandex.metrica.impl.ob.qd;
import com.yandex.metrica.impl.ob.yd;

public class nd
implements pd {
    @NonNull
    private final pd a;
    @NonNull
    private final pd b;

    @VisibleForTesting
    public nd(@NonNull pd pd2, @NonNull pd pd3) {
        this.a = pd2;
        this.b = pd3;
    }

    public static a b() {
        return new Object(new qd(false), new yd(null)){
            @NonNull
            private pd a;
            @NonNull
            private pd b;
            {
                this.a = pd2;
                this.b = pd3;
            }

            public a a(@NonNull ci ci2) {
                this.b = new yd(ci2.E());
                return this;
            }

            public a a(boolean bl2) {
                this.a = new qd(bl2);
                return this;
            }

            public nd a() {
                return new nd(this.a, this.b);
            }
        };
    }

    public a a() {
        return new /* invalid duplicate definition of identical inner class */;
    }

    @Override
    public boolean a(@NonNull String string) {
        boolean bl2 = this.b.a(string) && this.a.a(string);
        return bl2;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("AskForPermissionsStrategy{mLocationFlagStrategy=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", mStartupStateStrategy=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

