package x0;

import a4.g;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ryanheise.audioservice.AudioService;
import com.ryanheise.audioservice.b;
import e8.g;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import java.util.Map;
import v3.z0;
import x0.e;
import z4.t;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16547c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16548d;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        this.f16545a = i10;
        this.f16547c = obj;
        this.f16546b = obj2;
        this.f16548d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16545a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f16547c;
                View view = (View) this.f16546b;
                e.a aVar = (e.a) this.f16548d;
                ec.i.e(viewGroup, "$container");
                ec.i.e(aVar, "this$0");
                viewGroup.endViewTransition(view);
                aVar.f16561c.f16578a.c(aVar);
                break;
            case 1:
                n0 n0Var = (n0) this.f16547c;
                View view2 = (View) this.f16546b;
                Rect rect = (Rect) this.f16548d;
                ec.i.e(n0Var, "$impl");
                ec.i.e(rect, "$lastInEpicenterRect");
                n0.f(view2, rect);
                break;
            case 2:
                z0.a aVar2 = (z0.a) this.f16547c;
                Pair pair = (Pair) this.f16546b;
                aVar2.f15836b.f15830h.P(((Integer) pair.first).intValue(), (t.b) pair.second, (Exception) this.f16548d);
                break;
            case 3:
                g.a aVar3 = (g.a) this.f16547c;
                ((a4.g) this.f16546b).P(aVar3.f180a, aVar3.f181b, (Exception) this.f16548d);
                break;
            case 4:
                ((e8.f) this.f16547c).f4831a.execute(new f(13, (Runnable) this.f16546b, (g.b) this.f16548d));
                break;
            case 5:
                b.c cVar = (b.c) this.f16547c;
                Map map = (Map) this.f16546b;
                MethodChannel.Result result = (MethodChannel.Result) this.f16548d;
                cVar.getClass();
                try {
                    AudioService.F.n(com.ryanheise.audioservice.b.g((Map) map.get("mediaItem")));
                    cVar.f3290d.post(new ta.d(0, result));
                    break;
                } catch (Exception e10) {
                    cVar.f3290d.post(new q0(19, result, e10));
                    return;
                }
            case 6:
                ((FlutterFirebaseDynamicLinksPlugin) this.f16547c).lambda$buildShortLink$3((Map) this.f16546b, (TaskCompletionSource) this.f16548d);
                break;
            case 7:
                FlutterFirebaseFirestorePlugin.lambda$documentReferenceSet$13((GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp) this.f16547c, (GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest) this.f16546b, (GeneratedAndroidFirebaseFirestore.Result) this.f16548d);
                break;
            default:
                ((FlutterFirebaseMessagingPlugin) this.f16547c).lambda$setAutoInitEnabled$7((Map) this.f16546b, (TaskCompletionSource) this.f16548d);
                break;
        }
    }
}
