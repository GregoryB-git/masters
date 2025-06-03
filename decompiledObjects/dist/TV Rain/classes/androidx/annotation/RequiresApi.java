package androidx.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.MustBeDocumented;

@Documented
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PACKAGE})
@Metadata(d1={"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\020\b\n\002\b\003\b\002\030\0002\0020\001B\024\022\b\b\003\020\002\032\0020\003\022\b\b\003\020\004\032\0020\003R\017\020\004\032\0020\003¢\006\006\032\004\b\004\020\005R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\005¨\006\006"}, d2={"Landroidx/annotation/RequiresApi;", "", "value", "", "api", "()I", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FILE})
public @interface RequiresApi
{
  int api() default 1;
  
  int value() default 1;
}

/* Location:
 * Qualified Name:     androidx.annotation.RequiresApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */