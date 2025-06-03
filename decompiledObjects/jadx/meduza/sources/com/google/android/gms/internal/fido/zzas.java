package com.google.android.gms.internal.fido;

import defpackage.g;

/* loaded from: classes.dex */
final class zzas {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(g.e("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
