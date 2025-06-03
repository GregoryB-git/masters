/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Nl;
import com.yandex.metrica.impl.ob.Om;
import java.util.Map;
import org.json.JSONObject;

public class x0 {
    private Nl a = new Nl();
    private Om b;

    public x0(Om om2) {
        this.b = om2;
    }

    @Nullable
    public String a() {
        String string = this.a.isEmpty() ? null : new JSONObject((Map)this.a).toString();
        return string;
    }

    public void a(String string, String string2) {
        this.b.b(this.a, string, string2);
    }
}

