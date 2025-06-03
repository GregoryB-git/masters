/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  java.util.Set
 */
package X2;

import W2.m;
import W2.s;
import X2.D;
import X2.H;
import X2.c;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class K {
    public static boolean a(H h8, Object object) {
        if (object == h8) {
            return true;
        }
        if (object instanceof H) {
            object = (H)object;
            return h8.a().equals((Object)object.a());
        }
        return false;
    }

    public static D b(Map map, s s8) {
        return new a(map, s8);
    }

    public static class a
    extends c {
        private static final long serialVersionUID = 0L;
        public transient s t;

        public a(Map map, s s8) {
            super(map);
            this.t = (s)m.j(s8);
        }

        private void readObject(ObjectInputStream object) {
            object.defaultReadObject();
            Object object2 = object.readObject();
            Objects.requireNonNull((Object)object2);
            this.t = (s)object2;
            object = object.readObject();
            Objects.requireNonNull((Object)object);
            this.v((Map)object);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject((Object)this.t);
            objectOutputStream.writeObject((Object)this.o());
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

