package x1;

import java.util.Arrays;

/* renamed from: x1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2155h {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);


    /* renamed from: o, reason: collision with root package name */
    public final boolean f21073o;

    EnumC2155h(boolean z7) {
        this.f21073o = z7;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC2155h[] valuesCustom() {
        EnumC2155h[] valuesCustom = values();
        return (EnumC2155h[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final boolean e() {
        return this.f21073o;
    }
}
