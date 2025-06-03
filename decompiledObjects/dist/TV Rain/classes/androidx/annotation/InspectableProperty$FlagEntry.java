package androidx.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Metadata(d1={"\000\030\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\004\b\002\030\0002\0020\001B\032\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\005R\017\020\006\032\0020\005¢\006\006\032\004\b\006\020\007R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\bR\017\020\004\032\0020\005¢\006\006\032\004\b\004\020\007¨\006\t"}, d2={"Landroidx/annotation/InspectableProperty$FlagEntry;", "", "name", "", "target", "", "mask", "()I", "()Ljava/lang/String;", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS})
public @interface InspectableProperty$FlagEntry
{
  int mask() default 0;
  
  String name();
  
  int target();
}

/* Location:
 * Qualified Name:     androidx.annotation.InspectableProperty.FlagEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */