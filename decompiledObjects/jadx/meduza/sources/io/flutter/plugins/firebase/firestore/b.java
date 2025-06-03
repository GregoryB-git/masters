package io.flutter.plugins.firebase.firestore;

import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8088a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp f8089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest f8090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseFirestore.Result f8091d;

    public /* synthetic */ b(GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest documentReferenceRequest, GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result result) {
        this.f8090c = documentReferenceRequest;
        this.f8089b = firestorePigeonFirebaseApp;
        this.f8091d = result;
    }

    public /* synthetic */ b(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest documentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result result) {
        this.f8089b = firestorePigeonFirebaseApp;
        this.f8090c = documentReferenceRequest;
        this.f8091d = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8088a) {
            case 0:
                FlutterFirebaseFirestorePlugin.lambda$documentReferenceGet$15(this.f8090c, this.f8089b, this.f8091d);
                break;
            default:
                FlutterFirebaseFirestorePlugin.lambda$documentReferenceUpdate$14(this.f8089b, this.f8090c, this.f8091d);
                break;
        }
    }
}
