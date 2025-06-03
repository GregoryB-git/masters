package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f9510o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f9511p;

    /* renamed from: q, reason: collision with root package name */
    public C0780b[] f9512q;

    /* renamed from: r, reason: collision with root package name */
    public int f9513r;

    /* renamed from: s, reason: collision with root package name */
    public String f9514s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f9515t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f9516u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f9517v;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i7) {
            return new p[i7];
        }
    }

    public p() {
        this.f9514s = null;
        this.f9515t = new ArrayList();
        this.f9516u = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeTypedList(this.f9510o);
        parcel.writeStringList(this.f9511p);
        parcel.writeTypedArray(this.f9512q, i7);
        parcel.writeInt(this.f9513r);
        parcel.writeString(this.f9514s);
        parcel.writeStringList(this.f9515t);
        parcel.writeTypedList(this.f9516u);
        parcel.writeTypedList(this.f9517v);
    }

    public p(Parcel parcel) {
        this.f9514s = null;
        this.f9515t = new ArrayList();
        this.f9516u = new ArrayList();
        this.f9510o = parcel.createTypedArrayList(s.CREATOR);
        this.f9511p = parcel.createStringArrayList();
        this.f9512q = (C0780b[]) parcel.createTypedArray(C0780b.CREATOR);
        this.f9513r = parcel.readInt();
        this.f9514s = parcel.readString();
        this.f9515t = parcel.createStringArrayList();
        this.f9516u = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f9517v = parcel.createTypedArrayList(n.m.CREATOR);
    }
}
