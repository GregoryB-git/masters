package io.flutter.plugins.firebase.firestore;

import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class GeneratedAndroidFirebaseFirestore {

    public static final class AggregateQuery {
        private String field;
        private AggregateType type;

        public static final class Builder {
            private String field;
            private AggregateType type;

            public AggregateQuery build() {
                AggregateQuery aggregateQuery = new AggregateQuery();
                aggregateQuery.setType(this.type);
                aggregateQuery.setField(this.field);
                return aggregateQuery;
            }

            public Builder setField(String str) {
                this.field = str;
                return this;
            }

            public Builder setType(AggregateType aggregateType) {
                this.type = aggregateType;
                return this;
            }
        }

        public static AggregateQuery fromList(ArrayList<Object> arrayList) {
            AggregateQuery aggregateQuery = new AggregateQuery();
            aggregateQuery.setType(AggregateType.values()[((Integer) arrayList.get(0)).intValue()]);
            aggregateQuery.setField((String) arrayList.get(1));
            return aggregateQuery;
        }

        public String getField() {
            return this.field;
        }

        public AggregateType getType() {
            return this.type;
        }

        public void setField(String str) {
            this.field = str;
        }

        public void setType(AggregateType aggregateType) {
            if (aggregateType == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.type = aggregateType;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            AggregateType aggregateType = this.type;
            arrayList.add(aggregateType == null ? null : Integer.valueOf(aggregateType.index));
            arrayList.add(this.field);
            return arrayList;
        }
    }

    public static final class AggregateQueryResponse {
        private String field;
        private AggregateType type;
        private Double value;

        public static final class Builder {
            private String field;
            private AggregateType type;
            private Double value;

            public AggregateQueryResponse build() {
                AggregateQueryResponse aggregateQueryResponse = new AggregateQueryResponse();
                aggregateQueryResponse.setType(this.type);
                aggregateQueryResponse.setField(this.field);
                aggregateQueryResponse.setValue(this.value);
                return aggregateQueryResponse;
            }

            public Builder setField(String str) {
                this.field = str;
                return this;
            }

            public Builder setType(AggregateType aggregateType) {
                this.type = aggregateType;
                return this;
            }

            public Builder setValue(Double d10) {
                this.value = d10;
                return this;
            }
        }

        public static AggregateQueryResponse fromList(ArrayList<Object> arrayList) {
            AggregateQueryResponse aggregateQueryResponse = new AggregateQueryResponse();
            aggregateQueryResponse.setType(AggregateType.values()[((Integer) arrayList.get(0)).intValue()]);
            aggregateQueryResponse.setField((String) arrayList.get(1));
            aggregateQueryResponse.setValue((Double) arrayList.get(2));
            return aggregateQueryResponse;
        }

        public String getField() {
            return this.field;
        }

        public AggregateType getType() {
            return this.type;
        }

        public Double getValue() {
            return this.value;
        }

        public void setField(String str) {
            this.field = str;
        }

        public void setType(AggregateType aggregateType) {
            if (aggregateType == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.type = aggregateType;
        }

        public void setValue(Double d10) {
            this.value = d10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            AggregateType aggregateType = this.type;
            arrayList.add(aggregateType == null ? null : Integer.valueOf(aggregateType.index));
            arrayList.add(this.field);
            arrayList.add(this.value);
            return arrayList;
        }
    }

    public enum AggregateSource {
        SERVER(0);

        public final int index;

        AggregateSource(int i10) {
            this.index = i10;
        }
    }

    public enum AggregateType {
        COUNT(0),
        SUM(1),
        AVERAGE(2);

        public final int index;

        AggregateType(int i10) {
            this.index = i10;
        }
    }

    public enum DocumentChangeType {
        ADDED(0),
        MODIFIED(1),
        REMOVED(2);

        public final int index;

        DocumentChangeType(int i10) {
            this.index = i10;
        }
    }

    public static final class DocumentReferenceRequest {
        private Map<Object, Object> data;
        private PigeonDocumentOption option;
        private String path;
        private ServerTimestampBehavior serverTimestampBehavior;
        private Source source;

        public static final class Builder {
            private Map<Object, Object> data;
            private PigeonDocumentOption option;
            private String path;
            private ServerTimestampBehavior serverTimestampBehavior;
            private Source source;

            public DocumentReferenceRequest build() {
                DocumentReferenceRequest documentReferenceRequest = new DocumentReferenceRequest();
                documentReferenceRequest.setPath(this.path);
                documentReferenceRequest.setData(this.data);
                documentReferenceRequest.setOption(this.option);
                documentReferenceRequest.setSource(this.source);
                documentReferenceRequest.setServerTimestampBehavior(this.serverTimestampBehavior);
                return documentReferenceRequest;
            }

            public Builder setData(Map<Object, Object> map) {
                this.data = map;
                return this;
            }

            public Builder setOption(PigeonDocumentOption pigeonDocumentOption) {
                this.option = pigeonDocumentOption;
                return this;
            }

            public Builder setPath(String str) {
                this.path = str;
                return this;
            }

            public Builder setServerTimestampBehavior(ServerTimestampBehavior serverTimestampBehavior) {
                this.serverTimestampBehavior = serverTimestampBehavior;
                return this;
            }

            public Builder setSource(Source source) {
                this.source = source;
                return this;
            }
        }

        public static DocumentReferenceRequest fromList(ArrayList<Object> arrayList) {
            DocumentReferenceRequest documentReferenceRequest = new DocumentReferenceRequest();
            documentReferenceRequest.setPath((String) arrayList.get(0));
            documentReferenceRequest.setData((Map) arrayList.get(1));
            Object obj = arrayList.get(2);
            documentReferenceRequest.setOption(obj == null ? null : PigeonDocumentOption.fromList((ArrayList) obj));
            Object obj2 = arrayList.get(3);
            documentReferenceRequest.setSource(obj2 == null ? null : Source.values()[((Integer) obj2).intValue()]);
            Object obj3 = arrayList.get(4);
            documentReferenceRequest.setServerTimestampBehavior(obj3 != null ? ServerTimestampBehavior.values()[((Integer) obj3).intValue()] : null);
            return documentReferenceRequest;
        }

        public Map<Object, Object> getData() {
            return this.data;
        }

        public PigeonDocumentOption getOption() {
            return this.option;
        }

        public String getPath() {
            return this.path;
        }

        public ServerTimestampBehavior getServerTimestampBehavior() {
            return this.serverTimestampBehavior;
        }

        public Source getSource() {
            return this.source;
        }

        public void setData(Map<Object, Object> map) {
            this.data = map;
        }

        public void setOption(PigeonDocumentOption pigeonDocumentOption) {
            this.option = pigeonDocumentOption;
        }

        public void setPath(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"path\" is null.");
            }
            this.path = str;
        }

        public void setServerTimestampBehavior(ServerTimestampBehavior serverTimestampBehavior) {
            this.serverTimestampBehavior = serverTimestampBehavior;
        }

        public void setSource(Source source) {
            this.source = source;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.path);
            arrayList.add(this.data);
            PigeonDocumentOption pigeonDocumentOption = this.option;
            arrayList.add(pigeonDocumentOption == null ? null : pigeonDocumentOption.toList());
            Source source = this.source;
            arrayList.add(source == null ? null : Integer.valueOf(source.index));
            ServerTimestampBehavior serverTimestampBehavior = this.serverTimestampBehavior;
            arrayList.add(serverTimestampBehavior != null ? Integer.valueOf(serverTimestampBehavior.index) : null);
            return arrayList;
        }
    }

    public interface FirebaseFirestoreHostApi {

        /* renamed from: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore$FirebaseFirestoreHostApi$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static MessageCodec<Object> a() {
                return FirebaseFirestoreHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.loadBundle((FirestorePigeonFirebaseApp) arrayList2.get(0), (byte[]) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.1
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.namedQueryGet((FirestorePigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (PigeonGetOptions) arrayList2.get(2), new Result<PigeonQuerySnapshot>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.2
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(PigeonQuerySnapshot pigeonQuerySnapshot) {
                        arrayList.add(0, pigeonQuerySnapshot);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                FirestorePigeonFirebaseApp firestorePigeonFirebaseApp = (FirestorePigeonFirebaseApp) arrayList2.get(0);
                Number number = (Number) arrayList2.get(1);
                Number number2 = (Number) arrayList2.get(2);
                firebaseFirestoreHostApi.transactionCreate(firestorePigeonFirebaseApp, number == null ? null : Long.valueOf(number.longValue()), number2 != null ? Long.valueOf(number2.longValue()) : null, new Result<String>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.11
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void e(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.transactionStoreResult((String) arrayList2.get(0), PigeonTransactionResult.values()[((Integer) arrayList2.get(1)).intValue()], (List) arrayList2.get(2), new Result<Void>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.12
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void f(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.transactionGet((FirestorePigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonDocumentSnapshot>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.13
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(PigeonDocumentSnapshot pigeonDocumentSnapshot) {
                        arrayList.add(0, pigeonDocumentSnapshot);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void g(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.documentReferenceSet((FirestorePigeonFirebaseApp) arrayList2.get(0), (DocumentReferenceRequest) arrayList2.get(1), new Result<Void>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.14
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void h(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.documentReferenceUpdate((FirestorePigeonFirebaseApp) arrayList2.get(0), (DocumentReferenceRequest) arrayList2.get(1), new Result<Void>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.15
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void i(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.documentReferenceGet((FirestorePigeonFirebaseApp) arrayList2.get(0), (DocumentReferenceRequest) arrayList2.get(1), new Result<PigeonDocumentSnapshot>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.16
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(PigeonDocumentSnapshot pigeonDocumentSnapshot) {
                        arrayList.add(0, pigeonDocumentSnapshot);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void j(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.documentReferenceDelete((FirestorePigeonFirebaseApp) arrayList2.get(0), (DocumentReferenceRequest) arrayList2.get(1), new Result<Void>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.17
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void k(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.queryGet((FirestorePigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (Boolean) arrayList2.get(2), (PigeonQueryParameters) arrayList2.get(3), (PigeonGetOptions) arrayList2.get(4), new Result<PigeonQuerySnapshot>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.18
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(PigeonQuerySnapshot pigeonQuerySnapshot) {
                        arrayList.add(0, pigeonQuerySnapshot);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void l(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.aggregateQuery((FirestorePigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (PigeonQueryParameters) arrayList2.get(2), AggregateSource.values()[((Integer) arrayList2.get(3)).intValue()], (List) arrayList2.get(4), (Boolean) arrayList2.get(5), new Result<List<AggregateQueryResponse>>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.19
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(List<AggregateQueryResponse> list) {
                        arrayList.add(0, list);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void m(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.writeBatchCommit((FirestorePigeonFirebaseApp) arrayList2.get(0), (List) arrayList2.get(1), new Result<Void>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.20
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void n(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseFirestoreHostApi.clearPersistence((FirestorePigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<Void>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.3
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void o(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.querySnapshot((FirestorePigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (Boolean) arrayList2.get(2), (PigeonQueryParameters) arrayList2.get(3), (PigeonGetOptions) arrayList2.get(4), (Boolean) arrayList2.get(5), ListenSource.values()[((Integer) arrayList2.get(6)).intValue()], new Result<String>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.21
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void p(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.documentReferenceSnapshot((FirestorePigeonFirebaseApp) arrayList2.get(0), (DocumentReferenceRequest) arrayList2.get(1), (Boolean) arrayList2.get(2), ListenSource.values()[((Integer) arrayList2.get(3)).intValue()], new Result<String>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.22
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void q(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.persistenceCacheIndexManagerRequest((FirestorePigeonFirebaseApp) arrayList2.get(0), PersistenceCacheIndexManagerRequest.values()[((Integer) arrayList2.get(1)).intValue()], new Result<Void>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.23
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void r(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseFirestoreHostApi.disableNetwork((FirestorePigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<Void>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.4
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void s(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseFirestoreHostApi.enableNetwork((FirestorePigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<Void>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.5
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void t(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseFirestoreHostApi.terminate((FirestorePigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<Void>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.6
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void u(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseFirestoreHostApi.waitForPendingWrites((FirestorePigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<Void>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.7
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void v(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseFirestoreHostApi.setIndexConfiguration((FirestorePigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<Void>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.8
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void w(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseFirestoreHostApi.setLoggingEnabled((Boolean) ((ArrayList) obj).get(0), new Result<Void>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.9
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void x(FirebaseFirestoreHostApi firebaseFirestoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseFirestoreHostApi.snapshotsInSyncSetup((FirestorePigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<String>() { // from class: io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.10
                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseFirestore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void y(BinaryMessenger binaryMessenger, final FirebaseFirestoreHostApi firebaseFirestoreHostApi) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.loadBundle", a());
                final int i10 = 0;
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.e
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.b(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.g(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.k(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.o(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.r(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.v(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.namedQueryGet", a());
                final int i11 = 2;
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.h
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.f(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.j(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.c(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.n(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.u(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.clearPersistence", a());
                final int i12 = 3;
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.h
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i12) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.f(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.j(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.c(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.n(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.u(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.disableNetwork", a());
                final int i13 = 4;
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.e
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i13) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.b(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.g(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.k(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.o(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.r(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.v(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel4.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.enableNetwork", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.f
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i13) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.d(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.h(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.l(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.p(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.s(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.w(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel5.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.terminate", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.g
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i13) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.e(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.i(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.m(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.q(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.t(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.x(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel6.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.waitForPendingWrites", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.h
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i13) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.f(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.j(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.c(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.n(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.u(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel7.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.setIndexConfiguration", a());
                final int i14 = 5;
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.e
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i14) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.b(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.g(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.k(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.o(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.r(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.v(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel8.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.setLoggingEnabled", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.f
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i14) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.d(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.h(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.l(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.p(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.s(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.w(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel9.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.snapshotsInSyncSetup", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.g
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i14) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.e(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.i(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.m(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.q(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.t(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.x(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel10.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionCreate", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.f
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.d(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.h(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.l(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.p(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.s(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.w(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel11.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionStoreResult", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.g
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.e(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.i(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.m(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.q(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.t(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.x(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel12.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionGet", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.h
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.f(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.j(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.c(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.n(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.u(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel13.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceSet", a());
                final int i15 = 1;
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.e
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i15) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.b(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.g(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.k(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.o(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.r(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.v(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel14.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceUpdate", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.f
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i15) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.d(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.h(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.l(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.p(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.s(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.w(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel15.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceGet", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel16.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.g
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i15) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.e(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.i(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.m(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.q(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.t(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.x(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel16.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceDelete", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel17.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.h
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i15) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.f(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.j(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.c(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.n(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.u(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel17.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.queryGet", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel18.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.e
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.b(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.g(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.k(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.o(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.r(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.v(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel18.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.aggregateQuery", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel19.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.f
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.d(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.h(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.l(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.p(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.s(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.w(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel19.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.writeBatchCommit", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel20.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.g
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.e(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.i(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.m(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.q(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.t(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.x(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel20.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.querySnapshot", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel21.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.e
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i12) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.b(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.g(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.k(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.o(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.r(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.v(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel21.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceSnapshot", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel22.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.f
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i12) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.d(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.h(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.l(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.p(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.s(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.w(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel22.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.persistenceCacheIndexManagerRequest", a());
                if (firebaseFirestoreHostApi != null) {
                    basicMessageChannel23.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.firestore.g
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i12) {
                                case 0:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.e(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.i(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.m(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.q(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.t(firebaseFirestoreHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.x(firebaseFirestoreHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel23.setMessageHandler(null);
                }
            }
        }

        void aggregateQuery(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, PigeonQueryParameters pigeonQueryParameters, AggregateSource aggregateSource, List<AggregateQuery> list, Boolean bool, Result<List<AggregateQueryResponse>> result);

        void clearPersistence(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, Result<Void> result);

        void disableNetwork(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, Result<Void> result);

        void documentReferenceDelete(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, DocumentReferenceRequest documentReferenceRequest, Result<Void> result);

        void documentReferenceGet(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, DocumentReferenceRequest documentReferenceRequest, Result<PigeonDocumentSnapshot> result);

        void documentReferenceSet(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, DocumentReferenceRequest documentReferenceRequest, Result<Void> result);

        void documentReferenceSnapshot(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, DocumentReferenceRequest documentReferenceRequest, Boolean bool, ListenSource listenSource, Result<String> result);

        void documentReferenceUpdate(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, DocumentReferenceRequest documentReferenceRequest, Result<Void> result);

        void enableNetwork(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, Result<Void> result);

        void loadBundle(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, byte[] bArr, Result<String> result);

        void namedQueryGet(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, PigeonGetOptions pigeonGetOptions, Result<PigeonQuerySnapshot> result);

        void persistenceCacheIndexManagerRequest(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, PersistenceCacheIndexManagerRequest persistenceCacheIndexManagerRequest, Result<Void> result);

        void queryGet(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, Boolean bool, PigeonQueryParameters pigeonQueryParameters, PigeonGetOptions pigeonGetOptions, Result<PigeonQuerySnapshot> result);

        void querySnapshot(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, Boolean bool, PigeonQueryParameters pigeonQueryParameters, PigeonGetOptions pigeonGetOptions, Boolean bool2, ListenSource listenSource, Result<String> result);

        void setIndexConfiguration(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, Result<Void> result);

        void setLoggingEnabled(Boolean bool, Result<Void> result);

        void snapshotsInSyncSetup(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, Result<String> result);

        void terminate(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, Result<Void> result);

        void transactionCreate(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, Long l10, Long l11, Result<String> result);

        void transactionGet(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, String str2, Result<PigeonDocumentSnapshot> result);

        void transactionStoreResult(String str, PigeonTransactionResult pigeonTransactionResult, List<PigeonTransactionCommand> list, Result<Void> result);

        void waitForPendingWrites(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, Result<Void> result);

        void writeBatchCommit(FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, List<PigeonTransactionCommand> list, Result<Void> result);
    }

    public static class FirebaseFirestoreHostApiCodec extends FlutterFirebaseFirestoreMessageCodec {
        public static final FirebaseFirestoreHostApiCodec INSTANCE = new FirebaseFirestoreHostApiCodec();

        private FirebaseFirestoreHostApiCodec() {
        }

        @Override // io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreMessageCodec, io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return AggregateQuery.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return AggregateQueryResponse.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return DocumentReferenceRequest.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return FirestorePigeonFirebaseApp.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return PigeonDocumentChange.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return PigeonDocumentOption.fromList((ArrayList) readValue(byteBuffer));
                case -122:
                    return PigeonDocumentSnapshot.fromList((ArrayList) readValue(byteBuffer));
                case -121:
                    return PigeonFirebaseSettings.fromList((ArrayList) readValue(byteBuffer));
                case -120:
                    return PigeonGetOptions.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return PigeonQueryParameters.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return PigeonQuerySnapshot.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return PigeonSnapshotMetadata.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return PigeonTransactionCommand.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b10, byteBuffer);
            }
        }

        @Override // io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreMessageCodec, io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> list;
            if (obj instanceof AggregateQuery) {
                byteArrayOutputStream.write(128);
                list = ((AggregateQuery) obj).toList();
            } else if (obj instanceof AggregateQueryResponse) {
                byteArrayOutputStream.write(129);
                list = ((AggregateQueryResponse) obj).toList();
            } else if (obj instanceof DocumentReferenceRequest) {
                byteArrayOutputStream.write(130);
                list = ((DocumentReferenceRequest) obj).toList();
            } else if (obj instanceof FirestorePigeonFirebaseApp) {
                byteArrayOutputStream.write(131);
                list = ((FirestorePigeonFirebaseApp) obj).toList();
            } else if (obj instanceof PigeonDocumentChange) {
                byteArrayOutputStream.write(132);
                list = ((PigeonDocumentChange) obj).toList();
            } else if (obj instanceof PigeonDocumentOption) {
                byteArrayOutputStream.write(133);
                list = ((PigeonDocumentOption) obj).toList();
            } else if (obj instanceof PigeonDocumentSnapshot) {
                byteArrayOutputStream.write(134);
                list = ((PigeonDocumentSnapshot) obj).toList();
            } else if (obj instanceof PigeonFirebaseSettings) {
                byteArrayOutputStream.write(135);
                list = ((PigeonFirebaseSettings) obj).toList();
            } else if (obj instanceof PigeonGetOptions) {
                byteArrayOutputStream.write(ModuleDescriptor.MODULE_VERSION);
                list = ((PigeonGetOptions) obj).toList();
            } else if (obj instanceof PigeonQueryParameters) {
                byteArrayOutputStream.write(137);
                list = ((PigeonQueryParameters) obj).toList();
            } else if (obj instanceof PigeonQuerySnapshot) {
                byteArrayOutputStream.write(138);
                list = ((PigeonQuerySnapshot) obj).toList();
            } else {
                if (!(obj instanceof PigeonSnapshotMetadata)) {
                    if (!(obj instanceof PigeonTransactionCommand)) {
                        super.writeValue(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(140);
                        writeValue(byteArrayOutputStream, ((PigeonTransactionCommand) obj).toList());
                        return;
                    }
                }
                byteArrayOutputStream.write(139);
                list = ((PigeonSnapshotMetadata) obj).toList();
            }
            writeValue(byteArrayOutputStream, list);
        }
    }

    public static final class FirestorePigeonFirebaseApp {
        private String appName;
        private String databaseURL;
        private PigeonFirebaseSettings settings;

        public static final class Builder {
            private String appName;
            private String databaseURL;
            private PigeonFirebaseSettings settings;

            public FirestorePigeonFirebaseApp build() {
                FirestorePigeonFirebaseApp firestorePigeonFirebaseApp = new FirestorePigeonFirebaseApp();
                firestorePigeonFirebaseApp.setAppName(this.appName);
                firestorePigeonFirebaseApp.setSettings(this.settings);
                firestorePigeonFirebaseApp.setDatabaseURL(this.databaseURL);
                return firestorePigeonFirebaseApp;
            }

            public Builder setAppName(String str) {
                this.appName = str;
                return this;
            }

            public Builder setDatabaseURL(String str) {
                this.databaseURL = str;
                return this;
            }

            public Builder setSettings(PigeonFirebaseSettings pigeonFirebaseSettings) {
                this.settings = pigeonFirebaseSettings;
                return this;
            }
        }

        public static FirestorePigeonFirebaseApp fromList(ArrayList<Object> arrayList) {
            FirestorePigeonFirebaseApp firestorePigeonFirebaseApp = new FirestorePigeonFirebaseApp();
            firestorePigeonFirebaseApp.setAppName((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            firestorePigeonFirebaseApp.setSettings(obj == null ? null : PigeonFirebaseSettings.fromList((ArrayList) obj));
            firestorePigeonFirebaseApp.setDatabaseURL((String) arrayList.get(2));
            return firestorePigeonFirebaseApp;
        }

        public String getAppName() {
            return this.appName;
        }

        public String getDatabaseURL() {
            return this.databaseURL;
        }

        public PigeonFirebaseSettings getSettings() {
            return this.settings;
        }

        public void setAppName(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appName\" is null.");
            }
            this.appName = str;
        }

        public void setDatabaseURL(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"databaseURL\" is null.");
            }
            this.databaseURL = str;
        }

        public void setSettings(PigeonFirebaseSettings pigeonFirebaseSettings) {
            if (pigeonFirebaseSettings == null) {
                throw new IllegalStateException("Nonnull field \"settings\" is null.");
            }
            this.settings = pigeonFirebaseSettings;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.appName);
            PigeonFirebaseSettings pigeonFirebaseSettings = this.settings;
            arrayList.add(pigeonFirebaseSettings == null ? null : pigeonFirebaseSettings.toList());
            arrayList.add(this.databaseURL);
            return arrayList;
        }
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public enum ListenSource {
        DEFAULT_SOURCE(0),
        CACHE(1);

        public final int index;

        ListenSource(int i10) {
            this.index = i10;
        }
    }

    public enum PersistenceCacheIndexManagerRequest {
        ENABLE_INDEX_AUTO_CREATION(0),
        DISABLE_INDEX_AUTO_CREATION(1),
        DELETE_ALL_INDEXES(2);

        public final int index;

        PersistenceCacheIndexManagerRequest(int i10) {
            this.index = i10;
        }
    }

    public static final class PigeonDocumentChange {
        private PigeonDocumentSnapshot document;
        private Long newIndex;
        private Long oldIndex;
        private DocumentChangeType type;

        public static final class Builder {
            private PigeonDocumentSnapshot document;
            private Long newIndex;
            private Long oldIndex;
            private DocumentChangeType type;

            public PigeonDocumentChange build() {
                PigeonDocumentChange pigeonDocumentChange = new PigeonDocumentChange();
                pigeonDocumentChange.setType(this.type);
                pigeonDocumentChange.setDocument(this.document);
                pigeonDocumentChange.setOldIndex(this.oldIndex);
                pigeonDocumentChange.setNewIndex(this.newIndex);
                return pigeonDocumentChange;
            }

            public Builder setDocument(PigeonDocumentSnapshot pigeonDocumentSnapshot) {
                this.document = pigeonDocumentSnapshot;
                return this;
            }

            public Builder setNewIndex(Long l10) {
                this.newIndex = l10;
                return this;
            }

            public Builder setOldIndex(Long l10) {
                this.oldIndex = l10;
                return this;
            }

            public Builder setType(DocumentChangeType documentChangeType) {
                this.type = documentChangeType;
                return this;
            }
        }

        public static PigeonDocumentChange fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            PigeonDocumentChange pigeonDocumentChange = new PigeonDocumentChange();
            pigeonDocumentChange.setType(DocumentChangeType.values()[((Integer) arrayList.get(0)).intValue()]);
            Object obj = arrayList.get(1);
            Long l10 = null;
            pigeonDocumentChange.setDocument(obj == null ? null : PigeonDocumentSnapshot.fromList((ArrayList) obj));
            Object obj2 = arrayList.get(2);
            if (obj2 == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            pigeonDocumentChange.setOldIndex(valueOf);
            Object obj3 = arrayList.get(3);
            if (obj3 != null) {
                l10 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            pigeonDocumentChange.setNewIndex(l10);
            return pigeonDocumentChange;
        }

        public PigeonDocumentSnapshot getDocument() {
            return this.document;
        }

        public Long getNewIndex() {
            return this.newIndex;
        }

        public Long getOldIndex() {
            return this.oldIndex;
        }

        public DocumentChangeType getType() {
            return this.type;
        }

        public void setDocument(PigeonDocumentSnapshot pigeonDocumentSnapshot) {
            if (pigeonDocumentSnapshot == null) {
                throw new IllegalStateException("Nonnull field \"document\" is null.");
            }
            this.document = pigeonDocumentSnapshot;
        }

        public void setNewIndex(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"newIndex\" is null.");
            }
            this.newIndex = l10;
        }

        public void setOldIndex(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"oldIndex\" is null.");
            }
            this.oldIndex = l10;
        }

        public void setType(DocumentChangeType documentChangeType) {
            if (documentChangeType == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.type = documentChangeType;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            DocumentChangeType documentChangeType = this.type;
            arrayList.add(documentChangeType == null ? null : Integer.valueOf(documentChangeType.index));
            PigeonDocumentSnapshot pigeonDocumentSnapshot = this.document;
            arrayList.add(pigeonDocumentSnapshot != null ? pigeonDocumentSnapshot.toList() : null);
            arrayList.add(this.oldIndex);
            arrayList.add(this.newIndex);
            return arrayList;
        }
    }

    public static final class PigeonDocumentOption {
        private Boolean merge;
        private List<List<String>> mergeFields;

        public static final class Builder {
            private Boolean merge;
            private List<List<String>> mergeFields;

            public PigeonDocumentOption build() {
                PigeonDocumentOption pigeonDocumentOption = new PigeonDocumentOption();
                pigeonDocumentOption.setMerge(this.merge);
                pigeonDocumentOption.setMergeFields(this.mergeFields);
                return pigeonDocumentOption;
            }

            public Builder setMerge(Boolean bool) {
                this.merge = bool;
                return this;
            }

            public Builder setMergeFields(List<List<String>> list) {
                this.mergeFields = list;
                return this;
            }
        }

        public static PigeonDocumentOption fromList(ArrayList<Object> arrayList) {
            PigeonDocumentOption pigeonDocumentOption = new PigeonDocumentOption();
            pigeonDocumentOption.setMerge((Boolean) arrayList.get(0));
            pigeonDocumentOption.setMergeFields((List) arrayList.get(1));
            return pigeonDocumentOption;
        }

        public Boolean getMerge() {
            return this.merge;
        }

        public List<List<String>> getMergeFields() {
            return this.mergeFields;
        }

        public void setMerge(Boolean bool) {
            this.merge = bool;
        }

        public void setMergeFields(List<List<String>> list) {
            this.mergeFields = list;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.merge);
            arrayList.add(this.mergeFields);
            return arrayList;
        }
    }

    public static final class PigeonDocumentSnapshot {
        private Map<String, Object> data;
        private PigeonSnapshotMetadata metadata;
        private String path;

        public static final class Builder {
            private Map<String, Object> data;
            private PigeonSnapshotMetadata metadata;
            private String path;

            public PigeonDocumentSnapshot build() {
                PigeonDocumentSnapshot pigeonDocumentSnapshot = new PigeonDocumentSnapshot();
                pigeonDocumentSnapshot.setPath(this.path);
                pigeonDocumentSnapshot.setData(this.data);
                pigeonDocumentSnapshot.setMetadata(this.metadata);
                return pigeonDocumentSnapshot;
            }

            public Builder setData(Map<String, Object> map) {
                this.data = map;
                return this;
            }

            public Builder setMetadata(PigeonSnapshotMetadata pigeonSnapshotMetadata) {
                this.metadata = pigeonSnapshotMetadata;
                return this;
            }

            public Builder setPath(String str) {
                this.path = str;
                return this;
            }
        }

        public static PigeonDocumentSnapshot fromList(ArrayList<Object> arrayList) {
            PigeonDocumentSnapshot pigeonDocumentSnapshot = new PigeonDocumentSnapshot();
            pigeonDocumentSnapshot.setPath((String) arrayList.get(0));
            pigeonDocumentSnapshot.setData((Map) arrayList.get(1));
            Object obj = arrayList.get(2);
            pigeonDocumentSnapshot.setMetadata(obj == null ? null : PigeonSnapshotMetadata.fromList((ArrayList) obj));
            return pigeonDocumentSnapshot;
        }

        public Map<String, Object> getData() {
            return this.data;
        }

        public PigeonSnapshotMetadata getMetadata() {
            return this.metadata;
        }

        public String getPath() {
            return this.path;
        }

        public void setData(Map<String, Object> map) {
            this.data = map;
        }

        public void setMetadata(PigeonSnapshotMetadata pigeonSnapshotMetadata) {
            if (pigeonSnapshotMetadata == null) {
                throw new IllegalStateException("Nonnull field \"metadata\" is null.");
            }
            this.metadata = pigeonSnapshotMetadata;
        }

        public void setPath(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"path\" is null.");
            }
            this.path = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.path);
            arrayList.add(this.data);
            PigeonSnapshotMetadata pigeonSnapshotMetadata = this.metadata;
            arrayList.add(pigeonSnapshotMetadata == null ? null : pigeonSnapshotMetadata.toList());
            return arrayList;
        }
    }

    public static final class PigeonFirebaseSettings {
        private Long cacheSizeBytes;
        private String host;
        private Boolean ignoreUndefinedProperties;
        private Boolean persistenceEnabled;
        private Boolean sslEnabled;

        public static final class Builder {
            private Long cacheSizeBytes;
            private String host;
            private Boolean ignoreUndefinedProperties;
            private Boolean persistenceEnabled;
            private Boolean sslEnabled;

            public PigeonFirebaseSettings build() {
                PigeonFirebaseSettings pigeonFirebaseSettings = new PigeonFirebaseSettings();
                pigeonFirebaseSettings.setPersistenceEnabled(this.persistenceEnabled);
                pigeonFirebaseSettings.setHost(this.host);
                pigeonFirebaseSettings.setSslEnabled(this.sslEnabled);
                pigeonFirebaseSettings.setCacheSizeBytes(this.cacheSizeBytes);
                pigeonFirebaseSettings.setIgnoreUndefinedProperties(this.ignoreUndefinedProperties);
                return pigeonFirebaseSettings;
            }

            public Builder setCacheSizeBytes(Long l10) {
                this.cacheSizeBytes = l10;
                return this;
            }

            public Builder setHost(String str) {
                this.host = str;
                return this;
            }

            public Builder setIgnoreUndefinedProperties(Boolean bool) {
                this.ignoreUndefinedProperties = bool;
                return this;
            }

            public Builder setPersistenceEnabled(Boolean bool) {
                this.persistenceEnabled = bool;
                return this;
            }

            public Builder setSslEnabled(Boolean bool) {
                this.sslEnabled = bool;
                return this;
            }
        }

        public static PigeonFirebaseSettings fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            PigeonFirebaseSettings pigeonFirebaseSettings = new PigeonFirebaseSettings();
            pigeonFirebaseSettings.setPersistenceEnabled((Boolean) arrayList.get(0));
            pigeonFirebaseSettings.setHost((String) arrayList.get(1));
            pigeonFirebaseSettings.setSslEnabled((Boolean) arrayList.get(2));
            Object obj = arrayList.get(3);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pigeonFirebaseSettings.setCacheSizeBytes(valueOf);
            pigeonFirebaseSettings.setIgnoreUndefinedProperties((Boolean) arrayList.get(4));
            return pigeonFirebaseSettings;
        }

        public Long getCacheSizeBytes() {
            return this.cacheSizeBytes;
        }

        public String getHost() {
            return this.host;
        }

        public Boolean getIgnoreUndefinedProperties() {
            return this.ignoreUndefinedProperties;
        }

        public Boolean getPersistenceEnabled() {
            return this.persistenceEnabled;
        }

        public Boolean getSslEnabled() {
            return this.sslEnabled;
        }

        public void setCacheSizeBytes(Long l10) {
            this.cacheSizeBytes = l10;
        }

        public void setHost(String str) {
            this.host = str;
        }

        public void setIgnoreUndefinedProperties(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"ignoreUndefinedProperties\" is null.");
            }
            this.ignoreUndefinedProperties = bool;
        }

        public void setPersistenceEnabled(Boolean bool) {
            this.persistenceEnabled = bool;
        }

        public void setSslEnabled(Boolean bool) {
            this.sslEnabled = bool;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.persistenceEnabled);
            arrayList.add(this.host);
            arrayList.add(this.sslEnabled);
            arrayList.add(this.cacheSizeBytes);
            arrayList.add(this.ignoreUndefinedProperties);
            return arrayList;
        }
    }

    public static final class PigeonGetOptions {
        private ServerTimestampBehavior serverTimestampBehavior;
        private Source source;

        public static final class Builder {
            private ServerTimestampBehavior serverTimestampBehavior;
            private Source source;

            public PigeonGetOptions build() {
                PigeonGetOptions pigeonGetOptions = new PigeonGetOptions();
                pigeonGetOptions.setSource(this.source);
                pigeonGetOptions.setServerTimestampBehavior(this.serverTimestampBehavior);
                return pigeonGetOptions;
            }

            public Builder setServerTimestampBehavior(ServerTimestampBehavior serverTimestampBehavior) {
                this.serverTimestampBehavior = serverTimestampBehavior;
                return this;
            }

            public Builder setSource(Source source) {
                this.source = source;
                return this;
            }
        }

        public static PigeonGetOptions fromList(ArrayList<Object> arrayList) {
            PigeonGetOptions pigeonGetOptions = new PigeonGetOptions();
            pigeonGetOptions.setSource(Source.values()[((Integer) arrayList.get(0)).intValue()]);
            pigeonGetOptions.setServerTimestampBehavior(ServerTimestampBehavior.values()[((Integer) arrayList.get(1)).intValue()]);
            return pigeonGetOptions;
        }

        public ServerTimestampBehavior getServerTimestampBehavior() {
            return this.serverTimestampBehavior;
        }

        public Source getSource() {
            return this.source;
        }

        public void setServerTimestampBehavior(ServerTimestampBehavior serverTimestampBehavior) {
            if (serverTimestampBehavior == null) {
                throw new IllegalStateException("Nonnull field \"serverTimestampBehavior\" is null.");
            }
            this.serverTimestampBehavior = serverTimestampBehavior;
        }

        public void setSource(Source source) {
            if (source == null) {
                throw new IllegalStateException("Nonnull field \"source\" is null.");
            }
            this.source = source;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            Source source = this.source;
            arrayList.add(source == null ? null : Integer.valueOf(source.index));
            ServerTimestampBehavior serverTimestampBehavior = this.serverTimestampBehavior;
            arrayList.add(serverTimestampBehavior != null ? Integer.valueOf(serverTimestampBehavior.index) : null);
            return arrayList;
        }
    }

    public static final class PigeonQueryParameters {
        private List<Object> endAt;
        private List<Object> endBefore;
        private Map<String, Object> filters;
        private Long limit;
        private Long limitToLast;
        private List<List<Object>> orderBy;
        private List<Object> startAfter;
        private List<Object> startAt;
        private List<List<Object>> where;

        public static final class Builder {
            private List<Object> endAt;
            private List<Object> endBefore;
            private Map<String, Object> filters;
            private Long limit;
            private Long limitToLast;
            private List<List<Object>> orderBy;
            private List<Object> startAfter;
            private List<Object> startAt;
            private List<List<Object>> where;

            public PigeonQueryParameters build() {
                PigeonQueryParameters pigeonQueryParameters = new PigeonQueryParameters();
                pigeonQueryParameters.setWhere(this.where);
                pigeonQueryParameters.setOrderBy(this.orderBy);
                pigeonQueryParameters.setLimit(this.limit);
                pigeonQueryParameters.setLimitToLast(this.limitToLast);
                pigeonQueryParameters.setStartAt(this.startAt);
                pigeonQueryParameters.setStartAfter(this.startAfter);
                pigeonQueryParameters.setEndAt(this.endAt);
                pigeonQueryParameters.setEndBefore(this.endBefore);
                pigeonQueryParameters.setFilters(this.filters);
                return pigeonQueryParameters;
            }

            public Builder setEndAt(List<Object> list) {
                this.endAt = list;
                return this;
            }

            public Builder setEndBefore(List<Object> list) {
                this.endBefore = list;
                return this;
            }

            public Builder setFilters(Map<String, Object> map) {
                this.filters = map;
                return this;
            }

            public Builder setLimit(Long l10) {
                this.limit = l10;
                return this;
            }

            public Builder setLimitToLast(Long l10) {
                this.limitToLast = l10;
                return this;
            }

            public Builder setOrderBy(List<List<Object>> list) {
                this.orderBy = list;
                return this;
            }

            public Builder setStartAfter(List<Object> list) {
                this.startAfter = list;
                return this;
            }

            public Builder setStartAt(List<Object> list) {
                this.startAt = list;
                return this;
            }

            public Builder setWhere(List<List<Object>> list) {
                this.where = list;
                return this;
            }
        }

        public static PigeonQueryParameters fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            PigeonQueryParameters pigeonQueryParameters = new PigeonQueryParameters();
            pigeonQueryParameters.setWhere((List) arrayList.get(0));
            pigeonQueryParameters.setOrderBy((List) arrayList.get(1));
            Object obj = arrayList.get(2);
            Long l10 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pigeonQueryParameters.setLimit(valueOf);
            Object obj2 = arrayList.get(3);
            if (obj2 != null) {
                l10 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            pigeonQueryParameters.setLimitToLast(l10);
            pigeonQueryParameters.setStartAt((List) arrayList.get(4));
            pigeonQueryParameters.setStartAfter((List) arrayList.get(5));
            pigeonQueryParameters.setEndAt((List) arrayList.get(6));
            pigeonQueryParameters.setEndBefore((List) arrayList.get(7));
            pigeonQueryParameters.setFilters((Map) arrayList.get(8));
            return pigeonQueryParameters;
        }

        public List<Object> getEndAt() {
            return this.endAt;
        }

        public List<Object> getEndBefore() {
            return this.endBefore;
        }

        public Map<String, Object> getFilters() {
            return this.filters;
        }

        public Long getLimit() {
            return this.limit;
        }

        public Long getLimitToLast() {
            return this.limitToLast;
        }

        public List<List<Object>> getOrderBy() {
            return this.orderBy;
        }

        public List<Object> getStartAfter() {
            return this.startAfter;
        }

        public List<Object> getStartAt() {
            return this.startAt;
        }

        public List<List<Object>> getWhere() {
            return this.where;
        }

        public void setEndAt(List<Object> list) {
            this.endAt = list;
        }

        public void setEndBefore(List<Object> list) {
            this.endBefore = list;
        }

        public void setFilters(Map<String, Object> map) {
            this.filters = map;
        }

        public void setLimit(Long l10) {
            this.limit = l10;
        }

        public void setLimitToLast(Long l10) {
            this.limitToLast = l10;
        }

        public void setOrderBy(List<List<Object>> list) {
            this.orderBy = list;
        }

        public void setStartAfter(List<Object> list) {
            this.startAfter = list;
        }

        public void setStartAt(List<Object> list) {
            this.startAt = list;
        }

        public void setWhere(List<List<Object>> list) {
            this.where = list;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(9);
            arrayList.add(this.where);
            arrayList.add(this.orderBy);
            arrayList.add(this.limit);
            arrayList.add(this.limitToLast);
            arrayList.add(this.startAt);
            arrayList.add(this.startAfter);
            arrayList.add(this.endAt);
            arrayList.add(this.endBefore);
            arrayList.add(this.filters);
            return arrayList;
        }
    }

    public static final class PigeonQuerySnapshot {
        private List<PigeonDocumentChange> documentChanges;
        private List<PigeonDocumentSnapshot> documents;
        private PigeonSnapshotMetadata metadata;

        public static final class Builder {
            private List<PigeonDocumentChange> documentChanges;
            private List<PigeonDocumentSnapshot> documents;
            private PigeonSnapshotMetadata metadata;

            public PigeonQuerySnapshot build() {
                PigeonQuerySnapshot pigeonQuerySnapshot = new PigeonQuerySnapshot();
                pigeonQuerySnapshot.setDocuments(this.documents);
                pigeonQuerySnapshot.setDocumentChanges(this.documentChanges);
                pigeonQuerySnapshot.setMetadata(this.metadata);
                return pigeonQuerySnapshot;
            }

            public Builder setDocumentChanges(List<PigeonDocumentChange> list) {
                this.documentChanges = list;
                return this;
            }

            public Builder setDocuments(List<PigeonDocumentSnapshot> list) {
                this.documents = list;
                return this;
            }

            public Builder setMetadata(PigeonSnapshotMetadata pigeonSnapshotMetadata) {
                this.metadata = pigeonSnapshotMetadata;
                return this;
            }
        }

        public static PigeonQuerySnapshot fromList(ArrayList<Object> arrayList) {
            PigeonQuerySnapshot pigeonQuerySnapshot = new PigeonQuerySnapshot();
            pigeonQuerySnapshot.setDocuments((List) arrayList.get(0));
            pigeonQuerySnapshot.setDocumentChanges((List) arrayList.get(1));
            Object obj = arrayList.get(2);
            pigeonQuerySnapshot.setMetadata(obj == null ? null : PigeonSnapshotMetadata.fromList((ArrayList) obj));
            return pigeonQuerySnapshot;
        }

        public List<PigeonDocumentChange> getDocumentChanges() {
            return this.documentChanges;
        }

        public List<PigeonDocumentSnapshot> getDocuments() {
            return this.documents;
        }

        public PigeonSnapshotMetadata getMetadata() {
            return this.metadata;
        }

        public void setDocumentChanges(List<PigeonDocumentChange> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"documentChanges\" is null.");
            }
            this.documentChanges = list;
        }

        public void setDocuments(List<PigeonDocumentSnapshot> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"documents\" is null.");
            }
            this.documents = list;
        }

        public void setMetadata(PigeonSnapshotMetadata pigeonSnapshotMetadata) {
            if (pigeonSnapshotMetadata == null) {
                throw new IllegalStateException("Nonnull field \"metadata\" is null.");
            }
            this.metadata = pigeonSnapshotMetadata;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.documents);
            arrayList.add(this.documentChanges);
            PigeonSnapshotMetadata pigeonSnapshotMetadata = this.metadata;
            arrayList.add(pigeonSnapshotMetadata == null ? null : pigeonSnapshotMetadata.toList());
            return arrayList;
        }
    }

    public static final class PigeonSnapshotMetadata {
        private Boolean hasPendingWrites;
        private Boolean isFromCache;

        public static final class Builder {
            private Boolean hasPendingWrites;
            private Boolean isFromCache;

            public PigeonSnapshotMetadata build() {
                PigeonSnapshotMetadata pigeonSnapshotMetadata = new PigeonSnapshotMetadata();
                pigeonSnapshotMetadata.setHasPendingWrites(this.hasPendingWrites);
                pigeonSnapshotMetadata.setIsFromCache(this.isFromCache);
                return pigeonSnapshotMetadata;
            }

            public Builder setHasPendingWrites(Boolean bool) {
                this.hasPendingWrites = bool;
                return this;
            }

            public Builder setIsFromCache(Boolean bool) {
                this.isFromCache = bool;
                return this;
            }
        }

        public static PigeonSnapshotMetadata fromList(ArrayList<Object> arrayList) {
            PigeonSnapshotMetadata pigeonSnapshotMetadata = new PigeonSnapshotMetadata();
            pigeonSnapshotMetadata.setHasPendingWrites((Boolean) arrayList.get(0));
            pigeonSnapshotMetadata.setIsFromCache((Boolean) arrayList.get(1));
            return pigeonSnapshotMetadata;
        }

        public Boolean getHasPendingWrites() {
            return this.hasPendingWrites;
        }

        public Boolean getIsFromCache() {
            return this.isFromCache;
        }

        public void setHasPendingWrites(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"hasPendingWrites\" is null.");
            }
            this.hasPendingWrites = bool;
        }

        public void setIsFromCache(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isFromCache\" is null.");
            }
            this.isFromCache = bool;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.hasPendingWrites);
            arrayList.add(this.isFromCache);
            return arrayList;
        }
    }

    public static final class PigeonTransactionCommand {
        private Map<String, Object> data;
        private PigeonDocumentOption option;
        private String path;
        private PigeonTransactionType type;

        public static final class Builder {
            private Map<String, Object> data;
            private PigeonDocumentOption option;
            private String path;
            private PigeonTransactionType type;

            public PigeonTransactionCommand build() {
                PigeonTransactionCommand pigeonTransactionCommand = new PigeonTransactionCommand();
                pigeonTransactionCommand.setType(this.type);
                pigeonTransactionCommand.setPath(this.path);
                pigeonTransactionCommand.setData(this.data);
                pigeonTransactionCommand.setOption(this.option);
                return pigeonTransactionCommand;
            }

            public Builder setData(Map<String, Object> map) {
                this.data = map;
                return this;
            }

            public Builder setOption(PigeonDocumentOption pigeonDocumentOption) {
                this.option = pigeonDocumentOption;
                return this;
            }

            public Builder setPath(String str) {
                this.path = str;
                return this;
            }

            public Builder setType(PigeonTransactionType pigeonTransactionType) {
                this.type = pigeonTransactionType;
                return this;
            }
        }

        public static PigeonTransactionCommand fromList(ArrayList<Object> arrayList) {
            PigeonTransactionCommand pigeonTransactionCommand = new PigeonTransactionCommand();
            pigeonTransactionCommand.setType(PigeonTransactionType.values()[((Integer) arrayList.get(0)).intValue()]);
            pigeonTransactionCommand.setPath((String) arrayList.get(1));
            pigeonTransactionCommand.setData((Map) arrayList.get(2));
            Object obj = arrayList.get(3);
            pigeonTransactionCommand.setOption(obj == null ? null : PigeonDocumentOption.fromList((ArrayList) obj));
            return pigeonTransactionCommand;
        }

        public Map<String, Object> getData() {
            return this.data;
        }

        public PigeonDocumentOption getOption() {
            return this.option;
        }

        public String getPath() {
            return this.path;
        }

        public PigeonTransactionType getType() {
            return this.type;
        }

        public void setData(Map<String, Object> map) {
            this.data = map;
        }

        public void setOption(PigeonDocumentOption pigeonDocumentOption) {
            this.option = pigeonDocumentOption;
        }

        public void setPath(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"path\" is null.");
            }
            this.path = str;
        }

        public void setType(PigeonTransactionType pigeonTransactionType) {
            if (pigeonTransactionType == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.type = pigeonTransactionType;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            PigeonTransactionType pigeonTransactionType = this.type;
            arrayList.add(pigeonTransactionType == null ? null : Integer.valueOf(pigeonTransactionType.index));
            arrayList.add(this.path);
            arrayList.add(this.data);
            PigeonDocumentOption pigeonDocumentOption = this.option;
            arrayList.add(pigeonDocumentOption != null ? pigeonDocumentOption.toList() : null);
            return arrayList;
        }
    }

    public enum PigeonTransactionResult {
        SUCCESS(0),
        FAILURE(1);

        public final int index;

        PigeonTransactionResult(int i10) {
            this.index = i10;
        }
    }

    public enum PigeonTransactionType {
        GET(0),
        UPDATE(1),
        SET(2),
        DELETE_TYPE(3);

        public final int index;

        PigeonTransactionType(int i10) {
            this.index = i10;
        }
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    public enum ServerTimestampBehavior {
        NONE(0),
        ESTIMATE(1),
        PREVIOUS(2);

        public final int index;

        ServerTimestampBehavior(int i10) {
            this.index = i10;
        }
    }

    public enum Source {
        SERVER_AND_CACHE(0),
        SERVER(1),
        CACHE(2);

        public final int index;

        Source(int i10) {
            this.index = i10;
        }
    }

    public static ArrayList<Object> wrapError(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            obj = flutterError.details;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
