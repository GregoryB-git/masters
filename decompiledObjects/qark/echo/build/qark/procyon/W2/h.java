// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W2;

import java.util.Objects;
import java.io.IOException;
import java.util.Iterator;

public class h
{
    public final String a;
    
    public h(final String s) {
        this.a = (String)m.j(s);
    }
    
    public static h f(final char c) {
        return new h(String.valueOf(c));
    }
    
    public static h g(final String s) {
        return new h(s);
    }
    
    public Appendable a(final Appendable appendable, final Iterator iterator) {
        m.j(appendable);
        if (iterator.hasNext()) {
            while (true) {
                appendable.append(this.h(iterator.next()));
                if (!iterator.hasNext()) {
                    break;
                }
                appendable.append(this.a);
            }
        }
        return appendable;
    }
    
    public final StringBuilder b(final StringBuilder sb, final Iterable iterable) {
        return this.c(sb, iterable.iterator());
    }
    
    public final StringBuilder c(final StringBuilder sb, final Iterator iterator) {
        try {
            this.a(sb, iterator);
            return sb;
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    public final String d(final Iterable iterable) {
        return this.e(iterable.iterator());
    }
    
    public final String e(final Iterator iterator) {
        return this.c(new StringBuilder(), iterator).toString();
    }
    
    public CharSequence h(final Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence)obj;
        }
        return obj.toString();
    }
}
