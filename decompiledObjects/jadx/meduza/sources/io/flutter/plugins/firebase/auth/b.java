package io.flutter.plugins.firebase.auth;

import b8.c0;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.auth.PhoneNumberVerificationStreamHandler;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements PhoneNumberVerificationStreamHandler.OnCredentialsListener {
    public static void a(Task task, GeneratedAndroidFirebaseAuth.Result result) {
        result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
    }

    @Override // io.flutter.plugins.firebase.auth.PhoneNumberVerificationStreamHandler.OnCredentialsListener
    public void onCredentialsReceived(c0 c0Var) {
        FlutterFirebaseAuthPlugin.lambda$verifyPhoneNumber$15(c0Var);
    }
}
