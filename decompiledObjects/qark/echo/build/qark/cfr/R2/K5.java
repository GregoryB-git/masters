/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.D5;
import R2.G2;
import R2.J5;
import R2.U5;
import R2.Y1;
import R2.a2;
import android.os.Bundle;
import android.text.TextUtils;

public final class K5
implements U5 {
    public final /* synthetic */ D5 a;

    public K5(D5 d52) {
        this.a = d52;
    }

    @Override
    public final void r(String string2, String string3, Bundle bundle) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            if (D5.h(this.a) != null) {
                D5.h(this.a).j().G().b("AppId not known when logging event", string3);
                return;
            }
        } else {
            this.a.e().D(new J5(this, string2, string3, bundle));
        }
    }
}

