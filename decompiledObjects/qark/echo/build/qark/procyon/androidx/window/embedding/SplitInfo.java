// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public final class SplitInfo
{
    @NotNull
    private final ActivityStack primaryActivityStack;
    @NotNull
    private final ActivityStack secondaryActivityStack;
    private final float splitRatio;
    
    public SplitInfo(@NotNull final ActivityStack primaryActivityStack, @NotNull final ActivityStack secondaryActivityStack, final float splitRatio) {
        Intrinsics.checkNotNullParameter(primaryActivityStack, "primaryActivityStack");
        Intrinsics.checkNotNullParameter(secondaryActivityStack, "secondaryActivityStack");
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitRatio = splitRatio;
    }
    
    public final boolean contains(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.primaryActivityStack.contains(activity) || this.secondaryActivityStack.contains(activity);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SplitInfo)) {
            return false;
        }
        final ActivityStack primaryActivityStack = this.primaryActivityStack;
        final SplitInfo splitInfo = (SplitInfo)o;
        return Intrinsics.a(primaryActivityStack, splitInfo.primaryActivityStack) && Intrinsics.a(this.secondaryActivityStack, splitInfo.secondaryActivityStack) && this.splitRatio == splitInfo.splitRatio;
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
    
    @Override
    public int hashCode() {
        return (this.primaryActivityStack.hashCode() * 31 + this.secondaryActivityStack.hashCode()) * 31 + Float.floatToIntBits(this.splitRatio);
    }
    
    @NotNull
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SplitInfo:{");
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("primaryActivityStack=");
        sb2.append(this.getPrimaryActivityStack());
        sb2.append(',');
        sb.append(sb2.toString());
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("secondaryActivityStack=");
        sb3.append(this.getSecondaryActivityStack());
        sb3.append(',');
        sb.append(sb3.toString());
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("splitRatio=");
        sb4.append(this.getSplitRatio());
        sb4.append('}');
        sb.append(sb4.toString());
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
