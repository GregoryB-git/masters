package d5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f3483a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3484b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a> f3485c;

    /* renamed from: d, reason: collision with root package name */
    public final List<f> f3486d;

    public g() {
        throw null;
    }

    public g(String str, long j10, ArrayList arrayList, List list) {
        this.f3483a = str;
        this.f3484b = j10;
        this.f3485c = Collections.unmodifiableList(arrayList);
        this.f3486d = Collections.unmodifiableList(list);
    }
}
