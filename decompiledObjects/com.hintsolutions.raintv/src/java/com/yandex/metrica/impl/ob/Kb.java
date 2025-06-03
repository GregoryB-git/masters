/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.FeatureInfo
 *  androidx.annotation.NonNull
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.lb;

public abstract class kb {
    public lb a(@NonNull FeatureInfo featureInfo) {
        if (featureInfo.name == null) {
            int n4 = featureInfo.reqGlEsVersion;
            if (n4 == 0) {
                return this.b(featureInfo);
            }
            return new lb("openGlFeature", n4, this.c(featureInfo));
        }
        return this.b(featureInfo);
    }

    public abstract lb b(FeatureInfo var1);

    public boolean c(FeatureInfo featureInfo) {
        int n4 = featureInfo.flags;
        boolean bl = true;
        if ((n4 & 1) == 0) {
            bl = false;
        }
        return bl;
    }
}

