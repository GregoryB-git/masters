package io.flutter.plugins.firebase.auth;

import aa.m0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class y {
    public static MessageCodec<Object> a() {
        return GeneratedAndroidFirebaseAuth.GenerateInterfacesCodec.INSTANCE;
    }

    public static /* synthetic */ void b(GeneratedAndroidFirebaseAuth.GenerateInterfaces generateInterfaces, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            generateInterfaces.pigeonInterface((GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = GeneratedAndroidFirebaseAuth.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static void c(BinaryMessenger binaryMessenger, GeneratedAndroidFirebaseAuth.GenerateInterfaces generateInterfaces) {
        d(binaryMessenger, "", generateInterfaces);
    }

    public static void d(BinaryMessenger binaryMessenger, String str, GeneratedAndroidFirebaseAuth.GenerateInterfaces generateInterfaces) {
        new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.GenerateInterfaces.pigeonInterface", str.isEmpty() ? "" : defpackage.g.d(".", str)), a()).setMessageHandler(generateInterfaces != null ? new m0(generateInterfaces, 14) : null);
    }
}
