/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package R;

import R.f;
import androidx.datastore.preferences.protobuf.z;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public abstract class d {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final f a(InputStream object) {
            Intrinsics.checkNotNullParameter(object, "input");
            try {
                object = f.O((InputStream)object);
                Intrinsics.checkNotNullExpressionValue(object, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return object;
            }
            catch (z z8) {
                throw new P.a("Unable to parse preferences proto.", (Throwable)z8);
            }
        }
    }

}

