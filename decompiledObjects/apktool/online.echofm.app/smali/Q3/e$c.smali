.class public LQ3/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ3/e;->h0(Ljava/util/Map;LQ3/e$e;)LV2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LV3/b;

.field public final synthetic p:LY3/g;

.field public final synthetic q:Ljava/util/Map;

.field public final synthetic r:LQ3/e;


# direct methods
.method public constructor <init>(LQ3/e;LV3/b;LY3/g;Ljava/util/Map;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/e$c;->r:LQ3/e;

    .line 2
    .line 3
    iput-object p2, p0, LQ3/e$c;->o:LV3/b;

    .line 4
    .line 5
    iput-object p3, p0, LQ3/e$c;->p:LY3/g;

    .line 6
    .line 7
    iput-object p4, p0, LQ3/e$c;->q:Ljava/util/Map;

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
    .locals 5

    .line 1
    iget-object v0, p0, LQ3/e$c;->r:LQ3/e;

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
    iget-object v2, p0, LQ3/e$c;->o:LV3/b;

    .line 10
    .line 11
    iget-object v3, p0, LQ3/e$c;->p:LY3/g;

    .line 12
    .line 13
    invoke-virtual {v3}, LY3/g;->b()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, LQ3/e$e;

    .line 18
    .line 19
    iget-object v4, p0, LQ3/e$c;->q:Ljava/util/Map;

    .line 20
    .line 21
    invoke-virtual {v1, v0, v2, v3, v4}, LV3/m;->o0(LV3/k;LV3/b;LQ3/e$e;Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
