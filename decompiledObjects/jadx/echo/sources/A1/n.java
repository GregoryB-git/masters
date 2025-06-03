package A1;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum n {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");


    /* renamed from: o, reason: collision with root package name */
    public final String f363o;

    n(String str) {
        this.f363o = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static n[] valuesCustom() {
        n[] valuesCustom = values();
        return (n[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String e() {
        return this.f363o;
    }
}
