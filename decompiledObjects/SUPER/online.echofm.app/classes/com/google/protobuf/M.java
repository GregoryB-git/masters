package com.google.protobuf;

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

public abstract class M
{
  public static final char[] a;
  
  static
  {
    char[] arrayOfChar = new char[80];
    a = arrayOfChar;
    Arrays.fill(arrayOfChar, ' ');
  }
  
  public static void a(int paramInt, StringBuilder paramStringBuilder)
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
  
  public static boolean b(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Boolean;
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    boolean bool5 = true;
    boolean bool6 = true;
    if (bool1) {
      return ((Boolean)paramObject).booleanValue() ^ true;
    }
    if ((paramObject instanceof Integer))
    {
      if (((Integer)paramObject).intValue() != 0) {
        bool6 = false;
      }
      return bool6;
    }
    if ((paramObject instanceof Float))
    {
      if (Float.floatToRawIntBits(((Float)paramObject).floatValue()) == 0) {
        bool6 = bool2;
      } else {
        bool6 = false;
      }
      return bool6;
    }
    if ((paramObject instanceof Double))
    {
      if (Double.doubleToRawLongBits(((Double)paramObject).doubleValue()) == 0L) {
        bool6 = bool3;
      } else {
        bool6 = false;
      }
      return bool6;
    }
    if ((paramObject instanceof String)) {}
    for (Object localObject = "";; localObject = f.p)
    {
      return paramObject.equals(localObject);
      if (!(paramObject instanceof f)) {
        break;
      }
    }
    if ((paramObject instanceof K))
    {
      if (paramObject == ((K)paramObject).b()) {
        bool6 = bool4;
      } else {
        bool6 = false;
      }
      return bool6;
    }
    if ((paramObject instanceof Enum))
    {
      if (((Enum)paramObject).ordinal() == 0) {
        bool6 = bool5;
      } else {
        bool6 = false;
      }
      return bool6;
    }
    return false;
  }
  
  public static String c(String paramString)
  {
    if (paramString.isEmpty()) {
      return paramString;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Character.toLowerCase(paramString.charAt(0)));
    for (int i = 1; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);
      if (Character.isUpperCase(c)) {
        localStringBuilder.append("_");
      }
      localStringBuilder.append(Character.toLowerCase(c));
    }
    return localStringBuilder.toString();
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
    a(paramInt, paramStringBuilder);
    paramStringBuilder.append(c(paramString));
    if ((paramObject instanceof String)) {
      paramStringBuilder.append(": \"");
    }
    for (paramString = e0.c((String)paramObject);; paramString = e0.a((f)paramObject))
    {
      paramStringBuilder.append(paramString);
      paramStringBuilder.append('"');
      return;
      if (!(paramObject instanceof f)) {
        break;
      }
      paramStringBuilder.append(": \"");
    }
    if ((paramObject instanceof r))
    {
      paramStringBuilder.append(" {");
      e((r)paramObject, paramStringBuilder, paramInt + 2);
    }
    for (;;)
    {
      paramStringBuilder.append("\n");
      a(paramInt, paramStringBuilder);
      paramStringBuilder.append("}");
      return;
      if (!(paramObject instanceof Map.Entry)) {
        break;
      }
      paramStringBuilder.append(" {");
      paramString = (Map.Entry)paramObject;
      int i = paramInt + 2;
      d(paramStringBuilder, i, "key", paramString.getKey());
      d(paramStringBuilder, i, "value", paramString.getValue());
    }
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject);
  }
  
  public static void e(K paramK, StringBuilder paramStringBuilder, int paramInt)
  {
    HashSet localHashSet = new HashSet();
    HashMap localHashMap = new HashMap();
    TreeMap localTreeMap = new TreeMap();
    Object localObject1 = paramK.getClass().getDeclaredMethods();
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
      Object localObject3 = (Map.Entry)((Iterator)localObject1).next();
      localObject2 = ((String)((Map.Entry)localObject3).getKey()).substring(j);
      Object localObject4;
      if ((((String)localObject2).endsWith("List")) && (!((String)localObject2).endsWith("OrBuilderList")) && (!((String)localObject2).equals("List")))
      {
        localObject4 = (Method)((Map.Entry)localObject3).getValue();
        if ((localObject4 != null) && (((Method)localObject4).getReturnType().equals(List.class)))
        {
          d(paramStringBuilder, paramInt, ((String)localObject2).substring(0, ((String)localObject2).length() - 4), r.F((Method)localObject4, paramK, new Object[0]));
          j = 3;
          continue;
        }
      }
      if ((((String)localObject2).endsWith("Map")) && (!((String)localObject2).equals("Map")))
      {
        localObject4 = (Method)((Map.Entry)localObject3).getValue();
        if ((localObject4 != null) && (((Method)localObject4).getReturnType().equals(Map.class)) && (!((AccessibleObject)localObject4).isAnnotationPresent(Deprecated.class)) && (Modifier.isPublic(((Method)localObject4).getModifiers()))) {
          d(paramStringBuilder, paramInt, ((String)localObject2).substring(0, ((String)localObject2).length() - 3), r.F((Method)localObject4, paramK, new Object[0]));
        }
      }
      for (;;)
      {
        j = 3;
        break;
        localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append("set");
        ((StringBuilder)localObject4).append((String)localObject2);
        if (localHashSet.contains(((StringBuilder)localObject4).toString()))
        {
          do
          {
            if (!((String)localObject2).endsWith("Bytes")) {
              break;
            }
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append("get");
            ((StringBuilder)localObject4).append(((String)localObject2).substring(0, ((String)localObject2).length() - 5));
          } while (localTreeMap.containsKey(((StringBuilder)localObject4).toString()));
          localObject3 = (Method)((Map.Entry)localObject3).getValue();
          localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append("has");
          ((StringBuilder)localObject4).append((String)localObject2);
          localObject4 = (Method)localHashMap.get(((StringBuilder)localObject4).toString());
          if (localObject3 != null)
          {
            localObject3 = r.F((Method)localObject3, paramK, new Object[0]);
            if (localObject4 == null ? !b(localObject3) : ((Boolean)r.F((Method)localObject4, paramK, new Object[0])).booleanValue()) {
              d(paramStringBuilder, paramInt, (String)localObject2, localObject3);
            }
          }
        }
      }
    }
    paramK = unknownFields;
    if (paramK != null) {
      paramK.l(paramStringBuilder, paramInt);
    }
  }
  
  public static String f(K paramK, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("# ");
    localStringBuilder.append(paramString);
    e(paramK, localStringBuilder, 0);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.M
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */