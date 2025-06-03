// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import android.content.Intent;
import android.content.ComponentName;
import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public final class MatcherUtils
{
    @NotNull
    public static final MatcherUtils INSTANCE;
    public static final boolean sDebugMatchers = false;
    @NotNull
    public static final String sMatchersTag = "SplitRuleResolution";
    
    static {
        INSTANCE = new MatcherUtils();
    }
    
    private MatcherUtils() {
    }
    
    private final boolean wildcardMatch(final String s, String substring) {
        if (!i.v(substring, "*", false, 2, null)) {
            return false;
        }
        if (Intrinsics.a(substring, "*")) {
            return true;
        }
        if (i.D(substring, "*", 0, false, 6, null) == i.J(substring, "*", 0, false, 6, null) && i.k(substring, "*", false, 2, null)) {
            substring = substring.substring(0, substring.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            return i.s(s, substring, false, 2, null);
        }
        throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
    }
    
    public final boolean areActivityOrIntentComponentsMatching$window_release(@NotNull final Activity activity, @NotNull final ComponentName componentName) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(componentName, "ruleComponent");
        if (this.areComponentsMatching$window_release(activity.getComponentName(), componentName)) {
            return true;
        }
        final Intent intent = activity.getIntent();
        if (intent == null) {
            return false;
        }
        final ComponentName component = intent.getComponent();
        return component != null && MatcherUtils.INSTANCE.areComponentsMatching$window_release(component, componentName);
    }
    
    public final boolean areComponentsMatching$window_release(final ComponentName componentName, @NotNull final ComponentName componentName2) {
        Intrinsics.checkNotNullParameter(componentName2, "ruleComponent");
        final boolean b = false;
        final boolean b2 = false;
        if (componentName == null) {
            boolean b3 = b2;
            if (Intrinsics.a(componentName2.getPackageName(), "*")) {
                b3 = b2;
                if (Intrinsics.a(componentName2.getClassName(), "*")) {
                    b3 = true;
                }
            }
            return b3;
        }
        final String string = componentName.toString();
        Intrinsics.checkNotNullExpressionValue(string, "activityComponent.toString()");
        if (i.v(string, "*", false, 2, null) ^ true) {
            boolean b4 = false;
            Label_0143: {
                if (!Intrinsics.a(componentName.getPackageName(), componentName2.getPackageName())) {
                    final String packageName = componentName.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "activityComponent.packageName");
                    final String packageName2 = componentName2.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName2, "ruleComponent.packageName");
                    if (!this.wildcardMatch(packageName, packageName2)) {
                        b4 = false;
                        break Label_0143;
                    }
                }
                b4 = true;
            }
            boolean b5 = false;
            Label_0200: {
                if (!Intrinsics.a(componentName.getClassName(), componentName2.getClassName())) {
                    final String className = componentName.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "activityComponent.className");
                    final String className2 = componentName2.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className2, "ruleComponent.className");
                    if (!this.wildcardMatch(className, className2)) {
                        b5 = false;
                        break Label_0200;
                    }
                }
                b5 = true;
            }
            boolean b6 = b;
            if (b4) {
                b6 = b;
                if (b5) {
                    b6 = true;
                }
            }
            return b6;
        }
        throw new IllegalArgumentException("Wildcard can only be part of the rule.".toString());
    }
}
