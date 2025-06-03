package androidx.activity.result.contract;

import kotlin.Metadata;

@Metadata(d1={"\000\016\n\002\030\002\n\000\n\002\020\000\n\002\b\006\030\000*\004\b\002\020\0012\0020\002B\r\022\006\020\003\032\0028\002¢\006\002\020\004R\023\020\003\032\0028\002¢\006\n\n\002\020\007\032\004\b\005\020\006¨\006\b"}, d2={"Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "T", "", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class ActivityResultContract$SynchronousResult<T>
{
  private final T value;
  
  public ActivityResultContract$SynchronousResult(T paramT)
  {
    value = paramT;
  }
  
  public final T getValue()
  {
    return (T)value;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContract.SynchronousResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */