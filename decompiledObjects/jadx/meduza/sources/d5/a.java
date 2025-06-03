package d5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3442a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3443b;

    /* renamed from: c, reason: collision with root package name */
    public final List<j> f3444c;

    /* renamed from: d, reason: collision with root package name */
    public final List<e> f3445d;

    /* renamed from: e, reason: collision with root package name */
    public final List<e> f3446e;
    public final List<e> f;

    public a(int i10, int i11, ArrayList arrayList, List list, List list2, List list3) {
        this.f3442a = i10;
        this.f3443b = i11;
        this.f3444c = Collections.unmodifiableList(arrayList);
        this.f3445d = Collections.unmodifiableList(list);
        this.f3446e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
    }
}
