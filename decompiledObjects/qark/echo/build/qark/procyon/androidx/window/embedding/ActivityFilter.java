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
public final class ActivityFilter
{
    @NotNull
    private final ComponentName componentName;
    private final String intentAction;
    
    public ActivityFilter(@NotNull final ComponentName componentName, String packageName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        this.componentName = componentName;
        this.intentAction = packageName;
        packageName = componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "componentName.packageName");
        final String className = componentName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "componentName.className");
        final int length = packageName.length();
        final boolean b = true;
        if (length <= 0) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        if (className.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (i.v(packageName, "*", false, 2, null) && i.D(packageName, "*", 0, false, 6, null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        boolean b2 = b;
        if (i.v(className, "*", false, 2, null)) {
            b2 = (i.D(className, "*", 0, false, 6, null) == className.length() - 1 && b);
        }
        if (b2) {
            return;
        }
        throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivityFilter)) {
            return false;
        }
        final ComponentName componentName = this.componentName;
        final ActivityFilter activityFilter = (ActivityFilter)o;
        return Intrinsics.a(componentName, activityFilter.componentName) && Intrinsics.a(this.intentAction, activityFilter.intentAction);
    }
    
    @NotNull
    public final ComponentName getComponentName() {
        return this.componentName;
    }
    
    public final String getIntentAction() {
        return this.intentAction;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.componentName.hashCode();
        final String intentAction = this.intentAction;
        int hashCode2;
        if (intentAction == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = intentAction.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    public final boolean matchesActivity(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            final String intentAction = this.intentAction;
            if (intentAction != null) {
                final Intent intent = activity.getIntent();
                Object action;
                if (intent == null) {
                    action = null;
                }
                else {
                    action = intent.getAction();
                }
                if (!Intrinsics.a(intentAction, action)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final boolean matchesIntent(@NotNull final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        final boolean componentsMatching$window_release = MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName);
        boolean b = false;
        if (!componentsMatching$window_release) {
            return false;
        }
        final String intentAction = this.intentAction;
        if (intentAction == null || Intrinsics.a(intentAction, intent.getAction())) {
            b = true;
        }
        return b;
    }
    
    @NotNull
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ActivityFilter(componentName=");
        sb.append(this.componentName);
        sb.append(", intentAction=");
        sb.append((Object)this.intentAction);
        sb.append(')');
        return sb.toString();
    }
}
