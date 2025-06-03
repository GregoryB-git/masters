package v0;

import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public final class a
{
  public final a a;
  
  public a(EditText paramEditText)
  {
    if (paramEditText != null)
    {
      a = new a(paramEditText);
      return;
    }
    throw new NullPointerException("editText cannot be null");
  }
  
  public static final class a
    extends a.b
  {
    public final EditText a;
    public final g b;
    
    public a(EditText paramEditText)
    {
      a = paramEditText;
      ??? = new g(paramEditText);
      b = ((g)???);
      paramEditText.addTextChangedListener((TextWatcher)???);
      if (b.b == null) {
        synchronized (b.a)
        {
          if (b.b == null)
          {
            b localb = new v0/b;
            localb.<init>();
            b.b = localb;
          }
        }
      }
      paramEditText.setEditableFactory(b.b);
    }
  }
  
  public static class b {}
}

/* Location:
 * Qualified Name:     v0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */