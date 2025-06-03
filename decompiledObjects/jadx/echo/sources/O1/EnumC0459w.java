package O1;

import java.util.Arrays;

/* renamed from: O1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0459w {
    ContextChoose("context_choose"),
    JoinTournament("join_tournament");


    /* renamed from: o, reason: collision with root package name */
    public final String f3965o;

    EnumC0459w(String str) {
        this.f3965o = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0459w[] valuesCustom() {
        EnumC0459w[] valuesCustom = values();
        return (EnumC0459w[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String e() {
        return this.f3965o;
    }
}
