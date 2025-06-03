/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Intent
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class MatcherUtils {
    @NotNull
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    @NotNull
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(String string2, String string3) {
        if (!i.v(string3, "*", false, 2, null)) {
            return false;
        }
        if (Intrinsics.a(string3, "*")) {
            return true;
        }
        boolean bl = i.D(string3, "*", 0, false, 6, null) == i.J(string3, "*", 0, false, 6, null) && i.k(string3, "*", false, 2, null);
        if (bl) {
            string3 = string3.substring(0, string3.length() - 1);
            Intrinsics.checkNotNullExpressionValue(string3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            return i.s(string2, string3, false, 2, null);
        }
        throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(@NotNull Activity activity, @NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        Intrinsics.checkNotNullParameter((Object)componentName, "ruleComponent");
        if (this.areComponentsMatching$window_release(activity.getComponentName(), componentName)) {
            return true;
        }
        if ((activity = activity.getIntent()) == null) {
            return false;
        }
        if ((activity = activity.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release((ComponentName)activity, componentName);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean areComponentsMatching$window_release(ComponentName var1_1, @NotNull ComponentName var2_2) {
        Intrinsics.checkNotNullParameter(var2_2, "ruleComponent");
        var7_3 = false;
        var6_4 = false;
        if (var1_1 == null) {
            var5_5 = var6_4;
            if (Intrinsics.a(var2_2.getPackageName(), "*") == false) return var5_5;
            var5_5 = var6_4;
            if (Intrinsics.a(var2_2.getClassName(), "*") == false) return var5_5;
            return true;
        }
        var8_7 = var1_1.toString();
        Intrinsics.checkNotNullExpressionValue(var8_7, "activityComponent.toString()");
        if ((i.v(var8_7, "*", false, 2, null) ^ true) == false) throw new IllegalArgumentException("Wildcard can only be part of the rule.".toString());
        if (Intrinsics.a(var1_1.getPackageName(), var2_2.getPackageName())) ** GOTO lbl-1000
        var8_7 = var1_1.getPackageName();
        Intrinsics.checkNotNullExpressionValue(var8_7, "activityComponent.packageName");
        var9_8 = var2_2.getPackageName();
        Intrinsics.checkNotNullExpressionValue(var9_8, "ruleComponent.packageName");
        if (!this.wildcardMatch(var8_7, var9_8)) {
            var3_9 = false;
        } else lbl-1000: // 2 sources:
        {
            var3_9 = true;
        }
        if (Intrinsics.a(var1_1.getClassName(), var2_2.getClassName())) ** GOTO lbl-1000
        var1_1 = var1_1.getClassName();
        Intrinsics.checkNotNullExpressionValue(var1_1, "activityComponent.className");
        var2_2 = var2_2.getClassName();
        Intrinsics.checkNotNullExpressionValue(var2_2, "ruleComponent.className");
        if (!this.wildcardMatch((String)var1_1, (String)var2_2)) {
            var4_10 = false;
        } else lbl-1000: // 2 sources:
        {
            var4_10 = true;
        }
        var5_6 = var7_3;
        if (var3_9 == false) return var5_6;
        var5_6 = var7_3;
        if (var4_10 == false) return var5_6;
        return true;
    }
}

