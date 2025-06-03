// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import android.content.Intent;
import android.app.Activity;
import kotlin.text.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import android.content.ComponentName;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public final class SplitPairFilter
{
    @NotNull
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    @NotNull
    private final ComponentName secondaryActivityName;
    
    public SplitPairFilter(@NotNull final ComponentName primaryActivityName, @NotNull final ComponentName secondaryActivityName, String packageName) {
        Intrinsics.checkNotNullParameter(primaryActivityName, "primaryActivityName");
        Intrinsics.checkNotNullParameter(secondaryActivityName, "secondaryActivityName");
        this.primaryActivityName = primaryActivityName;
        this.secondaryActivityName = secondaryActivityName;
        this.secondaryActivityIntentAction = packageName;
        packageName = primaryActivityName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "primaryActivityName.packageName");
        final String className = primaryActivityName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "primaryActivityName.className");
        final String packageName2 = secondaryActivityName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "secondaryActivityName.packageName");
        final String className2 = secondaryActivityName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "secondaryActivityName.className");
        final int length = packageName.length();
        final boolean b = true;
        boolean b2 = false;
        Label_0117: {
            if (length != 0) {
                if (packageName2.length() != 0) {
                    b2 = true;
                    break Label_0117;
                }
            }
            b2 = false;
        }
        if (!b2) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        boolean b3 = false;
        Label_0153: {
            if (className.length() != 0) {
                if (className2.length() != 0) {
                    b3 = true;
                    break Label_0153;
                }
            }
            b3 = false;
        }
        if (!b3) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (i.v(packageName, "*", false, 2, null) && i.D(packageName, "*", 0, false, 6, null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (i.v(className, "*", false, 2, null) && i.D(className, "*", 0, false, 6, null) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
        if (i.v(packageName2, "*", false, 2, null) && i.D(packageName2, "*", 0, false, 6, null) != packageName2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        boolean b4 = b;
        if (i.v(className2, "*", false, 2, null)) {
            b4 = (i.D(className2, "*", 0, false, 6, null) == className2.length() - 1 && b);
        }
        if (b4) {
            return;
        }
        throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SplitPairFilter)) {
            return false;
        }
        final ComponentName primaryActivityName = this.primaryActivityName;
        final SplitPairFilter splitPairFilter = (SplitPairFilter)o;
        return Intrinsics.a(primaryActivityName, splitPairFilter.primaryActivityName) && Intrinsics.a(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && Intrinsics.a(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }
    
    @NotNull
    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }
    
    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }
    
    @NotNull
    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.primaryActivityName.hashCode();
        final int hashCode2 = this.secondaryActivityName.hashCode();
        final String secondaryActivityIntentAction = this.secondaryActivityIntentAction;
        int hashCode3;
        if (secondaryActivityIntentAction == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = secondaryActivityIntentAction.hashCode();
        }
        return (hashCode * 31 + hashCode2) * 31 + hashCode3;
    }
    
    public final boolean matchesActivityIntentPair(@NotNull final Activity activity, @NotNull final Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "primaryActivity");
        Intrinsics.checkNotNullParameter(intent, "secondaryActivityIntent");
        final ComponentName componentName = activity.getComponentName();
        final MatcherUtils instance = MatcherUtils.INSTANCE;
        final boolean componentsMatching$window_release = instance.areComponentsMatching$window_release(componentName, this.primaryActivityName);
        boolean b = false;
        if (!componentsMatching$window_release) {
            return false;
        }
        if (!instance.areComponentsMatching$window_release(intent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        final String secondaryActivityIntentAction = this.secondaryActivityIntentAction;
        if (secondaryActivityIntentAction == null || Intrinsics.a(secondaryActivityIntentAction, intent.getAction())) {
            b = true;
        }
        return b;
    }
    
    public final boolean matchesActivityPair(@NotNull final Activity activity, @NotNull final Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "primaryActivity");
        Intrinsics.checkNotNullParameter(activity2, "secondaryActivity");
        final MatcherUtils instance = MatcherUtils.INSTANCE;
        final boolean componentsMatching$window_release = instance.areComponentsMatching$window_release(activity.getComponentName(), this.primaryActivityName);
        final boolean b = false;
        boolean b2 = componentsMatching$window_release && instance.areComponentsMatching$window_release(activity2.getComponentName(), this.secondaryActivityName);
        if (activity2.getIntent() != null) {
            b2 = b;
            if (b2) {
                final Intent intent = activity2.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "secondaryActivity.intent");
                b2 = b;
                if (this.matchesActivityIntentPair(activity, intent)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    @NotNull
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SplitPairFilter{primaryActivityName=");
        sb.append(this.primaryActivityName);
        sb.append(", secondaryActivityName=");
        sb.append(this.secondaryActivityName);
        sb.append(", secondaryActivityAction=");
        sb.append((Object)this.secondaryActivityIntentAction);
        sb.append('}');
        return sb.toString();
    }
}
