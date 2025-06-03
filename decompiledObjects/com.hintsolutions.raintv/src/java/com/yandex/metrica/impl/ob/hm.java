/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Im;

public class Hm
implements Im {
    public final int a;

    public Hm(int n2) {
        this.a = n2;
    }

    public static Im a(Im ... imArray) {
        int n2 = imArray.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Im im = imArray[i2];
            int n6 = n3;
            if (im != null) {
                n6 = im.a() + n3;
            }
            n3 = n6;
        }
        return new Hm(n3);
    }

    @Override
    public int a() {
        return this.a;
    }

    public String toString() {
        return a.n(z2.t("BytesTruncatedInfo{bytesTruncated="), this.a, '}');
    }
}

