package androidx.lifecycle;

final class Transformations$3
  implements Observer<X>
{
  public boolean mFirstTime = true;
  
  public Transformations$3(MediatorLiveData paramMediatorLiveData) {}
  
  public void onChanged(X paramX)
  {
    Object localObject = val$outputLiveData.getValue();
    if ((mFirstTime) || ((localObject == null) && (paramX != null)) || ((localObject != null) && (!localObject.equals(paramX))))
    {
      mFirstTime = false;
      val$outputLiveData.setValue(paramX);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.Transformations.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */