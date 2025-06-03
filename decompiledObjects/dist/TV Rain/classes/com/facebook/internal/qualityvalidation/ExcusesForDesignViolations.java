package com.facebook.internal.qualityvalidation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface ExcusesForDesignViolations
{
  Excuse[] value();
}

/* Location:
 * Qualified Name:     com.facebook.internal.qualityvalidation.ExcusesForDesignViolations
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */