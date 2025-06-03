package X2;

import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Y {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Field f7096a;

        public b(Field field) {
            this.f7096a = field;
            field.setAccessible(true);
        }

        public void a(Object obj, int i7) {
            try {
                this.f7096a.set(obj, Integer.valueOf(i7));
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            }
        }

        public void b(Object obj, Object obj2) {
            try {
                this.f7096a.set(obj, obj2);
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            }
        }
    }

    public static b a(Class cls, String str) {
        try {
            return new b(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e7) {
            throw new AssertionError(e7);
        }
    }

    public static void b(H h7, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(h7.a().size());
        for (Map.Entry entry : h7.a().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}
