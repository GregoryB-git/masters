package m6;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class o0 implements Parcelable.Creator {
    public static void a(com.google.android.gms.common.internal.b bVar, Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.z(parcel, 1, bVar.f2830a);
        b.z.z(parcel, 2, bVar.f2831b);
        b.z.z(parcel, 3, bVar.f2832c);
        b.z.F(parcel, 4, bVar.f2833d, false);
        b.z.y(parcel, 5, bVar.f2834e);
        b.z.H(parcel, 6, bVar.f, i10);
        b.z.v(parcel, 7, bVar.f2835o, false);
        b.z.E(parcel, 8, bVar.f2836p, i10, false);
        b.z.H(parcel, 10, bVar.f2837q, i10);
        b.z.H(parcel, 11, bVar.f2838r, i10);
        b.z.t(parcel, 12, bVar.f2839s);
        b.z.z(parcel, 13, bVar.t);
        b.z.t(parcel, 14, bVar.f2840u);
        b.z.F(parcel, 15, bVar.f2841v, false);
        b.z.L(J, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        Scope[] scopeArr = com.google.android.gms.common.internal.b.f2828w;
        Bundle bundle = new Bundle();
        j6.d[] dVarArr = com.google.android.gms.common.internal.b.f2829x;
        j6.d[] dVarArr2 = dVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = n6.b.o(readInt, parcel);
                    break;
                case 2:
                    i11 = n6.b.o(readInt, parcel);
                    break;
                case 3:
                    i12 = n6.b.o(readInt, parcel);
                    break;
                case 4:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 5:
                    iBinder = n6.b.n(readInt, parcel);
                    break;
                case 6:
                    scopeArr = (Scope[]) n6.b.h(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = n6.b.b(readInt, parcel);
                    break;
                case '\b':
                    account = (Account) n6.b.e(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    n6.b.t(readInt, parcel);
                    break;
                case '\n':
                    dVarArr = (j6.d[]) n6.b.h(parcel, readInt, j6.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (j6.d[]) n6.b.h(parcel, readInt, j6.d.CREATOR);
                    break;
                case '\f':
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case '\r':
                    i13 = n6.b.o(readInt, parcel);
                    break;
                case 14:
                    z11 = n6.b.k(readInt, parcel);
                    break;
                case 15:
                    str2 = n6.b.f(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new com.google.android.gms.common.internal.b(i10, i11, i12, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new com.google.android.gms.common.internal.b[i10];
    }
}
