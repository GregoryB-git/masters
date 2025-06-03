// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.io.ObjectOutputStream;

public abstract class Y
{
    public static b a(final Class clazz, final String name) {
        try {
            return new b(clazz.getDeclaredField(name), null);
        }
        catch (NoSuchFieldException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    public static void b(final H h, final ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(h.a().size());
        for (final Map.Entry<Object, V> entry : h.a().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection)entry.getValue()).size());
            final Iterator iterator2 = ((Collection)entry.getValue()).iterator();
            while (iterator2.hasNext()) {
                objectOutputStream.writeObject(iterator2.next());
            }
        }
    }
    
    public static final class b
    {
        public final Field a;
        
        public b(final Field a) {
            (this.a = a).setAccessible(true);
        }
        
        public void a(final Object obj, final int i) {
            try {
                this.a.set(obj, i);
            }
            catch (IllegalAccessException detailMessage) {
                throw new AssertionError((Object)detailMessage);
            }
        }
        
        public void b(final Object obj, final Object value) {
            try {
                this.a.set(obj, value);
            }
            catch (IllegalAccessException detailMessage) {
                throw new AssertionError((Object)detailMessage);
            }
        }
    }
}
