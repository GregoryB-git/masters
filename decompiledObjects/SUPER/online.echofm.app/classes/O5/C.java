package O5;

import androidx.lifecycle.LiveData;

public class C
  extends LiveData
{
  public static C l;
  
  public static C k()
  {
    if (l == null) {
      l = new C();
    }
    return l;
  }
  
  public void l(String paramString)
  {
    h(paramString);
  }
}

/* Location:
 * Qualified Name:     O5.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */