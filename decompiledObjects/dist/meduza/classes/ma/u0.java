package ma;

import b.z;
import f;
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

public final class u0
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
      int i = 80;
      if (paramInt <= 80) {
        i = paramInt;
      }
      paramStringBuilder.append(arrayOfChar, 0, i);
      paramInt -= i;
    }
  }
  
  public static void b(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
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
    a(paramInt, paramStringBuilder);
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
      paramObject = (String)paramObject;
      paramString = h.b;
      paramString = z.i(new h.h(((String)paramObject).getBytes(a0.a)));
    }
    else
    {
      if (!(paramObject instanceof h)) {
        break label284;
      }
      paramStringBuilder.append(": \"");
      paramString = z.i((h)paramObject);
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append('"');
    return;
    label284:
    if ((paramObject instanceof w))
    {
      paramStringBuilder.append(" {");
      c((w)paramObject, paramStringBuilder, paramInt + 2);
    }
    else
    {
      if (!(paramObject instanceof Map.Entry)) {
        break label386;
      }
      paramStringBuilder.append(" {");
      paramString = (Map.Entry)paramObject;
      i = paramInt + 2;
      b(paramStringBuilder, i, "key", paramString.getKey());
      b(paramStringBuilder, i, "value", paramString.getValue());
    }
    paramStringBuilder.append("\n");
    a(paramInt, paramStringBuilder);
    paramStringBuilder.append("}");
    return;
    label386:
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject);
  }
  
  public static void c(s0 params0, StringBuilder paramStringBuilder, int paramInt)
  {
    HashSet localHashSet = new HashSet();
    HashMap localHashMap = new HashMap();
    TreeMap localTreeMap = new TreeMap();
    Object localObject1 = params0.getClass().getDeclaredMethods();
    int i = localObject1.length;
    int j = 0;
    Object localObject2;
    for (int k = 0; k < i; k++)
    {
      localObject2 = localObject1[k];
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
    Iterator localIterator = localTreeMap.entrySet().iterator();
    label440:
    label759:
    label810:
    label813:
    label863:
    while (localIterator.hasNext())
    {
      localObject1 = (Map.Entry)localIterator.next();
      localObject2 = ((String)((Map.Entry)localObject1).getKey()).substring(3);
      if ((((String)localObject2).endsWith("List")) && (!((String)localObject2).endsWith("OrBuilderList")) && (!((String)localObject2).equals("List")))
      {
        localObject3 = (Method)((Map.Entry)localObject1).getValue();
        if ((localObject3 != null) && (((Method)localObject3).getReturnType().equals(List.class)))
        {
          localObject1 = ((String)localObject2).substring(0, ((String)localObject2).length() - 4);
          localObject2 = w.w((Method)localObject3, params0, new Object[0]);
          break label440;
        }
      }
      if ((((String)localObject2).endsWith("Map")) && (!((String)localObject2).equals("Map")))
      {
        localObject3 = (Method)((Map.Entry)localObject1).getValue();
        if ((localObject3 != null) && (((Method)localObject3).getReturnType().equals(Map.class)) && (!((AccessibleObject)localObject3).isAnnotationPresent(Deprecated.class)) && (Modifier.isPublic(((Method)localObject3).getModifiers())))
        {
          localObject1 = ((String)localObject2).substring(0, ((String)localObject2).length() - 3);
          localObject2 = w.w((Method)localObject3, params0, new Object[0]);
          b(paramStringBuilder, paramInt, (String)localObject1, localObject2);
          break label863;
        }
      }
      Object localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("set");
      ((StringBuilder)localObject3).append((String)localObject2);
      if (localHashSet.contains(((StringBuilder)localObject3).toString())) {
        if (((String)localObject2).endsWith("Bytes"))
        {
          localObject3 = f.l("get");
          ((StringBuilder)localObject3).append(((String)localObject2).substring(0, ((String)localObject2).length() - 5));
          if (localTreeMap.containsKey(((StringBuilder)localObject3).toString())) {}
        }
        else
        {
          localObject3 = (Method)((Map.Entry)localObject1).getValue();
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("has");
          ((StringBuilder)localObject1).append((String)localObject2);
          localObject1 = (Method)localHashMap.get(((StringBuilder)localObject1).toString());
          if (localObject3 != null)
          {
            localObject3 = w.w((Method)localObject3, params0, new Object[0]);
            boolean bool1 = true;
            boolean bool2;
            if (localObject1 == null)
            {
              if ((localObject3 instanceof Boolean))
              {
                bool2 = ((Boolean)localObject3).booleanValue() ^ true;
              }
              else
              {
                if ((localObject3 instanceof Integer))
                {
                  if (((Integer)localObject3).intValue() != 0) {
                    break label810;
                  }
                }
                else if ((localObject3 instanceof Float))
                {
                  if (Float.floatToRawIntBits(((Float)localObject3).floatValue()) != 0) {
                    break label810;
                  }
                }
                else if ((localObject3 instanceof Double))
                {
                  if (Double.doubleToRawLongBits(((Double)localObject3).doubleValue()) != 0L) {
                    break label810;
                  }
                }
                else
                {
                  if ((localObject3 instanceof String))
                  {
                    localObject1 = "";
                  }
                  else
                  {
                    if (!(localObject3 instanceof h)) {
                      break label759;
                    }
                    localObject1 = h.b;
                  }
                  bool2 = localObject3.equals(localObject1);
                  break label813;
                  if ((localObject3 instanceof s0) ? localObject3 != ((s0)localObject3).b() : (!(localObject3 instanceof Enum)) || (((Enum)localObject3).ordinal() != 0)) {
                    break label810;
                  }
                }
                bool2 = true;
                break label813;
                bool2 = false;
              }
              if (!bool2) {
                bool2 = bool1;
              } else {
                bool2 = false;
              }
            }
            else
            {
              bool2 = ((Boolean)w.w((Method)localObject1, params0, new Object[0])).booleanValue();
            }
            if (bool2) {
              b(paramStringBuilder, paramInt, (String)localObject2, localObject3);
            }
          }
        }
      }
    }
    if ((params0 instanceof w.c))
    {
      localObject1 = extensions.l();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        ((w.d)((Map.Entry)localObject2).getKey()).getClass();
        b(paramStringBuilder, paramInt, "[0]", ((Map.Entry)localObject2).getValue());
      }
    }
    params0 = unknownFields;
    if (params0 != null) {
      for (k = j; k < a; k++) {
        b(paramStringBuilder, paramInt, String.valueOf(b[k] >>> 3), c[k]);
      }
    }
  }
}

/* Location:
 * Qualified Name:     ma.u0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */