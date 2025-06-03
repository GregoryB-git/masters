package X2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class K {

    public static class a extends AbstractC0685c {
        private static final long serialVersionUID = 0;

        /* renamed from: t, reason: collision with root package name */
        public transient W2.s f7066t;

        public a(Map map, W2.s sVar) {
            super(map);
            this.f7066t = (W2.s) W2.m.j(sVar);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            Object readObject = objectInputStream.readObject();
            Objects.requireNonNull(readObject);
            this.f7066t = (W2.s) readObject;
            Object readObject2 = objectInputStream.readObject();
            Objects.requireNonNull(readObject2);
            v((Map) readObject2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f7066t);
            objectOutputStream.writeObject(o());
        }

        @Override // X2.AbstractC0688f
        public Map c() {
            return r();
        }

        @Override // X2.AbstractC0688f
        public Set d() {
            return s();
        }

        @Override // X2.AbstractC0686d
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public List p() {
            return (List) this.f7066t.get();
        }
    }

    public static boolean a(H h7, Object obj) {
        if (obj == h7) {
            return true;
        }
        if (obj instanceof H) {
            return h7.a().equals(((H) obj).a());
        }
        return false;
    }

    public static D b(Map map, W2.s sVar) {
        return new a(map, sVar);
    }
}
