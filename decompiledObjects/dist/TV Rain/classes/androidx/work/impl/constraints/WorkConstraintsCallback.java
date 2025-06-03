package androidx.work.impl.constraints;

import androidx.annotation.NonNull;
import java.util.List;

public abstract interface WorkConstraintsCallback
{
  public abstract void onAllConstraintsMet(@NonNull List<String> paramList);
  
  public abstract void onAllConstraintsNotMet(@NonNull List<String> paramList);
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.WorkConstraintsCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */