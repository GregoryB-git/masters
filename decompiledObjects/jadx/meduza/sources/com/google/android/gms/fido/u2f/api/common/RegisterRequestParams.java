package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import c7.a;
import c7.d;
import c7.e;
import c7.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m6.h;
import m6.j;

@Deprecated
/* loaded from: classes.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f2880a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f2881b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f2882c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2883d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2884e;
    public final a f;

    /* renamed from: o, reason: collision with root package name */
    public final String f2885o;

    public RegisterRequestParams(Integer num, Double d10, Uri uri, ArrayList arrayList, ArrayList arrayList2, a aVar, String str) {
        this.f2880a = num;
        this.f2881b = d10;
        this.f2882c = uri;
        j.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f2883d = arrayList;
        this.f2884e = arrayList2;
        this.f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            j.a("register request has null appId and no request appId is provided", (uri == null && dVar.f2401d == null) ? false : true);
            String str2 = dVar.f2401d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            e eVar = (e) it2.next();
            j.a("registered key has null appId and no request appId is provided", (uri == null && eVar.f2403b == null) ? false : true);
            String str3 = eVar.f2403b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        j.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f2885o = str;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        return h.a(this.f2880a, registerRequestParams.f2880a) && h.a(this.f2881b, registerRequestParams.f2881b) && h.a(this.f2882c, registerRequestParams.f2882c) && h.a(this.f2883d, registerRequestParams.f2883d) && (((list = this.f2884e) == null && registerRequestParams.f2884e == null) || (list != null && (list2 = registerRequestParams.f2884e) != null && list.containsAll(list2) && registerRequestParams.f2884e.containsAll(this.f2884e))) && h.a(this.f, registerRequestParams.f) && h.a(this.f2885o, registerRequestParams.f2885o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2880a, this.f2882c, this.f2881b, this.f2883d, this.f2884e, this.f, this.f2885o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.B(parcel, 2, this.f2880a);
        z.x(parcel, 3, this.f2881b);
        z.E(parcel, 4, this.f2882c, i10, false);
        z.I(parcel, 5, this.f2883d, false);
        z.I(parcel, 6, this.f2884e, false);
        z.E(parcel, 7, this.f, i10, false);
        z.F(parcel, 8, this.f2885o, false);
        z.L(J, parcel);
    }
}
