.class public final Lx5/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx5/e$a;,
        Lx5/e$b;
    }
.end annotation


# instance fields
.field public final a:Lx5/e$a;

.field public final b:Lx5/e$a;

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Lx5/e$a;Lx5/e$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx5/e;->a:Lx5/e$a;

    iput-object p2, p0, Lx5/e;->b:Lx5/e$a;

    iput p3, p0, Lx5/e;->c:I

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lx5/e;->d:Z

    return-void
.end method
