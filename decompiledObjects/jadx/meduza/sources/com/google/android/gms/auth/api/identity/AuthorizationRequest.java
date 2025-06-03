package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d6.n;
import java.util.Arrays;
import java.util.List;
import m6.h;
import m6.j;
import n6.a;

/* loaded from: classes.dex */
public class AuthorizationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    public final List f2750a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2751b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2752c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2753d;

    /* renamed from: e, reason: collision with root package name */
    public final Account f2754e;
    public final String f;

    /* renamed from: o, reason: collision with root package name */
    public final String f2755o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2756p;

    public AuthorizationRequest(List list, String str, boolean z10, boolean z11, Account account, String str2, String str3, boolean z12) {
        j.a("requestedScopes cannot be null or empty", (list == null || list.isEmpty()) ? false : true);
        this.f2750a = list;
        this.f2751b = str;
        this.f2752c = z10;
        this.f2753d = z11;
        this.f2754e = account;
        this.f = str2;
        this.f2755o = str3;
        this.f2756p = z12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        return this.f2750a.size() == authorizationRequest.f2750a.size() && this.f2750a.containsAll(authorizationRequest.f2750a) && this.f2752c == authorizationRequest.f2752c && this.f2756p == authorizationRequest.f2756p && this.f2753d == authorizationRequest.f2753d && h.a(this.f2751b, authorizationRequest.f2751b) && h.a(this.f2754e, authorizationRequest.f2754e) && h.a(this.f, authorizationRequest.f) && h.a(this.f2755o, authorizationRequest.f2755o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2750a, this.f2751b, Boolean.valueOf(this.f2752c), Boolean.valueOf(this.f2756p), Boolean.valueOf(this.f2753d), this.f2754e, this.f, this.f2755o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.I(parcel, 1, this.f2750a, false);
        z.F(parcel, 2, this.f2751b, false);
        z.t(parcel, 3, this.f2752c);
        z.t(parcel, 4, this.f2753d);
        z.E(parcel, 5, this.f2754e, i10, false);
        z.F(parcel, 6, this.f, false);
        z.F(parcel, 7, this.f2755o, false);
        z.t(parcel, 8, this.f2756p);
        z.L(J, parcel);
    }
}
