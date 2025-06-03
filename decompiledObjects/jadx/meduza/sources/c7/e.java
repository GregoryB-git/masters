package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import b.z;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public final class e extends n6.a {
    public static final Parcelable.Creator<e> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    public final b f2402a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2403b;

    /* renamed from: c, reason: collision with root package name */
    public String f2404c;

    public e(b bVar, String str, String str2) {
        m6.j.i(bVar);
        this.f2402a = bVar;
        this.f2404c = str;
        this.f2403b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f2404c;
        if (str == null) {
            if (eVar.f2404c != null) {
                return false;
            }
        } else if (!str.equals(eVar.f2404c)) {
            return false;
        }
        if (!this.f2402a.equals(eVar.f2402a)) {
            return false;
        }
        String str2 = this.f2403b;
        String str3 = eVar.f2403b;
        if (str2 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str2.equals(str3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f2404c;
        int hashCode = this.f2402a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.f2403b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f2402a.f2392b, 11));
            c cVar = this.f2402a.f2393c;
            if (cVar != c.UNKNOWN) {
                jSONObject.put("version", cVar.f2397a);
            }
            List list = this.f2402a.f2394d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.f2404c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f2403b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.E(parcel, 2, this.f2402a, i10, false);
        z.F(parcel, 3, this.f2404c, false);
        z.F(parcel, 4, this.f2403b, false);
        z.L(J, parcel);
    }
}
