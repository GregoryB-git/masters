.class public LV3/m$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m$i;->a(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LV3/m$z;

.field public final synthetic p:LQ3/b;

.field public final synthetic q:LV3/m$i;


# direct methods
.method public constructor <init>(LV3/m$i;LV3/m$z;LQ3/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$i$a;->q:LV3/m$i;

    .line 2
    .line 3
    iput-object p2, p0, LV3/m$i$a;->o:LV3/m$z;

    .line 4
    .line 5
    iput-object p3, p0, LV3/m$i$a;->p:LQ3/b;

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
    iget-object v0, p0, LV3/m$i$a;->o:LV3/m$z;

    .line 2
    .line 3
    invoke-static {v0}, LV3/m$z;->x(LV3/m$z;)LQ3/r$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget-object v2, p0, LV3/m$i$a;->p:LQ3/b;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-interface {v0, v3, v1, v2}, LQ3/r$b;->b(LQ3/c;ZLQ3/b;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
