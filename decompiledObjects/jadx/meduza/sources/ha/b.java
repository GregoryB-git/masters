package ha;

import android.os.Trace;
import com.google.firebase.components.ComponentRegistrar;
import d8.e;
import d8.f;
import d8.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements f {
    @Override // d8.f
    public final List<d8.b<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final d8.b<?> bVar : componentRegistrar.getComponents()) {
            final String str = bVar.f3582a;
            if (str != null) {
                bVar = new d8.b<>(str, bVar.f3583b, bVar.f3584c, bVar.f3585d, bVar.f3586e, new e() { // from class: ha.a
                    @Override // d8.e
                    public final Object g(u uVar) {
                        String str2 = str;
                        d8.b bVar2 = bVar;
                        try {
                            Trace.beginSection(str2);
                            return bVar2.f.g(uVar);
                        } finally {
                            Trace.endSection();
                        }
                    }
                }, bVar.f3587g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
