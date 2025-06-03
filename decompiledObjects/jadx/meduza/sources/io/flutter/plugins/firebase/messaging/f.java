package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.googlesignin.BackgroundTaskRunner;
import io.flutter.view.FlutterCallbackInformation;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import vn.hunghd.flutterdownloader.DownloadWorker;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8128c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f8126a = i10;
        this.f8127b = obj;
        this.f8128c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DartExecutor dartExecutor;
        switch (this.f8126a) {
            case 0:
                ((FlutterFirebaseMessagingPlugin) this.f8127b).lambda$getPermissions$13((TaskCompletionSource) this.f8128c);
                return;
            case 1:
                BackgroundTaskRunner.lambda$runInBackground$1((s7.f) this.f8127b, (Callable) this.f8128c);
                return;
            default:
                DownloadWorker downloadWorker = (DownloadWorker) this.f8127b;
                Context context = (Context) this.f8128c;
                AtomicBoolean atomicBoolean = DownloadWorker.H;
                downloadWorker.getClass();
                synchronized (DownloadWorker.H) {
                    if (DownloadWorker.J == null) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("vn.hunghd.downloader.pref", 0);
                        ec.i.d(sharedPreferences, "getSharedPreferences(...)");
                        long j10 = sharedPreferences.getLong("callback_dispatcher_handle_key", 0L);
                        DownloadWorker.J = new FlutterEngine(downloadWorker.f1457a, (String[]) null, false);
                        FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j10);
                        if (lookupCallbackInformation == null) {
                            downloadWorker.w("Fatal: failed to find callback");
                            return;
                        }
                        String findAppBundlePath = FlutterInjector.instance().flutterLoader().findAppBundlePath();
                        ec.i.d(findAppBundlePath, "findAppBundlePath(...)");
                        AssetManager assets = downloadWorker.f1457a.getAssets();
                        FlutterEngine flutterEngine = DownloadWorker.J;
                        if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
                            dartExecutor.executeDartCallback(new DartExecutor.DartCallback(assets, findAppBundlePath, lookupCallbackInformation));
                        }
                    }
                    rb.h hVar = rb.h.f13851a;
                    FlutterEngine flutterEngine2 = DownloadWorker.J;
                    ec.i.b(flutterEngine2);
                    MethodChannel methodChannel = new MethodChannel(flutterEngine2.getDartExecutor(), "vn.hunghd/downloader_background");
                    downloadWorker.f16121q = methodChannel;
                    methodChannel.setMethodCallHandler(downloadWorker);
                    return;
                }
        }
    }
}
