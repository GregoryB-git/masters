package o0;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f18117a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18118b;

    /* renamed from: c, reason: collision with root package name */
    public final List f18119c;

    /* renamed from: d, reason: collision with root package name */
    public final List f18120d;

    /* renamed from: e, reason: collision with root package name */
    public final e f18121e;

    public g(String str, long j7, List list, List list2) {
        this(str, j7, list, list2, null);
    }

    public int a(int i7) {
        int size = this.f18119c.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((C1750a) this.f18119c.get(i8)).f18073b == i7) {
                return i8;
            }
        }
        return -1;
    }

    public g(String str, long j7, List list, List list2, e eVar) {
        this.f18117a = str;
        this.f18118b = j7;
        this.f18119c = Collections.unmodifiableList(list);
        this.f18120d = Collections.unmodifiableList(list2);
        this.f18121e = eVar;
    }
}
