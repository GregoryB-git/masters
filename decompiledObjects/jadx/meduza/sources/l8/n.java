package l8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final h f9795a;

    /* renamed from: b, reason: collision with root package name */
    public final k8.i f9796b;

    /* renamed from: c, reason: collision with root package name */
    public String f9797c;

    /* renamed from: d, reason: collision with root package name */
    public final a f9798d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    public final a f9799e = new a(true);
    public final l f = new l();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicMarkableReference<String> f9800g = new AtomicMarkableReference<>(null, false);

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference<e> f9801a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<Runnable> f9802b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public final boolean f9803c;

        public a(boolean z10) {
            this.f9803c = z10;
            this.f9801a = new AtomicMarkableReference<>(new e(z10 ? 8192 : 1024), false);
        }

        public final Map<String, String> a() {
            Map<String, String> unmodifiableMap;
            e reference = this.f9801a.getReference();
            synchronized (reference) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f9761a));
            }
            return unmodifiableMap;
        }

        public final boolean b(String str, String str2) {
            synchronized (this) {
                boolean b10 = this.f9801a.getReference().b(str, str2);
                boolean z10 = false;
                if (!b10) {
                    return false;
                }
                AtomicMarkableReference<e> atomicMarkableReference = this.f9801a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                b.d dVar = new b.d(this, 13);
                AtomicReference<Runnable> atomicReference = this.f9802b;
                while (true) {
                    if (atomicReference.compareAndSet(null, dVar)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                if (z10) {
                    n.this.f9796b.f9141b.a(dVar);
                }
                return true;
            }
        }
    }

    public n(String str, p8.e eVar, k8.i iVar) {
        this.f9797c = str;
        this.f9795a = new h(eVar);
        this.f9796b = iVar;
    }
}
