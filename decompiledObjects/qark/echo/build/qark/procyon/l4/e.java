// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l4;

import java.util.Date;
import android.util.Base64;
import java.util.Iterator;
import j4.f;
import java.util.Collection;
import j4.b;
import j4.c;
import java.io.Writer;
import j4.d;
import java.util.Map;
import android.util.JsonWriter;
import j4.g;

public final class e implements j4.e, g
{
    public e a;
    public boolean b;
    public final JsonWriter c;
    public final Map d;
    public final Map e;
    public final d f;
    public final boolean g;
    
    public e(final Writer writer, final Map d, final Map e, final d f, final boolean g) {
        this.a = null;
        this.b = true;
        this.c = new JsonWriter(writer);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public j4.e a(final c c, final double n) {
        return this.m(c.b(), n);
    }
    
    @Override
    public j4.e b(final c c, final long n) {
        return this.o(c.b(), n);
    }
    
    @Override
    public j4.e c(final c c, final int n) {
        return this.n(c.b(), n);
    }
    
    @Override
    public j4.e f(final c c, final boolean b) {
        return this.q(c.b(), b);
    }
    
    @Override
    public j4.e g(final c c, final Object o) {
        return this.p(c.b(), o);
    }
    
    public e h(final double n) {
        this.y();
        this.c.value(n);
        return this;
    }
    
    public e i(final int n) {
        this.y();
        this.c.value((long)n);
        return this;
    }
    
    public e j(final long n) {
        this.y();
        this.c.value(n);
        return this;
    }
    
    public e k(Object key, final boolean b) {
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        int i = 0;
        if (b && this.t(key)) {
            Object class1;
            if (key == null) {
                class1 = null;
            }
            else {
                class1 = key.getClass();
            }
            throw new b(String.format("%s cannot be encoded inline", class1));
        }
        if (key == null) {
            this.c.nullValue();
            return this;
        }
        if (key instanceof Number) {
            this.c.value((Number)key);
            return this;
        }
        if (key.getClass().isArray()) {
            if (key instanceof byte[]) {
                return this.s((byte[])key);
            }
            this.c.beginArray();
            if (key instanceof int[]) {
                for (int[] array = (int[])key; i < array.length; ++i) {
                    this.c.value((long)array[i]);
                }
            }
            else if (key instanceof long[]) {
                final long[] array2 = (long[])key;
                for (int length = array2.length, j = n; j < length; ++j) {
                    this.j(array2[j]);
                }
            }
            else if (key instanceof double[]) {
                final double[] array3 = (double[])key;
                for (int length2 = array3.length, k = n2; k < length2; ++k) {
                    this.c.value(array3[k]);
                }
            }
            else if (key instanceof boolean[]) {
                final boolean[] array4 = (boolean[])key;
                for (int length3 = array4.length, l = n3; l < length3; ++l) {
                    this.c.value(array4[l]);
                }
            }
            else if (key instanceof Number[]) {
                final Number[] array5 = (Number[])key;
                for (int length4 = array5.length, n4 = 0; n4 < length4; ++n4) {
                    this.k(array5[n4], false);
                }
            }
            else {
                final Object[] array6 = (Object[])key;
                for (int length5 = array6.length, n5 = 0; n5 < length5; ++n5) {
                    this.k(array6[n5], false);
                }
            }
            this.c.endArray();
            return this;
        }
        else {
            if (key instanceof Collection) {
                final Collection collection = (Collection)key;
                this.c.beginArray();
                final Iterator<Object> iterator = collection.iterator();
                while (iterator.hasNext()) {
                    this.k(iterator.next(), false);
                }
                this.c.endArray();
                return this;
            }
            if (key instanceof Map) {
                final Map map = (Map)key;
                this.c.beginObject();
                for (final Map.Entry<Object, V> entry : map.entrySet()) {
                    key = entry.getKey();
                    try {
                        this.p((String)key, entry.getValue());
                        continue;
                    }
                    catch (ClassCastException ex) {
                        throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), ex);
                    }
                    break;
                }
                this.c.endObject();
                return this;
            }
            final d d = this.d.get(key.getClass());
            if (d != null) {
                return this.v(d, key, b);
            }
            final f f = this.e.get(key.getClass());
            if (f != null) {
                f.a(key, this);
                return this;
            }
            if (!(key instanceof Enum)) {
                return this.v(this.f, key, b);
            }
            if (key instanceof l4.f) {
                this.i(((l4.f)key).g());
                return this;
            }
            this.l(((Enum)key).name());
            return this;
        }
    }
    
    public e l(final String s) {
        this.y();
        this.c.value(s);
        return this;
    }
    
    public e m(final String s, final double n) {
        this.y();
        this.c.name(s);
        return this.h(n);
    }
    
    public e n(final String s, final int n) {
        this.y();
        this.c.name(s);
        return this.i(n);
    }
    
    public e o(final String s, final long n) {
        this.y();
        this.c.name(s);
        return this.j(n);
    }
    
    public e p(final String s, final Object o) {
        if (this.g) {
            return this.x(s, o);
        }
        return this.w(s, o);
    }
    
    public e q(final String s, final boolean b) {
        this.y();
        this.c.name(s);
        return this.r(b);
    }
    
    public e r(final boolean b) {
        this.y();
        this.c.value(b);
        return this;
    }
    
    public e s(final byte[] array) {
        this.y();
        if (array == null) {
            this.c.nullValue();
            return this;
        }
        this.c.value(Base64.encodeToString(array, 2));
        return this;
    }
    
    public final boolean t(final Object o) {
        return o == null || o.getClass().isArray() || o instanceof Collection || o instanceof Date || o instanceof Enum || o instanceof Number;
    }
    
    public void u() {
        this.y();
        this.c.flush();
    }
    
    public e v(final d d, final Object o, final boolean b) {
        if (!b) {
            this.c.beginObject();
        }
        d.a(o, this);
        if (!b) {
            this.c.endObject();
        }
        return this;
    }
    
    public final e w(final String s, final Object o) {
        this.y();
        this.c.name(s);
        if (o == null) {
            this.c.nullValue();
            return this;
        }
        return this.k(o, false);
    }
    
    public final e x(final String s, final Object o) {
        if (o == null) {
            return this;
        }
        this.y();
        this.c.name(s);
        return this.k(o, false);
    }
    
    public final void y() {
        if (this.b) {
            final e a = this.a;
            if (a != null) {
                a.y();
                this.a.b = false;
                this.a = null;
                this.c.endObject();
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
