package io.flutter.plugins.firebase.firestore.streamhandler;

import com.google.firebase.firestore.FirebaseFirestore;
import d9.c0;
import d9.x;
import defpackage.e;
import f9.f;
import g9.u;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.firestore.utils.ExceptionConverter;
import java.io.ByteArrayInputStream;
import java.util.Objects;
import v3.x0;

/* loaded from: classes.dex */
public class LoadBundleStreamHandler implements EventChannel.StreamHandler {
    private final byte[] bundle;
    private EventChannel.EventSink eventSink;
    private final FirebaseFirestore firestore;

    public LoadBundleStreamHandler(FirebaseFirestore firebaseFirestore, byte[] bArr) {
        this.firestore = firebaseFirestore;
        this.bundle = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onListen$0(EventChannel.EventSink eventSink, Exception exc) {
        eventSink.error(FlutterFirebaseFirestorePlugin.DEFAULT_ERROR_CODE, exc.getMessage(), ExceptionConverter.createDetails(exc));
        onCancel(null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.eventSink.endOfStream();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.eventSink = eventSink;
        FirebaseFirestore firebaseFirestore = this.firestore;
        byte[] bArr = this.bundle;
        firebaseFirestore.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        c0 c0Var = new c0();
        x xVar = firebaseFirestore.f3138k;
        synchronized (xVar) {
            xVar.b();
            u uVar = xVar.f3734b;
            uVar.d();
            uVar.f6090d.a(new x0(uVar, new f(uVar.f6091e, byteArrayInputStream), c0Var, 4));
        }
        Objects.requireNonNull(eventSink);
        c0.a aVar = new c0.a(new e(eventSink, 15));
        synchronized (c0Var.f3647a) {
            c0Var.f3651e.add(aVar);
        }
        c0Var.addOnFailureListener(new k1.a(13, this, eventSink));
    }
}
