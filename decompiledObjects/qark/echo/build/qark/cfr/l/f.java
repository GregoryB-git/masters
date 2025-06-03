/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package l;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public abstract class f {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            editorInfo = view.getParent();
            while (editorInfo instanceof View) {
                editorInfo = editorInfo.getParent();
            }
        }
        return inputConnection;
    }
}

