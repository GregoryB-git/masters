package androidx.work;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class OverwritingInputMerger
  extends InputMerger
{
  @NonNull
  public Data merge(@NonNull List<Data> paramList)
  {
    Data.Builder localBuilder = new Data.Builder();
    HashMap localHashMap = new HashMap();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localHashMap.putAll(((Data)paramList.next()).getKeyValueMap());
    }
    localBuilder.putAll(localHashMap);
    return localBuilder.build();
  }
}

/* Location:
 * Qualified Name:     androidx.work.OverwritingInputMerger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */