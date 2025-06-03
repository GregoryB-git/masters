/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.RemoteInput
 *  android.content.Intent
 *  android.os.Bundle
 *  java.lang.Object
 */
package w;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

public abstract class l {
    public static RemoteInput a(l l8) {
        return a.b(l8);
    }

    public static RemoteInput[] b(l[] arrl) {
        if (arrl == null) {
            return null;
        }
        RemoteInput[] arrremoteInput = new RemoteInput[arrl.length];
        for (int i8 = 0; i8 < arrl.length; ++i8) {
            l l8 = arrl[i8];
            arrremoteInput[i8] = l.a(null);
        }
        return arrremoteInput;
    }

    public static abstract class a {
        public static void a(Object object, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[])((RemoteInput[])object), (Intent)intent, (Bundle)bundle);
        }

        public static RemoteInput b(l l8) {
            throw null;
        }

        public static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent((Intent)intent);
        }
    }

}

