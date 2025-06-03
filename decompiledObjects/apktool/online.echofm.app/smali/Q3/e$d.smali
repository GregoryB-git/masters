.class public LQ3/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ3/e;->a0(LQ3/r$b;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LQ3/r$b;

.field public final synthetic p:Z

.field public final synthetic q:LQ3/e;


# direct methods
.method public constructor <init>(LQ3/e;LQ3/r$b;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/e$d;->q:LQ3/e;

    .line 2
    .line 3
    iput-object p2, p0, LQ3/e$d;->o:LQ3/r$b;

    .line 4
    .line 5
    iput-boolean p3, p0, LQ3/e$d;->p:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, LQ3/e$d;->q:LQ3/e;

    .line 2
    .line 3
    iget-object v1, v0, LQ3/p;->a:LV3/m;

    .line 4
    .line 5
    invoke-virtual {v0}, LQ3/p;->s()LV3/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v2, p0, LQ3/e$d;->o:LQ3/r$b;

    .line 10
    .line 11
    iget-boolean v3, p0, LQ3/e$d;->p:Z

    .line 12
    .line 13
    invoke-virtual {v1, v0, v2, v3}, LV3/m;->n0(LV3/k;LQ3/r$b;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
