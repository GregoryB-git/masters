package w2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2079a extends B2.a {

    @NonNull
    public static final Parcelable.Creator<C2079a> CREATOR = new C2082d();

    /* renamed from: o, reason: collision with root package name */
    public Intent f20327o;

    public C2079a(Intent intent) {
        this.f20327o = intent;
    }

    public Intent a() {
        return this.f20327o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.m(parcel, 1, this.f20327o, i7, false);
        B2.c.b(parcel, a7);
    }
}
