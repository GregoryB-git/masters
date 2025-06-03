package io.flutter.plugins.firebase.firestore.streamhandler;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.c;
import com.google.firebase.firestore.d;
import com.google.firebase.firestore.f;
import d9.a0;
import d9.b0;
import d9.j0;
import d9.l;
import g9.k;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.firestore.utils.ExceptionConverter;
import io.flutter.plugins.firebase.firestore.utils.PigeonParser;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class DocumentSnapshotsStreamHandler implements EventChannel.StreamHandler {
    public c documentReference;
    public FirebaseFirestore firestore;
    public b0 listenerRegistration;
    public j0 metadataChanges;
    public d.a serverTimestampBehavior;
    public a0 source;

    public DocumentSnapshotsStreamHandler(FirebaseFirestore firebaseFirestore, c cVar, Boolean bool, d.a aVar, a0 a0Var) {
        this.firestore = firebaseFirestore;
        this.documentReference = cVar;
        this.metadataChanges = bool.booleanValue() ? j0.INCLUDE : j0.EXCLUDE;
        this.serverTimestampBehavior = aVar;
        this.source = a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onListen$0(EventChannel.EventSink eventSink, d dVar, f fVar) {
        if (fVar == null) {
            eventSink.success(PigeonParser.toPigeonDocumentSnapshot(dVar, this.serverTimestampBehavior).toList());
            return;
        }
        eventSink.error(FlutterFirebaseFirestorePlugin.DEFAULT_ERROR_CODE, fVar.getMessage(), ExceptionConverter.createDetails(fVar));
        eventSink.endOfStream();
        onCancel(null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        b0 b0Var = this.listenerRegistration;
        if (b0Var != null) {
            b0Var.remove();
            this.listenerRegistration = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, final EventChannel.EventSink eventSink) {
        Executor executor = n9.f.f11360a;
        j0 j0Var = this.metadataChanges;
        if (j0Var == null) {
            throw new NullPointerException("metadataChanges must not be null.");
        }
        a0 a0Var = this.source;
        if (a0Var == null) {
            throw new NullPointerException("listen source must not be null.");
        }
        c cVar = this.documentReference;
        l lVar = new l() { // from class: io.flutter.plugins.firebase.firestore.streamhandler.a
            @Override // d9.l
            public final void a(Object obj2, f fVar) {
                DocumentSnapshotsStreamHandler.this.lambda$onListen$0(eventSink, (d) obj2, fVar);
            }
        };
        cVar.getClass();
        k.a aVar = new k.a();
        j0 j0Var2 = j0.INCLUDE;
        aVar.f5998a = j0Var == j0Var2;
        aVar.f5999b = j0Var == j0Var2;
        aVar.f6000c = false;
        aVar.f6001d = a0Var;
        this.listenerRegistration = cVar.a(executor, aVar, lVar);
    }
}
