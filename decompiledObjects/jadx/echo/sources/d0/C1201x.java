package d0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.C1200w;
import java.util.Arrays;
import java.util.List;

/* renamed from: d0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1201x implements Parcelable {
    public static final Parcelable.Creator<C1201x> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final b[] f13013o;

    /* renamed from: p, reason: collision with root package name */
    public final long f13014p;

    /* renamed from: d0.x$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1201x createFromParcel(Parcel parcel) {
            return new C1201x(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1201x[] newArray(int i7) {
            return new C1201x[i7];
        }
    }

    /* renamed from: d0.x$b */
    public interface b extends Parcelable {
        void D(C1200w.b bVar);

        byte[] M();

        C1194q s();
    }

    public C1201x(long j7, List list) {
        this(j7, (b[]) list.toArray(new b[0]));
    }

    public C1201x a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new C1201x(this.f13014p, (b[]) g0.M.N0(this.f13013o, bVarArr));
    }

    public C1201x b(C1201x c1201x) {
        return c1201x == null ? this : a(c1201x.f13013o);
    }

    public C1201x c(long j7) {
        return this.f13014p == j7 ? this : new C1201x(j7, this.f13013o);
    }

    public b d(int i7) {
        return this.f13013o[i7];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f13013o.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1201x.class != obj.getClass()) {
            return false;
        }
        C1201x c1201x = (C1201x) obj;
        return Arrays.equals(this.f13013o, c1201x.f13013o) && this.f13014p == c1201x.f13014p;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f13013o) * 31) + a3.h.b(this.f13014p);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.f13013o));
        if (this.f13014p == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f13014p;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f13013o.length);
        for (b bVar : this.f13013o) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f13014p);
    }

    public C1201x(long j7, b... bVarArr) {
        this.f13014p = j7;
        this.f13013o = bVarArr;
    }

    public C1201x(Parcel parcel) {
        this.f13013o = new b[parcel.readInt()];
        int i7 = 0;
        while (true) {
            b[] bVarArr = this.f13013o;
            if (i7 >= bVarArr.length) {
                this.f13014p = parcel.readLong();
                return;
            } else {
                bVarArr[i7] = (b) parcel.readParcelable(b.class.getClassLoader());
                i7++;
            }
        }
    }

    public C1201x(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public C1201x(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }
}
