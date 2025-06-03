package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q6 extends n6.a {
    public static final Parcelable.Creator<q6> CREATOR = new p6();

    /* renamed from: a, reason: collision with root package name */
    public final int f4598a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4599b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4600c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f4601d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4602e;
    public final String f;

    /* renamed from: o, reason: collision with root package name */
    public final Double f4603o;

    public q6(int i10, String str, long j10, Long l10, Float f, String str2, String str3, Double d10) {
        this.f4598a = i10;
        this.f4599b = str;
        this.f4600c = j10;
        this.f4601d = l10;
        if (i10 == 1) {
            this.f4603o = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f4603o = d10;
        }
        this.f4602e = str2;
        this.f = str3;
    }

    public q6(s6 s6Var) {
        this(s6Var.f4651c, s6Var.f4650b, s6Var.f4652d, s6Var.f4653e);
    }

    public q6(String str, String str2, long j10, Object obj) {
        m6.j.e(str);
        this.f4598a = 2;
        this.f4599b = str;
        this.f4600c = j10;
        this.f = str2;
        if (obj == null) {
            this.f4601d = null;
            this.f4603o = null;
            this.f4602e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f4601d = (Long) obj;
            this.f4603o = null;
            this.f4602e = null;
        } else if (obj instanceof String) {
            this.f4601d = null;
            this.f4603o = null;
            this.f4602e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f4601d = null;
            this.f4603o = (Double) obj;
            this.f4602e = null;
        }
    }

    public final Object D() {
        Long l10 = this.f4601d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f4603o;
        if (d10 != null) {
            return d10;
        }
        String str = this.f4602e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.z(parcel, 1, this.f4598a);
        b.z.F(parcel, 2, this.f4599b, false);
        b.z.C(parcel, 3, this.f4600c);
        b.z.D(parcel, 4, this.f4601d);
        b.z.F(parcel, 6, this.f4602e, false);
        b.z.F(parcel, 7, this.f, false);
        b.z.x(parcel, 8, this.f4603o);
        b.z.L(J, parcel);
    }
}
