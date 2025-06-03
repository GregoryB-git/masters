/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Uk;
import com.yandex.metrica.impl.ob.el;
import com.yandex.metrica.impl.ob.nk;
import org.json.JSONArray;
import org.json.JSONObject;

public class Ok
extends el {
    @NonNull
    public String h;
    public final int i;
    @Nullable
    public Integer j;
    public final boolean k;
    @NonNull
    public final b l;
    @Nullable
    public final Float m;
    @Nullable
    public final Float n;
    @Nullable
    public final Float o;
    @Nullable
    public final String p;
    @Nullable
    public final Boolean q;
    @Nullable
    public final Boolean r;
    @Nullable
    public Integer s;

    public Ok(@NonNull String string2, @NonNull String string3, @Nullable el.b b3, int n2, boolean bl, @NonNull el.a a2, @NonNull String string4, @Nullable Float f3, @Nullable Float f4, @Nullable Float f7, @Nullable String string5, @Nullable Boolean bl2, @Nullable Boolean bl3, boolean bl4, int n3, @NonNull b b4) {
        super(string2, string3, null, n2, bl, el.c.c, a2);
        this.h = string4;
        this.i = n3;
        this.l = b4;
        this.k = bl4;
        this.m = f3;
        this.n = f4;
        this.o = f7;
        this.p = string5;
        this.q = bl2;
        this.r = bl3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    private JSONObject a(@NonNull Uk uk, @NonNull String string2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2;
            boolean bl = uk.a;
            if (bl) {
                jSONObject2 = jSONObject.putOpt("sp", (Object)this.m);
                jSONObject2 = jSONObject2.putOpt("sd", (Object)this.n);
                jSONObject2.putOpt("ss", (Object)this.o);
            }
            if (bl = uk.b) {
                jSONObject.put("rts", (Object)this.s);
            }
            if (bl = uk.d) {
                jSONObject2 = jSONObject.putOpt("c", (Object)this.p);
                jSONObject2 = jSONObject2.putOpt("ib", (Object)this.q);
                jSONObject2.putOpt("ii", (Object)this.r);
            }
            if (bl = uk.c) {
                jSONObject2 = jSONObject.put("vtl", this.i);
                jSONObject2 = jSONObject2.put("iv", this.k);
                jSONObject2.put("tst", (Object)this.l.a);
            }
            int n2 = (jSONObject2 = this.j) != null ? jSONObject2.intValue() : this.h.length();
            bl = uk.g;
            if (!bl) return jSONObject;
            jSONObject.put("tl", string2.length()).put("otl", n2);
            return jSONObject;
        }
        catch (Throwable throwable) {
            return jSONObject;
        }
    }

    @Override
    @Nullable
    public el.b a(@NonNull nk nk2) {
        el.b b3;
        el.b b4 = b3 = this.c;
        if (b3 == null) {
            b4 = nk2.a(this.h);
        }
        return b4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public JSONArray a(@NonNull Uk uk) {
        String string2;
        String string3;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject = new JSONObject();
            string2 = string3 = this.h;
        }
        catch (Throwable throwable) {
            return jSONArray;
        }
        if (string3.length() > uk.l) {
            this.j = this.h.length();
            string2 = this.h.substring(0, uk.l);
        }
        jSONObject.put("t", (Object)"TEXT");
        jSONObject.put("vl", (Object)string2);
        jSONObject.put("i", (Object)this.a(uk, string2));
        jSONArray.put((Object)jSONObject);
        return jSONArray;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = z2.t("TextViewElement{mText='");
        a.B(stringBuilder, this.h, '\'', ", mVisibleTextLength=");
        stringBuilder.append(this.i);
        stringBuilder.append(", mOriginalTextLength=");
        stringBuilder.append((Object)this.j);
        stringBuilder.append(", mIsVisible=");
        stringBuilder.append(this.k);
        stringBuilder.append(", mTextShorteningType=");
        stringBuilder.append((Object)this.l);
        stringBuilder.append(", mSizePx=");
        stringBuilder.append((Object)this.m);
        stringBuilder.append(", mSizeDp=");
        stringBuilder.append((Object)this.n);
        stringBuilder.append(", mSizeSp=");
        stringBuilder.append((Object)this.o);
        stringBuilder.append(", mColor='");
        a.B(stringBuilder, this.p, '\'', ", mIsBold=");
        stringBuilder.append((Object)this.q);
        stringBuilder.append(", mIsItalic=");
        stringBuilder.append((Object)this.r);
        stringBuilder.append(", mRelativeTextSize=");
        stringBuilder.append((Object)this.s);
        stringBuilder.append(", mClassName='");
        a.B(stringBuilder, this.a, '\'', ", mId='");
        a.B(stringBuilder, this.b, '\'', ", mParseFilterReason=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", mDepth=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mListItem=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mViewType=");
        stringBuilder.append((Object)this.f);
        stringBuilder.append(", mClassType=");
        stringBuilder.append((Object)this.g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

