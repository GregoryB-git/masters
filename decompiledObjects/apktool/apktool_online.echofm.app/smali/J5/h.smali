.class public final synthetic LJ5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LJ5/i;

.field public final synthetic p:Ls3/e;

.field public final synthetic q:LV2/k;


# direct methods
.method public synthetic constructor <init>(LJ5/i;Ls3/e;LV2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ5/h;->o:LJ5/i;

    .line 5
    .line 6
    iput-object p2, p0, LJ5/h;->p:Ls3/e;

    .line 7
    .line 8
    iput-object p3, p0, LJ5/h;->q:LV2/k;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LJ5/h;->o:LJ5/i;

    .line 2
    .line 3
    iget-object v1, p0, LJ5/h;->p:Ls3/e;

    .line 4
    .line 5
    iget-object v2, p0, LJ5/h;->q:LV2/k;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LJ5/i;->j(LJ5/i;Ls3/e;LV2/k;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
