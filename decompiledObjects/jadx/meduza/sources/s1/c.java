package s1;

import android.os.Bundle;
import b1.i;
import defpackage.f;
import ec.i;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Iterator;
import java.util.Map;
import n.b;
import s1.a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f14142b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f14143c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14144d;

    /* renamed from: e, reason: collision with root package name */
    public a.C0217a f14145e;

    /* renamed from: a, reason: collision with root package name */
    public final n.b<String, b> f14141a = new n.b<>();
    public boolean f = true;

    public interface a {
        void a(e eVar);
    }

    public interface b {
        Bundle a();
    }

    public final Bundle a(String str) {
        if (!this.f14144d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f14143c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f14143c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f14143c;
        boolean z10 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z10 = true;
        }
        if (!z10) {
            this.f14143c = null;
        }
        return bundle2;
    }

    public final b b() {
        String str;
        b bVar;
        Iterator<Map.Entry<String, b>> it = this.f14141a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            i.d(entry, "components");
            str = (String) entry.getKey();
            bVar = (b) entry.getValue();
        } while (!i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    public final void c(String str, b bVar) {
        i.e(str, Constants.KEY);
        i.e(bVar, "provider");
        if (!(this.f14141a.h(str, bVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        a.C0217a c0217a = this.f14145e;
        if (c0217a == null) {
            c0217a = new a.C0217a(this);
        }
        this.f14145e = c0217a;
        try {
            i.a.class.getDeclaredConstructor(new Class[0]);
            a.C0217a c0217a2 = this.f14145e;
            if (c0217a2 != null) {
                c0217a2.f14139a.add(i.a.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            StringBuilder l10 = f.l("Class ");
            l10.append(i.a.class.getSimpleName());
            l10.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(l10.toString(), e10);
        }
    }
}
