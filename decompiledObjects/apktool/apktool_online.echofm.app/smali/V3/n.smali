.class public final synthetic LV3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LV2/k;

.field public final synthetic p:LQ3/b;


# direct methods
.method public synthetic constructor <init>(LV2/k;LQ3/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV3/n;->o:LV2/k;

    .line 5
    .line 6
    iput-object p2, p0, LV3/n;->p:LQ3/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LV3/n;->o:LV2/k;

    .line 2
    .line 3
    iget-object v1, p0, LV3/n;->p:LQ3/b;

    .line 4
    .line 5
    invoke-static {v0, v1}, LV3/m$y;->b(LV2/k;LQ3/b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
