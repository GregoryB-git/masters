package l8;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9790a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9792c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9794e;

    public /* synthetic */ m(FlutterFirebaseCorePlugin flutterFirebaseCorePlugin, GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions, String str, TaskCompletionSource taskCompletionSource) {
        this.f9792c = flutterFirebaseCorePlugin;
        this.f9793d = pigeonFirebaseOptions;
        this.f9791b = str;
        this.f9794e = taskCompletionSource;
    }

    public /* synthetic */ m(n nVar, String str, Map map, List list) {
        this.f9792c = nVar;
        this.f9791b = str;
        this.f9793d = map;
        this.f9794e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.Closeable] */
    @Override // java.lang.Runnable
    public final void run() {
        BufferedWriter bufferedWriter;
        Exception e10;
        String e11;
        switch (this.f9790a) {
            case 0:
                n nVar = (n) this.f9792c;
                String str = this.f9791b;
                Map<String, String> map = (Map) this.f9793d;
                List list = (List) this.f9794e;
                if (nVar.f9800g.getReference() != null) {
                    nVar.f9795a.i(str, nVar.f9800g.getReference());
                }
                if (!map.isEmpty()) {
                    nVar.f9795a.h(str, map, false);
                }
                if (list.isEmpty()) {
                    return;
                }
                File b10 = nVar.f9795a.f9768a.b(str, "rollouts-state");
                ?? isEmpty = list.isEmpty();
                if (isEmpty != 0) {
                    h.g(b10, "Rollout state is empty for session: " + str);
                    return;
                }
                Closeable closeable = null;
                try {
                    try {
                        e11 = h.e(list);
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), h.f9767b));
                    } catch (Exception e12) {
                        bufferedWriter = null;
                        e10 = e12;
                    } catch (Throwable th) {
                        th = th;
                        j8.g.b(closeable, "Failed to close rollouts state file.");
                        throw th;
                    }
                    try {
                        bufferedWriter.write(e11);
                        bufferedWriter.flush();
                        isEmpty = bufferedWriter;
                    } catch (Exception e13) {
                        e10 = e13;
                        Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e10);
                        h.f(b10);
                        isEmpty = bufferedWriter;
                        j8.g.b(isEmpty, "Failed to close rollouts state file.");
                        return;
                    }
                    j8.g.b(isEmpty, "Failed to close rollouts state file.");
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = isEmpty;
                    j8.g.b(closeable, "Failed to close rollouts state file.");
                    throw th;
                }
            default:
                ((FlutterFirebaseCorePlugin) this.f9792c).lambda$initializeApp$2((GeneratedAndroidFirebaseCore.PigeonFirebaseOptions) this.f9793d, this.f9791b, (TaskCompletionSource) this.f9794e);
                return;
        }
    }
}
