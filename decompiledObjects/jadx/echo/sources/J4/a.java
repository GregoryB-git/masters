package J4;

import M4.l;
import N4.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0060a();

    /* renamed from: o, reason: collision with root package name */
    public final String f3043o;

    /* renamed from: p, reason: collision with root package name */
    public final l f3044p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3045q;

    /* renamed from: J4.a$a, reason: collision with other inner class name */
    public class C0060a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0060a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public a(Parcel parcel) {
        this.f3045q = false;
        this.f3043o = parcel.readString();
        this.f3045q = parcel.readByte() != 0;
        this.f3044p = (l) parcel.readParcelable(l.class.getClassLoader());
    }

    public static k[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] kVarArr = new k[list.size()];
        k a7 = ((a) list.get(0)).a();
        boolean z7 = false;
        for (int i7 = 1; i7 < list.size(); i7++) {
            k a8 = ((a) list.get(i7)).a();
            if (z7 || !((a) list.get(i7)).g()) {
                kVarArr[i7] = a8;
            } else {
                kVarArr[0] = a8;
                kVarArr[i7] = a7;
                z7 = true;
            }
        }
        if (!z7) {
            kVarArr[0] = a7;
        }
        return kVarArr;
    }

    public static a c(String str) {
        a aVar = new a(str.replace("-", ""), new M4.a());
        aVar.i(j());
        return aVar;
    }

    public static boolean j() {
        C4.a g7 = C4.a.g();
        return g7.L() && Math.random() < g7.D();
    }

    public k a() {
        k.c E6 = k.a0().E(this.f3043o);
        if (this.f3045q) {
            E6.D(N4.l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (k) E6.v();
    }

    public l d() {
        return this.f3044p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f3045q;
    }

    public boolean f() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f3044p.c()) > C4.a.g().A();
    }

    public boolean g() {
        return this.f3045q;
    }

    public String h() {
        return this.f3043o;
    }

    public void i(boolean z7) {
        this.f3045q = z7;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f3043o);
        parcel.writeByte(this.f3045q ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f3044p, 0);
    }

    public /* synthetic */ a(Parcel parcel, C0060a c0060a) {
        this(parcel);
    }

    public a(String str, M4.a aVar) {
        this.f3045q = false;
        this.f3043o = str;
        this.f3044p = aVar.a();
    }
}
