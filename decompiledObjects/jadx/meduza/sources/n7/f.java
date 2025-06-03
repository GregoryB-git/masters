package n7;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public String f11287a;

    public /* synthetic */ f() {
    }

    public final void a(StringBuilder sb2, Iterator it) {
        try {
            if (!it.hasNext()) {
                return;
            }
            while (true) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                if (!it.hasNext()) {
                    return;
                } else {
                    sb2.append((CharSequence) this.f11287a);
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public String b() {
        return this.f11287a;
    }

    public f(String str) {
        str.getClass();
        this.f11287a = str;
    }
}
