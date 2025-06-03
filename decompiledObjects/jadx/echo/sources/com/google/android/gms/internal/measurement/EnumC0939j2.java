package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0939j2 implements InterfaceC0896e4 {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);


    /* renamed from: v, reason: collision with root package name */
    public static final InterfaceC0887d4 f10998v = new InterfaceC0887d4() { // from class: com.google.android.gms.internal.measurement.i2
    };

    /* renamed from: o, reason: collision with root package name */
    public final int f11000o;

    EnumC0939j2(int i7) {
        this.f11000o = i7;
    }

    public static EnumC0939j2 c(int i7) {
        if (i7 == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i7 == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i7 == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i7 == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i7 == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i7 != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }

    public static InterfaceC0914g4 e() {
        return C0948k2.f11010a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0896e4
    public final int a() {
        return this.f11000o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC0939j2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11000o + " name=" + name() + '>';
    }
}
