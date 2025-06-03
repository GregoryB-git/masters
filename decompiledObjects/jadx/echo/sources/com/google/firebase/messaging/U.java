package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class U implements Parcelable.Creator {
    public static void c(T t7, Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.e(parcel, 2, t7.f11658o, false);
        B2.c.b(parcel, a7);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            if (B2.b.i(n7) != 2) {
                B2.b.t(parcel, n7);
            } else {
                bundle = B2.b.a(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new T(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T[] newArray(int i7) {
        return new T[i7];
    }
}
