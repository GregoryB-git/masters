package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b.z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m6.h;
import m6.j;
import n6.a;
import z5.m;

/* loaded from: classes.dex */
public class TokenData extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    public final int f2742a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2743b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f2744c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2745d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2746e;
    public final List f;

    /* renamed from: o, reason: collision with root package name */
    public final String f2747o;

    public TokenData(int i10, String str, Long l10, boolean z10, boolean z11, ArrayList arrayList, String str2) {
        this.f2742a = i10;
        j.e(str);
        this.f2743b = str;
        this.f2744c = l10;
        this.f2745d = z10;
        this.f2746e = z11;
        this.f = arrayList;
        this.f2747o = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f2743b, tokenData.f2743b) && h.a(this.f2744c, tokenData.f2744c) && this.f2745d == tokenData.f2745d && this.f2746e == tokenData.f2746e && h.a(this.f, tokenData.f) && h.a(this.f2747o, tokenData.f2747o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2743b, this.f2744c, Boolean.valueOf(this.f2745d), Boolean.valueOf(this.f2746e), this.f, this.f2747o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f2742a);
        z.F(parcel, 2, this.f2743b, false);
        z.D(parcel, 3, this.f2744c);
        z.t(parcel, 4, this.f2745d);
        z.t(parcel, 5, this.f2746e);
        z.G(parcel, 6, this.f);
        z.F(parcel, 7, this.f2747o, false);
        z.L(J, parcel);
    }
}
