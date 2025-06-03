package e7;

import android.os.Parcel;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v6 implements Parcelable.Creator<k6> {
    @Override // android.os.Parcelable.Creator
    public final k6 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        boolean z10 = true;
        boolean z11 = true;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i11 = 0;
        int i12 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        long j17 = -2147483648L;
        int i13 = 100;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str5 = n6.b.f(readInt, parcel);
                    break;
                case 3:
                    str6 = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    str7 = n6.b.f(readInt, parcel);
                    break;
                case 5:
                    str8 = n6.b.f(readInt, parcel);
                    break;
                case 6:
                    j10 = n6.b.q(readInt, parcel);
                    break;
                case 7:
                    j11 = n6.b.q(readInt, parcel);
                    break;
                case '\b':
                    str9 = n6.b.f(readInt, parcel);
                    break;
                case '\t':
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case '\n':
                    z12 = n6.b.k(readInt, parcel);
                    break;
                case 11:
                    j17 = n6.b.q(readInt, parcel);
                    break;
                case '\f':
                    str10 = n6.b.f(readInt, parcel);
                    break;
                case '\r':
                case 17:
                case 20:
                case '!':
                default:
                    n6.b.t(readInt, parcel);
                    break;
                case 14:
                    j12 = n6.b.q(readInt, parcel);
                    break;
                case 15:
                    i10 = n6.b.o(readInt, parcel);
                    break;
                case 16:
                    z11 = n6.b.k(readInt, parcel);
                    break;
                case 18:
                    z13 = n6.b.k(readInt, parcel);
                    break;
                case 19:
                    str11 = n6.b.f(readInt, parcel);
                    break;
                case 21:
                    bool = n6.b.l(readInt, parcel);
                    break;
                case 22:
                    j13 = n6.b.q(readInt, parcel);
                    break;
                case 23:
                    arrayList = n6.b.g(readInt, parcel);
                    break;
                case 24:
                    str12 = n6.b.f(readInt, parcel);
                    break;
                case 25:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 26:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case 27:
                    str13 = n6.b.f(readInt, parcel);
                    break;
                case 28:
                    z14 = n6.b.k(readInt, parcel);
                    break;
                case 29:
                    j14 = n6.b.q(readInt, parcel);
                    break;
                case 30:
                    i13 = n6.b.o(readInt, parcel);
                    break;
                case 31:
                    str3 = n6.b.f(readInt, parcel);
                    break;
                case ' ':
                    i11 = n6.b.o(readInt, parcel);
                    break;
                case '\"':
                    j15 = n6.b.q(readInt, parcel);
                    break;
                case '#':
                    str14 = n6.b.f(readInt, parcel);
                    break;
                case '$':
                    str4 = n6.b.f(readInt, parcel);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    j16 = n6.b.q(readInt, parcel);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    i12 = n6.b.o(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new k6(str5, str6, str7, str8, j10, j11, str9, z10, z12, j17, str10, j12, i10, z11, z13, str11, bool, j13, arrayList, str12, str, str2, str13, z14, j14, i13, str3, i11, j15, str14, str4, j16, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k6[] newArray(int i10) {
        return new k6[i10];
    }
}
