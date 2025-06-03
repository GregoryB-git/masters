package m6;

import android.accounts.Account;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Account f10240a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f10241b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f10242c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f10243d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10244e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final g7.a f10245g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f10246h;

    /* renamed from: m6.a$a, reason: collision with other inner class name */
    public static final class C0148a {

        /* renamed from: a, reason: collision with root package name */
        public Account f10247a;

        /* renamed from: b, reason: collision with root package name */
        public r.d f10248b;

        /* renamed from: c, reason: collision with root package name */
        public String f10249c;

        /* renamed from: d, reason: collision with root package name */
        public String f10250d;
    }

    public a(Account account, r.d dVar, String str, String str2) {
        g7.a aVar = g7.a.f5904a;
        this.f10240a = account;
        Set emptySet = dVar == null ? Collections.emptySet() : Collections.unmodifiableSet(dVar);
        this.f10241b = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.f10243d = emptyMap;
        this.f10244e = str;
        this.f = str2;
        this.f10245g = aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        while (it.hasNext()) {
            ((p) it.next()).getClass();
            hashSet.addAll(null);
        }
        this.f10242c = Collections.unmodifiableSet(hashSet);
    }
}
