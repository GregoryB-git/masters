package com.google.android.play.core.integrity.model;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface IntegrityDialogResponseCode
{
  public static final int DIALOG_CANCELLED = 2;
  public static final int DIALOG_FAILED = 1;
  public static final int DIALOG_SUCCESSFUL = 3;
  public static final int DIALOG_UNAVAILABLE = 0;
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.model.IntegrityDialogResponseCode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */