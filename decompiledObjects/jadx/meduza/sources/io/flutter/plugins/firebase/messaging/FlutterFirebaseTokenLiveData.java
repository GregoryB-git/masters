package io.flutter.plugins.firebase.messaging;

import b1.t;

/* loaded from: classes.dex */
public class FlutterFirebaseTokenLiveData extends t<String> {
    private static FlutterFirebaseTokenLiveData instance;

    public static FlutterFirebaseTokenLiveData getInstance() {
        if (instance == null) {
            instance = new FlutterFirebaseTokenLiveData();
        }
        return instance;
    }

    public void postToken(String str) {
        postValue(str);
    }
}
