.class public final synthetic LY1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LY1/c;

.field public final synthetic p:LY1/u$e;

.field public final synthetic q:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(LY1/c;LY1/u$e;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY1/b;->o:LY1/c;

    .line 5
    .line 6
    iput-object p2, p0, LY1/b;->p:LY1/u$e;

    .line 7
    .line 8
    iput-object p3, p0, LY1/b;->q:Landroid/os/Bundle;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LY1/b;->o:LY1/c;

    .line 2
    .line 3
    iget-object v1, p0, LY1/b;->p:LY1/u$e;

    .line 4
    .line 5
    iget-object v2, p0, LY1/b;->q:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LY1/c;->x(LY1/c;LY1/u$e;Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
