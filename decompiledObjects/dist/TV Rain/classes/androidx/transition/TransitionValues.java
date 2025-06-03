package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import z2;

public class TransitionValues
{
  public final ArrayList<Transition> mTargetedTransitions = new ArrayList();
  public final Map<String, Object> values = new HashMap();
  public View view;
  
  @Deprecated
  public TransitionValues() {}
  
  public TransitionValues(@NonNull View paramView)
  {
    view = paramView;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof TransitionValues))
    {
      View localView = view;
      paramObject = (TransitionValues)paramObject;
      if ((localView == view) && (values.equals(values))) {
        return true;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = view.hashCode();
    return values.hashCode() + i * 31;
  }
  
  public String toString()
  {
    Object localObject = z2.t("TransitionValues@");
    ((StringBuilder)localObject).append(Integer.toHexString(hashCode()));
    ((StringBuilder)localObject).append(":\n");
    localObject = z2.u(((StringBuilder)localObject).toString(), "    view = ");
    ((StringBuilder)localObject).append(view);
    ((StringBuilder)localObject).append("\n");
    localObject = z2.o(((StringBuilder)localObject).toString(), "    values:");
    Iterator localIterator = values.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append((String)localObject);
      localStringBuilder.append("    ");
      localStringBuilder.append(str);
      localStringBuilder.append(": ");
      localStringBuilder.append(values.get(str));
      localStringBuilder.append("\n");
      localObject = localStringBuilder.toString();
    }
    return (String)localObject;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.TransitionValues
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */