.class public LQ3/p$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ3/p;->v(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Z

.field public final synthetic p:LQ3/p;


# direct methods
.method public constructor <init>(LQ3/p;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/p$c;->p:LQ3/p;

    .line 2
    .line 3
    iput-boolean p2, p0, LQ3/p$c;->o:Z

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
    iget-object v0, p0, LQ3/p$c;->p:LQ3/p;

    .line 2
    .line 3
    iget-object v1, v0, LQ3/p;->a:LV3/m;

    .line 4
    .line 5
    invoke-virtual {v0}, LQ3/p;->u()La4/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v2, p0, LQ3/p$c;->o:Z

    .line 10
    .line 11
    invoke-virtual {v1, v0, v2}, LV3/m;->Q(La4/i;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
