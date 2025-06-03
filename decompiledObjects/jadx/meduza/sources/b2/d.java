package b2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import defpackage.g;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1814d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1815e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1816g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1817h;

    /* renamed from: i, reason: collision with root package name */
    public int f1818i;

    /* renamed from: j, reason: collision with root package name */
    public int f1819j;

    /* renamed from: k, reason: collision with root package name */
    public int f1820k;

    public d(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new r.b(), new r.b(), new r.b());
    }

    public d(Parcel parcel, int i10, int i11, String str, r.b<String, Method> bVar, r.b<String, Method> bVar2, r.b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f1814d = new SparseIntArray();
        this.f1818i = -1;
        this.f1820k = -1;
        this.f1815e = parcel;
        this.f = i10;
        this.f1816g = i11;
        this.f1819j = i10;
        this.f1817h = str;
    }

    @Override // b2.c
    public final void A(boolean z10) {
        this.f1815e.writeInt(z10 ? 1 : 0);
    }

    @Override // b2.c
    public final void C(Bundle bundle) {
        this.f1815e.writeBundle(bundle);
    }

    @Override // b2.c
    public final void D(byte[] bArr) {
        if (bArr == null) {
            this.f1815e.writeInt(-1);
        } else {
            this.f1815e.writeInt(bArr.length);
            this.f1815e.writeByteArray(bArr);
        }
    }

    @Override // b2.c
    public final void E(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1815e, 0);
    }

    @Override // b2.c
    public final void G(float f) {
        this.f1815e.writeFloat(f);
    }

    @Override // b2.c
    public final void H(int i10) {
        this.f1815e.writeInt(i10);
    }

    @Override // b2.c
    public final void K(long j10) {
        this.f1815e.writeLong(j10);
    }

    @Override // b2.c
    public final void L(Parcelable parcelable) {
        this.f1815e.writeParcelable(parcelable, 0);
    }

    @Override // b2.c
    public final void N(String str) {
        this.f1815e.writeString(str);
    }

    @Override // b2.c
    public final void P(IBinder iBinder) {
        this.f1815e.writeStrongBinder(iBinder);
    }

    public final void S() {
        int i10 = this.f1818i;
        if (i10 >= 0) {
            int i11 = this.f1814d.get(i10);
            int dataPosition = this.f1815e.dataPosition();
            this.f1815e.setDataPosition(i11);
            this.f1815e.writeInt(dataPosition - i11);
            this.f1815e.setDataPosition(dataPosition);
        }
    }

    @Override // b2.c
    public final d a() {
        Parcel parcel = this.f1815e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f1819j;
        if (i10 == this.f) {
            i10 = this.f1816g;
        }
        return new d(parcel, dataPosition, i10, g.f(new StringBuilder(), this.f1817h, "  "), this.f1811a, this.f1812b, this.f1813c);
    }

    @Override // b2.c
    public final boolean e() {
        return this.f1815e.readInt() != 0;
    }

    @Override // b2.c
    public final Bundle g() {
        return this.f1815e.readBundle(d.class.getClassLoader());
    }

    @Override // b2.c
    public final byte[] i() {
        int readInt = this.f1815e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1815e.readByteArray(bArr);
        return bArr;
    }

    @Override // b2.c
    public final CharSequence j() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1815e);
    }

    @Override // b2.c
    public final boolean l(int i10) {
        while (this.f1819j < this.f1816g) {
            int i11 = this.f1820k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f1815e.setDataPosition(this.f1819j);
            int readInt = this.f1815e.readInt();
            this.f1820k = this.f1815e.readInt();
            this.f1819j += readInt;
        }
        return this.f1820k == i10;
    }

    @Override // b2.c
    public final float m() {
        return this.f1815e.readFloat();
    }

    @Override // b2.c
    public final int n() {
        return this.f1815e.readInt();
    }

    @Override // b2.c
    public final long p() {
        return this.f1815e.readLong();
    }

    @Override // b2.c
    public final <T extends Parcelable> T r() {
        return (T) this.f1815e.readParcelable(d.class.getClassLoader());
    }

    @Override // b2.c
    public final String t() {
        return this.f1815e.readString();
    }

    @Override // b2.c
    public final IBinder v() {
        return this.f1815e.readStrongBinder();
    }

    @Override // b2.c
    public final void y(int i10) {
        S();
        this.f1818i = i10;
        this.f1814d.put(i10, this.f1815e.dataPosition());
        H(0);
        H(i10);
    }
}
