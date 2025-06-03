.class public final synthetic LJ5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LJ5/i;

.field public final synthetic p:LJ5/p$d;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:LV2/k;


# direct methods
.method public synthetic constructor <init>(LJ5/i;LJ5/p$d;Ljava/lang/String;LV2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ5/f;->o:LJ5/i;

    .line 5
    .line 6
    iput-object p2, p0, LJ5/f;->p:LJ5/p$d;

    .line 7
    .line 8
    iput-object p3, p0, LJ5/f;->q:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, LJ5/f;->r:LV2/k;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LJ5/f;->o:LJ5/i;

    .line 2
    .line 3
    iget-object v1, p0, LJ5/f;->p:LJ5/p$d;

    .line 4
    .line 5
    iget-object v2, p0, LJ5/f;->q:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, LJ5/f;->r:LV2/k;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, LJ5/i;->h(LJ5/i;LJ5/p$d;Ljava/lang/String;LV2/k;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
