package v1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import t.C1958a;

/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f20113d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f20114e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20115f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20116g;

    /* renamed from: h, reason: collision with root package name */
    public final String f20117h;

    /* renamed from: i, reason: collision with root package name */
    public int f20118i;

    /* renamed from: j, reason: collision with root package name */
    public int f20119j;

    /* renamed from: k, reason: collision with root package name */
    public int f20120k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1958a(), new C1958a(), new C1958a());
    }

    @Override // v1.b
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f20114e.writeInt(-1);
        } else {
            this.f20114e.writeInt(bArr.length);
            this.f20114e.writeByteArray(bArr);
        }
    }

    @Override // v1.b
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f20114e, 0);
    }

    @Override // v1.b
    public void E(int i7) {
        this.f20114e.writeInt(i7);
    }

    @Override // v1.b
    public void G(Parcelable parcelable) {
        this.f20114e.writeParcelable(parcelable, 0);
    }

    @Override // v1.b
    public void I(String str) {
        this.f20114e.writeString(str);
    }

    @Override // v1.b
    public void a() {
        int i7 = this.f20118i;
        if (i7 >= 0) {
            int i8 = this.f20113d.get(i7);
            int dataPosition = this.f20114e.dataPosition();
            this.f20114e.setDataPosition(i8);
            this.f20114e.writeInt(dataPosition - i8);
            this.f20114e.setDataPosition(dataPosition);
        }
    }

    @Override // v1.b
    public b b() {
        Parcel parcel = this.f20114e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f20119j;
        if (i7 == this.f20115f) {
            i7 = this.f20116g;
        }
        return new c(parcel, dataPosition, i7, this.f20117h + "  ", this.f20110a, this.f20111b, this.f20112c);
    }

    @Override // v1.b
    public boolean g() {
        return this.f20114e.readInt() != 0;
    }

    @Override // v1.b
    public byte[] i() {
        int readInt = this.f20114e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f20114e.readByteArray(bArr);
        return bArr;
    }

    @Override // v1.b
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f20114e);
    }

    @Override // v1.b
    public boolean m(int i7) {
        while (this.f20119j < this.f20116g) {
            int i8 = this.f20120k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            this.f20114e.setDataPosition(this.f20119j);
            int readInt = this.f20114e.readInt();
            this.f20120k = this.f20114e.readInt();
            this.f20119j += readInt;
        }
        return this.f20120k == i7;
    }

    @Override // v1.b
    public int o() {
        return this.f20114e.readInt();
    }

    @Override // v1.b
    public Parcelable q() {
        return this.f20114e.readParcelable(getClass().getClassLoader());
    }

    @Override // v1.b
    public String s() {
        return this.f20114e.readString();
    }

    @Override // v1.b
    public void w(int i7) {
        a();
        this.f20118i = i7;
        this.f20113d.put(i7, this.f20114e.dataPosition());
        E(0);
        E(i7);
    }

    @Override // v1.b
    public void y(boolean z7) {
        this.f20114e.writeInt(z7 ? 1 : 0);
    }

    public c(Parcel parcel, int i7, int i8, String str, C1958a c1958a, C1958a c1958a2, C1958a c1958a3) {
        super(c1958a, c1958a2, c1958a3);
        this.f20113d = new SparseIntArray();
        this.f20118i = -1;
        this.f20120k = -1;
        this.f20114e = parcel;
        this.f20115f = i7;
        this.f20116g = i8;
        this.f20119j = i7;
        this.f20117h = str;
    }
}
