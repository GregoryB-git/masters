.class public final Le7/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:J

.field public d:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/d1;->a:Ljava/lang/String;

    iput-object p2, p0, Le7/d1;->b:Ljava/lang/String;

    iput-object p3, p0, Le7/d1;->d:Landroid/os/Bundle;

    iput-wide p4, p0, Le7/d1;->c:J

    return-void
.end method

.method public static b(Le7/f0;)Le7/d1;
    .locals 7

    new-instance v6, Le7/d1;

    iget-object v1, p0, Le7/f0;->a:Ljava/lang/String;

    iget-object v2, p0, Le7/f0;->c:Ljava/lang/String;

    iget-object v0, p0, Le7/f0;->b:Le7/a0;

    invoke-virtual {v0}, Le7/a0;->E()Landroid/os/Bundle;

    move-result-object v3

    iget-wide v4, p0, Le7/f0;->d:J

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Le7/d1;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-object v6
.end method


# virtual methods
.method public final a()Le7/f0;
    .locals 7

    new-instance v6, Le7/f0;

    iget-object v1, p0, Le7/d1;->a:Ljava/lang/String;

    new-instance v2, Le7/a0;

    new-instance v0, Landroid/os/Bundle;

    iget-object v3, p0, Le7/d1;->d:Landroid/os/Bundle;

    invoke-direct {v0, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-direct {v2, v0}, Le7/a0;-><init>(Landroid/os/Bundle;)V

    iget-object v3, p0, Le7/d1;->b:Ljava/lang/String;

    iget-wide v4, p0, Le7/d1;->c:J

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Le7/f0;-><init>(Ljava/lang/String;Le7/a0;Ljava/lang/String;J)V

    return-object v6
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Le7/d1;->b:Ljava/lang/String;

    iget-object v1, p0, Le7/d1;->a:Ljava/lang/String;

    iget-object v2, p0, Le7/d1;->d:Landroid/os/Bundle;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "origin="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",name="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",params="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
