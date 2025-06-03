.class public final Lw5/f;
.super Lo4/k;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/IllegalStateException;Lo4/l;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lo4/k;-><init>(Ljava/lang/IllegalStateException;Lo4/l;)V

    invoke-static {p3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/view/Surface;->isValid()Z

    :cond_0
    return-void
.end method
