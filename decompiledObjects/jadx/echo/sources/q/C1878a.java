package q;

import android.os.Bundle;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1878a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f18584a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f18585b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f18586c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f18587d;

    /* renamed from: q.a$a, reason: collision with other inner class name */
    public static final class C0250a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f18588a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f18589b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f18590c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f18591d;

        public C1878a a() {
            return new C1878a(this.f18588a, this.f18589b, this.f18590c, this.f18591d);
        }
    }

    public C1878a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f18584a = num;
        this.f18585b = num2;
        this.f18586c = num3;
        this.f18587d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f18584a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f18585b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f18586c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f18587d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
