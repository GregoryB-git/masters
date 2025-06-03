package v0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.d;
import androidx.emoji2.text.d.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class g
  implements TextWatcher
{
  public final EditText a;
  public final boolean b;
  public a c;
  public boolean d;
  
  public g(EditText paramEditText)
  {
    a = paramEditText;
    b = false;
    d = true;
  }
  
  public static void a(EditText paramEditText, int paramInt)
  {
    if ((paramInt == 1) && (paramEditText != null) && (paramEditText.isAttachedToWindow()))
    {
      paramEditText = paramEditText.getEditableText();
      int i = Selection.getSelectionStart(paramEditText);
      int j = Selection.getSelectionEnd(paramEditText);
      d locald = d.a();
      if (paramEditText == null)
      {
        paramInt = 0;
      }
      else
      {
        locald.getClass();
        paramInt = paramEditText.length();
      }
      locald.f(paramEditText, 0, paramInt);
      if ((i >= 0) && (j >= 0)) {
        Selection.setSelection(paramEditText, i, j);
      } else if (i >= 0) {
        Selection.setSelection(paramEditText, i);
      } else if (j >= 0) {
        Selection.setSelection(paramEditText, j);
      }
    }
  }
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!a.isInEditMode())
    {
      boolean bool = d;
      int i = 0;
      int j;
      if (bool)
      {
        j = i;
        if (!b)
        {
          int k;
          if (d.j != null) {
            k = 1;
          } else {
            k = 0;
          }
          j = i;
          if (k != 0) {}
        }
      }
      else
      {
        j = 1;
      }
      if ((j == 0) && (paramInt2 <= paramInt3) && ((paramCharSequence instanceof Spannable)))
      {
        paramInt2 = d.a().b();
        if (paramInt2 != 0) {
          if (paramInt2 != 1)
          {
            if (paramInt2 != 3) {
              return;
            }
          }
          else
          {
            paramCharSequence = (Spannable)paramCharSequence;
            d.a().f(paramCharSequence, paramInt1, paramInt3 + paramInt1);
            return;
          }
        }
        paramCharSequence = d.a();
        if (c == null) {
          c = new a(a);
        }
        paramCharSequence.g(c);
      }
    }
  }
  
  public static final class a
    extends d.e
  {
    public final WeakReference a;
    
    public a(EditText paramEditText)
    {
      a = new WeakReference(paramEditText);
    }
    
    public final void a()
    {
      g.a((EditText)a.get(), 1);
    }
  }
}

/* Location:
 * Qualified Name:     v0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */