package e0;

import android.text.TextUtils;
import android.view.View;
import e0.d0;
import io.meduza.meduza.R;

/* loaded from: classes.dex */
public final class b0 extends d0.b<CharSequence> {
    public b0(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    @Override // e0.d0.b
    public final CharSequence b(View view) {
        return d0.g.b(view);
    }

    @Override // e0.d0.b
    public final void c(View view, CharSequence charSequence) {
        d0.g.h(view, charSequence);
    }

    @Override // e0.d0.b
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
