package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public abstract class g {
    public Fragment b(Context context, String str, Bundle bundle) {
        return Fragment.V(context, str, bundle);
    }

    public abstract View e(int i7);

    public abstract boolean f();
}
