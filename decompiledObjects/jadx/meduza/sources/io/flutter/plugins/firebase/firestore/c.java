package io.flutter.plugins.firebase.firestore;

import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp f8093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseFirestore.Result f8094c;

    public /* synthetic */ c(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result result, int i10) {
        this.f8092a = i10;
        this.f8093b = firestorePigeonFirebaseApp;
        this.f8094c = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8092a) {
            case 0:
                FlutterFirebaseFirestorePlugin.lambda$clearPersistence$3(this.f8093b, this.f8094c);
                break;
            default:
                FlutterFirebaseFirestorePlugin.lambda$terminate$6(this.f8093b, this.f8094c);
                break;
        }
    }
}
