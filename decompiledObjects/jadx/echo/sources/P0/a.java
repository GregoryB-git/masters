package P0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC1202y;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;
import g0.AbstractC1297a;

/* loaded from: classes.dex */
public final class a implements C1201x.b {
    public static final Parcelable.Creator<a> CREATOR = new C0079a();

    /* renamed from: o, reason: collision with root package name */
    public final int f4224o;

    /* renamed from: p, reason: collision with root package name */
    public final String f4225p;

    /* renamed from: P0.a$a, reason: collision with other inner class name */
    public class C0079a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) AbstractC1297a.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public a(int i7, String str) {
        this.f4224o = i7;
        this.f4225p = str;
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

    @Override // d0.C1201x.b
    public /* synthetic */ C1194q s() {
        return AbstractC1202y.b(this);
    }

    public String toString() {
        return "Ait(controlCode=" + this.f4224o + ",url=" + this.f4225p + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f4225p);
        parcel.writeInt(this.f4224o);
    }
}
