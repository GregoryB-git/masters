.class public final Lz2/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LT2/l;

.field public final synthetic p:Lz2/M;


# direct methods
.method public constructor <init>(Lz2/M;LT2/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/K;->p:Lz2/M;

    .line 2
    .line 3
    iput-object p2, p0, Lz2/K;->o:LT2/l;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/K;->p:Lz2/M;

    .line 2
    .line 3
    iget-object v1, p0, Lz2/K;->o:LT2/l;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lz2/M;->b1(Lz2/M;LT2/l;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
