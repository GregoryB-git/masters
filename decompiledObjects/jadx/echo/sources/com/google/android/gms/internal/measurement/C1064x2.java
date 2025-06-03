package com.google.android.gms.internal.measurement;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.measurement.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1064x2 extends Z2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11212a;

    /* renamed from: b, reason: collision with root package name */
    public final W2.s f11213b;

    public C1064x2(Context context, W2.s sVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f11212a = context;
        this.f11213b = sVar;
    }

    @Override // com.google.android.gms.internal.measurement.Z2
    public final Context a() {
        return this.f11212a;
    }

    @Override // com.google.android.gms.internal.measurement.Z2
    public final W2.s b() {
        return this.f11213b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Z2) {
            Z2 z22 = (Z2) obj;
            if (this.f11212a.equals(z22.a())) {
                W2.s sVar = this.f11213b;
                W2.s b7 = z22.b();
                if (sVar != null ? sVar.equals(b7) : b7 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f11212a.hashCode() ^ 1000003) * 1000003;
        W2.s sVar = this.f11213b;
        return hashCode ^ (sVar == null ? 0 : sVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.f11212a) + ", hermeticFileOverrides=" + String.valueOf(this.f11213b) + "}";
    }
}
