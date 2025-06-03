package t6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import b.z;
import f;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m6.h.a;
import m6.j;

public abstract class a
{
  public static final Object zaD(a parama, Object paramObject)
  {
    Object localObject = s;
    parama = (a)paramObject;
    if (localObject != null)
    {
      localObject = (s6.a)localObject;
      localObject.getClass();
      int i = ((Integer)paramObject).intValue();
      paramObject = (String)c.get(i);
      parama = (a)paramObject;
      if (paramObject == null)
      {
        parama = (a)paramObject;
        if (b.containsKey("gms_unknown")) {
          parama = "gms_unknown";
        }
      }
    }
    return parama;
  }
  
  private final void zaE(a parama, Object paramObject)
  {
    int i = d;
    j.i(s);
    s6.a locala = (s6.a)s;
    Object localObject = (Integer)b.get((String)paramObject);
    paramObject = localObject;
    if (localObject == null) {
      paramObject = (Integer)b.get("gms_unknown");
    }
    j.i(paramObject);
    localObject = f;
    switch (i)
    {
    case 3: 
    default: 
      throw new IllegalStateException(f.h("Unsupported type for conversion: ", i));
    case 8: 
    case 9: 
      setDecodedBytesInternal(parama, (String)localObject, (byte[])paramObject);
      return;
    case 7: 
      setStringInternal(parama, (String)localObject, (String)paramObject);
      return;
    case 6: 
      setBooleanInternal(parama, (String)localObject, ((Boolean)paramObject).booleanValue());
      return;
    case 5: 
      zab(parama, (String)localObject, (BigDecimal)paramObject);
      return;
    case 4: 
      zan(parama, (String)localObject, ((Double)paramObject).doubleValue());
      return;
    case 2: 
      setLongInternal(parama, (String)localObject, ((Long)paramObject).longValue());
      return;
    case 1: 
      zaf(parama, (String)localObject, (BigInteger)paramObject);
      return;
    }
    setIntegerInternal(parama, (String)localObject, ((Integer)paramObject).intValue());
  }
  
  private static final void zaF(StringBuilder paramStringBuilder, a parama, Object paramObject)
  {
    int i = b;
    if (i != 11)
    {
      if (i == 7)
      {
        parama = "\"";
        paramStringBuilder.append("\"");
        paramStringBuilder.append(v6.d.a((String)paramObject));
      }
      else
      {
        paramStringBuilder.append(paramObject);
      }
    }
    else
    {
      parama = p;
      j.i(parama);
      parama = ((a)parama.cast(paramObject)).toString();
    }
    paramStringBuilder.append(parama);
  }
  
  private static final void zaG(String paramString)
  {
    if (Log.isLoggable("FastJsonResponse", 6))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Output field (");
      localStringBuilder.append(paramString);
      localStringBuilder.append(") has a null value, but expected a primitive");
      Log.e("FastJsonResponse", localStringBuilder.toString());
    }
  }
  
  public <T extends a> void addConcreteTypeArrayInternal(a parama, String paramString, ArrayList<T> paramArrayList)
  {
    throw new UnsupportedOperationException("Concrete type array not supported");
  }
  
  public <T extends a> void addConcreteTypeInternal(a parama, String paramString, T paramT)
  {
    throw new UnsupportedOperationException("Concrete type not supported");
  }
  
  public abstract Map<String, a<?, ?>> getFieldMappings();
  
  public Object getFieldValue(a parama)
  {
    Object localObject = f;
    if (p != null)
    {
      int i;
      if (getValueObject((String)localObject) == null) {
        i = 1;
      } else {
        i = 0;
      }
      parama = f;
      if (i != 0) {
        try
        {
          char c = Character.toUpperCase(((String)localObject).charAt(0));
          parama = ((String)localObject).substring(1);
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("get");
          ((StringBuilder)localObject).append(c);
          ((StringBuilder)localObject).append(parama);
          parama = ((StringBuilder)localObject).toString();
          parama = getClass().getMethod(parama, new Class[0]).invoke(this, new Object[0]);
          return parama;
        }
        catch (Exception parama)
        {
          throw new RuntimeException(parama);
        }
      }
      throw new IllegalStateException(String.format("Concrete field shouldn't be value object: %s", new Object[] { parama }));
    }
    return getValueObject((String)localObject);
  }
  
  public abstract Object getValueObject(String paramString);
  
  public boolean isFieldSet(a parama)
  {
    if (d == 11)
    {
      if (e) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
      }
      throw new UnsupportedOperationException("Concrete types not supported");
    }
    return isPrimitiveFieldSet(f);
  }
  
  public abstract boolean isPrimitiveFieldSet(String paramString);
  
  public void setBooleanInternal(a<?, ?> parama, String paramString, boolean paramBoolean)
  {
    throw new UnsupportedOperationException("Boolean not supported");
  }
  
  public void setDecodedBytesInternal(a<?, ?> parama, String paramString, byte[] paramArrayOfByte)
  {
    throw new UnsupportedOperationException("byte[] not supported");
  }
  
  public void setIntegerInternal(a<?, ?> parama, String paramString, int paramInt)
  {
    throw new UnsupportedOperationException("Integer not supported");
  }
  
  public void setLongInternal(a<?, ?> parama, String paramString, long paramLong)
  {
    throw new UnsupportedOperationException("Long not supported");
  }
  
  public void setStringInternal(a<?, ?> parama, String paramString1, String paramString2)
  {
    throw new UnsupportedOperationException("String not supported");
  }
  
  public void setStringMapInternal(a<?, ?> parama, String paramString, Map<String, String> paramMap)
  {
    throw new UnsupportedOperationException("String map not supported");
  }
  
  public void setStringsInternal(a<?, ?> parama, String paramString, ArrayList<String> paramArrayList)
  {
    throw new UnsupportedOperationException("String list not supported");
  }
  
  public String toString()
  {
    Map localMap = getFieldMappings();
    StringBuilder localStringBuilder = new StringBuilder(100);
    Iterator localIterator = localMap.keySet().iterator();
    Object localObject2;
    while (localIterator.hasNext())
    {
      Object localObject1 = (String)localIterator.next();
      localObject2 = (a)localMap.get(localObject1);
      if (isFieldSet((a)localObject2))
      {
        Object localObject3 = zaD((a)localObject2, getFieldValue((a)localObject2));
        if (localStringBuilder.length() == 0) {
          localStringBuilder.append("{");
        } else {
          localStringBuilder.append(",");
        }
        localStringBuilder.append("\"");
        localStringBuilder.append((String)localObject1);
        localStringBuilder.append("\":");
        if (localObject3 == null)
        {
          localObject2 = "null";
        }
        else
        {
          int i = d;
          int j = 0;
          switch (i)
          {
          default: 
            if (!c) {
              break label345;
            }
            localObject1 = (ArrayList)localObject3;
            localStringBuilder.append("[");
            i = ((ArrayList)localObject1).size();
            break;
          case 10: 
            x6.b.B0(localStringBuilder, (HashMap)localObject3);
            break;
          case 9: 
            localStringBuilder.append("\"");
            localObject2 = Base64.encodeToString((byte[])localObject3, 10);
            break;
          case 8: 
            localStringBuilder.append("\"");
            localObject2 = Base64.encodeToString((byte[])localObject3, 0);
            localStringBuilder.append((String)localObject2);
            localStringBuilder.append("\"");
            continue;
            while (j < i)
            {
              if (j > 0) {
                localStringBuilder.append(",");
              }
              localObject3 = ((ArrayList)localObject1).get(j);
              if (localObject3 != null) {
                zaF(localStringBuilder, (a)localObject2, localObject3);
              }
              j++;
            }
            localObject2 = "]";
          }
        }
        localStringBuilder.append((String)localObject2);
        continue;
        label345:
        zaF(localStringBuilder, (a)localObject2, localObject3);
      }
    }
    if (localStringBuilder.length() > 0) {
      localObject2 = "}";
    } else {
      localObject2 = "{}";
    }
    localStringBuilder.append((String)localObject2);
    return localStringBuilder.toString();
  }
  
  public final void zaA(a parama, String paramString)
  {
    if (s != null)
    {
      zaE(parama, paramString);
      return;
    }
    setStringInternal(parama, f, paramString);
  }
  
  public final void zaB(a parama, Map paramMap)
  {
    if (s != null)
    {
      zaE(parama, paramMap);
      return;
    }
    setStringMapInternal(parama, f, paramMap);
  }
  
  public final void zaC(a parama, ArrayList paramArrayList)
  {
    if (s != null)
    {
      zaE(parama, paramArrayList);
      return;
    }
    setStringsInternal(parama, f, paramArrayList);
  }
  
  public final void zaa(a parama, BigDecimal paramBigDecimal)
  {
    if (s != null)
    {
      zaE(parama, paramBigDecimal);
      return;
    }
    zab(parama, f, paramBigDecimal);
  }
  
  public void zab(a parama, String paramString, BigDecimal paramBigDecimal)
  {
    throw new UnsupportedOperationException("BigDecimal not supported");
  }
  
  public final void zac(a parama, ArrayList paramArrayList)
  {
    if (s != null)
    {
      zaE(parama, paramArrayList);
      return;
    }
    zad(parama, f, paramArrayList);
  }
  
  public void zad(a parama, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("BigDecimal list not supported");
  }
  
  public final void zae(a parama, BigInteger paramBigInteger)
  {
    if (s != null)
    {
      zaE(parama, paramBigInteger);
      return;
    }
    zaf(parama, f, paramBigInteger);
  }
  
  public void zaf(a parama, String paramString, BigInteger paramBigInteger)
  {
    throw new UnsupportedOperationException("BigInteger not supported");
  }
  
  public final void zag(a parama, ArrayList paramArrayList)
  {
    if (s != null)
    {
      zaE(parama, paramArrayList);
      return;
    }
    zah(parama, f, paramArrayList);
  }
  
  public void zah(a parama, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("BigInteger list not supported");
  }
  
  public final void zai(a parama, boolean paramBoolean)
  {
    if (s != null)
    {
      zaE(parama, Boolean.valueOf(paramBoolean));
      return;
    }
    setBooleanInternal(parama, f, paramBoolean);
  }
  
  public final void zaj(a parama, ArrayList paramArrayList)
  {
    if (s != null)
    {
      zaE(parama, paramArrayList);
      return;
    }
    zak(parama, f, paramArrayList);
  }
  
  public void zak(a parama, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("Boolean list not supported");
  }
  
  public final void zal(a parama, byte[] paramArrayOfByte)
  {
    if (s != null)
    {
      zaE(parama, paramArrayOfByte);
      return;
    }
    setDecodedBytesInternal(parama, f, paramArrayOfByte);
  }
  
  public final void zam(a parama, double paramDouble)
  {
    if (s != null)
    {
      zaE(parama, Double.valueOf(paramDouble));
      return;
    }
    zan(parama, f, paramDouble);
  }
  
  public void zan(a parama, String paramString, double paramDouble)
  {
    throw new UnsupportedOperationException("Double not supported");
  }
  
  public final void zao(a parama, ArrayList paramArrayList)
  {
    if (s != null)
    {
      zaE(parama, paramArrayList);
      return;
    }
    zap(parama, f, paramArrayList);
  }
  
  public void zap(a parama, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("Double list not supported");
  }
  
  public final void zaq(a parama, float paramFloat)
  {
    if (s != null)
    {
      zaE(parama, Float.valueOf(paramFloat));
      return;
    }
    zar(parama, f, paramFloat);
  }
  
  public void zar(a parama, String paramString, float paramFloat)
  {
    throw new UnsupportedOperationException("Float not supported");
  }
  
  public final void zas(a parama, ArrayList paramArrayList)
  {
    if (s != null)
    {
      zaE(parama, paramArrayList);
      return;
    }
    zat(parama, f, paramArrayList);
  }
  
  public void zat(a parama, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("Float list not supported");
  }
  
  public final void zau(a parama, int paramInt)
  {
    if (s != null)
    {
      zaE(parama, Integer.valueOf(paramInt));
      return;
    }
    setIntegerInternal(parama, f, paramInt);
  }
  
  public final void zav(a parama, ArrayList paramArrayList)
  {
    if (s != null)
    {
      zaE(parama, paramArrayList);
      return;
    }
    zaw(parama, f, paramArrayList);
  }
  
  public void zaw(a parama, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("Integer list not supported");
  }
  
  public final void zax(a parama, long paramLong)
  {
    if (s != null)
    {
      zaE(parama, Long.valueOf(paramLong));
      return;
    }
    setLongInternal(parama, f, paramLong);
  }
  
  public final void zay(a parama, ArrayList paramArrayList)
  {
    if (s != null)
    {
      zaE(parama, paramArrayList);
      return;
    }
    zaz(parama, f, paramArrayList);
  }
  
  public void zaz(a parama, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("Long list not supported");
  }
  
  public static final class a<I, O>
    extends n6.a
  {
    public static final d CREATOR = new d();
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final int o;
    public final Class p;
    public final String q;
    public h r;
    public final a.b s;
    
    public a(int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, int paramInt4, String paramString2, s6.b paramb)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramBoolean1;
      d = paramInt3;
      e = paramBoolean2;
      f = paramString1;
      o = paramInt4;
      if (paramString2 == null)
      {
        p = null;
        q = null;
      }
      else
      {
        p = c.class;
        q = paramString2;
      }
      if (paramb == null)
      {
        s = null;
        return;
      }
      paramString1 = b;
      if (paramString1 != null)
      {
        s = paramString1;
        return;
      }
      throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }
    
    public a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, String paramString, int paramInt3, Class paramClass)
    {
      a = 1;
      b = paramInt1;
      c = paramBoolean1;
      d = paramInt2;
      e = paramBoolean2;
      f = paramString;
      o = paramInt3;
      p = paramClass;
      if (paramClass == null) {
        paramString = null;
      } else {
        paramString = paramClass.getCanonicalName();
      }
      q = paramString;
      s = null;
    }
    
    public static a D(int paramInt, String paramString)
    {
      return new a(7, true, 7, true, paramString, paramInt, null);
    }
    
    public final String toString()
    {
      h.a locala = new h.a(this);
      locala.a(Integer.valueOf(a), "versionCode");
      locala.a(Integer.valueOf(b), "typeIn");
      locala.a(Boolean.valueOf(c), "typeInArray");
      locala.a(Integer.valueOf(d), "typeOut");
      locala.a(Boolean.valueOf(e), "typeOutArray");
      locala.a(f, "outputFieldName");
      locala.a(Integer.valueOf(o), "safeParcelFieldId");
      String str = q;
      Object localObject = str;
      if (str == null) {
        localObject = null;
      }
      locala.a(localObject, "concreteTypeName");
      localObject = p;
      if (localObject != null) {
        locala.a(((Class)localObject).getCanonicalName(), "concreteType.class");
      }
      localObject = s;
      if (localObject != null) {
        locala.a(localObject.getClass().getCanonicalName(), "converterName");
      }
      return locala.toString();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int i = a;
      int j = z.J(20293, paramParcel);
      z.z(paramParcel, 1, i);
      z.z(paramParcel, 2, b);
      z.t(paramParcel, 3, c);
      z.z(paramParcel, 4, d);
      z.t(paramParcel, 5, e);
      z.F(paramParcel, 6, f, false);
      z.z(paramParcel, 7, o);
      String str = q;
      Object localObject1 = null;
      Object localObject2 = str;
      if (str == null) {
        localObject2 = null;
      }
      z.F(paramParcel, 8, (String)localObject2, false);
      localObject2 = s;
      if (localObject2 == null)
      {
        localObject2 = localObject1;
      }
      else
      {
        if (!(localObject2 instanceof s6.a)) {
          break label164;
        }
        localObject2 = new s6.b((s6.a)localObject2);
      }
      z.E(paramParcel, 9, (Parcelable)localObject2, paramInt, false);
      z.L(j, paramParcel);
      return;
      label164:
      throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }
  }
  
  public static abstract interface b<I, O> {}
}

/* Location:
 * Qualified Name:     t6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */