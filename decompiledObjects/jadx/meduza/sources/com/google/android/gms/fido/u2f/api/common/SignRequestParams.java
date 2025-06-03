package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import c7.a;
import c7.e;
import c7.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m6.h;
import m6.j;

@Deprecated
/* loaded from: classes.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f2886a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f2887b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f2888c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2889d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2890e;
    public final a f;

    /* renamed from: o, reason: collision with root package name */
    public final String f2891o;

    public SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, ArrayList arrayList, a aVar, String str) {
        this.f2886a = num;
        this.f2887b = d10;
        this.f2888c = uri;
        this.f2889d = bArr;
        j.a("registeredKeys must not be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f2890e = arrayList;
        this.f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            j.a("registered key has null appId and no request appId is provided", (eVar.f2403b == null && uri == null) ? false : true);
            String str2 = eVar.f2403b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        j.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f2891o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return h.a(this.f2886a, signRequestParams.f2886a) && h.a(this.f2887b, signRequestParams.f2887b) && h.a(this.f2888c, signRequestParams.f2888c) && Arrays.equals(this.f2889d, signRequestParams.f2889d) && this.f2890e.containsAll(signRequestParams.f2890e) && signRequestParams.f2890e.containsAll(this.f2890e) && h.a(this.f, signRequestParams.f) && h.a(this.f2891o, signRequestParams.f2891o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2886a, this.f2888c, this.f2887b, this.f2890e, this.f, this.f2891o, Integer.valueOf(Arrays.hashCode(this.f2889d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.B(parcel, 2, this.f2886a);
        z.x(parcel, 3, this.f2887b);
        z.E(parcel, 4, this.f2888c, i10, false);
        z.w(parcel, 5, this.f2889d, false);
        z.I(parcel, 6, this.f2890e, false);
        z.E(parcel, 7, this.f, i10, false);
        z.F(parcel, 8, this.f2891o, false);
        z.L(J, parcel);
    }
}
