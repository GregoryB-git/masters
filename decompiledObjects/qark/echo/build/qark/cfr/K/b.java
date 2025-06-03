/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.inputmethod.EditorInfo
 *  java.lang.Object
 *  java.lang.String
 */
package K;

import K.a;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;

public abstract class b {
    public static final String[] a = new String[0];

    public static void a(EditorInfo editorInfo, String[] arrstring) {
        if (Build.VERSION.SDK_INT >= 25) {
            a.a(editorInfo, arrstring);
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", arrstring);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", arrstring);
    }
}

