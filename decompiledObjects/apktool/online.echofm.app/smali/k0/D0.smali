.class public final synthetic Lk0/D0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lk0/E0;

.field public final synthetic p:LX2/v$a;

.field public final synthetic q:Lx0/x$b;


# direct methods
.method public synthetic constructor <init>(Lk0/E0;LX2/v$a;Lx0/x$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/D0;->o:Lk0/E0;

    .line 5
    .line 6
    iput-object p2, p0, Lk0/D0;->p:LX2/v$a;

    .line 7
    .line 8
    iput-object p3, p0, Lk0/D0;->q:Lx0/x$b;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/D0;->o:Lk0/E0;

    .line 2
    .line 3
    iget-object v1, p0, Lk0/D0;->p:LX2/v$a;

    .line 4
    .line 5
    iget-object v2, p0, Lk0/D0;->q:Lx0/x$b;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lk0/E0;->a(Lk0/E0;LX2/v$a;Lx0/x$b;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
