package z4;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicLong f17701b = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, List<String>> f17702a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(long j10, t5.n nVar, long j11) {
        this(Collections.emptyMap());
        Uri uri = nVar.f14547a;
    }

    public n(Map map) {
        this.f17702a = map;
    }
}
