package com.google.android.gms.internal.common;

import defpackage.f;
import org.jspecify.annotations.NullMarked;

@NullMarked
/* loaded from: classes.dex */
public final class zzal {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(f.h("at index ", i11));
            }
        }
        return objArr;
    }
}
