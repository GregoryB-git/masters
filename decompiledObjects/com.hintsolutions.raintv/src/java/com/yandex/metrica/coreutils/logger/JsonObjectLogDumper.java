/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.yandex.metrica.coreutils.logger;

import androidx.annotation.NonNull;
import com.yandex.metrica.coreutils.logger.IObjectLogDumper;
import org.json.JSONObject;

class JsonObjectLogDumper
implements IObjectLogDumper<JSONObject> {
    private static final String DUMP_EXCEPTION_MESSAGE = "Exception during dumping JSONObject";
    public static final int JSON_INDENT_SPACES = 2;

    @Override
    public String dumpObject(@NonNull JSONObject object) {
        try {
            object = object.toString(2);
            return object;
        }
        catch (Throwable throwable) {
            return DUMP_EXCEPTION_MESSAGE;
        }
    }
}

