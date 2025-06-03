package t1;

public final class a$a
{
  public static void a(d paramd, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      return;
    }
    int i = paramArrayOfObject.length;
    int j = 0;
    while (j < i)
    {
      Object localObject = paramArrayOfObject[j];
      int k = j + 1;
      if (localObject == null)
      {
        paramd.d0(k);
        j = k;
      }
      else if ((localObject instanceof byte[]))
      {
        paramd.T((byte[])localObject, k);
        j = k;
      }
      else
      {
        double d;
        if ((localObject instanceof Float))
        {
          d = ((Number)localObject).floatValue();
        }
        else
        {
          if (!(localObject instanceof Double)) {
            break label127;
          }
          d = ((Number)localObject).doubleValue();
        }
        paramd.s(k, d);
        j = k;
        continue;
        label127:
        long l;
        if ((localObject instanceof Long))
        {
          l = ((Number)localObject).longValue();
        }
        else
        {
          if ((localObject instanceof Integer))
          {
            j = ((Number)localObject).intValue();
          }
          else if ((localObject instanceof Short))
          {
            j = ((Number)localObject).shortValue();
          }
          else
          {
            if (!(localObject instanceof Byte)) {
              break label212;
            }
            j = ((Number)localObject).byteValue();
          }
          l = j;
          break label267;
          label212:
          if ((localObject instanceof String))
          {
            paramd.n(k, (String)localObject);
            j = k;
            continue;
          }
          if (!(localObject instanceof Boolean)) {
            break label283;
          }
          if (((Boolean)localObject).booleanValue()) {
            l = 1L;
          } else {
            l = 0L;
          }
        }
        label267:
        paramd.F(k, l);
        j = k;
        continue;
        label283:
        paramd = new StringBuilder();
        paramd.append("Cannot bind ");
        paramd.append(localObject);
        paramd.append(" at index ");
        paramd.append(k);
        paramd.append(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        throw new IllegalArgumentException(paramd.toString());
      }
    }
  }
}

/* Location:
 * Qualified Name:     t1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */