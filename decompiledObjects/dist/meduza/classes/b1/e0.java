package b1;

import a0.b;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import ec.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import qc.q;
import rb.d;
import s1.c.b;
import sb.t;
import sb.y;
import x0.j;

public final class e0
{
  public static final Class<? extends Object>[] f = { Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class };
  public final LinkedHashMap a;
  public final LinkedHashMap b;
  public final LinkedHashMap c;
  public final LinkedHashMap d;
  public final c.b e;
  
  public e0()
  {
    a = new LinkedHashMap();
    b = new LinkedHashMap();
    c = new LinkedHashMap();
    d = new LinkedHashMap();
    e = new j(this, 2);
  }
  
  public e0(HashMap paramHashMap)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    a = localLinkedHashMap;
    b = new LinkedHashMap();
    c = new LinkedHashMap();
    d = new LinkedHashMap();
    e = new d0(this);
    localLinkedHashMap.putAll(paramHashMap);
  }
  
  public static Bundle a(e0 parame0)
  {
    i.e(parame0, "this$0");
    Object localObject1 = b;
    i.e(localObject1, "<this>");
    int i = ((Map)localObject1).size();
    if (i != 0)
    {
      if (i != 1) {
        localObject1 = new LinkedHashMap((Map)localObject1);
      } else {
        localObject1 = y.J0((LinkedHashMap)localObject1);
      }
    }
    else {
      localObject1 = t.a;
    }
    Object localObject2 = ((Map)localObject1).entrySet().iterator();
    Object localObject5;
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      localObject1 = null;
      i = 0;
      int j = 0;
      if (!bool) {
        break label331;
      }
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      localObject4 = (String)((Map.Entry)localObject3).getKey();
      localObject3 = ((c.b)((Map.Entry)localObject3).getValue()).a();
      i.e(localObject4, "key");
      Class[] arrayOfClass;
      if (localObject3 != null) {
        arrayOfClass = f;
      }
      for (int k = 0;; k++)
      {
        i = j;
        if (k >= 29) {
          break;
        }
        localObject5 = arrayOfClass[k];
        i.b(localObject5);
        if (((Class)localObject5).isInstance(localObject3))
        {
          i = 1;
          break;
        }
      }
      if (i == 0) {
        break;
      }
      localObject5 = c.get(localObject4);
      if ((localObject5 instanceof w)) {
        localObject1 = (w)localObject5;
      }
      if (localObject1 != null) {
        ((w)localObject1).setValue(localObject3);
      } else {
        a.put(localObject4, localObject3);
      }
      localObject1 = (q)d.get(localObject4);
      if (localObject1 != null) {
        ((q)localObject1).setValue(localObject3);
      }
    }
    parame0 = new StringBuilder();
    parame0.append("Can't put value with type ");
    i.b(localObject3);
    parame0.append(localObject3.getClass());
    parame0.append(" into saved state");
    throw new IllegalArgumentException(parame0.toString());
    label331:
    Object localObject3 = a.keySet();
    localObject1 = new ArrayList(((Set)localObject3).size());
    localObject2 = new ArrayList(((ArrayList)localObject1).size());
    Object localObject4 = ((Set)localObject3).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject3 = (String)((Iterator)localObject4).next();
      ((ArrayList)localObject1).add(localObject3);
      ((ArrayList)localObject2).add(a.get(localObject3));
    }
    localObject1 = new d("keys", localObject1);
    localObject2 = new d("values", localObject2);
    localObject3 = new Bundle(2);
    while (i < 2)
    {
      localObject4 = new d[] { localObject1, localObject2 }[i];
      parame0 = (String)a;
      localObject4 = b;
      if (localObject4 == null)
      {
        ((BaseBundle)localObject3).putString(parame0, null);
      }
      else if ((localObject4 instanceof Boolean))
      {
        ((BaseBundle)localObject3).putBoolean(parame0, ((Boolean)localObject4).booleanValue());
      }
      else if ((localObject4 instanceof Byte))
      {
        ((Bundle)localObject3).putByte(parame0, ((Number)localObject4).byteValue());
      }
      else if ((localObject4 instanceof Character))
      {
        ((Bundle)localObject3).putChar(parame0, ((Character)localObject4).charValue());
      }
      else if ((localObject4 instanceof Double))
      {
        ((BaseBundle)localObject3).putDouble(parame0, ((Number)localObject4).doubleValue());
      }
      else if ((localObject4 instanceof Float))
      {
        ((Bundle)localObject3).putFloat(parame0, ((Number)localObject4).floatValue());
      }
      else if ((localObject4 instanceof Integer))
      {
        ((BaseBundle)localObject3).putInt(parame0, ((Number)localObject4).intValue());
      }
      else if ((localObject4 instanceof Long))
      {
        ((BaseBundle)localObject3).putLong(parame0, ((Number)localObject4).longValue());
      }
      else if ((localObject4 instanceof Short))
      {
        ((Bundle)localObject3).putShort(parame0, ((Number)localObject4).shortValue());
      }
      else if ((localObject4 instanceof Bundle))
      {
        ((Bundle)localObject3).putBundle(parame0, (Bundle)localObject4);
      }
      else if ((localObject4 instanceof CharSequence))
      {
        ((Bundle)localObject3).putCharSequence(parame0, (CharSequence)localObject4);
      }
      else if ((localObject4 instanceof Parcelable))
      {
        ((Bundle)localObject3).putParcelable(parame0, (Parcelable)localObject4);
      }
      else if ((localObject4 instanceof boolean[]))
      {
        ((BaseBundle)localObject3).putBooleanArray(parame0, (boolean[])localObject4);
      }
      else if ((localObject4 instanceof byte[]))
      {
        ((Bundle)localObject3).putByteArray(parame0, (byte[])localObject4);
      }
      else if ((localObject4 instanceof char[]))
      {
        ((Bundle)localObject3).putCharArray(parame0, (char[])localObject4);
      }
      else if ((localObject4 instanceof double[]))
      {
        ((BaseBundle)localObject3).putDoubleArray(parame0, (double[])localObject4);
      }
      else if ((localObject4 instanceof float[]))
      {
        ((Bundle)localObject3).putFloatArray(parame0, (float[])localObject4);
      }
      else if ((localObject4 instanceof int[]))
      {
        ((BaseBundle)localObject3).putIntArray(parame0, (int[])localObject4);
      }
      else if ((localObject4 instanceof long[]))
      {
        ((BaseBundle)localObject3).putLongArray(parame0, (long[])localObject4);
      }
      else if ((localObject4 instanceof short[]))
      {
        ((Bundle)localObject3).putShortArray(parame0, (short[])localObject4);
      }
      else
      {
        if ((localObject4 instanceof Object[]))
        {
          localObject5 = localObject4.getClass().getComponentType();
          i.b(localObject5);
          if (Parcelable.class.isAssignableFrom((Class)localObject5))
          {
            ((Bundle)localObject3).putParcelableArray(parame0, (Parcelable[])localObject4);
            break label1203;
          }
          if (String.class.isAssignableFrom((Class)localObject5))
          {
            ((BaseBundle)localObject3).putStringArray(parame0, (String[])localObject4);
            break label1203;
          }
          if (CharSequence.class.isAssignableFrom((Class)localObject5))
          {
            ((Bundle)localObject3).putCharSequenceArray(parame0, (CharSequence[])localObject4);
            break label1203;
          }
          if (!Serializable.class.isAssignableFrom((Class)localObject5))
          {
            localObject2 = ((Class)localObject5).getCanonicalName();
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Illegal value array type ");
            ((StringBuilder)localObject1).append((String)localObject2);
            ((StringBuilder)localObject1).append(" for key \"");
            ((StringBuilder)localObject1).append(parame0);
            ((StringBuilder)localObject1).append('"');
            throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
          }
        }
        else
        {
          if (!(localObject4 instanceof Serializable)) {
            break label1140;
          }
        }
        ((Bundle)localObject3).putSerializable(parame0, (Serializable)localObject4);
        break label1203;
        label1140:
        if ((localObject4 instanceof IBinder))
        {
          ((Bundle)localObject3).putBinder(parame0, (IBinder)localObject4);
        }
        else if ((localObject4 instanceof Size))
        {
          b.a((Bundle)localObject3, parame0, (Size)localObject4);
        }
        else
        {
          if (!(localObject4 instanceof SizeF)) {
            break label1209;
          }
          b.b((Bundle)localObject3, parame0, (SizeF)localObject4);
        }
      }
      label1203:
      i++;
      continue;
      label1209:
      localObject1 = localObject4.getClass().getCanonicalName();
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Illegal value type ");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" for key \"");
      ((StringBuilder)localObject2).append(parame0);
      ((StringBuilder)localObject2).append('"');
      throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
    }
    return (Bundle)localObject3;
  }
  
  public static final class a
  {
    public static e0 a(Bundle paramBundle1, Bundle paramBundle2)
    {
      Object localObject2;
      if (paramBundle1 == null)
      {
        if (paramBundle2 == null)
        {
          paramBundle1 = new e0();
        }
        else
        {
          localObject1 = new HashMap();
          paramBundle1 = paramBundle2.keySet().iterator();
          while (paramBundle1.hasNext())
          {
            localObject2 = (String)paramBundle1.next();
            i.d(localObject2, "key");
            ((HashMap)localObject1).put(localObject2, paramBundle2.get((String)localObject2));
          }
          paramBundle1 = new e0((HashMap)localObject1);
        }
        return paramBundle1;
      }
      paramBundle2 = e0.class.getClassLoader();
      i.b(paramBundle2);
      paramBundle1.setClassLoader(paramBundle2);
      paramBundle2 = paramBundle1.getParcelableArrayList("keys");
      Object localObject1 = paramBundle1.getParcelableArrayList("values");
      int i = 0;
      int j;
      if ((paramBundle2 != null) && (localObject1 != null) && (paramBundle2.size() == ((ArrayList)localObject1).size())) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        localObject2 = new LinkedHashMap();
        int k = paramBundle2.size();
        for (j = i; j < k; j++)
        {
          paramBundle1 = paramBundle2.get(j);
          i.c(paramBundle1, "null cannot be cast to non-null type kotlin.String");
          ((Map)localObject2).put((String)paramBundle1, ((ArrayList)localObject1).get(j));
        }
        return new e0((HashMap)localObject2);
      }
      throw new IllegalStateException("Invalid bundle passed as restored state".toString());
    }
  }
}

/* Location:
 * Qualified Name:     b1.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */