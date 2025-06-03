.class public LQ3/n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ3/n;->j(Ljava/util/Map;LQ3/e$e;)LV2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ljava/util/Map;

.field public final synthetic p:LY3/g;

.field public final synthetic q:Ljava/util/Map;

.field public final synthetic r:LQ3/n;


# direct methods
.method public constructor <init>(LQ3/n;Ljava/util/Map;LY3/g;Ljava/util/Map;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/n$b;->r:LQ3/n;

    .line 2
    .line 3
    iput-object p2, p0, LQ3/n$b;->o:Ljava/util/Map;

    .line 4
    .line 5
    iput-object p3, p0, LQ3/n$b;->p:LY3/g;

    .line 6
    .line 7
    iput-object p4, p0, LQ3/n$b;->q:Ljava/util/Map;

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
    iget-object v0, p0, LQ3/n$b;->r:LQ3/n;

    .line 2
    .line 3
    invoke-static {v0}, LQ3/n;->b(LQ3/n;)LV3/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LQ3/n$b;->r:LQ3/n;

    .line 8
    .line 9
    invoke-static {v1}, LQ3/n;->a(LQ3/n;)LV3/k;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, LQ3/n$b;->o:Ljava/util/Map;

    .line 14
    .line 15
    iget-object v3, p0, LQ3/n$b;->p:LY3/g;

    .line 16
    .line 17
    invoke-virtual {v3}, LY3/g;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, LQ3/e$e;

    .line 22
    .line 23
    iget-object v4, p0, LQ3/n$b;->q:Ljava/util/Map;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3, v4}, LV3/m;->V(LV3/k;Ljava/util/Map;LQ3/e$e;Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
