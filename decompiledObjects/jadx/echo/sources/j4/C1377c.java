package j4;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: j4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1377c {

    /* renamed from: a, reason: collision with root package name */
    public final String f15456a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f15457b;

    /* renamed from: j4.c$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f15458a;

        /* renamed from: b, reason: collision with root package name */
        public Map f15459b = null;

        public b(String str) {
            this.f15458a = str;
        }

        public C1377c a() {
            return new C1377c(this.f15458a, this.f15459b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f15459b)));
        }

        public b b(Annotation annotation) {
            if (this.f15459b == null) {
                this.f15459b = new HashMap();
            }
            this.f15459b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public C1377c(String str, Map map) {
        this.f15456a = str;
        this.f15457b = map;
    }

    public static b a(String str) {
        return new b(str);
    }

    public static C1377c d(String str) {
        return new C1377c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f15456a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f15457b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1377c)) {
            return false;
        }
        C1377c c1377c = (C1377c) obj;
        return this.f15456a.equals(c1377c.f15456a) && this.f15457b.equals(c1377c.f15457b);
    }

    public int hashCode() {
        return (this.f15456a.hashCode() * 31) + this.f15457b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f15456a + ", properties=" + this.f15457b.values() + "}";
    }
}
