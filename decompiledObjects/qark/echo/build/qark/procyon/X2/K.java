// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.List;
import java.util.Collection;
import java.util.Set;
import java.io.ObjectOutputStream;
import java.util.Objects;
import java.io.ObjectInputStream;
import W2.m;
import W2.s;
import java.util.Map;

public abstract class K
{
    public static boolean a(final H h, final Object o) {
        return o == h || (o instanceof H && h.a().equals(((H)o).a()));
    }
    
    public static D b(final Map map, final s s) {
        return new a(map, s);
    }
    
    public static class a extends c
    {
        private static final long serialVersionUID = 0L;
        public transient s t;
        
        public a(final Map map, final s s) {
            super(map);
            this.t = (s)m.j(s);
        }
        
        private void readObject(final ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            final Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.t = (s)object;
            final Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            this.v((Map)object2);
        }
        
        private void writeObject(final ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.t);
            objectOutputStream.writeObject(this.o());
        }
        
        @Override
        public Map c() {
            return this.r();
        }
        
        @Override
        public Set d() {
            return this.s();
        }
        
        public List z() {
            return (List)this.t.get();
        }
    }
}
