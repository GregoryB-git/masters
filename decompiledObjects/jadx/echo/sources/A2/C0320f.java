package A2;

import A2.InterfaceC0323i;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import x2.C2190d;

/* renamed from: A2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0320f extends B2.a {

    /* renamed from: A, reason: collision with root package name */
    public boolean f469A;

    /* renamed from: B, reason: collision with root package name */
    public String f470B;

    /* renamed from: o, reason: collision with root package name */
    public final int f471o;

    /* renamed from: p, reason: collision with root package name */
    public final int f472p;

    /* renamed from: q, reason: collision with root package name */
    public int f473q;

    /* renamed from: r, reason: collision with root package name */
    public String f474r;

    /* renamed from: s, reason: collision with root package name */
    public IBinder f475s;

    /* renamed from: t, reason: collision with root package name */
    public Scope[] f476t;

    /* renamed from: u, reason: collision with root package name */
    public Bundle f477u;

    /* renamed from: v, reason: collision with root package name */
    public Account f478v;

    /* renamed from: w, reason: collision with root package name */
    public C2190d[] f479w;

    /* renamed from: x, reason: collision with root package name */
    public C2190d[] f480x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f481y;

    /* renamed from: z, reason: collision with root package name */
    public int f482z;

    @NonNull
    public static final Parcelable.Creator<C0320f> CREATOR = new d0();

    /* renamed from: C, reason: collision with root package name */
    public static final Scope[] f467C = new Scope[0];

    /* renamed from: D, reason: collision with root package name */
    public static final C2190d[] f468D = new C2190d[0];

    public C0320f(int i7, int i8, int i9, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C2190d[] c2190dArr, C2190d[] c2190dArr2, boolean z7, int i10, boolean z8, String str2) {
        scopeArr = scopeArr == null ? f467C : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c2190dArr = c2190dArr == null ? f468D : c2190dArr;
        c2190dArr2 = c2190dArr2 == null ? f468D : c2190dArr2;
        this.f471o = i7;
        this.f472p = i8;
        this.f473q = i9;
        if ("com.google.android.gms".equals(str)) {
            this.f474r = "com.google.android.gms";
        } else {
            this.f474r = str;
        }
        if (i7 < 2) {
            this.f478v = iBinder != null ? AbstractBinderC0315a.v(InterfaceC0323i.a.o(iBinder)) : null;
        } else {
            this.f475s = iBinder;
            this.f478v = account;
        }
        this.f476t = scopeArr;
        this.f477u = bundle;
        this.f479w = c2190dArr;
        this.f480x = c2190dArr2;
        this.f481y = z7;
        this.f482z = i10;
        this.f469A = z8;
        this.f470B = str2;
    }

    public final String a() {
        return this.f470B;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        d0.a(this, parcel, i7);
    }
}
