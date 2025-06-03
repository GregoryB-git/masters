package c;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0809a {

    /* renamed from: a, reason: collision with root package name */
    public final Set f10013a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public volatile Context f10014b;

    public void a(InterfaceC0810b interfaceC0810b) {
        if (this.f10014b != null) {
            interfaceC0810b.a(this.f10014b);
        }
        this.f10013a.add(interfaceC0810b);
    }

    public void b() {
        this.f10014b = null;
    }

    public void c(Context context) {
        this.f10014b = context;
        Iterator it = this.f10013a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0810b) it.next()).a(context);
        }
    }
}
