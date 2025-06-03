package O5;

import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.T;

public class B
  extends LiveData
{
  public static B l;
  
  public static B k()
  {
    if (l == null) {
      l = new B();
    }
    return l;
  }
  
  public void l(T paramT)
  {
    h(paramT);
  }
}

/* Location:
 * Qualified Name:     O5.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */