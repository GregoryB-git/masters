package e6;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class j extends i {
    public static final e h(File file, f direction) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new e(file, direction);
    }

    public static final e i(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return h(file, f.f14053p);
    }
}
