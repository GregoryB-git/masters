package io.flutter.plugins.firebase.firestore;

/* loaded from: classes.dex */
public class FlutterFirebaseFirestoreTransactionResult {
    public final Exception exception;

    private FlutterFirebaseFirestoreTransactionResult() {
        this.exception = null;
    }

    private FlutterFirebaseFirestoreTransactionResult(Exception exc) {
        this.exception = exc;
    }

    public static FlutterFirebaseFirestoreTransactionResult complete() {
        return new FlutterFirebaseFirestoreTransactionResult();
    }

    public static FlutterFirebaseFirestoreTransactionResult failed(Exception exc) {
        return new FlutterFirebaseFirestoreTransactionResult(exc);
    }
}
