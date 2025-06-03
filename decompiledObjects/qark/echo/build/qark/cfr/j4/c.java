/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package j4;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class c {
    public final String a;
    public final Map b;

    public c(String string2, Map map) {
        this.a = string2;
        this.b = map;
    }

    public /* synthetic */ c(String string2, Map map,  a8) {
        this(string2, map);
    }

    public static b a(String string2) {
        return new b(string2);
    }

    public static c d(String string2) {
        return new c(string2, Collections.emptyMap());
    }

    public String b() {
        return this.a;
    }

    public Annotation c(Class class_) {
        return (Annotation)this.b.get((Object)class_);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        if (this.a.equals((Object)object.a) && this.b.equals((Object)object.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FieldDescriptor{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", properties=");
        stringBuilder.append((Object)this.b.values());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b {
        public final String a;
        public Map b = null;

        public b(String string2) {
            this.a = string2;
        }

        public c a() {
            String string2 = this.a;
            Map map = this.b == null ? Collections.emptyMap() : Collections.unmodifiableMap((Map)new HashMap(this.b));
            return new c(string2, map, null);
        }

        public b b(Annotation annotation) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put((Object)annotation.annotationType(), (Object)annotation);
            return this;
        }
    }

}

