// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum j
{
    A("SEARCHED", 11, "Search"), 
    B("SPENT_CREDITS", 12, "SpentCredits"), 
    C("COMPLETED_TUTORIAL", 13, "TutorialCompletion"), 
    p("UNLOCKED_ACHIEVEMENT", 0, "AchievementUnlocked"), 
    q("ACTIVATED_APP", 1, "ActivateApp"), 
    r("ADDED_PAYMENT_INFO", 2, "AddPaymentInfo"), 
    s("ADDED_TO_CART", 3, "AddToCart"), 
    t("ADDED_TO_WISHLIST", 4, "AddToWishlist"), 
    u("COMPLETED_REGISTRATION", 5, "CompleteRegistration"), 
    v("VIEWED_CONTENT", 6, "ViewContent"), 
    w("INITIATED_CHECKOUT", 7, "InitiateCheckout"), 
    x("ACHIEVED_LEVEL", 8, "LevelAchieved"), 
    y("PURCHASED", 9, "Purchase"), 
    z("RATED", 10, "Rate");
    
    public final String o;
    
    static {
        D = c();
    }
    
    public j(final String name, final int ordinal, final String o) {
        this.o = o;
    }
    
    public static final /* synthetic */ j[] c() {
        return new j[] { j.p, j.q, j.r, j.s, j.t, j.u, j.v, j.w, j.x, j.y, j.z, j.A, j.B, j.C };
    }
    
    public final String e() {
        return this.o;
    }
}
