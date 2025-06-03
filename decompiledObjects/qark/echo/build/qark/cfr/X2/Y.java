/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.ObjectOutputStream
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Field
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package X2;

import X2.H;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class Y {
    public static b a(Class object, String string2) {
        try {
            object = new b(object.getDeclaredField(string2), null);
            return object;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new AssertionError((Object)noSuchFieldException);
        }
    }

    public static void b(H h8, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(h8.a().size());
        h8 = h8.a().entrySet().iterator();
        while (h8.hasNext()) {
            Map.Entry entry = (Map.Entry)h8.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection)entry.getValue()).size());
            entry = ((Collection)entry.getValue()).iterator();
            while (entry.hasNext()) {
                objectOutputStream.writeObject(entry.next());
            }
        }
    }

    public static final class b {
        public final Field a;

        public b(Field field) {
            this.a = field;
            field.setAccessible(true);
        }

        public /* synthetic */ b(Field field,  a8) {
            this(field);
        }

        public void a(Object object, int n8) {
            try {
                this.a.set(object, (Object)n8);
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError((Object)illegalAccessException);
            }
        }

        public void b(Object object, Object object2) {
            try {
                this.a.set(object, object2);
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError((Object)illegalAccessException);
            }
        }
    }

}

