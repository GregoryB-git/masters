package S3;

import java.util.Comparator;

/* loaded from: classes.dex */
public interface h {

    public enum a {
        RED,
        BLACK
    }

    public static abstract class b {
        public abstract void a(Object obj, Object obj2);
    }

    h a();

    h b(Object obj, Object obj2, Comparator comparator);

    h c(Object obj, Object obj2, a aVar, h hVar, h hVar2);

    boolean d();

    void e(b bVar);

    h f();

    h g(Object obj, Comparator comparator);

    Object getKey();

    Object getValue();

    h h();

    h i();

    boolean isEmpty();

    int size();
}
