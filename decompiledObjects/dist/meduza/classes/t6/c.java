package t6;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Base64;
import android.util.SparseArray;
import b.z;
import f;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import m6.j;
import n6.b.a;
import v6.d;

public final class c
  extends b
{
  public static final Parcelable.Creator<c> CREATOR = new k();
  public final int a;
  public final Parcel b;
  public final int c;
  public final h d;
  public final String e;
  public int f;
  public int o;
  
  public c(int paramInt, Parcel paramParcel, h paramh)
  {
    a = paramInt;
    j.i(paramParcel);
    b = paramParcel;
    c = 2;
    d = paramh;
    if (paramh == null) {
      paramParcel = null;
    } else {
      paramParcel = c;
    }
    e = paramParcel;
    f = 2;
  }
  
  public static void c(StringBuilder paramStringBuilder, Map paramMap, Parcel paramParcel)
  {
    SparseArray localSparseArray = new SparseArray();
    paramMap = paramMap.entrySet().iterator();
    Object localObject1;
    while (paramMap.hasNext())
    {
      localObject1 = (Map.Entry)paramMap.next();
      localSparseArray.put(getValueo, localObject1);
    }
    paramStringBuilder.append('{');
    int i = n6.b.u(paramParcel);
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      localObject1 = (Map.Entry)localSparseArray.get((char)k);
      if (localObject1 != null)
      {
        if (j != 0) {
          paramStringBuilder.append(",");
        }
        paramMap = (String)((Map.Entry)localObject1).getKey();
        a.a locala = (a.a)((Map.Entry)localObject1).getValue();
        paramStringBuilder.append("\"");
        paramStringBuilder.append(paramMap);
        paramStringBuilder.append("\":");
        if (s != null) {
          j = 1;
        } else {
          j = 0;
        }
        Object localObject2 = null;
        String str = null;
        Bundle localBundle = null;
        Object localObject3 = null;
        Object localObject4 = null;
        Object localObject5 = null;
        Object localObject6 = null;
        Object localObject7 = null;
        Object localObject8 = null;
        paramMap = null;
        Object localObject9 = null;
        localObject1 = null;
        if (j != 0)
        {
          j = d;
          switch (j)
          {
          default: 
            throw new IllegalArgumentException(f.h("Unknown field out type = ", j));
          case 11: 
            throw new IllegalArgumentException("Method does not accept concrete type.");
          case 10: 
            localBundle = n6.b.b(k, paramParcel);
            localObject1 = new HashMap();
            localObject2 = localBundle.keySet().iterator();
            while (((Iterator)localObject2).hasNext())
            {
              str = (String)((Iterator)localObject2).next();
              paramMap = localBundle.getString(str);
              j.i(paramMap);
              ((HashMap)localObject1).put(str, paramMap);
            }
            paramMap = a.zaD(locala, localObject1);
            break;
          case 8: 
          case 9: 
            paramMap = a.zaD(locala, n6.b.c(k, paramParcel));
            break;
          case 7: 
            paramMap = n6.b.f(k, paramParcel);
            break;
          case 6: 
            paramMap = Boolean.valueOf(n6.b.k(k, paramParcel));
            break;
          case 5: 
            paramMap = n6.b.a(k, paramParcel);
            break;
          case 4: 
            n6.b.w(paramParcel, k, 8);
            paramMap = Double.valueOf(paramParcel.readDouble());
            break;
          case 3: 
            n6.b.w(paramParcel, k, 4);
            paramMap = Float.valueOf(paramParcel.readFloat());
            break;
          case 2: 
            paramMap = Long.valueOf(n6.b.q(k, paramParcel));
            break;
          case 1: 
            k = n6.b.s(k, paramParcel);
            j = paramParcel.dataPosition();
            if (k == 0)
            {
              paramMap = (Map)localObject1;
            }
            else
            {
              paramMap = paramParcel.createByteArray();
              paramParcel.setDataPosition(j + k);
              paramMap = new BigInteger(paramMap);
            }
            break;
          case 0: 
            paramMap = Integer.valueOf(n6.b.o(k, paramParcel));
          }
          paramMap = a.zaD(locala, paramMap);
          e(paramStringBuilder, locala, paramMap);
        }
        else
        {
          if (e)
          {
            paramStringBuilder.append("[");
            int m;
            int n;
            int i1;
            switch (d)
            {
            default: 
              throw new IllegalStateException("Unknown field type out.");
            case 11: 
              m = n6.b.s(k, paramParcel);
              n = paramParcel.dataPosition();
              if (m == 0)
              {
                paramMap = (Map)localObject2;
              }
              else
              {
                k = paramParcel.readInt();
                paramMap = new Parcel[k];
                for (j = 0; j < k; j++)
                {
                  i1 = paramParcel.readInt();
                  if (i1 != 0)
                  {
                    int i2 = paramParcel.dataPosition();
                    localObject1 = Parcel.obtain();
                    ((Parcel)localObject1).appendFrom(paramParcel, i2, i1);
                    paramMap[j] = localObject1;
                    paramParcel.setDataPosition(i2 + i1);
                  }
                  else
                  {
                    paramMap[j] = null;
                  }
                }
                paramParcel.setDataPosition(n + m);
              }
              k = paramMap.length;
              j = 0;
            }
            while (j < k)
            {
              if (j > 0) {
                paramStringBuilder.append(",");
              }
              paramMap[j].setDataPosition(0);
              j.i(q);
              j.i(r);
              localObject2 = r;
              localObject1 = q;
              localObject1 = (Map)b.get(localObject1);
              j.i(localObject1);
              c(paramStringBuilder, (Map)localObject1, paramMap[j]);
              j++;
              continue;
              throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
              j = n6.b.s(k, paramParcel);
              k = paramParcel.dataPosition();
              if (j == 0)
              {
                paramMap = str;
              }
              else
              {
                paramMap = paramParcel.createStringArray();
                paramParcel.setDataPosition(k + j);
              }
              k = paramMap.length;
              j = 0;
              while (j < k)
              {
                if (j != 0) {
                  paramStringBuilder.append(",");
                }
                paramStringBuilder.append("\"");
                paramStringBuilder.append(paramMap[j]);
                paramStringBuilder.append("\"");
                j++;
                continue;
                k = n6.b.s(k, paramParcel);
                j = paramParcel.dataPosition();
                if (k == 0)
                {
                  paramMap = localBundle;
                }
                else
                {
                  paramMap = paramParcel.createBooleanArray();
                  paramParcel.setDataPosition(j + k);
                }
                k = paramMap.length;
                j = 0;
                while (j < k)
                {
                  if (j != 0) {
                    paramStringBuilder.append(",");
                  }
                  paramStringBuilder.append(paramMap[j]);
                  j++;
                  continue;
                  k = n6.b.s(k, paramParcel);
                  n = paramParcel.dataPosition();
                  if (k == 0)
                  {
                    paramMap = (Map)localObject3;
                  }
                  else
                  {
                    m = paramParcel.readInt();
                    paramMap = new BigDecimal[m];
                    for (j = 0; j < m; j++)
                    {
                      localObject1 = paramParcel.createByteArray();
                      i1 = paramParcel.readInt();
                      paramMap[j] = new BigDecimal(new BigInteger((byte[])localObject1), i1);
                    }
                    paramParcel.setDataPosition(n + k);
                  }
                  k = paramMap.length;
                  j = 0;
                  while (j < k)
                  {
                    if (j != 0) {
                      paramStringBuilder.append(",");
                    }
                    paramStringBuilder.append(paramMap[j]);
                    j++;
                    continue;
                    k = n6.b.s(k, paramParcel);
                    j = paramParcel.dataPosition();
                    if (k == 0)
                    {
                      paramMap = (Map)localObject4;
                    }
                    else
                    {
                      paramMap = paramParcel.createDoubleArray();
                      paramParcel.setDataPosition(j + k);
                    }
                    k = paramMap.length;
                    j = 0;
                    while (j < k)
                    {
                      if (j != 0) {
                        paramStringBuilder.append(",");
                      }
                      paramStringBuilder.append(paramMap[j]);
                      j++;
                      continue;
                      j = n6.b.s(k, paramParcel);
                      k = paramParcel.dataPosition();
                      if (j == 0)
                      {
                        paramMap = (Map)localObject5;
                      }
                      else
                      {
                        paramMap = paramParcel.createFloatArray();
                        paramParcel.setDataPosition(k + j);
                      }
                      k = paramMap.length;
                      j = 0;
                      while (j < k)
                      {
                        if (j != 0) {
                          paramStringBuilder.append(",");
                        }
                        paramStringBuilder.append(paramMap[j]);
                        j++;
                        continue;
                        j = n6.b.s(k, paramParcel);
                        k = paramParcel.dataPosition();
                        if (j == 0)
                        {
                          paramMap = (Map)localObject6;
                        }
                        else
                        {
                          paramMap = paramParcel.createLongArray();
                          paramParcel.setDataPosition(k + j);
                        }
                        k = paramMap.length;
                        j = 0;
                        while (j < k)
                        {
                          if (j != 0) {
                            paramStringBuilder.append(",");
                          }
                          paramStringBuilder.append(paramMap[j]);
                          j++;
                          continue;
                          m = n6.b.s(k, paramParcel);
                          n = paramParcel.dataPosition();
                          if (m == 0)
                          {
                            paramMap = (Map)localObject7;
                          }
                          else
                          {
                            k = paramParcel.readInt();
                            paramMap = new BigInteger[k];
                            for (j = 0; j < k; j++) {
                              paramMap[j] = new BigInteger(paramParcel.createByteArray());
                            }
                            paramParcel.setDataPosition(n + m);
                          }
                          k = paramMap.length;
                          j = 0;
                          while (j < k)
                          {
                            if (j != 0) {
                              paramStringBuilder.append(",");
                            }
                            paramStringBuilder.append(paramMap[j]);
                            j++;
                            continue;
                            paramMap = n6.b.d(k, paramParcel);
                            k = paramMap.length;
                            for (j = 0; j < k; j++)
                            {
                              if (j != 0) {
                                paramStringBuilder.append(",");
                              }
                              paramStringBuilder.append(paramMap[j]);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            paramMap = "]";
          }
          switch (d)
          {
          default: 
            throw new IllegalStateException("Unknown field type out");
          case 11: 
            k = n6.b.s(k, paramParcel);
            j = paramParcel.dataPosition();
            if (k == 0)
            {
              paramMap = (Map)localObject8;
            }
            else
            {
              paramMap = Parcel.obtain();
              paramMap.appendFrom(paramParcel, j, k);
              paramParcel.setDataPosition(j + k);
            }
            paramMap.setDataPosition(0);
            j.i(q);
            j.i(r);
            localObject1 = r;
            localObject2 = q;
            localObject1 = (Map)b.get(localObject2);
            j.i(localObject1);
            c(paramStringBuilder, (Map)localObject1, paramMap);
            break;
          case 10: 
            paramMap = n6.b.b(k, paramParcel);
            localObject1 = paramMap.keySet();
            paramStringBuilder.append("{");
            localObject1 = ((Set)localObject1).iterator();
            for (j = 1; ((Iterator)localObject1).hasNext(); j = 0)
            {
              localObject2 = (String)((Iterator)localObject1).next();
              if (j == 0) {
                paramStringBuilder.append(",");
              }
              paramStringBuilder.append("\"");
              paramStringBuilder.append((String)localObject2);
              paramStringBuilder.append("\":\"");
              paramStringBuilder.append(d.a(paramMap.getString((String)localObject2)));
              paramStringBuilder.append("\"");
            }
            paramMap = "}";
            paramStringBuilder.append(paramMap);
            break;
          case 9: 
            localObject1 = n6.b.c(k, paramParcel);
            paramStringBuilder.append("\"");
            if (localObject1 != null) {
              paramMap = Base64.encodeToString((byte[])localObject1, 10);
            }
            break;
          case 8: 
            localObject1 = n6.b.c(k, paramParcel);
            paramStringBuilder.append("\"");
            if (localObject1 != null) {
              paramMap = Base64.encodeToString((byte[])localObject1, 0);
            }
            break;
          case 7: 
            paramMap = n6.b.f(k, paramParcel);
            paramStringBuilder.append("\"");
            paramMap = d.a(paramMap);
            paramStringBuilder.append(paramMap);
            paramStringBuilder.append("\"");
            break;
          case 6: 
            paramStringBuilder.append(n6.b.k(k, paramParcel));
            break;
          case 5: 
            paramMap = n6.b.a(k, paramParcel);
            break;
          case 4: 
            n6.b.w(paramParcel, k, 8);
            paramStringBuilder.append(paramParcel.readDouble());
            break;
          case 3: 
            n6.b.w(paramParcel, k, 4);
            paramStringBuilder.append(paramParcel.readFloat());
            break;
          case 2: 
            paramStringBuilder.append(n6.b.q(k, paramParcel));
            break;
          case 1: 
            j = n6.b.s(k, paramParcel);
            k = paramParcel.dataPosition();
            if (j == 0)
            {
              paramMap = (Map)localObject9;
            }
            else
            {
              paramMap = paramParcel.createByteArray();
              paramParcel.setDataPosition(k + j);
              paramMap = new BigInteger(paramMap);
            }
            paramStringBuilder.append(paramMap);
            break;
          }
          paramStringBuilder.append(n6.b.o(k, paramParcel));
        }
        j = 1;
      }
    }
    if (paramParcel.dataPosition() == i)
    {
      paramStringBuilder.append('}');
      return;
    }
    throw new b.a(f.h("Overread allowed size end=", i), paramParcel);
  }
  
  public static final void d(StringBuilder paramStringBuilder, int paramInt, Object paramObject)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException(f.h("Unknown type = ", paramInt));
    case 11: 
      throw new IllegalArgumentException("Method does not accept concrete type.");
    case 10: 
      j.i(paramObject);
      x6.b.B0(paramStringBuilder, (HashMap)paramObject);
      return;
    case 9: 
      paramStringBuilder.append("\"");
      paramObject = (byte[])paramObject;
      if (paramObject == null) {
        paramObject = localObject2;
      } else {
        paramObject = Base64.encodeToString((byte[])paramObject, 10);
      }
      paramStringBuilder.append((String)paramObject);
      paramStringBuilder.append("\"");
      return;
    case 8: 
      paramStringBuilder.append("\"");
      paramObject = (byte[])paramObject;
      if (paramObject == null) {
        paramObject = localObject1;
      } else {
        paramObject = Base64.encodeToString((byte[])paramObject, 0);
      }
      paramStringBuilder.append((String)paramObject);
      paramStringBuilder.append("\"");
      return;
    case 7: 
      paramStringBuilder.append("\"");
      j.i(paramObject);
      paramStringBuilder.append(d.a(paramObject.toString()));
      paramStringBuilder.append("\"");
      return;
    }
    paramStringBuilder.append(paramObject);
  }
  
  public static final void e(StringBuilder paramStringBuilder, a.a parama, Object paramObject)
  {
    if (c)
    {
      paramObject = (ArrayList)paramObject;
      paramStringBuilder.append("[");
      int i = ((ArrayList)paramObject).size();
      for (int j = 0; j < i; j++)
      {
        if (j != 0) {
          paramStringBuilder.append(",");
        }
        d(paramStringBuilder, b, ((ArrayList)paramObject).get(j));
      }
      paramStringBuilder.append("]");
      return;
    }
    d(paramStringBuilder, b, paramObject);
  }
  
  public final Parcel a()
  {
    int i = f;
    if (i != 0)
    {
      if (i != 1) {
        break label62;
      }
      Parcel localParcel = b;
      z.L(o, localParcel);
    }
    else
    {
      i = z.J(20293, b);
      o = i;
      z.L(i, b);
    }
    f = 2;
    label62:
    return b;
  }
  
  public final <T extends a> void addConcreteTypeArrayInternal(a.a parama, String paramString, ArrayList<T> paramArrayList)
  {
    b(parama);
    paramString = new ArrayList();
    j.i(paramArrayList);
    paramArrayList.size();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      paramString.add(((c)paramArrayList.get(j)).a());
    }
    paramArrayList = b;
    i = z.J(o, paramArrayList);
    int k = paramString.size();
    paramArrayList.writeInt(k);
    for (j = 0; j < k; j++)
    {
      parama = (Parcel)paramString.get(j);
      if (parama != null)
      {
        paramArrayList.writeInt(parama.dataSize());
        paramArrayList.appendFrom(parama, 0, parama.dataSize());
      }
      else
      {
        paramArrayList.writeInt(0);
      }
    }
    z.L(i, paramArrayList);
  }
  
  public final <T extends a> void addConcreteTypeInternal(a.a parama, String paramString, T paramT)
  {
    b(parama);
    paramString = ((c)paramT).a();
    paramT = b;
    int i = o;
    if (paramString == null)
    {
      paramT.writeInt(i | 0x0);
    }
    else
    {
      i = z.J(i, paramT);
      paramT.appendFrom(paramString, 0, paramString.dataSize());
      z.L(i, paramT);
    }
  }
  
  public final void b(a.a parama)
  {
    if (o != -1)
    {
      parama = b;
      if (parama != null)
      {
        int i = f;
        if (i != 0)
        {
          if (i == 1) {
            return;
          }
          throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
        }
        o = z.J(20293, parama);
        f = 1;
        return;
      }
      throw new IllegalStateException("Internal Parcel object is null.");
    }
    throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
  }
  
  public final Map<String, a.a<?, ?>> getFieldMappings()
  {
    h localh = d;
    if (localh == null) {
      return null;
    }
    String str = e;
    j.i(str);
    return (Map)b.get(str);
  }
  
  public final Object getValueObject(String paramString)
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  public final boolean isPrimitiveFieldSet(String paramString)
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  public final void setBooleanInternal(a.a<?, ?> parama, String paramString, boolean paramBoolean)
  {
    b(parama);
    z.t(b, o, paramBoolean);
  }
  
  public final void setDecodedBytesInternal(a.a<?, ?> parama, String paramString, byte[] paramArrayOfByte)
  {
    b(parama);
    z.w(b, o, paramArrayOfByte, true);
  }
  
  public final void setIntegerInternal(a.a<?, ?> parama, String paramString, int paramInt)
  {
    b(parama);
    z.z(b, o, paramInt);
  }
  
  public final void setLongInternal(a.a<?, ?> parama, String paramString, long paramLong)
  {
    b(parama);
    z.C(b, o, paramLong);
  }
  
  public final void setStringInternal(a.a<?, ?> parama, String paramString1, String paramString2)
  {
    b(parama);
    z.F(b, o, paramString2, true);
  }
  
  public final void setStringMapInternal(a.a<?, ?> parama, String paramString, Map<String, String> paramMap)
  {
    b(parama);
    Bundle localBundle = new Bundle();
    j.i(paramMap);
    paramString = paramMap.keySet().iterator();
    while (paramString.hasNext())
    {
      String str = (String)paramString.next();
      localBundle.putString(str, (String)paramMap.get(str));
    }
    z.v(b, o, localBundle, true);
  }
  
  public final void setStringsInternal(a.a<?, ?> parama, String paramString, ArrayList<String> paramArrayList)
  {
    b(parama);
    j.i(paramArrayList);
    int i = paramArrayList.size();
    paramString = new String[i];
    for (int j = 0; j < i; j++) {
      paramString[j] = ((String)paramArrayList.get(j));
    }
    paramArrayList = b;
    j = z.J(o, paramArrayList);
    paramArrayList.writeStringArray(paramString);
    z.L(j, paramArrayList);
  }
  
  public final String toString()
  {
    j.j(d, "Cannot convert to JSON on client side.");
    Parcel localParcel = a();
    localParcel.setDataPosition(0);
    StringBuilder localStringBuilder = new StringBuilder(100);
    Object localObject = e;
    j.i(localObject);
    localObject = (Map)d.b.get(localObject);
    j.i(localObject);
    c(localStringBuilder, (Map)localObject, localParcel);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a;
    int j = z.J(20293, paramParcel);
    z.z(paramParcel, 1, i);
    Object localObject = a();
    if (localObject != null)
    {
      i = z.J(2, paramParcel);
      paramParcel.appendFrom((Parcel)localObject, 0, ((Parcel)localObject).dataSize());
      z.L(i, paramParcel);
    }
    if (c != 0) {
      localObject = d;
    } else {
      localObject = null;
    }
    z.E(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    z.L(j, paramParcel);
  }
  
  public final void zab(a.a parama, String paramString, BigDecimal paramBigDecimal)
  {
    b(parama);
    paramString = b;
    int i = o;
    if (paramBigDecimal == null)
    {
      paramString.writeInt(i | 0x0);
    }
    else
    {
      i = z.J(i, paramString);
      paramString.writeByteArray(paramBigDecimal.unscaledValue().toByteArray());
      paramString.writeInt(paramBigDecimal.scale());
      z.L(i, paramString);
    }
  }
  
  public final void zad(a.a parama, String paramString, ArrayList paramArrayList)
  {
    b(parama);
    j.i(paramArrayList);
    int i = paramArrayList.size();
    paramString = new BigDecimal[i];
    int j = 0;
    for (int k = 0; k < i; k++) {
      paramString[k] = ((BigDecimal)paramArrayList.get(k));
    }
    paramArrayList = b;
    int m = z.J(o, paramArrayList);
    paramArrayList.writeInt(i);
    for (k = j; k < i; k++)
    {
      paramArrayList.writeByteArray(paramString[k].unscaledValue().toByteArray());
      paramArrayList.writeInt(paramString[k].scale());
    }
    z.L(m, paramArrayList);
  }
  
  public final void zaf(a.a parama, String paramString, BigInteger paramBigInteger)
  {
    b(parama);
    paramString = b;
    int i = o;
    if (paramBigInteger == null)
    {
      paramString.writeInt(i | 0x0);
    }
    else
    {
      i = z.J(i, paramString);
      paramString.writeByteArray(paramBigInteger.toByteArray());
      z.L(i, paramString);
    }
  }
  
  public final void zah(a.a parama, String paramString, ArrayList paramArrayList)
  {
    b(parama);
    j.i(paramArrayList);
    int i = paramArrayList.size();
    paramString = new BigInteger[i];
    int j = 0;
    for (int k = 0; k < i; k++) {
      paramString[k] = ((BigInteger)paramArrayList.get(k));
    }
    paramArrayList = b;
    int m = z.J(o, paramArrayList);
    paramArrayList.writeInt(i);
    for (k = j; k < i; k++) {
      paramArrayList.writeByteArray(paramString[k].toByteArray());
    }
    z.L(m, paramArrayList);
  }
  
  public final void zak(a.a parama, String paramString, ArrayList paramArrayList)
  {
    b(parama);
    j.i(paramArrayList);
    int i = paramArrayList.size();
    paramString = new boolean[i];
    for (int j = 0; j < i; j++) {
      paramString[j] = ((Boolean)paramArrayList.get(j)).booleanValue();
    }
    paramArrayList = b;
    j = z.J(o, paramArrayList);
    paramArrayList.writeBooleanArray(paramString);
    z.L(j, paramArrayList);
  }
  
  public final void zan(a.a parama, String paramString, double paramDouble)
  {
    b(parama);
    paramString = b;
    paramString.writeInt(o | 0x80000);
    paramString.writeDouble(paramDouble);
  }
  
  public final void zap(a.a parama, String paramString, ArrayList paramArrayList)
  {
    b(parama);
    j.i(paramArrayList);
    int i = paramArrayList.size();
    paramString = new double[i];
    for (int j = 0; j < i; j++) {
      paramString[j] = ((Double)paramArrayList.get(j)).doubleValue();
    }
    paramArrayList = b;
    j = z.J(o, paramArrayList);
    paramArrayList.writeDoubleArray(paramString);
    z.L(j, paramArrayList);
  }
  
  public final void zar(a.a parama, String paramString, float paramFloat)
  {
    b(parama);
    paramString = b;
    paramString.writeInt(o | 0x40000);
    paramString.writeFloat(paramFloat);
  }
  
  public final void zat(a.a parama, String paramString, ArrayList paramArrayList)
  {
    b(parama);
    j.i(paramArrayList);
    int i = paramArrayList.size();
    paramString = new float[i];
    for (int j = 0; j < i; j++) {
      paramString[j] = ((Float)paramArrayList.get(j)).floatValue();
    }
    paramArrayList = b;
    j = z.J(o, paramArrayList);
    paramArrayList.writeFloatArray(paramString);
    z.L(j, paramArrayList);
  }
  
  public final void zaw(a.a parama, String paramString, ArrayList paramArrayList)
  {
    b(parama);
    j.i(paramArrayList);
    int i = paramArrayList.size();
    paramString = new int[i];
    for (int j = 0; j < i; j++) {
      paramString[j] = ((Integer)paramArrayList.get(j)).intValue();
    }
    z.A(b, o, paramString, true);
  }
  
  public final void zaz(a.a parama, String paramString, ArrayList paramArrayList)
  {
    b(parama);
    j.i(paramArrayList);
    int i = paramArrayList.size();
    paramString = new long[i];
    for (int j = 0; j < i; j++) {
      paramString[j] = ((Long)paramArrayList.get(j)).longValue();
    }
    paramArrayList = b;
    j = z.J(o, paramArrayList);
    paramArrayList.writeLongArray(paramString);
    z.L(j, paramArrayList);
  }
}

/* Location:
 * Qualified Name:     t6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */