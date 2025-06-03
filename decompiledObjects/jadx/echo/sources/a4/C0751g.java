package a4;

import V3.AbstractC0667f;
import c4.C0851c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: a4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0751g {

    /* renamed from: a, reason: collision with root package name */
    public final V3.j f8103a;

    /* renamed from: b, reason: collision with root package name */
    public final C0851c f8104b;

    /* renamed from: a4.g$a */
    public class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f8105o;

        public a(ArrayList arrayList) {
            this.f8105o = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f8105o.iterator();
            while (it.hasNext()) {
                InterfaceC0749e interfaceC0749e = (InterfaceC0749e) it.next();
                if (C0751g.this.f8104b.f()) {
                    C0751g.this.f8104b.b("Raising " + interfaceC0749e.toString(), new Object[0]);
                }
                interfaceC0749e.a();
            }
        }
    }

    public C0751g(AbstractC0667f abstractC0667f) {
        this.f8103a = abstractC0667f.o();
        this.f8104b = abstractC0667f.q("EventRaiser");
    }

    public void b(List list) {
        if (this.f8104b.f()) {
            this.f8104b.b("Raising " + list.size() + " event(s)", new Object[0]);
        }
        this.f8103a.b(new a(new ArrayList(list)));
    }
}
