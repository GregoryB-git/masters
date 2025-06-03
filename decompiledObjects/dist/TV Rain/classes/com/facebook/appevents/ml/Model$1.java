package com.facebook.appevents.ml;

import java.util.AbstractCollection;
import java.util.HashSet;

class Model$1
  extends HashSet<String>
{
  public Model$1(Model paramModel)
  {
    add(ModelManager.Task.MTML_INTEGRITY_DETECT.toKey());
    add(ModelManager.Task.MTML_APP_EVENT_PREDICTION.toKey());
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ml.Model.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */