.class public final synthetic Lx2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic o:Z

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lx2/A;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Lx2/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lx2/v;->o:Z

    .line 5
    .line 6
    iput-object p2, p0, Lx2/v;->p:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lx2/v;->q:Lx2/A;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lx2/v;->o:Z

    .line 2
    .line 3
    iget-object v1, p0, Lx2/v;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lx2/v;->q:Lx2/A;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lx2/E;->c(ZLjava/lang/String;Lx2/A;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
