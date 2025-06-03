package T3;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f6078a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6079b;

    public a(List list, List list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.f6078a = list;
        this.f6079b = list2;
    }

    public List a() {
        return Collections.unmodifiableList(this.f6079b);
    }

    public List b() {
        return Collections.unmodifiableList(this.f6078a);
    }
}
