package T0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.M;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: p, reason: collision with root package name */
    public final String f6019p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6020q;

    /* renamed from: r, reason: collision with root package name */
    public final int f6021r;

    /* renamed from: s, reason: collision with root package name */
    public final long f6022s;

    /* renamed from: t, reason: collision with root package name */
    public final long f6023t;

    /* renamed from: u, reason: collision with root package name */
    public final i[] f6024u;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i7) {
            return new c[i7];
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        this.f6019p = (String) M.i(parcel.readString());
        this.f6020q = parcel.readInt();
        this.f6021r = parcel.readInt();
        this.f6022s = parcel.readLong();
        this.f6023t = parcel.readLong();
        int readInt = parcel.readInt();
        this.f6024u = new i[readInt];
        for (int i7 = 0; i7 < readInt; i7++) {
            this.f6024u[i7] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    @Override // T0.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6020q == cVar.f6020q && this.f6021r == cVar.f6021r && this.f6022s == cVar.f6022s && this.f6023t == cVar.f6023t && M.c(this.f6019p, cVar.f6019p) && Arrays.equals(this.f6024u, cVar.f6024u);
    }

    public int hashCode() {
        int i7 = (((((((527 + this.f6020q) * 31) + this.f6021r) * 31) + ((int) this.f6022s)) * 31) + ((int) this.f6023t)) * 31;
        String str = this.f6019p;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6019p);
        parcel.writeInt(this.f6020q);
        parcel.writeInt(this.f6021r);
        parcel.writeLong(this.f6022s);
        parcel.writeLong(this.f6023t);
        parcel.writeInt(this.f6024u.length);
        for (i iVar : this.f6024u) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public c(String str, int i7, int i8, long j7, long j8, i[] iVarArr) {
        super("CHAP");
        this.f6019p = str;
        this.f6020q = i7;
        this.f6021r = i8;
        this.f6022s = j7;
        this.f6023t = j8;
        this.f6024u = iVarArr;
    }
}
