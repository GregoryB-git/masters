/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import R2.C3;
import R2.U5;
import android.os.Bundle;
import android.text.TextUtils;

public final class c4
implements U5 {
    public final /* synthetic */ C3 a;

    public c4(C3 c32) {
        this.a = c32;
    }

    @Override
    public final void r(String string2, String string3, Bundle bundle) {
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            this.a.Y("auto", string3, bundle, string2);
            return;
        }
        this.a.y0("auto", string3, bundle);
    }
}

