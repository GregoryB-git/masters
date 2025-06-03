.class public final synthetic LP4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic o:LP4/m;

.field public final synthetic p:LP4/s;


# direct methods
.method public synthetic constructor <init>(LP4/m;LP4/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP4/h;->o:LP4/m;

    .line 5
    .line 6
    iput-object p2, p0, LP4/h;->p:LP4/s;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LP4/h;->o:LP4/m;

    .line 2
    .line 3
    iget-object v1, p0, LP4/h;->p:LP4/s;

    .line 4
    .line 5
    invoke-static {v0, v1}, LP4/m;->a(LP4/m;LP4/s;)Ljava/lang/Void;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
