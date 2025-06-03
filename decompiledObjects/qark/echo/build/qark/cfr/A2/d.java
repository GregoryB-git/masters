/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.view.View
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 */
package A2;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import t.b;

public final class d {
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

    public d(Account account, Set set, Map object, int n8, View view, String string2, String string3, S2.a a8, boolean bl) {
        this.a = account;
        account = set == null ? Collections.emptySet() : Collections.unmodifiableSet((Set)set);
        this.b = account;
        set = object;
        if (object == null) {
            set = Collections.emptyMap();
        }
        this.d = set;
        this.f = view;
        this.e = n8;
        this.g = string2;
        this.h = string3;
        object = a8;
        if (a8 == null) {
            object = S2.a.j;
        }
        this.i = object;
        account = new HashSet((Collection)account);
        if (!(set = set.values().iterator()).hasNext()) {
            this.c = Collections.unmodifiableSet((Set)account);
            return;
        }
        android.support.v4.media.a.a(set.next());
        throw null;
    }

    public Account a() {
        return this.a;
    }

    public Account b() {
        Account account = this.a;
        if (account != null) {
            return account;
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

    public final void i(Integer n8) {
        this.j = n8;
    }

    public static final class a {
        public Account a;
        public b b;
        public String c;
        public String d;
        public S2.a e = S2.a.j;

        public d a() {
            return new d(this.a, this.b, null, 0, null, this.c, this.d, this.e, false);
        }

        public a b(String string2) {
            this.c = string2;
            return this;
        }

        public final a c(Collection collection) {
            if (this.b == null) {
                this.b = new b();
            }
            this.b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.a = account;
            return this;
        }

        public final a e(String string2) {
            this.d = string2;
            return this;
        }
    }

}

