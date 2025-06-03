package A1;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum k {
    USER_DATA("user_data"),
    APP_DATA("app_data"),
    CUSTOM_DATA("custom_data"),
    CUSTOM_EVENTS("custom_events");


    /* renamed from: o, reason: collision with root package name */
    public final String f317o;

    k(String str) {
        this.f317o = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static k[] valuesCustom() {
        k[] valuesCustom = values();
        return (k[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String e() {
        return this.f317o;
    }
}
