package k2;

import androidx.window.extensions.layout.WindowLayoutInfo;
import dc.l;
import ec.h;
import ec.i;

/* loaded from: classes.dex */
public final /* synthetic */ class b extends h implements l<WindowLayoutInfo, rb.h> {
    public b(f fVar) {
        super(1, fVar, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // dc.l
    public final rb.h invoke(WindowLayoutInfo windowLayoutInfo) {
        WindowLayoutInfo windowLayoutInfo2 = windowLayoutInfo;
        i.e(windowLayoutInfo2, "p0");
        ((f) this.receiver).accept(windowLayoutInfo2);
        return rb.h.f13851a;
    }
}
