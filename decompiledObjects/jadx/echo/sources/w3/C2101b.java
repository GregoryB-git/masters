package w3;

import A2.AbstractC0328n;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import n4.C1728a;
import n4.InterfaceC1729b;
import n4.InterfaceC1731d;
import s3.C1944b;
import s3.C1947e;
import w3.InterfaceC2100a;
import x3.AbstractC2213a;
import x3.C2216d;
import x3.C2218f;

/* renamed from: w3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2101b implements InterfaceC2100a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile InterfaceC2100a f20393c;

    /* renamed from: a, reason: collision with root package name */
    public final Q2.a f20394a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f20395b;

    /* renamed from: w3.b$a */
    public class a implements InterfaceC2100a.InterfaceC0288a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f20396a;

        public a(String str) {
            this.f20396a = str;
        }
    }

    public C2101b(Q2.a aVar) {
        AbstractC0328n.i(aVar);
        this.f20394a = aVar;
        this.f20395b = new ConcurrentHashMap();
    }

    public static InterfaceC2100a h(C1947e c1947e, Context context, InterfaceC1731d interfaceC1731d) {
        AbstractC0328n.i(c1947e);
        AbstractC0328n.i(context);
        AbstractC0328n.i(interfaceC1731d);
        AbstractC0328n.i(context.getApplicationContext());
        if (f20393c == null) {
            synchronized (C2101b.class) {
                try {
                    if (f20393c == null) {
                        Bundle bundle = new Bundle(1);
                        if (c1947e.y()) {
                            interfaceC1731d.b(C1944b.class, new Executor() { // from class: w3.c
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new InterfaceC1729b() { // from class: w3.d
                                @Override // n4.InterfaceC1729b
                                public final void a(C1728a c1728a) {
                                    C2101b.i(c1728a);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", c1947e.x());
                        }
                        f20393c = new C2101b(J0.f(context, null, null, null, bundle).z());
                    }
                } finally {
                }
            }
        }
        return f20393c;
    }

    public static /* synthetic */ void i(C1728a c1728a) {
        boolean z7 = ((C1944b) c1728a.a()).f19233a;
        synchronized (C2101b.class) {
            ((C2101b) AbstractC0328n.i(f20393c)).f20394a.i(z7);
        }
    }

    @Override // w3.InterfaceC2100a
    public Map a(boolean z7) {
        return this.f20394a.d(null, null, z7);
    }

    @Override // w3.InterfaceC2100a
    public void b(InterfaceC2100a.c cVar) {
        if (AbstractC2213a.h(cVar)) {
            this.f20394a.g(AbstractC2213a.a(cVar));
        }
    }

    @Override // w3.InterfaceC2100a
    public List c(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f20394a.b(str, str2).iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2213a.c((Bundle) it.next()));
        }
        return arrayList;
    }

    @Override // w3.InterfaceC2100a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || AbstractC2213a.e(str2, bundle)) {
            this.f20394a.a(str, str2, bundle);
        }
    }

    @Override // w3.InterfaceC2100a
    public void d(String str, String str2, Object obj) {
        if (AbstractC2213a.j(str) && AbstractC2213a.f(str, str2)) {
            this.f20394a.h(str, str2, obj);
        }
    }

    @Override // w3.InterfaceC2100a
    public void e(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (AbstractC2213a.j(str) && AbstractC2213a.e(str2, bundle) && AbstractC2213a.g(str, str2, bundle)) {
            AbstractC2213a.d(str, str2, bundle);
            this.f20394a.e(str, str2, bundle);
        }
    }

    @Override // w3.InterfaceC2100a
    public int f(String str) {
        return this.f20394a.c(str);
    }

    @Override // w3.InterfaceC2100a
    public InterfaceC2100a.InterfaceC0288a g(String str, InterfaceC2100a.b bVar) {
        AbstractC0328n.i(bVar);
        if (!AbstractC2213a.j(str) || j(str)) {
            return null;
        }
        Q2.a aVar = this.f20394a;
        Object c2216d = "fiam".equals(str) ? new C2216d(aVar, bVar) : "clx".equals(str) ? new C2218f(aVar, bVar) : null;
        if (c2216d == null) {
            return null;
        }
        this.f20395b.put(str, c2216d);
        return new a(str);
    }

    public final boolean j(String str) {
        return (str.isEmpty() || !this.f20395b.containsKey(str) || this.f20395b.get(str) == null) ? false : true;
    }
}
