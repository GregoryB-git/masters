package v0;

import android.widget.EditText;
import androidx.emoji2.text.d.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class g$a
  extends d.e
{
  public final WeakReference a;
  
  public g$a(EditText paramEditText)
  {
    a = new WeakReference(paramEditText);
  }
  
  public final void a()
  {
    g.a((EditText)a.get(), 1);
  }
}

/* Location:
 * Qualified Name:     v0.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */