package e5;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends LinkedHashMap<Uri, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3943a = 4;

    public e(int i10) {
        super(i10, 1.0f, false);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
        return size() > this.f3943a;
    }
}
