.class public LQ3/n$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ3/n;->d(LQ3/e$e;)LV2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LY3/g;

.field public final synthetic p:LQ3/n;


# direct methods
.method public constructor <init>(LQ3/n;LY3/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/n$c;->p:LQ3/n;

    .line 2
    .line 3
    iput-object p2, p0, LQ3/n$c;->o:LY3/g;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, LQ3/n$c;->p:LQ3/n;

    .line 2
    .line 3
    invoke-static {v0}, LQ3/n;->b(LQ3/n;)LV3/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LQ3/n$c;->p:LQ3/n;

    .line 8
    .line 9
    invoke-static {v1}, LQ3/n;->a(LQ3/n;)LV3/k;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, LQ3/n$c;->o:LY3/g;

    .line 14
    .line 15
    invoke-virtual {v2}, LY3/g;->b()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, LQ3/e$e;

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, LV3/m;->T(LV3/k;LQ3/e$e;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
