package O4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static volatile d f4017b;

    /* renamed from: a, reason: collision with root package name */
    public final Set f4018a = new HashSet();

    public static d a() {
        d dVar = f4017b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f4017b;
                    if (dVar == null) {
                        dVar = new d();
                        f4017b = dVar;
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    public Set b() {
        Set unmodifiableSet;
        synchronized (this.f4018a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f4018a);
        }
        return unmodifiableSet;
    }
}
