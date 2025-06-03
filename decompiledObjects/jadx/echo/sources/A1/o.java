package A1;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum o {
    URL("endpoint"),
    ENABLED("is_enabled"),
    DATASETID("dataset_id"),
    ACCESSKEY("access_key");


    /* renamed from: o, reason: collision with root package name */
    public final String f369o;

    o(String str) {
        this.f369o = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static o[] valuesCustom() {
        o[] valuesCustom = values();
        return (o[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String e() {
        return this.f369o;
    }
}
