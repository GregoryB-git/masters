/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.Xd
 *  com.yandex.metrica.impl.ob.u0
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.coreutils.logger.BaseLogger;
import com.yandex.metrica.impl.ob.Pl;
import com.yandex.metrica.impl.ob.Xd;
import com.yandex.metrica.impl.ob.u0;
import org.json.JSONObject;

public class be {
    @Nullable
    private Xd a;

    public be(@Nullable PreloadInfo preloadInfo, @NonNull Pl pl2, boolean bl) {
        if (preloadInfo != null) {
            if (TextUtils.isEmpty((CharSequence)preloadInfo.getTrackingId())) {
                if (((BaseLogger)((Object)pl2)).isEnabled()) {
                    ((BaseLogger)((Object)pl2)).e("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.");
                }
            } else {
                this.a = new Xd(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, bl, u0.c);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public JSONObject a(@NonNull JSONObject jSONObject) {
        JSONObject jSONObject2;
        Xd xd2 = this.a;
        if (xd2 == null) return jSONObject;
        try {
            jSONObject2 = new JSONObject();
        }
        catch (Throwable throwable) {
            return jSONObject;
        }
        try {
            jSONObject2.put("trackingId", (Object)xd2.a);
            jSONObject2.put("additionalParams", (Object)xd2.b);
            jSONObject2.put("wasSet", xd2.c);
            jSONObject2.put("autoTracking", xd2.d);
            jSONObject2.put("source", (Object)xd2.e.a());
        }
        catch (Throwable throwable) {}
        jSONObject.put("preloadInfo", (Object)jSONObject2);
        return jSONObject;
    }
}

