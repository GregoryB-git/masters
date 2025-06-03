package x0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import x0.g0;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16525a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f16526b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f16527c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f16528d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16529e;
    public final String f;

    /* renamed from: o, reason: collision with root package name */
    public final int f16530o;

    /* renamed from: p, reason: collision with root package name */
    public final int f16531p;

    /* renamed from: q, reason: collision with root package name */
    public final CharSequence f16532q;

    /* renamed from: r, reason: collision with root package name */
    public final int f16533r;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f16534s;
    public final ArrayList<String> t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList<String> f16535u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f16536v;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(Parcel parcel) {
        this.f16525a = parcel.createIntArray();
        this.f16526b = parcel.createStringArrayList();
        this.f16527c = parcel.createIntArray();
        this.f16528d = parcel.createIntArray();
        this.f16529e = parcel.readInt();
        this.f = parcel.readString();
        this.f16530o = parcel.readInt();
        this.f16531p = parcel.readInt();
        this.f16532q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f16533r = parcel.readInt();
        this.f16534s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.t = parcel.createStringArrayList();
        this.f16535u = parcel.createStringArrayList();
        this.f16536v = parcel.readInt() != 0;
    }

    public b(x0.a aVar) {
        int size = aVar.f16616a.size();
        this.f16525a = new int[size * 6];
        if (!aVar.f16621g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f16526b = new ArrayList<>(size);
        this.f16527c = new int[size];
        this.f16528d = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            g0.a aVar2 = aVar.f16616a.get(i10);
            int i12 = i11 + 1;
            this.f16525a[i11] = aVar2.f16630a;
            ArrayList<String> arrayList = this.f16526b;
            i iVar = aVar2.f16631b;
            arrayList.add(iVar != null ? iVar.mWho : null);
            int[] iArr = this.f16525a;
            int i13 = i12 + 1;
            iArr[i12] = aVar2.f16632c ? 1 : 0;
            int i14 = i13 + 1;
            iArr[i13] = aVar2.f16633d;
            int i15 = i14 + 1;
            iArr[i14] = aVar2.f16634e;
            int i16 = i15 + 1;
            iArr[i15] = aVar2.f;
            iArr[i16] = aVar2.f16635g;
            this.f16527c[i10] = aVar2.f16636h.ordinal();
            this.f16528d[i10] = aVar2.f16637i.ordinal();
            i10++;
            i11 = i16 + 1;
        }
        this.f16529e = aVar.f;
        this.f = aVar.f16622h;
        this.f16530o = aVar.f16517r;
        this.f16531p = aVar.f16623i;
        this.f16532q = aVar.f16624j;
        this.f16533r = aVar.f16625k;
        this.f16534s = aVar.f16626l;
        this.t = aVar.f16627m;
        this.f16535u = aVar.f16628n;
        this.f16536v = aVar.f16629o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f16525a);
        parcel.writeStringList(this.f16526b);
        parcel.writeIntArray(this.f16527c);
        parcel.writeIntArray(this.f16528d);
        parcel.writeInt(this.f16529e);
        parcel.writeString(this.f);
        parcel.writeInt(this.f16530o);
        parcel.writeInt(this.f16531p);
        TextUtils.writeToParcel(this.f16532q, parcel, 0);
        parcel.writeInt(this.f16533r);
        TextUtils.writeToParcel(this.f16534s, parcel, 0);
        parcel.writeStringList(this.t);
        parcel.writeStringList(this.f16535u);
        parcel.writeInt(this.f16536v ? 1 : 0);
    }
}
