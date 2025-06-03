package R2;

import com.google.android.gms.internal.measurement.InterfaceC1077y6;
import java.util.Map;

/* loaded from: classes.dex */
public final class F2 implements InterfaceC1077y6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0632x2 f4664b;

    public F2(C0632x2 c0632x2, String str) {
        this.f4664b = c0632x2;
        this.f4663a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1077y6
    public final String i(String str) {
        Map map;
        map = this.f4664b.f5588d;
        Map map2 = (Map) map.get(this.f4663a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
