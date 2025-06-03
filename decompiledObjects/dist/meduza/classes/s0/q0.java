package s0;

import b.a0;
import f;
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

public final class q0
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
  
  public static final void b(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if ((paramObject instanceof List))
    {
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        b(paramStringBuilder, paramInt, paramString, ((Iterator)paramObject).next());
      }
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext()) {
        b(paramStringBuilder, paramInt, paramString, (Map.Entry)((Iterator)paramObject).next());
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
    if ((paramObject instanceof String))
    {
      paramStringBuilder.append(": \"");
      paramString = (String)paramObject;
      paramObject = g.b;
      paramString = a0.q(new g.e(paramString.getBytes(x.a)));
    }
    else
    {
      if (!(paramObject instanceof g)) {
        break label215;
      }
      paramStringBuilder.append(": \"");
      paramString = a0.q((g)paramObject);
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append('"');
    return;
    label215:
    if ((paramObject instanceof v))
    {
      paramStringBuilder.append(" {");
      c((v)paramObject, paramStringBuilder, paramInt + 2);
      paramStringBuilder.append("\n");
      for (k = j; k < paramInt; k++) {
        paramStringBuilder.append(' ');
      }
    }
    if ((paramObject instanceof Map.Entry))
    {
      paramStringBuilder.append(" {");
      paramString = (Map.Entry)paramObject;
      k = paramInt + 2;
      b(paramStringBuilder, k, "key", paramString.getKey());
      b(paramStringBuilder, k, "value", paramString.getValue());
      paramStringBuilder.append("\n");
      for (k = i; k < paramInt; k++) {
        paramStringBuilder.append(' ');
      }
      paramString = "}";
    }
    else
    {
      paramStringBuilder.append(": ");
      paramString = paramObject.toString();
    }
    paramStringBuilder.append(paramString);
  }
  
  public static void c(o0 paramo0, StringBuilder paramStringBuilder, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    Object localObject1 = new HashMap();
    Object localObject2 = new TreeSet();
    Object localObject3 = paramo0.getClass().getDeclaredMethods();
    int i = localObject3.length;
    int j = 0;
    Object localObject4;
    for (int k = 0; k < i; k++)
    {
      localObject4 = localObject3[k];
      ((HashMap)localObject1).put(((Method)localObject4).getName(), localObject4);
      if (((Method)localObject4).getParameterTypes().length == 0)
      {
        localHashMap.put(((Method)localObject4).getName(), localObject4);
        if (((Method)localObject4).getName().startsWith("get")) {
          ((TreeSet)localObject2).add(((Method)localObject4).getName());
        }
      }
    }
    localObject2 = ((TreeSet)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject5 = (String)((Iterator)localObject2).next();
      localObject3 = "";
      localObject4 = ((String)localObject5).replaceFirst("get", "");
      boolean bool1 = ((String)localObject4).endsWith("List");
      boolean bool2 = true;
      Object localObject6;
      Object localObject7;
      if ((bool1) && (!((String)localObject4).endsWith("OrBuilderList")) && (!((String)localObject4).equals("List")))
      {
        localObject6 = new StringBuilder();
        ((StringBuilder)localObject6).append(((String)localObject4).substring(0, 1).toLowerCase());
        ((StringBuilder)localObject6).append(((String)localObject4).substring(1, ((String)localObject4).length() - 4));
        localObject7 = ((StringBuilder)localObject6).toString();
        localObject6 = (Method)localHashMap.get(localObject5);
        if ((localObject6 != null) && (((Method)localObject6).getReturnType().equals(List.class)))
        {
          b(paramStringBuilder, paramInt, a((String)localObject7), v.m((Method)localObject6, paramo0, new Object[0]));
          continue;
        }
      }
      if ((((String)localObject4).endsWith("Map")) && (!((String)localObject4).equals("Map")))
      {
        localObject6 = new StringBuilder();
        ((StringBuilder)localObject6).append(((String)localObject4).substring(0, 1).toLowerCase());
        ((StringBuilder)localObject6).append(((String)localObject4).substring(1, ((String)localObject4).length() - 3));
        localObject6 = ((StringBuilder)localObject6).toString();
        localObject5 = (Method)localHashMap.get(localObject5);
        if ((localObject5 != null) && (((Method)localObject5).getReturnType().equals(Map.class)) && (!((AccessibleObject)localObject5).isAnnotationPresent(Deprecated.class)) && (Modifier.isPublic(((Method)localObject5).getModifiers())))
        {
          b(paramStringBuilder, paramInt, a((String)localObject6), v.m((Method)localObject5, paramo0, new Object[0]));
          continue;
        }
      }
      localObject5 = new StringBuilder();
      ((StringBuilder)localObject5).append("set");
      ((StringBuilder)localObject5).append((String)localObject4);
      if ((Method)((HashMap)localObject1).get(((StringBuilder)localObject5).toString()) != null) {
        if (((String)localObject4).endsWith("Bytes"))
        {
          localObject5 = f.l("get");
          ((StringBuilder)localObject5).append(((String)localObject4).substring(0, ((String)localObject4).length() - 5));
          if (localHashMap.containsKey(((StringBuilder)localObject5).toString())) {}
        }
        else
        {
          localObject5 = new StringBuilder();
          ((StringBuilder)localObject5).append(((String)localObject4).substring(0, 1).toLowerCase());
          ((StringBuilder)localObject5).append(((String)localObject4).substring(1));
          localObject5 = ((StringBuilder)localObject5).toString();
          localObject6 = new StringBuilder();
          ((StringBuilder)localObject6).append("get");
          ((StringBuilder)localObject6).append((String)localObject4);
          localObject6 = (Method)localHashMap.get(((StringBuilder)localObject6).toString());
          localObject7 = new StringBuilder();
          ((StringBuilder)localObject7).append("has");
          ((StringBuilder)localObject7).append((String)localObject4);
          localObject7 = (Method)localHashMap.get(((StringBuilder)localObject7).toString());
          if (localObject6 != null)
          {
            localObject4 = v.m((Method)localObject6, paramo0, new Object[0]);
            if (localObject7 == null)
            {
              if ((localObject4 instanceof Boolean))
              {
                bool1 = ((Boolean)localObject4).booleanValue() ^ true;
              }
              else
              {
                if ((localObject4 instanceof Integer))
                {
                  if (((Integer)localObject4).intValue() != 0) {
                    break label871;
                  }
                }
                else if ((localObject4 instanceof Float))
                {
                  if (((Float)localObject4).floatValue() != 0.0F) {
                    break label871;
                  }
                }
                else if ((localObject4 instanceof Double))
                {
                  if (((Double)localObject4).doubleValue() != 0.0D) {
                    break label871;
                  }
                }
                else
                {
                  if (!(localObject4 instanceof String))
                  {
                    if ((localObject4 instanceof g)) {
                      localObject3 = g.b;
                    }
                  }
                  else
                  {
                    bool1 = localObject4.equals(localObject3);
                    break label874;
                  }
                  if ((localObject4 instanceof o0) ? localObject4 != ((o0)localObject4).b() : (!(localObject4 instanceof Enum)) || (((Enum)localObject4).ordinal() != 0)) {
                    break label871;
                  }
                }
                bool1 = true;
                break label874;
                label871:
                bool1 = false;
              }
              label874:
              if (!bool1) {
                bool1 = bool2;
              } else {
                bool1 = false;
              }
            }
            else
            {
              bool1 = ((Boolean)v.m((Method)localObject7, paramo0, new Object[0])).booleanValue();
            }
            if (bool1) {
              b(paramStringBuilder, paramInt, a((String)localObject5), localObject4);
            }
          }
        }
      }
    }
    if ((paramo0 instanceof v.c))
    {
      localObject1 = extensions.l();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject1).next();
        ((v.d)((Map.Entry)localObject3).getKey()).getClass();
        b(paramStringBuilder, paramInt, "[0]", ((Map.Entry)localObject3).getValue());
      }
    }
    paramo0 = unknownFields;
    if (paramo0 != null) {
      for (k = j; k < a; k++) {
        b(paramStringBuilder, paramInt, String.valueOf(b[k] >>> 3), c[k]);
      }
    }
  }
}

/* Location:
 * Qualified Name:     s0.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */