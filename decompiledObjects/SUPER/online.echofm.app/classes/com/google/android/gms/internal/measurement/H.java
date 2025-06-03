package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class H
{
  public static g a(g paramg, f3 paramf3, n paramn)
  {
    return b(paramg, paramf3, paramn, null, null);
  }
  
  public static g b(g paramg, f3 paramf3, n paramn, Boolean paramBoolean1, Boolean paramBoolean2)
  {
    g localg = new g();
    Iterator localIterator = paramg.Z();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if (paramg.Y(i))
      {
        s locals = paramn.b(paramf3, Arrays.asList(new s[] { paramg.M(i), new k(Double.valueOf(i)), paramg }));
        if (locals.d().equals(paramBoolean1)) {
          return localg;
        }
        if ((paramBoolean2 == null) || (locals.d().equals(paramBoolean2))) {
          localg.X(i, locals);
        }
      }
    }
    return localg;
  }
  
  public static s c(g paramg, f3 paramf3, List paramList, boolean paramBoolean)
  {
    C2.k("reduce", 1, paramList);
    C2.n("reduce", 2, paramList);
    Object localObject = paramf3.b((s)paramList.get(0));
    if ((localObject instanceof n))
    {
      if (paramList.size() == 2)
      {
        paramList = paramf3.b((s)paramList.get(1));
        if ((paramList instanceof l)) {
          throw new IllegalArgumentException("Failed to parse initial value");
        }
      }
      else
      {
        if (paramg.U() == 0) {
          break label315;
        }
        paramList = null;
      }
      n localn = (n)localObject;
      int i = paramg.U();
      int j;
      if (paramBoolean) {
        j = 0;
      } else {
        j = i - 1;
      }
      if (paramBoolean) {
        i--;
      } else {
        i = 0;
      }
      int k;
      if (paramBoolean) {
        k = 1;
      } else {
        k = -1;
      }
      int m = i;
      int n = j;
      localObject = paramList;
      int i1 = k;
      if (paramList == null) {
        paramList = paramg.M(j);
      }
      while ((m - n) * i1 >= 0)
      {
        i = m;
        j = n;
        paramList = (List)localObject;
        k = i1;
        if (paramg.Y(n))
        {
          paramList = localn.b(paramf3, Arrays.asList(new s[] { localObject, paramg.M(n), new k(Double.valueOf(n)), paramg }));
          if (!(paramList instanceof l))
          {
            i = m;
            j = n;
            k = i1;
          }
          else
          {
            throw new IllegalStateException("Reduce operation failed");
          }
        }
        n = j + k;
        m = i;
        localObject = paramList;
        i1 = k;
      }
      return (s)localObject;
      label315:
      throw new IllegalStateException("Empty array with no initial value error");
    }
    throw new IllegalArgumentException("Callback should be a method");
  }
  
  public static s d(String paramString, g paramg, f3 paramf3, List paramList)
  {
    paramString.hashCode();
    switch (paramString.hashCode())
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
              i = -1;
              break;
            } while (!paramString.equals("indexOf"));
            i = 19;
            for (;;)
            {
              break label557;
              if (!paramString.equals("reverse")) {
                break;
              }
              i = 18;
              continue;
              if (!paramString.equals("reduceRight")) {
                break;
              }
              i = 17;
              continue;
              if (!paramString.equals("slice")) {
                break;
              }
              i = 16;
              continue;
              if (!paramString.equals("shift")) {
                break;
              }
              i = 15;
              continue;
              if (!paramString.equals("every")) {
                break;
              }
              i = 14;
              continue;
              if (!paramString.equals("sort")) {
                break;
              }
              i = 13;
              continue;
              if (!paramString.equals("some")) {
                break;
              }
              i = 12;
              continue;
              if (!paramString.equals("push")) {
                break;
              }
              i = 11;
              continue;
              if (!paramString.equals("join")) {
                break;
              }
              i = 10;
              continue;
              if (!paramString.equals("pop")) {
                break;
              }
              i = 9;
              continue;
              if (!paramString.equals("map")) {
                break;
              }
              i = 8;
              continue;
              if (!paramString.equals("unshift")) {
                break;
              }
              i = 7;
              continue;
              if (!paramString.equals("lastIndexOf")) {
                break;
              }
              i = 6;
              continue;
              if (!paramString.equals("forEach")) {
                break;
              }
              i = 5;
              continue;
              if (!paramString.equals("splice")) {
                break;
              }
              i = 4;
            }
          } while (!paramString.equals("reduce"));
          i = 3;
          break;
        } while (!paramString.equals("filter"));
        i = 2;
        break;
      } while (!paramString.equals("concat"));
      i = 1;
      break;
    } while (!paramString.equals("toString"));
    int i = 0;
    label557:
    double d1 = 0.0D;
    double d2;
    int j;
    int k;
    Object localObject;
    switch (i)
    {
    default: 
      throw new IllegalArgumentException("Command not supported");
    case 19: 
      C2.n("indexOf", 2, paramList);
      paramString = s.d;
      if (!paramList.isEmpty()) {
        paramString = paramf3.b((s)paramList.get(0));
      }
      if (paramList.size() > 1)
      {
        d1 = C2.a(paramf3.b((s)paramList.get(1)).f().doubleValue());
        if (d1 >= paramg.U()) {
          return new k(Double.valueOf(-1.0D));
        }
        if (d1 < 0.0D) {
          d1 = paramg.U() + d1;
        }
      }
      paramf3 = paramg.Z();
      while (paramf3.hasNext())
      {
        i = ((Integer)paramf3.next()).intValue();
        d2 = i;
        if ((d2 >= d1) && (C2.h(paramg.M(i), paramString))) {
          return new k(Double.valueOf(d2));
        }
      }
      return new k(Double.valueOf(-1.0D));
    case 18: 
      C2.g("reverse", 0, paramList);
      j = paramg.U();
      if (j != 0) {
        for (i = 0; i < j / 2; i++) {
          if (paramg.Y(i))
          {
            paramString = paramg.M(i);
            paramg.X(i, null);
            k = j - 1 - i;
            if (paramg.Y(k)) {
              paramg.X(i, paramg.M(k));
            }
            paramg.X(k, paramString);
          }
        }
      }
      return paramg;
    case 17: 
      return c(paramg, paramf3, paramList, false);
    case 16: 
      C2.n("slice", 2, paramList);
      if (paramList.isEmpty()) {
        return paramg.c();
      }
      double d3 = paramg.U();
      d1 = C2.a(paramf3.b((s)paramList.get(0)).f().doubleValue());
      if (d1 < 0.0D) {
        d2 = Math.max(d1 + d3, 0.0D);
      } else {
        d2 = Math.min(d1, d3);
      }
      d1 = d3;
      if (paramList.size() == 2)
      {
        d1 = C2.a(paramf3.b((s)paramList.get(1)).f().doubleValue());
        if (d1 < 0.0D) {
          d1 = Math.max(d3 + d1, 0.0D);
        } else {
          d1 = Math.min(d3, d1);
        }
      }
      paramString = new g();
      for (i = (int)d2; i < d1; i++) {
        paramString.T(paramg.M(i));
      }
      return paramString;
    case 15: 
      C2.g("shift", 0, paramList);
      if (paramg.U() == 0) {
        return s.d;
      }
      paramString = paramg.M(0);
      paramg.W(0);
      return paramString;
    case 14: 
      C2.g("every", 1, paramList);
      paramString = paramf3.b((s)paramList.get(0));
      if ((paramString instanceof t))
      {
        if ((paramg.U() != 0) && (b(paramg, paramf3, (t)paramString, Boolean.FALSE, Boolean.TRUE).U() != paramg.U())) {
          return s.j;
        }
        return s.i;
      }
      throw new IllegalArgumentException("Callback should be a method");
    case 13: 
      C2.n("sort", 1, paramList);
      if (paramg.U() >= 2)
      {
        localObject = paramg.a0();
        if (!paramList.isEmpty())
        {
          paramString = paramf3.b((s)paramList.get(0));
          if ((paramString instanceof n)) {
            paramString = (n)paramString;
          } else {
            throw new IllegalArgumentException("Comparator should be a method");
          }
        }
        else
        {
          paramString = null;
        }
        Collections.sort((List)localObject, new K(paramString, paramf3));
        paramg.b0();
        paramString = ((List)localObject).iterator();
        for (i = 0; paramString.hasNext(); i++) {
          paramg.X(i, (s)paramString.next());
        }
      }
      return paramg;
    case 12: 
      C2.g("some", 1, paramList);
      paramString = paramf3.b((s)paramList.get(0));
      if ((paramString instanceof n))
      {
        if (paramg.U() != 0)
        {
          paramString = (n)paramString;
          paramList = paramg.Z();
          while (paramList.hasNext())
          {
            i = ((Integer)paramList.next()).intValue();
            if (paramg.Y(i)) {
              if (paramString.b(paramf3, Arrays.asList(new s[] { paramg.M(i), new k(Double.valueOf(i)), paramg })).d().booleanValue()) {
                return s.i;
              }
            }
          }
        }
        return s.j;
      }
      throw new IllegalArgumentException("Callback should be a method");
    case 11: 
      if (!paramList.isEmpty())
      {
        paramString = paramList.iterator();
        while (paramString.hasNext()) {
          paramg.T(paramf3.b((s)paramString.next()));
        }
      }
      return new k(Double.valueOf(paramg.U()));
    case 10: 
      C2.n("join", 1, paramList);
      if (paramg.U() == 0) {
        return s.k;
      }
      if (!paramList.isEmpty())
      {
        paramString = paramf3.b((s)paramList.get(0));
        if ((!(paramString instanceof q)) && (!(paramString instanceof z))) {
          paramString = paramString.g();
        } else {
          paramString = "";
        }
      }
      else
      {
        paramString = ",";
      }
      return new u(paramg.V(paramString));
    case 9: 
      C2.g("pop", 0, paramList);
      i = paramg.U();
      if (i == 0) {
        return s.d;
      }
      i--;
      paramString = paramg.M(i);
      paramg.W(i);
      return paramString;
    case 8: 
      C2.g("map", 1, paramList);
      paramString = paramf3.b((s)paramList.get(0));
      if ((paramString instanceof t))
      {
        if (paramg.U() == 0) {
          return new g();
        }
        return a(paramg, paramf3, (t)paramString);
      }
      throw new IllegalArgumentException("Callback should be a method");
    case 7: 
      if (!paramList.isEmpty())
      {
        paramString = new g();
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          localObject = paramf3.b((s)paramList.next());
          if (!(localObject instanceof l)) {
            paramString.T((s)localObject);
          } else {
            throw new IllegalStateException("Argument evaluation failed");
          }
        }
        i = paramString.U();
        paramf3 = paramg.Z();
        while (paramf3.hasNext())
        {
          paramList = (Integer)paramf3.next();
          paramString.X(paramList.intValue() + i, paramg.M(paramList.intValue()));
        }
        paramg.b0();
        paramf3 = paramString.Z();
        while (paramf3.hasNext())
        {
          paramList = (Integer)paramf3.next();
          paramg.X(paramList.intValue(), paramString.M(paramList.intValue()));
        }
      }
      return new k(Double.valueOf(paramg.U()));
    case 6: 
      C2.n("lastIndexOf", 2, paramList);
      paramString = s.d;
      if (!paramList.isEmpty()) {
        paramString = paramf3.b((s)paramList.get(0));
      }
      d1 = paramg.U() - 1;
      if (paramList.size() > 1)
      {
        paramf3 = paramf3.b((s)paramList.get(1));
        if (Double.isNaN(paramf3.f().doubleValue())) {}
        for (d1 = paramg.U() - 1;; d1 = C2.a(paramf3.f().doubleValue()))
        {
          d2 = d1;
          break;
        }
        d1 = d2;
        if (d2 < 0.0D) {
          d1 = d2 + paramg.U();
        }
      }
      if (d1 < 0.0D) {
        return new k(Double.valueOf(-1.0D));
      }
      for (i = (int)Math.min(paramg.U(), d1); i >= 0; i--) {
        if ((paramg.Y(i)) && (C2.h(paramg.M(i), paramString))) {
          return new k(Double.valueOf(i));
        }
      }
      return new k(Double.valueOf(-1.0D));
    case 5: 
      C2.g("forEach", 1, paramList);
      paramString = paramf3.b((s)paramList.get(0));
      if ((paramString instanceof t))
      {
        if (paramg.D() == 0) {
          return s.d;
        }
        a(paramg, paramf3, (t)paramString);
        return s.d;
      }
      throw new IllegalArgumentException("Callback should be a method");
    case 4: 
      if (paramList.isEmpty()) {
        return new g();
      }
      j = (int)C2.a(paramf3.b((s)paramList.get(0)).f().doubleValue());
      if (j < 0)
      {
        i = Math.max(0, j + paramg.U());
      }
      else
      {
        i = j;
        if (j > paramg.U()) {
          i = paramg.U();
        }
      }
      k = paramg.U();
      localObject = new g();
      j = i;
      if (paramList.size() > 1)
      {
        int m = Math.max(0, (int)C2.a(paramf3.b((s)paramList.get(1)).f().doubleValue()));
        if (m > 0) {
          for (j = i; j < Math.min(k, i + m); j++)
          {
            ((g)localObject).T(paramg.M(i));
            paramg.W(i);
          }
        }
        if (paramList.size() > 2)
        {
          j = 2;
          while (j < paramList.size())
          {
            paramString = paramf3.b((s)paramList.get(j));
            if (!(paramString instanceof l))
            {
              paramg.S(i + j - 2, paramString);
              j++;
            }
            else
            {
              throw new IllegalArgumentException("Failed to parse elements to add");
            }
          }
        }
        return (s)localObject;
      }
      while (j < k)
      {
        ((g)localObject).T(paramg.M(j));
        paramg.X(j, null);
        j++;
      }
      return (s)localObject;
    case 3: 
      return c(paramg, paramf3, paramList, true);
    case 2: 
      C2.g("filter", 1, paramList);
      paramList = paramf3.b((s)paramList.get(0));
      if ((paramList instanceof t))
      {
        if (paramg.D() == 0) {
          return new g();
        }
        paramString = (g)paramg.c();
        paramf3 = b(paramg, paramf3, (t)paramList, null, Boolean.TRUE);
        paramg = new g();
        paramf3 = paramf3.Z();
        while (paramf3.hasNext()) {
          paramg.T(paramString.M(((Integer)paramf3.next()).intValue()));
        }
        return paramg;
      }
      throw new IllegalArgumentException("Callback should be a method");
    case 1: 
      paramString = (g)paramg.c();
      if (!paramList.isEmpty())
      {
        paramg = paramList.iterator();
        while (paramg.hasNext())
        {
          paramList = paramf3.b((s)paramg.next());
          if (!(paramList instanceof l))
          {
            i = paramString.U();
            if ((paramList instanceof g))
            {
              paramList = (g)paramList;
              localObject = paramList.Z();
              while (((Iterator)localObject).hasNext())
              {
                Integer localInteger = (Integer)((Iterator)localObject).next();
                paramString.X(localInteger.intValue() + i, paramList.M(localInteger.intValue()));
              }
            }
            paramString.X(i, paramList);
          }
          else
          {
            throw new IllegalStateException("Failed evaluation of arguments");
          }
        }
      }
      return paramString;
    }
    C2.g("toString", 0, paramList);
    return new u(paramg.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */