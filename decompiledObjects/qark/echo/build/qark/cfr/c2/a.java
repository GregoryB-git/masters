/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c2;

import c2.c;
import c2.d;

public final class a
extends c {
    public final Integer a;
    public final Object b;
    public final d c;

    public a(Integer n8, Object object, d d8) {
        this.a = n8;
        if (object != null) {
            this.b = object;
            if (d8 != null) {
                this.c = d8;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override
    public Integer a() {
        return this.a;
    }

    @Override
    public Object b() {
        return this.b;
    }

    @Override
    public d c() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof c) {
            object = (c)object;
            Integer n8 = this.a;
            if ((n8 == null ? object.a() == null : n8.equals((Object)object.a())) && this.b.equals(object.b()) && this.c.equals((Object)object.c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer n8 = this.a;
        int n9 = n8 == null ? 0 : n8.hashCode();
        return ((n9 ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Event{code=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", payload=");
        stringBuilder.append(this.b);
        stringBuilder.append(", priority=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

