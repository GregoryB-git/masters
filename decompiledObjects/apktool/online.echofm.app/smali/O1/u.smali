.class public final synthetic LO1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LO1/v$b;

.field public final synthetic p:LO1/r;


# direct methods
.method public synthetic constructor <init>(LO1/v$b;LO1/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO1/u;->o:LO1/v$b;

    .line 5
    .line 6
    iput-object p2, p0, LO1/u;->p:LO1/r;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LO1/u;->o:LO1/v$b;

    .line 2
    .line 3
    iget-object v1, p0, LO1/u;->p:LO1/r;

    .line 4
    .line 5
    invoke-static {v0, v1}, LO1/v;->a(LO1/v$b;LO1/r;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
