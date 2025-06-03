package v0;

import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public final class a$a
  extends a.b
{
  public final EditText a;
  public final g b;
  
  public a$a(EditText paramEditText)
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

/* Location:
 * Qualified Name:     v0.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */