package R2;

import A2.AbstractC0328n;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class R5 extends B2.a {
    public static final Parcelable.Creator<R5> CREATOR = new Q5();

    /* renamed from: o, reason: collision with root package name */
    public final int f4990o;

    /* renamed from: p, reason: collision with root package name */
    public final String f4991p;

    /* renamed from: q, reason: collision with root package name */
    public final long f4992q;

    /* renamed from: r, reason: collision with root package name */
    public final Long f4993r;

    /* renamed from: s, reason: collision with root package name */
    public final Float f4994s;

    /* renamed from: t, reason: collision with root package name */
    public final String f4995t;

    /* renamed from: u, reason: collision with root package name */
    public final String f4996u;

    /* renamed from: v, reason: collision with root package name */
    public final Double f4997v;

    public R5(int i7, String str, long j7, Long l7, Float f7, String str2, String str3, Double d7) {
        this.f4990o = i7;
        this.f4991p = str;
        this.f4992q = j7;
        this.f4993r = l7;
        this.f4994s = null;
        if (i7 == 1) {
            this.f4997v = f7 != null ? Double.valueOf(f7.doubleValue()) : null;
        } else {
            this.f4997v = d7;
        }
        this.f4995t = str2;
        this.f4996u = str3;
    }

    public final Object a() {
        Long l7 = this.f4993r;
        if (l7 != null) {
            return l7;
        }
        Double d7 = this.f4997v;
        if (d7 != null) {
            return d7;
        }
        String str = this.f4995t;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.i(parcel, 1, this.f4990o);
        B2.c.n(parcel, 2, this.f4991p, false);
        B2.c.k(parcel, 3, this.f4992q);
        B2.c.l(parcel, 4, this.f4993r, false);
        B2.c.g(parcel, 5, null, false);
        B2.c.n(parcel, 6, this.f4995t, false);
        B2.c.n(parcel, 7, this.f4996u, false);
        B2.c.f(parcel, 8, this.f4997v, false);
        B2.c.b(parcel, a7);
    }

    public R5(T5 t52) {
        this(t52.f5047c, t52.f5048d, t52.f5049e, t52.f5046b);
    }

    public R5(String str, long j7, Object obj, String str2) {
        AbstractC0328n.e(str);
        this.f4990o = 2;
        this.f4991p = str;
        this.f4992q = j7;
        this.f4996u = str2;
        if (obj == null) {
            this.f4993r = null;
            this.f4994s = null;
            this.f4997v = null;
            this.f4995t = null;
            return;
        }
        if (obj instanceof Long) {
            this.f4993r = (Long) obj;
            this.f4994s = null;
            this.f4997v = null;
            this.f4995t = null;
            return;
        }
        if (obj instanceof String) {
            this.f4993r = null;
            this.f4994s = null;
            this.f4997v = null;
            this.f4995t = (String) obj;
            return;
        }
        if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.f4993r = null;
        this.f4994s = null;
        this.f4997v = (Double) obj;
        this.f4995t = null;
    }
}
