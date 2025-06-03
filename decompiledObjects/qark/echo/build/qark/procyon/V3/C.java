// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import java.util.Map;
import Q3.d;
import java.util.Iterator;
import d4.b;
import java.util.ArrayList;
import java.util.List;

public class C
{
    public final List a;
    public int b;
    
    public C(final k k) {
        this.a = new ArrayList();
        int i = 0;
        this.b = 0;
        final Iterator iterator = k.iterator();
        while (iterator.hasNext()) {
            this.a.add(iterator.next().e());
        }
        this.b = Math.max(1, this.a.size());
        while (i < this.a.size()) {
            this.b += f((CharSequence)this.a.get(i));
            ++i;
        }
        this.a();
    }
    
    public static String b(final String str, final List list) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); ++i) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }
    
    public static int f(final CharSequence charSequence) {
        final int length = charSequence.length();
        int i = 0;
        int n = 0;
        while (i < length) {
            final char char1 = charSequence.charAt(i);
            if (char1 <= '\u007f') {
                ++n;
            }
            else if (char1 <= '\u07ff') {
                n += 2;
            }
            else if (Character.isHighSurrogate(char1)) {
                n += 4;
                ++i;
            }
            else {
                n += 3;
            }
            ++i;
        }
        return n;
    }
    
    public static void g(final k k, final Object o) {
        new C(k).h(o);
    }
    
    public final void a() {
        if (this.b > 768) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Data has a key path longer than 768 bytes (");
            sb.append(this.b);
            sb.append(").");
            throw new d(sb.toString());
        }
        if (this.a.size() <= 32) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
        sb2.append(this.e());
        throw new d(sb2.toString());
    }
    
    public final String c() {
        final List a = this.a;
        final String s = a.remove(a.size() - 1);
        this.b -= f(s);
        if (this.a.size() > 0) {
            --this.b;
        }
        return s;
    }
    
    public final void d(final String s) {
        if (this.a.size() > 0) {
            ++this.b;
        }
        this.a.add(s);
        this.b += f(s);
        this.a();
    }
    
    public final String e() {
        if (this.a.size() == 0) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("in path '");
        sb.append(b("/", this.a));
        sb.append("'");
        return sb.toString();
    }
    
    public final void h(final Object o) {
        if (o instanceof Map) {
            final Map map = (Map)o;
            for (final String s : map.keySet()) {
                if (s.startsWith(".")) {
                    continue;
                }
                this.d(s);
                this.h(map.get(s));
                this.c();
            }
            return;
        }
        if (o instanceof List) {
            final List list = (List)o;
            for (int i = 0; i < list.size(); ++i) {
                this.d(Integer.toString(i));
                this.h(list.get(i));
                this.c();
            }
        }
    }
}
