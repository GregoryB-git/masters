package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1010r2;

/* loaded from: classes.dex */
public abstract /* synthetic */ class E3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f10363a;

    static {
        int[] iArr = new int[C1010r2.b.values().length];
        f10363a = iArr;
        try {
            iArr[C1010r2.b.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10363a[C1010r2.b.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10363a[C1010r2.b.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f10363a[C1010r2.b.STATEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f10363a[C1010r2.b.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
