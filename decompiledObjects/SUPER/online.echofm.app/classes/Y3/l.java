package Y3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class l
{
  public Map a = new HashMap();
  public Object b;
  
  public String a(String paramString)
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append("<value>: ");
    ((StringBuilder)localObject1).append(b);
    ((StringBuilder)localObject1).append("\n");
    localObject1 = ((StringBuilder)localObject1).toString();
    if (a.isEmpty())
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append("<empty>");
      return ((StringBuilder)localObject2).toString();
    }
    Object localObject2 = a.entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (Map.Entry)((Iterator)localObject2).next();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(paramString);
      localStringBuilder.append(((Map.Entry)localObject3).getKey());
      localStringBuilder.append(":\n");
      localObject1 = (l)((Map.Entry)localObject3).getValue();
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append(paramString);
      ((StringBuilder)localObject3).append("\t");
      localStringBuilder.append(((l)localObject1).a(((StringBuilder)localObject3).toString()));
      localStringBuilder.append("\n");
      localObject1 = localStringBuilder.toString();
    }
    return (String)localObject1;
  }
}

/* Location:
 * Qualified Name:     Y3.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */