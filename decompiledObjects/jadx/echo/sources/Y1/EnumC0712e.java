package Y1;

import java.util.Arrays;

/* renamed from: Y1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0712e {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");


    /* renamed from: o, reason: collision with root package name */
    public final String f7399o;

    EnumC0712e(String str) {
        this.f7399o = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0712e[] valuesCustom() {
        EnumC0712e[] valuesCustom = values();
        return (EnumC0712e[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String e() {
        return this.f7399o;
    }
}
