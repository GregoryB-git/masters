package com.appsflyer.internal.components.queue.exceptions;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class CreateHttpCallException
  extends NoSuchElementException
{
  public CreateHttpCallException(@NotNull String paramString)
  {
    super(paramString);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */