package A2;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import x2.C2190d;

/* loaded from: classes.dex */
public final class d0 implements Parcelable.Creator {
    public static void a(C0320f c0320f, Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.i(parcel, 1, c0320f.f471o);
        B2.c.i(parcel, 2, c0320f.f472p);
        B2.c.i(parcel, 3, c0320f.f473q);
        B2.c.n(parcel, 4, c0320f.f474r, false);
        B2.c.h(parcel, 5, c0320f.f475s, false);
        B2.c.p(parcel, 6, c0320f.f476t, i7, false);
        B2.c.e(parcel, 7, c0320f.f477u, false);
        B2.c.m(parcel, 8, c0320f.f478v, i7, false);
        B2.c.p(parcel, 10, c0320f.f479w, i7, false);
        B2.c.p(parcel, 11, c0320f.f480x, i7, false);
        B2.c.c(parcel, 12, c0320f.f481y);
        B2.c.i(parcel, 13, c0320f.f482z);
        B2.c.c(parcel, 14, c0320f.f469A);
        B2.c.n(parcel, 15, c0320f.a(), false);
        B2.c.b(parcel, a7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        Scope[] scopeArr = C0320f.f467C;
        Bundle bundle = new Bundle();
        C2190d[] c2190dArr = C0320f.f468D;
        C2190d[] c2190dArr2 = c2190dArr;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z7 = false;
        int i10 = 0;
        boolean z8 = false;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            switch (B2.b.i(n7)) {
                case 1:
                    i7 = B2.b.p(parcel, n7);
                    break;
                case 2:
                    i8 = B2.b.p(parcel, n7);
                    break;
                case 3:
                    i9 = B2.b.p(parcel, n7);
                    break;
                case 4:
                    str = B2.b.d(parcel, n7);
                    break;
                case 5:
                    iBinder = B2.b.o(parcel, n7);
                    break;
                case 6:
                    scopeArr = (Scope[]) B2.b.f(parcel, n7, Scope.CREATOR);
                    break;
                case 7:
                    bundle = B2.b.a(parcel, n7);
                    break;
                case 8:
                    account = (Account) B2.b.c(parcel, n7, Account.CREATOR);
                    break;
                case 9:
                default:
                    B2.b.t(parcel, n7);
                    break;
                case 10:
                    c2190dArr = (C2190d[]) B2.b.f(parcel, n7, C2190d.CREATOR);
                    break;
                case 11:
                    c2190dArr2 = (C2190d[]) B2.b.f(parcel, n7, C2190d.CREATOR);
                    break;
                case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    z7 = B2.b.j(parcel, n7);
                    break;
                case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    i10 = B2.b.p(parcel, n7);
                    break;
                case 14:
                    z8 = B2.b.j(parcel, n7);
                    break;
                case 15:
                    str2 = B2.b.d(parcel, n7);
                    break;
            }
        }
        B2.b.h(parcel, u7);
        return new C0320f(i7, i8, i9, str, iBinder, scopeArr, bundle, account, c2190dArr, c2190dArr2, z7, i10, z8, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0320f[i7];
    }
}
