package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;

public final class e$b
{
  public IntentSender a;
  public Intent b;
  public int c;
  public int d;
  
  public e$b(IntentSender paramIntentSender)
  {
    a = paramIntentSender;
  }
  
  public e a()
  {
    return new e(a, b, c, d);
  }
  
  public b b(Intent paramIntent)
  {
    b = paramIntent;
    return this;
  }
  
  public b c(int paramInt1, int paramInt2)
  {
    d = paramInt1;
    c = paramInt2;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */