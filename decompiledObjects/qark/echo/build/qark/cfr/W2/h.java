/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Appendable
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.Objects
 */
package W2;

import W2.m;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

public class h {
    public final String a;

    public h(String string2) {
        this.a = (String)m.j(string2);
    }

    public static h f(char c8) {
        return new h(String.valueOf((char)c8));
    }

    public static h g(String string2) {
        return new h(string2);
    }

    public Appendable a(Appendable appendable, Iterator iterator) {
        m.j((Object)appendable);
        if (iterator.hasNext()) {
            do {
                appendable.append(this.h(iterator.next()));
                if (!iterator.hasNext()) break;
                appendable.append((CharSequence)this.a);
            } while (true);
        }
        return appendable;
    }

    public final StringBuilder b(StringBuilder stringBuilder, Iterable iterable) {
        return this.c(stringBuilder, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder stringBuilder, Iterator iterator) {
        try {
            this.a((Appendable)stringBuilder, iterator);
            return stringBuilder;
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }

    public final String d(Iterable iterable) {
        return this.e(iterable.iterator());
    }

    public final String e(Iterator iterator) {
        return this.c(new StringBuilder(), iterator).toString();
    }

    public CharSequence h(Object object) {
        Objects.requireNonNull((Object)object);
        if (object instanceof CharSequence) {
            return (CharSequence)object;
        }
        return object.toString();
    }
}

