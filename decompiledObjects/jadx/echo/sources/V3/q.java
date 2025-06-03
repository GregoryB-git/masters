package V3;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    public static final q f6665b = new q();

    /* renamed from: a, reason: collision with root package name */
    public final Map f6666a = new HashMap();

    public class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ m f6667o;

        public a(m mVar) {
            this.f6667o = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6667o.P();
        }
    }

    public class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ m f6668o;

        public b(m mVar) {
            this.f6668o = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6668o.f0();
        }
    }

    public static m b(AbstractC0667f abstractC0667f, p pVar, Q3.h hVar) {
        return f6665b.a(abstractC0667f, pVar, hVar);
    }

    public static void c(m mVar) {
        mVar.i0(new a(mVar));
    }

    public static void d(m mVar) {
        mVar.i0(new b(mVar));
    }

    public final m a(AbstractC0667f abstractC0667f, p pVar, Q3.h hVar) {
        m mVar;
        abstractC0667f.k();
        String str = "https://" + pVar.f6661a + "/" + pVar.f6663c;
        synchronized (this.f6666a) {
            try {
                if (!this.f6666a.containsKey(abstractC0667f)) {
                    this.f6666a.put(abstractC0667f, new HashMap());
                }
                Map map = (Map) this.f6666a.get(abstractC0667f);
                if (map.containsKey(str)) {
                    throw new IllegalStateException("createLocalRepo() called for existing repo.");
                }
                mVar = new m(pVar, abstractC0667f, hVar);
                map.put(str, mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }
}
