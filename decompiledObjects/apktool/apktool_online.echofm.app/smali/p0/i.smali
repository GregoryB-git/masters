.class public final synthetic Lp0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lp0/h$f;

.field public final synthetic p:Ld0/q;


# direct methods
.method public synthetic constructor <init>(Lp0/h$f;Ld0/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp0/i;->o:Lp0/h$f;

    .line 5
    .line 6
    iput-object p2, p0, Lp0/i;->p:Ld0/q;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/i;->o:Lp0/h$f;

    .line 2
    .line 3
    iget-object v1, p0, Lp0/i;->p:Ld0/q;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lp0/h$f;->a(Lp0/h$f;Ld0/q;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
