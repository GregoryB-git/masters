package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.v;
import androidx.lifecycle.d;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780b implements Parcelable {
    public static final Parcelable.Creator<C0780b> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f9327A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f9328B;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f9329o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f9330p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f9331q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f9332r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9333s;

    /* renamed from: t, reason: collision with root package name */
    public final String f9334t;

    /* renamed from: u, reason: collision with root package name */
    public final int f9335u;

    /* renamed from: v, reason: collision with root package name */
    public final int f9336v;

    /* renamed from: w, reason: collision with root package name */
    public final CharSequence f9337w;

    /* renamed from: x, reason: collision with root package name */
    public final int f9338x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f9339y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f9340z;

    /* renamed from: androidx.fragment.app.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0780b createFromParcel(Parcel parcel) {
            return new C0780b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0780b[] newArray(int i7) {
            return new C0780b[i7];
        }
    }

    public C0780b(Parcel parcel) {
        this.f9329o = parcel.createIntArray();
        this.f9330p = parcel.createStringArrayList();
        this.f9331q = parcel.createIntArray();
        this.f9332r = parcel.createIntArray();
        this.f9333s = parcel.readInt();
        this.f9334t = parcel.readString();
        this.f9335u = parcel.readInt();
        this.f9336v = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f9337w = (CharSequence) creator.createFromParcel(parcel);
        this.f9338x = parcel.readInt();
        this.f9339y = (CharSequence) creator.createFromParcel(parcel);
        this.f9340z = parcel.createStringArrayList();
        this.f9327A = parcel.createStringArrayList();
        this.f9328B = parcel.readInt() != 0;
    }

    public C0779a a(n nVar) {
        C0779a c0779a = new C0779a(nVar);
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.f9329o.length) {
            v.a aVar = new v.a();
            int i9 = i7 + 1;
            aVar.f9569a = this.f9329o[i7];
            if (n.D0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0779a + " op #" + i8 + " base fragment #" + this.f9329o[i9]);
            }
            String str = (String) this.f9330p.get(i8);
            aVar.f9570b = str != null ? nVar.f0(str) : null;
            aVar.f9575g = d.c.values()[this.f9331q[i8]];
            aVar.f9576h = d.c.values()[this.f9332r[i8]];
            int[] iArr = this.f9329o;
            int i10 = iArr[i9];
            aVar.f9571c = i10;
            int i11 = iArr[i7 + 2];
            aVar.f9572d = i11;
            int i12 = i7 + 4;
            int i13 = iArr[i7 + 3];
            aVar.f9573e = i13;
            i7 += 5;
            int i14 = iArr[i12];
            aVar.f9574f = i14;
            c0779a.f9553d = i10;
            c0779a.f9554e = i11;
            c0779a.f9555f = i13;
            c0779a.f9556g = i14;
            c0779a.e(aVar);
            i8++;
        }
        c0779a.f9557h = this.f9333s;
        c0779a.f9560k = this.f9334t;
        c0779a.f9326v = this.f9335u;
        c0779a.f9558i = true;
        c0779a.f9561l = this.f9336v;
        c0779a.f9562m = this.f9337w;
        c0779a.f9563n = this.f9338x;
        c0779a.f9564o = this.f9339y;
        c0779a.f9565p = this.f9340z;
        c0779a.f9566q = this.f9327A;
        c0779a.f9567r = this.f9328B;
        c0779a.m(1);
        return c0779a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f9329o);
        parcel.writeStringList(this.f9330p);
        parcel.writeIntArray(this.f9331q);
        parcel.writeIntArray(this.f9332r);
        parcel.writeInt(this.f9333s);
        parcel.writeString(this.f9334t);
        parcel.writeInt(this.f9335u);
        parcel.writeInt(this.f9336v);
        TextUtils.writeToParcel(this.f9337w, parcel, 0);
        parcel.writeInt(this.f9338x);
        TextUtils.writeToParcel(this.f9339y, parcel, 0);
        parcel.writeStringList(this.f9340z);
        parcel.writeStringList(this.f9327A);
        parcel.writeInt(this.f9328B ? 1 : 0);
    }

    public C0780b(C0779a c0779a) {
        int size = c0779a.f9552c.size();
        this.f9329o = new int[size * 5];
        if (!c0779a.f9558i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f9330p = new ArrayList(size);
        this.f9331q = new int[size];
        this.f9332r = new int[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            v.a aVar = (v.a) c0779a.f9552c.get(i8);
            int i9 = i7 + 1;
            this.f9329o[i7] = aVar.f9569a;
            ArrayList arrayList = this.f9330p;
            Fragment fragment = aVar.f9570b;
            arrayList.add(fragment != null ? fragment.f9280t : null);
            int[] iArr = this.f9329o;
            iArr[i9] = aVar.f9571c;
            iArr[i7 + 2] = aVar.f9572d;
            int i10 = i7 + 4;
            iArr[i7 + 3] = aVar.f9573e;
            i7 += 5;
            iArr[i10] = aVar.f9574f;
            this.f9331q[i8] = aVar.f9575g.ordinal();
            this.f9332r[i8] = aVar.f9576h.ordinal();
        }
        this.f9333s = c0779a.f9557h;
        this.f9334t = c0779a.f9560k;
        this.f9335u = c0779a.f9326v;
        this.f9336v = c0779a.f9561l;
        this.f9337w = c0779a.f9562m;
        this.f9338x = c0779a.f9563n;
        this.f9339y = c0779a.f9564o;
        this.f9340z = c0779a.f9565p;
        this.f9327A = c0779a.f9566q;
        this.f9328B = c0779a.f9567r;
    }
}
