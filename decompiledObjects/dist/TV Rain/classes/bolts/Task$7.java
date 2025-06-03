package bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class Task$7
  implements Continuation<Void, List<TResult>>
{
  public Task$7(Collection paramCollection) {}
  
  public List<TResult> then(Task<Void> paramTask)
    throws Exception
  {
    if (val$tasks.size() == 0) {
      return Collections.emptyList();
    }
    ArrayList localArrayList = new ArrayList();
    paramTask = val$tasks.iterator();
    while (paramTask.hasNext()) {
      localArrayList.add(((Task)paramTask.next()).getResult());
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     bolts.Task.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */