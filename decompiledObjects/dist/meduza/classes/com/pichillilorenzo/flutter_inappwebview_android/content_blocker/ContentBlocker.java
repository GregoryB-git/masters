package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import f;

public class ContentBlocker
{
  private ContentBlockerAction action;
  private ContentBlockerTrigger trigger;
  
  public ContentBlocker(ContentBlockerTrigger paramContentBlockerTrigger, ContentBlockerAction paramContentBlockerAction)
  {
    trigger = paramContentBlockerTrigger;
    action = paramContentBlockerAction;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (ContentBlocker)paramObject;
      if (!trigger.equals(trigger)) {
        return false;
      }
      return action.equals(action);
    }
    return false;
  }
  
  public ContentBlockerAction getAction()
  {
    return action;
  }
  
  public ContentBlockerTrigger getTrigger()
  {
    return trigger;
  }
  
  public int hashCode()
  {
    int i = trigger.hashCode();
    return action.hashCode() + i * 31;
  }
  
  public void setAction(ContentBlockerAction paramContentBlockerAction)
  {
    action = paramContentBlockerAction;
  }
  
  public void setTrigger(ContentBlockerTrigger paramContentBlockerTrigger)
  {
    trigger = paramContentBlockerTrigger;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("ContentBlocker{trigger=");
    localStringBuilder.append(trigger);
    localStringBuilder.append(", action=");
    localStringBuilder.append(action);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlocker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */