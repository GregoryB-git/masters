.class public final Lw3/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw3/a0$a;
    }
.end annotation


# instance fields
.field public final a:Lw3/a0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget v0, Lv5/e0;->a:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    new-instance v0, Lw3/a0;

    invoke-direct {v0}, Lw3/a0;-><init>()V

    goto :goto_0

    :cond_0
    sget v0, Lw3/a0$a;->b:I

    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lw3/a0;-><init>(Lw3/a0$a;)V

    sget v0, Lv5/e0;->a:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx6/b;->H(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/media/metrics/LogSessionId;)V
    .locals 1

    new-instance v0, Lw3/a0$a;

    invoke-direct {v0, p1}, Lw3/a0$a;-><init>(Landroid/media/metrics/LogSessionId;)V

    invoke-direct {p0, v0}, Lw3/a0;-><init>(Lw3/a0$a;)V

    return-void
.end method

.method public constructor <init>(Lw3/a0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/a0;->a:Lw3/a0$a;

    return-void
.end method
