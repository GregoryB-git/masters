.class public final synthetic Lk0/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lk0/f0;

.field public final synthetic p:Lk0/t0$e;


# direct methods
.method public synthetic constructor <init>(Lk0/f0;Lk0/t0$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/V;->o:Lk0/f0;

    .line 5
    .line 6
    iput-object p2, p0, Lk0/V;->p:Lk0/t0$e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/V;->o:Lk0/f0;

    .line 2
    .line 3
    iget-object v1, p0, Lk0/V;->p:Lk0/t0$e;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lk0/f0;->r0(Lk0/f0;Lk0/t0$e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
