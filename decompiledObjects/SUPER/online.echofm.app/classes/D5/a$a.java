package D5;

import E5.a.d;
import E5.a.e;
import java.util.HashMap;
import t5.b;

public class a$a
  implements a.d
{
  public a$a(a parama) {}
  
  public void a(Object paramObject, a.e parame)
  {
    if (a.a(a) == null)
    {
      parame.a(null);
      return;
    }
    HashMap localHashMap1 = (HashMap)paramObject;
    paramObject = (String)localHashMap1.get("type");
    HashMap localHashMap2 = (HashMap)localHashMap1.get("data");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Received ");
    localStringBuilder.append((String)paramObject);
    localStringBuilder.append(" message.");
    b.f("AccessibilityChannel", localStringBuilder.toString());
    ((String)paramObject).hashCode();
    int i = ((String)paramObject).hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 114203431: 
      if (((String)paramObject).equals("longPress")) {
        j = 4;
      }
      break;
    case 97604824: 
      if (((String)paramObject).equals("focus")) {
        j = 3;
      }
      break;
    case 114595: 
      if (((String)paramObject).equals("tap")) {
        j = 2;
      }
      break;
    case -649620375: 
      if (((String)paramObject).equals("announce")) {
        j = 1;
      }
      break;
    case -1140076541: 
      if (((String)paramObject).equals("tooltip")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      break;
    case 4: 
      paramObject = (Integer)localHashMap1.get("nodeId");
      if (paramObject != null) {
        a.a(a).f(((Integer)paramObject).intValue());
      }
      break;
    case 3: 
      paramObject = (Integer)localHashMap1.get("nodeId");
      if (paramObject != null) {
        a.a(a).e(((Integer)paramObject).intValue());
      }
      break;
    case 2: 
      paramObject = (Integer)localHashMap1.get("nodeId");
      if (paramObject != null) {
        a.a(a).g(((Integer)paramObject).intValue());
      }
      break;
    case 1: 
      paramObject = (String)localHashMap2.get("message");
      if (paramObject != null) {
        a.a(a).a((String)paramObject);
      }
      break;
    case 0: 
      paramObject = (String)localHashMap2.get("message");
      if (paramObject != null) {
        a.a(a).d((String)paramObject);
      }
      break;
    }
    parame.a(null);
  }
}

/* Location:
 * Qualified Name:     D5.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */