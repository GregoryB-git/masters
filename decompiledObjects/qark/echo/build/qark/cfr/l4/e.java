/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  android.util.JsonWriter
 *  java.io.Writer
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package l4;

import android.util.Base64;
import android.util.JsonWriter;
import j4.b;
import j4.c;
import j4.d;
import j4.g;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l4.f;

public final class e
implements j4.e,
g {
    public e a = null;
    public boolean b = true;
    public final JsonWriter c;
    public final Map d;
    public final Map e;
    public final d f;
    public final boolean g;

    public e(Writer writer, Map map, Map map2, d d8, boolean bl) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = d8;
        this.g = bl;
    }

    @Override
    public j4.e a(c c8, double d8) {
        return this.m(c8.b(), d8);
    }

    @Override
    public j4.e b(c c8, long l8) {
        return this.o(c8.b(), l8);
    }

    @Override
    public j4.e c(c c8, int n8) {
        return this.n(c8.b(), n8);
    }

    @Override
    public j4.e f(c c8, boolean bl) {
        return this.q(c8.b(), bl);
    }

    @Override
    public j4.e g(c c8, Object object) {
        return this.p(c8.b(), object);
    }

    public e h(double d8) {
        this.y();
        this.c.value(d8);
        return this;
    }

    public e i(int n8) {
        this.y();
        this.c.value((long)n8);
        return this;
    }

    public e j(long l8) {
        this.y();
        this.c.value(l8);
        return this;
    }

    public e k(Object object, boolean object2) {
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        if (object2 != false && this.t(object)) {
            object = object == null ? null : object.getClass();
            throw new b(String.format((String)"%s cannot be encoded inline", (Object[])new Object[]{object}));
        }
        if (object == null) {
            this.c.nullValue();
            return this;
        }
        if (object instanceof Number) {
            this.c.value((Number)object);
            return this;
        }
        if (object.getClass().isArray()) {
            int n11;
            if (object instanceof byte[]) {
                return this.s((byte[])object);
            }
            this.c.beginArray();
            if (object instanceof int[]) {
                object = (long[])object;
                n8 = object.length;
                for (n11 = 0; n11 < n8; ++n11) {
                    n9 = (int)object[n11];
                    this.c.value((long)n9);
                }
            } else if (object instanceof long[]) {
                object = (long[])object;
                n9 = object.length;
                for (n11 = n8; n11 < n9; ++n11) {
                    this.j(object[n11]);
                }
            } else if (object instanceof double[]) {
                object = (double[])object;
                n8 = object.length;
                for (n11 = n9; n11 < n8; ++n11) {
                    Object object3 = object[n11];
                    this.c.value((double)object3);
                }
            } else if (object instanceof boolean[]) {
                object = (boolean[])object;
                n8 = object.length;
                for (n11 = n10; n11 < n8; ++n11) {
                    object2 = object[n11];
                    this.c.value((boolean)object2);
                }
            } else if (object instanceof Number[]) {
                object = (Number[])object;
                n8 = object.length;
                for (n11 = 0; n11 < n8; ++n11) {
                    this.k(object[n11], false);
                }
            } else {
                object = (Object[])object;
                n8 = object.length;
                for (n11 = 0; n11 < n8; ++n11) {
                    this.k(object[n11], false);
                }
            }
            this.c.endArray();
            return this;
        }
        if (object instanceof Collection) {
            object = (Collection)object;
            this.c.beginArray();
            object = object.iterator();
            while (object.hasNext()) {
                this.k(object.next(), false);
            }
            this.c.endArray();
            return this;
        }
        if (object instanceof Map) {
            object = (Map)object;
            this.c.beginObject();
            for (Map.Entry entry : object.entrySet()) {
                object = entry.getKey();
                try {
                    this.p((String)object, entry.getValue());
                }
                catch (ClassCastException classCastException) {
                    throw new b(String.format((String)"Only String keys are currently supported in maps, got %s of type %s instead.", (Object[])new Object[]{object, object.getClass()}), (Exception)classCastException);
                }
            }
            this.c.endObject();
            return this;
        }
        Object object4 = (d)this.d.get((Object)object.getClass());
        if (object4 != null) {
            return this.v((d)object4, object, (boolean)object2);
        }
        object4 = (j4.f)this.e.get((Object)object.getClass());
        if (object4 != null) {
            object4.a(object, this);
            return this;
        }
        if (object instanceof Enum) {
            if (object instanceof f) {
                this.i(((f)object).g());
                return this;
            }
            this.l(((Enum)object).name());
            return this;
        }
        return this.v(this.f, object, (boolean)object2);
    }

    public e l(String string2) {
        this.y();
        this.c.value(string2);
        return this;
    }

    public e m(String string2, double d8) {
        this.y();
        this.c.name(string2);
        return this.h(d8);
    }

    public e n(String string2, int n8) {
        this.y();
        this.c.name(string2);
        return this.i(n8);
    }

    public e o(String string2, long l8) {
        this.y();
        this.c.name(string2);
        return this.j(l8);
    }

    public e p(String string2, Object object) {
        if (this.g) {
            return this.x(string2, object);
        }
        return this.w(string2, object);
    }

    public e q(String string2, boolean bl) {
        this.y();
        this.c.name(string2);
        return this.r(bl);
    }

    public e r(boolean bl) {
        this.y();
        this.c.value(bl);
        return this;
    }

    public e s(byte[] arrby) {
        this.y();
        if (arrby == null) {
            this.c.nullValue();
            return this;
        }
        this.c.value(Base64.encodeToString((byte[])arrby, (int)2));
        return this;
    }

    public final boolean t(Object object) {
        if (!(object == null || object.getClass().isArray() || object instanceof Collection || object instanceof Date || object instanceof Enum || object instanceof Number)) {
            return false;
        }
        return true;
    }

    public void u() {
        this.y();
        this.c.flush();
    }

    public e v(d d8, Object object, boolean bl) {
        if (!bl) {
            this.c.beginObject();
        }
        d8.a(object, this);
        if (!bl) {
            this.c.endObject();
        }
        return this;
    }

    public final e w(String string2, Object object) {
        this.y();
        this.c.name(string2);
        if (object == null) {
            this.c.nullValue();
            return this;
        }
        return this.k(object, false);
    }

    public final e x(String string2, Object object) {
        if (object == null) {
            return this;
        }
        this.y();
        this.c.name(string2);
        return this.k(object, false);
    }

    public final void y() {
        if (this.b) {
            e e8 = this.a;
            if (e8 != null) {
                e8.y();
                this.a.b = false;
                this.a = null;
                this.c.endObject();
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}

