package androidx.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.MustBeDocumented;

@Documented
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Metadata(d1={"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\020\t\n\002\b\005\b\002\030\0002\0020\001B(\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\003\022\b\b\002\020\006\032\0020\003R\017\020\005\032\0020\003¢\006\006\032\004\b\005\020\007R\017\020\004\032\0020\003¢\006\006\032\004\b\004\020\007R\017\020\006\032\0020\003¢\006\006\032\004\b\006\020\007R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\007¨\006\b"}, d2={"Landroidx/annotation/Size;", "", "value", "", "min", "max", "multiple", "()J", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
public @interface Size
{
  long max() default Long.MAX_VALUE;
  
  long min() default Long.MIN_VALUE;
  
  long multiple() default 1L;
  
  long value() default -1L;
}

/* Location:
 * Qualified Name:     androidx.annotation.Size
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */