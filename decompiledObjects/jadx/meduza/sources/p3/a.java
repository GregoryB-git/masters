package p3;

import com.google.android.gms.tasks.TaskCompletionSource;
import h3.j;
import io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;
import java.util.logging.Logger;
import k3.n;
import k3.s;
import l3.m;
import z4.q;
import z4.t;
import z4.w;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12978c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12980e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f12976a = i10;
        this.f12977b = obj;
        this.f12978c = obj2;
        this.f12979d = obj3;
        this.f12980e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12976a) {
            case 0:
                c cVar = (c) this.f12977b;
                s sVar = (s) this.f12978c;
                j jVar = (j) this.f12979d;
                n nVar = (n) this.f12980e;
                cVar.getClass();
                try {
                    m a10 = cVar.f12986c.a(sVar.b());
                    if (a10 == null) {
                        String format = String.format("Transport backend '%s' is not registered", sVar.b());
                        c.f.warning(format);
                        jVar.a(new IllegalArgumentException(format));
                    } else {
                        cVar.f12988e.f(new b(cVar, sVar, a10.a(nVar)));
                        jVar.a(null);
                    }
                    break;
                } catch (Exception e10) {
                    Logger logger = c.f;
                    StringBuilder l10 = defpackage.f.l("Error scheduling event ");
                    l10.append(e10.getMessage());
                    logger.warning(l10.toString());
                    jVar.a(e10);
                    return;
                }
            case 1:
                ((w) this.f12978c).o0(((w.a) this.f12977b).f17740a, (t.b) this.f12979d, (q) this.f12980e);
                break;
            case 2:
                ((FlutterFirebaseDynamicLinksPlugin) this.f12977b).lambda$getDynamicLink$4((String) this.f12978c, (v8.b) this.f12979d, (TaskCompletionSource) this.f12980e);
                break;
            default:
                FlutterFirebaseFirestorePlugin.lambda$namedQueryGet$2((GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp) this.f12977b, (String) this.f12978c, (GeneratedAndroidFirebaseFirestore.Result) this.f12979d, (GeneratedAndroidFirebaseFirestore.PigeonGetOptions) this.f12980e);
                break;
        }
    }
}
