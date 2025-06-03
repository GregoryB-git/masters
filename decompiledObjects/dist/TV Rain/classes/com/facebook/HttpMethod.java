package com.facebook;

public enum HttpMethod
{
  static
  {
    HttpMethod localHttpMethod1 = new HttpMethod("GET", 0);
    GET = localHttpMethod1;
    HttpMethod localHttpMethod2 = new HttpMethod("POST", 1);
    POST = localHttpMethod2;
    HttpMethod localHttpMethod3 = new HttpMethod("DELETE", 2);
    DELETE = localHttpMethod3;
    $VALUES = new HttpMethod[] { localHttpMethod1, localHttpMethod2, localHttpMethod3 };
  }
  
  private HttpMethod() {}
}

/* Location:
 * Qualified Name:     com.facebook.HttpMethod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */