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
@Metadata(d1={"\000\032\n\002\030\002\n\002\020\033\n\000\n\002\020\006\n\002\b\002\n\002\020\013\n\002\b\004\b\002\030\0002\0020\001B(\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\006\022\b\b\002\020\007\032\0020\006R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\bR\017\020\005\032\0020\006¢\006\006\032\004\b\005\020\tR\017\020\004\032\0020\003¢\006\006\032\004\b\004\020\bR\017\020\007\032\0020\006¢\006\006\032\004\b\007\020\t¨\006\n"}, d2={"Landroidx/annotation/FloatRange;", "", "from", "", "to", "fromInclusive", "", "toInclusive", "()D", "()Z", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE, kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
public @interface FloatRange
{
  double from() default Double.NEGATIVE_INFINITY;
  
  boolean fromInclusive() default true;
  
  double to() default Double.POSITIVE_INFINITY;
  
  boolean toInclusive() default true;
}

/* Location:
 * Qualified Name:     androidx.annotation.FloatRange
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */