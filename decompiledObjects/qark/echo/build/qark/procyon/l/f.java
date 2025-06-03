// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.view.ViewParent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public abstract class f
{
    public static InputConnection a(final InputConnection inputConnection, final EditorInfo editorInfo, final View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {}
        }
        return inputConnection;
    }
}
