package B3;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import r4.InterfaceC1922b;

/* loaded from: classes.dex */
public class y implements InterfaceC1922b {

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f807b = null;

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f806a = Collections.newSetFromMap(new ConcurrentHashMap());

    public y(Collection collection) {
        this.f806a.addAll(collection);
    }

    public static y b(Collection collection) {
        return new y((Set) collection);
    }

    public synchronized void a(InterfaceC1922b interfaceC1922b) {
        Set set;
        Object obj;
        try {
            if (this.f807b == null) {
                set = this.f806a;
                obj = interfaceC1922b;
            } else {
                set = this.f807b;
                obj = interfaceC1922b.get();
            }
            set.add(obj);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // r4.InterfaceC1922b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f807b == null) {
            synchronized (this) {
                try {
                    if (this.f807b == null) {
                        this.f807b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f807b);
    }

    public final synchronized void d() {
        try {
            Iterator it = this.f806a.iterator();
            while (it.hasNext()) {
                this.f807b.add(((InterfaceC1922b) it.next()).get());
            }
            this.f806a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
