package a4;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class x extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, List<String>> f207a;

    public x(t5.n nVar, Uri uri, Map map, long j10, Exception exc) {
        super(exc);
        this.f207a = map;
    }
}
