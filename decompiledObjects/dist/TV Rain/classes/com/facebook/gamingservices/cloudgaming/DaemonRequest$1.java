package com.facebook.gamingservices.cloudgaming;

import com.facebook.GraphResponse;
import java.util.function.Consumer;

class DaemonRequest$1
  implements Consumer<GraphResponse>
{
  public DaemonRequest$1(DaemonRequest paramDaemonRequest) {}
  
  public void accept(GraphResponse paramGraphResponse)
  {
    if (DaemonRequest.access$000(this$0) != null) {
      DaemonRequest.access$000(this$0).onCompleted(paramGraphResponse);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.DaemonRequest.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */