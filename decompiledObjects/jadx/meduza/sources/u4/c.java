package u4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v5.e0;

/* loaded from: classes.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f14942b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14943c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14944d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14945e;
    public final long f;

    /* renamed from: o, reason: collision with root package name */
    public final h[] f14946o;

    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = e0.f15881a;
        this.f14942b = readString;
        this.f14943c = parcel.readInt();
        this.f14944d = parcel.readInt();
        this.f14945e = parcel.readLong();
        this.f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f14946o = new h[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f14946o[i11] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, h[] hVarArr) {
        super("CHAP");
        this.f14942b = str;
        this.f14943c = i10;
        this.f14944d = i11;
        this.f14945e = j10;
        this.f = j11;
        this.f14946o = hVarArr;
    }

    @Override // u4.h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14943c == cVar.f14943c && this.f14944d == cVar.f14944d && this.f14945e == cVar.f14945e && this.f == cVar.f && e0.a(this.f14942b, cVar.f14942b) && Arrays.equals(this.f14946o, cVar.f14946o);
    }

    public final int hashCode() {
        int i10 = (((((((527 + this.f14943c) * 31) + this.f14944d) * 31) + ((int) this.f14945e)) * 31) + ((int) this.f)) * 31;
        String str = this.f14942b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14942b);
        parcel.writeInt(this.f14943c);
        parcel.writeInt(this.f14944d);
        parcel.writeLong(this.f14945e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.f14946o.length);
        for (h hVar : this.f14946o) {
            parcel.writeParcelable(hVar, 0);
        }
    }
}
