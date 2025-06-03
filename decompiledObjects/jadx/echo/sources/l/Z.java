package l;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class Z {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            a0.f(view, charSequence);
        }
    }
}
