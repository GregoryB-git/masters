package x1;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum L {
    GET,
    POST,
    DELETE;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static L[] valuesCustom() {
        L[] valuesCustom = values();
        return (L[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
