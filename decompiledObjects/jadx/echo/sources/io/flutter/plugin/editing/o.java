package io.flutter.plugin.editing;

import org.json.JSONException;
import org.json.JSONObject;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f15049a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f15050b;

    /* renamed from: c, reason: collision with root package name */
    public int f15051c;

    /* renamed from: d, reason: collision with root package name */
    public int f15052d;

    /* renamed from: e, reason: collision with root package name */
    public int f15053e;

    /* renamed from: f, reason: collision with root package name */
    public int f15054f;

    /* renamed from: g, reason: collision with root package name */
    public int f15055g;

    /* renamed from: h, reason: collision with root package name */
    public int f15056h;

    public o(CharSequence charSequence, int i7, int i8, int i9, int i10) {
        this.f15053e = i7;
        this.f15054f = i8;
        this.f15055g = i9;
        this.f15056h = i10;
        a(charSequence, "", -1, -1);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i7, int i8) {
        this.f15049a = charSequence;
        this.f15050b = charSequence2;
        this.f15051c = i7;
        this.f15052d = i8;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f15049a.toString());
            jSONObject.put("deltaText", this.f15050b.toString());
            jSONObject.put("deltaStart", this.f15051c);
            jSONObject.put("deltaEnd", this.f15052d);
            jSONObject.put("selectionBase", this.f15053e);
            jSONObject.put("selectionExtent", this.f15054f);
            jSONObject.put("composingBase", this.f15055g);
            jSONObject.put("composingExtent", this.f15056h);
        } catch (JSONException e7) {
            AbstractC1995b.b("TextEditingDelta", "unable to create JSONObject: " + e7);
        }
        return jSONObject;
    }

    public o(CharSequence charSequence, int i7, int i8, CharSequence charSequence2, int i9, int i10, int i11, int i12) {
        this.f15053e = i9;
        this.f15054f = i10;
        this.f15055g = i11;
        this.f15056h = i12;
        a(charSequence, charSequence2.toString(), i7, i8);
    }
}
