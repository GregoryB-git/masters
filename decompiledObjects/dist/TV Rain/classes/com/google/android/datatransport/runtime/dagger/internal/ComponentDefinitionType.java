package com.google.android.datatransport.runtime.dagger.internal;

import java.lang.annotation.Annotation;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.TYPE})
public @interface ComponentDefinitionType
{
  Class<?> value();
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.internal.ComponentDefinitionType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */