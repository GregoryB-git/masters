package io.flutter.plugins.firebase.firestore;

import android.util.Log;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.d;
import com.google.firebase.firestore.e;
import com.google.firebase.firestore.g;
import com.google.firebase.firestore.i;
import com.google.firebase.firestore.k;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import d9.d0;
import d9.e;
import d9.e0;
import d9.g0;
import d9.l0;
import d9.n;
import d9.o;
import d9.u0;
import d9.y;
import d9.z0;
import g9.f0;
import g9.l;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.firebase.analytics.Constants;
import j9.o;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import u7.m;

/* loaded from: classes.dex */
class FlutterFirebaseFirestoreMessageCodec extends StandardMessageCodec {
    private static final byte DATA_TYPE_ARRAY_REMOVE = -71;
    private static final byte DATA_TYPE_ARRAY_UNION = -72;
    private static final byte DATA_TYPE_BLOB = -73;
    private static final byte DATA_TYPE_DATE_TIME = -76;
    private static final byte DATA_TYPE_DELETE = -70;
    private static final byte DATA_TYPE_DOCUMENT_ID = -65;
    private static final byte DATA_TYPE_DOCUMENT_REFERENCE = -74;
    private static final byte DATA_TYPE_FIELD_PATH = -64;
    private static final byte DATA_TYPE_FIRESTORE_INSTANCE = -60;
    private static final byte DATA_TYPE_FIRESTORE_QUERY = -59;
    private static final byte DATA_TYPE_FIRESTORE_SETTINGS = -58;
    private static final byte DATA_TYPE_GEO_POINT = -75;
    private static final byte DATA_TYPE_INCREMENT_DOUBLE = -67;
    private static final byte DATA_TYPE_INCREMENT_INTEGER = -66;
    private static final byte DATA_TYPE_INFINITY = -62;
    private static final byte DATA_TYPE_NAN = -63;
    private static final byte DATA_TYPE_NEGATIVE_INFINITY = -61;
    private static final byte DATA_TYPE_SERVER_TIMESTAMP = -69;
    private static final byte DATA_TYPE_TIMESTAMP = -68;
    private static final byte DATA_TYPE_VECTOR_VALUE = -57;
    public static final FlutterFirebaseFirestoreMessageCodec INSTANCE = new FlutterFirebaseFirestoreMessageCodec();

    /* renamed from: io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreMessageCodec$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$DocumentChange$Type;
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$LoadBundleTaskProgress$TaskState;

        static {
            int[] iArr = new int[q0.g.d(3).length];
            $SwitchMap$com$google$firebase$firestore$LoadBundleTaskProgress$TaskState = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$LoadBundleTaskProgress$TaskState[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$LoadBundleTaskProgress$TaskState[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.a.values().length];
            $SwitchMap$com$google$firebase$firestore$DocumentChange$Type = iArr2;
            try {
                iArr2[0] = 1;
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
    private com.google.firebase.firestore.e filterFromJson(java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreMessageCodec.filterFromJson(java.util.Map):com.google.firebase.firestore.e");
    }

    private FirebaseFirestore readFirestoreInstance(ByteBuffer byteBuffer) {
        String str = (String) readValue(byteBuffer);
        String str2 = (String) readValue(byteBuffer);
        com.google.firebase.firestore.g gVar = (com.google.firebase.firestore.g) readValue(byteBuffer);
        synchronized (FlutterFirebaseFirestorePlugin.firestoreInstanceCache) {
            FirebaseFirestore firestoreInstanceByNameAndDatabaseUrl = FlutterFirebaseFirestorePlugin.getFirestoreInstanceByNameAndDatabaseUrl(str, str2);
            if (firestoreInstanceByNameAndDatabaseUrl != null) {
                return firestoreInstanceByNameAndDatabaseUrl;
            }
            FirebaseFirestore e10 = FirebaseFirestore.e(u7.f.f(str), str2);
            e10.g(gVar);
            FlutterFirebaseFirestorePlugin.setCachedFirebaseFirestoreInstanceForKey(e10, str2);
            return e10;
        }
    }

    private i readFirestoreQuery(ByteBuffer byteBuffer) {
        i dVar;
        try {
            Map map = (Map) readValue(byteBuffer);
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
            Object obj2 = map.get("path");
            Objects.requireNonNull(obj2);
            String str = (String) obj2;
            boolean booleanValue = ((Boolean) map.get("isCollectionGroup")).booleanValue();
            Map map2 = (Map) map.get(Constants.PARAMETERS);
            if (booleanValue) {
                dVar = firebaseFirestore.c(str);
            } else {
                firebaseFirestore.f3138k.b();
                dVar = new d9.d(o.t(str), firebaseFirestore);
            }
            if (map2 == null) {
                return dVar;
            }
            if (map2.containsKey("filters")) {
                try {
                    Object obj3 = map2.get("filters");
                    Objects.requireNonNull(obj3);
                    dVar = dVar.k(filterFromJson((Map) obj3));
                } catch (Exception e10) {
                    e = e10;
                    Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e);
                    return null;
                }
            }
            Object obj4 = map2.get("where");
            Objects.requireNonNull(obj4);
            for (List list : (List) obj4) {
                n nVar = (n) list.get(0);
                String str2 = (String) list.get(1);
                Object obj5 = list.get(2);
                if ("==".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.EQUAL, obj5));
                } else if ("!=".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.NOT_EQUAL, obj5));
                } else if ("<".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.LESS_THAN, obj5));
                } else if ("<=".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.LESS_THAN_OR_EQUAL, obj5));
                } else if (">".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.GREATER_THAN, obj5));
                } else if (">=".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.GREATER_THAN_OR_EQUAL, obj5));
                } else if ("array-contains".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.ARRAY_CONTAINS, obj5));
                } else if ("array-contains-any".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.ARRAY_CONTAINS_ANY, (List) obj5));
                } else if ("in".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.IN, (List) obj5));
                } else if ("not-in".equals(str2)) {
                    dVar.getClass();
                    dVar = dVar.k(new e.b(nVar, l.a.NOT_IN, (List) obj5));
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Number number = (Number) map2.get("limit");
            if (number != null) {
                dVar = dVar.c(number.longValue());
            }
            Number number2 = (Number) map2.get("limitToLast");
            if (number2 != null) {
                dVar = dVar.d(number2.longValue());
            }
            List<List> list2 = (List) map2.get("orderBy");
            if (list2 == null) {
                return dVar;
            }
            for (List list3 : list2) {
                dVar = dVar.e((n) list3.get(0), ((Boolean) list3.get(1)).booleanValue() ? 2 : 1);
            }
            List list4 = (List) map2.get("startAt");
            if (list4 != null) {
                Object[] array = list4.toArray();
                Objects.requireNonNull(array);
                g9.e a10 = dVar.a("startAt", true, array);
                f0 f0Var = dVar.f3189a;
                dVar = new i(new f0(f0Var.f, f0Var.f5950g, f0Var.f5949e, f0Var.f5945a, f0Var.f5951h, f0Var.f5952i, a10, f0Var.f5954k), dVar.f3190b);
            }
            List list5 = (List) map2.get("startAfter");
            if (list5 != null) {
                Object[] array2 = list5.toArray();
                Objects.requireNonNull(array2);
                g9.e a11 = dVar.a("startAfter", false, array2);
                f0 f0Var2 = dVar.f3189a;
                dVar = new i(new f0(f0Var2.f, f0Var2.f5950g, f0Var2.f5949e, f0Var2.f5945a, f0Var2.f5951h, f0Var2.f5952i, a11, f0Var2.f5954k), dVar.f3190b);
            }
            List list6 = (List) map2.get("endAt");
            if (list6 != null) {
                Object[] array3 = list6.toArray();
                Objects.requireNonNull(array3);
                g9.e a12 = dVar.a("endAt", true, array3);
                f0 f0Var3 = dVar.f3189a;
                dVar = new i(new f0(f0Var3.f, f0Var3.f5950g, f0Var3.f5949e, f0Var3.f5945a, f0Var3.f5951h, f0Var3.f5952i, f0Var3.f5953j, a12), dVar.f3190b);
            }
            List list7 = (List) map2.get("endBefore");
            if (list7 == null) {
                return dVar;
            }
            Object[] array4 = list7.toArray();
            Objects.requireNonNull(array4);
            g9.e a13 = dVar.a("endBefore", false, array4);
            f0 f0Var4 = dVar.f3189a;
            return new i(new f0(f0Var4.f, f0Var4.f5950g, f0Var4.f5949e, f0Var4.f5945a, f0Var4.f5951h, f0Var4.f5952i, f0Var4.f5953j, a13), dVar.f3190b);
        } catch (Exception e11) {
            e = e11;
        }
    }

    private com.google.firebase.firestore.g readFirestoreSettings(ByteBuffer byteBuffer) {
        e0 f0Var;
        Map map = (Map) readValue(byteBuffer);
        g.a aVar = new g.a();
        if (map.get("persistenceEnabled") != null) {
            if (Boolean.TRUE.equals((Boolean) map.get("persistenceEnabled"))) {
                long j10 = 104857600;
                if (map.get("cacheSizeBytes") != null) {
                    Long l10 = 104857600L;
                    Object obj = map.get("cacheSizeBytes");
                    if (obj instanceof Long) {
                        l10 = (Long) obj;
                    } else if (obj instanceof Integer) {
                        l10 = Long.valueOf(((Integer) obj).intValue());
                    }
                    j10 = l10.longValue() == -1 ? -1L : l10.longValue();
                }
                f0Var = new l0(j10);
            } else {
                f0Var = new d9.f0(new g0());
            }
            aVar.b(f0Var);
        }
        if (map.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST) != null) {
            Object obj2 = map.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
            Objects.requireNonNull(obj2);
            aVar.f3179a = (String) obj2;
            if (map.get("sslEnabled") != null) {
                Object obj3 = map.get("sslEnabled");
                Objects.requireNonNull(obj3);
                aVar.f3180b = ((Boolean) obj3).booleanValue();
            }
        }
        return aVar.a();
    }

    private Object[] toArray(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).toArray();
        }
        if (obj == null) {
            return new ArrayList().toArray();
        }
        throw new IllegalArgumentException(String.format("java.util.List was expected, unable to convert '%s' to an object array", obj.getClass().getCanonicalName()));
    }

    private void writeDocumentChange(ByteArrayOutputStream byteArrayOutputStream, d9.e eVar) {
        HashMap hashMap = new HashMap();
        int ordinal = eVar.f3660a.ordinal();
        hashMap.put("type", ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? null : "DocumentChangeType.removed" : "DocumentChangeType.modified" : "DocumentChangeType.added");
        hashMap.put("data", eVar.f3661b.b());
        j9.i iVar = eVar.f3661b.f3149b;
        iVar.getClass();
        hashMap.put("path", iVar.f8684a.h());
        hashMap.put("oldIndex", Integer.valueOf(eVar.f3662c));
        hashMap.put("newIndex", Integer.valueOf(eVar.f3663d));
        hashMap.put("metadata", eVar.f3661b.f3151d);
        writeValue(byteArrayOutputStream, hashMap);
    }

    private void writeDocumentSnapshot(ByteArrayOutputStream byteArrayOutputStream, com.google.firebase.firestore.d dVar) {
        Map<String, Object> map;
        HashMap hashMap = new HashMap();
        j9.i iVar = dVar.f3149b;
        iVar.getClass();
        hashMap.put("path", iVar.f8684a.h());
        if (dVar.f3150c != null) {
            d.a aVar = FlutterFirebaseFirestorePlugin.serverTimestampBehaviorHashMap.get(Integer.valueOf(dVar.hashCode()));
            map = aVar != null ? dVar.a(aVar) : dVar.b();
        } else {
            map = null;
        }
        hashMap.put("data", map);
        hashMap.put("metadata", dVar.f3151d);
        FlutterFirebaseFirestorePlugin.serverTimestampBehaviorHashMap.remove(Integer.valueOf(dVar.hashCode()));
        writeValue(byteArrayOutputStream, hashMap);
    }

    private void writeLoadBundleTaskProgress(ByteArrayOutputStream byteArrayOutputStream, d0 d0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("bytesLoaded", Long.valueOf(d0Var.f3657c));
        hashMap.put("documentsLoaded", Integer.valueOf(d0Var.f3655a));
        hashMap.put("totalBytes", Long.valueOf(d0Var.f3658d));
        hashMap.put("totalDocuments", Integer.valueOf(d0Var.f3656b));
        int c10 = q0.g.c(d0Var.f3659e);
        hashMap.put("taskState", c10 != 0 ? (c10 == 1 || c10 != 2) ? "running" : "success" : "error");
        writeValue(byteArrayOutputStream, hashMap);
    }

    private void writeQuerySnapshot(ByteArrayOutputStream byteArrayOutputStream, k kVar) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        d.a aVar = FlutterFirebaseFirestorePlugin.serverTimestampBehaviorHashMap.get(Integer.valueOf(kVar.hashCode()));
        Iterator it = kVar.h().iterator();
        while (it.hasNext()) {
            com.google.firebase.firestore.d dVar = (com.google.firebase.firestore.d) it.next();
            j9.i iVar = dVar.f3149b;
            iVar.getClass();
            arrayList.add(iVar.f8684a.h());
            arrayList2.add(aVar != null ? dVar.a(aVar) : dVar.b());
            arrayList3.add(dVar.f3151d);
        }
        hashMap.put("paths", arrayList);
        hashMap.put("documents", arrayList2);
        hashMap.put("metadatas", arrayList3);
        hashMap.put("documentChanges", kVar.a());
        hashMap.put("metadata", kVar.f);
        FlutterFirebaseFirestorePlugin.serverTimestampBehaviorHashMap.remove(Integer.valueOf(kVar.hashCode()));
        writeValue(byteArrayOutputStream, hashMap);
    }

    private void writeSnapshotMetadata(ByteArrayOutputStream byteArrayOutputStream, u0 u0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("hasPendingWrites", Boolean.valueOf(u0Var.f3722a));
        hashMap.put("isFromCache", Boolean.valueOf(u0Var.f3723b));
        writeValue(byteArrayOutputStream, hashMap);
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
        switch (b10) {
            case -76:
                return new Date(byteBuffer.getLong());
            case -75:
                StandardMessageCodec.readAlignment(byteBuffer, 8);
                return new y(byteBuffer.getDouble(), byteBuffer.getDouble());
            case -74:
                return ((FirebaseFirestore) readValue(byteBuffer)).d((String) readValue(byteBuffer));
            case -73:
                byte[] readBytes = StandardMessageCodec.readBytes(byteBuffer);
                x6.b.B(readBytes, "Provided bytes array must not be null.");
                return new d9.c(ma.h.m(readBytes, 0, readBytes.length));
            case -72:
                Object[] array = toArray(readValue(byteBuffer));
                o.c cVar = d9.o.f3694a;
                return new o.b(Arrays.asList(array));
            case -71:
                Object[] array2 = toArray(readValue(byteBuffer));
                o.c cVar2 = d9.o.f3694a;
                return new o.a(Arrays.asList(array2));
            case -70:
                return d9.o.f3694a;
            case -69:
                return d9.o.f3695b;
            case -68:
                return new m(byteBuffer.getInt(), byteBuffer.getLong());
            case -67:
                double doubleValue = ((Number) readValue(byteBuffer)).doubleValue();
                o.c cVar3 = d9.o.f3694a;
                return new o.d(Double.valueOf(doubleValue));
            case -66:
                long intValue = ((Number) readValue(byteBuffer)).intValue();
                o.c cVar4 = d9.o.f3694a;
                return new o.d(Long.valueOf(intValue));
            case -65:
                return n.f3689c;
            case -64:
                int readSize = StandardMessageCodec.readSize(byteBuffer);
                ArrayList arrayList = new ArrayList(readSize);
                for (int i10 = 0; i10 < readSize; i10++) {
                    arrayList.add(readValue(byteBuffer));
                }
                return n.b((String[]) arrayList.toArray(new String[0]));
            case -63:
                return Double.valueOf(Double.NaN);
            case -62:
                return Double.valueOf(Double.POSITIVE_INFINITY);
            case -61:
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            case -60:
                return readFirestoreInstance(byteBuffer);
            case -59:
                return readFirestoreQuery(byteBuffer);
            case -58:
                return readFirestoreSettings(byteBuffer);
            case -57:
                ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
                double[] dArr = new double[arrayList2.size()];
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    Double d10 = (Double) arrayList2.get(i11);
                    Objects.requireNonNull(d10, "Null value at index " + i11);
                    dArr[i11] = d10.doubleValue();
                }
                o.c cVar5 = d9.o.f3694a;
                return new z0(dArr);
            default:
                return super.readValueOfType(b10, byteBuffer);
        }
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i10;
        Object databaseURL;
        if (obj instanceof Date) {
            byteArrayOutputStream.write(-76);
            StandardMessageCodec.writeLong(byteArrayOutputStream, ((Date) obj).getTime());
            return;
        }
        if (obj instanceof m) {
            byteArrayOutputStream.write(-68);
            m mVar = (m) obj;
            StandardMessageCodec.writeLong(byteArrayOutputStream, mVar.f15102a);
            StandardMessageCodec.writeInt(byteArrayOutputStream, mVar.f15103b);
            return;
        }
        if (obj instanceof y) {
            byteArrayOutputStream.write(-75);
            StandardMessageCodec.writeAlignment(byteArrayOutputStream, 8);
            y yVar = (y) obj;
            StandardMessageCodec.writeDouble(byteArrayOutputStream, yVar.f3737a);
            StandardMessageCodec.writeDouble(byteArrayOutputStream, yVar.f3738b);
            return;
        }
        if (obj instanceof z0) {
            byteArrayOutputStream.write(-57);
            databaseURL = (double[]) ((z0) obj).f3740a.clone();
        } else {
            if (!(obj instanceof com.google.firebase.firestore.c)) {
                if (obj instanceof com.google.firebase.firestore.d) {
                    writeDocumentSnapshot(byteArrayOutputStream, (com.google.firebase.firestore.d) obj);
                    return;
                }
                if (obj instanceof k) {
                    writeQuerySnapshot(byteArrayOutputStream, (k) obj);
                    return;
                }
                if (obj instanceof d9.e) {
                    writeDocumentChange(byteArrayOutputStream, (d9.e) obj);
                    return;
                }
                if (obj instanceof d0) {
                    writeLoadBundleTaskProgress(byteArrayOutputStream, (d0) obj);
                    return;
                }
                if (obj instanceof u0) {
                    writeSnapshotMetadata(byteArrayOutputStream, (u0) obj);
                    return;
                }
                if (obj instanceof d9.c) {
                    byteArrayOutputStream.write(-73);
                    StandardMessageCodec.writeBytes(byteArrayOutputStream, ((d9.c) obj).f3646a.z());
                    return;
                }
                if (obj instanceof Double) {
                    Double d10 = (Double) obj;
                    if (Double.isNaN(d10.doubleValue())) {
                        i10 = -63;
                    } else if (d10.equals(Double.valueOf(Double.NEGATIVE_INFINITY))) {
                        i10 = -61;
                    } else if (d10.equals(Double.valueOf(Double.POSITIVE_INFINITY))) {
                        i10 = -62;
                    }
                    byteArrayOutputStream.write(i10);
                    return;
                }
                super.writeValue(byteArrayOutputStream, obj);
                return;
            }
            byteArrayOutputStream.write(-74);
            com.google.firebase.firestore.c cVar = (com.google.firebase.firestore.c) obj;
            FirebaseFirestore firebaseFirestore = cVar.f3147b;
            u7.f fVar = firebaseFirestore.f3134g;
            fVar.a();
            writeValue(byteArrayOutputStream, fVar.f15085b);
            writeValue(byteArrayOutputStream, cVar.c());
            synchronized (FlutterFirebaseFirestorePlugin.firestoreInstanceCache) {
                databaseURL = FlutterFirebaseFirestorePlugin.getCachedFirebaseFirestoreInstanceForKey(firebaseFirestore).getDatabaseURL();
            }
        }
        writeValue(byteArrayOutputStream, databaseURL);
    }
}
