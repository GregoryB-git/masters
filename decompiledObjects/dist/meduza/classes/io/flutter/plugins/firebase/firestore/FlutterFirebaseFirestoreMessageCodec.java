package io.flutter.plugins.firebase.firestore;

import android.util.Log;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.d.a;
import com.google.firebase.firestore.e.a;
import com.google.firebase.firestore.e.b;
import com.google.firebase.firestore.g.a;
import com.google.firebase.firestore.j;
import com.google.firebase.firestore.k;
import d9.d0;
import d9.g0;
import d9.l0;
import d9.n;
import d9.o.a;
import d9.o.b;
import d9.o.d;
import d9.u0;
import d9.x;
import d9.y;
import d9.z0;
import g9.l.a;
import io.flutter.plugin.common.StandardMessageCodec;
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
import ma.h;
import u7.f;
import u7.m;
import x6.b;

class FlutterFirebaseFirestoreMessageCodec
  extends StandardMessageCodec
{
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
  
  private com.google.firebase.firestore.e filterFromJson(Map<String, Object> paramMap)
  {
    boolean bool = paramMap.containsKey("fieldPath");
    int i = 2;
    if (bool)
    {
      localObject1 = (String)paramMap.get("op");
      localObject2 = (n)paramMap.get("fieldPath");
      paramMap = paramMap.get("value");
      localObject1.getClass();
      switch (((String)localObject1).hashCode())
      {
      }
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        i = -1;
                        break;
                      } while (!((String)localObject1).equals("array-contains-any"));
                      i = 9;
                      break;
                    } while (!((String)localObject1).equals("array-contains"));
                    i = 8;
                    break;
                  } while (!((String)localObject1).equals("in"));
                  i = 7;
                  break;
                } while (!((String)localObject1).equals(">="));
                i = 6;
                break;
              } while (!((String)localObject1).equals("=="));
              i = 5;
              break;
            } while (!((String)localObject1).equals("<="));
            i = 4;
            break;
          } while (!((String)localObject1).equals("!="));
          i = 3;
          break;
          if (((String)localObject1).equals(">")) {
            break;
          }
        } while ((goto 152) || (!((String)localObject1).equals("<")));
        i = 1;
        break;
      } while (!((String)localObject1).equals("not-in"));
      i = 0;
      switch (i)
      {
      default: 
        throw new Error("Invalid operator");
      case 9: 
        paramMap = (List)paramMap;
        return new e.b((n)localObject2, l.a.q, paramMap);
      case 8: 
        return new e.b((n)localObject2, l.a.p, paramMap);
      case 7: 
        paramMap = (List)paramMap;
        return new e.b((n)localObject2, l.a.r, paramMap);
      case 6: 
        return new e.b((n)localObject2, l.a.o, paramMap);
      case 5: 
        return new e.b((n)localObject2, l.a.d, paramMap);
      case 4: 
        return new e.b((n)localObject2, l.a.c, paramMap);
      case 3: 
        return new e.b((n)localObject2, l.a.e, paramMap);
      case 2: 
        return new e.b((n)localObject2, l.a.f, paramMap);
      case 1: 
        return new e.b((n)localObject2, l.a.b, paramMap);
      }
      paramMap = (List)paramMap;
      return new e.b((n)localObject2, l.a.s, paramMap);
    }
    Object localObject2 = (String)paramMap.get("op");
    Object localObject1 = (List)paramMap.get("queries");
    paramMap = new ArrayList();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      paramMap.add(filterFromJson((Map)((Iterator)localObject1).next()));
    }
    if (((String)localObject2).equals("OR")) {
      return new e.a(Arrays.asList((com.google.firebase.firestore.e[])paramMap.toArray(new com.google.firebase.firestore.e[0])), 2);
    }
    if (((String)localObject2).equals("AND")) {
      return new e.a(Arrays.asList((com.google.firebase.firestore.e[])paramMap.toArray(new com.google.firebase.firestore.e[0])), 1);
    }
    throw new Error("Invalid operator");
  }
  
  private FirebaseFirestore readFirestoreInstance(ByteBuffer arg1)
  {
    Object localObject1 = (String)readValue(???);
    String str = (String)readValue(???);
    com.google.firebase.firestore.g localg = (com.google.firebase.firestore.g)readValue(???);
    synchronized (FlutterFirebaseFirestorePlugin.firestoreInstanceCache)
    {
      FirebaseFirestore localFirebaseFirestore = FlutterFirebaseFirestorePlugin.getFirestoreInstanceByNameAndDatabaseUrl((String)localObject1, str);
      if (localFirebaseFirestore != null) {
        return localFirebaseFirestore;
      }
      localObject1 = FirebaseFirestore.e(f.f((String)localObject1), str);
      ((FirebaseFirestore)localObject1).g(localg);
      FlutterFirebaseFirestorePlugin.setCachedFirebaseFirestoreInstanceForKey((FirebaseFirestore)localObject1, str);
      return (FirebaseFirestore)localObject1;
    }
  }
  
  private com.google.firebase.firestore.i readFirestoreQuery(ByteBuffer paramByteBuffer)
  {
    try
    {
      paramByteBuffer = (Map)readValue(paramByteBuffer);
      Object localObject1 = paramByteBuffer.get("firestore");
      Objects.requireNonNull(localObject1);
      localObject1 = (FirebaseFirestore)localObject1;
      Object localObject2 = paramByteBuffer.get("path");
      Objects.requireNonNull(localObject2);
      Object localObject3 = (String)localObject2;
      boolean bool = ((Boolean)paramByteBuffer.get("isCollectionGroup")).booleanValue();
      localObject2 = (Map)paramByteBuffer.get("parameters");
      if (bool)
      {
        paramByteBuffer = ((FirebaseFirestore)localObject1).c((String)localObject3);
      }
      else
      {
        k.b();
        paramByteBuffer = new d9.d(j9.o.t((String)localObject3), (FirebaseFirestore)localObject1);
      }
      if (localObject2 == null) {
        return paramByteBuffer;
      }
      bool = ((Map)localObject2).containsKey("filters");
      if (bool) {
        try
        {
          localObject1 = ((Map)localObject2).get("filters");
          Objects.requireNonNull(localObject1);
          localObject1 = (Map)localObject1;
          paramByteBuffer = paramByteBuffer.k(filterFromJson((Map)localObject1));
        }
        catch (Exception paramByteBuffer)
        {
          break label1344;
        }
      }
      localObject1 = ((Map)localObject2).get("where");
      Objects.requireNonNull(localObject1);
      localObject1 = ((List)localObject1).iterator();
      Object localObject4;
      Object localObject5;
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (List)((Iterator)localObject1).next();
        localObject3 = (n)((List)localObject4).get(0);
        localObject5 = (String)((List)localObject4).get(1);
        localObject4 = ((List)localObject4).get(2);
        if ("==".equals(localObject5))
        {
          paramByteBuffer.getClass();
          localObject5 = new com/google/firebase/firestore/e$b;
          ((e.b)localObject5).<init>((n)localObject3, l.a.d, localObject4);
          paramByteBuffer = paramByteBuffer.k((com.google.firebase.firestore.e)localObject5);
        }
        else if ("!=".equals(localObject5))
        {
          paramByteBuffer.getClass();
          localObject5 = new com/google/firebase/firestore/e$b;
          ((e.b)localObject5).<init>((n)localObject3, l.a.e, localObject4);
          paramByteBuffer = paramByteBuffer.k((com.google.firebase.firestore.e)localObject5);
        }
        else if ("<".equals(localObject5))
        {
          paramByteBuffer.getClass();
          localObject5 = new com/google/firebase/firestore/e$b;
          ((e.b)localObject5).<init>((n)localObject3, l.a.b, localObject4);
          paramByteBuffer = paramByteBuffer.k((com.google.firebase.firestore.e)localObject5);
        }
        else if ("<=".equals(localObject5))
        {
          paramByteBuffer.getClass();
          localObject5 = new com/google/firebase/firestore/e$b;
          ((e.b)localObject5).<init>((n)localObject3, l.a.c, localObject4);
          paramByteBuffer = paramByteBuffer.k((com.google.firebase.firestore.e)localObject5);
        }
        else if (">".equals(localObject5))
        {
          paramByteBuffer.getClass();
          localObject5 = new com/google/firebase/firestore/e$b;
          ((e.b)localObject5).<init>((n)localObject3, l.a.f, localObject4);
          paramByteBuffer = paramByteBuffer.k((com.google.firebase.firestore.e)localObject5);
        }
        else if (">=".equals(localObject5))
        {
          paramByteBuffer.getClass();
          localObject5 = new com/google/firebase/firestore/e$b;
          ((e.b)localObject5).<init>((n)localObject3, l.a.o, localObject4);
          paramByteBuffer = paramByteBuffer.k((com.google.firebase.firestore.e)localObject5);
        }
        else if ("array-contains".equals(localObject5))
        {
          paramByteBuffer.getClass();
          localObject5 = new com/google/firebase/firestore/e$b;
          ((e.b)localObject5).<init>((n)localObject3, l.a.p, localObject4);
          paramByteBuffer = paramByteBuffer.k((com.google.firebase.firestore.e)localObject5);
        }
        else if ("array-contains-any".equals(localObject5))
        {
          localObject5 = (List)localObject4;
          paramByteBuffer.getClass();
          localObject4 = new com/google/firebase/firestore/e$b;
          ((e.b)localObject4).<init>((n)localObject3, l.a.q, localObject5);
          paramByteBuffer = paramByteBuffer.k((com.google.firebase.firestore.e)localObject4);
        }
        else if ("in".equals(localObject5))
        {
          localObject5 = (List)localObject4;
          paramByteBuffer.getClass();
          localObject4 = new com/google/firebase/firestore/e$b;
          ((e.b)localObject4).<init>((n)localObject3, l.a.r, localObject5);
          paramByteBuffer = paramByteBuffer.k((com.google.firebase.firestore.e)localObject4);
        }
        else if ("not-in".equals(localObject5))
        {
          localObject5 = (List)localObject4;
          paramByteBuffer.getClass();
          localObject4 = new com/google/firebase/firestore/e$b;
          ((e.b)localObject4).<init>((n)localObject3, l.a.s, localObject5);
          paramByteBuffer = paramByteBuffer.k((com.google.firebase.firestore.e)localObject4);
        }
        else
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append("An invalid query operator ");
          ((StringBuilder)localObject3).append((String)localObject5);
          ((StringBuilder)localObject3).append(" was received but not handled.");
          Log.w("FLTFirestoreMsgCodec", ((StringBuilder)localObject3).toString());
        }
      }
      localObject3 = (Number)((Map)localObject2).get("limit");
      localObject1 = paramByteBuffer;
      if (localObject3 != null) {
        localObject1 = paramByteBuffer.c(((Number)localObject3).longValue());
      }
      localObject3 = (Number)((Map)localObject2).get("limitToLast");
      paramByteBuffer = (ByteBuffer)localObject1;
      if (localObject3 != null) {
        paramByteBuffer = ((com.google.firebase.firestore.i)localObject1).d(((Number)localObject3).longValue());
      }
      localObject1 = (List)((Map)localObject2).get("orderBy");
      if (localObject1 == null) {
        return paramByteBuffer;
      }
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (List)((Iterator)localObject1).next();
        localObject4 = (n)((List)localObject3).get(0);
        int i;
        if (((Boolean)((List)localObject3).get(1)).booleanValue()) {
          i = 2;
        } else {
          i = 1;
        }
        paramByteBuffer = paramByteBuffer.e((n)localObject4, i);
      }
      localObject3 = (List)((Map)localObject2).get("startAt");
      localObject1 = paramByteBuffer;
      if (localObject3 != null)
      {
        localObject1 = ((List)localObject3).toArray();
        Objects.requireNonNull(localObject1);
        localObject3 = paramByteBuffer.a("startAt", true, (Object[])localObject1);
        localObject1 = new com/google/firebase/firestore/i;
        localObject4 = a;
        localObject5 = new g9/f0;
        ((g9.f0)localObject5).<init>(f, g, e, a, h, i, (g9.e)localObject3, k);
        ((com.google.firebase.firestore.i)localObject1).<init>((g9.f0)localObject5, b);
      }
      localObject3 = (List)((Map)localObject2).get("startAfter");
      paramByteBuffer = (ByteBuffer)localObject1;
      if (localObject3 != null)
      {
        paramByteBuffer = ((List)localObject3).toArray();
        Objects.requireNonNull(paramByteBuffer);
        localObject4 = ((com.google.firebase.firestore.i)localObject1).a("startAfter", false, paramByteBuffer);
        paramByteBuffer = new com/google/firebase/firestore/i;
        localObject3 = a;
        localObject5 = new g9/f0;
        ((g9.f0)localObject5).<init>(f, g, e, a, h, i, (g9.e)localObject4, k);
        paramByteBuffer.<init>((g9.f0)localObject5, b);
      }
      localObject3 = (List)((Map)localObject2).get("endAt");
      localObject1 = paramByteBuffer;
      if (localObject3 != null)
      {
        localObject1 = ((List)localObject3).toArray();
        Objects.requireNonNull(localObject1);
        localObject4 = paramByteBuffer.a("endAt", true, (Object[])localObject1);
        localObject1 = new com/google/firebase/firestore/i;
        localObject3 = a;
        localObject5 = new g9/f0;
        ((g9.f0)localObject5).<init>(f, g, e, a, h, i, j, (g9.e)localObject4);
        ((com.google.firebase.firestore.i)localObject1).<init>((g9.f0)localObject5, b);
      }
      localObject2 = (List)((Map)localObject2).get("endBefore");
      paramByteBuffer = (ByteBuffer)localObject1;
      if (localObject2 != null)
      {
        paramByteBuffer = ((List)localObject2).toArray();
        Objects.requireNonNull(paramByteBuffer);
        paramByteBuffer = ((com.google.firebase.firestore.i)localObject1).a("endBefore", false, paramByteBuffer);
        localObject2 = a;
        localObject3 = new g9/f0;
        ((g9.f0)localObject3).<init>(f, g, e, a, h, i, j, paramByteBuffer);
        paramByteBuffer = new com.google.firebase.firestore.i((g9.f0)localObject3, b);
      }
      return paramByteBuffer;
    }
    catch (Exception paramByteBuffer)
    {
      label1344:
      Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", paramByteBuffer);
    }
    return null;
  }
  
  private com.google.firebase.firestore.g readFirestoreSettings(ByteBuffer paramByteBuffer)
  {
    Map localMap = (Map)readValue(paramByteBuffer);
    g.a locala = new g.a();
    if (localMap.get("persistenceEnabled") != null)
    {
      paramByteBuffer = (Boolean)localMap.get("persistenceEnabled");
      if (Boolean.TRUE.equals(paramByteBuffer))
      {
        paramByteBuffer = localMap.get("cacheSizeBytes");
        long l = 104857600L;
        if (paramByteBuffer != null)
        {
          paramByteBuffer = Long.valueOf(104857600L);
          Object localObject = localMap.get("cacheSizeBytes");
          if ((localObject instanceof Long)) {
            paramByteBuffer = (Long)localObject;
          } else if ((localObject instanceof Integer)) {
            paramByteBuffer = Long.valueOf(((Integer)localObject).intValue());
          }
          if (paramByteBuffer.longValue() == -1L) {
            l = -1L;
          } else {
            l = paramByteBuffer.longValue();
          }
        }
        paramByteBuffer = new l0(l);
      }
      else
      {
        paramByteBuffer = new d9.f0(new g0());
      }
      locala.b(paramByteBuffer);
    }
    if (localMap.get("host") != null)
    {
      paramByteBuffer = localMap.get("host");
      Objects.requireNonNull(paramByteBuffer);
      a = ((String)paramByteBuffer);
      if (localMap.get("sslEnabled") != null)
      {
        paramByteBuffer = localMap.get("sslEnabled");
        Objects.requireNonNull(paramByteBuffer);
        b = ((Boolean)paramByteBuffer).booleanValue();
      }
    }
    return locala.a();
  }
  
  private Object[] toArray(Object paramObject)
  {
    if ((paramObject instanceof List)) {
      return ((List)paramObject).toArray();
    }
    if (paramObject == null) {
      return new ArrayList().toArray();
    }
    throw new IllegalArgumentException(String.format("java.util.List was expected, unable to convert '%s' to an object array", new Object[] { paramObject.getClass().getCanonicalName() }));
  }
  
  private void writeDocumentChange(ByteArrayOutputStream paramByteArrayOutputStream, d9.e parame)
  {
    HashMap localHashMap = new HashMap();
    int i = a.ordinal();
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          localObject = null;
        } else {
          localObject = "DocumentChangeType.removed";
        }
      }
      else {
        localObject = "DocumentChangeType.modified";
      }
    }
    else {
      localObject = "DocumentChangeType.added";
    }
    localHashMap.put("type", localObject);
    localHashMap.put("data", b.b());
    Object localObject = b.b;
    localObject.getClass();
    localHashMap.put("path", a.h());
    localHashMap.put("oldIndex", Integer.valueOf(c));
    localHashMap.put("newIndex", Integer.valueOf(d));
    localHashMap.put("metadata", b.d);
    writeValue(paramByteArrayOutputStream, localHashMap);
  }
  
  private void writeDocumentSnapshot(ByteArrayOutputStream paramByteArrayOutputStream, com.google.firebase.firestore.d paramd)
  {
    HashMap localHashMap = new HashMap();
    Object localObject = b;
    localObject.getClass();
    localHashMap.put("path", a.h());
    int i;
    if (c != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localObject = (d.a)FlutterFirebaseFirestorePlugin.serverTimestampBehaviorHashMap.get(Integer.valueOf(paramd.hashCode()));
      if (localObject != null) {
        localObject = paramd.a((d.a)localObject);
      } else {
        localObject = paramd.b();
      }
    }
    else
    {
      localObject = null;
    }
    localHashMap.put("data", localObject);
    localHashMap.put("metadata", d);
    FlutterFirebaseFirestorePlugin.serverTimestampBehaviorHashMap.remove(Integer.valueOf(paramd.hashCode()));
    writeValue(paramByteArrayOutputStream, localHashMap);
  }
  
  private void writeLoadBundleTaskProgress(ByteArrayOutputStream paramByteArrayOutputStream, d0 paramd0)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("bytesLoaded", Long.valueOf(c));
    localHashMap.put("documentsLoaded", Integer.valueOf(a));
    localHashMap.put("totalBytes", Long.valueOf(d));
    localHashMap.put("totalDocuments", Integer.valueOf(b));
    int i = q0.g.c(e);
    if (i != 0)
    {
      if ((i != 1) && (i == 2)) {
        paramd0 = "success";
      } else {
        paramd0 = "running";
      }
    }
    else {
      paramd0 = "error";
    }
    localHashMap.put("taskState", paramd0);
    writeValue(paramByteArrayOutputStream, localHashMap);
  }
  
  private void writeQuerySnapshot(ByteArrayOutputStream paramByteArrayOutputStream, k paramk)
  {
    ArrayList localArrayList1 = new ArrayList();
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    d.a locala = (d.a)FlutterFirebaseFirestorePlugin.serverTimestampBehaviorHashMap.get(Integer.valueOf(paramk.hashCode()));
    Iterator localIterator = paramk.h().iterator();
    while (localIterator.hasNext())
    {
      com.google.firebase.firestore.d locald = (com.google.firebase.firestore.d)localIterator.next();
      Object localObject = b;
      localObject.getClass();
      localArrayList1.add(a.h());
      if (locala != null) {
        localObject = locald.a(locala);
      } else {
        localObject = locald.b();
      }
      localArrayList2.add(localObject);
      localArrayList3.add(d);
    }
    localHashMap.put("paths", localArrayList1);
    localHashMap.put("documents", localArrayList2);
    localHashMap.put("metadatas", localArrayList3);
    localHashMap.put("documentChanges", paramk.a());
    localHashMap.put("metadata", f);
    FlutterFirebaseFirestorePlugin.serverTimestampBehaviorHashMap.remove(Integer.valueOf(paramk.hashCode()));
    writeValue(paramByteArrayOutputStream, localHashMap);
  }
  
  private void writeSnapshotMetadata(ByteArrayOutputStream paramByteArrayOutputStream, u0 paramu0)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("hasPendingWrites", Boolean.valueOf(a));
    localHashMap.put("isFromCache", Boolean.valueOf(b));
    writeValue(paramByteArrayOutputStream, localHashMap);
  }
  
  public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
  {
    int i = 0;
    Object localObject;
    long l;
    switch (paramByte)
    {
    default: 
      return super.readValueOfType(paramByte, paramByteBuffer);
    case -57: 
      localObject = (ArrayList)readValue(paramByteBuffer);
      paramByteBuffer = new double[((ArrayList)localObject).size()];
      while (i < ((ArrayList)localObject).size())
      {
        Double localDouble = (Double)((ArrayList)localObject).get(i);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Null value at index ");
        localStringBuilder.append(i);
        Objects.requireNonNull(localDouble, localStringBuilder.toString());
        paramByteBuffer[i] = localDouble.doubleValue();
        i++;
      }
      localObject = d9.o.a;
      return new z0(paramByteBuffer);
    case -58: 
      return readFirestoreSettings(paramByteBuffer);
    case -59: 
      return readFirestoreQuery(paramByteBuffer);
    case -60: 
      return readFirestoreInstance(paramByteBuffer);
    case -61: 
      return Double.valueOf(Double.NEGATIVE_INFINITY);
    case -62: 
      return Double.valueOf(Double.POSITIVE_INFINITY);
    case -63: 
      return Double.valueOf(NaN.0D);
    case -64: 
      int j = StandardMessageCodec.readSize(paramByteBuffer);
      localObject = new ArrayList(j);
      for (i = 0; i < j; i++) {
        ((ArrayList)localObject).add(readValue(paramByteBuffer));
      }
      return n.b((String[])((ArrayList)localObject).toArray(new String[0]));
    case -65: 
      return n.c;
    case -66: 
      l = ((Number)readValue(paramByteBuffer)).intValue();
      paramByteBuffer = d9.o.a;
      return new o.d(Long.valueOf(l));
    case -67: 
      double d = ((Number)readValue(paramByteBuffer)).doubleValue();
      paramByteBuffer = d9.o.a;
      return new o.d(Double.valueOf(d));
    case -68: 
      l = paramByteBuffer.getLong();
      return new m(paramByteBuffer.getInt(), l);
    case -69: 
      return d9.o.b;
    case -70: 
      return d9.o.a;
    case -71: 
      localObject = toArray(readValue(paramByteBuffer));
      paramByteBuffer = d9.o.a;
      return new o.a(Arrays.asList((Object[])localObject));
    case -72: 
      paramByteBuffer = toArray(readValue(paramByteBuffer));
      localObject = d9.o.a;
      return new o.b(Arrays.asList(paramByteBuffer));
    case -73: 
      paramByteBuffer = StandardMessageCodec.readBytes(paramByteBuffer);
      b.B(paramByteBuffer, "Provided bytes array must not be null.");
      return new d9.c(h.m(paramByteBuffer, 0, paramByteBuffer.length));
    case -74: 
      return ((FirebaseFirestore)readValue(paramByteBuffer)).d((String)readValue(paramByteBuffer));
    case -75: 
      StandardMessageCodec.readAlignment(paramByteBuffer, 8);
      return new y(paramByteBuffer.getDouble(), paramByteBuffer.getDouble());
    }
    return new Date(paramByteBuffer.getLong());
  }
  
  public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
  {
    if ((paramObject instanceof Date))
    {
      paramByteArrayOutputStream.write(-76);
      StandardMessageCodec.writeLong(paramByteArrayOutputStream, ((Date)paramObject).getTime());
    }
    else if ((paramObject instanceof m))
    {
      paramByteArrayOutputStream.write(-68);
      paramObject = (m)paramObject;
      StandardMessageCodec.writeLong(paramByteArrayOutputStream, a);
      StandardMessageCodec.writeInt(paramByteArrayOutputStream, b);
    }
    else if ((paramObject instanceof y))
    {
      paramByteArrayOutputStream.write(-75);
      StandardMessageCodec.writeAlignment(paramByteArrayOutputStream, 8);
      paramObject = (y)paramObject;
      StandardMessageCodec.writeDouble(paramByteArrayOutputStream, a);
      StandardMessageCodec.writeDouble(paramByteArrayOutputStream, b);
    }
    else
    {
      if ((paramObject instanceof z0))
      {
        paramByteArrayOutputStream.write(-57);
        paramObject = (double[])a.clone();
      }
      for (;;)
      {
        writeValue(paramByteArrayOutputStream, paramObject);
        return;
        if ((paramObject instanceof com.google.firebase.firestore.c))
        {
          paramByteArrayOutputStream.write(-74);
          ??? = (com.google.firebase.firestore.c)paramObject;
          paramObject = b;
          f localf = g;
          localf.a();
          writeValue(paramByteArrayOutputStream, b);
          writeValue(paramByteArrayOutputStream, ((com.google.firebase.firestore.c)???).c());
          synchronized (FlutterFirebaseFirestorePlugin.firestoreInstanceCache)
          {
            paramObject = FlutterFirebaseFirestorePlugin.getCachedFirebaseFirestoreInstanceForKey((FirebaseFirestore)paramObject).getDatabaseURL();
          }
        }
      }
      if ((paramObject instanceof com.google.firebase.firestore.d))
      {
        writeDocumentSnapshot(paramByteArrayOutputStream, (com.google.firebase.firestore.d)paramObject);
      }
      else if ((paramObject instanceof k))
      {
        writeQuerySnapshot(paramByteArrayOutputStream, (k)paramObject);
      }
      else if ((paramObject instanceof d9.e))
      {
        writeDocumentChange(paramByteArrayOutputStream, (d9.e)paramObject);
      }
      else if ((paramObject instanceof d0))
      {
        writeLoadBundleTaskProgress(paramByteArrayOutputStream, (d0)paramObject);
      }
      else if ((paramObject instanceof u0))
      {
        writeSnapshotMetadata(paramByteArrayOutputStream, (u0)paramObject);
      }
      else if ((paramObject instanceof d9.c))
      {
        paramByteArrayOutputStream.write(-73);
        StandardMessageCodec.writeBytes(paramByteArrayOutputStream, a.z());
      }
      else
      {
        if ((paramObject instanceof Double))
        {
          ??? = (Double)paramObject;
          int i;
          if (Double.isNaN(((Double)???).doubleValue())) {
            i = -63;
          }
          for (;;)
          {
            paramByteArrayOutputStream.write(i);
            return;
            if (((Double)???).equals(Double.valueOf(Double.NEGATIVE_INFINITY)))
            {
              i = -61;
            }
            else
            {
              if (!((Double)???).equals(Double.valueOf(Double.POSITIVE_INFINITY))) {
                break;
              }
              i = -62;
            }
          }
        }
        super.writeValue(paramByteArrayOutputStream, paramObject);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreMessageCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */