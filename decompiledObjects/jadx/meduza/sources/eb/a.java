package eb;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5012b = new a(new IdentityHashMap());

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap<b<?>, Object> f5013a;

    /* renamed from: eb.a$a, reason: collision with other inner class name */
    public static final class C0073a {

        /* renamed from: a, reason: collision with root package name */
        public a f5014a;

        /* renamed from: b, reason: collision with root package name */
        public IdentityHashMap<b<?>, Object> f5015b;

        public C0073a(a aVar) {
            this.f5014a = aVar;
        }

        public final a a() {
            if (this.f5015b != null) {
                for (Map.Entry<b<?>, Object> entry : this.f5014a.f5013a.entrySet()) {
                    if (!this.f5015b.containsKey(entry.getKey())) {
                        this.f5015b.put(entry.getKey(), entry.getValue());
                    }
                }
                this.f5014a = new a(this.f5015b);
                this.f5015b = null;
            }
            return this.f5014a;
        }

        public final void b(b bVar) {
            if (this.f5014a.f5013a.containsKey(bVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f5014a.f5013a);
                identityHashMap.remove(bVar);
                this.f5014a = new a(identityHashMap);
            }
            IdentityHashMap<b<?>, Object> identityHashMap2 = this.f5015b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(bVar);
            }
        }

        public final void c(b bVar, Object obj) {
            if (this.f5015b == null) {
                this.f5015b = new IdentityHashMap<>(1);
            }
            this.f5015b.put(bVar, obj);
        }
    }

    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f5016a;

        public b(String str) {
            this.f5016a = str;
        }

        public final String toString() {
            return this.f5016a;
        }
    }

    public /* synthetic */ a() {
        throw null;
    }

    public a(IdentityHashMap<b<?>, Object> identityHashMap) {
        this.f5013a = identityHashMap;
    }

    public final <T> T a(b<T> bVar) {
        return (T) this.f5013a.get(bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f5013a.size() != aVar.f5013a.size()) {
            return false;
        }
        for (Map.Entry<b<?>, Object> entry : this.f5013a.entrySet()) {
            if (!aVar.f5013a.containsKey(entry.getKey()) || !x6.b.Q(entry.getValue(), aVar.f5013a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry<b<?>, Object> entry : this.f5013a.entrySet()) {
            i10 += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i10;
    }

    public final String toString() {
        return this.f5013a.toString();
    }
}
