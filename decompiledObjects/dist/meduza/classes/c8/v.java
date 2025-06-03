package c8;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class v
  implements OnFailureListener, OnSuccessListener
{
  public final void onFailure(Exception paramException)
  {
    a.setException(paramException);
    w.c(b);
  }
}

/* Location:
 * Qualified Name:     c8.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */