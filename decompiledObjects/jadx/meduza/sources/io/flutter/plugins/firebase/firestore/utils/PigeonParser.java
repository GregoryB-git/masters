package io.flutter.plugins.firebase.firestore.utils;

import android.util.Log;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.d;
import com.google.firebase.firestore.e;
import com.google.firebase.firestore.i;
import com.google.firebase.firestore.k;
import d9.a0;
import d9.b;
import d9.e;
import d9.n;
import d9.u0;
import d9.v0;
import g9.f0;
import g9.l;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;
import j9.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class PigeonParser {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: io.flutter.plugins.firebase.firestore.utils.PigeonParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$DocumentChange$Type;
        public static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$AggregateSource;
        public static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$ListenSource;
        public static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$ServerTimestampBehavior;
        public static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$Source;

        static {
            int[] iArr = new int[GeneratedAndroidFirebaseFirestore.AggregateSource.values().length];
            $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$AggregateSource = iArr;
            try {
                iArr[GeneratedAndroidFirebaseFirestore.AggregateSource.SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[GeneratedAndroidFirebaseFirestore.ListenSource.values().length];
            $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$ListenSource = iArr2;
            try {
                iArr2[GeneratedAndroidFirebaseFirestore.ListenSource.DEFAULT_SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$ListenSource[GeneratedAndroidFirebaseFirestore.ListenSource.CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr3 = new int[e.a.values().length];
            $SwitchMap$com$google$firebase$firestore$DocumentChange$Type = iArr3;
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$DocumentChange$Type[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$DocumentChange$Type[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr4 = new int[GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior.values().length];
            $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$ServerTimestampBehavior = iArr4;
            try {
                iArr4[GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$ServerTimestampBehavior[GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$ServerTimestampBehavior[GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior.PREVIOUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr5 = new int[GeneratedAndroidFirebaseFirestore.Source.values().length];
            $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$Source = iArr5;
            try {
                iArr5[GeneratedAndroidFirebaseFirestore.Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$Source[GeneratedAndroidFirebaseFirestore.Source.SERVER_AND_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$Source[GeneratedAndroidFirebaseFirestore.Source.SERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0086, code lost:
    
        if (r1.equals(">") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.firebase.firestore.e filterFromJson(java.util.Map<java.lang.String, java.lang.Object> r8) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.firestore.utils.PigeonParser.filterFromJson(java.util.Map):com.google.firebase.firestore.e");
    }

    public static b parseAggregateSource(GeneratedAndroidFirebaseFirestore.AggregateSource aggregateSource) {
        if (AnonymousClass1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$AggregateSource[aggregateSource.ordinal()] == 1) {
            return b.f3644a;
        }
        throw new IllegalArgumentException("Unknown AggregateSource value: " + aggregateSource);
    }

    public static List<n> parseFieldPath(List<List<String>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<List<String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(n.b((String[]) it.next().toArray(new String[0])));
        }
        return arrayList;
    }

    public static a0 parseListenSource(GeneratedAndroidFirebaseFirestore.ListenSource listenSource) {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$ListenSource[listenSource.ordinal()];
        if (i10 == 1) {
            return a0.DEFAULT;
        }
        if (i10 == 2) {
            return a0.CACHE;
        }
        throw new IllegalArgumentException("Unknown ListenSource value: " + listenSource);
    }

    public static d.a parsePigeonServerTimestampBehavior(GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior serverTimestampBehavior) {
        int i10;
        d.a aVar = d.a.NONE;
        if (serverTimestampBehavior == null || (i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$ServerTimestampBehavior[serverTimestampBehavior.ordinal()]) == 1) {
            return aVar;
        }
        if (i10 == 2) {
            return d.a.ESTIMATE;
        }
        if (i10 == 3) {
            return d.a.PREVIOUS;
        }
        throw new IllegalArgumentException("Unknown server timestamp behavior: " + serverTimestampBehavior);
    }

    public static v0 parsePigeonSource(GeneratedAndroidFirebaseFirestore.Source source) {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$Source[source.ordinal()];
        if (i10 == 1) {
            return v0.CACHE;
        }
        if (i10 == 2) {
            return v0.DEFAULT;
        }
        if (i10 == 3) {
            return v0.SERVER;
        }
        throw new IllegalArgumentException("Unknown source: " + source);
    }

    public static i parseQuery(FirebaseFirestore firebaseFirestore, String str, boolean z10, GeneratedAndroidFirebaseFirestore.PigeonQueryParameters pigeonQueryParameters) {
        i dVar;
        try {
            if (z10) {
                dVar = firebaseFirestore.c(str);
            } else {
                if (str == null) {
                    firebaseFirestore.getClass();
                    throw new NullPointerException("Provided collection path must not be null.");
                }
                firebaseFirestore.f3138k.b();
                dVar = new d9.d(o.t(str), firebaseFirestore);
            }
            if (pigeonQueryParameters == null) {
                return dVar;
            }
            if (pigeonQueryParameters.getFilters() != null) {
                dVar = dVar.k(filterFromJson(pigeonQueryParameters.getFilters()));
            }
            List<List<Object>> where = pigeonQueryParameters.getWhere();
            Objects.requireNonNull(where);
            for (List<Object> list : where) {
                n nVar = (n) list.get(0);
                String str2 = (String) list.get(1);
                Object obj = list.get(2);
                if ("==".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.EQUAL, obj));
                } else if ("!=".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.NOT_EQUAL, obj));
                } else if ("<".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.LESS_THAN, obj));
                } else if ("<=".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.LESS_THAN_OR_EQUAL, obj));
                } else if (">".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.GREATER_THAN, obj));
                } else if (">=".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.GREATER_THAN_OR_EQUAL, obj));
                } else if ("array-contains".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.ARRAY_CONTAINS, obj));
                } else if ("array-contains-any".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.ARRAY_CONTAINS_ANY, (List) obj));
                } else if ("in".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.IN, (List) obj));
                } else if ("not-in".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.NOT_IN, (List) obj));
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Long limit = pigeonQueryParameters.getLimit();
            if (limit != null) {
                dVar = dVar.c(limit.longValue());
            }
            Long limitToLast = pigeonQueryParameters.getLimitToLast();
            if (limitToLast != null) {
                dVar = dVar.d(limitToLast.longValue());
            }
            List<List<Object>> orderBy = pigeonQueryParameters.getOrderBy();
            if (orderBy == null) {
                return dVar;
            }
            for (List<Object> list2 : orderBy) {
                dVar = dVar.e((n) list2.get(0), ((Boolean) list2.get(1)).booleanValue() ? 2 : 1);
            }
            List<Object> startAt = pigeonQueryParameters.getStartAt();
            if (startAt != null) {
                Object[] array = startAt.toArray();
                Objects.requireNonNull(array);
                g9.e a10 = dVar.a("startAt", true, array);
                f0 f0Var = dVar.f3189a;
                dVar = new i(new f0(f0Var.f, f0Var.f5950g, f0Var.f5949e, f0Var.f5945a, f0Var.f5951h, f0Var.f5952i, a10, f0Var.f5954k), dVar.f3190b);
            }
            List<Object> startAfter = pigeonQueryParameters.getStartAfter();
            if (startAfter != null) {
                Object[] array2 = startAfter.toArray();
                Objects.requireNonNull(array2);
                g9.e a11 = dVar.a("startAfter", false, array2);
                f0 f0Var2 = dVar.f3189a;
                dVar = new i(new f0(f0Var2.f, f0Var2.f5950g, f0Var2.f5949e, f0Var2.f5945a, f0Var2.f5951h, f0Var2.f5952i, a11, f0Var2.f5954k), dVar.f3190b);
            }
            List<Object> endAt = pigeonQueryParameters.getEndAt();
            if (endAt != null) {
                Object[] array3 = endAt.toArray();
                Objects.requireNonNull(array3);
                g9.e a12 = dVar.a("endAt", true, array3);
                f0 f0Var3 = dVar.f3189a;
                dVar = new i(new f0(f0Var3.f, f0Var3.f5950g, f0Var3.f5949e, f0Var3.f5945a, f0Var3.f5951h, f0Var3.f5952i, f0Var3.f5953j, a12), dVar.f3190b);
            }
            List<Object> endBefore = pigeonQueryParameters.getEndBefore();
            if (endBefore == null) {
                return dVar;
            }
            Object[] array4 = endBefore.toArray();
            Objects.requireNonNull(array4);
            g9.e a13 = dVar.a("endBefore", false, array4);
            f0 f0Var4 = dVar.f3189a;
            return new i(new f0(f0Var4.f, f0Var4.f5950g, f0Var4.f5949e, f0Var4.f5945a, f0Var4.f5951h, f0Var4.f5952i, f0Var4.f5953j, a13), dVar.f3190b);
        } catch (Exception e10) {
            Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e10);
            return null;
        }
    }

    public static GeneratedAndroidFirebaseFirestore.PigeonDocumentChange toPigeonDocumentChange(d9.e eVar, d.a aVar) {
        GeneratedAndroidFirebaseFirestore.PigeonDocumentChange.Builder builder = new GeneratedAndroidFirebaseFirestore.PigeonDocumentChange.Builder();
        builder.setType(toPigeonDocumentChangeType(eVar.f3660a));
        builder.setOldIndex(Long.valueOf(eVar.f3662c));
        builder.setNewIndex(Long.valueOf(eVar.f3663d));
        builder.setDocument(toPigeonDocumentSnapshot(eVar.f3661b, aVar));
        return builder.build();
    }

    public static GeneratedAndroidFirebaseFirestore.DocumentChangeType toPigeonDocumentChangeType(e.a aVar) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$firebase$firestore$DocumentChange$Type[aVar.ordinal()];
        if (i10 == 1) {
            return GeneratedAndroidFirebaseFirestore.DocumentChangeType.ADDED;
        }
        if (i10 == 2) {
            return GeneratedAndroidFirebaseFirestore.DocumentChangeType.MODIFIED;
        }
        if (i10 == 3) {
            return GeneratedAndroidFirebaseFirestore.DocumentChangeType.REMOVED;
        }
        throw new IllegalArgumentException("Unknown change type: " + aVar);
    }

    public static List<GeneratedAndroidFirebaseFirestore.PigeonDocumentChange> toPigeonDocumentChanges(List<d9.e> list, d.a aVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<d9.e> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toPigeonDocumentChange(it.next(), aVar));
        }
        return arrayList;
    }

    public static GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot toPigeonDocumentSnapshot(d dVar, d.a aVar) {
        GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot.Builder builder = new GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot.Builder();
        builder.setMetadata(toPigeonSnapshotMetadata(dVar.f3151d));
        builder.setData(dVar.a(aVar));
        j9.i iVar = dVar.f3149b;
        iVar.getClass();
        builder.setPath(iVar.f8684a.h());
        return builder.build();
    }

    public static List<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> toPigeonDocumentSnapshots(List<d> list, d.a aVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toPigeonDocumentSnapshot(it.next(), aVar));
        }
        return arrayList;
    }

    public static GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot toPigeonQuerySnapshot(k kVar, d.a aVar) {
        GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot.Builder builder = new GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot.Builder();
        builder.setMetadata(toPigeonSnapshotMetadata(kVar.f));
        builder.setDocumentChanges(toPigeonDocumentChanges(kVar.a(), aVar));
        builder.setDocuments(toPigeonDocumentSnapshots(kVar.h(), aVar));
        return builder.build();
    }

    public static GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata toPigeonSnapshotMetadata(u0 u0Var) {
        GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata.Builder builder = new GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata.Builder();
        builder.setHasPendingWrites(Boolean.valueOf(u0Var.f3722a));
        builder.setIsFromCache(Boolean.valueOf(u0Var.f3723b));
        return builder.build();
    }
}
