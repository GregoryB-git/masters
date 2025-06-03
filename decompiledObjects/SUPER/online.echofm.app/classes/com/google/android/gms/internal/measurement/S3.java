package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class S3
{
  public static final S3 d = new S3(true);
  public final d5 a;
  public boolean b;
  public boolean c;
  
  public S3()
  {
    a = d5.b(16);
  }
  
  public S3(d5 paramd5)
  {
    a = paramd5;
    m();
  }
  
  public S3(boolean paramBoolean)
  {
    this(d5.b(0));
    m();
  }
  
  public static int b(U3 paramU3, Object paramObject)
  {
    K5 localK5 = paramU3.b();
    int i = paramU3.a();
    if (paramU3.f())
    {
      paramObject = (List)paramObject;
      boolean bool = paramU3.d();
      int j = 0;
      int k = 0;
      if (bool)
      {
        if (((List)paramObject).isEmpty()) {
          return 0;
        }
        paramU3 = ((List)paramObject).iterator();
        while (paramU3.hasNext()) {
          k += d(localK5, paramU3.next());
        }
        return J3.s0(i) + k + J3.v0(k);
      }
      paramU3 = ((List)paramObject).iterator();
      k = j;
      while (paramU3.hasNext()) {
        k += c(localK5, i, paramU3.next());
      }
      return k;
    }
    return c(localK5, i, paramObject);
  }
  
  public static int c(K5 paramK5, int paramInt, Object paramObject)
  {
    int i = J3.s0(paramInt);
    paramInt = i;
    if (paramK5 == K5.z)
    {
      a4.g((I4)paramObject);
      paramInt = i << 1;
    }
    return paramInt + d(paramK5, paramObject);
  }
  
  public static int d(K5 paramK5, Object paramObject)
  {
    switch (R3.b[paramK5.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 18: 
      if ((paramObject instanceof e4)) {
        return J3.X(((e4)paramObject).a());
      }
      return J3.X(((Integer)paramObject).intValue());
    case 17: 
      return J3.j0(((Long)paramObject).longValue());
    case 16: 
      return J3.o0(((Integer)paramObject).intValue());
    case 15: 
      return J3.f0(((Long)paramObject).longValue());
    case 14: 
      return J3.k0(((Integer)paramObject).intValue());
    case 13: 
      return J3.v0(((Integer)paramObject).intValue());
    case 12: 
      if ((paramObject instanceof q3)) {
        return J3.A((q3)paramObject);
      }
      return J3.i((byte[])paramObject);
    case 11: 
      if ((paramObject instanceof q3)) {
        return J3.A((q3)paramObject);
      }
      return J3.C((String)paramObject);
    case 10: 
      return J3.T((I4)paramObject);
    case 9: 
      return J3.B((I4)paramObject);
    case 8: 
      return J3.h(((Boolean)paramObject).booleanValue());
    case 7: 
      return J3.c0(((Integer)paramObject).intValue());
    case 6: 
      return J3.S(((Long)paramObject).longValue());
    case 5: 
      return J3.g0(((Integer)paramObject).intValue());
    case 4: 
      return J3.n0(((Long)paramObject).longValue());
    case 3: 
      return J3.a0(((Long)paramObject).longValue());
    case 2: 
      return J3.d(((Float)paramObject).floatValue());
    }
    return J3.c(((Double)paramObject).doubleValue());
  }
  
  public static int e(Map.Entry paramEntry)
  {
    a.a(paramEntry.getKey());
    paramEntry.getValue();
    throw null;
  }
  
  public static void j(U3 paramU3, Object paramObject)
  {
    K5 localK5 = paramU3.b();
    a4.e(paramObject);
    boolean bool;
    switch (R3.a[localK5.c().ordinal()])
    {
    default: 
      break;
    case 9: 
      if (!(paramObject instanceof I4)) {
        break label169;
      }
    case 8: 
      if ((goto 168) || ((paramObject instanceof Integer))) {
        break label168;
      }
      if (!(paramObject instanceof e4)) {
        break label169;
      }
    case 7: 
      if ((goto 168) || ((paramObject instanceof q3))) {
        break label168;
      }
      if (!(paramObject instanceof byte[])) {
        break label169;
      }
      break;
    case 6: 
      bool = paramObject instanceof String;
      break;
    case 5: 
      bool = paramObject instanceof Boolean;
      break;
    case 4: 
      bool = paramObject instanceof Double;
      break;
    case 3: 
      bool = paramObject instanceof Float;
      break;
    case 2: 
      bool = paramObject instanceof Long;
      break;
    case 1: 
      bool = paramObject instanceof Integer;
    }
    if (bool) {
      label168:
      return;
    }
    label169:
    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[] { Integer.valueOf(paramU3.a()), paramU3.b().c(), paramObject.getClass().getName() }));
  }
  
  public static boolean k(Map.Entry paramEntry)
  {
    a.a(paramEntry.getKey());
    throw null;
  }
  
  public final int a()
  {
    int i = 0;
    int j = 0;
    while (i < a.g())
    {
      j += e(a.h(i));
      i++;
    }
    Iterator localIterator = a.j().iterator();
    while (localIterator.hasNext()) {
      j += e((Map.Entry)localIterator.next());
    }
    return j;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof S3)) {
      return false;
    }
    paramObject = (S3)paramObject;
    return a.equals(a);
  }
  
  public final void f(S3 paramS3)
  {
    for (int i = 0; i < a.g(); i++) {
      h(a.h(i));
    }
    paramS3 = a.j().iterator();
    while (paramS3.hasNext()) {
      h((Map.Entry)paramS3.next());
    }
  }
  
  public final void g(U3 paramU3, Object paramObject)
  {
    if (paramU3.f())
    {
      if ((paramObject instanceof List))
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll((List)paramObject);
        int i = localArrayList.size();
        int j = 0;
        while (j < i)
        {
          paramObject = localArrayList.get(j);
          j++;
          j(paramU3, paramObject);
        }
        paramObject = localArrayList;
      }
      else
      {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    else {
      j(paramU3, paramObject);
    }
    a.d(paramU3, paramObject);
  }
  
  public final void h(Map.Entry paramEntry)
  {
    a.a(paramEntry.getKey());
    paramEntry.getValue();
    throw null;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final Iterator i()
  {
    if (c) {
      return new m4(a.m().iterator());
    }
    return a.m().iterator();
  }
  
  public final Iterator l()
  {
    if (c) {
      return new m4(a.entrySet().iterator());
    }
    return a.entrySet().iterator();
  }
  
  public final void m()
  {
    if (b) {
      return;
    }
    for (int i = 0; i < a.g(); i++)
    {
      Map.Entry localEntry = a.h(i);
      if ((localEntry.getValue() instanceof Y3)) {
        ((Y3)localEntry.getValue()).C();
      }
    }
    a.f();
    b = true;
  }
  
  public final boolean n()
  {
    for (int i = 0; i < a.g(); i++) {
      if (!k(a.h(i))) {
        return false;
      }
    }
    Iterator localIterator = a.j().iterator();
    while (localIterator.hasNext()) {
      if (!k((Map.Entry)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.S3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */