/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

public abstract class g {
    public Fragment b(Context context, String string2, Bundle bundle) {
        return Fragment.V(context, string2, bundle);
    }

    public abstract View e(int var1);

    public abstract boolean f();
}

