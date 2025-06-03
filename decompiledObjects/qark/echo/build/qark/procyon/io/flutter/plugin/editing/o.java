// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.editing;

import org.json.JSONException;
import t5.b;
import org.json.JSONObject;

public final class o
{
    public CharSequence a;
    public CharSequence b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    
    public o(final CharSequence charSequence, final int e, final int f, final int g, final int h) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.a(charSequence, "", -1, -1);
    }
    
    public o(final CharSequence charSequence, final int n, final int n2, final CharSequence charSequence2, final int e, final int f, final int g, final int h) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.a(charSequence, charSequence2.toString(), n, n2);
    }
    
    public final void a(final CharSequence a, final CharSequence b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public JSONObject b() {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("oldText", (Object)this.a.toString());
            jsonObject.put("deltaText", (Object)this.b.toString());
            jsonObject.put("deltaStart", this.c);
            jsonObject.put("deltaEnd", this.d);
            jsonObject.put("selectionBase", this.e);
            jsonObject.put("selectionExtent", this.f);
            jsonObject.put("composingBase", this.g);
            jsonObject.put("composingExtent", this.h);
            return jsonObject;
        }
        catch (JSONException obj) {
            final StringBuilder sb = new StringBuilder();
            sb.append("unable to create JSONObject: ");
            sb.append(obj);
            t5.b.b("TextEditingDelta", sb.toString());
            return jsonObject;
        }
    }
}
