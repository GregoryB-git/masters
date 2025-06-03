package S0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC1202y;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;
import g0.AbstractC1297a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements C1201x.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f5827o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5828p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5829q;

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
        this.f5827o = (byte[]) AbstractC1297a.e(parcel.createByteArray());
        this.f5828p = parcel.readString();
        this.f5829q = parcel.readString();
    }

    @Override // d0.C1201x.b
    public void D(C1200w.b bVar) {
        String str = this.f5828p;
        if (str != null) {
            bVar.n0(str);
        }
    }

    @Override // d0.C1201x.b
    public /* synthetic */ byte[] M() {
        return AbstractC1202y.a(this);
    }

    @Override // android.os.Parcelable
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
        return Arrays.equals(this.f5827o, ((c) obj).f5827o);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5827o);
    }

    @Override // d0.C1201x.b
    public /* synthetic */ C1194q s() {
        return AbstractC1202y.b(this);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f5828p, this.f5829q, Integer.valueOf(this.f5827o.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeByteArray(this.f5827o);
        parcel.writeString(this.f5828p);
        parcel.writeString(this.f5829q);
    }

    public c(byte[] bArr, String str, String str2) {
        this.f5827o = bArr;
        this.f5828p = str;
        this.f5829q = str2;
    }
}
