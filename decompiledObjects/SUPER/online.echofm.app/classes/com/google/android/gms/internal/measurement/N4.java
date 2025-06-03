package com.google.android.gms.internal.measurement;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public abstract class N4
{
  public static final char[] a;
  
  static
  {
    char[] arrayOfChar = new char[80];
    a = arrayOfChar;
    Arrays.fill(arrayOfChar, ' ');
  }
  
  public static String a(I4 paramI4, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("# ");
    localStringBuilder.append(paramString);
    c(paramI4, localStringBuilder, 0);
    return localStringBuilder.toString();
  }
  
  public static void b(int paramInt, StringBuilder paramStringBuilder)
  {
    while (paramInt > 0)
    {
      char[] arrayOfChar = a;
      int i;
      if (paramInt > arrayOfChar.length) {
        i = arrayOfChar.length;
      } else {
        i = paramInt;
      }
      paramStringBuilder.append(arrayOfChar, 0, i);
      paramInt -= i;
    }
  }
  
  public static void c(I4 paramI4, StringBuilder paramStringBuilder, int paramInt)
  {
    HashSet localHashSet = new HashSet();
    HashMap localHashMap = new HashMap();
    TreeMap localTreeMap = new TreeMap();
    Object localObject1 = paramI4.getClass().getDeclaredMethods();
    int i = localObject1.length;
    int k;
    Object localObject2;
    for (int j = 0;; j++)
    {
      k = 3;
      if (j >= i) {
        break;
      }
      localObject2 = localObject1[j];
      if ((!Modifier.isStatic(((Method)localObject2).getModifiers())) && (((Method)localObject2).getName().length() >= 3)) {
        if (((Method)localObject2).getName().startsWith("set")) {
          localHashSet.add(((Method)localObject2).getName());
        } else if ((Modifier.isPublic(((Method)localObject2).getModifiers())) && (((Method)localObject2).getParameterTypes().length == 0)) {
          if (((Method)localObject2).getName().startsWith("has")) {
            localHashMap.put(((Method)localObject2).getName(), localObject2);
          } else if (((Method)localObject2).getName().startsWith("get")) {
            localTreeMap.put(((Method)localObject2).getName(), localObject2);
          }
        }
      }
    }
    localObject1 = localTreeMap.entrySet().iterator();
    j = k;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      String str1 = ((String)((Map.Entry)localObject2).getKey()).substring(j);
      Object localObject3;
      if ((str1.endsWith("List")) && (!str1.endsWith("OrBuilderList")) && (!str1.equals("List")))
      {
        localObject3 = (Method)((Map.Entry)localObject2).getValue();
        if ((localObject3 != null) && (((Method)localObject3).getReturnType().equals(List.class)))
        {
          d(paramStringBuilder, paramInt, str1.substring(0, str1.length() - 4), Y3.s((Method)localObject3, paramI4, new Object[0]));
          j = 3;
          continue;
        }
      }
      if ((str1.endsWith("Map")) && (!str1.equals("Map")))
      {
        localObject3 = (Method)((Map.Entry)localObject2).getValue();
        if ((localObject3 != null) && (((Method)localObject3).getReturnType().equals(Map.class)) && (!((AccessibleObject)localObject3).isAnnotationPresent(Deprecated.class)) && (Modifier.isPublic(((Method)localObject3).getModifiers()))) {
          d(paramStringBuilder, paramInt, str1.substring(0, str1.length() - 3), Y3.s((Method)localObject3, paramI4, new Object[0]));
        }
      }
      for (;;)
      {
        j = 3;
        break;
        localObject3 = new StringBuilder("set");
        ((StringBuilder)localObject3).append(str1);
        if (localHashSet.contains(((StringBuilder)localObject3).toString())) {
          if (str1.endsWith("Bytes"))
          {
            String str2 = str1.substring(0, str1.length() - 5);
            localObject3 = new StringBuilder("get");
            ((StringBuilder)localObject3).append(str2);
            if (localTreeMap.containsKey(((StringBuilder)localObject3).toString())) {}
          }
          else
          {
            localObject3 = (Method)((Map.Entry)localObject2).getValue();
            localObject2 = new StringBuilder("has");
            ((StringBuilder)localObject2).append(str1);
            localObject2 = (Method)localHashMap.get(((StringBuilder)localObject2).toString());
            if (localObject3 != null)
            {
              localObject3 = Y3.s((Method)localObject3, paramI4, new Object[0]);
              if (localObject2 == null)
              {
                if ((localObject3 instanceof Boolean))
                {
                  if (((Boolean)localObject3).booleanValue()) {}
                }
                else if ((localObject3 instanceof Integer))
                {
                  if (((Integer)localObject3).intValue() != 0) {}
                }
                else if ((localObject3 instanceof Float))
                {
                  if (Float.floatToRawIntBits(((Float)localObject3).floatValue()) != 0) {}
                }
                else if ((localObject3 instanceof Double))
                {
                  if (Double.doubleToRawLongBits(((Double)localObject3).doubleValue()) != 0L) {}
                }
                else
                {
                  if ((localObject3 instanceof String)) {}
                  boolean bool;
                  for (localObject2 = "";; localObject2 = q3.p)
                  {
                    bool = localObject3.equals(localObject2);
                    break;
                    if (!(localObject3 instanceof q3)) {
                      break label758;
                    }
                  }
                  if (bool) {
                    continue;
                  }
                  break label825;
                  label758:
                  if ((localObject3 instanceof I4))
                  {
                    if (localObject3 != ((I4)localObject3).b()) {}
                  }
                  else if ((!(localObject3 instanceof Enum)) || (((Enum)localObject3).ordinal() != 0)) {}
                }
              }
              else {
                if (!((Boolean)Y3.s((Method)localObject2, paramI4, new Object[0])).booleanValue()) {
                  continue;
                }
              }
              label825:
              d(paramStringBuilder, paramInt, str1, localObject3);
            }
          }
        }
      }
    }
    paramI4 = zzb;
    if (paramI4 != null) {
      paramI4.h(paramStringBuilder, paramInt);
    }
  }
  
  public static void d(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if ((paramObject instanceof List))
    {
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        d(paramStringBuilder, paramInt, paramString, ((Iterator)paramObject).next());
      }
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext()) {
        d(paramStringBuilder, paramInt, paramString, (Map.Entry)((Iterator)paramObject).next());
      }
      return;
    }
    paramStringBuilder.append('\n');
    b(paramInt, paramStringBuilder);
    int i;
    if (!paramString.isEmpty())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(Character.toLowerCase(paramString.charAt(0)));
      for (i = 1; i < paramString.length(); i++)
      {
        char c = paramString.charAt(i);
        if (Character.isUpperCase(c)) {
          localStringBuilder.append("_");
        }
        localStringBuilder.append(Character.toLowerCase(c));
      }
      paramString = localStringBuilder.toString();
    }
    paramStringBuilder.append(paramString);
    if ((paramObject instanceof String))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(s5.a(q3.k((String)paramObject)));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof q3))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(s5.a((q3)paramObject));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof Y3))
    {
      paramStringBuilder.append(" {");
      c((Y3)paramObject, paramStringBuilder, paramInt + 2);
      paramStringBuilder.append("\n");
      b(paramInt, paramStringBuilder);
      paramStringBuilder.append("}");
      return;
    }
    if ((paramObject instanceof Map.Entry))
    {
      paramStringBuilder.append(" {");
      paramString = (Map.Entry)paramObject;
      i = paramInt + 2;
      d(paramStringBuilder, i, "key", paramString.getKey());
      d(paramStringBuilder, i, "value", paramString.getValue());
      paramStringBuilder.append("\n");
      b(paramInt, paramStringBuilder);
      paramStringBuilder.append("}");
      return;
    }
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.N4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */