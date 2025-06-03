package A2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: A2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0330p extends B2.a {

    @NonNull
    public static final Parcelable.Creator<C0330p> CREATOR = new T();

    /* renamed from: o, reason: collision with root package name */
    public final int f526o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f527p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f528q;

    /* renamed from: r, reason: collision with root package name */
    public final int f529r;

    /* renamed from: s, reason: collision with root package name */
    public final int f530s;

    public C0330p(int i7, boolean z7, boolean z8, int i8, int i9) {
        this.f526o = i7;
        this.f527p = z7;
        this.f528q = z8;
        this.f529r = i8;
        this.f530s = i9;
    }

    public int a() {
        return this.f529r;
    }

    public int d() {
        return this.f530s;
    }

    public boolean f() {
        return this.f527p;
    }

    public boolean g() {
        return this.f528q;
    }

    public int i() {
        return this.f526o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.i(parcel, 1, i());
        B2.c.c(parcel, 2, f());
        B2.c.c(parcel, 3, g());
        B2.c.i(parcel, 4, a());
        B2.c.i(parcel, 5, d());
        B2.c.b(parcel, a7);
    }
}
