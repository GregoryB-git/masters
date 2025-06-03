package R;

import androidx.datastore.preferences.protobuf.C0778z;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4504a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final f a(InputStream input) {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                f O6 = f.O(input);
                Intrinsics.checkNotNullExpressionValue(O6, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return O6;
            } catch (C0778z e7) {
                throw new P.a("Unable to parse preferences proto.", e7);
            }
        }
    }
}
