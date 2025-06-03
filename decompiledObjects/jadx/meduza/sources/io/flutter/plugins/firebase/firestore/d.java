package io.flutter.plugins.firebase.firestore;

import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp f8096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseFirestore.Result f8097c;

    public /* synthetic */ d(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result result, int i10) {
        this.f8095a = i10;
        this.f8096b = firestorePigeonFirebaseApp;
        this.f8097c = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8095a) {
            case 0:
                FlutterFirebaseFirestorePlugin.lambda$waitForPendingWrites$7(this.f8096b, this.f8097c);
                break;
            default:
                FlutterFirebaseFirestorePlugin.lambda$enableNetwork$5(this.f8096b, this.f8097c);
                break;
        }
    }
}
