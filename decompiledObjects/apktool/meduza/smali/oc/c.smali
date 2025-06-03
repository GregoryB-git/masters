.class public final synthetic Loc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnc/t0;


# instance fields
.field public final synthetic a:Loc/f;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Loc/f;Lnc/e2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loc/c;->a:Loc/f;

    iput-object p2, p0, Loc/c;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    iget-object v0, p0, Loc/c;->a:Loc/f;

    iget-object v1, p0, Loc/c;->b:Ljava/lang/Runnable;

    iget-object v0, v0, Loc/f;->c:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method
