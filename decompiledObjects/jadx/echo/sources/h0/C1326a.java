package h0;

import a3.f;
import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC1202y;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;
import g0.M;
import java.util.Arrays;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1326a implements C1201x.b {
    public static final Parcelable.Creator<C1326a> CREATOR = new C0212a();

    /* renamed from: o, reason: collision with root package name */
    public final String f14515o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f14516p;

    /* renamed from: q, reason: collision with root package name */
    public final int f14517q;

    /* renamed from: r, reason: collision with root package name */
    public final int f14518r;

    /* renamed from: h0.a$a, reason: collision with other inner class name */
    public class C0212a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1326a createFromParcel(Parcel parcel) {
            return new C1326a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1326a[] newArray(int i7) {
            return new C1326a[i7];
        }
    }

    public C1326a(Parcel parcel) {
        this.f14515o = (String) M.i(parcel.readString());
        this.f14516p = (byte[]) M.i(parcel.createByteArray());
        this.f14517q = parcel.readInt();
        this.f14518r = parcel.readInt();
    }

    @Override // d0.C1201x.b
    public /* synthetic */ void D(C1200w.b bVar) {
        AbstractC1202y.c(this, bVar);
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
        if (obj == null || C1326a.class != obj.getClass()) {
            return false;
        }
        C1326a c1326a = (C1326a) obj;
        return this.f14515o.equals(c1326a.f14515o) && Arrays.equals(this.f14516p, c1326a.f14516p) && this.f14517q == c1326a.f14517q && this.f14518r == c1326a.f14518r;
    }

    public int hashCode() {
        return ((((((527 + this.f14515o.hashCode()) * 31) + Arrays.hashCode(this.f14516p)) * 31) + this.f14517q) * 31) + this.f14518r;
    }

    @Override // d0.C1201x.b
    public /* synthetic */ C1194q s() {
        return AbstractC1202y.b(this);
    }

    public String toString() {
        int i7 = this.f14518r;
        return "mdta: key=" + this.f14515o + ", value=" + (i7 != 1 ? i7 != 23 ? i7 != 67 ? M.f1(this.f14516p) : String.valueOf(f.g(this.f14516p)) : String.valueOf(Float.intBitsToFloat(f.g(this.f14516p))) : M.H(this.f14516p));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f14515o);
        parcel.writeByteArray(this.f14516p);
        parcel.writeInt(this.f14517q);
        parcel.writeInt(this.f14518r);
    }

    public /* synthetic */ C1326a(Parcel parcel, C0212a c0212a) {
        this(parcel);
    }

    public C1326a(String str, byte[] bArr, int i7, int i8) {
        this.f14515o = str;
        this.f14516p = bArr;
        this.f14517q = i7;
        this.f14518r = i8;
    }
}
