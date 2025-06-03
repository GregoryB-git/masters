package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import java.util.Set;
import java.util.UUID;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WorkRequestHolder
  extends WorkRequest
{
  public WorkRequestHolder(@NonNull UUID paramUUID, @NonNull WorkSpec paramWorkSpec, @NonNull Set<String> paramSet)
  {
    super(paramUUID, paramWorkSpec, paramSet);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkRequestHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */