.class public interface abstract Landroidx/window/layout/FoldingFeature;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/window/layout/DisplayFeature;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/window/layout/FoldingFeature$OcclusionType;,
        Landroidx/window/layout/FoldingFeature$Orientation;,
        Landroidx/window/layout/FoldingFeature$State;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
.end annotation


# virtual methods
.method public abstract getOcclusionType()Landroidx/window/layout/FoldingFeature$OcclusionType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getOrientation()Landroidx/window/layout/FoldingFeature$Orientation;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getState()Landroidx/window/layout/FoldingFeature$State;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract isSeparating()Z
.end method
