/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.ie;
import com.yandex.metrica.impl.ob.je;
import com.yandex.metrica.impl.ob.ye;
import com.yandex.metrica.impl.ob.yg;
import org.json.JSONObject;

public class ze
implements ye {
    @NonNull
    private final ie a;

    public ze() {
        this(new ie());
    }

    @VisibleForTesting
    public ze(@NonNull ie ie2) {
        this.a = ie2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public byte[] a(@NonNull je je2, @NonNull yg yg2) {
        if (yg2.T()) return this.a.a(je2, yg2);
        if (TextUtils.isEmpty((CharSequence)je2.b)) return this.a.a(je2, yg2);
        try {
            JSONObject jSONObject = new JSONObject(je2.b);
            jSONObject.remove("preloadInfo");
            je2.b = jSONObject.toString();
        }
        finally {
            return this.a.a(je2, yg2);
        }
    }
}

