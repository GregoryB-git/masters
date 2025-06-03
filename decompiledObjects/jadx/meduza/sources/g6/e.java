package g6;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class e implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5903a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5903a) {
            case 0:
                return ((Scope) obj).f2811b.compareTo(((Scope) obj2).f2811b);
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
