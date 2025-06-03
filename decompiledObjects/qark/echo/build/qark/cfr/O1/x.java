/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package O1;

import O1.H;
import O1.P;
import O1.e;
import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.B;

public final class x
extends e {
    public static final a c = new a(null);

    public x(String string2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(string2, "action");
        super(string2, bundle);
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        this.b(c.a(string2, bundle2));
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final Uri a(String object, Bundle bundle) {
            Intrinsics.checkNotNullParameter(object, "action");
            if (Intrinsics.a(object, "oauth")) {
                object = P.a;
                return P.g(H.k(), "oauth/authorize", bundle);
            }
            Object object2 = P.a;
            object2 = H.k();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(B.w());
            stringBuilder.append("/dialog/");
            stringBuilder.append((String)object);
            return P.g((String)object2, stringBuilder.toString(), bundle);
        }
    }

}

