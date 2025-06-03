// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R;

import androidx.datastore.preferences.protobuf.z;
import P.a;
import kotlin.jvm.internal.Intrinsics;
import java.io.InputStream;
import kotlin.jvm.internal.g;

public abstract class d
{
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    public static final class a
    {
        public final f a(final InputStream inputStream) {
            Intrinsics.checkNotNullParameter(inputStream, "input");
            try {
                final f o = f.O(inputStream);
                Intrinsics.checkNotNullExpressionValue(o, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return o;
            }
            catch (z z) {
                throw new P.a("Unable to parse preferences proto.", z);
            }
        }
    }
}
