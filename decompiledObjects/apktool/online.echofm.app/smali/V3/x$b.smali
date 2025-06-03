.class public LV3/x$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/x;->Z(La4/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:La4/i;

.field public final synthetic p:LV3/x;


# direct methods
.method public constructor <init>(LV3/x;La4/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/x$b;->p:LV3/x;

    .line 2
    .line 3
    iput-object p2, p0, LV3/x$b;->o:La4/i;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/x$b;->p:LV3/x;

    .line 2
    .line 3
    invoke-static {v0}, LV3/x;->c(LV3/x;)LX3/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LV3/x$b;->o:La4/i;

    .line 8
    .line 9
    invoke-interface {v0, v1}, LX3/e;->m(La4/i;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LV3/x$b;->a()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
