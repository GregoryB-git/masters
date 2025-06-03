/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e6;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public abstract class c {
    public static final /* synthetic */ String a(File file, File file2, String string2) {
        return c.b(file, file2, string2);
    }

    public static final String b(File object, File file, String string2) {
        object = new StringBuilder(object.toString());
        if (file != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" -> ");
            stringBuilder.append((Object)file);
            object.append(stringBuilder.toString());
        }
        if (string2 != null) {
            file = new StringBuilder();
            file.append(": ");
            file.append(string2);
            object.append(file.toString());
        }
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }
}

