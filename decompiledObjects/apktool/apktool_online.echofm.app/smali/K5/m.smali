.class public final synthetic LK5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LK5/n;

.field public final synthetic p:LV2/k;


# direct methods
.method public synthetic constructor <init>(LK5/n;LV2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK5/m;->o:LK5/n;

    .line 5
    .line 6
    iput-object p2, p0, LK5/m;->p:LV2/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LK5/m;->o:LK5/n;

    .line 2
    .line 3
    iget-object v1, p0, LK5/m;->p:LV2/k;

    .line 4
    .line 5
    invoke-static {v0, v1}, LK5/n;->j(LK5/n;LV2/k;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
