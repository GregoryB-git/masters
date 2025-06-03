package B3;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class s extends t {

    /* renamed from: o, reason: collision with root package name */
    public final List f797o;

    public s(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f797o = list;
    }
}
