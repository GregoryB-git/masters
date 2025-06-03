.class public final synthetic Lx0/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lx0/K;

.field public final synthetic p:LF0/M;


# direct methods
.method public synthetic constructor <init>(Lx0/K;LF0/M;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx0/J;->o:Lx0/K;

    .line 5
    .line 6
    iput-object p2, p0, Lx0/J;->p:LF0/M;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/J;->o:Lx0/K;

    .line 2
    .line 3
    iget-object v1, p0, Lx0/J;->p:LF0/M;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lx0/K;->v(Lx0/K;LF0/M;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
