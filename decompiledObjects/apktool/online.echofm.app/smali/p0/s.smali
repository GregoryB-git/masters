.class public final synthetic Lp0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lp0/v$a;

.field public final synthetic p:Lp0/v;


# direct methods
.method public synthetic constructor <init>(Lp0/v$a;Lp0/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp0/s;->o:Lp0/v$a;

    .line 5
    .line 6
    iput-object p2, p0, Lp0/s;->p:Lp0/v;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/s;->o:Lp0/v$a;

    .line 2
    .line 3
    iget-object v1, p0, Lp0/s;->p:Lp0/v;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lp0/v$a;->f(Lp0/v$a;Lp0/v;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
