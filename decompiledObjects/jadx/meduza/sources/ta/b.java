package ta;

import android.content.Intent;
import io.flutter.plugin.common.PluginRegistry;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements PluginRegistry.NewIntentListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.ryanheise.audioservice.b f14690a;

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public final boolean onNewIntent(Intent intent) {
        com.ryanheise.audioservice.b bVar = this.f14690a;
        bVar.f3285e.f3293b.setIntent(intent);
        bVar.o();
        return true;
    }
}
