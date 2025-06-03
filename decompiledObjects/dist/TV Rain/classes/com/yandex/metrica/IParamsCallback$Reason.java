package com.yandex.metrica;

public enum IParamsCallback$Reason
{
  static
  {
    NETWORK = new Reason("NETWORK", 1);
    INVALID_RESPONSE = new Reason("INVALID_RESPONSE", 2);
    INCONSISTENT_CLIDS = new Reason("INCONSISTENT_CLIDS", 3);
  }
  
  private IParamsCallback$Reason() {}
}

/* Location:
 * Qualified Name:     com.yandex.metrica.IParamsCallback.Reason
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */