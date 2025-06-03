.class public final Lgb/v$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Leb/a;

.field public c:Ljava/lang/String;

.field public d:Leb/a0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "unknown-authority"

    iput-object v0, p0, Lgb/v$a;->a:Ljava/lang/String;

    sget-object v0, Leb/a;->b:Leb/a;

    iput-object v0, p0, Lgb/v$a;->b:Leb/a;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lgb/v$a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lgb/v$a;

    iget-object v0, p0, Lgb/v$a;->a:Ljava/lang/String;

    iget-object v2, p1, Lgb/v$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgb/v$a;->b:Leb/a;

    iget-object v2, p1, Lgb/v$a;->b:Leb/a;

    invoke-virtual {v0, v2}, Leb/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgb/v$a;->c:Ljava/lang/String;

    iget-object v2, p1, Lgb/v$a;->c:Ljava/lang/String;

    invoke-static {v0, v2}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgb/v$a;->d:Leb/a0;

    iget-object p1, p1, Lgb/v$a;->d:Leb/a0;

    invoke-static {v0, p1}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lgb/v$a;->a:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lgb/v$a;->b:Leb/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lgb/v$a;->c:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lgb/v$a;->d:Leb/a0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
