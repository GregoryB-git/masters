package b7;

import android.os.Parcel;
import android.os.Parcelable;
import b7.o;
import b7.z;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w extends n6.a {
    public static final Parcelable.Creator<w> CREATOR = new v0();

    /* renamed from: a, reason: collision with root package name */
    public final z f2017a;

    /* renamed from: b, reason: collision with root package name */
    public final o f2018b;

    public w(String str, int i10) {
        m6.j.i(str);
        try {
            this.f2017a = z.f(str);
            m6.j.i(Integer.valueOf(i10));
            try {
                this.f2018b = o.a(i10);
            } catch (o.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (z.a e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f2017a.equals(wVar.f2017a) && this.f2018b.equals(wVar.f2018b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2017a, this.f2018b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        this.f2017a.getClass();
        b.z.F(parcel, 2, "public-key", false);
        b.z.B(parcel, 3, Integer.valueOf(this.f2018b.f1986a.f()));
        b.z.L(J, parcel);
    }
}
