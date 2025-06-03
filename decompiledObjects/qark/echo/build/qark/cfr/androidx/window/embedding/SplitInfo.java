/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.ActivityStack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class SplitInfo {
    @NotNull
    private final ActivityStack primaryActivityStack;
    @NotNull
    private final ActivityStack secondaryActivityStack;
    private final float splitRatio;

    public SplitInfo(@NotNull ActivityStack activityStack, @NotNull ActivityStack activityStack2, float f8) {
        Intrinsics.checkNotNullParameter(activityStack, "primaryActivityStack");
        Intrinsics.checkNotNullParameter(activityStack2, "secondaryActivityStack");
        this.primaryActivityStack = activityStack;
        this.secondaryActivityStack = activityStack2;
        this.splitRatio = f8;
    }

    public final boolean contains(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        if (!this.primaryActivityStack.contains(activity) && !this.secondaryActivityStack.contains(activity)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SplitInfo)) {
            return false;
        }
        ActivityStack activityStack = this.primaryActivityStack;
        object = (SplitInfo)object;
        if (!Intrinsics.a(activityStack, object.primaryActivityStack)) {
            return false;
        }
        if (!Intrinsics.a(this.secondaryActivityStack, object.secondaryActivityStack)) {
            return false;
        }
        if (this.splitRatio == object.splitRatio) {
            return true;
        }
        return false;
    }

    @NotNull
    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    @NotNull
    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return (this.primaryActivityStack.hashCode() * 31 + this.secondaryActivityStack.hashCode()) * 31 + Float.floatToIntBits((float)this.splitRatio);
    }

    @NotNull
    public String toString() {
        Object object = new StringBuilder();
        object.append("SplitInfo:{");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("primaryActivityStack=");
        stringBuilder.append((Object)this.getPrimaryActivityStack());
        stringBuilder.append(',');
        object.append(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("secondaryActivityStack=");
        stringBuilder.append((Object)this.getSecondaryActivityStack());
        stringBuilder.append(',');
        object.append(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("splitRatio=");
        stringBuilder.append(this.getSplitRatio());
        stringBuilder.append('}');
        object.append(stringBuilder.toString());
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuilder().apply(builderAction).toString()");
        return object;
    }
}

