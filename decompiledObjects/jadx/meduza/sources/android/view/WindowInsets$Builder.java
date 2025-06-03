package android.view;

import android.annotation.NonNull;
import android.graphics.Insets;

/* loaded from: classes.dex */
public final /* synthetic */ class WindowInsets$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ WindowInsets$Builder() {
    }

    public /* synthetic */ WindowInsets$Builder(@NonNull WindowInsets windowInsets) {
    }

    @NonNull
    public native /* synthetic */ WindowInsets build();

    @NonNull
    public native /* synthetic */ WindowInsets$Builder setInsets(int i10, @NonNull Insets insets);

    @NonNull
    @Deprecated
    public native /* synthetic */ WindowInsets$Builder setStableInsets(@NonNull Insets insets);

    @NonNull
    @Deprecated
    public native /* synthetic */ WindowInsets$Builder setSystemWindowInsets(@NonNull Insets insets);
}
