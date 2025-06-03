package io.flutter.plugins.firebase.firestore.streamhandler;

import com.google.firebase.firestore.d;
import com.google.firebase.firestore.f;
import com.google.firebase.firestore.i;
import com.google.firebase.firestore.k;
import d9.a0;
import d9.b0;
import d9.e;
import d9.j0;
import d9.o0;
import d9.p0;
import g9.k;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.firestore.utils.ExceptionConverter;
import io.flutter.plugins.firebase.firestore.utils.PigeonParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class QuerySnapshotsStreamHandler implements EventChannel.StreamHandler {
    public b0 listenerRegistration;
    public j0 metadataChanges;
    public i query;
    public d.a serverTimestampBehavior;
    public a0 source;

    public QuerySnapshotsStreamHandler(i iVar, Boolean bool, d.a aVar, a0 a0Var) {
        this.query = iVar;
        this.metadataChanges = bool.booleanValue() ? j0.INCLUDE : j0.EXCLUDE;
        this.serverTimestampBehavior = aVar;
        this.source = a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onListen$0(EventChannel.EventSink eventSink, k kVar, f fVar) {
        if (fVar != null) {
            eventSink.error(FlutterFirebaseFirestorePlugin.DEFAULT_ERROR_CODE, fVar.getMessage(), ExceptionConverter.createDetails(fVar));
            eventSink.endOfStream();
            onCancel(null);
            return;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(kVar.h().size());
        ArrayList arrayList3 = new ArrayList(kVar.a().size());
        Iterator it = kVar.h().iterator();
        while (it.hasNext()) {
            arrayList2.add(PigeonParser.toPigeonDocumentSnapshot((d) it.next(), this.serverTimestampBehavior).toList());
        }
        Iterator<e> it2 = kVar.a().iterator();
        while (it2.hasNext()) {
            arrayList3.add(PigeonParser.toPigeonDocumentChange(it2.next(), this.serverTimestampBehavior).toList());
        }
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        arrayList.add(PigeonParser.toPigeonSnapshotMetadata(kVar.f).toList());
        eventSink.success(arrayList);
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
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        Executor executor = n9.f.f11360a;
        j0 j0Var = this.metadataChanges;
        if (j0Var == null) {
            throw new NullPointerException("metadataChanges must not be null.");
        }
        a0 a0Var = this.source;
        if (a0Var == null) {
            throw new NullPointerException("listen source must not be null.");
        }
        i iVar = this.query;
        o0 o0Var = new o0(true ? 1 : 0, this, eventSink);
        iVar.getClass();
        k.a aVar = new k.a();
        j0 j0Var2 = j0.INCLUDE;
        int i10 = 0;
        aVar.f5998a = j0Var == j0Var2;
        aVar.f5999b = j0Var == j0Var2;
        aVar.f6000c = false;
        aVar.f6001d = a0Var;
        iVar.j();
        this.listenerRegistration = (b0) iVar.f3190b.a(new p0(iVar, aVar, new g9.d(executor, new o0(i10, iVar, o0Var))));
    }
}
