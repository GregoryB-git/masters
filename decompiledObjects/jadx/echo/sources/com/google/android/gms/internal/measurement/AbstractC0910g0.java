package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.measurement.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0910g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10958a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f10959b;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f10958a = 67108864;
        f10959b = i7 >= 31 ? 33554432 : 0;
    }

    public static PendingIntent a(Context context, int i7, Intent intent, int i8) {
        return PendingIntent.getBroadcast(context, 0, intent, i8);
    }
}
