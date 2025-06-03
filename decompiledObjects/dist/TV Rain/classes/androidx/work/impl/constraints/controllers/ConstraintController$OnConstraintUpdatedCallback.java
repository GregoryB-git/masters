package androidx.work.impl.constraints.controllers;

import androidx.annotation.NonNull;
import java.util.List;

public abstract interface ConstraintController$OnConstraintUpdatedCallback
{
  public abstract void onConstraintMet(@NonNull List<String> paramList);
  
  public abstract void onConstraintNotMet(@NonNull List<String> paramList);
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */