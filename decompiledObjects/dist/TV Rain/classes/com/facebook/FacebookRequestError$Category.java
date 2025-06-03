package com.facebook;

public enum FacebookRequestError$Category
{
  static
  {
    Category localCategory1 = new Category("LOGIN_RECOVERABLE", 0);
    LOGIN_RECOVERABLE = localCategory1;
    Category localCategory2 = new Category("OTHER", 1);
    OTHER = localCategory2;
    Category localCategory3 = new Category("TRANSIENT", 2);
    TRANSIENT = localCategory3;
    $VALUES = new Category[] { localCategory1, localCategory2, localCategory3 };
  }
  
  private FacebookRequestError$Category() {}
}

/* Location:
 * Qualified Name:     com.facebook.FacebookRequestError.Category
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */