/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 */
package e6;

import e6.j;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;

public class k
extends j {
    public static boolean j(File file) {
        boolean bl;
        Intrinsics.checkNotNullParameter((Object)file, "<this>");
        file = j.i(file).iterator();
        block0 : do {
            bl = true;
            while (file.hasNext()) {
                File file2 = (File)file.next();
                if ((file2.delete() || !file2.exists()) && bl) continue block0;
                bl = false;
            }
            break;
        } while (true);
        return bl;
    }

    public static String k(File object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = object.getName();
        Intrinsics.checkNotNullExpressionValue(object, "getName(...)");
        return i.d0((String)object, '.', "");
    }
}

