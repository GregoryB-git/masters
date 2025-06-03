package l;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class b1 {

    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        c1 c1Var = c1.f9288s;
        if (c1Var != null && c1Var.f9289a == view) {
            c1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new c1(view, charSequence);
            return;
        }
        c1 c1Var2 = c1.t;
        if (c1Var2 != null && c1Var2.f9289a == view) {
            c1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
