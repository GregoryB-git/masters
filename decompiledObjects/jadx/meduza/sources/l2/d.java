package l2;

import androidx.window.sidecar.SidecarDisplayFeature;
import dc.l;
import ec.i;
import ec.j;

/* loaded from: classes.dex */
public final class d extends j implements l<SidecarDisplayFeature, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public static final d f9535a = new d();

    public d() {
        super(1);
    }

    @Override // dc.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        i.e(sidecarDisplayFeature, "$this$require");
        boolean z10 = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
