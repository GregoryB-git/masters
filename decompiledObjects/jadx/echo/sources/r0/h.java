package r0;

import java.util.Collections;
import java.util.List;
import v0.InterfaceC2047a;

/* loaded from: classes.dex */
public abstract class h implements InterfaceC2047a {

    /* renamed from: a, reason: collision with root package name */
    public final String f19013a;

    /* renamed from: b, reason: collision with root package name */
    public final List f19014b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19015c;

    public h(String str, List list, boolean z7) {
        this.f19013a = str;
        this.f19014b = Collections.unmodifiableList(list);
        this.f19015c = z7;
    }
}
