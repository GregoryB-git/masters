package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.d;
import java.util.Map;

/* loaded from: classes.dex */
class FragmentManager$6 implements androidx.lifecycle.f {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9321o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.d f9322p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ n f9323q;

    @Override // androidx.lifecycle.f
    public void a(androidx.lifecycle.h hVar, d.b bVar) {
        Map map;
        Map map2;
        if (bVar == d.b.ON_START) {
            map2 = this.f9323q.f9470j;
            if (((Bundle) map2.get(this.f9321o)) != null) {
                throw null;
            }
        }
        if (bVar == d.b.ON_DESTROY) {
            this.f9322p.c(this);
            map = this.f9323q.f9471k;
            map.remove(this.f9321o);
        }
    }
}
