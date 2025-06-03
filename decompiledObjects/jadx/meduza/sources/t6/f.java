package t6;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import java.util.ArrayList;
import java.util.Map;
import t6.a;

/* loaded from: classes.dex */
public final class f extends n6.a {
    public static final Parcelable.Creator<f> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    public final int f14634a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14635b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14636c;

    public f(int i10, String str, ArrayList arrayList) {
        this.f14634a = i10;
        this.f14635b = str;
        this.f14636c = arrayList;
    }

    public f(String str, Map map) {
        ArrayList arrayList;
        this.f14634a = 1;
        this.f14635b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g((a.C0230a) map.get(str2), str2));
            }
        }
        this.f14636c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f14634a;
        int J = z.J(20293, parcel);
        z.z(parcel, 1, i11);
        z.F(parcel, 2, this.f14635b, false);
        z.I(parcel, 3, this.f14636c, false);
        z.L(J, parcel);
    }
}
