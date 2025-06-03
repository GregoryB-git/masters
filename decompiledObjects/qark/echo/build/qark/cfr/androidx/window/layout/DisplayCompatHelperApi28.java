/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.DisplayCutout
 *  java.lang.Object
 */
package androidx.window.layout;

import android.view.DisplayCutout;
import androidx.window.layout.e;
import androidx.window.layout.f;
import androidx.window.layout.g;
import androidx.window.layout.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class DisplayCompatHelperApi28 {
    @NotNull
    public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();

    private DisplayCompatHelperApi28() {
    }

    public final int safeInsetBottom(@NotNull DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter((Object)displayCutout, "displayCutout");
        return f.a(displayCutout);
    }

    public final int safeInsetLeft(@NotNull DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter((Object)displayCutout, "displayCutout");
        return g.a(displayCutout);
    }

    public final int safeInsetRight(@NotNull DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter((Object)displayCutout, "displayCutout");
        return e.a(displayCutout);
    }

    public final int safeInsetTop(@NotNull DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter((Object)displayCutout, "displayCutout");
        return h.a(displayCutout);
    }
}

