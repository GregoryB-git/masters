package io.flutter.plugins.firebase.messaging;

import aa.z;
import b1.t;

/* loaded from: classes.dex */
public class FlutterFirebaseRemoteMessageLiveData extends t<z> {
    private static FlutterFirebaseRemoteMessageLiveData instance;

    public static FlutterFirebaseRemoteMessageLiveData getInstance() {
        if (instance == null) {
            instance = new FlutterFirebaseRemoteMessageLiveData();
        }
        return instance;
    }

    public void postRemoteMessage(z zVar) {
        postValue(zVar);
    }
}
