/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.flutter.plugin.editing;

import org.json.JSONException;
import org.json.JSONObject;
import t5.b;

public final class o {
    public CharSequence a;
    public CharSequence b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public o(CharSequence charSequence, int n8, int n9, int n10, int n11) {
        this.e = n8;
        this.f = n9;
        this.g = n10;
        this.h = n11;
        this.a(charSequence, "", -1, -1);
    }

    public o(CharSequence charSequence, int n8, int n9, CharSequence charSequence2, int n10, int n11, int n12, int n13) {
        this.e = n10;
        this.f = n11;
        this.g = n12;
        this.h = n13;
        this.a(charSequence, charSequence2.toString(), n8, n9);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int n8, int n9) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = n8;
        this.d = n9;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", (Object)this.a.toString());
            jSONObject.put("deltaText", (Object)this.b.toString());
            jSONObject.put("deltaStart", this.c);
            jSONObject.put("deltaEnd", this.d);
            jSONObject.put("selectionBase", this.e);
            jSONObject.put("selectionExtent", this.f);
            jSONObject.put("composingBase", this.g);
            jSONObject.put("composingExtent", this.h);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unable to create JSONObject: ");
            stringBuilder.append((Object)jSONException);
            b.b("TextEditingDelta", stringBuilder.toString());
            return jSONObject;
        }
    }
}

