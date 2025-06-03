package androidx.lifecycle;

public class MutableLiveData<T>
  extends LiveData<T>
{
  public MutableLiveData() {}
  
  public MutableLiveData(T paramT)
  {
    super(paramT);
  }
  
  public void postValue(T paramT)
  {
    super.postValue(paramT);
  }
  
  public void setValue(T paramT)
  {
    super.setValue(paramT);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.MutableLiveData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */