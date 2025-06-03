package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import m6.o0;

/* loaded from: classes.dex */
public final class b extends n6.a {
    public static final Parcelable.Creator<b> CREATOR = new o0();

    /* renamed from: w, reason: collision with root package name */
    public static final Scope[] f2828w = new Scope[0];

    /* renamed from: x, reason: collision with root package name */
    public static final j6.d[] f2829x = new j6.d[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f2830a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2831b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2832c;

    /* renamed from: d, reason: collision with root package name */
    public String f2833d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f2834e;
    public Scope[] f;

    /* renamed from: o, reason: collision with root package name */
    public Bundle f2835o;

    /* renamed from: p, reason: collision with root package name */
    public Account f2836p;

    /* renamed from: q, reason: collision with root package name */
    public j6.d[] f2837q;

    /* renamed from: r, reason: collision with root package name */
    public j6.d[] f2838r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f2839s;
    public final int t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2840u;

    /* renamed from: v, reason: collision with root package name */
    public final String f2841v;

    public b(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, j6.d[] dVarArr, j6.d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f2828w : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? f2829x : dVarArr;
        dVarArr2 = dVarArr2 == null ? f2829x : dVarArr2;
        this.f2830a = i10;
        this.f2831b = i11;
        this.f2832c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f2833d = "com.google.android.gms";
        } else {
            this.f2833d = str;
        }
        if (i10 < 2) {
            this.f2836p = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.f2834e = iBinder;
            this.f2836p = account;
        }
        this.f = scopeArr;
        this.f2835o = bundle;
        this.f2837q = dVarArr;
        this.f2838r = dVarArr2;
        this.f2839s = z10;
        this.t = i13;
        this.f2840u = z11;
        this.f2841v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        o0.a(this, parcel, i10);
    }
}
