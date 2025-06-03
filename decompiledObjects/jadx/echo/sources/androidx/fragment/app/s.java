package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    public Bundle f9526A;

    /* renamed from: o, reason: collision with root package name */
    public final String f9527o;

    /* renamed from: p, reason: collision with root package name */
    public final String f9528p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f9529q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9530r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9531s;

    /* renamed from: t, reason: collision with root package name */
    public final String f9532t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f9533u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f9534v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f9535w;

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f9536x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f9537y;

    /* renamed from: z, reason: collision with root package name */
    public final int f9538z;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s[] newArray(int i7) {
            return new s[i7];
        }
    }

    public s(Parcel parcel) {
        this.f9527o = parcel.readString();
        this.f9528p = parcel.readString();
        this.f9529q = parcel.readInt() != 0;
        this.f9530r = parcel.readInt();
        this.f9531s = parcel.readInt();
        this.f9532t = parcel.readString();
        this.f9533u = parcel.readInt() != 0;
        this.f9534v = parcel.readInt() != 0;
        this.f9535w = parcel.readInt() != 0;
        this.f9536x = parcel.readBundle();
        this.f9537y = parcel.readInt() != 0;
        this.f9526A = parcel.readBundle();
        this.f9538z = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f9527o);
        sb.append(" (");
        sb.append(this.f9528p);
        sb.append(")}:");
        if (this.f9529q) {
            sb.append(" fromLayout");
        }
        if (this.f9531s != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f9531s));
        }
        String str = this.f9532t;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f9532t);
        }
        if (this.f9533u) {
            sb.append(" retainInstance");
        }
        if (this.f9534v) {
            sb.append(" removing");
        }
        if (this.f9535w) {
            sb.append(" detached");
        }
        if (this.f9537y) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9527o);
        parcel.writeString(this.f9528p);
        parcel.writeInt(this.f9529q ? 1 : 0);
        parcel.writeInt(this.f9530r);
        parcel.writeInt(this.f9531s);
        parcel.writeString(this.f9532t);
        parcel.writeInt(this.f9533u ? 1 : 0);
        parcel.writeInt(this.f9534v ? 1 : 0);
        parcel.writeInt(this.f9535w ? 1 : 0);
        parcel.writeBundle(this.f9536x);
        parcel.writeInt(this.f9537y ? 1 : 0);
        parcel.writeBundle(this.f9526A);
        parcel.writeInt(this.f9538z);
    }

    public s(Fragment fragment) {
        this.f9527o = fragment.getClass().getName();
        this.f9528p = fragment.f9280t;
        this.f9529q = fragment.f9237B;
        this.f9530r = fragment.f9246K;
        this.f9531s = fragment.f9247L;
        this.f9532t = fragment.f9248M;
        this.f9533u = fragment.f9251P;
        this.f9534v = fragment.f9236A;
        this.f9535w = fragment.f9250O;
        this.f9536x = fragment.f9281u;
        this.f9537y = fragment.f9249N;
        this.f9538z = fragment.f9267f0.ordinal();
    }
}
