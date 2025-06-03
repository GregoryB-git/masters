package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        int i10 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    pendingIntent = (PendingIntent) n6.b.e(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 2:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 3:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    arrayList = n6.b.g(readInt, parcel);
                    break;
                case 5:
                    str3 = n6.b.f(readInt, parcel);
                    break;
                case 6:
                    i10 = n6.b.o(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new SaveAccountLinkingTokenRequest(pendingIntent, str, str2, arrayList, str3, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SaveAccountLinkingTokenRequest[i10];
    }
}
