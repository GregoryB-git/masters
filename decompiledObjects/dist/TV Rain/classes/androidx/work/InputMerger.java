package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.List;
import z2;

public abstract class InputMerger
{
  private static final String TAG = Logger.tagWithPrefix("InputMerger");
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static InputMerger fromClassName(String paramString)
  {
    try
    {
      InputMerger localInputMerger = (InputMerger)Class.forName(paramString).newInstance();
      return localInputMerger;
    }
    catch (Exception localException)
    {
      Logger.get().error(TAG, z2.o("Trouble instantiating + ", paramString), new Throwable[] { localException });
    }
    return null;
  }
  
  @NonNull
  public abstract Data merge(@NonNull List<Data> paramList);
}

/* Location:
 * Qualified Name:     androidx.work.InputMerger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */