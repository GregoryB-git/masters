package W2;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f6825a;

    public h(String str) {
        this.f6825a = (String) m.j(str);
    }

    public static h f(char c7) {
        return new h(String.valueOf(c7));
    }

    public static h g(String str) {
        return new h(str);
    }

    public Appendable a(Appendable appendable, Iterator it) {
        m.j(appendable);
        if (it.hasNext()) {
            while (true) {
                appendable.append(h(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                appendable.append(this.f6825a);
            }
        }
        return appendable;
    }

    public final StringBuilder b(StringBuilder sb, Iterable iterable) {
        return c(sb, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb, Iterator it) {
        try {
            a(sb, it);
            return sb;
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public final String d(Iterable iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator it) {
        return c(new StringBuilder(), it).toString();
    }

    public CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
