.class public LV3/m$w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m;->G(LQ3/e$e;LQ3/c;LV3/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LQ3/e$e;

.field public final synthetic p:LQ3/c;

.field public final synthetic q:LQ3/e;

.field public final synthetic r:LV3/m;


# direct methods
.method public constructor <init>(LV3/m;LQ3/e$e;LQ3/c;LQ3/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$w;->r:LV3/m;

    .line 2
    .line 3
    iput-object p2, p0, LV3/m$w;->o:LQ3/e$e;

    .line 4
    .line 5
    iput-object p3, p0, LV3/m$w;->p:LQ3/c;

    .line 6
    .line 7
    iput-object p4, p0, LV3/m$w;->q:LQ3/e;

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
    .locals 3

    .line 1
    iget-object v0, p0, LV3/m$w;->o:LQ3/e$e;

    .line 2
    .line 3
    iget-object v1, p0, LV3/m$w;->p:LQ3/c;

    .line 4
    .line 5
    iget-object v2, p0, LV3/m$w;->q:LQ3/e;

    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, LQ3/e$e;->a(LQ3/c;LQ3/e;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
