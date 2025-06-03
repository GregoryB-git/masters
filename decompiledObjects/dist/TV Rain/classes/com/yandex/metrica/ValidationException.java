package com.yandex.metrica;

import androidx.annotation.NonNull;

public class ValidationException
  extends IllegalArgumentException
{
  public ValidationException(@NonNull String paramString)
  {
    super(paramString);
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.ValidationException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */