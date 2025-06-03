package r8;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d2.h0;
import eb.y;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import k8.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e implements SuccessContinuation<Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k8.i f13795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f13796b;

    public e(f fVar, k8.i iVar) {
        this.f13796b = fVar;
        this.f13795a = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.FileWriter, java.io.Writer] */
    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task<Void> then(Void r92) {
        ?? r32;
        Closeable closeable;
        JSONObject jSONObject = (JSONObject) this.f13795a.f9142c.f9133a.submit(new Callable() { // from class: r8.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                f fVar = e.this.f13796b;
                j jVar = fVar.f;
                i iVar = fVar.f13798b;
                b bVar = (b) jVar;
                bVar.getClass();
                i.a aVar = k8.i.f9139d;
                aVar.getClass();
                i.a.a(new k8.e(aVar), k8.f.f9137a);
                try {
                    HashMap c10 = b.c(iVar);
                    y yVar = bVar.f13784b;
                    String str = bVar.f13783a;
                    yVar.getClass();
                    o8.a aVar2 = new o8.a(str, c10);
                    aVar2.f12078c.put("User-Agent", "Crashlytics Android SDK/19.4.0");
                    aVar2.f12078c.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    b.a(aVar2, iVar);
                    String str2 = "Requesting settings from " + bVar.f13783a;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    String str3 = "Settings query params were: " + c10;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return bVar.d(aVar2.b());
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
                    return null;
                }
            }
        }).get();
        Closeable closeable2 = null;
        if (jSONObject != null) {
            c d10 = this.f13796b.f13799c.d(jSONObject);
            h0 h0Var = this.f13796b.f13801e;
            long j10 = d10.f13787c;
            h0Var.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                r32 = new FileWriter((File) h0Var.f3363b);
            } catch (Exception e10) {
                e = e10;
                r32 = 0;
            } catch (Throwable th) {
                th = th;
                j8.g.b(closeable2, "Failed to close settings writer.");
                throw th;
            }
            try {
                try {
                    r32.write(jSONObject.toString());
                    r32.flush();
                    closeable = r32;
                } catch (Exception e11) {
                    e = e11;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    closeable = r32;
                    j8.g.b(closeable, "Failed to close settings writer.");
                    this.f13796b.getClass();
                    f.c(jSONObject, "Loaded settings: ");
                    f fVar = this.f13796b;
                    String str = fVar.f13798b.f;
                    SharedPreferences.Editor edit = fVar.f13797a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    r32 = "existing_instance_identifier";
                    edit.putString("existing_instance_identifier", str);
                    edit.apply();
                    this.f13796b.f13803h.set(d10);
                    this.f13796b.f13804i.get().trySetResult(d10);
                    return Tasks.forResult(null);
                }
                j8.g.b(closeable, "Failed to close settings writer.");
                this.f13796b.getClass();
                f.c(jSONObject, "Loaded settings: ");
                f fVar2 = this.f13796b;
                String str2 = fVar2.f13798b.f;
                SharedPreferences.Editor edit2 = fVar2.f13797a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                r32 = "existing_instance_identifier";
                edit2.putString("existing_instance_identifier", str2);
                edit2.apply();
                this.f13796b.f13803h.set(d10);
                this.f13796b.f13804i.get().trySetResult(d10);
            } catch (Throwable th2) {
                th = th2;
                closeable2 = r32;
                j8.g.b(closeable2, "Failed to close settings writer.");
                throw th;
            }
        }
        return Tasks.forResult(null);
    }
}
