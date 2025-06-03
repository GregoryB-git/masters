package M;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a
  extends BaseAdapter
  implements Filterable, b.a
{
  public boolean o;
  public boolean p;
  public Cursor q;
  public Context r;
  public int s;
  public a t;
  public DataSetObserver u;
  public b v;
  
  public a(Context paramContext, Cursor paramCursor, boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 1;
    } else {
      i = 2;
    }
    f(paramContext, paramCursor, i);
  }
  
  public void a(Cursor paramCursor)
  {
    paramCursor = j(paramCursor);
    if (paramCursor != null) {
      paramCursor.close();
    }
  }
  
  public Cursor b()
  {
    return q;
  }
  
  public abstract CharSequence c(Cursor paramCursor);
  
  public abstract void e(View paramView, Context paramContext, Cursor paramCursor);
  
  public void f(Context paramContext, Cursor paramCursor, int paramInt)
  {
    boolean bool = false;
    if ((paramInt & 0x1) == 1)
    {
      paramInt |= 0x2;
      p = true;
    }
    else
    {
      p = false;
    }
    if (paramCursor != null) {
      bool = true;
    }
    q = paramCursor;
    o = bool;
    r = paramContext;
    int i;
    if (bool) {
      i = paramCursor.getColumnIndexOrThrow("_id");
    } else {
      i = -1;
    }
    s = i;
    if ((paramInt & 0x2) == 2)
    {
      t = new a();
      paramContext = new b();
    }
    for (;;)
    {
      u = paramContext;
      break;
      paramContext = null;
      t = null;
    }
    if (bool)
    {
      paramContext = t;
      if (paramContext != null) {
        paramCursor.registerContentObserver(paramContext);
      }
      paramContext = u;
      if (paramContext != null) {
        paramCursor.registerDataSetObserver(paramContext);
      }
    }
  }
  
  public abstract View g(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  public int getCount()
  {
    if (o)
    {
      Cursor localCursor = q;
      if (localCursor != null) {
        return localCursor.getCount();
      }
    }
    return 0;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (o)
    {
      q.moveToPosition(paramInt);
      View localView = paramView;
      if (paramView == null) {
        localView = g(r, q, paramViewGroup);
      }
      e(localView, r, q);
      return localView;
    }
    return null;
  }
  
  public Filter getFilter()
  {
    if (v == null) {
      v = new b(this);
    }
    return v;
  }
  
  public Object getItem(int paramInt)
  {
    if (o)
    {
      Cursor localCursor = q;
      if (localCursor != null)
      {
        localCursor.moveToPosition(paramInt);
        return q;
      }
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    if (o)
    {
      Cursor localCursor = q;
      if ((localCursor != null) && (localCursor.moveToPosition(paramInt))) {
        return q.getLong(s);
      }
    }
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (o)
    {
      if (q.moveToPosition(paramInt))
      {
        View localView = paramView;
        if (paramView == null) {
          localView = h(r, q, paramViewGroup);
        }
        e(localView, r, q);
        return localView;
      }
      paramView = new StringBuilder();
      paramView.append("couldn't move cursor to position ");
      paramView.append(paramInt);
      throw new IllegalStateException(paramView.toString());
    }
    throw new IllegalStateException("this should only be called when the cursor is valid");
  }
  
  public abstract View h(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  public void i()
  {
    if (p)
    {
      Cursor localCursor = q;
      if ((localCursor != null) && (!localCursor.isClosed())) {
        o = q.requery();
      }
    }
  }
  
  public Cursor j(Cursor paramCursor)
  {
    Cursor localCursor = q;
    if (paramCursor == localCursor) {
      return null;
    }
    Object localObject;
    if (localCursor != null)
    {
      localObject = t;
      if (localObject != null) {
        localCursor.unregisterContentObserver((ContentObserver)localObject);
      }
      localObject = u;
      if (localObject != null) {
        localCursor.unregisterDataSetObserver((DataSetObserver)localObject);
      }
    }
    q = paramCursor;
    if (paramCursor != null)
    {
      localObject = t;
      if (localObject != null) {
        paramCursor.registerContentObserver((ContentObserver)localObject);
      }
      localObject = u;
      if (localObject != null) {
        paramCursor.registerDataSetObserver((DataSetObserver)localObject);
      }
      s = paramCursor.getColumnIndexOrThrow("_id");
      o = true;
      notifyDataSetChanged();
    }
    else
    {
      s = -1;
      o = false;
      notifyDataSetInvalidated();
    }
    return localCursor;
  }
  
  public class a
    extends ContentObserver
  {
    public a()
    {
      super();
    }
    
    public boolean deliverSelfNotifications()
    {
      return true;
    }
    
    public void onChange(boolean paramBoolean)
    {
      i();
    }
  }
  
  public class b
    extends DataSetObserver
  {
    public b() {}
    
    public void onChanged()
    {
      a locala = a.this;
      o = true;
      locala.notifyDataSetChanged();
    }
    
    public void onInvalidated()
    {
      a locala = a.this;
      o = false;
      locala.notifyDataSetInvalidated();
    }
  }
}

/* Location:
 * Qualified Name:     M.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */