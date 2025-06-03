package A2;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import t.C1959b;

/* renamed from: A2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318d {

    /* renamed from: a, reason: collision with root package name */
    public final Account f440a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f441b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f442c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f443d;

    /* renamed from: e, reason: collision with root package name */
    public final int f444e;

    /* renamed from: f, reason: collision with root package name */
    public final View f445f;

    /* renamed from: g, reason: collision with root package name */
    public final String f446g;

    /* renamed from: h, reason: collision with root package name */
    public final String f447h;

    /* renamed from: i, reason: collision with root package name */
    public final S2.a f448i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f449j;

    /* renamed from: A2.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Account f450a;

        /* renamed from: b, reason: collision with root package name */
        public C1959b f451b;

        /* renamed from: c, reason: collision with root package name */
        public String f452c;

        /* renamed from: d, reason: collision with root package name */
        public String f453d;

        /* renamed from: e, reason: collision with root package name */
        public S2.a f454e = S2.a.f5835j;

        public C0318d a() {
            return new C0318d(this.f450a, this.f451b, null, 0, null, this.f452c, this.f453d, this.f454e, false);
        }

        public a b(String str) {
            this.f452c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f451b == null) {
                this.f451b = new C1959b();
            }
            this.f451b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f450a = account;
            return this;
        }

        public final a e(String str) {
            this.f453d = str;
            return this;
        }
    }

    public C0318d(Account account, Set set, Map map, int i7, View view, String str, String str2, S2.a aVar, boolean z7) {
        this.f440a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f441b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f443d = map;
        this.f445f = view;
        this.f444e = i7;
        this.f446g = str;
        this.f447h = str2;
        this.f448i = aVar == null ? S2.a.f5835j : aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
        this.f442c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f440a;
    }

    public Account b() {
        Account account = this.f440a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.f442c;
    }

    public String d() {
        return this.f446g;
    }

    public Set e() {
        return this.f441b;
    }

    public final S2.a f() {
        return this.f448i;
    }

    public final Integer g() {
        return this.f449j;
    }

    public final String h() {
        return this.f447h;
    }

    public final void i(Integer num) {
        this.f449j = num;
    }
}
