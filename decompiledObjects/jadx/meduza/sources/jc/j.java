package jc;

import p2.m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j[] f8786a;

    static {
        j[] jVarArr = {new j("PUBLIC", 0), new j("PROTECTED", 1), new j("INTERNAL", 2), new j("PRIVATE", 3)};
        f8786a = jVarArr;
        m0.D(jVarArr);
    }

    public j(String str, int i10) {
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f8786a.clone();
    }
}
