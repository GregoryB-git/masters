// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.view.inputmethod.EditorInfo;

public abstract class b
{
    public static final String[] a;
    
    static {
        a = new String[0];
    }
    
    public static void a(final EditorInfo editorInfo, final String[] array) {
        if (Build$VERSION.SDK_INT >= 25) {
            K.a.a(editorInfo, array);
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        ((BaseBundle)editorInfo.extras).putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", array);
        ((BaseBundle)editorInfo.extras).putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", array);
    }
}
