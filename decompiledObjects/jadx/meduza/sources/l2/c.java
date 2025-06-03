package l2;

import androidx.window.sidecar.SidecarDisplayFeature;
import dc.l;
import ec.i;
import ec.j;

/* loaded from: classes.dex */
public final class c extends j implements l<SidecarDisplayFeature, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f9534a = new c();

    public c() {
        super(1);
    }

    @Override // dc.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        i.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
    }
}
