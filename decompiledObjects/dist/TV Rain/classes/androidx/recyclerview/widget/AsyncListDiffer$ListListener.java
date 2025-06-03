package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import java.util.List;

public abstract interface AsyncListDiffer$ListListener<T>
{
  public abstract void onCurrentListChanged(@NonNull List<T> paramList1, @NonNull List<T> paramList2);
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AsyncListDiffer.ListListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */