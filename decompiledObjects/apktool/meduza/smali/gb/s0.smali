.class public abstract Lgb/s0;
.super Leb/u0;
.source "SourceFile"


# instance fields
.field public final a:Leb/u0;


# direct methods
.method public constructor <init>(Leb/u0;)V
    .locals 0

    invoke-direct {p0}, Leb/u0;-><init>()V

    iput-object p1, p0, Lgb/s0;->a:Leb/u0;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgb/s0;->a:Leb/u0;

    invoke-virtual {v0}, Leb/u0;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lgb/s0;->a:Leb/u0;

    invoke-virtual {v0}, Leb/u0;->b()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lgb/s0;->a:Leb/u0;

    invoke-virtual {v0}, Leb/u0;->c()V

    return-void
.end method

.method public d(Leb/u0$d;)V
    .locals 1

    iget-object v0, p0, Lgb/s0;->a:Leb/u0;

    invoke-virtual {v0, p1}, Leb/u0;->d(Leb/u0$d;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    iget-object v1, p0, Lgb/s0;->a:Leb/u0;

    const-string v2, "delegate"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
