package io.flutter.plugins.urllauncher;

import aa.m0;
import defpackage.e;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.urllauncher.Messages;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static MessageCodec<Object> a() {
        return Messages.UrlLauncherApiCodec.INSTANCE;
    }

    public static /* synthetic */ void b(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, urlLauncherApi.canLaunchUrl((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void c(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, urlLauncherApi.launchUrl((String) arrayList2.get(0), (Map) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void d(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, urlLauncherApi.openUrlInApp((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (Messages.WebViewOptions) arrayList2.get(2), (Messages.BrowserOptions) arrayList2.get(3)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, urlLauncherApi.supportsCustomTabs());
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void f(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            urlLauncherApi.closeWebView();
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static void g(BinaryMessenger binaryMessenger, final Messages.UrlLauncherApi urlLauncherApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", a());
        if (urlLauncherApi != null) {
            final int i10 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.a
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i10) {
                        case 0:
                            b.b(urlLauncherApi, obj, reply);
                            break;
                        default:
                            b.f(urlLauncherApi, obj, reply);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", a());
        if (urlLauncherApi != null) {
            basicMessageChannel2.setMessageHandler(new c(urlLauncherApi));
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", a());
        int i11 = 18;
        if (urlLauncherApi != null) {
            basicMessageChannel3.setMessageHandler(new e(urlLauncherApi, i11));
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", a());
        if (urlLauncherApi != null) {
            basicMessageChannel4.setMessageHandler(new m0(urlLauncherApi, i11));
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", a());
        if (urlLauncherApi == null) {
            basicMessageChannel5.setMessageHandler(null);
        } else {
            final int i12 = 1;
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.a
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i12) {
                        case 0:
                            b.b(urlLauncherApi, obj, reply);
                            break;
                        default:
                            b.f(urlLauncherApi, obj, reply);
                            break;
                    }
                }
            });
        }
    }
}
