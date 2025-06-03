package androidx.core.os;

import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;

public class OperationCanceledException
  extends RuntimeException
{
  public OperationCanceledException()
  {
    this(null);
  }
  
  public OperationCanceledException(@Nullable String paramString)
  {
    super(ObjectsCompat.toString(paramString, "The operation has been canceled."));
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.OperationCanceledException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */