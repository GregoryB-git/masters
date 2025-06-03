package m0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import f;

public abstract class a
  extends BaseAdapter
  implements Filterable, b.a
{
  public boolean a = false;
  public boolean b = true;
  public Cursor c = null;
  public int d = -1;
  public a e = new a();
  public b f = new b();
  public b o;
  
  public a(Context paramContext) {}
  
  public abstract void b(View paramView, Cursor paramCursor);
  
  public void c(Cursor paramCursor)
  {
    Cursor localCursor = c;
    if (paramCursor == localCursor)
    {
      paramCursor = null;
    }
    else
    {
      Object localObject;
      if (localCursor != null)
      {
        localObject = e;
        if (localObject != null) {
          localCursor.unregisterContentObserver((ContentObserver)localObject);
        }
        localObject = f;
        if (localObject != null) {
          localCursor.unregisterDataSetObserver((DataSetObserver)localObject);
        }
      }
      c = paramCursor;
      if (paramCursor != null)
      {
        localObject = e;
        if (localObject != null) {
          paramCursor.registerContentObserver((ContentObserver)localObject);
        }
        localObject = f;
        if (localObject != null) {
          paramCursor.registerDataSetObserver((DataSetObserver)localObject);
        }
        d = paramCursor.getColumnIndexOrThrow("_id");
        a = true;
        notifyDataSetChanged();
        paramCursor = localCursor;
      }
      else
      {
        d = -1;
        a = false;
        notifyDataSetInvalidated();
        paramCursor = localCursor;
      }
    }
    if (paramCursor != null) {
      paramCursor.close();
    }
  }
  
  public abstract String d(Cursor paramCursor);
  
  public abstract View e(ViewGroup paramViewGroup);
  
  public final int getCount()
  {
    if (a)
    {
      Cursor localCursor = c;
      if (localCursor != null) {
        return localCursor.getCount();
      }
    }
    return 0;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (a)
    {
      c.moveToPosition(paramInt);
      View localView = paramView;
      if (paramView == null)
      {
        paramView = (c)this;
        localView = r.inflate(q, paramViewGroup, false);
      }
      b(localView, c);
      return localView;
    }
    return null;
  }
  
  public final Filter getFilter()
  {
    if (o == null) {
      o = new b(this);
    }
    return o;
  }
  
  public final Object getItem(int paramInt)
  {
    if (a)
    {
      Cursor localCursor = c;
      if (localCursor != null)
      {
        localCursor.moveToPosition(paramInt);
        return c;
      }
    }
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    if (a)
    {
      Cursor localCursor = c;
      if ((localCursor != null) && (localCursor.moveToPosition(paramInt))) {
        return c.getLong(d);
      }
    }
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (a)
    {
      if (c.moveToPosition(paramInt))
      {
        View localView = paramView;
        if (paramView == null) {
          localView = e(paramViewGroup);
        }
        b(localView, c);
        return localView;
      }
      throw new IllegalStateException(f.h("couldn't move cursor to position ", paramInt));
    }
    throw new IllegalStateException("this should only be called when the cursor is valid");
  }
  
  public final class a
    extends ContentObserver
  {
    public a()
    {
      super();
    }
    
    public final boolean deliverSelfNotifications()
    {
      return true;
    }
    
    public final void onChange(boolean paramBoolean)
    {
      a locala = a.this;
      if (b)
      {
        Cursor localCursor = c;
        if ((localCursor != null) && (!localCursor.isClosed())) {
          a = c.requery();
        }
      }
    }
  }
  
  public final class b
    extends DataSetObserver
  {
    public b() {}
    
    public final void onChanged()
    {
      a locala = a.this;
      a = true;
      locala.notifyDataSetChanged();
    }
    
    public final void onInvalidated()
    {
      a locala = a.this;
      a = false;
      locala.notifyDataSetInvalidated();
    }
  }
}

/* Location:
 * Qualified Name:     m0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */