.class public LV3/m$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m;->c0(Ljava/util/List;LV3/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LV3/m$z;

.field public final synthetic p:LV3/m;


# direct methods
.method public constructor <init>(LV3/m;LV3/m$z;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$l;->p:LV3/m;

    .line 2
    .line 3
    iput-object p2, p0, LV3/m$l;->o:LV3/m$z;

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
    .locals 4

    .line 1
    iget-object v0, p0, LV3/m$l;->p:LV3/m;

    .line 2
    .line 3
    new-instance v1, LV3/D;

    .line 4
    .line 5
    iget-object v2, p0, LV3/m$l;->o:LV3/m$z;

    .line 6
    .line 7
    invoke-static {v2}, LV3/m$z;->z(LV3/m$z;)LQ3/s;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, LV3/m$l;->o:LV3/m$z;

    .line 12
    .line 13
    invoke-static {v3}, LV3/m$z;->w(LV3/m$z;)LV3/k;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v3}, La4/i;->a(LV3/k;)La4/i;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-direct {v1, v0, v2, v3}, LV3/D;-><init>(LV3/m;LQ3/s;La4/i;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, LV3/m;->b0(LV3/h;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
