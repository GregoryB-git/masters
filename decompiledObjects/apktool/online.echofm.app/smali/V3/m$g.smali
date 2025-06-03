.class public LV3/m$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m;->n0(LV3/k;LQ3/r$b;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LQ3/r$b;

.field public final synthetic p:LQ3/c;

.field public final synthetic q:LQ3/b;

.field public final synthetic r:LV3/m;


# direct methods
.method public constructor <init>(LV3/m;LQ3/r$b;LQ3/c;LQ3/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$g;->r:LV3/m;

    .line 2
    .line 3
    iput-object p2, p0, LV3/m$g;->o:LQ3/r$b;

    .line 4
    .line 5
    iput-object p3, p0, LV3/m$g;->p:LQ3/c;

    .line 6
    .line 7
    iput-object p4, p0, LV3/m$g;->q:LQ3/b;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, LV3/m$g;->o:LQ3/r$b;

    .line 2
    .line 3
    iget-object v1, p0, LV3/m$g;->p:LQ3/c;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, LV3/m$g;->q:LQ3/b;

    .line 7
    .line 8
    invoke-interface {v0, v1, v2, v3}, LQ3/r$b;->b(LQ3/c;ZLQ3/b;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
