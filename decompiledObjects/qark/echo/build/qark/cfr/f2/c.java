/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f2;

import c2.e;
import f2.o;
import f2.p;

public final class c
extends o {
    public final p a;
    public final String b;
    public final c2.c c;
    public final e d;
    public final c2.b e;

    public c(p p8, String string2, c2.c c8, e e8, c2.b b8) {
        this.a = p8;
        this.b = string2;
        this.c = c8;
        this.d = e8;
        this.e = b8;
    }

    public /* synthetic */ c(p p8, String string2, c2.c c8, e e8, c2.b b8,  a8) {
        this(p8, string2, c8, e8, b8);
    }

    @Override
    public c2.b b() {
        return this.e;
    }

    @Override
    public c2.c c() {
        return this.c;
    }

    @Override
    public e e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof o) {
            if (this.a.equals((Object)(object = (o)object).f()) && this.b.equals((Object)object.g()) && this.c.equals((Object)object.c()) && this.d.equals((Object)object.e()) && this.e.equals(object.b())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public p f() {
        return this.a;
    }

    @Override
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SendRequest{transportContext=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", transportName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", event=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", transformer=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", encoding=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends o.a {
        public p a;
        public String b;
        public c2.c c;
        public e d;
        public c2.b e;

        @Override
        public o a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                object2.append("");
                object2.append(" transportContext");
                object2 = object2.toString();
            }
            object = object2;
            if (this.b == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" transportName");
                object = object.toString();
            }
            object2 = object;
            if (this.c == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" event");
                object2 = object2.toString();
            }
            object = object2;
            if (this.d == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" transformer");
                object = object.toString();
            }
            object2 = object;
            if (this.e == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" encoding");
                object2 = object2.toString();
            }
            if (object2.isEmpty()) {
                return new c(this.a, this.b, this.c, this.d, this.e, null);
            }
            object = new StringBuilder();
            object.append("Missing required properties:");
            object.append((String)object2);
            throw new IllegalStateException(object.toString());
        }

        @Override
        public o.a b(c2.b b8) {
            if (b8 != null) {
                this.e = b8;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override
        public o.a c(c2.c c8) {
            if (c8 != null) {
                this.c = c8;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override
        public o.a d(e e8) {
            if (e8 != null) {
                this.d = e8;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override
        public o.a e(p p8) {
            if (p8 != null) {
                this.a = p8;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override
        public o.a f(String string2) {
            if (string2 != null) {
                this.b = string2;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

}

