package eb;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f5186a = Logger.getLogger(p.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final p f5187b = new p();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5188a;

        static {
            b j1Var;
            AtomicReference atomicReference = new AtomicReference();
            try {
                j1Var = (b) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(b.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                atomicReference.set(e10);
                j1Var = new j1();
            } catch (Exception e11) {
                throw new RuntimeException("Storage override failed to initialize", e11);
            }
            f5188a = j1Var;
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                p.f5186a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }
    }

    public static abstract class b {
        public abstract p a();

        public abstract void b(p pVar, p pVar2);

        public abstract p c(p pVar);
    }

    public static p b() {
        p a10 = a.f5188a.a();
        return a10 == null ? f5187b : a10;
    }

    public final p a() {
        p c10 = a.f5188a.c(this);
        return c10 == null ? f5187b : c10;
    }

    public final void c(p pVar) {
        if (pVar == null) {
            throw new NullPointerException("toAttach");
        }
        a.f5188a.b(this, pVar);
    }
}
