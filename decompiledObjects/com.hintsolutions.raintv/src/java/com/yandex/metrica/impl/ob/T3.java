/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  com.yandex.metrica.impl.ob.Gl
 *  com.yandex.metrica.impl.ob.h2
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.W;
import com.yandex.metrica.impl.ob.h2;
import java.util.Map;

public final class t3
implements W<Map<String, ? extends String>> {
    public Object invoke(Object object) {
        String string = ((ContentValues)object).getAsString("clids");
        if (!Gl.d((Map)(object = Gl.d((String)string)))) {
            h2.b((String)z2.p("Passed clids (", string, ") are invalid."), (Object[])new Object[0]);
            object = null;
        }
        return object;
    }
}

