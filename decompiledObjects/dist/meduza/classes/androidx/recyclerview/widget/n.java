package androidx.recyclerview.widget;

import android.view.View;

public final class n
{
  public static int a(RecyclerView.s params, j paramj, View paramView1, View paramView2, RecyclerView.j paramj1, boolean paramBoolean)
  {
    if ((paramj1.p() != 0) && (params.a() != 0) && (paramView1 != null) && (paramView2 != null))
    {
      if (paramBoolean)
      {
        int i = paramj.b(paramView2);
        int j = paramj.c(paramView1);
        return Math.min(paramj.f(), i - j);
      }
      RecyclerView.j.w(paramView1);
      throw null;
    }
    return 0;
  }
  
  public static int b(RecyclerView.s params, j paramj, View paramView1, View paramView2, RecyclerView.j paramj1, boolean paramBoolean)
  {
    if ((paramj1.p() != 0) && (params.a() != 0) && (paramView1 != null) && (paramView2 != null))
    {
      if (!paramBoolean) {
        return params.a();
      }
      paramj.b(paramView2);
      paramj.c(paramView1);
      RecyclerView.j.w(paramView1);
      throw null;
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */