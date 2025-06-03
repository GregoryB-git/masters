package A2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: A2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0319e extends B2.a {

    @NonNull
    public static final Parcelable.Creator<C0319e> CREATOR = new c0();

    /* renamed from: o, reason: collision with root package name */
    public final C0330p f455o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f456p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f457q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f458r;

    /* renamed from: s, reason: collision with root package name */
    public final int f459s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f460t;

    public C0319e(C0330p c0330p, boolean z7, boolean z8, int[] iArr, int i7, int[] iArr2) {
        this.f455o = c0330p;
        this.f456p = z7;
        this.f457q = z8;
        this.f458r = iArr;
        this.f459s = i7;
        this.f460t = iArr2;
    }

    public int a() {
        return this.f459s;
    }

    public int[] d() {
        return this.f458r;
    }

    public int[] f() {
        return this.f460t;
    }

    public boolean g() {
        return this.f456p;
    }

    public boolean i() {
        return this.f457q;
    }

    public final C0330p k() {
        return this.f455o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.m(parcel, 1, this.f455o, i7, false);
        B2.c.c(parcel, 2, g());
        B2.c.c(parcel, 3, i());
        B2.c.j(parcel, 4, d(), false);
        B2.c.i(parcel, 5, a());
        B2.c.j(parcel, 6, f(), false);
        B2.c.b(parcel, a7);
    }
}
