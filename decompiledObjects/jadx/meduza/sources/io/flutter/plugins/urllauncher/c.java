package io.flutter.plugins.urllauncher;

import android.content.Context;
import android.content.Intent;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.urllauncher.Messages;
import io.flutter.plugins.urllauncher.UrlLauncher;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements UrlLauncher.IntentResolver, BasicMessageChannel.MessageHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f8177a;

    public /* synthetic */ c(Object obj) {
        this.f8177a = obj;
    }

    @Override // io.flutter.plugins.urllauncher.UrlLauncher.IntentResolver
    public final String getHandlerComponentName(Intent intent) {
        String lambda$new$0;
        lambda$new$0 = UrlLauncher.lambda$new$0((Context) this.f8177a, intent);
        return lambda$new$0;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        b.c((Messages.UrlLauncherApi) this.f8177a, obj, reply);
    }
}
