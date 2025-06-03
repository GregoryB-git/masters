package e7;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

/* loaded from: classes.dex */
public final class d2 implements zzo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f4147b;

    public d2(w1 w1Var, String str) {
        this.f4146a = str;
        this.f4147b = w1Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) this.f4147b.f4720e.getOrDefault(this.f4146a, null);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
