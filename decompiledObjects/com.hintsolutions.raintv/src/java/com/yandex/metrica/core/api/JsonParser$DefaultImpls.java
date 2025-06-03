/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.core.api.JsonParser
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.Intrinsics
 *  org.json.JSONObject
 */
package com.yandex.metrica.core.api;

import com.yandex.metrica.core.api.JsonParser;
import com.yandex.metrica.core.api.Parser;
import com.yandex.metrica.core.api.Parser$DefaultImpls;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class JsonParser$DefaultImpls {
    public static Object parseOrNull(JsonParser jsonParser, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter((Object)jSONObject, (String)"rawData");
        return Parser$DefaultImpls.parseOrNull((Parser)jsonParser, jSONObject);
    }
}

