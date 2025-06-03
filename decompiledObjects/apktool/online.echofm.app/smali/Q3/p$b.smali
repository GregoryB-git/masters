.class public LQ3/p$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ3/p;->b(LV3/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LV3/h;

.field public final synthetic p:LQ3/p;


# direct methods
.method public constructor <init>(LQ3/p;LV3/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/p$b;->p:LQ3/p;

    .line 2
    .line 3
    iput-object p2, p0, LQ3/p$b;->o:LV3/h;

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
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/p$b;->p:LQ3/p;

    .line 2
    .line 3
    iget-object v0, v0, LQ3/p;->a:LV3/m;

    .line 4
    .line 5
    iget-object v1, p0, LQ3/p$b;->o:LV3/h;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, LV3/m;->D(LV3/h;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
