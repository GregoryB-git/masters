package T0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.M;

/* loaded from: classes.dex */
public final class o extends i {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: p, reason: collision with root package name */
    public final String f6057p;

    /* renamed from: q, reason: collision with root package name */
    public final String f6058q;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o[] newArray(int i7) {
            return new o[i7];
        }
    }

    public o(Parcel parcel) {
        super((String) M.i(parcel.readString()));
        this.f6057p = parcel.readString();
        this.f6058q = (String) M.i(parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f6042o.equals(oVar.f6042o) && M.c(this.f6057p, oVar.f6057p) && M.c(this.f6058q, oVar.f6058q);
    }

    public int hashCode() {
        int hashCode = (527 + this.f6042o.hashCode()) * 31;
        String str = this.f6057p;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6058q;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // T0.i
    public String toString() {
        return this.f6042o + ": url=" + this.f6058q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6042o);
        parcel.writeString(this.f6057p);
        parcel.writeString(this.f6058q);
    }

    public o(String str, String str2, String str3) {
        super(str);
        this.f6057p = str2;
        this.f6058q = str3;
    }
}
