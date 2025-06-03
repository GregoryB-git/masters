package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.os.Handler;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7978c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f7979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7980e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(Object obj, Object obj2, Serializable serializable, Object obj3, Object obj4, int i10) {
        this.f7976a = i10;
        this.f7977b = obj;
        this.f7978c = obj2;
        this.f7979d = serializable;
        this.f7980e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7976a) {
            case 0:
                ((FlutterLoader) this.f7977b).lambda$ensureInitializationCompleteAsync$1((Context) this.f7978c, (String[]) this.f7979d, (Handler) this.f7980e, (Runnable) this.f);
                break;
            default:
                ((FlutterFirebaseFirestorePlugin) this.f7977b).lambda$transactionGet$12((GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp) this.f7978c, (String) this.f7979d, (String) this.f7980e, (GeneratedAndroidFirebaseFirestore.Result) this.f);
                break;
        }
    }
}
