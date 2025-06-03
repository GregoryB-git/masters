package e0;

import android.view.View;
import e0.d0;
import io.meduza.meduza.R;

/* loaded from: classes.dex */
public final class c0 extends d0.b<Boolean> {
    public c0() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    @Override // e0.d0.b
    public final Boolean b(View view) {
        return Boolean.valueOf(d0.g.c(view));
    }

    @Override // e0.d0.b
    public final void c(View view, Boolean bool) {
        d0.g.g(view, bool.booleanValue());
    }

    @Override // e0.d0.b
    public final boolean f(Boolean bool, Boolean bool2) {
        return !d0.b.a(bool, bool2);
    }
}
