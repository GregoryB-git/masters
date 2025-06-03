// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import t.b;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Collections;
import S2.a;
import android.view.View;
import java.util.Map;
import java.util.Set;
import android.accounts.Account;

public final class d
{
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final int e;
    public final View f;
    public final String g;
    public final String h;
    public final S2.a i;
    public Integer j;
    
    public d(final Account a, final Set s, final Map map, final int e, final View f, final String g, final String h, final S2.a a2, final boolean b) {
        this.a = a;
        Set<Object> set;
        if (s == null) {
            set = Collections.emptySet();
        }
        else {
            set = Collections.unmodifiableSet((Set<?>)s);
        }
        this.b = set;
        Object emptyMap = map;
        if (map == null) {
            emptyMap = Collections.emptyMap();
        }
        this.d = (Map)emptyMap;
        this.f = f;
        this.e = e;
        this.g = g;
        this.h = h;
        S2.a j;
        if ((j = a2) == null) {
            j = S2.a.j;
        }
        this.i = j;
        final HashSet s2 = new HashSet<Object>((Collection<? extends T>)set);
        final Iterator<Object> iterator = ((Map<K, Object>)emptyMap).values().iterator();
        if (!iterator.hasNext()) {
            this.c = Collections.unmodifiableSet((Set<?>)s2);
            return;
        }
        android.support.v4.media.a.a(iterator.next());
        throw null;
    }
    
    public Account a() {
        return this.a;
    }
    
    public Account b() {
        final Account a = this.a;
        if (a != null) {
            return a;
        }
        return new Account("<<default account>>", "com.google");
    }
    
    public Set c() {
        return this.c;
    }
    
    public String d() {
        return this.g;
    }
    
    public Set e() {
        return this.b;
    }
    
    public final S2.a f() {
        return this.i;
    }
    
    public final Integer g() {
        return this.j;
    }
    
    public final String h() {
        return this.h;
    }
    
    public final void i(final Integer j) {
        this.j = j;
    }
    
    public static final class a
    {
        public Account a;
        public b b;
        public String c;
        public String d;
        public S2.a e;
        
        public a() {
            this.e = S2.a.j;
        }
        
        public d a() {
            return new d(this.a, this.b, null, 0, null, this.c, this.d, this.e, false);
        }
        
        public a b(final String c) {
            this.c = c;
            return this;
        }
        
        public final a c(final Collection collection) {
            if (this.b == null) {
                this.b = new b();
            }
            this.b.addAll(collection);
            return this;
        }
        
        public final a d(final Account a) {
            this.a = a;
            return this;
        }
        
        public final a e(final String d) {
            this.d = d;
            return this;
        }
    }
}
