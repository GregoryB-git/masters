package l2;

import androidx.window.sidecar.SidecarDisplayFeature;
import dc.l;
import ec.i;
import ec.j;

/* loaded from: classes.dex */
public final class b extends j implements l<SidecarDisplayFeature, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f9533a = new b();

    public b() {
        super(1);
    }

    @Override // dc.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        i.e(sidecarDisplayFeature, "$this$require");
        boolean z10 = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
