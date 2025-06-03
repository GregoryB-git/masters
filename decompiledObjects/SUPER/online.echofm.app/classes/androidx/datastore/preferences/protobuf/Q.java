package androidx.datastore.preferences.protobuf;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public abstract class Q
{
  public static final String a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);
      if (Character.isUpperCase(c)) {
        localStringBuilder.append("_");
      }
      localStringBuilder.append(Character.toLowerCase(c));
    }
    return localStringBuilder.toString();
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
      if (((Float)paramObject).floatValue() == 0.0F) {
        bool6 = bool2;
      } else {
        bool6 = false;
      }
      return bool6;
    }
    if ((paramObject instanceof Double))
    {
      if (((Double)paramObject).doubleValue() == 0.0D) {
        bool6 = bool3;
      } else {
        bool6 = false;
      }
      return bool6;
    }
    if ((paramObject instanceof String)) {}
    for (Object localObject = "";; localObject = g.p)
    {
      return paramObject.equals(localObject);
      if (!(paramObject instanceof g)) {
        break;
      }
    }
    if ((paramObject instanceof O))
    {
      if (paramObject == ((O)paramObject).b()) {
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
  
  public static final void c(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if ((paramObject instanceof List))
    {
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        c(paramStringBuilder, paramInt, paramString, ((Iterator)paramObject).next());
      }
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext()) {
        c(paramStringBuilder, paramInt, paramString, (Map.Entry)((Iterator)paramObject).next());
      }
      return;
    }
    paramStringBuilder.append('\n');
    int i = 0;
    int j = 0;
    for (int k = 0; k < paramInt; k++) {
      paramStringBuilder.append(' ');
    }
    paramStringBuilder.append(paramString);
    if ((paramObject instanceof String)) {
      paramStringBuilder.append(": \"");
    }
    for (paramString = j0.c((String)paramObject);; paramString = j0.a((g)paramObject))
    {
      paramStringBuilder.append(paramString);
      paramStringBuilder.append('"');
      return;
      if (!(paramObject instanceof g)) {
        break;
      }
      paramStringBuilder.append(": \"");
    }
    if ((paramObject instanceof w))
    {
      paramStringBuilder.append(" {");
      d((w)paramObject, paramStringBuilder, paramInt + 2);
      paramStringBuilder.append("\n");
      for (k = j; k < paramInt; k++) {
        paramStringBuilder.append(' ');
      }
    }
    for (;;)
    {
      paramStringBuilder.append("}");
      return;
      if (!(paramObject instanceof Map.Entry)) {
        break;
      }
      paramStringBuilder.append(" {");
      paramString = (Map.Entry)paramObject;
      k = paramInt + 2;
      c(paramStringBuilder, k, "key", paramString.getKey());
      c(paramStringBuilder, k, "value", paramString.getValue());
      paramStringBuilder.append("\n");
      for (k = i; k < paramInt; k++) {
        paramStringBuilder.append(' ');
      }
    }
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject.toString());
  }
  
  public static void d(O paramO, StringBuilder paramStringBuilder, int paramInt)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Object localObject1 = new TreeSet();
    Object localObject3;
    for (localObject3 : paramO.getClass().getDeclaredMethods())
    {
      localHashMap2.put(((Method)localObject3).getName(), localObject3);
      if (((Method)localObject3).getParameterTypes().length == 0)
      {
        localHashMap1.put(((Method)localObject3).getName(), localObject3);
        if (((Method)localObject3).getName().startsWith("get")) {
          ((Set)localObject1).add(((Method)localObject3).getName());
        }
      }
    }
    ??? = ((Set)localObject1).iterator();
    while (((Iterator)???).hasNext())
    {
      localObject1 = (String)((Iterator)???).next();
      localObject3 = ((String)localObject1).replaceFirst("get", "");
      Object localObject4;
      Object localObject5;
      if ((((String)localObject3).endsWith("List")) && (!((String)localObject3).endsWith("OrBuilderList")) && (!((String)localObject3).equals("List")))
      {
        localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append(((String)localObject3).substring(0, 1).toLowerCase());
        ((StringBuilder)localObject4).append(((String)localObject3).substring(1, ((String)localObject3).length() - 4));
        localObject5 = ((StringBuilder)localObject4).toString();
        localObject4 = (Method)localHashMap1.get(localObject1);
        if ((localObject4 != null) && (((Method)localObject4).getReturnType().equals(List.class)))
        {
          c(paramStringBuilder, paramInt, a((String)localObject5), w.w((Method)localObject4, paramO, new Object[0]));
          continue;
        }
      }
      if ((((String)localObject3).endsWith("Map")) && (!((String)localObject3).equals("Map")))
      {
        localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append(((String)localObject3).substring(0, 1).toLowerCase());
        ((StringBuilder)localObject4).append(((String)localObject3).substring(1, ((String)localObject3).length() - 3));
        localObject4 = ((StringBuilder)localObject4).toString();
        localObject1 = (Method)localHashMap1.get(localObject1);
        if ((localObject1 != null) && (((Method)localObject1).getReturnType().equals(Map.class)) && (!((AccessibleObject)localObject1).isAnnotationPresent(Deprecated.class)) && (Modifier.isPublic(((Method)localObject1).getModifiers())))
        {
          c(paramStringBuilder, paramInt, a((String)localObject4), w.w((Method)localObject1, paramO, new Object[0]));
          continue;
        }
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("set");
      ((StringBuilder)localObject1).append((String)localObject3);
      if ((Method)localHashMap2.get(((StringBuilder)localObject1).toString()) != null) {
        if (((String)localObject3).endsWith("Bytes"))
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("get");
          ((StringBuilder)localObject1).append(((String)localObject3).substring(0, ((String)localObject3).length() - 5));
          if (localHashMap1.containsKey(((StringBuilder)localObject1).toString())) {}
        }
        else
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append(((String)localObject3).substring(0, 1).toLowerCase());
          ((StringBuilder)localObject1).append(((String)localObject3).substring(1));
          localObject1 = ((StringBuilder)localObject1).toString();
          localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append("get");
          ((StringBuilder)localObject4).append((String)localObject3);
          localObject4 = (Method)localHashMap1.get(((StringBuilder)localObject4).toString());
          localObject5 = new StringBuilder();
          ((StringBuilder)localObject5).append("has");
          ((StringBuilder)localObject5).append((String)localObject3);
          localObject3 = (Method)localHashMap1.get(((StringBuilder)localObject5).toString());
          if (localObject4 != null)
          {
            localObject4 = w.w((Method)localObject4, paramO, new Object[0]);
            if (localObject3 == null ? !b(localObject4) : ((Boolean)w.w((Method)localObject3, paramO, new Object[0])).booleanValue()) {
              c(paramStringBuilder, paramInt, a((String)localObject1), localObject4);
            }
          }
        }
      }
    }
    paramO = unknownFields;
    if (paramO != null) {
      paramO.m(paramStringBuilder, paramInt);
    }
  }
  
  public static String e(O paramO, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("# ");
    localStringBuilder.append(paramString);
    d(paramO, localStringBuilder, 0);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.Q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */