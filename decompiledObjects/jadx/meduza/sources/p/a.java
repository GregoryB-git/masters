package p;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f12684a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f12685b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f12686c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f12687d;

    /* renamed from: p.a$a, reason: collision with other inner class name */
    public static final class C0191a {
    }

    public a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f12684a = num;
        this.f12685b = num2;
        this.f12686c = num3;
        this.f12687d = num4;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f12684a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f12685b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f12686c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f12687d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
