/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class j
extends Enum {
    public static final /* enum */ j A;
    public static final /* enum */ j B;
    public static final /* enum */ j C;
    public static final /* synthetic */ j[] D;
    public static final /* enum */ j p;
    public static final /* enum */ j q;
    public static final /* enum */ j r;
    public static final /* enum */ j s;
    public static final /* enum */ j t;
    public static final /* enum */ j u;
    public static final /* enum */ j v;
    public static final /* enum */ j w;
    public static final /* enum */ j x;
    public static final /* enum */ j y;
    public static final /* enum */ j z;
    public final String o;

    static {
        p = new j("AchievementUnlocked");
        q = new j("ActivateApp");
        r = new j("AddPaymentInfo");
        s = new j("AddToCart");
        t = new j("AddToWishlist");
        u = new j("CompleteRegistration");
        v = new j("ViewContent");
        w = new j("InitiateCheckout");
        x = new j("LevelAchieved");
        y = new j("Purchase");
        z = new j("Rate");
        A = new j("Search");
        B = new j("SpentCredits");
        C = new j("TutorialCompletion");
        D = j.c();
    }

    public j(String string3) {
        this.o = string3;
    }

    public static final /* synthetic */ j[] c() {
        return new j[]{p, q, r, s, t, u, v, w, x, y, z, A, B, C};
    }

    public static j valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (j)Enum.valueOf(j.class, (String)string2);
    }

    public static j[] values() {
        j[] arrj = D;
        return (j[])Arrays.copyOf((Object[])arrj, (int)arrj.length);
    }

    public final String e() {
        return this.o;
    }
}

