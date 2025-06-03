// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import kotlin.jvm.internal.Intrinsics;
import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class ActivityCompatHelperApi24
{
    @NotNull
    public static final ActivityCompatHelperApi24 INSTANCE;
    
    static {
        INSTANCE = new ActivityCompatHelperApi24();
    }
    
    private ActivityCompatHelperApi24() {
    }
    
    public final boolean isInMultiWindowMode(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return a.a(activity);
    }
}
