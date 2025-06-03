package x0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import x0.y;

/* loaded from: classes.dex */
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<String> f16518a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<String> f16519b;

    /* renamed from: c, reason: collision with root package name */
    public b[] f16520c;

    /* renamed from: d, reason: collision with root package name */
    public int f16521d;

    /* renamed from: e, reason: collision with root package name */
    public String f16522e;
    public ArrayList<String> f;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<c> f16523o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList<y.k> f16524p;

    public class a implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            return new a0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i10) {
            return new a0[i10];
        }
    }

    public a0() {
        this.f16522e = null;
        this.f = new ArrayList<>();
        this.f16523o = new ArrayList<>();
    }

    public a0(Parcel parcel) {
        this.f16522e = null;
        this.f = new ArrayList<>();
        this.f16523o = new ArrayList<>();
        this.f16518a = parcel.createStringArrayList();
        this.f16519b = parcel.createStringArrayList();
        this.f16520c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f16521d = parcel.readInt();
        this.f16522e = parcel.readString();
        this.f = parcel.createStringArrayList();
        this.f16523o = parcel.createTypedArrayList(c.CREATOR);
        this.f16524p = parcel.createTypedArrayList(y.k.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f16518a);
        parcel.writeStringList(this.f16519b);
        parcel.writeTypedArray(this.f16520c, i10);
        parcel.writeInt(this.f16521d);
        parcel.writeString(this.f16522e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.f16523o);
        parcel.writeTypedList(this.f16524p);
    }
}
