package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot.ClickListener;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import java.util.Iterator;
import java.util.List;

public final class aeo
  extends ImageView
  implements View.OnClickListener
{
  private final CompanionData a;
  private final afc b;
  private final String c;
  private final List<CompanionAdSlot.ClickListener> d;
  
  public aeo(Context paramContext, afc paramafc, CompanionData paramCompanionData, String paramString, List<CompanionAdSlot.ClickListener> paramList)
  {
    super(paramContext);
    b = paramafc;
    a = paramCompanionData;
    c = paramString;
    d = paramList;
    setOnClickListener(this);
  }
  
  private final void a()
  {
    b.a(a.companionId(), c);
  }
  
  public final void onClick(View paramView)
  {
    paramView = d.iterator();
    while (paramView.hasNext()) {
      ((CompanionAdSlot.ClickListener)paramView.next()).onCompanionAdClick();
    }
    b.c(a.clickThroughUrl());
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aeo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */