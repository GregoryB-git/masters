.class public final synthetic Lk0/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lk0/t0;

.field public final synthetic p:Lk0/V0;


# direct methods
.method public synthetic constructor <init>(Lk0/t0;Lk0/V0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/r0;->o:Lk0/t0;

    .line 5
    .line 6
    iput-object p2, p0, Lk0/r0;->p:Lk0/V0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/r0;->o:Lk0/t0;

    .line 2
    .line 3
    iget-object v1, p0, Lk0/r0;->p:Lk0/V0;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lk0/t0;->g(Lk0/t0;Lk0/V0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
