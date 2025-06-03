.class public final Lgc/b;
.super Lgc/a;
.source "SourceFile"


# instance fields
.field public final c:Lgc/b$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lgc/a;-><init>()V

    new-instance v0, Lgc/b$a;

    invoke-direct {v0}, Lgc/b$a;-><init>()V

    iput-object v0, p0, Lgc/b;->c:Lgc/b$a;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, Lgc/b;->c:Lgc/b$a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
