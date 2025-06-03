package t6;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import t6.a;

/* loaded from: classes.dex */
public final class h extends n6.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final int f14640a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14641b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14642c;

    public h(int i10, String str, ArrayList arrayList) {
        this.f14640a = i10;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) arrayList.get(i11);
            String str2 = fVar.f14635b;
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = fVar.f14636c;
            m6.j.i(arrayList2);
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) fVar.f14636c.get(i12);
                hashMap2.put(gVar.f14638b, gVar.f14639c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f14641b = hashMap;
        m6.j.i(str);
        this.f14642c = str;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f14641b.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((a.C0230a) map.get((String) it2.next())).f14626r = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f14641b.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) this.f14641b.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f14640a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f14641b.keySet()) {
            arrayList.add(new f(str, (Map) this.f14641b.get(str)));
        }
        z.I(parcel, 2, arrayList, false);
        z.F(parcel, 3, this.f14642c, false);
        z.L(J, parcel);
    }
}
