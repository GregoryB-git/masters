/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 */
package B3;

import java.lang.annotation.Annotation;

public final class F {
    public final Class a;
    public final Class b;

    public F(Class class_, Class class_2) {
        this.a = class_;
        this.b = class_2;
    }

    public static F a(Class class_, Class class_2) {
        return new F(class_, class_2);
    }

    public static F b(Class class_) {
        return new F(a.class, class_);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (F.class != object.getClass()) {
                return false;
            }
            object = (F)object;
            if (!this.b.equals((Object)object.b)) {
                return false;
            }
            return this.a.equals((Object)object.a);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() * 31 + this.a.hashCode();
    }

    public String toString() {
        if (this.a == a.class) {
            return this.b.getName();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("@");
        stringBuilder.append(this.a.getName());
        stringBuilder.append(" ");
        stringBuilder.append(this.b.getName());
        return stringBuilder.toString();
    }

    public static @interface a {
    }

}

