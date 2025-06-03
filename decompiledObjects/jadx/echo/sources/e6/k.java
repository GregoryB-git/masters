package e6;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;

/* loaded from: classes.dex */
public class k extends j {
    public static boolean j(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z7 = true;
            for (File file2 : j.i(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z7) {
                        break;
                    }
                }
                z7 = false;
            }
            return z7;
        }
    }

    public static String k(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return s.d0(name, '.', "");
    }
}
