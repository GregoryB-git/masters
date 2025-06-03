package g9;

import com.google.firebase.firestore.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadPoolExecutor f6025g;

    /* renamed from: a, reason: collision with root package name */
    public final m9.j f6026a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6029d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.firebase.firestore.f f6030e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<j9.i, j9.q> f6027b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<k9.f> f6028c = new ArrayList<>();
    public HashSet f = new HashSet();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f6025g = threadPoolExecutor;
    }

    public m0(m9.j jVar) {
        this.f6026a = jVar;
    }

    public final k9.m a(j9.i iVar) {
        j9.q qVar = this.f6027b.get(iVar);
        return (this.f.contains(iVar) || qVar == null) ? k9.m.f9167c : qVar.equals(j9.q.f8701b) ? k9.m.a(false) : new k9.m(qVar, null);
    }

    public final k9.m b(j9.i iVar) {
        j9.q qVar = this.f6027b.get(iVar);
        if (this.f.contains(iVar) || qVar == null) {
            return k9.m.a(true);
        }
        if (qVar.equals(j9.q.f8701b)) {
            throw new com.google.firebase.firestore.f("Can't update a document that doesn't exist.", f.a.INVALID_ARGUMENT);
        }
        return new k9.m(qVar, null);
    }
}
