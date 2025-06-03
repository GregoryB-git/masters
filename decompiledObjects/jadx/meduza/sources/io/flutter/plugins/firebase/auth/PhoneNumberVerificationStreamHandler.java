package io.flutter.plugins.firebase.auth;

import android.app.Activity;
import b8.c0;
import b8.e0;
import b8.h0;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class PhoneNumberVerificationStreamHandler implements EventChannel.StreamHandler {
    private static final HashMap<Integer, e0> forceResendingTokens = new HashMap<>();
    public final AtomicReference<Activity> activityRef;
    public String autoRetrievedSmsCodeForTesting;
    private EventChannel.EventSink eventSink;
    public final FirebaseAuth firebaseAuth;
    public Integer forceResendingToken;
    public final h0 multiFactorInfo;
    public final b8.z multiFactorSession;
    public final OnCredentialsListener onCredentialsListener;
    public final String phoneNumber;
    public final int timeout;

    public interface OnCredentialsListener {
        void onCredentialsReceived(c0 c0Var);
    }

    public PhoneNumberVerificationStreamHandler(Activity activity, GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest, b8.z zVar, h0 h0Var, OnCredentialsListener onCredentialsListener) {
        AtomicReference<Activity> atomicReference = new AtomicReference<>(null);
        this.activityRef = atomicReference;
        atomicReference.set(activity);
        this.multiFactorSession = zVar;
        this.multiFactorInfo = h0Var;
        this.firebaseAuth = FlutterFirebaseAuthPlugin.getAuthFromPigeon(authPigeonFirebaseApp);
        this.phoneNumber = pigeonVerifyPhoneNumberRequest.getPhoneNumber();
        long longValue = pigeonVerifyPhoneNumberRequest.getTimeout().longValue();
        int i10 = (int) longValue;
        if (longValue != i10) {
            throw new ArithmeticException();
        }
        this.timeout = i10;
        if (pigeonVerifyPhoneNumberRequest.getAutoRetrievedSmsCodeForTesting() != null) {
            this.autoRetrievedSmsCodeForTesting = pigeonVerifyPhoneNumberRequest.getAutoRetrievedSmsCodeForTesting();
        }
        if (pigeonVerifyPhoneNumberRequest.getForceResendingToken() != null) {
            long longValue2 = pigeonVerifyPhoneNumberRequest.getForceResendingToken().longValue();
            int i11 = (int) longValue2;
            if (longValue2 != i11) {
                throw new ArithmeticException();
            }
            this.forceResendingToken = Integer.valueOf(i11);
        }
        this.onCredentialsListener = onCredentialsListener;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.eventSink = null;
        this.activityRef.set(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onListen(java.lang.Object r13, io.flutter.plugin.common.EventChannel.EventSink r14) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.auth.PhoneNumberVerificationStreamHandler.onListen(java.lang.Object, io.flutter.plugin.common.EventChannel$EventSink):void");
    }
}
