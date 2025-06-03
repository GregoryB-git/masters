package v0;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.d;

public final class f$c
  extends f.b
{
  public final f.a a;
  
  public f$c(TextView paramTextView)
  {
    a = new f.a(paramTextView);
  }
  
  public final InputFilter[] a(InputFilter[] paramArrayOfInputFilter)
  {
    int i;
    if (d.j != null) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i ^ 0x1) != 0) {
      return paramArrayOfInputFilter;
    }
    return a.a(paramArrayOfInputFilter);
  }
  
  public final void b(boolean paramBoolean)
  {
    int i;
    if (d.j != null) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i ^ 0x1) != 0) {
      return;
    }
    a.b(paramBoolean);
  }
  
  public final void c(boolean paramBoolean)
  {
    int i;
    if (d.j != null) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i ^ 0x1) != 0) {
      a.c = paramBoolean;
    } else {
      a.c(paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     v0.f.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */