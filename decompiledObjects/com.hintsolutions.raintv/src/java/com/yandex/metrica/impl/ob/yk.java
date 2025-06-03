/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import org.json.JSONObject;

public interface Yk {
    public void onError(@NonNull String var1);

    public void onResult(@NonNull JSONObject var1);
}

