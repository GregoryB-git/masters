package g0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: g0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1304h implements Iterable {

    /* renamed from: o, reason: collision with root package name */
    public final Object f14287o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public final Map f14288p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public Set f14289q = Collections.emptySet();

    /* renamed from: r, reason: collision with root package name */
    public List f14290r = Collections.emptyList();

    public void a(Object obj) {
        synchronized (this.f14287o) {
            try {
                ArrayList arrayList = new ArrayList(this.f14290r);
                arrayList.add(obj);
                this.f14290r = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f14288p.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f14289q);
                    hashSet.add(obj);
                    this.f14289q = Collections.unmodifiableSet(hashSet);
                }
                this.f14288p.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int d(Object obj) {
        int intValue;
        synchronized (this.f14287o) {
            try {
                intValue = this.f14288p.containsKey(obj) ? ((Integer) this.f14288p.get(obj)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    public void f(Object obj) {
        synchronized (this.f14287o) {
            try {
                Integer num = (Integer) this.f14288p.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f14290r);
                arrayList.remove(obj);
                this.f14290r = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f14288p.remove(obj);
                    HashSet hashSet = new HashSet(this.f14289q);
                    hashSet.remove(obj);
                    this.f14289q = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f14288p.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f14287o) {
            it = this.f14290r.iterator();
        }
        return it;
    }

    public Set u() {
        Set set;
        synchronized (this.f14287o) {
            set = this.f14289q;
        }
        return set;
    }
}
