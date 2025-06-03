package f5;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g implements y4.a<g> {

    /* renamed from: a, reason: collision with root package name */
    public final String f5428a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f5429b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5430c;

    public g(String str, List<String> list, boolean z10) {
        this.f5428a = str;
        this.f5429b = Collections.unmodifiableList(list);
        this.f5430c = z10;
    }
}
