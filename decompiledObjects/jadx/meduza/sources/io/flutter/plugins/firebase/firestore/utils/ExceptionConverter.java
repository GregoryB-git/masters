package io.flutter.plugins.firebase.firestore.utils;

import android.util.Log;
import com.google.firebase.firestore.f;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreException;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class ExceptionConverter {
    public static Map<String, String> createDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        if (exc == null) {
            return hashMap;
        }
        FlutterFirebaseFirestoreException flutterFirebaseFirestoreException = null;
        if (exc instanceof f) {
            flutterFirebaseFirestoreException = new FlutterFirebaseFirestoreException((f) exc, exc.getCause());
        } else if (exc.getCause() != null && (exc.getCause() instanceof f)) {
            flutterFirebaseFirestoreException = new FlutterFirebaseFirestoreException((f) exc.getCause(), exc.getCause().getCause() != null ? exc.getCause().getCause() : exc.getCause());
        }
        if (flutterFirebaseFirestoreException != null) {
            hashMap.put("code", flutterFirebaseFirestoreException.getCode());
            hashMap.put(Constants.MESSAGE, flutterFirebaseFirestoreException.getMessage());
        }
        if (hashMap.containsKey("code")) {
            String str = (String) hashMap.get("code");
            Objects.requireNonNull(str);
            if (str.equals("unknown")) {
                Log.e("FLTFirebaseFirestore", "An unknown error occurred", exc);
            }
        }
        return hashMap;
    }

    public static void sendErrorToFlutter(GeneratedAndroidFirebaseFirestore.Result result, Exception exc) {
        result.error(new GeneratedAndroidFirebaseFirestore.FlutterError(FlutterFirebaseFirestorePlugin.DEFAULT_ERROR_CODE, exc != null ? exc.getMessage() : null, createDetails(exc)));
    }
}
