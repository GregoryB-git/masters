/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri$Builder
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.mb;
import com.yandex.metrica.impl.ob.sb;
import com.yandex.metrica.networktasks.api.IParamsAppender;

public class Ag
implements IParamsAppender {
    private void a(@NonNull Uri.Builder builder, @NonNull String string2, @NonNull String string3, @Nullable mb mb2) {
        String string4 = "";
        if (mb2 == null) {
            builder.appendQueryParameter(string2, "");
            builder.appendQueryParameter(string3, "");
        } else {
            String string5;
            String string6 = string5 = mb2.b;
            if (string5 == null) {
                string6 = "";
            }
            builder.appendQueryParameter(string2, string6);
            string2 = mb2.c;
            string2 = string2 == null ? string4 : (string2.booleanValue() ? "1" : "0");
            builder.appendQueryParameter(string3, string2);
        }
    }

    public void a(@NonNull Uri.Builder builder, @NonNull sb sb2) {
        this.a(builder, "adv_id", "limit_ad_tracking", sb2.a().a);
        this.a(builder, "oaid", "limit_oaid_tracking", sb2.b().a);
        this.a(builder, "yandex_adv_id", "limit_yandex_adv_id_tracking", sb2.c().a);
    }
}

