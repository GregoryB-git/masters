package io.flutter.plugins.firebase.firestore.utils;

import android.util.Log;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.d.a;
import com.google.firebase.firestore.e.b;
import com.google.firebase.firestore.k;
import d9.a0;
import d9.b;
import d9.n;
import d9.u0;
import d9.v0;
import d9.x;
import g9.f0;
import g9.l.a;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.AggregateSource;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.DocumentChangeType;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.ListenSource;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonDocumentChange;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonDocumentChange.Builder;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot.Builder;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonQueryParameters;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot.Builder;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata.Builder;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.Source;
import j9.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PigeonParser
{
  private static com.google.firebase.firestore.e filterFromJson(Map<String, Object> paramMap)
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
        } while ((goto 148) || (!((String)localObject1).equals("<")));
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
      return new com.google.firebase.firestore.e.a(Arrays.asList((com.google.firebase.firestore.e[])paramMap.toArray(new com.google.firebase.firestore.e[0])), 2);
    }
    if (((String)localObject2).equals("AND")) {
      return new com.google.firebase.firestore.e.a(Arrays.asList((com.google.firebase.firestore.e[])paramMap.toArray(new com.google.firebase.firestore.e[0])), 1);
    }
    throw new Error("Invalid operator");
  }
  
  public static b parseAggregateSource(GeneratedAndroidFirebaseFirestore.AggregateSource paramAggregateSource)
  {
    if (1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$AggregateSource[paramAggregateSource.ordinal()] == 1) {
      return b.a;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unknown AggregateSource value: ");
    localStringBuilder.append(paramAggregateSource);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static List<n> parseFieldPath(List<List<String>> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(n.b((String[])((List)paramList.next()).toArray(new String[0])));
    }
    return localArrayList;
  }
  
  public static a0 parseListenSource(GeneratedAndroidFirebaseFirestore.ListenSource paramListenSource)
  {
    int i = 1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$ListenSource[paramListenSource.ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        return a0.b;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown ListenSource value: ");
      localStringBuilder.append(paramListenSource);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    return a0.a;
  }
  
  public static d.a parsePigeonServerTimestampBehavior(GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior paramServerTimestampBehavior)
  {
    Object localObject = d.a.a;
    if (paramServerTimestampBehavior == null) {
      return (d.a)localObject;
    }
    int i = 1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$ServerTimestampBehavior[paramServerTimestampBehavior.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return d.a.c;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unknown server timestamp behavior: ");
        ((StringBuilder)localObject).append(paramServerTimestampBehavior);
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
      return d.a.b;
    }
    return (d.a)localObject;
  }
  
  public static v0 parsePigeonSource(GeneratedAndroidFirebaseFirestore.Source paramSource)
  {
    int i = 1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$Source[paramSource.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return v0.b;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unknown source: ");
        localStringBuilder.append(paramSource);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      return v0.a;
    }
    return v0.c;
  }
  
  public static com.google.firebase.firestore.i parseQuery(FirebaseFirestore paramFirebaseFirestore, String paramString, boolean paramBoolean, GeneratedAndroidFirebaseFirestore.PigeonQueryParameters paramPigeonQueryParameters)
  {
    if (paramBoolean)
    {
      try
      {
        paramString = paramFirebaseFirestore.c(paramString);
      }
      catch (Exception paramFirebaseFirestore)
      {
        break label1204;
      }
    }
    else
    {
      if (paramString == null) {
        break label1186;
      }
      k.b();
      paramString = new d9.d(o.t(paramString), paramFirebaseFirestore);
    }
    if (paramPigeonQueryParameters == null) {
      return paramString;
    }
    int i;
    if (paramPigeonQueryParameters.getFilters() != null) {
      i = 1;
    } else {
      i = 0;
    }
    paramFirebaseFirestore = paramString;
    if (i != 0) {
      paramFirebaseFirestore = paramString.k(filterFromJson(paramPigeonQueryParameters.getFilters()));
    }
    paramString = paramPigeonQueryParameters.getWhere();
    Objects.requireNonNull(paramString);
    paramString = paramString.iterator();
    Object localObject1;
    Object localObject3;
    while (paramString.hasNext())
    {
      localObject1 = (List)paramString.next();
      localObject2 = (n)((List)localObject1).get(0);
      localObject3 = (String)((List)localObject1).get(1);
      localObject1 = ((List)localObject1).get(2);
      if ("==".equals(localObject3))
      {
        paramFirebaseFirestore.getClass();
        localObject3 = new com/google/firebase/firestore/e$b;
        ((e.b)localObject3).<init>((n)localObject2, l.a.d, localObject1);
        paramFirebaseFirestore = paramFirebaseFirestore.k((com.google.firebase.firestore.e)localObject3);
      }
      else if ("!=".equals(localObject3))
      {
        paramFirebaseFirestore.getClass();
        localObject3 = new com/google/firebase/firestore/e$b;
        ((e.b)localObject3).<init>((n)localObject2, l.a.e, localObject1);
        paramFirebaseFirestore = paramFirebaseFirestore.k((com.google.firebase.firestore.e)localObject3);
      }
      else if ("<".equals(localObject3))
      {
        paramFirebaseFirestore.getClass();
        localObject3 = new com/google/firebase/firestore/e$b;
        ((e.b)localObject3).<init>((n)localObject2, l.a.b, localObject1);
        paramFirebaseFirestore = paramFirebaseFirestore.k((com.google.firebase.firestore.e)localObject3);
      }
      else if ("<=".equals(localObject3))
      {
        paramFirebaseFirestore.getClass();
        localObject3 = new com/google/firebase/firestore/e$b;
        ((e.b)localObject3).<init>((n)localObject2, l.a.c, localObject1);
        paramFirebaseFirestore = paramFirebaseFirestore.k((com.google.firebase.firestore.e)localObject3);
      }
      else if (">".equals(localObject3))
      {
        paramFirebaseFirestore.getClass();
        localObject3 = new com/google/firebase/firestore/e$b;
        ((e.b)localObject3).<init>((n)localObject2, l.a.f, localObject1);
        paramFirebaseFirestore = paramFirebaseFirestore.k((com.google.firebase.firestore.e)localObject3);
      }
      else if (">=".equals(localObject3))
      {
        paramFirebaseFirestore.getClass();
        localObject3 = new com/google/firebase/firestore/e$b;
        ((e.b)localObject3).<init>((n)localObject2, l.a.o, localObject1);
        paramFirebaseFirestore = paramFirebaseFirestore.k((com.google.firebase.firestore.e)localObject3);
      }
      else if ("array-contains".equals(localObject3))
      {
        paramFirebaseFirestore.getClass();
        localObject3 = new com/google/firebase/firestore/e$b;
        ((e.b)localObject3).<init>((n)localObject2, l.a.p, localObject1);
        paramFirebaseFirestore = paramFirebaseFirestore.k((com.google.firebase.firestore.e)localObject3);
      }
      else if ("array-contains-any".equals(localObject3))
      {
        localObject3 = (List)localObject1;
        paramFirebaseFirestore.getClass();
        localObject1 = new com/google/firebase/firestore/e$b;
        ((e.b)localObject1).<init>((n)localObject2, l.a.q, localObject3);
        paramFirebaseFirestore = paramFirebaseFirestore.k((com.google.firebase.firestore.e)localObject1);
      }
      else if ("in".equals(localObject3))
      {
        localObject1 = (List)localObject1;
        paramFirebaseFirestore.getClass();
        localObject3 = new com/google/firebase/firestore/e$b;
        ((e.b)localObject3).<init>((n)localObject2, l.a.r, localObject1);
        paramFirebaseFirestore = paramFirebaseFirestore.k((com.google.firebase.firestore.e)localObject3);
      }
      else if ("not-in".equals(localObject3))
      {
        localObject3 = (List)localObject1;
        paramFirebaseFirestore.getClass();
        localObject1 = new com/google/firebase/firestore/e$b;
        ((e.b)localObject1).<init>((n)localObject2, l.a.s, localObject3);
        paramFirebaseFirestore = paramFirebaseFirestore.k((com.google.firebase.firestore.e)localObject1);
      }
      else
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("An invalid query operator ");
        ((StringBuilder)localObject2).append((String)localObject3);
        ((StringBuilder)localObject2).append(" was received but not handled.");
        Log.w("FLTFirestoreMsgCodec", ((StringBuilder)localObject2).toString());
      }
    }
    Object localObject2 = paramPigeonQueryParameters.getLimit();
    paramString = paramFirebaseFirestore;
    if (localObject2 != null) {
      paramString = paramFirebaseFirestore.c(((Number)localObject2).longValue());
    }
    localObject2 = paramPigeonQueryParameters.getLimitToLast();
    paramFirebaseFirestore = paramString;
    if (localObject2 != null) {
      paramFirebaseFirestore = paramString.d(((Number)localObject2).longValue());
    }
    paramString = paramPigeonQueryParameters.getOrderBy();
    if (paramString == null) {
      return paramFirebaseFirestore;
    }
    paramString = paramString.iterator();
    while (paramString.hasNext())
    {
      localObject2 = (List)paramString.next();
      localObject1 = (n)((List)localObject2).get(0);
      if (((Boolean)((List)localObject2).get(1)).booleanValue()) {
        i = 2;
      } else {
        i = 1;
      }
      paramFirebaseFirestore = paramFirebaseFirestore.e((n)localObject1, i);
    }
    localObject2 = paramPigeonQueryParameters.getStartAt();
    paramString = paramFirebaseFirestore;
    if (localObject2 != null)
    {
      paramString = ((List)localObject2).toArray();
      Objects.requireNonNull(paramString);
      localObject1 = paramFirebaseFirestore.a("startAt", true, paramString);
      paramString = new com/google/firebase/firestore/i;
      localObject2 = a;
      localObject3 = new g9/f0;
      ((f0)localObject3).<init>(f, g, e, a, h, i, (g9.e)localObject1, k);
      paramString.<init>((f0)localObject3, b);
    }
    localObject2 = paramPigeonQueryParameters.getStartAfter();
    paramFirebaseFirestore = paramString;
    if (localObject2 != null)
    {
      paramFirebaseFirestore = ((List)localObject2).toArray();
      Objects.requireNonNull(paramFirebaseFirestore);
      localObject2 = paramString.a("startAfter", false, paramFirebaseFirestore);
      paramFirebaseFirestore = new com/google/firebase/firestore/i;
      localObject1 = a;
      localObject3 = new g9/f0;
      ((f0)localObject3).<init>(f, g, e, a, h, i, (g9.e)localObject2, k);
      paramFirebaseFirestore.<init>((f0)localObject3, b);
    }
    localObject2 = paramPigeonQueryParameters.getEndAt();
    paramString = paramFirebaseFirestore;
    if (localObject2 != null)
    {
      paramString = ((List)localObject2).toArray();
      Objects.requireNonNull(paramString);
      localObject2 = paramFirebaseFirestore.a("endAt", true, paramString);
      paramString = new com/google/firebase/firestore/i;
      localObject3 = a;
      localObject1 = new g9/f0;
      ((f0)localObject1).<init>(f, g, e, a, h, i, j, (g9.e)localObject2);
      paramString.<init>((f0)localObject1, b);
    }
    paramPigeonQueryParameters = paramPigeonQueryParameters.getEndBefore();
    paramFirebaseFirestore = paramString;
    if (paramPigeonQueryParameters != null)
    {
      paramFirebaseFirestore = paramPigeonQueryParameters.toArray();
      Objects.requireNonNull(paramFirebaseFirestore);
      localObject2 = paramString.a("endBefore", false, paramFirebaseFirestore);
      paramFirebaseFirestore = a;
      paramPigeonQueryParameters = new g9/f0;
      paramPigeonQueryParameters.<init>(f, g, e, a, h, paramFirebaseFirestore.i, j, (g9.e)localObject2);
      paramFirebaseFirestore = new com.google.firebase.firestore.i(paramPigeonQueryParameters, b);
    }
    return paramFirebaseFirestore;
    label1186:
    paramFirebaseFirestore.getClass();
    paramFirebaseFirestore = new java/lang/NullPointerException;
    paramFirebaseFirestore.<init>("Provided collection path must not be null.");
    throw paramFirebaseFirestore;
    label1204:
    Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", paramFirebaseFirestore);
    return null;
  }
  
  public static GeneratedAndroidFirebaseFirestore.PigeonDocumentChange toPigeonDocumentChange(d9.e parame, d.a parama)
  {
    GeneratedAndroidFirebaseFirestore.PigeonDocumentChange.Builder localBuilder = new GeneratedAndroidFirebaseFirestore.PigeonDocumentChange.Builder();
    localBuilder.setType(toPigeonDocumentChangeType(a));
    localBuilder.setOldIndex(Long.valueOf(c));
    localBuilder.setNewIndex(Long.valueOf(d));
    localBuilder.setDocument(toPigeonDocumentSnapshot(b, parama));
    return localBuilder.build();
  }
  
  public static GeneratedAndroidFirebaseFirestore.DocumentChangeType toPigeonDocumentChangeType(d9.e.a parama)
  {
    int i = 1.$SwitchMap$com$google$firebase$firestore$DocumentChange$Type[parama.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return GeneratedAndroidFirebaseFirestore.DocumentChangeType.REMOVED;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unknown change type: ");
        localStringBuilder.append(parama);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      return GeneratedAndroidFirebaseFirestore.DocumentChangeType.MODIFIED;
    }
    return GeneratedAndroidFirebaseFirestore.DocumentChangeType.ADDED;
  }
  
  public static List<GeneratedAndroidFirebaseFirestore.PigeonDocumentChange> toPigeonDocumentChanges(List<d9.e> paramList, d.a parama)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(toPigeonDocumentChange((d9.e)paramList.next(), parama));
    }
    return localArrayList;
  }
  
  public static GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot toPigeonDocumentSnapshot(com.google.firebase.firestore.d paramd, d.a parama)
  {
    GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot.Builder localBuilder = new GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot.Builder();
    localBuilder.setMetadata(toPigeonSnapshotMetadata(d));
    localBuilder.setData(paramd.a(parama));
    paramd = b;
    paramd.getClass();
    localBuilder.setPath(a.h());
    return localBuilder.build();
  }
  
  public static List<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> toPigeonDocumentSnapshots(List<com.google.firebase.firestore.d> paramList, d.a parama)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(toPigeonDocumentSnapshot((com.google.firebase.firestore.d)paramList.next(), parama));
    }
    return localArrayList;
  }
  
  public static GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot toPigeonQuerySnapshot(k paramk, d.a parama)
  {
    GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot.Builder localBuilder = new GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot.Builder();
    localBuilder.setMetadata(toPigeonSnapshotMetadata(f));
    localBuilder.setDocumentChanges(toPigeonDocumentChanges(paramk.a(), parama));
    localBuilder.setDocuments(toPigeonDocumentSnapshots(paramk.h(), parama));
    return localBuilder.build();
  }
  
  public static GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata toPigeonSnapshotMetadata(u0 paramu0)
  {
    GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata.Builder localBuilder = new GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata.Builder();
    localBuilder.setHasPendingWrites(Boolean.valueOf(a));
    localBuilder.setIsFromCache(Boolean.valueOf(b));
    return localBuilder.build();
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.utils.PigeonParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */