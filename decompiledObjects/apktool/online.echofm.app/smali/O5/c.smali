.class public final synthetic LO5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LO5/e;

.field public final synthetic p:Ly5/f;

.field public final synthetic q:Landroid/os/Handler;

.field public final synthetic r:Lv5/j;

.field public final synthetic s:J


# direct methods
.method public synthetic constructor <init>(LO5/e;Ly5/f;Landroid/os/Handler;Lv5/j;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO5/c;->o:LO5/e;

    .line 5
    .line 6
    iput-object p2, p0, LO5/c;->p:Ly5/f;

    .line 7
    .line 8
    iput-object p3, p0, LO5/c;->q:Landroid/os/Handler;

    .line 9
    .line 10
    iput-object p4, p0, LO5/c;->r:Lv5/j;

    .line 11
    .line 12
    iput-wide p5, p0, LO5/c;->s:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, LO5/c;->o:LO5/e;

    .line 2
    .line 3
    iget-object v1, p0, LO5/c;->p:Ly5/f;

    .line 4
    .line 5
    iget-object v2, p0, LO5/c;->q:Landroid/os/Handler;

    .line 6
    .line 7
    iget-object v3, p0, LO5/c;->r:Lv5/j;

    .line 8
    .line 9
    iget-wide v4, p0, LO5/c;->s:J

    .line 10
    .line 11
    invoke-static/range {v0 .. v5}, LO5/e;->b(LO5/e;Ly5/f;Landroid/os/Handler;Lv5/j;J)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
