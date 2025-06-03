.class public abstract Ld1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld1/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lb1/o;)Ld1/b;
    .locals 2

    new-instance v0, Ld1/b;

    move-object v1, p0

    check-cast v1, Lb1/t0;

    invoke-interface {v1}, Lb1/t0;->getViewModelStore()Lb1/s0;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ld1/b;-><init>(Lb1/o;Lb1/s0;)V

    return-object v0
.end method
