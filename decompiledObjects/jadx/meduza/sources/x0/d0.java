package x0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f16549a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16550b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16551c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16552d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16553e;
    public final String f;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f16554o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f16555p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f16556q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f16557r;

    /* renamed from: s, reason: collision with root package name */
    public final int f16558s;
    public final String t;

    /* renamed from: u, reason: collision with root package name */
    public final int f16559u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f16560v;

    public class a implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        public final d0 createFromParcel(Parcel parcel) {
            return new d0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d0[] newArray(int i10) {
            return new d0[i10];
        }
    }

    public d0(Parcel parcel) {
        this.f16549a = parcel.readString();
        this.f16550b = parcel.readString();
        this.f16551c = parcel.readInt() != 0;
        this.f16552d = parcel.readInt();
        this.f16553e = parcel.readInt();
        this.f = parcel.readString();
        this.f16554o = parcel.readInt() != 0;
        this.f16555p = parcel.readInt() != 0;
        this.f16556q = parcel.readInt() != 0;
        this.f16557r = parcel.readInt() != 0;
        this.f16558s = parcel.readInt();
        this.t = parcel.readString();
        this.f16559u = parcel.readInt();
        this.f16560v = parcel.readInt() != 0;
    }

    public d0(i iVar) {
        this.f16549a = iVar.getClass().getName();
        this.f16550b = iVar.mWho;
        this.f16551c = iVar.mFromLayout;
        this.f16552d = iVar.mFragmentId;
        this.f16553e = iVar.mContainerId;
        this.f = iVar.mTag;
        this.f16554o = iVar.mRetainInstance;
        this.f16555p = iVar.mRemoving;
        this.f16556q = iVar.mDetached;
        this.f16557r = iVar.mHidden;
        this.f16558s = iVar.mMaxState.ordinal();
        this.t = iVar.mTargetWho;
        this.f16559u = iVar.mTargetRequestCode;
        this.f16560v = iVar.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f16549a);
        sb2.append(" (");
        sb2.append(this.f16550b);
        sb2.append(")}:");
        if (this.f16551c) {
            sb2.append(" fromLayout");
        }
        if (this.f16553e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f16553e));
        }
        String str = this.f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f);
        }
        if (this.f16554o) {
            sb2.append(" retainInstance");
        }
        if (this.f16555p) {
            sb2.append(" removing");
        }
        if (this.f16556q) {
            sb2.append(" detached");
        }
        if (this.f16557r) {
            sb2.append(" hidden");
        }
        if (this.t != null) {
            sb2.append(" targetWho=");
            sb2.append(this.t);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f16559u);
        }
        if (this.f16560v) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16549a);
        parcel.writeString(this.f16550b);
        parcel.writeInt(this.f16551c ? 1 : 0);
        parcel.writeInt(this.f16552d);
        parcel.writeInt(this.f16553e);
        parcel.writeString(this.f);
        parcel.writeInt(this.f16554o ? 1 : 0);
        parcel.writeInt(this.f16555p ? 1 : 0);
        parcel.writeInt(this.f16556q ? 1 : 0);
        parcel.writeInt(this.f16557r ? 1 : 0);
        parcel.writeInt(this.f16558s);
        parcel.writeString(this.t);
        parcel.writeInt(this.f16559u);
        parcel.writeInt(this.f16560v ? 1 : 0);
    }
}
